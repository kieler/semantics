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
import de.cau.cs.kieler.yakindu.sccharts.model.stext.services.SynctextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSynctextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_FLOAT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'input'", "'output'", "'signal'", "':'", "'='", "'with'", "';'", "'static'", "'extern'", "'('", "')'", "'entry'", "'/'", "'immediate'", "'during'", "'exit'", "'suspend'", "'val'", "'pre'", "'@@statechart@@'", "'@@state@@'", "'@@transition@@'", "'namespace'", "'interface'", "'internal'", "'event'", "'local'", "'in'", "'out'", "'var'", "'readonly'", "'external'", "'operation'", "'default'", "'else'", "'always'", "'oncycle'", "'raise'", "'valueof'", "'active'", "'.'", "'#'", "'>'", "'?'", "'||'", "'&&'", "'!'", "'^'", "'|'", "'&'", "','", "'*'", "'%'", "'\\'none\\''", "'\\'+\\''", "'\\'*\\''", "'\\'max\\''", "'\\'min\\''", "'\\'or\\''", "'\\'and\\''", "'\\'host\\''", "'after'", "'every'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'+'", "'-'", "'~'", "'<'", "'<='", "'>='", "'=='", "'!='", "'s'", "'ms'", "'us'", "'ns'"
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


        public InternalSynctextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSynctextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSynctextParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g"; }



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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:74:1: entryRuleStateScope returns [EObject current=null] : iv_ruleStateScope= ruleStateScope EOF ;
    public final EObject entryRuleStateScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:75:2: (iv_ruleStateScope= ruleStateScope EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:76:2: iv_ruleStateScope= ruleStateScope EOF
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:83:1: ruleStateScope returns [EObject current=null] : ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ) ;
    public final EObject ruleStateScope() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:86:28: ( ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:87:1: ( () ( (lv_declarations_1_0= ruleDeclaration ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:87:1: ( () ( (lv_declarations_1_0= ruleDeclaration ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:87:2: () ( (lv_declarations_1_0= ruleDeclaration ) )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:87:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:88:2: 
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:96:2: ( (lv_declarations_1_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=14 && LA1_0<=16)||(LA1_0>=21 && LA1_0<=22)||LA1_0==25||(LA1_0>=27 && LA1_0<=30)||(LA1_0>=36 && LA1_0<=53)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:97:1: (lv_declarations_1_0= ruleDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:97:1: (lv_declarations_1_0= ruleDeclaration )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:98:3: lv_declarations_1_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsDeclarationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleStateScope149);
            	    lv_declarations_1_0=ruleDeclaration();

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
            	              		"Declaration");
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


    // $ANTLR start "entryRuleDeclaration"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:122:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:123:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:124:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration186);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration196); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:131:1: ruleDeclaration returns [EObject current=null] : (this_LocalEntryReaction_0= ruleLocalEntryReaction | this_LocalDuringReaction_1= ruleLocalDuringReaction | this_LocalExitReaction_2= ruleLocalExitReaction | this_LocalSuspendReaction_3= ruleLocalSuspendReaction | this_VariableDeclaration_4= ruleVariableDeclaration | this_SignalDeclaration_5= ruleSignalDeclaration | this_OperationDeclaration_6= ruleOperationDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_LocalEntryReaction_0 = null;

        EObject this_LocalDuringReaction_1 = null;

        EObject this_LocalExitReaction_2 = null;

        EObject this_LocalSuspendReaction_3 = null;

        EObject this_VariableDeclaration_4 = null;

        EObject this_SignalDeclaration_5 = null;

        EObject this_OperationDeclaration_6 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:134:28: ( (this_LocalEntryReaction_0= ruleLocalEntryReaction | this_LocalDuringReaction_1= ruleLocalDuringReaction | this_LocalExitReaction_2= ruleLocalExitReaction | this_LocalSuspendReaction_3= ruleLocalSuspendReaction | this_VariableDeclaration_4= ruleVariableDeclaration | this_SignalDeclaration_5= ruleSignalDeclaration | this_OperationDeclaration_6= ruleOperationDeclaration ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:135:1: (this_LocalEntryReaction_0= ruleLocalEntryReaction | this_LocalDuringReaction_1= ruleLocalDuringReaction | this_LocalExitReaction_2= ruleLocalExitReaction | this_LocalSuspendReaction_3= ruleLocalSuspendReaction | this_VariableDeclaration_4= ruleVariableDeclaration | this_SignalDeclaration_5= ruleSignalDeclaration | this_OperationDeclaration_6= ruleOperationDeclaration )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:135:1: (this_LocalEntryReaction_0= ruleLocalEntryReaction | this_LocalDuringReaction_1= ruleLocalDuringReaction | this_LocalExitReaction_2= ruleLocalExitReaction | this_LocalSuspendReaction_3= ruleLocalSuspendReaction | this_VariableDeclaration_4= ruleVariableDeclaration | this_SignalDeclaration_5= ruleSignalDeclaration | this_OperationDeclaration_6= ruleOperationDeclaration )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:136:2: this_LocalEntryReaction_0= ruleLocalEntryReaction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getLocalEntryReactionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLocalEntryReaction_in_ruleDeclaration246);
                    this_LocalEntryReaction_0=ruleLocalEntryReaction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalEntryReaction_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:149:2: this_LocalDuringReaction_1= ruleLocalDuringReaction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getLocalDuringReactionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLocalDuringReaction_in_ruleDeclaration276);
                    this_LocalDuringReaction_1=ruleLocalDuringReaction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalDuringReaction_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:162:2: this_LocalExitReaction_2= ruleLocalExitReaction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getLocalExitReactionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLocalExitReaction_in_ruleDeclaration306);
                    this_LocalExitReaction_2=ruleLocalExitReaction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalExitReaction_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:175:2: this_LocalSuspendReaction_3= ruleLocalSuspendReaction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getLocalSuspendReactionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLocalSuspendReaction_in_ruleDeclaration336);
                    this_LocalSuspendReaction_3=ruleLocalSuspendReaction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalSuspendReaction_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:188:2: this_VariableDeclaration_4= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getVariableDeclarationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleDeclaration366);
                    this_VariableDeclaration_4=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDeclaration_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:201:2: this_SignalDeclaration_5= ruleSignalDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getSignalDeclarationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSignalDeclaration_in_ruleDeclaration396);
                    this_SignalDeclaration_5=ruleSignalDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SignalDeclaration_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:214:2: this_OperationDeclaration_6= ruleOperationDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getOperationDeclarationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleDeclaration426);
                    this_OperationDeclaration_6=ruleOperationDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OperationDeclaration_6; 
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleSignalDeclaration"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:233:1: entryRuleSignalDeclaration returns [EObject current=null] : iv_ruleSignalDeclaration= ruleSignalDeclaration EOF ;
    public final EObject entryRuleSignalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:234:2: (iv_ruleSignalDeclaration= ruleSignalDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:235:2: iv_ruleSignalDeclaration= ruleSignalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration461);
            iv_ruleSignalDeclaration=ruleSignalDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalDeclaration471); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:242:1: ruleSignalDeclaration returns [EObject current=null] : this_SignalDefinition_0= ruleSignalDefinition ;
    public final EObject ruleSignalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_SignalDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:245:28: (this_SignalDefinition_0= ruleSignalDefinition )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:247:2: this_SignalDefinition_0= ruleSignalDefinition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSignalDeclarationAccess().getSignalDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleSignalDefinition_in_ruleSignalDeclaration520);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:266:1: entryRuleSignalDefinition returns [EObject current=null] : iv_ruleSignalDefinition= ruleSignalDefinition EOF ;
    public final EObject entryRuleSignalDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:267:2: (iv_ruleSignalDefinition= ruleSignalDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:268:2: iv_ruleSignalDefinition= ruleSignalDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleSignalDefinition_in_entryRuleSignalDefinition554);
            iv_ruleSignalDefinition=ruleSignalDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalDefinition564); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:275:1: ruleSignalDefinition returns [EObject current=null] : ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:278:28: ( ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:279:1: ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:279:1: ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:279:2: () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:279:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:280:2: 
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:288:2: ( (lv_isInput_1_0= 'input' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:289:1: (lv_isInput_1_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:289:1: (lv_isInput_1_0= 'input' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:290:3: lv_isInput_1_0= 'input'
                    {
                    lv_isInput_1_0=(Token)match(input,14,FOLLOW_14_in_ruleSignalDefinition619); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:303:3: ( (lv_isOutput_2_0= 'output' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:304:1: (lv_isOutput_2_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:304:1: (lv_isOutput_2_0= 'output' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:305:3: lv_isOutput_2_0= 'output'
                    {
                    lv_isOutput_2_0=(Token)match(input,15,FOLLOW_15_in_ruleSignalDefinition651); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSignalDefinition677); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSignalDefinitionAccess().getSignalKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:322:1: ( (lv_name_4_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:323:1: (lv_name_4_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:323:1: (lv_name_4_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:324:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalDefinition694); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:340:2: (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:340:4: otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )?
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleSignalDefinition712); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSignalDefinitionAccess().getColonKeyword_5_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:344:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:345:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:345:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:346:3: ruleFQN
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
                    pushFollow(FOLLOW_ruleFQN_in_ruleSignalDefinition739);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:362:2: (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==18) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:362:4: otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) )
                            {
                            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleSignalDefinition752); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getSignalDefinitionAccess().getEqualsSignKeyword_5_2_0());
                                  
                            }
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:366:1: ( (lv_varInitialValue_8_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:367:1: (lv_varInitialValue_8_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:367:1: (lv_varInitialValue_8_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:368:3: lv_varInitialValue_8_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSignalDefinitionAccess().getVarInitialValueExpressionParserRuleCall_5_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleSignalDefinition773);
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

                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:384:4: (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==19) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:384:6: otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) )
                            {
                            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleSignalDefinition788); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getSignalDefinitionAccess().getWithKeyword_5_3_0());
                                  
                            }
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:388:1: ( (lv_varCombineOperator_10_0= ruleCombineOperator ) )
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:389:1: (lv_varCombineOperator_10_0= ruleCombineOperator )
                            {
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:389:1: (lv_varCombineOperator_10_0= ruleCombineOperator )
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:390:3: lv_varCombineOperator_10_0= ruleCombineOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSignalDefinitionAccess().getVarCombineOperatorCombineOperatorEnumRuleCall_5_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignalDefinition809);
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

            otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleSignalDefinition825); if (state.failed) return current;
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


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:418:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:419:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:420:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration861);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration871); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:427:1: ruleVariableDeclaration returns [EObject current=null] : this_VariableDefinition_0= ruleVariableDefinition ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:430:28: (this_VariableDefinition_0= ruleVariableDefinition )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:432:2: this_VariableDefinition_0= ruleVariableDefinition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration920);
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


    // $ANTLR start "entryRuleVariableDefinition"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:451:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:452:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:453:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition954);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition964); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:460:1: ruleVariableDefinition returns [EObject current=null] : ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? ( (lv_isStatic_3_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( (lv_initialValue_7_0= ruleExpression ) ) )? (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )? otherlv_10= ';' ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:463:28: ( ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? ( (lv_isStatic_3_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( (lv_initialValue_7_0= ruleExpression ) ) )? (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )? otherlv_10= ';' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:464:1: ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? ( (lv_isStatic_3_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( (lv_initialValue_7_0= ruleExpression ) ) )? (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )? otherlv_10= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:464:1: ( () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? ( (lv_isStatic_3_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( (lv_initialValue_7_0= ruleExpression ) ) )? (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )? otherlv_10= ';' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:464:2: () ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? ( (lv_isStatic_3_0= 'static' ) )? ( ( ruleFQN ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '=' ( (lv_initialValue_7_0= ruleExpression ) ) )? (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )? otherlv_10= ';'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:464:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:465:2: 
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:473:2: ( (lv_isInput_1_0= 'input' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:474:1: (lv_isInput_1_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:474:1: (lv_isInput_1_0= 'input' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:475:3: lv_isInput_1_0= 'input'
                    {
                    lv_isInput_1_0=(Token)match(input,14,FOLLOW_14_in_ruleVariableDefinition1019); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:488:3: ( (lv_isOutput_2_0= 'output' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:489:1: (lv_isOutput_2_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:489:1: (lv_isOutput_2_0= 'output' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:490:3: lv_isOutput_2_0= 'output'
                    {
                    lv_isOutput_2_0=(Token)match(input,15,FOLLOW_15_in_ruleVariableDefinition1051); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:503:3: ( (lv_isStatic_3_0= 'static' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:504:1: (lv_isStatic_3_0= 'static' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:504:1: (lv_isStatic_3_0= 'static' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:505:3: lv_isStatic_3_0= 'static'
                    {
                    lv_isStatic_3_0=(Token)match(input,21,FOLLOW_21_in_ruleVariableDefinition1083); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:518:3: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:519:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:519:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:520:3: ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getTypeTypeCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleVariableDefinition1124);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:536:2: ( (lv_name_5_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:537:1: (lv_name_5_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:537:1: (lv_name_5_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:538:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDefinition1141); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:554:2: (otherlv_6= '=' ( (lv_initialValue_7_0= ruleExpression ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:554:4: otherlv_6= '=' ( (lv_initialValue_7_0= ruleExpression ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleVariableDefinition1159); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionAccess().getEqualsSignKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:558:1: ( (lv_initialValue_7_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:559:1: (lv_initialValue_7_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:559:1: (lv_initialValue_7_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:560:3: lv_initialValue_7_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getInitialValueExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDefinition1180);
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:576:4: (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:576:6: otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) )
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleVariableDefinition1195); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getVariableDefinitionAccess().getWithKeyword_7_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:580:1: ( (lv_varCombineOperator_9_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:581:1: (lv_varCombineOperator_9_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:581:1: (lv_varCombineOperator_9_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:582:3: lv_varCombineOperator_9_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getVarCombineOperatorCombineOperatorEnumRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleVariableDefinition1216);
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

            otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleVariableDefinition1230); if (state.failed) return current;
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


    // $ANTLR start "entryRuleOperationDefinition"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:610:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:611:2: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:612:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition1266);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDefinition1276); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:619:1: ruleOperationDefinition returns [EObject current=null] : ( () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';' ) ;
    public final EObject ruleOperationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:622:28: ( ( () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:623:1: ( () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:623:1: ( () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:623:2: () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:623:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:624:2: 
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

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleOperationDefinition1325); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionAccess().getExternKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:636:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:637:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:637:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:638:3: ruleFQN
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
            pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition1352);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:654:2: ( (lv_name_3_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:655:1: (lv_name_3_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:655:1: (lv_name_3_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:656:3: lv_name_3_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getNameXIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleOperationDefinition1373);
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

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleOperationDefinition1385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:676:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:677:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:677:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:678:3: ruleFQN
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
            pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition1412);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleOperationDefinition1424); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleOperationDefinition1436); if (state.failed) return current;
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


    // $ANTLR start "entryRuleLocalEntryReaction"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:710:1: entryRuleLocalEntryReaction returns [EObject current=null] : iv_ruleLocalEntryReaction= ruleLocalEntryReaction EOF ;
    public final EObject entryRuleLocalEntryReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalEntryReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:711:2: (iv_ruleLocalEntryReaction= ruleLocalEntryReaction EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:712:2: iv_ruleLocalEntryReaction= ruleLocalEntryReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalEntryReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalEntryReaction_in_entryRuleLocalEntryReaction1472);
            iv_ruleLocalEntryReaction=ruleLocalEntryReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalEntryReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalEntryReaction1482); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalEntryReaction"


    // $ANTLR start "ruleLocalEntryReaction"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:719:1: ruleLocalEntryReaction returns [EObject current=null] : ( () otherlv_1= 'entry' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) )? (otherlv_4= '/' ( (lv_effect_5_0= ruleReactionEffect ) ) ) otherlv_6= ';' ) ;
    public final EObject ruleLocalEntryReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_trigger_3_0 = null;

        EObject lv_effect_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:722:28: ( ( () otherlv_1= 'entry' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) )? (otherlv_4= '/' ( (lv_effect_5_0= ruleReactionEffect ) ) ) otherlv_6= ';' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:723:1: ( () otherlv_1= 'entry' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) )? (otherlv_4= '/' ( (lv_effect_5_0= ruleReactionEffect ) ) ) otherlv_6= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:723:1: ( () otherlv_1= 'entry' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) )? (otherlv_4= '/' ( (lv_effect_5_0= ruleReactionEffect ) ) ) otherlv_6= ';' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:723:2: () otherlv_1= 'entry' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) )? (otherlv_4= '/' ( (lv_effect_5_0= ruleReactionEffect ) ) ) otherlv_6= ';'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:723:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:724:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalEntryReactionAccess().getLocalEntryReactionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleLocalEntryReaction1531); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalEntryReactionAccess().getEntryKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleLocalEntryReaction1543); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLocalEntryReactionAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:740:1: ( (lv_trigger_3_0= ruleReactionTrigger ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_STRING)||LA13_0==23||(LA13_0>=31 && LA13_0<=32)||LA13_0==53||LA13_0==60||(LA13_0>=89 && LA13_0<=91)) ) {
                alt13=1;
            }
            else if ( (LA13_0==26) ) {
                int LA13_2 = input.LA(2);

                if ( (synpred18_InternalSynctext()) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:741:1: (lv_trigger_3_0= ruleReactionTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:741:1: (lv_trigger_3_0= ruleReactionTrigger )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:742:3: lv_trigger_3_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalEntryReactionAccess().getTriggerReactionTriggerParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalEntryReaction1564);
                    lv_trigger_3_0=ruleReactionTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocalEntryReactionRule());
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
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:758:3: (otherlv_4= '/' ( (lv_effect_5_0= ruleReactionEffect ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:758:5: otherlv_4= '/' ( (lv_effect_5_0= ruleReactionEffect ) )
            {
            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleLocalEntryReaction1578); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLocalEntryReactionAccess().getSolidusKeyword_4_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:762:1: ( (lv_effect_5_0= ruleReactionEffect ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:763:1: (lv_effect_5_0= ruleReactionEffect )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:763:1: (lv_effect_5_0= ruleReactionEffect )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:764:3: lv_effect_5_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalEntryReactionAccess().getEffectReactionEffectParserRuleCall_4_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalEntryReaction1599);
            lv_effect_5_0=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalEntryReactionRule());
              	        }
                     		set(
                     			current, 
                     			"effect",
                      		lv_effect_5_0, 
                      		"ReactionEffect");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleLocalEntryReaction1612); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getLocalEntryReactionAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalEntryReaction"


    // $ANTLR start "entryRuleLocalDuringReaction"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:792:1: entryRuleLocalDuringReaction returns [EObject current=null] : iv_ruleLocalDuringReaction= ruleLocalDuringReaction EOF ;
    public final EObject entryRuleLocalDuringReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalDuringReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:793:2: (iv_ruleLocalDuringReaction= ruleLocalDuringReaction EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:794:2: iv_ruleLocalDuringReaction= ruleLocalDuringReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalDuringReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalDuringReaction_in_entryRuleLocalDuringReaction1648);
            iv_ruleLocalDuringReaction=ruleLocalDuringReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalDuringReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalDuringReaction1658); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalDuringReaction"


    // $ANTLR start "ruleLocalDuringReaction"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:801:1: ruleLocalDuringReaction returns [EObject current=null] : ( () ( (lv_isImmediate_1_0= 'immediate' ) )? otherlv_2= 'during' otherlv_3= ':' ( (lv_trigger_4_0= ruleReactionTrigger ) )? otherlv_5= '/' ( (lv_effect_6_0= ruleReactionEffect ) ) otherlv_7= ';' ) ;
    public final EObject ruleLocalDuringReaction() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_trigger_4_0 = null;

        EObject lv_effect_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:804:28: ( ( () ( (lv_isImmediate_1_0= 'immediate' ) )? otherlv_2= 'during' otherlv_3= ':' ( (lv_trigger_4_0= ruleReactionTrigger ) )? otherlv_5= '/' ( (lv_effect_6_0= ruleReactionEffect ) ) otherlv_7= ';' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:805:1: ( () ( (lv_isImmediate_1_0= 'immediate' ) )? otherlv_2= 'during' otherlv_3= ':' ( (lv_trigger_4_0= ruleReactionTrigger ) )? otherlv_5= '/' ( (lv_effect_6_0= ruleReactionEffect ) ) otherlv_7= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:805:1: ( () ( (lv_isImmediate_1_0= 'immediate' ) )? otherlv_2= 'during' otherlv_3= ':' ( (lv_trigger_4_0= ruleReactionTrigger ) )? otherlv_5= '/' ( (lv_effect_6_0= ruleReactionEffect ) ) otherlv_7= ';' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:805:2: () ( (lv_isImmediate_1_0= 'immediate' ) )? otherlv_2= 'during' otherlv_3= ':' ( (lv_trigger_4_0= ruleReactionTrigger ) )? otherlv_5= '/' ( (lv_effect_6_0= ruleReactionEffect ) ) otherlv_7= ';'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:805:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:806:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalDuringReactionAccess().getLocalDuringReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:814:2: ( (lv_isImmediate_1_0= 'immediate' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:815:1: (lv_isImmediate_1_0= 'immediate' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:815:1: (lv_isImmediate_1_0= 'immediate' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:816:3: lv_isImmediate_1_0= 'immediate'
                    {
                    lv_isImmediate_1_0=(Token)match(input,27,FOLLOW_27_in_ruleLocalDuringReaction1713); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isImmediate_1_0, grammarAccess.getLocalDuringReactionAccess().getIsImmediateImmediateKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLocalDuringReactionRule());
                      	        }
                             		setWithLastConsumed(current, "isImmediate", true, "immediate");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleLocalDuringReaction1739); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLocalDuringReactionAccess().getDuringKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleLocalDuringReaction1751); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLocalDuringReactionAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:837:1: ( (lv_trigger_4_0= ruleReactionTrigger ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)||LA15_0==23||(LA15_0>=31 && LA15_0<=32)||LA15_0==53||LA15_0==60||(LA15_0>=89 && LA15_0<=91)) ) {
                alt15=1;
            }
            else if ( (LA15_0==26) ) {
                int LA15_2 = input.LA(2);

                if ( (synpred20_InternalSynctext()) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:838:1: (lv_trigger_4_0= ruleReactionTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:838:1: (lv_trigger_4_0= ruleReactionTrigger )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:839:3: lv_trigger_4_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalDuringReactionAccess().getTriggerReactionTriggerParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalDuringReaction1772);
                    lv_trigger_4_0=ruleReactionTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocalDuringReactionRule());
                      	        }
                             		set(
                             			current, 
                             			"trigger",
                              		lv_trigger_4_0, 
                              		"ReactionTrigger");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleLocalDuringReaction1785); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getLocalDuringReactionAccess().getSolidusKeyword_5());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:859:1: ( (lv_effect_6_0= ruleReactionEffect ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:860:1: (lv_effect_6_0= ruleReactionEffect )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:860:1: (lv_effect_6_0= ruleReactionEffect )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:861:3: lv_effect_6_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalDuringReactionAccess().getEffectReactionEffectParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalDuringReaction1806);
            lv_effect_6_0=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalDuringReactionRule());
              	        }
                     		set(
                     			current, 
                     			"effect",
                      		lv_effect_6_0, 
                      		"ReactionEffect");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleLocalDuringReaction1818); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getLocalDuringReactionAccess().getSemicolonKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalDuringReaction"


    // $ANTLR start "entryRuleLocalExitReaction"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:889:1: entryRuleLocalExitReaction returns [EObject current=null] : iv_ruleLocalExitReaction= ruleLocalExitReaction EOF ;
    public final EObject entryRuleLocalExitReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalExitReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:890:2: (iv_ruleLocalExitReaction= ruleLocalExitReaction EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:891:2: iv_ruleLocalExitReaction= ruleLocalExitReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalExitReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalExitReaction_in_entryRuleLocalExitReaction1854);
            iv_ruleLocalExitReaction=ruleLocalExitReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalExitReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalExitReaction1864); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalExitReaction"


    // $ANTLR start "ruleLocalExitReaction"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:898:1: ruleLocalExitReaction returns [EObject current=null] : ( () otherlv_1= 'exit' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) )? (otherlv_4= '/' ( (lv_effect_5_0= ruleReactionEffect ) ) ) otherlv_6= ';' ) ;
    public final EObject ruleLocalExitReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_trigger_3_0 = null;

        EObject lv_effect_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:901:28: ( ( () otherlv_1= 'exit' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) )? (otherlv_4= '/' ( (lv_effect_5_0= ruleReactionEffect ) ) ) otherlv_6= ';' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:902:1: ( () otherlv_1= 'exit' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) )? (otherlv_4= '/' ( (lv_effect_5_0= ruleReactionEffect ) ) ) otherlv_6= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:902:1: ( () otherlv_1= 'exit' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) )? (otherlv_4= '/' ( (lv_effect_5_0= ruleReactionEffect ) ) ) otherlv_6= ';' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:902:2: () otherlv_1= 'exit' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) )? (otherlv_4= '/' ( (lv_effect_5_0= ruleReactionEffect ) ) ) otherlv_6= ';'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:902:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:903:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalExitReactionAccess().getLocalExitReactionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleLocalExitReaction1913); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalExitReactionAccess().getExitKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleLocalExitReaction1925); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLocalExitReactionAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:919:1: ( (lv_trigger_3_0= ruleReactionTrigger ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||LA16_0==23||(LA16_0>=31 && LA16_0<=32)||LA16_0==53||LA16_0==60||(LA16_0>=89 && LA16_0<=91)) ) {
                alt16=1;
            }
            else if ( (LA16_0==26) ) {
                int LA16_2 = input.LA(2);

                if ( (synpred21_InternalSynctext()) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:920:1: (lv_trigger_3_0= ruleReactionTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:920:1: (lv_trigger_3_0= ruleReactionTrigger )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:921:3: lv_trigger_3_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalExitReactionAccess().getTriggerReactionTriggerParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalExitReaction1946);
                    lv_trigger_3_0=ruleReactionTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocalExitReactionRule());
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
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:937:3: (otherlv_4= '/' ( (lv_effect_5_0= ruleReactionEffect ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:937:5: otherlv_4= '/' ( (lv_effect_5_0= ruleReactionEffect ) )
            {
            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleLocalExitReaction1960); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLocalExitReactionAccess().getSolidusKeyword_4_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:941:1: ( (lv_effect_5_0= ruleReactionEffect ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:942:1: (lv_effect_5_0= ruleReactionEffect )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:942:1: (lv_effect_5_0= ruleReactionEffect )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:943:3: lv_effect_5_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalExitReactionAccess().getEffectReactionEffectParserRuleCall_4_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalExitReaction1981);
            lv_effect_5_0=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalExitReactionRule());
              	        }
                     		set(
                     			current, 
                     			"effect",
                      		lv_effect_5_0, 
                      		"ReactionEffect");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleLocalExitReaction1994); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getLocalExitReactionAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalExitReaction"


    // $ANTLR start "entryRuleLocalSuspendReaction"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:971:1: entryRuleLocalSuspendReaction returns [EObject current=null] : iv_ruleLocalSuspendReaction= ruleLocalSuspendReaction EOF ;
    public final EObject entryRuleLocalSuspendReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalSuspendReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:972:2: (iv_ruleLocalSuspendReaction= ruleLocalSuspendReaction EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:973:2: iv_ruleLocalSuspendReaction= ruleLocalSuspendReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalSuspendReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalSuspendReaction_in_entryRuleLocalSuspendReaction2030);
            iv_ruleLocalSuspendReaction=ruleLocalSuspendReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalSuspendReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalSuspendReaction2040); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalSuspendReaction"


    // $ANTLR start "ruleLocalSuspendReaction"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:980:1: ruleLocalSuspendReaction returns [EObject current=null] : ( () ( (lv_isImmediate_1_0= 'immediate' ) )? otherlv_2= 'suspend' otherlv_3= ':' ( (lv_trigger_4_0= ruleReactionTrigger ) )? otherlv_5= ';' ) ;
    public final EObject ruleLocalSuspendReaction() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_trigger_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:983:28: ( ( () ( (lv_isImmediate_1_0= 'immediate' ) )? otherlv_2= 'suspend' otherlv_3= ':' ( (lv_trigger_4_0= ruleReactionTrigger ) )? otherlv_5= ';' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:984:1: ( () ( (lv_isImmediate_1_0= 'immediate' ) )? otherlv_2= 'suspend' otherlv_3= ':' ( (lv_trigger_4_0= ruleReactionTrigger ) )? otherlv_5= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:984:1: ( () ( (lv_isImmediate_1_0= 'immediate' ) )? otherlv_2= 'suspend' otherlv_3= ':' ( (lv_trigger_4_0= ruleReactionTrigger ) )? otherlv_5= ';' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:984:2: () ( (lv_isImmediate_1_0= 'immediate' ) )? otherlv_2= 'suspend' otherlv_3= ':' ( (lv_trigger_4_0= ruleReactionTrigger ) )? otherlv_5= ';'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:984:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:985:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalSuspendReactionAccess().getLocalSuspendReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:993:2: ( (lv_isImmediate_1_0= 'immediate' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:994:1: (lv_isImmediate_1_0= 'immediate' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:994:1: (lv_isImmediate_1_0= 'immediate' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:995:3: lv_isImmediate_1_0= 'immediate'
                    {
                    lv_isImmediate_1_0=(Token)match(input,27,FOLLOW_27_in_ruleLocalSuspendReaction2095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isImmediate_1_0, grammarAccess.getLocalSuspendReactionAccess().getIsImmediateImmediateKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLocalSuspendReactionRule());
                      	        }
                             		setWithLastConsumed(current, "isImmediate", true, "immediate");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleLocalSuspendReaction2121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLocalSuspendReactionAccess().getSuspendKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleLocalSuspendReaction2133); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLocalSuspendReactionAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1016:1: ( (lv_trigger_4_0= ruleReactionTrigger ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)||LA18_0==23||(LA18_0>=31 && LA18_0<=32)||LA18_0==53||LA18_0==60||(LA18_0>=89 && LA18_0<=91)) ) {
                alt18=1;
            }
            else if ( (LA18_0==20) ) {
                int LA18_2 = input.LA(2);

                if ( (synpred23_InternalSynctext()) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1017:1: (lv_trigger_4_0= ruleReactionTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1017:1: (lv_trigger_4_0= ruleReactionTrigger )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1018:3: lv_trigger_4_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalSuspendReactionAccess().getTriggerReactionTriggerParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalSuspendReaction2154);
                    lv_trigger_4_0=ruleReactionTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocalSuspendReactionRule());
                      	        }
                             		set(
                             			current, 
                             			"trigger",
                              		lv_trigger_4_0, 
                              		"ReactionTrigger");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleLocalSuspendReaction2167); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getLocalSuspendReactionAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalSuspendReaction"


    // $ANTLR start "entryRuleReactionTrigger"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1048:1: entryRuleReactionTrigger returns [EObject current=null] : iv_ruleReactionTrigger= ruleReactionTrigger EOF ;
    public final EObject entryRuleReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1049:2: (iv_ruleReactionTrigger= ruleReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1050:2: iv_ruleReactionTrigger= ruleReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger2205);
            iv_ruleReactionTrigger=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionTrigger2215); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1057:1: ruleReactionTrigger returns [EObject current=null] : ( () ( ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' )? ( (lv_delay_3_0= RULE_INT ) )? ( (lv_expression_4_0= ruleExpression ) )? ) ;
    public final EObject ruleReactionTrigger() throws RecognitionException {
        EObject current = null;

        Token lv_labelPriority_1_0=null;
        Token otherlv_2=null;
        Token lv_delay_3_0=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1060:28: ( ( () ( ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' )? ( (lv_delay_3_0= RULE_INT ) )? ( (lv_expression_4_0= ruleExpression ) )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1061:1: ( () ( ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' )? ( (lv_delay_3_0= RULE_INT ) )? ( (lv_expression_4_0= ruleExpression ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1061:1: ( () ( ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' )? ( (lv_delay_3_0= RULE_INT ) )? ( (lv_expression_4_0= ruleExpression ) )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1061:2: () ( ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' )? ( (lv_delay_3_0= RULE_INT ) )? ( (lv_expression_4_0= ruleExpression ) )?
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1061:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1062:2: 
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1070:2: ( ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1070:3: ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':'
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1070:3: ( (lv_labelPriority_1_0= RULE_INT ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1071:1: (lv_labelPriority_1_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1071:1: (lv_labelPriority_1_0= RULE_INT )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1072:3: lv_labelPriority_1_0= RULE_INT
                    {
                    lv_labelPriority_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReactionTrigger2270); if (state.failed) return current;
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

                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleReactionTrigger2287); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getReactionTriggerAccess().getColonKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1092:3: ( (lv_delay_3_0= RULE_INT ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                int LA20_1 = input.LA(2);

                if ( (synpred25_InternalSynctext()) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1093:1: (lv_delay_3_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1093:1: (lv_delay_3_0= RULE_INT )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1094:3: lv_delay_3_0= RULE_INT
                    {
                    lv_delay_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReactionTrigger2306); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1110:3: ( (lv_expression_4_0= ruleExpression ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)||LA21_0==23||(LA21_0>=31 && LA21_0<=32)||LA21_0==53||LA21_0==60||(LA21_0>=89 && LA21_0<=91)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1111:1: (lv_expression_4_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1111:1: (lv_expression_4_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1112:3: lv_expression_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getExpressionExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger2333);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1136:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1137:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1138:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect2370);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionEffect2380); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1145:1: ruleReactionEffect returns [EObject current=null] : ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( (lv_actions_3_0= ruleExpression ) ) )* ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_0 = null;

        EObject lv_actions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1148:28: ( ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( (lv_actions_3_0= ruleExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1149:1: ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( (lv_actions_3_0= ruleExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1149:1: ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( (lv_actions_3_0= ruleExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1149:2: () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( (lv_actions_3_0= ruleExpression ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1149:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1150:2: 
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1158:2: ( (lv_actions_1_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1159:1: (lv_actions_1_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1159:1: (lv_actions_1_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1160:3: lv_actions_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect2438);
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1176:2: ( ( ( ';' )=>otherlv_2= ';' ) ( (lv_actions_3_0= ruleExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1176:3: ( ( ';' )=>otherlv_2= ';' ) ( (lv_actions_3_0= ruleExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1176:3: ( ( ';' )=>otherlv_2= ';' )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1176:4: ( ';' )=>otherlv_2= ';'
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleReactionEffect2459); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReactionEffectAccess().getSemicolonKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1181:2: ( (lv_actions_3_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1182:1: (lv_actions_3_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1182:1: (lv_actions_3_0= ruleExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1183:3: lv_actions_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect2481);
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


    // $ANTLR start "entryRuleNumericalMultiplyDivideExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1207:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1208:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1209:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression2519);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression2529); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1216:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1219:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1220:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1220:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1221:2: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression2579);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1232:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1232:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1232:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1233:2: 
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

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1241:2: ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1242:1: (lv_operator_2_0= ruleMultiplicativeOperator2 )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1242:1: (lv_operator_2_0= ruleMultiplicativeOperator2 )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1243:3: lv_operator_2_0= ruleMultiplicativeOperator2
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperator2EnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator2_in_ruleNumericalMultiplyDivideExpression2612);
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

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1259:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1260:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1260:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1261:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression2633);
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
    // $ANTLR end "ruleNumericalMultiplyDivideExpression"


    // $ANTLR start "entryRuleValReferenceExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1285:1: entryRuleValReferenceExpression returns [EObject current=null] : iv_ruleValReferenceExpression= ruleValReferenceExpression EOF ;
    public final EObject entryRuleValReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1286:2: (iv_ruleValReferenceExpression= ruleValReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1287:2: iv_ruleValReferenceExpression= ruleValReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleValReferenceExpression_in_entryRuleValReferenceExpression2671);
            iv_ruleValReferenceExpression=ruleValReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValReferenceExpression2681); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValReferenceExpression"


    // $ANTLR start "ruleValReferenceExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1294:1: ruleValReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'val' otherlv_2= '(' ( ( (lv_expression_3_1= ruleFeatureCall | lv_expression_3_2= rulePreReferenceExpression ) ) ) otherlv_4= ')' ) ;
    public final EObject ruleValReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_1 = null;

        EObject lv_expression_3_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1297:28: ( ( () otherlv_1= 'val' otherlv_2= '(' ( ( (lv_expression_3_1= ruleFeatureCall | lv_expression_3_2= rulePreReferenceExpression ) ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1298:1: ( () otherlv_1= 'val' otherlv_2= '(' ( ( (lv_expression_3_1= ruleFeatureCall | lv_expression_3_2= rulePreReferenceExpression ) ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1298:1: ( () otherlv_1= 'val' otherlv_2= '(' ( ( (lv_expression_3_1= ruleFeatureCall | lv_expression_3_2= rulePreReferenceExpression ) ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1298:2: () otherlv_1= 'val' otherlv_2= '(' ( ( (lv_expression_3_1= ruleFeatureCall | lv_expression_3_2= rulePreReferenceExpression ) ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1298:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1299:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getValReferenceExpressionAccess().getValReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleValReferenceExpression2730); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getValReferenceExpressionAccess().getValKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleValReferenceExpression2742); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getValReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1315:1: ( ( (lv_expression_3_1= ruleFeatureCall | lv_expression_3_2= rulePreReferenceExpression ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1316:1: ( (lv_expression_3_1= ruleFeatureCall | lv_expression_3_2= rulePreReferenceExpression ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1316:1: ( (lv_expression_3_1= ruleFeatureCall | lv_expression_3_2= rulePreReferenceExpression ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1317:1: (lv_expression_3_1= ruleFeatureCall | lv_expression_3_2= rulePreReferenceExpression )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1317:1: (lv_expression_3_1= ruleFeatureCall | lv_expression_3_2= rulePreReferenceExpression )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==32) ) {
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1318:3: lv_expression_3_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValReferenceExpressionAccess().getExpressionFeatureCallParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_ruleValReferenceExpression2765);
                    lv_expression_3_1=ruleFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValReferenceExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_3_1, 
                              		"FeatureCall");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1333:8: lv_expression_3_2= rulePreReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValReferenceExpressionAccess().getExpressionPreReferenceExpressionParserRuleCall_3_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePreReferenceExpression_in_ruleValReferenceExpression2784);
                    lv_expression_3_2=rulePreReferenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValReferenceExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_3_2, 
                              		"PreReferenceExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleValReferenceExpression2799); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getValReferenceExpressionAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValReferenceExpression"


    // $ANTLR start "entryRulePreReferenceExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1363:1: entryRulePreReferenceExpression returns [EObject current=null] : iv_rulePreReferenceExpression= rulePreReferenceExpression EOF ;
    public final EObject entryRulePreReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1364:2: (iv_rulePreReferenceExpression= rulePreReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1365:2: iv_rulePreReferenceExpression= rulePreReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePreReferenceExpression_in_entryRulePreReferenceExpression2835);
            iv_rulePreReferenceExpression=rulePreReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreReferenceExpression2845); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1372:1: rulePreReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'pre' otherlv_2= '(' ( ( (lv_expression_3_1= ruleFeatureCall | lv_expression_3_2= ruleValReferenceExpression | lv_expression_3_3= rulePreReferenceExpression ) ) ) otherlv_4= ')' ) ;
    public final EObject rulePreReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_1 = null;

        EObject lv_expression_3_2 = null;

        EObject lv_expression_3_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1375:28: ( ( () otherlv_1= 'pre' otherlv_2= '(' ( ( (lv_expression_3_1= ruleFeatureCall | lv_expression_3_2= ruleValReferenceExpression | lv_expression_3_3= rulePreReferenceExpression ) ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1376:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( ( (lv_expression_3_1= ruleFeatureCall | lv_expression_3_2= ruleValReferenceExpression | lv_expression_3_3= rulePreReferenceExpression ) ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1376:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( ( (lv_expression_3_1= ruleFeatureCall | lv_expression_3_2= ruleValReferenceExpression | lv_expression_3_3= rulePreReferenceExpression ) ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1376:2: () otherlv_1= 'pre' otherlv_2= '(' ( ( (lv_expression_3_1= ruleFeatureCall | lv_expression_3_2= ruleValReferenceExpression | lv_expression_3_3= rulePreReferenceExpression ) ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1376:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1377:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPreReferenceExpressionAccess().getPreReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_rulePreReferenceExpression2894); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPreReferenceExpressionAccess().getPreKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_rulePreReferenceExpression2906); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPreReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1393:1: ( ( (lv_expression_3_1= ruleFeatureCall | lv_expression_3_2= ruleValReferenceExpression | lv_expression_3_3= rulePreReferenceExpression ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1394:1: ( (lv_expression_3_1= ruleFeatureCall | lv_expression_3_2= ruleValReferenceExpression | lv_expression_3_3= rulePreReferenceExpression ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1394:1: ( (lv_expression_3_1= ruleFeatureCall | lv_expression_3_2= ruleValReferenceExpression | lv_expression_3_3= rulePreReferenceExpression ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1395:1: (lv_expression_3_1= ruleFeatureCall | lv_expression_3_2= ruleValReferenceExpression | lv_expression_3_3= rulePreReferenceExpression )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1395:1: (lv_expression_3_1= ruleFeatureCall | lv_expression_3_2= ruleValReferenceExpression | lv_expression_3_3= rulePreReferenceExpression )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt25=1;
                }
                break;
            case 31:
                {
                alt25=2;
                }
                break;
            case 32:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1396:3: lv_expression_3_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPreReferenceExpressionAccess().getExpressionFeatureCallParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePreReferenceExpression2929);
                    lv_expression_3_1=ruleFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPreReferenceExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_3_1, 
                              		"FeatureCall");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1411:8: lv_expression_3_2= ruleValReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPreReferenceExpressionAccess().getExpressionValReferenceExpressionParserRuleCall_3_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValReferenceExpression_in_rulePreReferenceExpression2948);
                    lv_expression_3_2=ruleValReferenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPreReferenceExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_3_2, 
                              		"ValReferenceExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1426:8: lv_expression_3_3= rulePreReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPreReferenceExpressionAccess().getExpressionPreReferenceExpressionParserRuleCall_3_0_2()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePreReferenceExpression_in_rulePreReferenceExpression2967);
                    lv_expression_3_3=rulePreReferenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPreReferenceExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_3_3, 
                              		"PreReferenceExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_rulePreReferenceExpression2982); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1456:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1457:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1458:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3018);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression3028); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1465:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_ValReferenceExpression_3= ruleValReferenceExpression | this_PreReferenceExpression_4= rulePreReferenceExpression | this_ParenthesizedExpression_5= ruleParenthesizedExpression ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveValueExpression_0 = null;

        EObject this_FeatureCall_1 = null;

        EObject this_ActiveStateReferenceExpression_2 = null;

        EObject this_ValReferenceExpression_3 = null;

        EObject this_PreReferenceExpression_4 = null;

        EObject this_ParenthesizedExpression_5 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1468:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_ValReferenceExpression_3= ruleValReferenceExpression | this_PreReferenceExpression_4= rulePreReferenceExpression | this_ParenthesizedExpression_5= ruleParenthesizedExpression ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1469:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_ValReferenceExpression_3= ruleValReferenceExpression | this_PreReferenceExpression_4= rulePreReferenceExpression | this_ParenthesizedExpression_5= ruleParenthesizedExpression )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1469:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_ValReferenceExpression_3= ruleValReferenceExpression | this_PreReferenceExpression_4= rulePreReferenceExpression | this_ParenthesizedExpression_5= ruleParenthesizedExpression )
            int alt26=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_HEX:
            case RULE_STRING:
                {
                alt26=1;
                }
                break;
            case RULE_ID:
                {
                alt26=2;
                }
                break;
            case 53:
                {
                alt26=3;
                }
                break;
            case 31:
                {
                alt26=4;
                }
                break;
            case 32:
                {
                alt26=5;
                }
                break;
            case 23:
                {
                alt26=6;
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1470:2: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrimitiveValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression3078);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1483:2: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression3108);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1496:2: this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getActiveStateReferenceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression3138);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1509:2: this_ValReferenceExpression_3= ruleValReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValReferenceExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValReferenceExpression_in_rulePrimaryExpression3168);
                    this_ValReferenceExpression_3=ruleValReferenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValReferenceExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1522:2: this_PreReferenceExpression_4= rulePreReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPreReferenceExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_rulePreReferenceExpression_in_rulePrimaryExpression3198);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1535:2: this_ParenthesizedExpression_5= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression3228);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1556:1: entryRuleDefRoot returns [EObject current=null] : iv_ruleDefRoot= ruleDefRoot EOF ;
    public final EObject entryRuleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1557:2: (iv_ruleDefRoot= ruleDefRoot EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1558:2: iv_ruleDefRoot= ruleDefRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefRootRule()); 
            }
            pushFollow(FOLLOW_ruleDefRoot_in_entryRuleDefRoot3265);
            iv_ruleDefRoot=ruleDefRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRoot3275); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1565:1: ruleDefRoot returns [EObject current=null] : (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) ;
    public final EObject ruleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject this_StatechartRoot_0 = null;

        EObject this_StateRoot_1 = null;

        EObject this_TransitionRoot_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1568:28: ( (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1569:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1569:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt27=1;
                }
                break;
            case 34:
                {
                alt27=2;
                }
                break;
            case 35:
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1570:2: this_StatechartRoot_0= ruleStatechartRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStatechartRootParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatechartRoot_in_ruleDefRoot3325);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1583:2: this_StateRoot_1= ruleStateRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStateRootParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStateRoot_in_ruleDefRoot3355);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1596:2: this_TransitionRoot_2= ruleTransitionRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getTransitionRootParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransitionRoot_in_ruleDefRoot3385);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1615:1: entryRuleStatechartRoot returns [EObject current=null] : iv_ruleStatechartRoot= ruleStatechartRoot EOF ;
    public final EObject entryRuleStatechartRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1616:2: (iv_ruleStatechartRoot= ruleStatechartRoot EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1617:2: iv_ruleStatechartRoot= ruleStatechartRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartRootRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot3420);
            iv_ruleStatechartRoot=ruleStatechartRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartRoot3430); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1624:1: ruleStatechartRoot returns [EObject current=null] : (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) ;
    public final EObject ruleStatechartRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1627:28: ( (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1628:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1628:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1628:3: otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleStatechartRoot3467); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatechartRootAccess().getStatechartKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1632:1: ( (lv_def_1_0= ruleStatechartSpecification ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1633:1: (lv_def_1_0= ruleStatechartSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1633:1: (lv_def_1_0= ruleStatechartSpecification )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1634:3: lv_def_1_0= ruleStatechartSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatechartRootAccess().getDefStatechartSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot3488);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1658:1: entryRuleStateRoot returns [EObject current=null] : iv_ruleStateRoot= ruleStateRoot EOF ;
    public final EObject entryRuleStateRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1659:2: (iv_ruleStateRoot= ruleStateRoot EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1660:2: iv_ruleStateRoot= ruleStateRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRootRule()); 
            }
            pushFollow(FOLLOW_ruleStateRoot_in_entryRuleStateRoot3524);
            iv_ruleStateRoot=ruleStateRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateRoot3534); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1667:1: ruleStateRoot returns [EObject current=null] : (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) ;
    public final EObject ruleStateRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1670:28: ( (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1671:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1671:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1671:3: otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleStateRoot3571); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateRootAccess().getStateKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1675:1: ( (lv_def_1_0= ruleStateSpecification ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1676:1: (lv_def_1_0= ruleStateSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1676:1: (lv_def_1_0= ruleStateSpecification )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1677:3: lv_def_1_0= ruleStateSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateRootAccess().getDefStateSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_ruleStateRoot3592);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1701:1: entryRuleTransitionRoot returns [EObject current=null] : iv_ruleTransitionRoot= ruleTransitionRoot EOF ;
    public final EObject entryRuleTransitionRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1702:2: (iv_ruleTransitionRoot= ruleTransitionRoot EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1703:2: iv_ruleTransitionRoot= ruleTransitionRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRootRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot3628);
            iv_ruleTransitionRoot=ruleTransitionRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionRoot3638); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1710:1: ruleTransitionRoot returns [EObject current=null] : (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) ;
    public final EObject ruleTransitionRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1713:28: ( (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1714:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1714:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1714:3: otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleTransitionRoot3675); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionRootAccess().getTransitionKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1718:1: ( (lv_def_1_0= ruleTransitionSpecification ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1719:1: (lv_def_1_0= ruleTransitionSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1719:1: (lv_def_1_0= ruleTransitionSpecification )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1720:3: lv_def_1_0= ruleTransitionSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionRootAccess().getDefTransitionSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot3696);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1746:1: entryRuleStatechartSpecification returns [EObject current=null] : iv_ruleStatechartSpecification= ruleStatechartSpecification EOF ;
    public final EObject entryRuleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1747:2: (iv_ruleStatechartSpecification= ruleStatechartSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1748:2: iv_ruleStatechartSpecification= ruleStatechartSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification3734);
            iv_ruleStatechartSpecification=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartSpecification3744); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1755:1: ruleStatechartSpecification returns [EObject current=null] : ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) ;
    public final EObject ruleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        EObject lv_scopes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1758:28: ( ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1759:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1759:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1759:2: () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1759:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1760:2: 
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1768:2: (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1768:4: otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleStatechartSpecification3794); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatechartSpecificationAccess().getNamespaceKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1772:1: ( (lv_namespace_2_0= ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1773:1: (lv_namespace_2_0= ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1773:1: (lv_namespace_2_0= ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1774:3: lv_namespace_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getNamespaceFQNParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleStatechartSpecification3815);
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1790:4: ( (lv_scopes_3_0= ruleStatechartScope ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=37 && LA29_0<=38)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1791:1: (lv_scopes_3_0= ruleStatechartScope )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1791:1: (lv_scopes_3_0= ruleStatechartScope )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1792:3: lv_scopes_3_0= ruleStatechartScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getScopesStatechartScopeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification3838);
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
    // $ANTLR end "ruleStatechartSpecification"


    // $ANTLR start "entryRuleStateSpecification"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1816:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1817:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1818:2: iv_ruleStateSpecification= ruleStateSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3875);
            iv_ruleStateSpecification=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateSpecification3885); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1825:1: ruleStateSpecification returns [EObject current=null] : ( (lv_scope_0_0= ruleStateScope ) ) ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_scope_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1828:28: ( ( (lv_scope_0_0= ruleStateScope ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1829:1: ( (lv_scope_0_0= ruleStateScope ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1829:1: ( (lv_scope_0_0= ruleStateScope ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1830:1: (lv_scope_0_0= ruleStateScope )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1830:1: (lv_scope_0_0= ruleStateScope )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1831:3: lv_scope_0_0= ruleStateScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateSpecificationAccess().getScopeStateScopeParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateScope_in_ruleStateSpecification3930);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1855:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1856:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1857:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3965);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification3975); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1864:1: ruleTransitionSpecification returns [EObject current=null] : ( (lv_reaction_0_0= ruleTransitionReaction ) ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_reaction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1867:28: ( ( (lv_reaction_0_0= ruleTransitionReaction ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1868:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1868:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1869:1: (lv_reaction_0_0= ruleTransitionReaction )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1869:1: (lv_reaction_0_0= ruleTransitionReaction )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1870:3: lv_reaction_0_0= ruleTransitionReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getReactionTransitionReactionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification4020);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1896:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1897:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1898:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope4057);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartScope4067); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1905:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1908:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1909:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1909:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            else if ( (LA30_0==38) ) {
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1910:2: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStatechartScope4117);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1923:2: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalScope_in_ruleStatechartScope4147);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1944:1: entryRuleInterfaceScope returns [EObject current=null] : iv_ruleInterfaceScope= ruleInterfaceScope EOF ;
    public final EObject entryRuleInterfaceScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1945:2: (iv_ruleInterfaceScope= ruleInterfaceScope EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1946:2: iv_ruleInterfaceScope= ruleInterfaceScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope4184);
            iv_ruleInterfaceScope=ruleInterfaceScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceScope4194); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1953:1: ruleInterfaceScope returns [EObject current=null] : ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1956:28: ( ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1957:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1957:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1957:2: () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1957:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1958:2: 
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

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleInterfaceScope4243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceScopeAccess().getInterfaceKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1970:1: ( (lv_name_2_0= ruleXID ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID||LA31_0==25||LA31_0==29||(LA31_0>=36 && LA31_0<=53)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1971:1: (lv_name_2_0= ruleXID )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1971:1: (lv_name_2_0= ruleXID )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1972:3: lv_name_2_0= ruleXID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getNameXIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXID_in_ruleInterfaceScope4264);
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleInterfaceScope4277); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInterfaceScopeAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1992:1: ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            loop33:
            do {
                int alt33=2;
                switch ( input.LA(1) ) {
                case 37:
                    {
                    int LA33_2 = input.LA(2);

                    if ( (LA33_2==RULE_ID) ) {
                        int LA33_5 = input.LA(3);

                        if ( ((LA33_5>=18 && LA33_5<=20)) ) {
                            alt33=1;
                        }


                    }
                    else if ( (LA33_2==54) ) {
                        alt33=1;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA33_3 = input.LA(2);

                    if ( (LA33_3==RULE_ID||LA33_3==54) ) {
                        alt33=1;
                    }


                    }
                    break;
                case RULE_ID:
                case 14:
                case 15:
                case 21:
                case 22:
                case 25:
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
                    {
                    alt33=1;
                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1993:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1993:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1994:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1994:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    int alt32=3;
            	    switch ( input.LA(1) ) {
            	    case 40:
            	        {
            	        int LA32_1 = input.LA(2);

            	        if ( (LA32_1==39) ) {
            	            alt32=1;
            	        }
            	        else if ( (LA32_1==RULE_ID||LA32_1==54) ) {
            	            alt32=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 32, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 41:
            	        {
            	        int LA32_2 = input.LA(2);

            	        if ( (LA32_2==39) ) {
            	            alt32=1;
            	        }
            	        else if ( (LA32_2==RULE_ID||LA32_2==54) ) {
            	            alt32=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 32, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 42:
            	        {
            	        int LA32_3 = input.LA(2);

            	        if ( (LA32_3==RULE_ID||LA32_3==54) ) {
            	            alt32=2;
            	        }
            	        else if ( (LA32_3==39) ) {
            	            alt32=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 32, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 39:
            	        {
            	        switch ( input.LA(2) ) {
            	        case 54:
            	            {
            	            alt32=2;
            	            }
            	            break;
            	        case RULE_ID:
            	            {
            	            int LA32_8 = input.LA(3);

            	            if ( (LA32_8==EOF||LA32_8==RULE_ID||(LA32_8>=14 && LA32_8<=15)||LA32_8==17||(LA32_8>=21 && LA32_8<=22)||LA32_8==25||LA32_8==29||(LA32_8>=36 && LA32_8<=53)) ) {
            	                alt32=1;
            	            }
            	            else if ( ((LA32_8>=18 && LA32_8<=20)) ) {
            	                alt32=2;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return current;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 32, 8, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case 25:
            	        case 29:
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
            	            {
            	            alt32=1;
            	            }
            	            break;
            	        default:
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 32, 4, input);

            	            throw nvae;
            	        }

            	        }
            	        break;
            	    case RULE_ID:
            	    case 14:
            	    case 15:
            	    case 21:
            	    case 25:
            	    case 29:
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
            	        {
            	        alt32=2;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt32=3;
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
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1995:3: lv_declarations_4_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope4300);
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
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2010:8: lv_declarations_4_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope4319);
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
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2025:8: lv_declarations_4_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_4_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope4338);
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
    // $ANTLR end "ruleInterfaceScope"


    // $ANTLR start "entryRuleInternalScope"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2051:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2052:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2053:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInternalScope_in_entryRuleInternalScope4378);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalScope4388); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2060:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2063:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2064:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2064:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2064:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2064:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2065:2: 
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

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleInternalScope4437); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleInternalScope4449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2081:1: ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            loop35:
            do {
                int alt35=2;
                switch ( input.LA(1) ) {
                case 37:
                    {
                    int LA35_2 = input.LA(2);

                    if ( (LA35_2==54) ) {
                        alt35=1;
                    }
                    else if ( (LA35_2==RULE_ID) ) {
                        int LA35_5 = input.LA(3);

                        if ( ((LA35_5>=18 && LA35_5<=20)) ) {
                            alt35=1;
                        }


                    }


                    }
                    break;
                case 38:
                    {
                    int LA35_3 = input.LA(2);

                    if ( (LA35_3==RULE_ID||LA35_3==54) ) {
                        alt35=1;
                    }


                    }
                    break;
                case RULE_ID:
                case RULE_INT:
                case RULE_BOOL:
                case RULE_FLOAT:
                case RULE_HEX:
                case RULE_STRING:
                case 14:
                case 15:
                case 21:
                case 22:
                case 23:
                case 25:
                case 26:
                case 29:
                case 31:
                case 32:
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
                case 60:
                case 89:
                case 90:
                case 91:
                    {
                    alt35=1;
                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2082:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2082:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2083:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2083:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    int alt34=4;
            	    alt34 = dfa34.predict(input);
            	    switch (alt34) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2084:3: lv_declarations_3_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInternalScope4472);
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
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2099:8: lv_declarations_3_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInternalScope4491);
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
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2114:8: lv_declarations_3_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInternalScope4510);
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
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2129:8: lv_declarations_3_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsLocalReactionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleInternalScope4529);
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
            	    break loop35;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2155:1: entryRuleEventDeclarartion returns [EObject current=null] : iv_ruleEventDeclarartion= ruleEventDeclarartion EOF ;
    public final EObject entryRuleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclarartion = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2156:2: (iv_ruleEventDeclarartion= ruleEventDeclarartion EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2157:2: iv_ruleEventDeclarartion= ruleEventDeclarartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarartionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion4569);
            iv_ruleEventDeclarartion=ruleEventDeclarartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclarartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclarartion4579); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2164:1: ruleEventDeclarartion returns [EObject current=null] : this_EventDefinition_0= ruleEventDefinition ;
    public final EObject ruleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject this_EventDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2167:28: (this_EventDefinition_0= ruleEventDefinition )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2169:2: this_EventDefinition_0= ruleEventDefinition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEventDeclarartionAccess().getEventDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion4628);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2190:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2191:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2192:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition4664);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDefinition4674); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2199:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2202:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2203:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2203:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2203:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2203:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=40 && LA36_0<=42)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2204:1: (lv_direction_0_0= ruleDirection )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2204:1: (lv_direction_0_0= ruleDirection )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2205:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_ruleEventDefinition4720);
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

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleEventDefinition4733); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2225:1: ( (lv_name_2_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2226:1: (lv_name_2_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2226:1: (lv_name_2_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2227:3: lv_name_2_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getNameXIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleEventDefinition4754);
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2243:2: (otherlv_3= ':' ( ( ruleFQN ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==17) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2243:4: otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleEventDefinition4767); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2247:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2248:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2248:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2249:3: ruleFQN
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
                    pushFollow(FOLLOW_ruleFQN_in_ruleEventDefinition4794);
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


    // $ANTLR start "entryRuleOperationDeclaration"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2275:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2276:2: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2277:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4834);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDeclaration4844); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2284:1: ruleOperationDeclaration returns [EObject current=null] : this_OperationDefinition_0= ruleOperationDefinition ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2287:28: (this_OperationDefinition_0= ruleOperationDefinition )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2289:2: this_OperationDefinition_0= ruleOperationDefinition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOperationDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4893);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2312:1: entryRuleXID returns [String current=null] : iv_ruleXID= ruleXID EOF ;
    public final String entryRuleXID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXID = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2313:2: (iv_ruleXID= ruleXID EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2314:2: iv_ruleXID= ruleXID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIDRule()); 
            }
            pushFollow(FOLLOW_ruleXID_in_entryRuleXID4932);
            iv_ruleXID=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXID4943); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2321:1: ruleXID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) ;
    public final AntlrDatatypeRuleToken ruleXID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2324:28: ( (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2325:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2325:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            int alt38=21;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt38=1;
                }
                break;
            case 36:
                {
                alt38=2;
                }
                break;
            case 37:
                {
                alt38=3;
                }
                break;
            case 38:
                {
                alt38=4;
                }
                break;
            case 39:
                {
                alt38=5;
                }
                break;
            case 40:
                {
                alt38=6;
                }
                break;
            case 41:
                {
                alt38=7;
                }
                break;
            case 42:
                {
                alt38=8;
                }
                break;
            case 43:
                {
                alt38=9;
                }
                break;
            case 44:
                {
                alt38=10;
                }
                break;
            case 45:
                {
                alt38=11;
                }
                break;
            case 46:
                {
                alt38=12;
                }
                break;
            case 47:
                {
                alt38=13;
                }
                break;
            case 48:
                {
                alt38=14;
                }
                break;
            case 25:
                {
                alt38=15;
                }
                break;
            case 29:
                {
                alt38=16;
                }
                break;
            case 49:
                {
                alt38=17;
                }
                break;
            case 50:
                {
                alt38=18;
                }
                break;
            case 51:
                {
                alt38=19;
                }
                break;
            case 52:
                {
                alt38=20;
                }
                break;
            case 53:
                {
                alt38=21;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2325:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXID4983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getXIDAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2334:2: kw= 'namespace'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleXID5007); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getNamespaceKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2341:2: kw= 'interface'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleXID5026); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInterfaceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2348:2: kw= 'internal'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleXID5045); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInternalKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2355:2: kw= 'event'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleXID5064); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEventKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2362:2: kw= 'local'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleXID5083); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getLocalKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2369:2: kw= 'in'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleXID5102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2376:2: kw= 'out'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleXID5121); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOutKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2383:2: kw= 'var'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleXID5140); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getVarKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2390:2: kw= 'readonly'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleXID5159); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getReadonlyKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2397:2: kw= 'external'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleXID5178); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExternalKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2404:2: kw= 'operation'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleXID5197); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOperationKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2411:2: kw= 'default'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleXID5216); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getDefaultKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2418:2: kw= 'else'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleXID5235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getElseKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2425:2: kw= 'entry'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleXID5254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEntryKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2432:2: kw= 'exit'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleXID5273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExitKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2439:2: kw= 'always'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleXID5292); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getAlwaysKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2446:2: kw= 'oncycle'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleXID5311); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOncycleKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2453:2: kw= 'raise'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleXID5330); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getRaiseKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2460:2: kw= 'valueof'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleXID5349); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getValueofKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2467:2: kw= 'active'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleXID5368); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2480:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2481:2: (iv_ruleFQN= ruleFQN EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2482:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN5409);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN5420); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2489:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_XID_0 = null;

        AntlrDatatypeRuleToken this_XID_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2492:28: ( (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2493:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2493:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2494:5: this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXID_in_ruleFQN5467);
            this_XID_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_XID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2504:1: (kw= '.' this_XID_2= ruleXID )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==54) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2505:2: kw= '.' this_XID_2= ruleXID
            	    {
            	    kw=(Token)match(input,54,FOLLOW_54_in_ruleFQN5486); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleXID_in_ruleFQN5508);
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
            	    break loop39;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2531:1: entryRuleLocalReaction returns [EObject current=null] : iv_ruleLocalReaction= ruleLocalReaction EOF ;
    public final EObject entryRuleLocalReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2532:2: (iv_ruleLocalReaction= ruleLocalReaction EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2533:2: iv_ruleLocalReaction= ruleLocalReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction5557);
            iv_ruleLocalReaction=ruleLocalReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReaction5567); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2540:1: ruleLocalReaction returns [EObject current=null] : ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) ;
    public final EObject ruleLocalReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_trigger_0_0 = null;

        EObject lv_effect_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2543:28: ( ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2544:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2544:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2544:2: ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2544:2: ( (lv_trigger_0_0= ruleReactionTrigger ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2545:1: (lv_trigger_0_0= ruleReactionTrigger )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2545:1: (lv_trigger_0_0= ruleReactionTrigger )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2546:3: lv_trigger_0_0= ruleReactionTrigger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerReactionTriggerParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReaction5613);
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2562:2: ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2562:3: ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2567:6: (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2567:8: otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) )
            {
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleLocalReaction5645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalReactionAccess().getSolidusKeyword_1_0_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2571:1: ( (lv_effect_2_0= ruleReactionEffect ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2572:1: (lv_effect_2_0= ruleReactionEffect )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2572:1: (lv_effect_2_0= ruleReactionEffect )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2573:3: lv_effect_2_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectReactionEffectParserRuleCall_1_0_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalReaction5666);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2597:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2598:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2599:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction5704);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionReaction5714); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2606:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2609:28: ( ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2610:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2610:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2610:2: () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )?
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2610:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2611:2: 
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2619:2: ( (lv_trigger_1_0= ruleStextTrigger ) )?
            int alt40=2;
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
                case 53:
                case 60:
                case 89:
                case 90:
                case 91:
                    {
                    alt40=1;
                    }
                    break;
                case 26:
                    {
                    int LA40_2 = input.LA(2);

                    if ( (synpred75_InternalSynctext()) ) {
                        alt40=1;
                    }
                    }
                    break;
                case 55:
                    {
                    int LA40_3 = input.LA(2);

                    if ( (synpred75_InternalSynctext()) ) {
                        alt40=1;
                    }
                    }
                    break;
                case EOF:
                    {
                    int LA40_4 = input.LA(2);

                    if ( (synpred75_InternalSynctext()) ) {
                        alt40=1;
                    }
                    }
                    break;
            }

            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2620:1: (lv_trigger_1_0= ruleStextTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2620:1: (lv_trigger_1_0= ruleStextTrigger )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2621:3: lv_trigger_1_0= ruleStextTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerStextTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStextTrigger_in_ruleTransitionReaction5772);
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2637:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==26) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2637:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleTransitionReaction5786); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2641:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2642:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2642:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2643:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransitionReaction5807);
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2659:4: (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==55) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2659:6: otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )*
                    {
                    otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleTransitionReaction5822); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionReactionAccess().getNumberSignKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2663:1: ( (lv_properties_5_0= ruleTransitionProperty ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==RULE_ID||LA42_0==56) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2664:1: (lv_properties_5_0= ruleTransitionProperty )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2664:1: (lv_properties_5_0= ruleTransitionProperty )
                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2665:3: lv_properties_5_0= ruleTransitionProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getPropertiesTransitionPropertyParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransitionProperty_in_ruleTransitionReaction5843);
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
                    	    break loop42;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2689:1: entryRuleStextTrigger returns [EObject current=null] : iv_ruleStextTrigger= ruleStextTrigger EOF ;
    public final EObject entryRuleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStextTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2690:2: (iv_ruleStextTrigger= ruleStextTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2691:2: iv_ruleStextTrigger= ruleStextTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStextTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5882);
            iv_ruleStextTrigger=ruleStextTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStextTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStextTrigger5892); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2698:1: ruleStextTrigger returns [EObject current=null] : (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) ;
    public final EObject ruleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject this_ReactionTrigger_0 = null;

        EObject this_DefaultTrigger_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2701:28: ( (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2702:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2702:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==EOF||(LA44_0>=RULE_ID && LA44_0<=RULE_STRING)||LA44_0==20||LA44_0==23||LA44_0==26||(LA44_0>=31 && LA44_0<=32)||LA44_0==53||LA44_0==55||LA44_0==60||(LA44_0>=89 && LA44_0<=91)) ) {
                alt44=1;
            }
            else if ( ((LA44_0>=47 && LA44_0<=48)) ) {
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2703:2: this_ReactionTrigger_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getReactionTriggerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5942);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2716:2: this_DefaultTrigger_1= ruleDefaultTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getDefaultTriggerParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5972);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2735:1: entryRuleDefaultTrigger returns [EObject current=null] : iv_ruleDefaultTrigger= ruleDefaultTrigger EOF ;
    public final EObject entryRuleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2736:2: (iv_ruleDefaultTrigger= ruleDefaultTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2737:2: iv_ruleDefaultTrigger= ruleDefaultTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger6007);
            iv_ruleDefaultTrigger=ruleDefaultTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultTrigger6017); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2744:1: ruleDefaultTrigger returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2747:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2748:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2748:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2748:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2748:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2749:2: 
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2757:2: (otherlv_1= 'default' | otherlv_2= 'else' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==47) ) {
                alt45=1;
            }
            else if ( (LA45_0==48) ) {
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2757:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleDefaultTrigger6067); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultTriggerAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2762:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleDefaultTrigger6085); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2774:1: entryRuleTransitionProperty returns [EObject current=null] : iv_ruleTransitionProperty= ruleTransitionProperty EOF ;
    public final EObject entryRuleTransitionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionProperty = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2775:2: (iv_ruleTransitionProperty= ruleTransitionProperty EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2776:2: iv_ruleTransitionProperty= ruleTransitionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionProperty_in_entryRuleTransitionProperty6122);
            iv_ruleTransitionProperty=ruleTransitionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionProperty6132); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2783:1: ruleTransitionProperty returns [EObject current=null] : (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) ;
    public final EObject ruleTransitionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_EntryPointSpec_0 = null;

        EObject this_ExitPointSpec_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2786:28: ( (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2787:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2787:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==56) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_ID) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2788:2: this_EntryPointSpec_0= ruleEntryPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionPropertyAccess().getEntryPointSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryPointSpec_in_ruleTransitionProperty6182);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2801:2: this_ExitPointSpec_1= ruleExitPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionPropertyAccess().getExitPointSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitPointSpec_in_ruleTransitionProperty6212);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2820:1: entryRuleEntryPointSpec returns [EObject current=null] : iv_ruleEntryPointSpec= ruleEntryPointSpec EOF ;
    public final EObject entryRuleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2821:2: (iv_ruleEntryPointSpec= ruleEntryPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2822:2: iv_ruleEntryPointSpec= ruleEntryPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec6247);
            iv_ruleEntryPointSpec=ruleEntryPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryPointSpec6257); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2829:1: ruleEntryPointSpec returns [EObject current=null] : (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_entrypoint_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2832:28: ( (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2833:1: (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2833:1: (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2833:3: otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleEntryPointSpec6294); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntryPointSpecAccess().getGreaterThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2837:1: ( (lv_entrypoint_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2838:1: (lv_entrypoint_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2838:1: (lv_entrypoint_1_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2839:3: lv_entrypoint_1_0= RULE_ID
            {
            lv_entrypoint_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntryPointSpec6311); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2863:1: entryRuleExitPointSpec returns [EObject current=null] : iv_ruleExitPointSpec= ruleExitPointSpec EOF ;
    public final EObject entryRuleExitPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2864:2: (iv_ruleExitPointSpec= ruleExitPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2865:2: iv_ruleExitPointSpec= ruleExitPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec6352);
            iv_ruleExitPointSpec=ruleExitPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitPointSpec6362); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2872:1: ruleExitPointSpec returns [EObject current=null] : ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' ) ;
    public final EObject ruleExitPointSpec() throws RecognitionException {
        EObject current = null;

        Token lv_exitpoint_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2875:28: ( ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2876:1: ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2876:1: ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2876:2: ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2876:2: ( (lv_exitpoint_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2877:1: (lv_exitpoint_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2877:1: (lv_exitpoint_0_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2878:3: lv_exitpoint_0_0= RULE_ID
            {
            lv_exitpoint_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExitPointSpec6404); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleExitPointSpec6421); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2908:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2909:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2910:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec6459);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularEventSpec6469); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2917:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2920:28: ( ( (lv_event_0_0= ruleFeatureCall ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2921:1: ( (lv_event_0_0= ruleFeatureCall ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2921:1: ( (lv_event_0_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2922:1: (lv_event_0_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2922:1: (lv_event_0_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2923:3: lv_event_0_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec6514);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2947:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2948:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2949:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec6549);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeEventSpec6559); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2956:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_value_1_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2959:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2960:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2960:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2960:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2960:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2961:1: (lv_type_0_0= ruleTimeEventType )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2961:1: (lv_type_0_0= ruleTimeEventType )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2962:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec6605);
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2978:2: ( (lv_value_1_0= ruleConditionalExpression ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2979:1: (lv_value_1_0= ruleConditionalExpression )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2979:1: (lv_value_1_0= ruleConditionalExpression )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2980:3: lv_value_1_0= ruleConditionalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getValueConditionalExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec6626);
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2996:2: ( (lv_unit_2_0= ruleTimeUnit ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2997:1: (lv_unit_2_0= ruleTimeUnit )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2997:1: (lv_unit_2_0= ruleTimeUnit )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2998:3: lv_unit_2_0= ruleTimeUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec6647);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3022:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3023:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3024:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec6683);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinEventSpec6693); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3031:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_AlwaysEvent_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3034:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3035:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3035:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt47=1;
                }
                break;
            case 29:
                {
                alt47=2;
                }
                break;
            case 49:
            case 50:
                {
                alt47=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3036:2: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec6743);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3049:2: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec6773);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3062:2: this_AlwaysEvent_2= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec6803);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3081:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3082:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3083:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent6838);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryEvent6848); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3090:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3093:28: ( ( () otherlv_1= 'entry' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3094:1: ( () otherlv_1= 'entry' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3094:1: ( () otherlv_1= 'entry' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3094:2: () otherlv_1= 'entry'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3094:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3095:2: 
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

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleEntryEvent6897); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3115:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3116:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3117:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent6933);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent6943); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3124:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3127:28: ( ( () otherlv_1= 'exit' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3128:1: ( () otherlv_1= 'exit' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3128:1: ( () otherlv_1= 'exit' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3128:2: () otherlv_1= 'exit'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3128:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3129:2: 
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

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleExitEvent6992); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3149:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3150:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3151:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent7028);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEvent7038); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3158:1: ruleAlwaysEvent returns [EObject current=null] : ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3161:28: ( ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3162:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3162:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3162:2: () (otherlv_1= 'always' | otherlv_2= 'oncycle' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3162:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3163:2: 
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3171:2: (otherlv_1= 'always' | otherlv_2= 'oncycle' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==49) ) {
                alt48=1;
            }
            else if ( (LA48_0==50) ) {
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3171:4: otherlv_1= 'always'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleAlwaysEvent7088); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAlwaysEventAccess().getAlwaysKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3176:7: otherlv_2= 'oncycle'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleAlwaysEvent7106); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3192:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3193:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3194:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression7147);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression7157); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3201:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3204:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3206:2: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpression7206);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3225:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3226:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3227:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression7240);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression7250); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3234:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3237:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3238:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3238:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3239:2: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression7300);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3250:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==18||(LA49_0>=77 && LA49_0<=86)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3250:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3250:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3251:2: 
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

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3259:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3260:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3260:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3261:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression7333);
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

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3277:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3278:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3278:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3279:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression7354);
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
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleConditionalExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3303:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3304:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3305:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression7392);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression7402); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3312:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3315:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3316:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3316:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3317:2: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression7452);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3328:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==57) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3328:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3328:2: ()
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3329:2: 
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

                    otherlv_2=(Token)match(input,57,FOLLOW_57_in_ruleConditionalExpression7476); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3341:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3342:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3342:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3343:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression7497);
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

                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleConditionalExpression7509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3363:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3364:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3364:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3365:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression7530);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3389:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3390:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3391:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression7568);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression7578); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3398:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3401:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3402:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3402:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3403:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression7628);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3414:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==58) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3414:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3414:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3415:2: 
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

            	    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleLogicalOrExpression7652); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3427:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3428:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3428:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3429:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression7673);
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3453:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3454:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3455:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression7711);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression7721); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3462:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3465:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3466:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3466:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3467:2: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7771);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3478:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==59) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3478:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3478:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3479:2: 
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

            	    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleLogicalAndExpression7795); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3491:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3492:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3492:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3493:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7816);
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleLogicalNotExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3517:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3518:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3519:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression7854);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNotExpression7864); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3526:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3529:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3530:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3530:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_STRING)||LA53_0==23||(LA53_0>=31 && LA53_0<=32)||LA53_0==53||(LA53_0>=89 && LA53_0<=91)) ) {
                alt53=1;
            }
            else if ( (LA53_0==60) ) {
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3531:2: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7914);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3543:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3543:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3543:7: () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3543:7: ()
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3544:2: 
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

                    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleLogicalNotExpression7944); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLogicalNotExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3556:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3557:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3557:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3558:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7965);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3582:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3583:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3584:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression8002);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression8012); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3591:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3594:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3595:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3595:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3596:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression8062);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3607:1: ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==61) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3607:2: () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3607:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3608:2: 
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

            	    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleBitwiseXorExpression8086); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3620:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3621:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3621:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3622:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression8107);
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
    // $ANTLR end "ruleBitwiseXorExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3646:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3647:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3648:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression8145);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression8155); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3655:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3658:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3659:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3659:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3660:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression8205);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3671:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==62) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3671:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3671:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3672:2: 
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

            	    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleBitwiseOrExpression8229); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3684:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3685:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3685:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3686:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression8250);
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
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3710:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3711:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3712:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression8288);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression8298); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3719:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3722:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3723:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3723:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3724:2: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression8348);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3735:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==63) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3735:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3735:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3736:2: 
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

            	    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleBitwiseAndExpression8372); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3748:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3749:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3749:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3750:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression8393);
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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleLogicalRelationExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3774:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3775:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3776:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression8431);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalRelationExpression8441); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3783:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3786:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3787:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3787:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3788:2: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression8491);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3799:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==56||(LA57_0>=92 && LA57_0<=96)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3799:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3799:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3800:2: 
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

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3808:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3809:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3809:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3810:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression8524);
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

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3826:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3827:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3827:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3828:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression8545);
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
    // $ANTLR end "ruleLogicalRelationExpression"


    // $ANTLR start "entryRuleShiftExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3852:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3853:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3854:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression8583);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression8593); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3861:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3864:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3865:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3865:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3866:2: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression8643);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3877:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=87 && LA58_0<=88)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3877:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3877:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3878:2: 
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

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3886:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3887:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3887:1: (lv_operator_2_0= ruleShiftOperator )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3888:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression8676);
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

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3904:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3905:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3905:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3906:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression8697);
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
            	    break loop58;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3930:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3931:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3932:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression8735);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression8745); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3939:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3942:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3943:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3943:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3944:2: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8795);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3955:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop59:
            do {
                int alt59=2;
                alt59 = dfa59.predict(input);
                switch (alt59) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3955:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3955:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3956:2: 
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

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3964:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3965:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3965:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3966:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression8828);
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

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3982:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3983:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3983:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3984:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8849);
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
    // $ANTLR end "ruleNumericalAddSubtractExpression"


    // $ANTLR start "entryRuleNumericalUnaryExpression"
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4008:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4009:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4010:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8887);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8897); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4017:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4020:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4021:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4021:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=RULE_ID && LA60_0<=RULE_STRING)||LA60_0==23||(LA60_0>=31 && LA60_0<=32)||LA60_0==53) ) {
                alt60=1;
            }
            else if ( ((LA60_0>=89 && LA60_0<=91)) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4022:2: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8947);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4034:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4034:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4034:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4034:7: ()
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4035:2: 
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

                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4043:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4044:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4044:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4045:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8986);
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

                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4061:2: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4062:1: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4062:1: (lv_operand_3_0= rulePrimaryExpression )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4063:3: lv_operand_3_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression9007);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4087:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4088:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4089:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression9044);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValueExpression9054); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4096:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4099:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4100:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4100:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4100:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4100:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4101:2: 
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4109:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4110:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4110:1: (lv_value_1_0= ruleLiteral )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4111:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression9112);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4135:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4136:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4137:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall9148);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall9158); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4144:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4147:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4148:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4148:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4149:2: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall9208);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4160:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==54) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4160:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4160:2: ()
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4161:2: 
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

            	    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleFeatureCall9232); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4173:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4174:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4174:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4175:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureCall9256); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4189:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt63=2;
            	    alt63 = dfa63.predict(input);
            	    switch (alt63) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4189:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4189:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4189:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4196:1: (lv_operationCall_4_0= '(' )
            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4197:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,23,FOLLOW_23_in_ruleFeatureCall9290); if (state.failed) return current;
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

            	            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4210:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt62=2;
            	            int LA62_0 = input.LA(1);

            	            if ( ((LA62_0>=RULE_ID && LA62_0<=RULE_STRING)||LA62_0==23||(LA62_0>=31 && LA62_0<=32)||LA62_0==53||LA62_0==60||(LA62_0>=89 && LA62_0<=91)) ) {
            	                alt62=1;
            	            }
            	            switch (alt62) {
            	                case 1 :
            	                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4210:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4210:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4211:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4211:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4212:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall9325);
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

            	                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4228:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop61:
            	                    do {
            	                        int alt61=2;
            	                        int LA61_0 = input.LA(1);

            	                        if ( (LA61_0==64) ) {
            	                            alt61=1;
            	                        }


            	                        switch (alt61) {
            	                    	case 1 :
            	                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4228:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,64,FOLLOW_64_in_ruleFeatureCall9338); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4232:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4233:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4233:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4234:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall9359);
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
            	                    	    break loop61;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleFeatureCall9375); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getFeatureCallAccess().getRightParenthesisKeyword_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4262:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4263:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4264:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression9415);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementReferenceExpression9425); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4271:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4274:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4275:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4275:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4275:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4275:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4276:2: 
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4284:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4285:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4285:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4286:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementReferenceExpression9486); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4300:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4300:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4300:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4300:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4307:1: (lv_operationCall_2_0= '(' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4308:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,23,FOLLOW_23_in_ruleElementReferenceExpression9520); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4321:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( ((LA66_0>=RULE_ID && LA66_0<=RULE_STRING)||LA66_0==23||(LA66_0>=31 && LA66_0<=32)||LA66_0==53||LA66_0==60||(LA66_0>=89 && LA66_0<=91)) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4321:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4321:3: ( (lv_args_3_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4322:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4322:1: (lv_args_3_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4323:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression9555);
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

                            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4339:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop65:
                            do {
                                int alt65=2;
                                int LA65_0 = input.LA(1);

                                if ( (LA65_0==64) ) {
                                    alt65=1;
                                }


                                switch (alt65) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4339:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,64,FOLLOW_64_in_ruleElementReferenceExpression9568); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4343:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4344:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4344:1: (lv_args_5_0= ruleExpression )
                            	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4345:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression9589);
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
                            	    break loop65;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleElementReferenceExpression9605); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4375:1: entryRuleActiveStateReferenceExpression returns [EObject current=null] : iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF ;
    public final EObject entryRuleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveStateReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4376:2: (iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4377:2: iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveStateReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression9645);
            iv_ruleActiveStateReferenceExpression=ruleActiveStateReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveStateReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression9655); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4384:1: ruleActiveStateReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4387:28: ( ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4388:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4388:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4388:2: () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4388:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4389:2: 
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

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleActiveStateReferenceExpression9704); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActiveStateReferenceExpressionAccess().getActiveKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleActiveStateReferenceExpression9716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActiveStateReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4405:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4406:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4406:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4407:3: ruleFQN
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
            pushFollow(FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9743);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleActiveStateReferenceExpression9755); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4435:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4436:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4437:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression9791);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression9801); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4444:1: ruleParenthesizedExpression returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4447:28: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4448:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4448:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4448:2: () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4448:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4449:2: 
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

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleParenthesizedExpression9850); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4461:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4462:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4462:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4463:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression9871);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleParenthesizedExpression9883); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4491:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4492:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4493:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral9919);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral9929); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4500:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_RealLiteral_3 = null;

        EObject this_StringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4503:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4504:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4504:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            int alt68=5;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt68=1;
                }
                break;
            case RULE_INT:
                {
                alt68=2;
                }
                break;
            case RULE_HEX:
                {
                alt68=3;
                }
                break;
            case RULE_FLOAT:
                {
                alt68=4;
                }
                break;
            case RULE_STRING:
                {
                alt68=5;
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4505:2: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral9979);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4518:2: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral10009);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4531:2: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexLiteral_in_ruleLiteral10039);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4544:2: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleLiteral10069);
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4557:2: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral10099);
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4576:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4577:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4578:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral10134);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral10144); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4585:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4588:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4589:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4589:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4589:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4589:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4590:2: 
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4598:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4599:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4599:1: (lv_value_1_0= RULE_BOOL )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4600:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral10198); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4624:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4625:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4626:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral10239);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral10249); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4633:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4636:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4637:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4637:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4637:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4637:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4638:2: 
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4646:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4647:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4647:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4648:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral10303); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4672:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4673:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4674:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral10344);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral10354); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4681:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4684:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4685:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4685:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4685:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4685:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4686:2: 
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4694:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4695:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4695:1: (lv_value_1_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4696:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleRealLiteral10408); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4720:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4721:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4722:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral10449);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexLiteral10459); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4729:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4732:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4733:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4733:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4733:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4733:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4734:2: 
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4742:2: ( (lv_value_1_0= RULE_HEX ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4743:1: (lv_value_1_0= RULE_HEX )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4743:1: (lv_value_1_0= RULE_HEX )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4744:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleHexLiteral10513); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4768:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4769:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4770:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral10554);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral10564); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4777:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4780:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4781:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4781:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4781:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4781:2: ()
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4782:2: 
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

            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4790:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4791:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4791:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4792:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral10618); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4816:1: ruleMultiplicativeOperator2 returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= ':' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator2() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4818:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= ':' ) | (enumLiteral_2= '%' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4819:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= ':' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4819:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= ':' ) | (enumLiteral_2= '%' ) )
            int alt69=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt69=1;
                }
                break;
            case 17:
                {
                alt69=2;
                }
                break;
            case 66:
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4819:2: (enumLiteral_0= '*' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4819:2: (enumLiteral_0= '*' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4819:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_65_in_ruleMultiplicativeOperator210673); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperator2Access().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperator2Access().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4825:6: (enumLiteral_1= ':' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4825:6: (enumLiteral_1= ':' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4825:8: enumLiteral_1= ':'
                    {
                    enumLiteral_1=(Token)match(input,17,FOLLOW_17_in_ruleMultiplicativeOperator210690); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperator2Access().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperator2Access().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4831:6: (enumLiteral_2= '%' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4831:6: (enumLiteral_2= '%' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4831:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_66_in_ruleMultiplicativeOperator210707); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4841:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4843:28: ( ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4844:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4844:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            int alt70=8;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt70=1;
                }
                break;
            case 68:
                {
                alt70=2;
                }
                break;
            case 69:
                {
                alt70=3;
                }
                break;
            case 70:
                {
                alt70=4;
                }
                break;
            case 71:
                {
                alt70=5;
                }
                break;
            case 72:
                {
                alt70=6;
                }
                break;
            case 73:
                {
                alt70=7;
                }
                break;
            case 74:
                {
                alt70=8;
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4844:2: (enumLiteral_0= '\\'none\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4844:2: (enumLiteral_0= '\\'none\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4844:4: enumLiteral_0= '\\'none\\''
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_67_in_ruleCombineOperator10752); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4850:6: (enumLiteral_1= '\\'+\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4850:6: (enumLiteral_1= '\\'+\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4850:8: enumLiteral_1= '\\'+\\''
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_68_in_ruleCombineOperator10769); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4856:6: (enumLiteral_2= '\\'*\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4856:6: (enumLiteral_2= '\\'*\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4856:8: enumLiteral_2= '\\'*\\''
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_69_in_ruleCombineOperator10786); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4862:6: (enumLiteral_3= '\\'max\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4862:6: (enumLiteral_3= '\\'max\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4862:8: enumLiteral_3= '\\'max\\''
                    {
                    enumLiteral_3=(Token)match(input,70,FOLLOW_70_in_ruleCombineOperator10803); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4868:6: (enumLiteral_4= '\\'min\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4868:6: (enumLiteral_4= '\\'min\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4868:8: enumLiteral_4= '\\'min\\''
                    {
                    enumLiteral_4=(Token)match(input,71,FOLLOW_71_in_ruleCombineOperator10820); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4874:6: (enumLiteral_5= '\\'or\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4874:6: (enumLiteral_5= '\\'or\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4874:8: enumLiteral_5= '\\'or\\''
                    {
                    enumLiteral_5=(Token)match(input,72,FOLLOW_72_in_ruleCombineOperator10837); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4880:6: (enumLiteral_6= '\\'and\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4880:6: (enumLiteral_6= '\\'and\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4880:8: enumLiteral_6= '\\'and\\''
                    {
                    enumLiteral_6=(Token)match(input,73,FOLLOW_73_in_ruleCombineOperator10854); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4886:6: (enumLiteral_7= '\\'host\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4886:6: (enumLiteral_7= '\\'host\\'' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4886:8: enumLiteral_7= '\\'host\\''
                    {
                    enumLiteral_7=(Token)match(input,74,FOLLOW_74_in_ruleCombineOperator10871); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4896:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4898:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4899:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4899:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt71=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt71=1;
                }
                break;
            case 41:
                {
                alt71=2;
                }
                break;
            case 42:
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4899:2: (enumLiteral_0= 'local' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4899:2: (enumLiteral_0= 'local' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4899:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleDirection10916); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4905:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4905:6: (enumLiteral_1= 'in' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4905:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_41_in_ruleDirection10933); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4911:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4911:6: (enumLiteral_2= 'out' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4911:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_42_in_ruleDirection10950); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4921:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4923:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4924:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4924:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==75) ) {
                alt72=1;
            }
            else if ( (LA72_0==76) ) {
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4924:2: (enumLiteral_0= 'after' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4924:2: (enumLiteral_0= 'after' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4924:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_75_in_ruleTimeEventType10995); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4930:6: (enumLiteral_1= 'every' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4930:6: (enumLiteral_1= 'every' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4930:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_76_in_ruleTimeEventType11012); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4940:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4942:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4943:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4943:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            int alt73=11;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt73=1;
                }
                break;
            case 77:
                {
                alt73=2;
                }
                break;
            case 78:
                {
                alt73=3;
                }
                break;
            case 79:
                {
                alt73=4;
                }
                break;
            case 80:
                {
                alt73=5;
                }
                break;
            case 81:
                {
                alt73=6;
                }
                break;
            case 82:
                {
                alt73=7;
                }
                break;
            case 83:
                {
                alt73=8;
                }
                break;
            case 84:
                {
                alt73=9;
                }
                break;
            case 85:
                {
                alt73=10;
                }
                break;
            case 86:
                {
                alt73=11;
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4943:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4943:2: (enumLiteral_0= '=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4943:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_18_in_ruleAssignmentOperator11057); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4949:6: (enumLiteral_1= '*=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4949:6: (enumLiteral_1= '*=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4949:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_77_in_ruleAssignmentOperator11074); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4955:6: (enumLiteral_2= '/=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4955:6: (enumLiteral_2= '/=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4955:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,78,FOLLOW_78_in_ruleAssignmentOperator11091); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4961:6: (enumLiteral_3= '%=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4961:6: (enumLiteral_3= '%=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4961:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,79,FOLLOW_79_in_ruleAssignmentOperator11108); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4967:6: (enumLiteral_4= '+=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4967:6: (enumLiteral_4= '+=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4967:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,80,FOLLOW_80_in_ruleAssignmentOperator11125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4973:6: (enumLiteral_5= '-=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4973:6: (enumLiteral_5= '-=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4973:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,81,FOLLOW_81_in_ruleAssignmentOperator11142); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4979:6: (enumLiteral_6= '<<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4979:6: (enumLiteral_6= '<<=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4979:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,82,FOLLOW_82_in_ruleAssignmentOperator11159); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4985:6: (enumLiteral_7= '>>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4985:6: (enumLiteral_7= '>>=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4985:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,83,FOLLOW_83_in_ruleAssignmentOperator11176); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4991:6: (enumLiteral_8= '&=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4991:6: (enumLiteral_8= '&=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4991:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,84,FOLLOW_84_in_ruleAssignmentOperator11193); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4997:6: (enumLiteral_9= '^=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4997:6: (enumLiteral_9= '^=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4997:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,85,FOLLOW_85_in_ruleAssignmentOperator11210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5003:6: (enumLiteral_10= '|=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5003:6: (enumLiteral_10= '|=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5003:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,86,FOLLOW_86_in_ruleAssignmentOperator11227); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5013:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5015:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5016:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5016:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==87) ) {
                alt74=1;
            }
            else if ( (LA74_0==88) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5016:2: (enumLiteral_0= '<<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5016:2: (enumLiteral_0= '<<' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5016:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_ruleShiftOperator11272); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5022:6: (enumLiteral_1= '>>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5022:6: (enumLiteral_1= '>>' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5022:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_88_in_ruleShiftOperator11289); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5032:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5034:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5035:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5035:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==89) ) {
                alt75=1;
            }
            else if ( (LA75_0==90) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5035:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5035:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5035:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_89_in_ruleAdditiveOperator11334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5041:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5041:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5041:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_90_in_ruleAdditiveOperator11351); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5053:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5055:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5056:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5056:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            int alt76=3;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt76=1;
                }
                break;
            case 90:
                {
                alt76=2;
                }
                break;
            case 91:
                {
                alt76=3;
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
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5056:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5056:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5056:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_89_in_ruleUnaryOperator11398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5062:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5062:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5062:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_90_in_ruleUnaryOperator11415); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5068:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5068:6: (enumLiteral_2= '~' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5068:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,91,FOLLOW_91_in_ruleUnaryOperator11432); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5078:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5080:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5081:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5081:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt77=6;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt77=1;
                }
                break;
            case 93:
                {
                alt77=2;
                }
                break;
            case 56:
                {
                alt77=3;
                }
                break;
            case 94:
                {
                alt77=4;
                }
                break;
            case 95:
                {
                alt77=5;
                }
                break;
            case 96:
                {
                alt77=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5081:2: (enumLiteral_0= '<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5081:2: (enumLiteral_0= '<' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5081:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_92_in_ruleRelationalOperator11477); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5087:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5087:6: (enumLiteral_1= '<=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5087:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_93_in_ruleRelationalOperator11494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5093:6: (enumLiteral_2= '>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5093:6: (enumLiteral_2= '>' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5093:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_56_in_ruleRelationalOperator11511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5099:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5099:6: (enumLiteral_3= '>=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5099:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,94,FOLLOW_94_in_ruleRelationalOperator11528); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5105:6: (enumLiteral_4= '==' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5105:6: (enumLiteral_4= '==' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5105:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,95,FOLLOW_95_in_ruleRelationalOperator11545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5111:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5111:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5111:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,96,FOLLOW_96_in_ruleRelationalOperator11562); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5121:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5123:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5124:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5124:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            int alt78=4;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt78=1;
                }
                break;
            case 98:
                {
                alt78=2;
                }
                break;
            case 99:
                {
                alt78=3;
                }
                break;
            case 100:
                {
                alt78=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5124:2: (enumLiteral_0= 's' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5124:2: (enumLiteral_0= 's' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5124:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_97_in_ruleTimeUnit11607); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5130:6: (enumLiteral_1= 'ms' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5130:6: (enumLiteral_1= 'ms' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5130:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,98,FOLLOW_98_in_ruleTimeUnit11624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5136:6: (enumLiteral_2= 'us' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5136:6: (enumLiteral_2= 'us' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5136:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,99,FOLLOW_99_in_ruleTimeUnit11641); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5142:6: (enumLiteral_3= 'ns' )
                    {
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5142:6: (enumLiteral_3= 'ns' )
                    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:5142:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,100,FOLLOW_100_in_ruleTimeUnit11658); if (state.failed) return current;
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

    // $ANTLR start synpred18_InternalSynctext
    public final void synpred18_InternalSynctext_fragment() throws RecognitionException {   
        EObject lv_trigger_3_0 = null;


        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:741:1: ( (lv_trigger_3_0= ruleReactionTrigger ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:741:1: (lv_trigger_3_0= ruleReactionTrigger )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:741:1: (lv_trigger_3_0= ruleReactionTrigger )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:742:3: lv_trigger_3_0= ruleReactionTrigger
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getLocalEntryReactionAccess().getTriggerReactionTriggerParserRuleCall_3_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleReactionTrigger_in_synpred18_InternalSynctext1564);
        lv_trigger_3_0=ruleReactionTrigger();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalSynctext

    // $ANTLR start synpred20_InternalSynctext
    public final void synpred20_InternalSynctext_fragment() throws RecognitionException {   
        EObject lv_trigger_4_0 = null;


        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:838:1: ( (lv_trigger_4_0= ruleReactionTrigger ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:838:1: (lv_trigger_4_0= ruleReactionTrigger )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:838:1: (lv_trigger_4_0= ruleReactionTrigger )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:839:3: lv_trigger_4_0= ruleReactionTrigger
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getLocalDuringReactionAccess().getTriggerReactionTriggerParserRuleCall_4_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleReactionTrigger_in_synpred20_InternalSynctext1772);
        lv_trigger_4_0=ruleReactionTrigger();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalSynctext

    // $ANTLR start synpred21_InternalSynctext
    public final void synpred21_InternalSynctext_fragment() throws RecognitionException {   
        EObject lv_trigger_3_0 = null;


        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:920:1: ( (lv_trigger_3_0= ruleReactionTrigger ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:920:1: (lv_trigger_3_0= ruleReactionTrigger )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:920:1: (lv_trigger_3_0= ruleReactionTrigger )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:921:3: lv_trigger_3_0= ruleReactionTrigger
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getLocalExitReactionAccess().getTriggerReactionTriggerParserRuleCall_3_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleReactionTrigger_in_synpred21_InternalSynctext1946);
        lv_trigger_3_0=ruleReactionTrigger();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalSynctext

    // $ANTLR start synpred23_InternalSynctext
    public final void synpred23_InternalSynctext_fragment() throws RecognitionException {   
        EObject lv_trigger_4_0 = null;


        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1017:1: ( (lv_trigger_4_0= ruleReactionTrigger ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1017:1: (lv_trigger_4_0= ruleReactionTrigger )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1017:1: (lv_trigger_4_0= ruleReactionTrigger )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1018:3: lv_trigger_4_0= ruleReactionTrigger
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getLocalSuspendReactionAccess().getTriggerReactionTriggerParserRuleCall_4_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleReactionTrigger_in_synpred23_InternalSynctext2154);
        lv_trigger_4_0=ruleReactionTrigger();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalSynctext

    // $ANTLR start synpred24_InternalSynctext
    public final void synpred24_InternalSynctext_fragment() throws RecognitionException {   
        Token lv_labelPriority_1_0=null;
        Token otherlv_2=null;

        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1070:3: ( ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1070:3: ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':'
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1070:3: ( (lv_labelPriority_1_0= RULE_INT ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1071:1: (lv_labelPriority_1_0= RULE_INT )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1071:1: (lv_labelPriority_1_0= RULE_INT )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1072:3: lv_labelPriority_1_0= RULE_INT
        {
        lv_labelPriority_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_synpred24_InternalSynctext2270); if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,17,FOLLOW_17_in_synpred24_InternalSynctext2287); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalSynctext

    // $ANTLR start synpred25_InternalSynctext
    public final void synpred25_InternalSynctext_fragment() throws RecognitionException {   
        Token lv_delay_3_0=null;

        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1093:1: ( (lv_delay_3_0= RULE_INT ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1093:1: (lv_delay_3_0= RULE_INT )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1093:1: (lv_delay_3_0= RULE_INT )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1094:3: lv_delay_3_0= RULE_INT
        {
        lv_delay_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_synpred25_InternalSynctext2306); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalSynctext

    // $ANTLR start synpred28_InternalSynctext
    public final void synpred28_InternalSynctext_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_actions_3_0 = null;


        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1176:3: ( ( ( ';' )=>otherlv_2= ';' ) ( (lv_actions_3_0= ruleExpression ) ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1176:3: ( ( ';' )=>otherlv_2= ';' ) ( (lv_actions_3_0= ruleExpression ) )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1176:3: ( ( ';' )=>otherlv_2= ';' )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1176:4: ( ';' )=>otherlv_2= ';'
        {
        otherlv_2=(Token)match(input,20,FOLLOW_20_in_synpred28_InternalSynctext2459); if (state.failed) return ;

        }

        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1181:2: ( (lv_actions_3_0= ruleExpression ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1182:1: (lv_actions_3_0= ruleExpression )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1182:1: (lv_actions_3_0= ruleExpression )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1183:3: lv_actions_3_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred28_InternalSynctext2481);
        lv_actions_3_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred28_InternalSynctext

    // $ANTLR start synpred29_InternalSynctext
    public final void synpred29_InternalSynctext_fragment() throws RecognitionException {   
        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1232:2: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1232:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1232:2: ()
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1233:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1241:2: ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1242:1: (lv_operator_2_0= ruleMultiplicativeOperator2 )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1242:1: (lv_operator_2_0= ruleMultiplicativeOperator2 )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1243:3: lv_operator_2_0= ruleMultiplicativeOperator2
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperator2EnumRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleMultiplicativeOperator2_in_synpred29_InternalSynctext2612);
        lv_operator_2_0=ruleMultiplicativeOperator2();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1259:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1260:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1260:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:1261:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_synpred29_InternalSynctext2633);
        lv_rightOperand_3_0=ruleNumericalUnaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred29_InternalSynctext

    // $ANTLR start synpred75_InternalSynctext
    public final void synpred75_InternalSynctext_fragment() throws RecognitionException {   
        EObject lv_trigger_1_0 = null;


        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2620:1: ( (lv_trigger_1_0= ruleStextTrigger ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2620:1: (lv_trigger_1_0= ruleStextTrigger )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2620:1: (lv_trigger_1_0= ruleStextTrigger )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:2621:3: lv_trigger_1_0= ruleStextTrigger
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerStextTriggerParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleStextTrigger_in_synpred75_InternalSynctext5772);
        lv_trigger_1_0=ruleStextTrigger();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred75_InternalSynctext

    // $ANTLR start synpred95_InternalSynctext
    public final void synpred95_InternalSynctext_fragment() throws RecognitionException {   
        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3955:2: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3955:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3955:2: ()
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3956:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3964:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3965:1: (lv_operator_2_0= ruleAdditiveOperator )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3965:1: (lv_operator_2_0= ruleAdditiveOperator )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3966:3: lv_operator_2_0= ruleAdditiveOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleAdditiveOperator_in_synpred95_InternalSynctext8828);
        lv_operator_2_0=ruleAdditiveOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3982:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3983:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3983:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:3984:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_synpred95_InternalSynctext8849);
        lv_rightOperand_3_0=ruleNumericalMultiplyDivideExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred95_InternalSynctext

    // $ANTLR start synpred100_InternalSynctext
    public final void synpred100_InternalSynctext_fragment() throws RecognitionException {   
        Token lv_operationCall_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;


        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4189:3: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4189:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4189:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4189:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4196:1: (lv_operationCall_4_0= '(' )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4197:3: lv_operationCall_4_0= '('
        {
        lv_operationCall_4_0=(Token)match(input,23,FOLLOW_23_in_synpred100_InternalSynctext9290); if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4210:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
        int alt86=2;
        int LA86_0 = input.LA(1);

        if ( ((LA86_0>=RULE_ID && LA86_0<=RULE_STRING)||LA86_0==23||(LA86_0>=31 && LA86_0<=32)||LA86_0==53||LA86_0==60||(LA86_0>=89 && LA86_0<=91)) ) {
            alt86=1;
        }
        switch (alt86) {
            case 1 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4210:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
                {
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4210:3: ( (lv_args_5_0= ruleExpression ) )
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4211:1: (lv_args_5_0= ruleExpression )
                {
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4211:1: (lv_args_5_0= ruleExpression )
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4212:3: lv_args_5_0= ruleExpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleExpression_in_synpred100_InternalSynctext9325);
                lv_args_5_0=ruleExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4228:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
                loop85:
                do {
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==64) ) {
                        alt85=1;
                    }


                    switch (alt85) {
                	case 1 :
                	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4228:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
                	    {
                	    otherlv_6=(Token)match(input,64,FOLLOW_64_in_synpred100_InternalSynctext9338); if (state.failed) return ;
                	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4232:1: ( (lv_args_7_0= ruleExpression ) )
                	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4233:1: (lv_args_7_0= ruleExpression )
                	    {
                	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4233:1: (lv_args_7_0= ruleExpression )
                	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4234:3: lv_args_7_0= ruleExpression
                	    {
                	    if ( state.backtracking==0 ) {
                	       
                	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
                	      	    
                	    }
                	    pushFollow(FOLLOW_ruleExpression_in_synpred100_InternalSynctext9359);
                	    lv_args_7_0=ruleExpression();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop85;
                    }
                } while (true);


                }
                break;

        }

        otherlv_8=(Token)match(input,24,FOLLOW_24_in_synpred100_InternalSynctext9375); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred100_InternalSynctext

    // $ANTLR start synpred105_InternalSynctext
    public final void synpred105_InternalSynctext_fragment() throws RecognitionException {   
        Token lv_operationCall_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;


        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4300:3: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4300:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4300:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4300:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
        {
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4307:1: (lv_operationCall_2_0= '(' )
        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4308:3: lv_operationCall_2_0= '('
        {
        lv_operationCall_2_0=(Token)match(input,23,FOLLOW_23_in_synpred105_InternalSynctext9520); if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4321:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
        int alt92=2;
        int LA92_0 = input.LA(1);

        if ( ((LA92_0>=RULE_ID && LA92_0<=RULE_STRING)||LA92_0==23||(LA92_0>=31 && LA92_0<=32)||LA92_0==53||LA92_0==60||(LA92_0>=89 && LA92_0<=91)) ) {
            alt92=1;
        }
        switch (alt92) {
            case 1 :
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4321:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                {
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4321:3: ( (lv_args_3_0= ruleExpression ) )
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4322:1: (lv_args_3_0= ruleExpression )
                {
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4322:1: (lv_args_3_0= ruleExpression )
                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4323:3: lv_args_3_0= ruleExpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleExpression_in_synpred105_InternalSynctext9555);
                lv_args_3_0=ruleExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4339:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                loop91:
                do {
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==64) ) {
                        alt91=1;
                    }


                    switch (alt91) {
                	case 1 :
                	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4339:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                	    {
                	    otherlv_4=(Token)match(input,64,FOLLOW_64_in_synpred105_InternalSynctext9568); if (state.failed) return ;
                	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4343:1: ( (lv_args_5_0= ruleExpression ) )
                	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4344:1: (lv_args_5_0= ruleExpression )
                	    {
                	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4344:1: (lv_args_5_0= ruleExpression )
                	    // ../de.cau.cs.kieler.yakindu.sccharts.model.stext/src-gen/de/cau/cs/kieler/yakindu/sccharts/model/stext/parser/antlr/internal/InternalSynctext.g:4345:3: lv_args_5_0= ruleExpression
                	    {
                	    if ( state.backtracking==0 ) {
                	       
                	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                	      	    
                	    }
                	    pushFollow(FOLLOW_ruleExpression_in_synpred105_InternalSynctext9589);
                	    lv_args_5_0=ruleExpression();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop91;
                    }
                } while (true);


                }
                break;

        }

        otherlv_6=(Token)match(input,24,FOLLOW_24_in_synpred105_InternalSynctext9605); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred105_InternalSynctext

    // Delegated rules

    public final boolean synpred28_InternalSynctext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalSynctext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalSynctext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalSynctext_fragment(); // can never throw exception
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
    public final boolean synpred20_InternalSynctext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalSynctext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred105_InternalSynctext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred105_InternalSynctext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalSynctext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalSynctext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalSynctext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalSynctext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred95_InternalSynctext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred95_InternalSynctext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred100_InternalSynctext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_InternalSynctext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_InternalSynctext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalSynctext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalSynctext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalSynctext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalSynctext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalSynctext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA67 dfa67 = new DFA67(this);
    static final String DFA2_eotS =
        "\15\uffff";
    static final String DFA2_eofS =
        "\15\uffff";
    static final String DFA2_minS =
        "\2\4\1\34\1\uffff\1\4\1\uffff\2\4\5\uffff";
    static final String DFA2_maxS =
        "\1\65\1\66\1\36\1\uffff\1\66\1\uffff\2\65\5\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\2\1\uffff\1\4\2\uffff\1\5\1\6\1\7\1\1\1\3";
    static final String DFA2_specialS =
        "\15\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\10\11\uffff\1\6\1\7\1\11\4\uffff\1\10\1\12\2\uffff\1\1\1"+
            "\uffff\1\2\1\3\1\4\1\5\5\uffff\22\10",
            "\1\10\14\uffff\1\13\44\uffff\1\10",
            "\1\3\1\uffff\1\5",
            "",
            "\1\10\14\uffff\1\14\44\uffff\1\10",
            "",
            "\1\10\12\uffff\1\7\1\11\4\uffff\1\10\3\uffff\1\10\3\uffff"+
            "\1\10\6\uffff\22\10",
            "\1\10\13\uffff\1\11\4\uffff\1\10\3\uffff\1\10\3\uffff\1\10"+
            "\6\uffff\22\10",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "135:1: (this_LocalEntryReaction_0= ruleLocalEntryReaction | this_LocalDuringReaction_1= ruleLocalDuringReaction | this_LocalExitReaction_2= ruleLocalExitReaction | this_LocalSuspendReaction_3= ruleLocalSuspendReaction | this_VariableDeclaration_4= ruleVariableDeclaration | this_SignalDeclaration_5= ruleSignalDeclaration | this_OperationDeclaration_6= ruleOperationDeclaration )";
        }
    }
    static final String DFA19_eotS =
        "\24\uffff";
    static final String DFA19_eofS =
        "\1\2\23\uffff";
    static final String DFA19_minS =
        "\1\4\1\0\22\uffff";
    static final String DFA19_maxS =
        "\1\133\1\0\22\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\20\uffff\1\1";
    static final String DFA19_specialS =
        "\1\uffff\1\0\22\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\2\1\1\4\2\12\uffff\1\2\2\uffff\1\2\2\uffff\1\2\4\uffff\2"+
            "\2\24\uffff\1\2\1\uffff\1\2\4\uffff\1\2\34\uffff\3\2",
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
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1070:2: ( ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_1 = input.LA(1);

                         
                        int index19_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalSynctext()) ) {s = 19;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index19_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA22_eotS =
        "\53\uffff";
    static final String DFA22_eofS =
        "\1\2\52\uffff";
    static final String DFA22_minS =
        "\1\4\1\0\51\uffff";
    static final String DFA22_maxS =
        "\1\133\1\0\51\uffff";
    static final String DFA22_acceptS =
        "\2\uffff\1\2\47\uffff\1\1";
    static final String DFA22_specialS =
        "\1\uffff\1\0\51\uffff}>";
    static final String[] DFA22_transitionS = {
            "\6\2\4\uffff\2\2\4\uffff\1\1\3\2\1\uffff\2\2\2\uffff\1\2\1"+
            "\uffff\2\2\3\uffff\22\2\1\uffff\1\2\4\uffff\1\2\34\uffff\3\2",
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
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "()* loopback of 1176:2: ( ( ( ';' )=>otherlv_2= ';' ) ( (lv_actions_3_0= ruleExpression ) ) )*";
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
                        if ( (synpred28_InternalSynctext()) ) {s = 42;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_1);
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
    static final String DFA23_eotS =
        "\115\uffff";
    static final String DFA23_eofS =
        "\1\1\114\uffff";
    static final String DFA23_minS =
        "\1\4\111\uffff\1\0\2\uffff";
    static final String DFA23_maxS =
        "\1\144\111\uffff\1\0\2\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\2\111\uffff\1\1\1\uffff";
    static final String DFA23_specialS =
        "\112\uffff\1\0\2\uffff}>";
    static final String[] DFA23_transitionS = {
            "\6\1\4\uffff\2\1\1\uffff\1\112\11\1\2\uffff\1\1\1\uffff\2\1"+
            "\3\uffff\22\1\1\uffff\12\1\2\113\12\uffff\30\1",
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

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "()* loopback of 1232:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator2 ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_74 = input.LA(1);

                         
                        int index23_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalSynctext()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_74);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\16\uffff";
    static final String DFA34_eofS =
        "\13\uffff\1\12\2\uffff";
    static final String DFA34_minS =
        "\5\4\1\uffff\2\4\3\uffff\3\4";
    static final String DFA34_maxS =
        "\1\133\4\66\1\uffff\1\140\1\66\3\uffff\1\133\1\65\1\140";
    static final String DFA34_acceptS =
        "\5\uffff\1\2\2\uffff\1\3\1\4\1\1\3\uffff";
    static final String DFA34_specialS =
        "\16\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\6\5\11\4\uffff\2\5\5\uffff\1\5\1\10\1\11\1\uffff\1\5\1\11"+
            "\2\uffff\1\5\1\uffff\2\11\3\uffff\3\5\1\4\1\1\1\2\1\3\12\5\1"+
            "\7\6\uffff\1\11\34\uffff\3\11",
            "\1\5\42\uffff\1\12\16\uffff\1\5",
            "\1\5\42\uffff\1\12\16\uffff\1\5",
            "\1\5\42\uffff\1\12\16\uffff\1\5",
            "\1\13\24\uffff\1\12\3\uffff\1\12\6\uffff\22\12\1\5",
            "",
            "\1\5\14\uffff\2\11\4\uffff\1\11\2\uffff\1\11\33\uffff\1\14"+
            "\1\uffff\4\11\1\uffff\3\11\1\uffff\2\11\12\uffff\16\11\1\uffff"+
            "\5\11",
            "\1\5\22\uffff\1\11\36\uffff\1\5",
            "",
            "",
            "",
            "\6\12\4\uffff\2\12\1\uffff\1\12\3\5\3\12\1\uffff\2\12\2\uffff"+
            "\1\12\1\uffff\2\12\3\uffff\22\12\6\uffff\1\12\34\uffff\3\12",
            "\1\15\24\uffff\1\5\3\uffff\1\5\6\uffff\22\5",
            "\1\5\14\uffff\2\11\4\uffff\1\11\2\uffff\1\11\33\uffff\1\14"+
            "\1\uffff\4\11\1\uffff\3\11\1\uffff\2\11\12\uffff\16\11\1\uffff"+
            "\5\11"
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "2083:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )";
        }
    }
    static final String DFA59_eotS =
        "\114\uffff";
    static final String DFA59_eofS =
        "\1\1\113\uffff";
    static final String DFA59_minS =
        "\1\4\103\uffff\2\0\6\uffff";
    static final String DFA59_maxS =
        "\1\144\103\uffff\2\0\6\uffff";
    static final String DFA59_acceptS =
        "\1\uffff\1\2\111\uffff\1\1";
    static final String DFA59_specialS =
        "\104\uffff\1\0\1\1\6\uffff}>";
    static final String[] DFA59_transitionS = {
            "\6\1\4\uffff\2\1\1\uffff\12\1\2\uffff\1\1\1\uffff\2\1\3\uffff"+
            "\22\1\1\uffff\12\1\14\uffff\14\1\1\104\1\105\12\1",
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
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "()* loopback of 3955:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_68 = input.LA(1);

                         
                        int index59_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalSynctext()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index59_68);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA59_69 = input.LA(1);

                         
                        int index59_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalSynctext()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index59_69);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA63_eotS =
        "\117\uffff";
    static final String DFA63_eofS =
        "\1\2\116\uffff";
    static final String DFA63_minS =
        "\1\4\1\0\115\uffff";
    static final String DFA63_maxS =
        "\1\144\1\0\115\uffff";
    static final String DFA63_acceptS =
        "\2\uffff\1\2\113\uffff\1\1";
    static final String DFA63_specialS =
        "\1\uffff\1\0\115\uffff}>";
    static final String[] DFA63_transitionS = {
            "\6\2\4\uffff\2\2\1\uffff\6\2\1\1\3\2\2\uffff\1\2\1\uffff\2"+
            "\2\3\uffff\37\2\12\uffff\30\2",
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
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "4189:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_1 = input.LA(1);

                         
                        int index63_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalSynctext()) ) {s = 78;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index63_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\117\uffff";
    static final String DFA67_eofS =
        "\1\2\116\uffff";
    static final String DFA67_minS =
        "\1\4\1\0\115\uffff";
    static final String DFA67_maxS =
        "\1\144\1\0\115\uffff";
    static final String DFA67_acceptS =
        "\2\uffff\1\2\113\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\115\uffff}>";
    static final String[] DFA67_transitionS = {
            "\6\2\4\uffff\2\2\1\uffff\6\2\1\1\3\2\2\uffff\1\2\1\uffff\2"+
            "\2\3\uffff\37\2\12\uffff\30\2",
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
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "4300:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_InternalSynctext()) ) {s = 78;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleStateScope_in_entryRuleStateScope81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateScope91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleStateScope149 = new BitSet(new long[]{0x003FFFF07A61C012L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalEntryReaction_in_ruleDeclaration246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDuringReaction_in_ruleDeclaration276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalExitReaction_in_ruleDeclaration306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalSuspendReaction_in_ruleDeclaration336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleDeclaration366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_ruleDeclaration396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleDeclaration426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDeclaration471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDefinition_in_ruleSignalDeclaration520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDefinition_in_entryRuleSignalDefinition554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDefinition564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSignalDefinition619 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleSignalDefinition651 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSignalDefinition677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalDefinition694 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_17_in_ruleSignalDefinition712 = new BitSet(new long[]{0x003FFFF02220C010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleSignalDefinition739 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_18_in_ruleSignalDefinition752 = new BitSet(new long[]{0x10200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSignalDefinition773 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleSignalDefinition788 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignalDefinition809 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSignalDefinition825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleVariableDefinition1019 = new BitSet(new long[]{0x003FFFF02220C010L});
    public static final BitSet FOLLOW_15_in_ruleVariableDefinition1051 = new BitSet(new long[]{0x003FFFF02220C010L});
    public static final BitSet FOLLOW_21_in_ruleVariableDefinition1083 = new BitSet(new long[]{0x003FFFF02220C010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleVariableDefinition1124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDefinition1141 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDefinition1159 = new BitSet(new long[]{0x10200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDefinition1180 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleVariableDefinition1195 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007F8L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleVariableDefinition1216 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleVariableDefinition1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition1266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDefinition1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOperationDefinition1325 = new BitSet(new long[]{0x003FFFF02220C010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition1352 = new BitSet(new long[]{0x003FFFF02220C010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleOperationDefinition1373 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOperationDefinition1385 = new BitSet(new long[]{0x003FFFF02220C010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition1412 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOperationDefinition1424 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOperationDefinition1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalEntryReaction_in_entryRuleLocalEntryReaction1472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalEntryReaction1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleLocalEntryReaction1531 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLocalEntryReaction1543 = new BitSet(new long[]{0x10200001848003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalEntryReaction1564 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleLocalEntryReaction1578 = new BitSet(new long[]{0x10200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalEntryReaction1599 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLocalEntryReaction1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDuringReaction_in_entryRuleLocalDuringReaction1648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalDuringReaction1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleLocalDuringReaction1713 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleLocalDuringReaction1739 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLocalDuringReaction1751 = new BitSet(new long[]{0x10200001848003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalDuringReaction1772 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleLocalDuringReaction1785 = new BitSet(new long[]{0x10200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalDuringReaction1806 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLocalDuringReaction1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalExitReaction_in_entryRuleLocalExitReaction1854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalExitReaction1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleLocalExitReaction1913 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLocalExitReaction1925 = new BitSet(new long[]{0x10200001848003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalExitReaction1946 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleLocalExitReaction1960 = new BitSet(new long[]{0x10200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalExitReaction1981 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLocalExitReaction1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalSuspendReaction_in_entryRuleLocalSuspendReaction2030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalSuspendReaction2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleLocalSuspendReaction2095 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleLocalSuspendReaction2121 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLocalSuspendReaction2133 = new BitSet(new long[]{0x10200001809003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalSuspendReaction2154 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLocalSuspendReaction2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger2205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionTrigger2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReactionTrigger2270 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleReactionTrigger2287 = new BitSet(new long[]{0x10200001808003F2L,0x000000000E000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReactionTrigger2306 = new BitSet(new long[]{0x10200001808003F2L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect2370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionEffect2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect2438 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleReactionEffect2459 = new BitSet(new long[]{0x10200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect2481 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression2519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression2579 = new BitSet(new long[]{0x0000000000020002L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator2_in_ruleNumericalMultiplyDivideExpression2612 = new BitSet(new long[]{0x00200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression2633 = new BitSet(new long[]{0x0000000000020002L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleValReferenceExpression_in_entryRuleValReferenceExpression2671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValReferenceExpression2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleValReferenceExpression2730 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleValReferenceExpression2742 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleValReferenceExpression2765 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rulePreReferenceExpression_in_ruleValReferenceExpression2784 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleValReferenceExpression2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreReferenceExpression_in_entryRulePreReferenceExpression2835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreReferenceExpression2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePreReferenceExpression2894 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePreReferenceExpression2906 = new BitSet(new long[]{0x0000000180000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePreReferenceExpression2929 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleValReferenceExpression_in_rulePreReferenceExpression2948 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rulePreReferenceExpression_in_rulePreReferenceExpression2967 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePreReferenceExpression2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValReferenceExpression_in_rulePrimaryExpression3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreReferenceExpression_in_rulePrimaryExpression3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRoot_in_entryRuleDefRoot3265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRoot3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_ruleDefRoot3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_ruleDefRoot3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_ruleDefRoot3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot3420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartRoot3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleStatechartRoot3467 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_entryRuleStateRoot3524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateRoot3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStateRoot3571 = new BitSet(new long[]{0x003FFFF07A61C010L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleStateRoot3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot3628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionRoot3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleTransitionRoot3675 = new BitSet(new long[]{0x10A18001848003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification3734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartSpecification3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleStatechartSpecification3794 = new BitSet(new long[]{0x003FFFF02220C010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleStatechartSpecification3815 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification3838 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateSpecification3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_ruleStateSpecification3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope4057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartScope4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStatechartScope4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_ruleStatechartScope4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope4184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScope4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleInterfaceScope4243 = new BitSet(new long[]{0x003FFFF02222C010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleInterfaceScope4264 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInterfaceScope4277 = new BitSet(new long[]{0x003FFFF07A61C010L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope4300 = new BitSet(new long[]{0x003FFFF07A61C012L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope4319 = new BitSet(new long[]{0x003FFFF07A61C012L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope4338 = new BitSet(new long[]{0x003FFFF07A61C012L});
    public static final BitSet FOLLOW_ruleInternalScope_in_entryRuleInternalScope4378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalScope4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleInternalScope4437 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInternalScope4449 = new BitSet(new long[]{0x103FFFF1FEE1C3F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInternalScope4472 = new BitSet(new long[]{0x103FFFF1FEE1C3F2L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInternalScope4491 = new BitSet(new long[]{0x103FFFF1FEE1C3F2L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInternalScope4510 = new BitSet(new long[]{0x103FFFF1FEE1C3F2L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleInternalScope4529 = new BitSet(new long[]{0x103FFFF1FEE1C3F2L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion4569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclarartion4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion4628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition4664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDefinition4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleEventDefinition4720 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleEventDefinition4733 = new BitSet(new long[]{0x003FFFF02220C010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleEventDefinition4754 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleEventDefinition4767 = new BitSet(new long[]{0x003FFFF02220C010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEventDefinition4794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDeclaration4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_entryRuleXID4932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXID4943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXID4983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleXID5007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleXID5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleXID5045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleXID5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXID5083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleXID5102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXID5121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXID5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXID5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXID5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXID5197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXID5216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXID5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleXID5254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleXID5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXID5292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXID5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXID5330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXID5349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXID5368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN5409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN5420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN5467 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleFQN5486 = new BitSet(new long[]{0x003FFFF02220C010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN5508 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction5557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReaction5567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReaction5613 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleLocalReaction5645 = new BitSet(new long[]{0x10200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalReaction5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction5704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionReaction5714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_ruleTransitionReaction5772 = new BitSet(new long[]{0x0080000004000002L});
    public static final BitSet FOLLOW_26_in_ruleTransitionReaction5786 = new BitSet(new long[]{0x10200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransitionReaction5807 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleTransitionReaction5822 = new BitSet(new long[]{0x0100000000000012L});
    public static final BitSet FOLLOW_ruleTransitionProperty_in_ruleTransitionReaction5843 = new BitSet(new long[]{0x0100000000000012L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStextTrigger5892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger6007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultTrigger6017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDefaultTrigger6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDefaultTrigger6085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionProperty_in_entryRuleTransitionProperty6122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionProperty6132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_ruleTransitionProperty6182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_ruleTransitionProperty6212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec6247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryPointSpec6257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleEntryPointSpec6294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntryPointSpec6311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec6352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitPointSpec6362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExitPointSpec6404 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleExitPointSpec6421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec6459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularEventSpec6469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec6514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec6549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeEventSpec6559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec6605 = new BitSet(new long[]{0x10200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec6626 = new BitSet(new long[]{0x0000000000000000L,0x0000001E00000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec6647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec6683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinEventSpec6693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec6743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec6773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec6803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent6838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryEvent6848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleEntryEvent6897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent6933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent6943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleExitEvent6992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent7028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEvent7038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleAlwaysEvent7088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAlwaysEvent7106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression7147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression7157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpression7206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression7240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression7250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression7300 = new BitSet(new long[]{0x0000000000040002L,0x00000000007FE000L});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression7333 = new BitSet(new long[]{0x10200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression7354 = new BitSet(new long[]{0x0000000000040002L,0x00000000007FE000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression7392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression7402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression7452 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleConditionalExpression7476 = new BitSet(new long[]{0x10200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression7497 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleConditionalExpression7509 = new BitSet(new long[]{0x10200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression7530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression7568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression7578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression7628 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleLogicalOrExpression7652 = new BitSet(new long[]{0x10200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression7673 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression7711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression7721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7771 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleLogicalAndExpression7795 = new BitSet(new long[]{0x10200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7816 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression7854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNotExpression7864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleLogicalNotExpression7944 = new BitSet(new long[]{0x00200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression8002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression8012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression8062 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleBitwiseXorExpression8086 = new BitSet(new long[]{0x00200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression8107 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression8145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression8155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression8205 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleBitwiseOrExpression8229 = new BitSet(new long[]{0x00200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression8250 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression8288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression8298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression8348 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleBitwiseAndExpression8372 = new BitSet(new long[]{0x00200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression8393 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression8431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalRelationExpression8441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression8491 = new BitSet(new long[]{0x0100000000000002L,0x00000001F0000000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression8524 = new BitSet(new long[]{0x00200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression8545 = new BitSet(new long[]{0x0100000000000002L,0x00000001F0000000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression8583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression8593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression8643 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression8676 = new BitSet(new long[]{0x00200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression8697 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression8735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression8745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8795 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression8828 = new BitSet(new long[]{0x00200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8849 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8986 = new BitSet(new long[]{0x00200001808003F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression9007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression9044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValueExpression9054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression9112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall9148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall9158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall9208 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleFeatureCall9232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureCall9256 = new BitSet(new long[]{0x0040000000800002L});
    public static final BitSet FOLLOW_23_in_ruleFeatureCall9290 = new BitSet(new long[]{0x10200001818003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall9325 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleFeatureCall9338 = new BitSet(new long[]{0x10200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall9359 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_24_in_ruleFeatureCall9375 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression9415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementReferenceExpression9425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementReferenceExpression9486 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleElementReferenceExpression9520 = new BitSet(new long[]{0x10200001818003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression9555 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleElementReferenceExpression9568 = new BitSet(new long[]{0x10200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression9589 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_24_in_ruleElementReferenceExpression9605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression9645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression9655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleActiveStateReferenceExpression9704 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleActiveStateReferenceExpression9716 = new BitSet(new long[]{0x003FFFF02220C010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9743 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleActiveStateReferenceExpression9755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression9791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression9801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleParenthesizedExpression9850 = new BitSet(new long[]{0x10200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression9871 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleParenthesizedExpression9883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral9919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral9929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral9979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral10009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_ruleLiteral10039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleLiteral10069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral10099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral10134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral10144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral10198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral10239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral10249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral10303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral10344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral10354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRealLiteral10408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral10449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexLiteral10459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleHexLiteral10513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral10554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral10564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral10618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleMultiplicativeOperator210673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleMultiplicativeOperator210690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleMultiplicativeOperator210707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleCombineOperator10752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCombineOperator10769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCombineOperator10786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleCombineOperator10803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleCombineOperator10820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleCombineOperator10837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleCombineOperator10854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleCombineOperator10871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleDirection10916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDirection10933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDirection10950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleTimeEventType10995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleTimeEventType11012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAssignmentOperator11057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAssignmentOperator11074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleAssignmentOperator11091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleAssignmentOperator11108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleAssignmentOperator11125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleAssignmentOperator11142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleAssignmentOperator11159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleAssignmentOperator11176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleAssignmentOperator11193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleAssignmentOperator11210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleAssignmentOperator11227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleShiftOperator11272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleShiftOperator11289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleAdditiveOperator11334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleAdditiveOperator11351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleUnaryOperator11398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleUnaryOperator11415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleUnaryOperator11432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleRelationalOperator11477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleRelationalOperator11494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleRelationalOperator11511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleRelationalOperator11528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleRelationalOperator11545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleRelationalOperator11562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleTimeUnit11607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleTimeUnit11624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleTimeUnit11641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleTimeUnit11658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_synpred18_InternalSynctext1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_synpred20_InternalSynctext1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_synpred21_InternalSynctext1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_synpred23_InternalSynctext2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_synpred24_InternalSynctext2270 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_synpred24_InternalSynctext2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_synpred25_InternalSynctext2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_synpred28_InternalSynctext2459 = new BitSet(new long[]{0x10200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred28_InternalSynctext2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator2_in_synpred29_InternalSynctext2612 = new BitSet(new long[]{0x00200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_synpred29_InternalSynctext2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_synpred75_InternalSynctext5772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_synpred95_InternalSynctext8828 = new BitSet(new long[]{0x00200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_synpred95_InternalSynctext8849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred100_InternalSynctext9290 = new BitSet(new long[]{0x10200001818003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred100_InternalSynctext9325 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_synpred100_InternalSynctext9338 = new BitSet(new long[]{0x10200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred100_InternalSynctext9359 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_24_in_synpred100_InternalSynctext9375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred105_InternalSynctext9520 = new BitSet(new long[]{0x10200001818003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred105_InternalSynctext9555 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_synpred105_InternalSynctext9568 = new BitSet(new long[]{0x10200001808003F0L,0x000000000E000000L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred105_InternalSynctext9589 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_24_in_synpred105_InternalSynctext9605 = new BitSet(new long[]{0x0000000000000002L});

}