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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_FLOAT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'input'", "'output'", "'signal'", "':'", "'='", "'with'", "';'", "'variable'", "'extern'", "'('", "')'", "'/'", "'Suspend'", "'Entry'", "'During'", "'Exit'", "','", "'pre'", "'@@statechart@@'", "'@@state@@'", "'@@transition@@'", "'namespace'", "'interface'", "'internal'", "'event'", "'local'", "'in'", "'out'", "'var'", "'readonly'", "'external'", "'operation'", "'default'", "'else'", "'entry'", "'exit'", "'always'", "'oncycle'", "'raise'", "'valueof'", "'active'", "'.'", "'#'", "'>'", "'?'", "'||'", "'&&'", "'!'", "'^'", "'|'", "'&'", "'\\'none\\''", "'\\'+\\''", "'\\'*\\''", "'\\'max\\''", "'\\'min\\''", "'\\'or\\''", "'\\'and\\''", "'\\'host\\''", "'after'", "'every'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'%'", "'~'", "'<'", "'<='", "'>='", "'=='", "'!='", "'s'", "'ms'", "'us'", "'ns'"
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
    public String getGrammarFileName() { return "../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g"; }



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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:68:1: entryRuleStateScope returns [EObject current=null] : iv_ruleStateScope= ruleStateScope EOF ;
    public final EObject entryRuleStateScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:69:2: (iv_ruleStateScope= ruleStateScope EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:70:2: iv_ruleStateScope= ruleStateScope EOF
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:77:1: ruleStateScope returns [EObject current=null] : ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* ) ;
    public final EObject ruleStateScope() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_1_1 = null;

        EObject lv_declarations_1_2 = null;

        EObject lv_declarations_1_3 = null;

        EObject lv_declarations_1_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:80:28: ( ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:81:1: ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:81:1: ( () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:81:2: () ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:81:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:82:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStateScopeAccess().getSimpleScopeAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:87:2: ( ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_INT||(LA2_0>=14 && LA2_0<=16)||(LA2_0>=21 && LA2_0<=22)||LA2_0==25||(LA2_0>=27 && LA2_0<=29)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:88:1: ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:88:1: ( (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:89:1: (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:89:1: (lv_declarations_1_1= ruleVariableDeclaration | lv_declarations_1_2= ruleSignalDeclaration | lv_declarations_1_3= ruleOperationDeclaration | lv_declarations_1_4= ruleLocalReaction )
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
            	    case RULE_INT:
            	    case 25:
            	    case 27:
            	    case 28:
            	    case 29:
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:90:3: lv_declarations_1_1= ruleVariableDeclaration
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:105:8: lv_declarations_1_2= ruleSignalDeclaration
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:120:8: lv_declarations_1_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleStateScope180);
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:135:8: lv_declarations_1_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsLocalReactionParserRuleCall_1_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleStateScope199);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:161:1: entryRuleSignalDeclaration returns [EObject current=null] : iv_ruleSignalDeclaration= ruleSignalDeclaration EOF ;
    public final EObject entryRuleSignalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:162:2: (iv_ruleSignalDeclaration= ruleSignalDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:163:2: iv_ruleSignalDeclaration= ruleSignalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration239);
            iv_ruleSignalDeclaration=ruleSignalDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalDeclaration249); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:170:1: ruleSignalDeclaration returns [EObject current=null] : this_SignalDefinition_0= ruleSignalDefinition ;
    public final EObject ruleSignalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_SignalDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:173:28: (this_SignalDefinition_0= ruleSignalDefinition )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:175:5: this_SignalDefinition_0= ruleSignalDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSignalDeclarationAccess().getSignalDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleSignalDefinition_in_ruleSignalDeclaration295);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:191:1: entryRuleSignalDefinition returns [EObject current=null] : iv_ruleSignalDefinition= ruleSignalDefinition EOF ;
    public final EObject entryRuleSignalDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:192:2: (iv_ruleSignalDefinition= ruleSignalDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:193:2: iv_ruleSignalDefinition= ruleSignalDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignalDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleSignalDefinition_in_entryRuleSignalDefinition329);
            iv_ruleSignalDefinition=ruleSignalDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignalDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalDefinition339); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:200:1: ruleSignalDefinition returns [EObject current=null] : ( () ( (lv_Input_1_0= 'input' ) )? ( (lv_Output_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:203:28: ( ( () ( (lv_Input_1_0= 'input' ) )? ( (lv_Output_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:204:1: ( () ( (lv_Input_1_0= 'input' ) )? ( (lv_Output_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:204:1: ( () ( (lv_Input_1_0= 'input' ) )? ( (lv_Output_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:204:2: () ( (lv_Input_1_0= 'input' ) )? ( (lv_Output_2_0= 'output' ) )? otherlv_3= 'signal' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )? otherlv_11= ';'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:204:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:205:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSignalDefinitionAccess().getEventDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:210:2: ( (lv_Input_1_0= 'input' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:211:1: (lv_Input_1_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:211:1: (lv_Input_1_0= 'input' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:212:3: lv_Input_1_0= 'input'
                    {
                    lv_Input_1_0=(Token)match(input,14,FOLLOW_14_in_ruleSignalDefinition391); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:225:3: ( (lv_Output_2_0= 'output' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:226:1: (lv_Output_2_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:226:1: (lv_Output_2_0= 'output' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:227:3: lv_Output_2_0= 'output'
                    {
                    lv_Output_2_0=(Token)match(input,15,FOLLOW_15_in_ruleSignalDefinition423); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSignalDefinition449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSignalDefinitionAccess().getSignalKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:244:1: ( (lv_name_4_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:245:1: (lv_name_4_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:245:1: (lv_name_4_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:246:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalDefinition466); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:262:2: (otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:262:4: otherlv_5= ':' ( ( ruleFQN ) ) (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )?
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleSignalDefinition484); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSignalDefinitionAccess().getColonKeyword_5_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:266:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:267:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:267:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:268:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSignalDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignalDefinitionAccess().getTypeTypeCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleSignalDefinition507);
                    ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:281:2: (otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==18) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:281:4: otherlv_7= '=' ( (lv_varInitialValue_8_0= ruleExpression ) )
                            {
                            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleSignalDefinition520); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getSignalDefinitionAccess().getEqualsSignKeyword_5_2_0());
                                  
                            }
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:285:1: ( (lv_varInitialValue_8_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:286:1: (lv_varInitialValue_8_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:286:1: (lv_varInitialValue_8_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:287:3: lv_varInitialValue_8_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSignalDefinitionAccess().getVarInitialValueExpressionParserRuleCall_5_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleSignalDefinition541);
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

                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:303:4: (otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==19) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:303:6: otherlv_9= 'with' ( (lv_varCombineOperator_10_0= ruleCombineOperator ) )
                            {
                            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleSignalDefinition556); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getSignalDefinitionAccess().getWithKeyword_5_3_0());
                                  
                            }
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:307:1: ( (lv_varCombineOperator_10_0= ruleCombineOperator ) )
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:308:1: (lv_varCombineOperator_10_0= ruleCombineOperator )
                            {
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:308:1: (lv_varCombineOperator_10_0= ruleCombineOperator )
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:309:3: lv_varCombineOperator_10_0= ruleCombineOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSignalDefinitionAccess().getVarCombineOperatorCombineOperatorEnumRuleCall_5_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignalDefinition577);
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

            otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleSignalDefinition593); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:337:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:338:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:339:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition629);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition639); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:346:1: ruleVariableDefinition returns [EObject current=null] : ( () otherlv_1= 'variable' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:349:28: ( ( () otherlv_1= 'variable' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:350:1: ( () otherlv_1= 'variable' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:350:1: ( () otherlv_1= 'variable' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:350:2: () otherlv_1= 'variable' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:350:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:351:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleVariableDefinition685); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableDefinitionAccess().getVariableKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:360:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:361:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:361:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:362:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDefinition702); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleVariableDefinition719); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:390:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:391:2: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:392:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition755);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDefinition765); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:399:1: ruleOperationDefinition returns [EObject current=null] : ( () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';' ) ;
    public final EObject ruleOperationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:402:28: ( ( () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:403:1: ( () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:403:1: ( () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:403:2: () otherlv_1= 'extern' ( ( ruleFQN ) ) ( (lv_name_3_0= ruleXID ) ) otherlv_4= '(' ( ( ruleFQN ) ) otherlv_6= ')' otherlv_7= ';'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:403:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:404:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationDefinitionAccess().getOperationDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleOperationDefinition811); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionAccess().getExternKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:413:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:414:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:414:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:415:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getFunctionTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition834);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:428:2: ( (lv_name_3_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:429:1: (lv_name_3_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:429:1: (lv_name_3_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:430:3: lv_name_3_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getNameXIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleOperationDefinition855);
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

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleOperationDefinition867); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:450:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:451:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:451:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:452:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParamTypeTypeCrossReference_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition890);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleOperationDefinition902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleOperationDefinition914); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:481:1: entryRuleLocalReaction returns [EObject current=null] : iv_ruleLocalReaction= ruleLocalReaction EOF ;
    public final EObject entryRuleLocalReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:482:2: (iv_ruleLocalReaction= ruleLocalReaction EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:483:2: iv_ruleLocalReaction= ruleLocalReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction950);
            iv_ruleLocalReaction=ruleLocalReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReaction960); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:490:1: ruleLocalReaction returns [EObject current=null] : ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:493:28: ( ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:494:1: ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:494:1: ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:494:2: ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:494:2: ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||(LA9_0>=27 && LA9_0<=29)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:495:1: ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:495:1: ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:496:1: (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:496:1: (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=27 && LA8_0<=29)) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==RULE_INT) ) {
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
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:497:3: lv_trigger_0_1= ruleLocalReactionTrigger
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerLocalReactionTriggerParserRuleCall_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleLocalReactionTrigger_in_ruleLocalReaction1008);
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
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:512:8: lv_trigger_0_2= ruleReactionTrigger
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerReactionTriggerParserRuleCall_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReaction1027);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:530:3: (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:530:5: otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) )
            {
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleLocalReaction1044); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalReactionAccess().getSolidusKeyword_1_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:534:1: ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:535:1: ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:535:1: ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:536:1: (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:536:1: (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)||LA10_0==23||LA10_0==31||(LA10_0>=53 && LA10_0<=54)||LA10_0==61||(LA10_0>=87 && LA10_0<=88)||LA10_0==91) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:537:3: lv_effect_2_1= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectReactionEffectParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalReaction1067);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:552:8: lv_effect_2_2= ruleSuspendEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectSuspendEffectParserRuleCall_1_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSuspendEffect_in_ruleLocalReaction1086);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleLocalReaction1102); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:582:1: entryRuleSuspendEffect returns [EObject current=null] : iv_ruleSuspendEffect= ruleSuspendEffect EOF ;
    public final EObject entryRuleSuspendEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspendEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:583:2: (iv_ruleSuspendEffect= ruleSuspendEffect EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:584:2: iv_ruleSuspendEffect= ruleSuspendEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuspendEffectRule()); 
            }
            pushFollow(FOLLOW_ruleSuspendEffect_in_entryRuleSuspendEffect1138);
            iv_ruleSuspendEffect=ruleSuspendEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuspendEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuspendEffect1148); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:591:1: ruleSuspendEffect returns [EObject current=null] : ( () otherlv_1= 'Suspend' ) ;
    public final EObject ruleSuspendEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:594:28: ( ( () otherlv_1= 'Suspend' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:595:1: ( () otherlv_1= 'Suspend' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:595:1: ( () otherlv_1= 'Suspend' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:595:2: () otherlv_1= 'Suspend'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:595:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:596:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSuspendEffectAccess().getSuspendEffectAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleSuspendEffect1194); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:613:1: entryRuleLocalReactionTrigger returns [EObject current=null] : iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF ;
    public final EObject entryRuleLocalReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:614:2: (iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:615:2: iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReactionTrigger_in_entryRuleLocalReactionTrigger1230);
            iv_ruleLocalReactionTrigger=ruleLocalReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReactionTrigger1240); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:622:1: ruleLocalReactionTrigger returns [EObject current=null] : ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? ) ;
    public final EObject ruleLocalReactionTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_stateReaction_1_0 = null;

        EObject lv_reactionTrigger_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:625:28: ( ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:626:1: ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:626:1: ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:626:2: () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )?
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:626:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:627:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:632:2: ( (lv_stateReaction_1_0= ruleStateReaction ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:633:1: (lv_stateReaction_1_0= ruleStateReaction )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:633:1: (lv_stateReaction_1_0= ruleStateReaction )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:634:3: lv_stateReaction_1_0= ruleStateReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getStateReactionStateReactionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateReaction_in_ruleLocalReactionTrigger1295);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:650:2: (otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:650:4: otherlv_2= ':' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )?
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleLocalReactionTrigger1308); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLocalReactionTriggerAccess().getColonKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:654:1: ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_INT) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:655:1: (lv_reactionTrigger_3_0= ruleReactionTrigger )
                            {
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:655:1: (lv_reactionTrigger_3_0= ruleReactionTrigger )
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:656:3: lv_reactionTrigger_3_0= ruleReactionTrigger
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getReactionTriggerReactionTriggerParserRuleCall_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReactionTrigger1329);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:680:1: entryRuleStateReaction returns [EObject current=null] : iv_ruleStateReaction= ruleStateReaction EOF ;
    public final EObject entryRuleStateReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:681:2: (iv_ruleStateReaction= ruleStateReaction EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:682:2: iv_ruleStateReaction= ruleStateReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateReactionRule()); 
            }
            pushFollow(FOLLOW_ruleStateReaction_in_entryRuleStateReaction1368);
            iv_ruleStateReaction=ruleStateReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateReaction1378); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:689:1: ruleStateReaction returns [EObject current=null] : (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit ) ;
    public final EObject ruleStateReaction() throws RecognitionException {
        EObject current = null;

        EObject this_Entry_0 = null;

        EObject this_Inside_1 = null;

        EObject this_Exit_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:692:28: ( (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:693:1: (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:693:1: (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit )
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:694:5: this_Entry_0= ruleEntry
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getEntryParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntry_in_ruleStateReaction1425);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:704:5: this_Inside_1= ruleInside
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getInsideParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInside_in_ruleStateReaction1452);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:714:5: this_Exit_2= ruleExit
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getExitParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExit_in_ruleStateReaction1479);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:730:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:731:2: (iv_ruleEntry= ruleEntry EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:732:2: iv_ruleEntry= ruleEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryRule()); 
            }
            pushFollow(FOLLOW_ruleEntry_in_entryRuleEntry1514);
            iv_ruleEntry=ruleEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntry1524); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:739:1: ruleEntry returns [EObject current=null] : ( () otherlv_1= 'Entry' ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:742:28: ( ( () otherlv_1= 'Entry' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:743:1: ( () otherlv_1= 'Entry' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:743:1: ( () otherlv_1= 'Entry' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:743:2: () otherlv_1= 'Entry'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:743:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:744:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryAccess().getEntryAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleEntry1570); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:761:1: entryRuleInside returns [EObject current=null] : iv_ruleInside= ruleInside EOF ;
    public final EObject entryRuleInside() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInside = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:762:2: (iv_ruleInside= ruleInside EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:763:2: iv_ruleInside= ruleInside EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsideRule()); 
            }
            pushFollow(FOLLOW_ruleInside_in_entryRuleInside1606);
            iv_ruleInside=ruleInside();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInside; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInside1616); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:770:1: ruleInside returns [EObject current=null] : ( () otherlv_1= 'During' ) ;
    public final EObject ruleInside() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:773:28: ( ( () otherlv_1= 'During' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:774:1: ( () otherlv_1= 'During' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:774:1: ( () otherlv_1= 'During' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:774:2: () otherlv_1= 'During'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:774:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:775:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInsideAccess().getInsideAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleInside1662); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:792:1: entryRuleExit returns [EObject current=null] : iv_ruleExit= ruleExit EOF ;
    public final EObject entryRuleExit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExit = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:793:2: (iv_ruleExit= ruleExit EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:794:2: iv_ruleExit= ruleExit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitRule()); 
            }
            pushFollow(FOLLOW_ruleExit_in_entryRuleExit1698);
            iv_ruleExit=ruleExit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExit1708); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:801:1: ruleExit returns [EObject current=null] : ( () otherlv_1= 'Exit' ) ;
    public final EObject ruleExit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:804:28: ( ( () otherlv_1= 'Exit' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:805:1: ( () otherlv_1= 'Exit' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:805:1: ( () otherlv_1= 'Exit' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:805:2: () otherlv_1= 'Exit'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:805:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:806:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitAccess().getExitAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleExit1754); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:823:1: entryRuleReactionTrigger returns [EObject current=null] : iv_ruleReactionTrigger= ruleReactionTrigger EOF ;
    public final EObject entryRuleReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:824:2: (iv_ruleReactionTrigger= ruleReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:825:2: iv_ruleReactionTrigger= ruleReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1790);
            iv_ruleReactionTrigger=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionTrigger1800); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:832:1: ruleReactionTrigger returns [EObject current=null] : ( () ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_delay_3_0= RULE_INT ) )? ( ( (lv_trigger_4_0= ruleRegularEventSpec ) ) | (otherlv_5= '(' ( (lv_guardExpression_6_0= ruleExpression ) ) otherlv_7= ')' ) )? ) ;
    public final EObject ruleReactionTrigger() throws RecognitionException {
        EObject current = null;

        Token lv_labelPriority_1_0=null;
        Token otherlv_2=null;
        Token lv_delay_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_trigger_4_0 = null;

        EObject lv_guardExpression_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:835:28: ( ( () ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_delay_3_0= RULE_INT ) )? ( ( (lv_trigger_4_0= ruleRegularEventSpec ) ) | (otherlv_5= '(' ( (lv_guardExpression_6_0= ruleExpression ) ) otherlv_7= ')' ) )? ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:836:1: ( () ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_delay_3_0= RULE_INT ) )? ( ( (lv_trigger_4_0= ruleRegularEventSpec ) ) | (otherlv_5= '(' ( (lv_guardExpression_6_0= ruleExpression ) ) otherlv_7= ')' ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:836:1: ( () ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_delay_3_0= RULE_INT ) )? ( ( (lv_trigger_4_0= ruleRegularEventSpec ) ) | (otherlv_5= '(' ( (lv_guardExpression_6_0= ruleExpression ) ) otherlv_7= ')' ) )? )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:836:2: () ( (lv_labelPriority_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_delay_3_0= RULE_INT ) )? ( ( (lv_trigger_4_0= ruleRegularEventSpec ) ) | (otherlv_5= '(' ( (lv_guardExpression_6_0= ruleExpression ) ) otherlv_7= ')' ) )?
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:836:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:837:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:842:2: ( (lv_labelPriority_1_0= RULE_INT ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:843:1: (lv_labelPriority_1_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:843:1: (lv_labelPriority_1_0= RULE_INT )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:844:3: lv_labelPriority_1_0= RULE_INT
            {
            lv_labelPriority_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReactionTrigger1851); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleReactionTrigger1868); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getReactionTriggerAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:864:1: ( (lv_delay_3_0= RULE_INT ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:865:1: (lv_delay_3_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:865:1: (lv_delay_3_0= RULE_INT )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:866:3: lv_delay_3_0= RULE_INT
                    {
                    lv_delay_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReactionTrigger1885); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_delay_3_0, grammarAccess.getReactionTriggerAccess().getDelayINTTerminalRuleCall_3_0()); 
                      		
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:882:3: ( ( (lv_trigger_4_0= ruleRegularEventSpec ) ) | (otherlv_5= '(' ( (lv_guardExpression_6_0= ruleExpression ) ) otherlv_7= ')' ) )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==23) ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:882:4: ( (lv_trigger_4_0= ruleRegularEventSpec ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:882:4: ( (lv_trigger_4_0= ruleRegularEventSpec ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:883:1: (lv_trigger_4_0= ruleRegularEventSpec )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:883:1: (lv_trigger_4_0= ruleRegularEventSpec )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:884:3: lv_trigger_4_0= ruleRegularEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggerRegularEventSpecParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRegularEventSpec_in_ruleReactionTrigger1913);
                    lv_trigger_4_0=ruleRegularEventSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
                      	        }
                             		set(
                             			current, 
                             			"trigger",
                              		lv_trigger_4_0, 
                              		"RegularEventSpec");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:901:6: (otherlv_5= '(' ( (lv_guardExpression_6_0= ruleExpression ) ) otherlv_7= ')' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:901:6: (otherlv_5= '(' ( (lv_guardExpression_6_0= ruleExpression ) ) otherlv_7= ')' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:901:8: otherlv_5= '(' ( (lv_guardExpression_6_0= ruleExpression ) ) otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleReactionTrigger1932); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getReactionTriggerAccess().getLeftParenthesisKeyword_4_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:905:1: ( (lv_guardExpression_6_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:906:1: (lv_guardExpression_6_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:906:1: (lv_guardExpression_6_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:907:3: lv_guardExpression_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_4_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger1953);
                    lv_guardExpression_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
                      	        }
                             		set(
                             			current, 
                             			"guardExpression",
                              		lv_guardExpression_6_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleReactionTrigger1965); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getReactionTriggerAccess().getRightParenthesisKeyword_4_1_2());
                          
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:935:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:936:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:937:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect2004);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionEffect2014); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:944:1: ruleReactionEffect returns [EObject current=null] : ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_0 = null;

        EObject lv_actions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:947:28: ( ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:948:1: ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:948:1: ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:948:2: () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:948:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:949:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:954:2: ( (lv_actions_1_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:955:1: (lv_actions_1_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:955:1: (lv_actions_1_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:956:3: lv_actions_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect2069);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:972:2: ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) && (synpred1_InternalSynctext())) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:972:3: ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:972:3: ( ( ',' )=>otherlv_2= ',' )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:972:4: ( ',' )=>otherlv_2= ','
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleReactionEffect2090); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReactionEffectAccess().getCommaKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:977:2: ( (lv_actions_3_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:978:1: (lv_actions_3_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:978:1: (lv_actions_3_0= ruleExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:979:3: lv_actions_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect2112);
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
            	    break loop16;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1003:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1004:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1005:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2150);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2160); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1012:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1015:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1016:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1016:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression )
            int alt17=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_HEX:
            case RULE_STRING:
                {
                alt17=1;
                }
                break;
            case RULE_ID:
                {
                alt17=2;
                }
                break;
            case 54:
                {
                alt17=3;
                }
                break;
            case 31:
                {
                alt17=4;
                }
                break;
            case 23:
                {
                alt17=5;
                }
                break;
            case 53:
                {
                alt17=6;
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1017:5: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrimitiveValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression2207);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1027:5: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression2234);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1037:5: this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getActiveStateReferenceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression2261);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1047:5: this_PreValueExpression_3= rulePreValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPreValueExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_rulePreValueExpression_in_rulePrimaryExpression2288);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1057:5: this_ParenthesizedExpression_4= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression2315);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1067:5: this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEventValueReferenceExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression2342);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1083:1: entryRulePreValueExpression returns [EObject current=null] : iv_rulePreValueExpression= rulePreValueExpression EOF ;
    public final EObject entryRulePreValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1084:2: (iv_rulePreValueExpression= rulePreValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1085:2: iv_rulePreValueExpression= rulePreValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePreValueExpression_in_entryRulePreValueExpression2377);
            iv_rulePreValueExpression=rulePreValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreValueExpression2387); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1092:1: rulePreValueExpression returns [EObject current=null] : ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject rulePreValueExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1095:28: ( ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1096:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1096:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1096:2: () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1096:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1097:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPreValueExpressionAccess().getPreValueExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_rulePreValueExpression2433); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPreValueExpressionAccess().getPreKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_rulePreValueExpression2445); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPreValueExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1110:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1111:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1111:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1112:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPreValueExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_rulePreValueExpression2466);
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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_rulePreValueExpression2478); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1142:1: entryRuleDefRoot returns [EObject current=null] : iv_ruleDefRoot= ruleDefRoot EOF ;
    public final EObject entryRuleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1143:2: (iv_ruleDefRoot= ruleDefRoot EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1144:2: iv_ruleDefRoot= ruleDefRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefRootRule()); 
            }
            pushFollow(FOLLOW_ruleDefRoot_in_entryRuleDefRoot2516);
            iv_ruleDefRoot=ruleDefRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRoot2526); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1151:1: ruleDefRoot returns [EObject current=null] : (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) ;
    public final EObject ruleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject this_StatechartRoot_0 = null;

        EObject this_StateRoot_1 = null;

        EObject this_TransitionRoot_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1154:28: ( (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1155:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1155:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt18=1;
                }
                break;
            case 33:
                {
                alt18=2;
                }
                break;
            case 34:
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1156:5: this_StatechartRoot_0= ruleStatechartRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStatechartRootParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatechartRoot_in_ruleDefRoot2573);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1166:5: this_StateRoot_1= ruleStateRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStateRootParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStateRoot_in_ruleDefRoot2600);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1176:5: this_TransitionRoot_2= ruleTransitionRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getTransitionRootParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransitionRoot_in_ruleDefRoot2627);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1192:1: entryRuleStatechartRoot returns [EObject current=null] : iv_ruleStatechartRoot= ruleStatechartRoot EOF ;
    public final EObject entryRuleStatechartRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1193:2: (iv_ruleStatechartRoot= ruleStatechartRoot EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1194:2: iv_ruleStatechartRoot= ruleStatechartRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartRootRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2662);
            iv_ruleStatechartRoot=ruleStatechartRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartRoot2672); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1201:1: ruleStatechartRoot returns [EObject current=null] : (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) ;
    public final EObject ruleStatechartRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1204:28: ( (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1205:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1205:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1205:3: otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleStatechartRoot2709); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatechartRootAccess().getStatechartKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1209:1: ( (lv_def_1_0= ruleStatechartSpecification ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1210:1: (lv_def_1_0= ruleStatechartSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1210:1: (lv_def_1_0= ruleStatechartSpecification )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1211:3: lv_def_1_0= ruleStatechartSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatechartRootAccess().getDefStatechartSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2730);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1235:1: entryRuleStateRoot returns [EObject current=null] : iv_ruleStateRoot= ruleStateRoot EOF ;
    public final EObject entryRuleStateRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1236:2: (iv_ruleStateRoot= ruleStateRoot EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1237:2: iv_ruleStateRoot= ruleStateRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRootRule()); 
            }
            pushFollow(FOLLOW_ruleStateRoot_in_entryRuleStateRoot2766);
            iv_ruleStateRoot=ruleStateRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateRoot2776); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1244:1: ruleStateRoot returns [EObject current=null] : (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) ;
    public final EObject ruleStateRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1247:28: ( (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1248:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1248:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1248:3: otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleStateRoot2813); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateRootAccess().getStateKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1252:1: ( (lv_def_1_0= ruleStateSpecification ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1253:1: (lv_def_1_0= ruleStateSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1253:1: (lv_def_1_0= ruleStateSpecification )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1254:3: lv_def_1_0= ruleStateSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateRootAccess().getDefStateSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_ruleStateRoot2834);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1278:1: entryRuleTransitionRoot returns [EObject current=null] : iv_ruleTransitionRoot= ruleTransitionRoot EOF ;
    public final EObject entryRuleTransitionRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1279:2: (iv_ruleTransitionRoot= ruleTransitionRoot EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1280:2: iv_ruleTransitionRoot= ruleTransitionRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRootRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2870);
            iv_ruleTransitionRoot=ruleTransitionRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionRoot2880); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1287:1: ruleTransitionRoot returns [EObject current=null] : (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) ;
    public final EObject ruleTransitionRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1290:28: ( (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1291:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1291:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1291:3: otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleTransitionRoot2917); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionRootAccess().getTransitionKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1295:1: ( (lv_def_1_0= ruleTransitionSpecification ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1296:1: (lv_def_1_0= ruleTransitionSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1296:1: (lv_def_1_0= ruleTransitionSpecification )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1297:3: lv_def_1_0= ruleTransitionSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionRootAccess().getDefTransitionSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2938);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1323:1: entryRuleStatechartSpecification returns [EObject current=null] : iv_ruleStatechartSpecification= ruleStatechartSpecification EOF ;
    public final EObject entryRuleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1324:2: (iv_ruleStatechartSpecification= ruleStatechartSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1325:2: iv_ruleStatechartSpecification= ruleStatechartSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2976);
            iv_ruleStatechartSpecification=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartSpecification2986); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1332:1: ruleStatechartSpecification returns [EObject current=null] : ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) ;
    public final EObject ruleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        EObject lv_scopes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1335:28: ( ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1336:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1336:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1336:2: () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )*
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1336:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1337:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatechartSpecificationAccess().getStatechartSpecificationAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1342:2: (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1342:4: otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleStatechartSpecification3033); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatechartSpecificationAccess().getNamespaceKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1346:1: ( (lv_namespace_2_0= ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1347:1: (lv_namespace_2_0= ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1347:1: (lv_namespace_2_0= ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1348:3: lv_namespace_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getNamespaceFQNParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleStatechartSpecification3054);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1364:4: ( (lv_scopes_3_0= ruleStatechartScope ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=36 && LA20_0<=37)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1365:1: (lv_scopes_3_0= ruleStatechartScope )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1365:1: (lv_scopes_3_0= ruleStatechartScope )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1366:3: lv_scopes_3_0= ruleStatechartScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getScopesStatechartScopeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification3077);
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
    // $ANTLR end "ruleStatechartSpecification"


    // $ANTLR start "entryRuleStateSpecification"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1390:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1391:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1392:2: iv_ruleStateSpecification= ruleStateSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3114);
            iv_ruleStateSpecification=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateSpecification3124); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1399:1: ruleStateSpecification returns [EObject current=null] : ( (lv_scope_0_0= ruleStateScope ) ) ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_scope_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1402:28: ( ( (lv_scope_0_0= ruleStateScope ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1403:1: ( (lv_scope_0_0= ruleStateScope ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1403:1: ( (lv_scope_0_0= ruleStateScope ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1404:1: (lv_scope_0_0= ruleStateScope )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1404:1: (lv_scope_0_0= ruleStateScope )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1405:3: lv_scope_0_0= ruleStateScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateSpecificationAccess().getScopeStateScopeParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateScope_in_ruleStateSpecification3169);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1429:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1430:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1431:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3204);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification3214); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1438:1: ruleTransitionSpecification returns [EObject current=null] : ( (lv_reaction_0_0= ruleTransitionReaction ) ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_reaction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1441:28: ( ( (lv_reaction_0_0= ruleTransitionReaction ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1442:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1442:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1443:1: (lv_reaction_0_0= ruleTransitionReaction )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1443:1: (lv_reaction_0_0= ruleTransitionReaction )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1444:3: lv_reaction_0_0= ruleTransitionReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getReactionTransitionReactionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification3259);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1470:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1471:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1472:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope3296);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartScope3306); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1479:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1482:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1483:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1483:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            else if ( (LA21_0==37) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1484:5: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStatechartScope3353);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1494:5: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalScope_in_ruleStatechartScope3380);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1512:1: entryRuleInterfaceScope returns [EObject current=null] : iv_ruleInterfaceScope= ruleInterfaceScope EOF ;
    public final EObject entryRuleInterfaceScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1513:2: (iv_ruleInterfaceScope= ruleInterfaceScope EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1514:2: iv_ruleInterfaceScope= ruleInterfaceScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3417);
            iv_ruleInterfaceScope=ruleInterfaceScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceScope3427); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1521:1: ruleInterfaceScope returns [EObject current=null] : ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1524:28: ( ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1525:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1525:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1525:2: () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1525:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1526:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInterfaceScopeAccess().getInterfaceScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleInterfaceScope3473); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceScopeAccess().getInterfaceKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1535:1: ( (lv_name_2_0= ruleXID ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||(LA22_0>=35 && LA22_0<=54)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1536:1: (lv_name_2_0= ruleXID )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1536:1: (lv_name_2_0= ruleXID )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1537:3: lv_name_2_0= ruleXID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getNameXIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXID_in_ruleInterfaceScope3494);
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleInterfaceScope3507); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInterfaceScopeAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1557:1: ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=21 && LA24_0<=22)||(LA24_0>=38 && LA24_0<=41)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1558:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1558:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1559:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1559:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    int alt23=3;
            	    switch ( input.LA(1) ) {
            	    case 38:
            	    case 39:
            	    case 40:
            	    case 41:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 22:
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1560:3: lv_declarations_4_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3530);
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1575:8: lv_declarations_4_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3549);
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1590:8: lv_declarations_4_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_4_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3568);
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
    // $ANTLR end "ruleInterfaceScope"


    // $ANTLR start "entryRuleInternalScope"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1616:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1617:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1618:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInternalScope_in_entryRuleInternalScope3608);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalScope3618); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1625:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1628:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1629:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1629:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1629:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1629:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1630:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInternalScopeAccess().getInternalScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleInternalScope3664); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleInternalScope3676); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1643:1: ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_INT||(LA26_0>=21 && LA26_0<=22)||LA26_0==25||(LA26_0>=27 && LA26_0<=29)||(LA26_0>=38 && LA26_0<=41)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1644:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1644:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1645:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1645:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    int alt25=4;
            	    switch ( input.LA(1) ) {
            	    case 38:
            	    case 39:
            	    case 40:
            	    case 41:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    case RULE_INT:
            	    case 25:
            	    case 27:
            	    case 28:
            	    case 29:
            	        {
            	        alt25=4;
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1646:3: lv_declarations_3_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3699);
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1661:8: lv_declarations_3_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3718);
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1676:8: lv_declarations_3_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3737);
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1691:8: lv_declarations_3_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsLocalReactionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleInternalScope3756);
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
    // $ANTLR end "ruleInternalScope"


    // $ANTLR start "entryRuleEventDeclarartion"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1719:1: entryRuleEventDeclarartion returns [EObject current=null] : iv_ruleEventDeclarartion= ruleEventDeclarartion EOF ;
    public final EObject entryRuleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclarartion = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1720:2: (iv_ruleEventDeclarartion= ruleEventDeclarartion EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1721:2: iv_ruleEventDeclarartion= ruleEventDeclarartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarartionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3798);
            iv_ruleEventDeclarartion=ruleEventDeclarartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclarartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclarartion3808); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1728:1: ruleEventDeclarartion returns [EObject current=null] : this_EventDefinition_0= ruleEventDefinition ;
    public final EObject ruleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject this_EventDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1731:28: (this_EventDefinition_0= ruleEventDefinition )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1733:5: this_EventDefinition_0= ruleEventDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEventDeclarartionAccess().getEventDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3854);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1751:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1752:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1753:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3890);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDefinition3900); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1760:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1763:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1764:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1764:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1764:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1764:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=39 && LA27_0<=41)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1765:1: (lv_direction_0_0= ruleDirection )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1765:1: (lv_direction_0_0= ruleDirection )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1766:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_ruleEventDefinition3946);
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

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleEventDefinition3959); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1786:1: ( (lv_name_2_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1787:1: (lv_name_2_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1787:1: (lv_name_2_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1788:3: lv_name_2_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getNameXIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleEventDefinition3980);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1804:2: (otherlv_3= ':' ( ( ruleFQN ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==17) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1804:4: otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleEventDefinition3993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1808:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1809:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1809:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1810:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getTypeTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEventDefinition4016);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1831:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1832:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1833:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4054);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration4064); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1840:1: ruleVariableDeclaration returns [EObject current=null] : this_VariableDefinition_0= ruleVariableDefinition ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1843:28: (this_VariableDefinition_0= ruleVariableDefinition )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1845:5: this_VariableDefinition_0= ruleVariableDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration4110);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1863:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1864:2: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1865:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4146);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDeclaration4156); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1872:1: ruleOperationDeclaration returns [EObject current=null] : this_OperationDefinition_0= ruleOperationDefinition ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1875:28: (this_OperationDefinition_0= ruleOperationDefinition )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1877:5: this_OperationDefinition_0= ruleOperationDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOperationDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4202);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1897:1: entryRuleXID returns [String current=null] : iv_ruleXID= ruleXID EOF ;
    public final String entryRuleXID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXID = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1898:2: (iv_ruleXID= ruleXID EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1899:2: iv_ruleXID= ruleXID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIDRule()); 
            }
            pushFollow(FOLLOW_ruleXID_in_entryRuleXID4241);
            iv_ruleXID=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXID4252); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1906:1: ruleXID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) ;
    public final AntlrDatatypeRuleToken ruleXID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1909:28: ( (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1910:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1910:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            int alt29=21;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt29=1;
                }
                break;
            case 35:
                {
                alt29=2;
                }
                break;
            case 36:
                {
                alt29=3;
                }
                break;
            case 37:
                {
                alt29=4;
                }
                break;
            case 38:
                {
                alt29=5;
                }
                break;
            case 39:
                {
                alt29=6;
                }
                break;
            case 40:
                {
                alt29=7;
                }
                break;
            case 41:
                {
                alt29=8;
                }
                break;
            case 42:
                {
                alt29=9;
                }
                break;
            case 43:
                {
                alt29=10;
                }
                break;
            case 44:
                {
                alt29=11;
                }
                break;
            case 45:
                {
                alt29=12;
                }
                break;
            case 46:
                {
                alt29=13;
                }
                break;
            case 47:
                {
                alt29=14;
                }
                break;
            case 48:
                {
                alt29=15;
                }
                break;
            case 49:
                {
                alt29=16;
                }
                break;
            case 50:
                {
                alt29=17;
                }
                break;
            case 51:
                {
                alt29=18;
                }
                break;
            case 52:
                {
                alt29=19;
                }
                break;
            case 53:
                {
                alt29=20;
                }
                break;
            case 54:
                {
                alt29=21;
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1910:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXID4292); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getXIDAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1919:2: kw= 'namespace'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleXID4316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getNamespaceKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1926:2: kw= 'interface'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleXID4335); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInterfaceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1933:2: kw= 'internal'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleXID4354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInternalKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1940:2: kw= 'event'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleXID4373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEventKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1947:2: kw= 'local'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleXID4392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getLocalKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1954:2: kw= 'in'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleXID4411); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1961:2: kw= 'out'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleXID4430); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOutKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1968:2: kw= 'var'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleXID4449); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getVarKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1975:2: kw= 'readonly'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleXID4468); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getReadonlyKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1982:2: kw= 'external'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleXID4487); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExternalKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1989:2: kw= 'operation'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleXID4506); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOperationKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1996:2: kw= 'default'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleXID4525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getDefaultKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2003:2: kw= 'else'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleXID4544); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getElseKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2010:2: kw= 'entry'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleXID4563); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEntryKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2017:2: kw= 'exit'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleXID4582); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExitKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2024:2: kw= 'always'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleXID4601); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getAlwaysKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2031:2: kw= 'oncycle'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleXID4620); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOncycleKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2038:2: kw= 'raise'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleXID4639); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getRaiseKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2045:2: kw= 'valueof'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleXID4658); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getValueofKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2052:2: kw= 'active'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleXID4677); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2065:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2066:2: (iv_ruleFQN= ruleFQN EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2067:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN4718);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN4729); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2074:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_XID_0 = null;

        AntlrDatatypeRuleToken this_XID_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2077:28: ( (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2078:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2078:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2079:5: this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXID_in_ruleFQN4776);
            this_XID_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_XID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2089:1: (kw= '.' this_XID_2= ruleXID )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==55) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2090:2: kw= '.' this_XID_2= ruleXID
            	    {
            	    kw=(Token)match(input,55,FOLLOW_55_in_ruleFQN4795); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleXID_in_ruleFQN4817);
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleTransitionReaction"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2116:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2117:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2118:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction4866);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionReaction4876); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2125:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2128:28: ( ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2129:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2129:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2129:2: () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )?
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2129:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2130:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionReactionAccess().getTransitionReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2135:2: ( (lv_trigger_1_0= ruleStextTrigger ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT||(LA31_0>=46 && LA31_0<=47)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2136:1: (lv_trigger_1_0= ruleStextTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2136:1: (lv_trigger_1_0= ruleStextTrigger )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2137:3: lv_trigger_1_0= ruleStextTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerStextTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStextTrigger_in_ruleTransitionReaction4931);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2153:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==25) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2153:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleTransitionReaction4945); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2157:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2158:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2158:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2159:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransitionReaction4966);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2175:4: (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==56) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2175:6: otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )*
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleTransitionReaction4981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionReactionAccess().getNumberSignKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2179:1: ( (lv_properties_5_0= ruleTransitionProperty ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==RULE_ID||LA33_0==57) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2180:1: (lv_properties_5_0= ruleTransitionProperty )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2180:1: (lv_properties_5_0= ruleTransitionProperty )
                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2181:3: lv_properties_5_0= ruleTransitionProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getPropertiesTransitionPropertyParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransitionProperty_in_ruleTransitionReaction5002);
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
                    	    break loop33;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2205:1: entryRuleStextTrigger returns [EObject current=null] : iv_ruleStextTrigger= ruleStextTrigger EOF ;
    public final EObject entryRuleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStextTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2206:2: (iv_ruleStextTrigger= ruleStextTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2207:2: iv_ruleStextTrigger= ruleStextTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStextTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5041);
            iv_ruleStextTrigger=ruleStextTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStextTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStextTrigger5051); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2214:1: ruleStextTrigger returns [EObject current=null] : (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) ;
    public final EObject ruleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject this_ReactionTrigger_0 = null;

        EObject this_DefaultTrigger_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2217:28: ( (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2218:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2218:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_INT) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=46 && LA35_0<=47)) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2219:5: this_ReactionTrigger_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getReactionTriggerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5098);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2229:5: this_DefaultTrigger_1= ruleDefaultTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getDefaultTriggerParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5125);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2245:1: entryRuleDefaultTrigger returns [EObject current=null] : iv_ruleDefaultTrigger= ruleDefaultTrigger EOF ;
    public final EObject entryRuleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2246:2: (iv_ruleDefaultTrigger= ruleDefaultTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2247:2: iv_ruleDefaultTrigger= ruleDefaultTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger5160);
            iv_ruleDefaultTrigger=ruleDefaultTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultTrigger5170); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2254:1: ruleDefaultTrigger returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2257:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2258:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2258:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2258:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2258:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2259:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultTriggerAccess().getDefaultTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2264:2: (otherlv_1= 'default' | otherlv_2= 'else' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==46) ) {
                alt36=1;
            }
            else if ( (LA36_0==47) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2264:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleDefaultTrigger5217); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultTriggerAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2269:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleDefaultTrigger5235); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2281:1: entryRuleTransitionProperty returns [EObject current=null] : iv_ruleTransitionProperty= ruleTransitionProperty EOF ;
    public final EObject entryRuleTransitionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionProperty = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2282:2: (iv_ruleTransitionProperty= ruleTransitionProperty EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2283:2: iv_ruleTransitionProperty= ruleTransitionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionProperty_in_entryRuleTransitionProperty5272);
            iv_ruleTransitionProperty=ruleTransitionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionProperty5282); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2290:1: ruleTransitionProperty returns [EObject current=null] : (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) ;
    public final EObject ruleTransitionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_EntryPointSpec_0 = null;

        EObject this_ExitPointSpec_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2293:28: ( (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2294:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2294:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==57) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_ID) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2295:5: this_EntryPointSpec_0= ruleEntryPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionPropertyAccess().getEntryPointSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryPointSpec_in_ruleTransitionProperty5329);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2305:5: this_ExitPointSpec_1= ruleExitPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionPropertyAccess().getExitPointSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitPointSpec_in_ruleTransitionProperty5356);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2321:1: entryRuleEntryPointSpec returns [EObject current=null] : iv_ruleEntryPointSpec= ruleEntryPointSpec EOF ;
    public final EObject entryRuleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2322:2: (iv_ruleEntryPointSpec= ruleEntryPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2323:2: iv_ruleEntryPointSpec= ruleEntryPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec5391);
            iv_ruleEntryPointSpec=ruleEntryPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryPointSpec5401); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2330:1: ruleEntryPointSpec returns [EObject current=null] : (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_entrypoint_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2333:28: ( (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2334:1: (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2334:1: (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2334:3: otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleEntryPointSpec5438); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntryPointSpecAccess().getGreaterThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2338:1: ( (lv_entrypoint_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2339:1: (lv_entrypoint_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2339:1: (lv_entrypoint_1_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2340:3: lv_entrypoint_1_0= RULE_ID
            {
            lv_entrypoint_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntryPointSpec5455); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2364:1: entryRuleExitPointSpec returns [EObject current=null] : iv_ruleExitPointSpec= ruleExitPointSpec EOF ;
    public final EObject entryRuleExitPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2365:2: (iv_ruleExitPointSpec= ruleExitPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2366:2: iv_ruleExitPointSpec= ruleExitPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec5496);
            iv_ruleExitPointSpec=ruleExitPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitPointSpec5506); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2373:1: ruleExitPointSpec returns [EObject current=null] : ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' ) ;
    public final EObject ruleExitPointSpec() throws RecognitionException {
        EObject current = null;

        Token lv_exitpoint_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2376:28: ( ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2377:1: ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2377:1: ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2377:2: ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2377:2: ( (lv_exitpoint_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2378:1: (lv_exitpoint_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2378:1: (lv_exitpoint_0_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2379:3: lv_exitpoint_0_0= RULE_ID
            {
            lv_exitpoint_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExitPointSpec5548); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleExitPointSpec5565); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2409:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2410:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2411:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5603);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularEventSpec5613); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2418:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2421:28: ( ( (lv_event_0_0= ruleFeatureCall ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2422:1: ( (lv_event_0_0= ruleFeatureCall ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2422:1: ( (lv_event_0_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2423:1: (lv_event_0_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2423:1: (lv_event_0_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2424:3: lv_event_0_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5658);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2448:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2449:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2450:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5693);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeEventSpec5703); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2457:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_value_1_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2460:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2461:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2461:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2461:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2461:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2462:1: (lv_type_0_0= ruleTimeEventType )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2462:1: (lv_type_0_0= ruleTimeEventType )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2463:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5749);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2479:2: ( (lv_value_1_0= ruleConditionalExpression ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2480:1: (lv_value_1_0= ruleConditionalExpression )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2480:1: (lv_value_1_0= ruleConditionalExpression )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2481:3: lv_value_1_0= ruleConditionalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getValueConditionalExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec5770);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2497:2: ( (lv_unit_2_0= ruleTimeUnit ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2498:1: (lv_unit_2_0= ruleTimeUnit )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2498:1: (lv_unit_2_0= ruleTimeUnit )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2499:3: lv_unit_2_0= ruleTimeUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5791);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2523:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2524:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2525:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5827);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinEventSpec5837); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2532:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_AlwaysEvent_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2535:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2536:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2536:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt38=1;
                }
                break;
            case 49:
                {
                alt38=2;
                }
                break;
            case 50:
            case 51:
                {
                alt38=3;
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2537:5: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5884);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2547:5: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5911);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2557:5: this_AlwaysEvent_2= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec5938);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2573:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2574:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2575:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent5973);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryEvent5983); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2582:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2585:28: ( ( () otherlv_1= 'entry' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2586:1: ( () otherlv_1= 'entry' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2586:1: ( () otherlv_1= 'entry' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2586:2: () otherlv_1= 'entry'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2586:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2587:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryEventAccess().getEntryEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleEntryEvent6029); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2604:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2605:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2606:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent6065);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent6075); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2613:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2616:28: ( ( () otherlv_1= 'exit' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2617:1: ( () otherlv_1= 'exit' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2617:1: ( () otherlv_1= 'exit' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2617:2: () otherlv_1= 'exit'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2617:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2618:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitEventAccess().getExitEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleExitEvent6121); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2635:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2636:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2637:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent6157);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEvent6167); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2644:1: ruleAlwaysEvent returns [EObject current=null] : ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2647:28: ( ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2648:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2648:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2648:2: () (otherlv_1= 'always' | otherlv_2= 'oncycle' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2648:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2649:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlwaysEventAccess().getAlwaysEventAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2654:2: (otherlv_1= 'always' | otherlv_2= 'oncycle' )
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2654:4: otherlv_1= 'always'
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleAlwaysEvent6214); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAlwaysEventAccess().getAlwaysKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2659:7: otherlv_2= 'oncycle'
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleAlwaysEvent6232); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2675:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2676:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2677:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6273);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6283); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2684:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2687:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2689:5: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpression6329);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2705:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2706:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2707:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6363);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression6373); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2714:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2717:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2718:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2718:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2719:5: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6420);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2727:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==18||(LA40_0>=75 && LA40_0<=84)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2727:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2727:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2728:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2733:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2734:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2734:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2735:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6450);
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

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2751:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2752:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2752:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2753:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6471);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2777:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2778:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2779:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6509);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression6519); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2786:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2789:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2790:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2790:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2791:5: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6566);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2799:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==58) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2799:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2799:2: ()
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2800:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleConditionalExpression6587); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2809:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2810:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2810:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2811:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6608);
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

                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleConditionalExpression6620); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2831:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2832:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2832:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2833:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6641);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2857:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2858:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2859:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6679);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression6689); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2866:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2869:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2870:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2870:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2871:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6736);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2879:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==59) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2879:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2879:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2880:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleLogicalOrExpression6757); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2889:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2890:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2890:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2891:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6778);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2915:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2916:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2917:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6816);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression6826); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2924:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2927:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2928:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2928:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2929:5: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6873);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2937:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==60) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2937:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2937:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2938:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleLogicalAndExpression6894); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2947:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2948:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2948:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2949:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6915);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2973:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2974:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2975:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression6953);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNotExpression6963); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2982:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2985:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2986:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2986:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_STRING)||LA44_0==23||LA44_0==31||(LA44_0>=53 && LA44_0<=54)||(LA44_0>=87 && LA44_0<=88)||LA44_0==91) ) {
                alt44=1;
            }
            else if ( (LA44_0==61) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2987:5: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7010);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2996:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2996:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2996:7: () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2996:7: ()
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2997:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalNotExpressionAccess().getLogicalNotExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleLogicalNotExpression7037); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLogicalNotExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3006:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3007:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3007:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3008:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7058);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3032:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3033:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3034:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7095);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression7105); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3041:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3044:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3045:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3045:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3046:5: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7152);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3054:1: ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==62) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3054:2: () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3054:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3055:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleBitwiseXorExpression7173); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3064:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3065:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3065:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3066:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7194);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3090:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3091:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3092:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7232);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression7242); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3099:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3102:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3103:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3103:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3104:5: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7289);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3112:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==63) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3112:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3112:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3113:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleBitwiseOrExpression7310); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3122:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3123:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3123:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3124:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7331);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3148:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3149:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3150:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7369);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression7379); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3157:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3160:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3161:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3161:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3162:5: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7426);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3170:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==64) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3170:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3170:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3171:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleBitwiseAndExpression7447); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3180:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3181:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3181:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3182:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7468);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3206:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3207:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3208:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7506);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalRelationExpression7516); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3215:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3218:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3219:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3219:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3220:5: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7563);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3228:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==57||(LA48_0>=92 && LA48_0<=96)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3228:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3228:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3229:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3234:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3235:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3235:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3236:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7593);
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

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3252:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3253:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3253:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3254:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7614);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3278:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3279:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3280:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7652);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression7662); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3287:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3290:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3291:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3291:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3292:5: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7709);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3300:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=85 && LA49_0<=86)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3300:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3300:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3301:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3306:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3307:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3307:1: (lv_operator_2_0= ruleShiftOperator )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3308:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression7739);
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

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3324:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3325:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3325:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3326:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7760);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3350:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3351:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3352:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7798);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7808); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3359:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3362:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3363:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3363:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3364:5: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7855);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3372:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=87 && LA50_0<=88)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3372:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3372:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3373:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3378:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3379:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3379:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3380:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7885);
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

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3396:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3397:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3397:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3398:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7906);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3422:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3423:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3424:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression7944);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression7954); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3431:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3434:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3435:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3435:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3436:5: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8001);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3444:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==25||(LA51_0>=89 && LA51_0<=90)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3444:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3444:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3445:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3450:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3451:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3451:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3452:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8031);
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

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3468:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3469:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3469:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3470:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8052);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3494:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3495:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3496:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8090);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8100); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3503:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3506:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3507:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3507:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_ID && LA52_0<=RULE_STRING)||LA52_0==23||LA52_0==31||(LA52_0>=53 && LA52_0<=54)) ) {
                alt52=1;
            }
            else if ( ((LA52_0>=87 && LA52_0<=88)||LA52_0==91) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3508:5: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8147);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3517:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3517:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3517:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3517:7: ()
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3518:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumericalUnaryExpressionAccess().getNumericalUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3523:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3524:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3524:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3525:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8183);
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

                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3541:2: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3542:1: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3542:1: (lv_operand_3_0= rulePrimaryExpression )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3543:3: lv_operand_3_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8204);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3567:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3568:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3569:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8241);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValueExpression8251); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3576:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3579:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3580:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3580:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3580:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3580:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3581:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveValueExpressionAccess().getPrimitiveValueExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3586:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3587:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3587:1: (lv_value_1_0= ruleLiteral )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3588:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8306);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3612:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3613:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3614:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8342);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall8352); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3621:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3624:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3625:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3625:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3626:5: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8399);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3634:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==55) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3634:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3634:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3635:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleFeatureCall8420); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3644:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3645:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3645:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3646:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureCall8440); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3657:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==23) && (synpred2_InternalSynctext())) {
            	        alt55=1;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3657:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3657:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3657:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3664:1: (lv_operationCall_4_0= '(' )
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3665:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,23,FOLLOW_23_in_ruleFeatureCall8474); if (state.failed) return current;
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

            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3678:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt54=2;
            	            int LA54_0 = input.LA(1);

            	            if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_STRING)||LA54_0==23||LA54_0==31||(LA54_0>=53 && LA54_0<=54)||LA54_0==61||(LA54_0>=87 && LA54_0<=88)||LA54_0==91) ) {
            	                alt54=1;
            	            }
            	            switch (alt54) {
            	                case 1 :
            	                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3678:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3678:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3679:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3679:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3680:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8509);
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

            	                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3696:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop53:
            	                    do {
            	                        int alt53=2;
            	                        int LA53_0 = input.LA(1);

            	                        if ( (LA53_0==30) ) {
            	                            alt53=1;
            	                        }


            	                        switch (alt53) {
            	                    	case 1 :
            	                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3696:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleFeatureCall8522); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3700:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3701:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3701:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3702:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8543);
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

            	            otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleFeatureCall8559); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3730:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3731:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3732:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8599);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementReferenceExpression8609); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3739:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3742:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3743:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3743:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3743:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3743:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3744:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementReferenceExpressionAccess().getElementReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3749:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3750:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3750:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3751:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementReferenceExpression8663); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3762:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==23) && (synpred3_InternalSynctext())) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3762:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3762:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3762:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3769:1: (lv_operationCall_2_0= '(' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3770:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,23,FOLLOW_23_in_ruleElementReferenceExpression8697); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3783:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_STRING)||LA58_0==23||LA58_0==31||(LA58_0>=53 && LA58_0<=54)||LA58_0==61||(LA58_0>=87 && LA58_0<=88)||LA58_0==91) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3783:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3783:3: ( (lv_args_3_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3784:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3784:1: (lv_args_3_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3785:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8732);
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

                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3801:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop57:
                            do {
                                int alt57=2;
                                int LA57_0 = input.LA(1);

                                if ( (LA57_0==30) ) {
                                    alt57=1;
                                }


                                switch (alt57) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3801:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleElementReferenceExpression8745); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3805:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3806:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3806:1: (lv_args_5_0= ruleExpression )
                            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3807:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8766);
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

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleElementReferenceExpression8782); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3835:1: entryRuleEventValueReferenceExpression returns [EObject current=null] : iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF ;
    public final EObject entryRuleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventValueReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3836:2: (iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3837:2: iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventValueReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression8820);
            iv_ruleEventValueReferenceExpression=ruleEventValueReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventValueReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventValueReferenceExpression8830); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3844:1: ruleEventValueReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject ruleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3847:28: ( ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3848:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3848:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3848:2: () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3848:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3849:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventValueReferenceExpressionAccess().getEventValueReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleEventValueReferenceExpression8876); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventValueReferenceExpressionAccess().getValueofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleEventValueReferenceExpression8888); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventValueReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3862:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3863:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3863:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3864:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventValueReferenceExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression8909);
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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleEventValueReferenceExpression8921); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3892:1: entryRuleActiveStateReferenceExpression returns [EObject current=null] : iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF ;
    public final EObject entryRuleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveStateReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3893:2: (iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3894:2: iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveStateReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression8957);
            iv_ruleActiveStateReferenceExpression=ruleActiveStateReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveStateReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression8967); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3901:1: ruleActiveStateReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3904:28: ( ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3905:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3905:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3905:2: () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3905:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3906:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActiveStateReferenceExpressionAccess().getActiveStateReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleActiveStateReferenceExpression9013); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActiveStateReferenceExpressionAccess().getActiveKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleActiveStateReferenceExpression9025); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActiveStateReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3919:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3920:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3920:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3921:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActiveStateReferenceExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActiveStateReferenceExpressionAccess().getValueStateCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9048);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleActiveStateReferenceExpression9060); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3946:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3947:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3948:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression9096);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression9106); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3955:1: ruleParenthesizedExpression returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3958:28: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3959:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3959:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3959:2: () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3959:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3960:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParenthesizedExpressionAccess().getParenthesizedExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleParenthesizedExpression9152); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3969:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3970:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3970:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3971:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression9173);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleParenthesizedExpression9185); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3999:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4000:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4001:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral9221);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral9231); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4008:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_RealLiteral_3 = null;

        EObject this_StringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4011:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4012:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4012:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4013:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral9278);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4023:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral9305);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4033:5: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexLiteral_in_ruleLiteral9332);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4043:5: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleLiteral9359);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4053:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral9386);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4069:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4070:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4071:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9421);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral9431); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4078:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4081:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4082:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4082:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4082:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4082:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4083:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4088:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4089:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4089:1: (lv_value_1_0= RULE_BOOL )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4090:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral9482); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4114:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4115:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4116:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9523);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral9533); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4123:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4126:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4127:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4127:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4127:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4127:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4128:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4133:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4134:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4134:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4135:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral9584); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4159:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4160:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4161:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9625);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral9635); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4168:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4171:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4172:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4172:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4172:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4172:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4173:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4178:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4179:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4179:1: (lv_value_1_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4180:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleRealLiteral9686); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4204:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4205:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4206:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9727);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexLiteral9737); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4213:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4216:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4217:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4217:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4217:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4217:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4218:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHexLiteralAccess().getHexLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4223:2: ( (lv_value_1_0= RULE_HEX ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4224:1: (lv_value_1_0= RULE_HEX )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4224:1: (lv_value_1_0= RULE_HEX )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4225:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleHexLiteral9788); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4249:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4250:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4251:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9829);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral9839); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4258:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4261:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4262:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4262:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4262:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4262:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4263:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4268:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4269:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4269:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4270:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral9890); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4294:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4296:28: ( ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4297:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4297:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            int alt61=8;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt61=1;
                }
                break;
            case 66:
                {
                alt61=2;
                }
                break;
            case 67:
                {
                alt61=3;
                }
                break;
            case 68:
                {
                alt61=4;
                }
                break;
            case 69:
                {
                alt61=5;
                }
                break;
            case 70:
                {
                alt61=6;
                }
                break;
            case 71:
                {
                alt61=7;
                }
                break;
            case 72:
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4297:2: (enumLiteral_0= '\\'none\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4297:2: (enumLiteral_0= '\\'none\\'' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4297:4: enumLiteral_0= '\\'none\\''
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_65_in_ruleCombineOperator9945); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4303:6: (enumLiteral_1= '\\'+\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4303:6: (enumLiteral_1= '\\'+\\'' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4303:8: enumLiteral_1= '\\'+\\''
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_66_in_ruleCombineOperator9962); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4309:6: (enumLiteral_2= '\\'*\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4309:6: (enumLiteral_2= '\\'*\\'' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4309:8: enumLiteral_2= '\\'*\\''
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_67_in_ruleCombineOperator9979); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4315:6: (enumLiteral_3= '\\'max\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4315:6: (enumLiteral_3= '\\'max\\'' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4315:8: enumLiteral_3= '\\'max\\''
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_68_in_ruleCombineOperator9996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4321:6: (enumLiteral_4= '\\'min\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4321:6: (enumLiteral_4= '\\'min\\'' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4321:8: enumLiteral_4= '\\'min\\''
                    {
                    enumLiteral_4=(Token)match(input,69,FOLLOW_69_in_ruleCombineOperator10013); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4327:6: (enumLiteral_5= '\\'or\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4327:6: (enumLiteral_5= '\\'or\\'' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4327:8: enumLiteral_5= '\\'or\\''
                    {
                    enumLiteral_5=(Token)match(input,70,FOLLOW_70_in_ruleCombineOperator10030); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4333:6: (enumLiteral_6= '\\'and\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4333:6: (enumLiteral_6= '\\'and\\'' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4333:8: enumLiteral_6= '\\'and\\''
                    {
                    enumLiteral_6=(Token)match(input,71,FOLLOW_71_in_ruleCombineOperator10047); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4339:6: (enumLiteral_7= '\\'host\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4339:6: (enumLiteral_7= '\\'host\\'' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4339:8: enumLiteral_7= '\\'host\\''
                    {
                    enumLiteral_7=(Token)match(input,72,FOLLOW_72_in_ruleCombineOperator10064); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4349:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4351:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4352:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4352:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt62=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt62=1;
                }
                break;
            case 40:
                {
                alt62=2;
                }
                break;
            case 41:
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4352:2: (enumLiteral_0= 'local' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4352:2: (enumLiteral_0= 'local' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4352:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_39_in_ruleDirection10109); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4358:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4358:6: (enumLiteral_1= 'in' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4358:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleDirection10126); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4364:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4364:6: (enumLiteral_2= 'out' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4364:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_41_in_ruleDirection10143); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4374:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4376:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4377:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4377:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==73) ) {
                alt63=1;
            }
            else if ( (LA63_0==74) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4377:2: (enumLiteral_0= 'after' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4377:2: (enumLiteral_0= 'after' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4377:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_73_in_ruleTimeEventType10188); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4383:6: (enumLiteral_1= 'every' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4383:6: (enumLiteral_1= 'every' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4383:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_74_in_ruleTimeEventType10205); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4393:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4395:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4396:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4396:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            int alt64=11;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt64=1;
                }
                break;
            case 75:
                {
                alt64=2;
                }
                break;
            case 76:
                {
                alt64=3;
                }
                break;
            case 77:
                {
                alt64=4;
                }
                break;
            case 78:
                {
                alt64=5;
                }
                break;
            case 79:
                {
                alt64=6;
                }
                break;
            case 80:
                {
                alt64=7;
                }
                break;
            case 81:
                {
                alt64=8;
                }
                break;
            case 82:
                {
                alt64=9;
                }
                break;
            case 83:
                {
                alt64=10;
                }
                break;
            case 84:
                {
                alt64=11;
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4396:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4396:2: (enumLiteral_0= '=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4396:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_18_in_ruleAssignmentOperator10250); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4402:6: (enumLiteral_1= '*=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4402:6: (enumLiteral_1= '*=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4402:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_75_in_ruleAssignmentOperator10267); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4408:6: (enumLiteral_2= '/=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4408:6: (enumLiteral_2= '/=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4408:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_76_in_ruleAssignmentOperator10284); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4414:6: (enumLiteral_3= '%=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4414:6: (enumLiteral_3= '%=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4414:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,77,FOLLOW_77_in_ruleAssignmentOperator10301); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4420:6: (enumLiteral_4= '+=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4420:6: (enumLiteral_4= '+=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4420:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,78,FOLLOW_78_in_ruleAssignmentOperator10318); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4426:6: (enumLiteral_5= '-=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4426:6: (enumLiteral_5= '-=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4426:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,79,FOLLOW_79_in_ruleAssignmentOperator10335); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4432:6: (enumLiteral_6= '<<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4432:6: (enumLiteral_6= '<<=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4432:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,80,FOLLOW_80_in_ruleAssignmentOperator10352); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4438:6: (enumLiteral_7= '>>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4438:6: (enumLiteral_7= '>>=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4438:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,81,FOLLOW_81_in_ruleAssignmentOperator10369); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4444:6: (enumLiteral_8= '&=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4444:6: (enumLiteral_8= '&=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4444:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,82,FOLLOW_82_in_ruleAssignmentOperator10386); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4450:6: (enumLiteral_9= '^=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4450:6: (enumLiteral_9= '^=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4450:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,83,FOLLOW_83_in_ruleAssignmentOperator10403); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4456:6: (enumLiteral_10= '|=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4456:6: (enumLiteral_10= '|=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4456:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,84,FOLLOW_84_in_ruleAssignmentOperator10420); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4466:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4468:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4469:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4469:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==85) ) {
                alt65=1;
            }
            else if ( (LA65_0==86) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4469:2: (enumLiteral_0= '<<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4469:2: (enumLiteral_0= '<<' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4469:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_85_in_ruleShiftOperator10465); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4475:6: (enumLiteral_1= '>>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4475:6: (enumLiteral_1= '>>' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4475:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_86_in_ruleShiftOperator10482); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4485:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4487:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4488:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4488:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==87) ) {
                alt66=1;
            }
            else if ( (LA66_0==88) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4488:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4488:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4488:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_ruleAdditiveOperator10527); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4494:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4494:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4494:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_88_in_ruleAdditiveOperator10544); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4504:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4506:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4507:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4507:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt67=3;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt67=1;
                }
                break;
            case 25:
                {
                alt67=2;
                }
                break;
            case 90:
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4507:2: (enumLiteral_0= '*' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4507:2: (enumLiteral_0= '*' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4507:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_89_in_ruleMultiplicativeOperator10589); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4513:6: (enumLiteral_1= '/' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4513:6: (enumLiteral_1= '/' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4513:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_25_in_ruleMultiplicativeOperator10606); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4519:6: (enumLiteral_2= '%' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4519:6: (enumLiteral_2= '%' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4519:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_90_in_ruleMultiplicativeOperator10623); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4529:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4531:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4532:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4532:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            int alt68=3;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt68=1;
                }
                break;
            case 88:
                {
                alt68=2;
                }
                break;
            case 91:
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4532:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4532:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4532:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_ruleUnaryOperator10668); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4538:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4538:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4538:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_88_in_ruleUnaryOperator10685); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4544:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4544:6: (enumLiteral_2= '~' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4544:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,91,FOLLOW_91_in_ruleUnaryOperator10702); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4554:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4556:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4557:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4557:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt69=6;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt69=1;
                }
                break;
            case 93:
                {
                alt69=2;
                }
                break;
            case 57:
                {
                alt69=3;
                }
                break;
            case 94:
                {
                alt69=4;
                }
                break;
            case 95:
                {
                alt69=5;
                }
                break;
            case 96:
                {
                alt69=6;
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4557:2: (enumLiteral_0= '<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4557:2: (enumLiteral_0= '<' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4557:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_92_in_ruleRelationalOperator10747); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4563:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4563:6: (enumLiteral_1= '<=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4563:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_93_in_ruleRelationalOperator10764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4569:6: (enumLiteral_2= '>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4569:6: (enumLiteral_2= '>' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4569:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_57_in_ruleRelationalOperator10781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4575:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4575:6: (enumLiteral_3= '>=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4575:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,94,FOLLOW_94_in_ruleRelationalOperator10798); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4581:6: (enumLiteral_4= '==' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4581:6: (enumLiteral_4= '==' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4581:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,95,FOLLOW_95_in_ruleRelationalOperator10815); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4587:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4587:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4587:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,96,FOLLOW_96_in_ruleRelationalOperator10832); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4597:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4599:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4600:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4600:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            int alt70=4;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt70=1;
                }
                break;
            case 98:
                {
                alt70=2;
                }
                break;
            case 99:
                {
                alt70=3;
                }
                break;
            case 100:
                {
                alt70=4;
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4600:2: (enumLiteral_0= 's' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4600:2: (enumLiteral_0= 's' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4600:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_97_in_ruleTimeUnit10877); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4606:6: (enumLiteral_1= 'ms' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4606:6: (enumLiteral_1= 'ms' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4606:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,98,FOLLOW_98_in_ruleTimeUnit10894); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4612:6: (enumLiteral_2= 'us' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4612:6: (enumLiteral_2= 'us' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4612:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,99,FOLLOW_99_in_ruleTimeUnit10911); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4618:6: (enumLiteral_3= 'ns' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4618:6: (enumLiteral_3= 'ns' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4618:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,100,FOLLOW_100_in_ruleTimeUnit10928); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalSynctext
    public final void synpred1_InternalSynctext_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:972:4: ( ',' )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:972:6: ','
        {
        match(input,30,FOLLOW_30_in_synpred1_InternalSynctext2082); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSynctext

    // $ANTLR start synpred2_InternalSynctext
    public final void synpred2_InternalSynctext_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3657:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3658:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3658:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3659:2: '('
        {
        match(input,23,FOLLOW_23_in_synpred2_InternalSynctext8456); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalSynctext

    // $ANTLR start synpred3_InternalSynctext
    public final void synpred3_InternalSynctext_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3762:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3763:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3763:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3764:2: '('
        {
        match(input,23,FOLLOW_23_in_synpred3_InternalSynctext8679); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalSynctext

    // Delegated rules

    public final boolean synpred3_InternalSynctext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSynctext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalSynctext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSynctext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalSynctext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSynctext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleStateScope_in_entryRuleStateScope75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateScope85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStateScope142 = new BitSet(new long[]{0x000000003A61C022L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_ruleStateScope161 = new BitSet(new long[]{0x000000003A61C022L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleStateScope180 = new BitSet(new long[]{0x000000003A61C022L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleStateScope199 = new BitSet(new long[]{0x000000003A61C022L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDeclaration249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDefinition_in_ruleSignalDeclaration295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDefinition_in_entryRuleSignalDefinition329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDefinition339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSignalDefinition391 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleSignalDefinition423 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSignalDefinition449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalDefinition466 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_17_in_ruleSignalDefinition484 = new BitSet(new long[]{0x007FFFF800000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleSignalDefinition507 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_18_in_ruleSignalDefinition520 = new BitSet(new long[]{0x20600000808003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSignalDefinition541 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleSignalDefinition556 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001FEL});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignalDefinition577 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSignalDefinition593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleVariableDefinition685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDefinition702 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleVariableDefinition719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDefinition765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOperationDefinition811 = new BitSet(new long[]{0x007FFFF800000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition834 = new BitSet(new long[]{0x007FFFF800000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleOperationDefinition855 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOperationDefinition867 = new BitSet(new long[]{0x007FFFF800000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition890 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOperationDefinition902 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOperationDefinition914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReaction960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionTrigger_in_ruleLocalReaction1008 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReaction1027 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleLocalReaction1044 = new BitSet(new long[]{0x20600000848003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalReaction1067 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleSuspendEffect_in_ruleLocalReaction1086 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLocalReaction1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspendEffect_in_entryRuleSuspendEffect1138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuspendEffect1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSuspendEffect1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionTrigger_in_entryRuleLocalReactionTrigger1230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReactionTrigger1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReaction_in_ruleLocalReactionTrigger1295 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleLocalReactionTrigger1308 = new BitSet(new long[]{0x0000000038000022L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReactionTrigger1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReaction_in_entryRuleStateReaction1368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateReaction1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_ruleStateReaction1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInside_in_ruleStateReaction1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_ruleStateReaction1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_entryRuleEntry1514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntry1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEntry1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInside_in_entryRuleInside1606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInside1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleInside1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_entryRuleExit1698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExit1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleExit1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionTrigger1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReactionTrigger1851 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleReactionTrigger1868 = new BitSet(new long[]{0x0000000000800032L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReactionTrigger1885 = new BitSet(new long[]{0x0000000000800012L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_ruleReactionTrigger1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleReactionTrigger1932 = new BitSet(new long[]{0x20600000808003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger1953 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleReactionTrigger1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect2004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionEffect2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect2069 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleReactionEffect2090 = new BitSet(new long[]{0x20600000808003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect2112 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueExpression_in_rulePrimaryExpression2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueExpression_in_entryRulePreValueExpression2377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreValueExpression2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePreValueExpression2433 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePreValueExpression2445 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePreValueExpression2466 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePreValueExpression2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRoot_in_entryRuleDefRoot2516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRoot2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_ruleDefRoot2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_ruleDefRoot2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_ruleDefRoot2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartRoot2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleStatechartRoot2709 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_entryRuleStateRoot2766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateRoot2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleStateRoot2813 = new BitSet(new long[]{0x000000003A61C020L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleStateRoot2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionRoot2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTransitionRoot2917 = new BitSet(new long[]{0x0100C0003A000020L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartSpecification2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleStatechartSpecification3033 = new BitSet(new long[]{0x007FFFF800000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleStatechartSpecification3054 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification3077 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateSpecification3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_ruleStateSpecification3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope3296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartScope3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStatechartScope3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_ruleStatechartScope3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScope3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleInterfaceScope3473 = new BitSet(new long[]{0x007FFFF800020010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleInterfaceScope3494 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInterfaceScope3507 = new BitSet(new long[]{0x000003C000600002L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3530 = new BitSet(new long[]{0x000003C000600002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3549 = new BitSet(new long[]{0x000003C000600002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3568 = new BitSet(new long[]{0x000003C000600002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_entryRuleInternalScope3608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalScope3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleInternalScope3664 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInternalScope3676 = new BitSet(new long[]{0x000003C03A61C020L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3699 = new BitSet(new long[]{0x000003C03A61C022L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3718 = new BitSet(new long[]{0x000003C03A61C022L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3737 = new BitSet(new long[]{0x000003C03A61C022L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleInternalScope3756 = new BitSet(new long[]{0x000003C03A61C022L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclarartion3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDefinition3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleEventDefinition3946 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleEventDefinition3959 = new BitSet(new long[]{0x007FFFF800000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleEventDefinition3980 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleEventDefinition3993 = new BitSet(new long[]{0x007FFFF800000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEventDefinition4016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDeclaration4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_entryRuleXID4241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXID4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXID4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleXID4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleXID4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleXID4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleXID4373 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN4718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN4776 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleFQN4795 = new BitSet(new long[]{0x007FFFF800000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN4817 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction4866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionReaction4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_ruleTransitionReaction4931 = new BitSet(new long[]{0x0100000002000002L});
    public static final BitSet FOLLOW_25_in_ruleTransitionReaction4945 = new BitSet(new long[]{0x20600000808003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransitionReaction4966 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleTransitionReaction4981 = new BitSet(new long[]{0x0200000000000012L});
    public static final BitSet FOLLOW_ruleTransitionProperty_in_ruleTransitionReaction5002 = new BitSet(new long[]{0x0200000000000012L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStextTrigger5051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger5160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultTrigger5170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDefaultTrigger5217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDefaultTrigger5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionProperty_in_entryRuleTransitionProperty5272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionProperty5282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_ruleTransitionProperty5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_ruleTransitionProperty5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec5391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryPointSpec5401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleEntryPointSpec5438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntryPointSpec5455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec5496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitPointSpec5506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExitPointSpec5548 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleExitPointSpec5565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularEventSpec5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeEventSpec5703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5749 = new BitSet(new long[]{0x20600000808003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec5770 = new BitSet(new long[]{0x0000000000000000L,0x0000001E00000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinEventSpec5837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec5938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent5973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryEvent5983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleEntryEvent6029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent6065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent6075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleExitEvent6121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent6157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEvent6167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAlwaysEvent6214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAlwaysEvent6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpression6329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression6373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6420 = new BitSet(new long[]{0x0000000000040002L,0x00000000001FF800L});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6450 = new BitSet(new long[]{0x20600000808003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6471 = new BitSet(new long[]{0x0000000000040002L,0x00000000001FF800L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression6519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6566 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleConditionalExpression6587 = new BitSet(new long[]{0x20600000808003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6608 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleConditionalExpression6620 = new BitSet(new long[]{0x20600000808003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression6689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6736 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleLogicalOrExpression6757 = new BitSet(new long[]{0x20600000808003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6778 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression6826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6873 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleLogicalAndExpression6894 = new BitSet(new long[]{0x20600000808003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6915 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression6953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNotExpression6963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleLogicalNotExpression7037 = new BitSet(new long[]{0x00600000808003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression7105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7152 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleBitwiseXorExpression7173 = new BitSet(new long[]{0x00600000808003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7194 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression7242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7289 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleBitwiseOrExpression7310 = new BitSet(new long[]{0x00600000808003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7331 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression7379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7426 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleBitwiseAndExpression7447 = new BitSet(new long[]{0x00600000808003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7468 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalRelationExpression7516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7563 = new BitSet(new long[]{0x0200000000000002L,0x00000001F0000000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7593 = new BitSet(new long[]{0x00600000808003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7614 = new BitSet(new long[]{0x0200000000000002L,0x00000001F0000000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression7662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7709 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression7739 = new BitSet(new long[]{0x00600000808003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7760 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7855 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7885 = new BitSet(new long[]{0x00600000808003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7906 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression7944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression7954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8001 = new BitSet(new long[]{0x0000000002000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8031 = new BitSet(new long[]{0x00600000808003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8052 = new BitSet(new long[]{0x0000000002000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8183 = new BitSet(new long[]{0x00600000808003F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValueExpression8251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall8352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8399 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleFeatureCall8420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureCall8440 = new BitSet(new long[]{0x0080000000800002L});
    public static final BitSet FOLLOW_23_in_ruleFeatureCall8474 = new BitSet(new long[]{0x20600000818003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8509 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_30_in_ruleFeatureCall8522 = new BitSet(new long[]{0x20600000808003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8543 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_24_in_ruleFeatureCall8559 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementReferenceExpression8609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementReferenceExpression8663 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleElementReferenceExpression8697 = new BitSet(new long[]{0x20600000818003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8732 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_30_in_ruleElementReferenceExpression8745 = new BitSet(new long[]{0x20600000808003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8766 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_24_in_ruleElementReferenceExpression8782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression8820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventValueReferenceExpression8830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleEventValueReferenceExpression8876 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEventValueReferenceExpression8888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression8909 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleEventValueReferenceExpression8921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression8957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression8967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleActiveStateReferenceExpression9013 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleActiveStateReferenceExpression9025 = new BitSet(new long[]{0x007FFFF800000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9048 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleActiveStateReferenceExpression9060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression9096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression9106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleParenthesizedExpression9152 = new BitSet(new long[]{0x20600000808003F0L,0x0000000009800000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression9173 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleParenthesizedExpression9185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral9221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral9231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral9278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral9305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_ruleLiteral9332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleLiteral9359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral9386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral9431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral9482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral9533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral9584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral9635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRealLiteral9686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexLiteral9737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleHexLiteral9788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral9890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCombineOperator9945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleCombineOperator9962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleCombineOperator9979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCombineOperator9996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCombineOperator10013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleCombineOperator10030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleCombineOperator10047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleCombineOperator10064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleDirection10109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleDirection10126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDirection10143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleTimeEventType10188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleTimeEventType10205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAssignmentOperator10250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleAssignmentOperator10267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleAssignmentOperator10284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAssignmentOperator10301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleAssignmentOperator10318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleAssignmentOperator10335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleAssignmentOperator10352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleAssignmentOperator10369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleAssignmentOperator10386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleAssignmentOperator10403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleAssignmentOperator10420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleShiftOperator10465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleShiftOperator10482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleAdditiveOperator10527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleAdditiveOperator10544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleMultiplicativeOperator10589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMultiplicativeOperator10606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleMultiplicativeOperator10623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleUnaryOperator10668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleUnaryOperator10685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleUnaryOperator10702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleRelationalOperator10747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleRelationalOperator10764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleRelationalOperator10781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleRelationalOperator10798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleRelationalOperator10815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleRelationalOperator10832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleTimeUnit10877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleTimeUnit10894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleTimeUnit10911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleTimeUnit10928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred1_InternalSynctext2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred2_InternalSynctext8456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred3_InternalSynctext8679 = new BitSet(new long[]{0x0000000000000002L});

}