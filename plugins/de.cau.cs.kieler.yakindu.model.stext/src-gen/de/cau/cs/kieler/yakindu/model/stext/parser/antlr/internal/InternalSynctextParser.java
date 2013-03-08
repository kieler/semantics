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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_FLOAT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'signal'", "';'", "'variable'", "'/'", "'Suspend'", "'&&'", "'Entry'", "'During'", "'Exit'", "'#'", "'['", "']'", "','", "'pre'", "'('", "')'", "'@@statechart@@'", "'@@state@@'", "'@@transition@@'", "'namespace'", "'interface'", "':'", "'internal'", "'event'", "'operation'", "'local'", "'in'", "'out'", "'var'", "'readonly'", "'external'", "'default'", "'else'", "'entry'", "'exit'", "'always'", "'oncycle'", "'raise'", "'valueof'", "'active'", "'.'", "'>'", "'?'", "'||'", "'!'", "'^'", "'|'", "'&'", "'after'", "'every'", "'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'%'", "'~'", "'<'", "'<='", "'>='", "'=='", "'!='", "'s'", "'ms'", "'us'", "'ns'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_BOOL=6;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=8;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__90=90;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_FLOAT=7;
    public static final int T__85=85;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=9;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

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

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_INT)||LA2_0==14||(LA2_0>=16 && LA2_0<=17)||(LA2_0>=20 && LA2_0<=24)||LA2_0==38) ) {
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
            	    case 16:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 14:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    case RULE_ID:
            	    case RULE_INT:
            	    case 17:
            	    case 20:
            	    case 21:
            	    case 22:
            	    case 23:
            	    case 24:
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:200:1: ruleSignalDefinition returns [EObject current=null] : ( () otherlv_1= 'signal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleSignalDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:203:28: ( ( () otherlv_1= 'signal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:204:1: ( () otherlv_1= 'signal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:204:1: ( () otherlv_1= 'signal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:204:2: () otherlv_1= 'signal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleSignalDefinition385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSignalDefinitionAccess().getSignalKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:214:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:215:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:215:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:216:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalDefinition402); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSignalDefinition419); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:244:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:245:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:246:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition455);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition465); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:253:1: ruleVariableDefinition returns [EObject current=null] : ( () otherlv_1= 'variable' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:256:28: ( ( () otherlv_1= 'variable' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:257:1: ( () otherlv_1= 'variable' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:257:1: ( () otherlv_1= 'variable' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:257:2: () otherlv_1= 'variable' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:257:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:258:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleVariableDefinition511); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableDefinitionAccess().getVariableKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:267:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:268:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:268:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:269:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDefinition528); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleVariableDefinition545); if (state.failed) return current;
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


    // $ANTLR start "entryRuleLocalReaction"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:297:1: entryRuleLocalReaction returns [EObject current=null] : iv_ruleLocalReaction= ruleLocalReaction EOF ;
    public final EObject entryRuleLocalReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:298:2: (iv_ruleLocalReaction= ruleLocalReaction EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:299:2: iv_ruleLocalReaction= ruleLocalReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction581);
            iv_ruleLocalReaction=ruleLocalReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReaction591); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:306:1: ruleLocalReaction returns [EObject current=null] : ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:309:28: ( ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:310:1: ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:310:1: ( ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:310:2: ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )? (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) ) otherlv_3= ';'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:310:2: ( ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_INT)||(LA4_0>=20 && LA4_0<=24)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:311:1: ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:311:1: ( (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:312:1: (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:312:1: (lv_trigger_0_1= ruleLocalReactionTrigger | lv_trigger_0_2= ruleReactionTrigger )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>=20 && LA3_0<=22)) ) {
                        alt3=1;
                    }
                    else if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_INT)||(LA3_0>=23 && LA3_0<=24)) ) {
                        alt3=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:313:3: lv_trigger_0_1= ruleLocalReactionTrigger
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerLocalReactionTriggerParserRuleCall_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleLocalReactionTrigger_in_ruleLocalReaction639);
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
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:328:8: lv_trigger_0_2= ruleReactionTrigger
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerReactionTriggerParserRuleCall_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReaction658);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:346:3: (otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:346:5: otherlv_1= '/' ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) )
            {
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleLocalReaction675); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalReactionAccess().getSolidusKeyword_1_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:350:1: ( ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:351:1: ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:351:1: ( (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:352:1: (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:352:1: (lv_effect_2_1= ruleReactionEffect | lv_effect_2_2= ruleSuspendEffect )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)||(LA5_0>=27 && LA5_0<=28)||(LA5_0>=52 && LA5_0<=53)||LA5_0==58||(LA5_0>=77 && LA5_0<=78)||LA5_0==81) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:353:3: lv_effect_2_1= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectReactionEffectParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalReaction698);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:368:8: lv_effect_2_2= ruleSuspendEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectSuspendEffectParserRuleCall_1_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSuspendEffect_in_ruleLocalReaction717);
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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleLocalReaction733); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:398:1: entryRuleSuspendEffect returns [EObject current=null] : iv_ruleSuspendEffect= ruleSuspendEffect EOF ;
    public final EObject entryRuleSuspendEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspendEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:399:2: (iv_ruleSuspendEffect= ruleSuspendEffect EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:400:2: iv_ruleSuspendEffect= ruleSuspendEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuspendEffectRule()); 
            }
            pushFollow(FOLLOW_ruleSuspendEffect_in_entryRuleSuspendEffect769);
            iv_ruleSuspendEffect=ruleSuspendEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuspendEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuspendEffect779); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:407:1: ruleSuspendEffect returns [EObject current=null] : ( () otherlv_1= 'Suspend' ) ;
    public final EObject ruleSuspendEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:410:28: ( ( () otherlv_1= 'Suspend' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:411:1: ( () otherlv_1= 'Suspend' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:411:1: ( () otherlv_1= 'Suspend' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:411:2: () otherlv_1= 'Suspend'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:411:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:412:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSuspendEffectAccess().getSuspendEffectAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleSuspendEffect825); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:429:1: entryRuleLocalReactionTrigger returns [EObject current=null] : iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF ;
    public final EObject entryRuleLocalReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:430:2: (iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:431:2: iv_ruleLocalReactionTrigger= ruleLocalReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReactionTrigger_in_entryRuleLocalReactionTrigger861);
            iv_ruleLocalReactionTrigger=ruleLocalReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReactionTrigger871); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:438:1: ruleLocalReactionTrigger returns [EObject current=null] : ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? ) ;
    public final EObject ruleLocalReactionTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_stateReaction_1_0 = null;

        EObject lv_reactionTrigger_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:441:28: ( ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:442:1: ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:442:1: ( () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )? )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:442:2: () ( (lv_stateReaction_1_0= ruleStateReaction ) ) (otherlv_2= '&&' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )?
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:442:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:443:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:448:2: ( (lv_stateReaction_1_0= ruleStateReaction ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:449:1: (lv_stateReaction_1_0= ruleStateReaction )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:449:1: (lv_stateReaction_1_0= ruleStateReaction )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:450:3: lv_stateReaction_1_0= ruleStateReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getStateReactionStateReactionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateReaction_in_ruleLocalReactionTrigger926);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:466:2: (otherlv_2= '&&' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:466:4: otherlv_2= '&&' ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )?
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleLocalReactionTrigger939); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLocalReactionTriggerAccess().getAmpersandAmpersandKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:470:1: ( (lv_reactionTrigger_3_0= ruleReactionTrigger ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_INT)||(LA6_0>=23 && LA6_0<=24)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:471:1: (lv_reactionTrigger_3_0= ruleReactionTrigger )
                            {
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:471:1: (lv_reactionTrigger_3_0= ruleReactionTrigger )
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:472:3: lv_reactionTrigger_3_0= ruleReactionTrigger
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalReactionTriggerAccess().getReactionTriggerReactionTriggerParserRuleCall_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReactionTrigger960);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:496:1: entryRuleStateReaction returns [EObject current=null] : iv_ruleStateReaction= ruleStateReaction EOF ;
    public final EObject entryRuleStateReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:497:2: (iv_ruleStateReaction= ruleStateReaction EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:498:2: iv_ruleStateReaction= ruleStateReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateReactionRule()); 
            }
            pushFollow(FOLLOW_ruleStateReaction_in_entryRuleStateReaction999);
            iv_ruleStateReaction=ruleStateReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateReaction1009); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:505:1: ruleStateReaction returns [EObject current=null] : (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit ) ;
    public final EObject ruleStateReaction() throws RecognitionException {
        EObject current = null;

        EObject this_Entry_0 = null;

        EObject this_Inside_1 = null;

        EObject this_Exit_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:508:28: ( (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:509:1: (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:509:1: (this_Entry_0= ruleEntry | this_Inside_1= ruleInside | this_Exit_2= ruleExit )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:510:5: this_Entry_0= ruleEntry
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getEntryParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntry_in_ruleStateReaction1056);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:520:5: this_Inside_1= ruleInside
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getInsideParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInside_in_ruleStateReaction1083);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:530:5: this_Exit_2= ruleExit
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateReactionAccess().getExitParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExit_in_ruleStateReaction1110);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:546:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:547:2: (iv_ruleEntry= ruleEntry EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:548:2: iv_ruleEntry= ruleEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryRule()); 
            }
            pushFollow(FOLLOW_ruleEntry_in_entryRuleEntry1145);
            iv_ruleEntry=ruleEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntry1155); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:555:1: ruleEntry returns [EObject current=null] : ( () otherlv_1= 'Entry' ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:558:28: ( ( () otherlv_1= 'Entry' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:559:1: ( () otherlv_1= 'Entry' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:559:1: ( () otherlv_1= 'Entry' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:559:2: () otherlv_1= 'Entry'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:559:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:560:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryAccess().getEntryAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleEntry1201); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:577:1: entryRuleInside returns [EObject current=null] : iv_ruleInside= ruleInside EOF ;
    public final EObject entryRuleInside() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInside = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:578:2: (iv_ruleInside= ruleInside EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:579:2: iv_ruleInside= ruleInside EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsideRule()); 
            }
            pushFollow(FOLLOW_ruleInside_in_entryRuleInside1237);
            iv_ruleInside=ruleInside();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInside; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInside1247); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:586:1: ruleInside returns [EObject current=null] : ( () otherlv_1= 'During' ) ;
    public final EObject ruleInside() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:589:28: ( ( () otherlv_1= 'During' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:590:1: ( () otherlv_1= 'During' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:590:1: ( () otherlv_1= 'During' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:590:2: () otherlv_1= 'During'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:590:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:591:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInsideAccess().getInsideAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleInside1293); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:608:1: entryRuleExit returns [EObject current=null] : iv_ruleExit= ruleExit EOF ;
    public final EObject entryRuleExit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExit = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:609:2: (iv_ruleExit= ruleExit EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:610:2: iv_ruleExit= ruleExit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitRule()); 
            }
            pushFollow(FOLLOW_ruleExit_in_entryRuleExit1329);
            iv_ruleExit=ruleExit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExit1339); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:617:1: ruleExit returns [EObject current=null] : ( () otherlv_1= 'Exit' ) ;
    public final EObject ruleExit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:620:28: ( ( () otherlv_1= 'Exit' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:621:1: ( () otherlv_1= 'Exit' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:621:1: ( () otherlv_1= 'Exit' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:621:2: () otherlv_1= 'Exit'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:621:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:622:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitAccess().getExitAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleExit1385); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:639:1: entryRuleReactionTrigger returns [EObject current=null] : iv_ruleReactionTrigger= ruleReactionTrigger EOF ;
    public final EObject entryRuleReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:640:2: (iv_ruleReactionTrigger= ruleReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:641:2: iv_ruleReactionTrigger= ruleReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1421);
            iv_ruleReactionTrigger=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionTrigger1431); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:648:1: ruleReactionTrigger returns [EObject current=null] : ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:651:28: ( ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:652:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:652:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:652:2: () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:652:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:653:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:658:2: ( (lv_isImmediate_1_0= '#' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:659:1: (lv_isImmediate_1_0= '#' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:659:1: (lv_isImmediate_1_0= '#' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:660:3: lv_isImmediate_1_0= '#'
                    {
                    lv_isImmediate_1_0=(Token)match(input,23,FOLLOW_23_in_ruleReactionTrigger1483); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:673:3: ( (lv_delay_2_0= RULE_INT ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:674:1: (lv_delay_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:674:1: (lv_delay_2_0= RULE_INT )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:675:3: lv_delay_2_0= RULE_INT
                    {
                    lv_delay_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReactionTrigger1514); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:691:3: ( ( (lv_trigger_3_0= ruleRegularEventSpec ) ) | (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==24) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:691:4: ( (lv_trigger_3_0= ruleRegularEventSpec ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:691:4: ( (lv_trigger_3_0= ruleRegularEventSpec ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:692:1: (lv_trigger_3_0= ruleRegularEventSpec )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:692:1: (lv_trigger_3_0= ruleRegularEventSpec )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:693:3: lv_trigger_3_0= ruleRegularEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggerRegularEventSpecParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRegularEventSpec_in_ruleReactionTrigger1542);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:710:6: (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:710:6: (otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:710:8: otherlv_4= '[' ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleReactionTrigger1561); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_3_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:714:1: ( (lv_guardExpression_5_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:715:1: (lv_guardExpression_5_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:715:1: (lv_guardExpression_5_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:716:3: lv_guardExpression_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger1582);
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

                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleReactionTrigger1594); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:744:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:745:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:746:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect1632);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionEffect1642); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:753:1: ruleReactionEffect returns [EObject current=null] : ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_0 = null;

        EObject lv_actions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:756:28: ( ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:757:1: ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:757:1: ( () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:757:2: () ( (lv_actions_1_0= ruleExpression ) ) ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:757:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:758:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:763:2: ( (lv_actions_1_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:764:1: (lv_actions_1_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:764:1: (lv_actions_1_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:765:3: lv_actions_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect1697);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:781:2: ( ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) && (synpred1_InternalSynctext())) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:781:3: ( ( ',' )=>otherlv_2= ',' ) ( (lv_actions_3_0= ruleExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:781:3: ( ( ',' )=>otherlv_2= ',' )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:781:4: ( ',' )=>otherlv_2= ','
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleReactionEffect1718); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReactionEffectAccess().getCommaKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:786:2: ( (lv_actions_3_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:787:1: (lv_actions_3_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:787:1: (lv_actions_3_0= ruleExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:788:3: lv_actions_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect1740);
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
            	    break loop12;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:812:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:813:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:814:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1778);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression1788); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:821:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:824:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:825:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:825:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_PreValueExpression_3= rulePreValueExpression | this_ParenthesizedExpression_4= ruleParenthesizedExpression | this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression )
            int alt13=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_HEX:
            case RULE_STRING:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
                {
                alt13=2;
                }
                break;
            case 53:
                {
                alt13=3;
                }
                break;
            case 27:
                {
                alt13=4;
                }
                break;
            case 28:
                {
                alt13=5;
                }
                break;
            case 52:
                {
                alt13=6;
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:826:5: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrimitiveValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression1835);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:836:5: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression1862);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:846:5: this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getActiveStateReferenceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression1889);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:856:5: this_PreValueExpression_3= rulePreValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPreValueExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_rulePreValueExpression_in_rulePrimaryExpression1916);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:866:5: this_ParenthesizedExpression_4= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression1943);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:876:5: this_EventValueReferenceExpression_5= ruleEventValueReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEventValueReferenceExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression1970);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:892:1: entryRulePreValueExpression returns [EObject current=null] : iv_rulePreValueExpression= rulePreValueExpression EOF ;
    public final EObject entryRulePreValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:893:2: (iv_rulePreValueExpression= rulePreValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:894:2: iv_rulePreValueExpression= rulePreValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePreValueExpression_in_entryRulePreValueExpression2005);
            iv_rulePreValueExpression=rulePreValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreValueExpression2015); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:901:1: rulePreValueExpression returns [EObject current=null] : ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject rulePreValueExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:904:28: ( ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:905:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:905:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:905:2: () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:905:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:906:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPreValueExpressionAccess().getPreValueExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_rulePreValueExpression2061); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPreValueExpressionAccess().getPreKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,28,FOLLOW_28_in_rulePreValueExpression2073); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPreValueExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:919:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:920:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:920:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:921:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPreValueExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_rulePreValueExpression2094);
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

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_rulePreValueExpression2106); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:951:1: entryRuleDefRoot returns [EObject current=null] : iv_ruleDefRoot= ruleDefRoot EOF ;
    public final EObject entryRuleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:952:2: (iv_ruleDefRoot= ruleDefRoot EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:953:2: iv_ruleDefRoot= ruleDefRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefRootRule()); 
            }
            pushFollow(FOLLOW_ruleDefRoot_in_entryRuleDefRoot2144);
            iv_ruleDefRoot=ruleDefRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRoot2154); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:960:1: ruleDefRoot returns [EObject current=null] : (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) ;
    public final EObject ruleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject this_StatechartRoot_0 = null;

        EObject this_StateRoot_1 = null;

        EObject this_TransitionRoot_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:963:28: ( (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:964:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:964:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt14=1;
                }
                break;
            case 31:
                {
                alt14=2;
                }
                break;
            case 32:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:965:5: this_StatechartRoot_0= ruleStatechartRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStatechartRootParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatechartRoot_in_ruleDefRoot2201);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:975:5: this_StateRoot_1= ruleStateRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStateRootParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStateRoot_in_ruleDefRoot2228);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:985:5: this_TransitionRoot_2= ruleTransitionRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getTransitionRootParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransitionRoot_in_ruleDefRoot2255);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1001:1: entryRuleStatechartRoot returns [EObject current=null] : iv_ruleStatechartRoot= ruleStatechartRoot EOF ;
    public final EObject entryRuleStatechartRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1002:2: (iv_ruleStatechartRoot= ruleStatechartRoot EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1003:2: iv_ruleStatechartRoot= ruleStatechartRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartRootRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2290);
            iv_ruleStatechartRoot=ruleStatechartRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartRoot2300); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1010:1: ruleStatechartRoot returns [EObject current=null] : (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) ;
    public final EObject ruleStatechartRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1013:28: ( (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1014:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1014:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1014:3: otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleStatechartRoot2337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatechartRootAccess().getStatechartKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1018:1: ( (lv_def_1_0= ruleStatechartSpecification ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1019:1: (lv_def_1_0= ruleStatechartSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1019:1: (lv_def_1_0= ruleStatechartSpecification )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1020:3: lv_def_1_0= ruleStatechartSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatechartRootAccess().getDefStatechartSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2358);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1044:1: entryRuleStateRoot returns [EObject current=null] : iv_ruleStateRoot= ruleStateRoot EOF ;
    public final EObject entryRuleStateRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1045:2: (iv_ruleStateRoot= ruleStateRoot EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1046:2: iv_ruleStateRoot= ruleStateRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRootRule()); 
            }
            pushFollow(FOLLOW_ruleStateRoot_in_entryRuleStateRoot2394);
            iv_ruleStateRoot=ruleStateRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateRoot2404); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1053:1: ruleStateRoot returns [EObject current=null] : (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) ;
    public final EObject ruleStateRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1056:28: ( (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1057:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1057:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1057:3: otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleStateRoot2441); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateRootAccess().getStateKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1061:1: ( (lv_def_1_0= ruleStateSpecification ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1062:1: (lv_def_1_0= ruleStateSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1062:1: (lv_def_1_0= ruleStateSpecification )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1063:3: lv_def_1_0= ruleStateSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateRootAccess().getDefStateSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_ruleStateRoot2462);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1087:1: entryRuleTransitionRoot returns [EObject current=null] : iv_ruleTransitionRoot= ruleTransitionRoot EOF ;
    public final EObject entryRuleTransitionRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1088:2: (iv_ruleTransitionRoot= ruleTransitionRoot EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1089:2: iv_ruleTransitionRoot= ruleTransitionRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRootRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2498);
            iv_ruleTransitionRoot=ruleTransitionRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionRoot2508); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1096:1: ruleTransitionRoot returns [EObject current=null] : (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) ;
    public final EObject ruleTransitionRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1099:28: ( (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1100:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1100:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1100:3: otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleTransitionRoot2545); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionRootAccess().getTransitionKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1104:1: ( (lv_def_1_0= ruleTransitionSpecification ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1105:1: (lv_def_1_0= ruleTransitionSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1105:1: (lv_def_1_0= ruleTransitionSpecification )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1106:3: lv_def_1_0= ruleTransitionSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionRootAccess().getDefTransitionSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2566);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1132:1: entryRuleStatechartSpecification returns [EObject current=null] : iv_ruleStatechartSpecification= ruleStatechartSpecification EOF ;
    public final EObject entryRuleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1133:2: (iv_ruleStatechartSpecification= ruleStatechartSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1134:2: iv_ruleStatechartSpecification= ruleStatechartSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2604);
            iv_ruleStatechartSpecification=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartSpecification2614); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1141:1: ruleStatechartSpecification returns [EObject current=null] : ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) ;
    public final EObject ruleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        EObject lv_scopes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1144:28: ( ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1145:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1145:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1145:2: () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )*
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1145:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1146:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatechartSpecificationAccess().getStatechartSpecificationAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1151:2: (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1151:4: otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleStatechartSpecification2661); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatechartSpecificationAccess().getNamespaceKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1155:1: ( (lv_namespace_2_0= ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1156:1: (lv_namespace_2_0= ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1156:1: (lv_namespace_2_0= ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1157:3: lv_namespace_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getNamespaceFQNParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleStatechartSpecification2682);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1173:4: ( (lv_scopes_3_0= ruleStatechartScope ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34||LA16_0==36) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1174:1: (lv_scopes_3_0= ruleStatechartScope )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1174:1: (lv_scopes_3_0= ruleStatechartScope )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1175:3: lv_scopes_3_0= ruleStatechartScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getScopesStatechartScopeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification2705);
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
    // $ANTLR end "ruleStatechartSpecification"


    // $ANTLR start "entryRuleStateSpecification"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1199:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1200:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1201:2: iv_ruleStateSpecification= ruleStateSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification2742);
            iv_ruleStateSpecification=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateSpecification2752); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1208:1: ruleStateSpecification returns [EObject current=null] : ( (lv_scope_0_0= ruleStateScope ) ) ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_scope_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1211:28: ( ( (lv_scope_0_0= ruleStateScope ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1212:1: ( (lv_scope_0_0= ruleStateScope ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1212:1: ( (lv_scope_0_0= ruleStateScope ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1213:1: (lv_scope_0_0= ruleStateScope )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1213:1: (lv_scope_0_0= ruleStateScope )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1214:3: lv_scope_0_0= ruleStateScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateSpecificationAccess().getScopeStateScopeParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateScope_in_ruleStateSpecification2797);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1238:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1239:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1240:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification2832);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification2842); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1247:1: ruleTransitionSpecification returns [EObject current=null] : ( (lv_reaction_0_0= ruleTransitionReaction ) ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_reaction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1250:28: ( ( (lv_reaction_0_0= ruleTransitionReaction ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1251:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1251:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1252:1: (lv_reaction_0_0= ruleTransitionReaction )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1252:1: (lv_reaction_0_0= ruleTransitionReaction )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1253:3: lv_reaction_0_0= ruleTransitionReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getReactionTransitionReactionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification2887);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1279:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1280:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1281:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope2924);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartScope2934); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1288:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1291:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1292:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1292:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            else if ( (LA17_0==36) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1293:5: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStatechartScope2981);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1303:5: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalScope_in_ruleStatechartScope3008);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1321:1: entryRuleInterfaceScope returns [EObject current=null] : iv_ruleInterfaceScope= ruleInterfaceScope EOF ;
    public final EObject entryRuleInterfaceScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1322:2: (iv_ruleInterfaceScope= ruleInterfaceScope EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1323:2: iv_ruleInterfaceScope= ruleInterfaceScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3045);
            iv_ruleInterfaceScope=ruleInterfaceScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceScope3055); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1330:1: ruleInterfaceScope returns [EObject current=null] : ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1333:28: ( ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1334:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1334:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1334:2: () otherlv_1= 'interface' ( (lv_name_2_0= ruleXID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1334:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1335:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInterfaceScopeAccess().getInterfaceScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleInterfaceScope3101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceScopeAccess().getInterfaceKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1344:1: ( (lv_name_2_0= ruleXID ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||(LA18_0>=33 && LA18_0<=34)||(LA18_0>=36 && LA18_0<=53)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1345:1: (lv_name_2_0= ruleXID )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1345:1: (lv_name_2_0= ruleXID )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1346:3: lv_name_2_0= ruleXID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getNameXIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXID_in_ruleInterfaceScope3122);
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

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleInterfaceScope3135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInterfaceScopeAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1366:1: ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16||(LA20_0>=37 && LA20_0<=41)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1367:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1367:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1368:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1368:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration )
            	    int alt19=3;
            	    switch ( input.LA(1) ) {
            	    case 37:
            	    case 39:
            	    case 40:
            	    case 41:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 16:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 38:
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1369:3: lv_declarations_4_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3158);
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1384:8: lv_declarations_4_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3177);
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1399:8: lv_declarations_4_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_4_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3196);
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
    // $ANTLR end "ruleInterfaceScope"


    // $ANTLR start "entryRuleInternalScope"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1425:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1426:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1427:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInternalScope_in_entryRuleInternalScope3236);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalScope3246); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1434:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1437:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1438:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1438:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1438:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1438:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1439:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInternalScopeAccess().getInternalScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleInternalScope3292); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleInternalScope3304); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1452:1: ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_INT)||(LA22_0>=16 && LA22_0<=17)||(LA22_0>=20 && LA22_0<=24)||(LA22_0>=37 && LA22_0<=41)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1453:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1453:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1454:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1454:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    int alt21=4;
            	    switch ( input.LA(1) ) {
            	    case 37:
            	    case 39:
            	    case 40:
            	    case 41:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 16:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    case RULE_ID:
            	    case RULE_INT:
            	    case 17:
            	    case 20:
            	    case 21:
            	    case 22:
            	    case 23:
            	    case 24:
            	        {
            	        alt21=4;
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1455:3: lv_declarations_3_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3327);
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1470:8: lv_declarations_3_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3346);
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1485:8: lv_declarations_3_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3365);
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
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1500:8: lv_declarations_3_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsLocalReactionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleInternalScope3384);
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
    // $ANTLR end "ruleInternalScope"


    // $ANTLR start "entryRuleEventDeclarartion"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1528:1: entryRuleEventDeclarartion returns [EObject current=null] : iv_ruleEventDeclarartion= ruleEventDeclarartion EOF ;
    public final EObject entryRuleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclarartion = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1529:2: (iv_ruleEventDeclarartion= ruleEventDeclarartion EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1530:2: iv_ruleEventDeclarartion= ruleEventDeclarartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarartionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3426);
            iv_ruleEventDeclarartion=ruleEventDeclarartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclarartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclarartion3436); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1537:1: ruleEventDeclarartion returns [EObject current=null] : this_EventDefinition_0= ruleEventDefinition ;
    public final EObject ruleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject this_EventDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1540:28: (this_EventDefinition_0= ruleEventDefinition )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1542:5: this_EventDefinition_0= ruleEventDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEventDeclarartionAccess().getEventDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3482);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1560:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1561:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1562:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3518);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDefinition3528); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1569:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1572:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1573:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1573:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1573:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= ruleXID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1573:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=39 && LA23_0<=41)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1574:1: (lv_direction_0_0= ruleDirection )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1574:1: (lv_direction_0_0= ruleDirection )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1575:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_ruleEventDefinition3574);
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

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleEventDefinition3587); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1595:1: ( (lv_name_2_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1596:1: (lv_name_2_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1596:1: (lv_name_2_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1597:3: lv_name_2_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getNameXIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleEventDefinition3608);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1613:2: (otherlv_3= ':' ( ( ruleFQN ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1613:4: otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleEventDefinition3621); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1617:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1618:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1618:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1619:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getTypeTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEventDefinition3644);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1640:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1641:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1642:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3682);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration3692); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1649:1: ruleVariableDeclaration returns [EObject current=null] : this_VariableDefinition_0= ruleVariableDefinition ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1652:28: (this_VariableDefinition_0= ruleVariableDefinition )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1654:5: this_VariableDefinition_0= ruleVariableDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration3738);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1672:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1673:2: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1674:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration3774);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDeclaration3784); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1681:1: ruleOperationDeclaration returns [EObject current=null] : this_OperationDefinition_0= ruleOperationDefinition ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1684:28: (this_OperationDefinition_0= ruleOperationDefinition )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1686:5: this_OperationDefinition_0= ruleOperationDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOperationDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration3830);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1704:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1705:2: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1706:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition3866);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDefinition3876); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1713:1: ruleOperationDefinition returns [EObject current=null] : ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1716:28: ( ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1717:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1717:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1717:2: () otherlv_1= 'operation' ( (lv_name_2_0= ruleXID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1717:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1718:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationDefinitionAccess().getOperationDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleOperationDefinition3922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionAccess().getOperationKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1727:1: ( (lv_name_2_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1728:1: (lv_name_2_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1728:1: (lv_name_2_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1729:3: lv_name_2_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getNameXIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleOperationDefinition3943);
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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleOperationDefinition3955); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1749:1: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID||(LA26_0>=33 && LA26_0<=34)||(LA26_0>=36 && LA26_0<=53)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1749:2: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1749:2: ( (lv_parameters_4_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1750:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1750:1: (lv_parameters_4_0= ruleParameter )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1751:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition3977);
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

                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1767:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==26) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1767:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleOperationDefinition3990); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getOperationDefinitionAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1771:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1772:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1772:1: (lv_parameters_6_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1773:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition4011);
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
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleOperationDefinition4027); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1793:1: (otherlv_8= ':' ( ( ruleFQN ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1793:3: otherlv_8= ':' ( ( ruleFQN ) )
                    {
                    otherlv_8=(Token)match(input,35,FOLLOW_35_in_ruleOperationDefinition4040); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getOperationDefinitionAccess().getColonKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1797:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1798:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1798:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1799:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getTypeTypeCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition4063);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1820:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1821:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1822:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter4101);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter4111); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1829:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1832:28: ( ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1833:1: ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1833:1: ( ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1833:2: ( (lv_name_0_0= ruleXID ) ) otherlv_1= ':' ( ( ruleFQN ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1833:2: ( (lv_name_0_0= ruleXID ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1834:1: (lv_name_0_0= ruleXID )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1834:1: (lv_name_0_0= ruleXID )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1835:3: lv_name_0_0= ruleXID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getNameXIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXID_in_ruleParameter4157);
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

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleParameter4169); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1855:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1856:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1856:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1857:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleParameter4192);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1878:1: entryRuleXID returns [String current=null] : iv_ruleXID= ruleXID EOF ;
    public final String entryRuleXID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXID = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1879:2: (iv_ruleXID= ruleXID EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1880:2: iv_ruleXID= ruleXID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIDRule()); 
            }
            pushFollow(FOLLOW_ruleXID_in_entryRuleXID4229);
            iv_ruleXID=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXID4240); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1887:1: ruleXID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) ;
    public final AntlrDatatypeRuleToken ruleXID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1890:28: ( (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1891:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1891:1: (this_ID_0= RULE_ID | kw= 'namespace' | kw= 'interface' | kw= 'internal' | kw= 'event' | kw= 'local' | kw= 'in' | kw= 'out' | kw= 'var' | kw= 'readonly' | kw= 'external' | kw= 'operation' | kw= 'default' | kw= 'else' | kw= 'entry' | kw= 'exit' | kw= 'always' | kw= 'oncycle' | kw= 'raise' | kw= 'valueof' | kw= 'active' )
            int alt28=21;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt28=1;
                }
                break;
            case 33:
                {
                alt28=2;
                }
                break;
            case 34:
                {
                alt28=3;
                }
                break;
            case 36:
                {
                alt28=4;
                }
                break;
            case 37:
                {
                alt28=5;
                }
                break;
            case 39:
                {
                alt28=6;
                }
                break;
            case 40:
                {
                alt28=7;
                }
                break;
            case 41:
                {
                alt28=8;
                }
                break;
            case 42:
                {
                alt28=9;
                }
                break;
            case 43:
                {
                alt28=10;
                }
                break;
            case 44:
                {
                alt28=11;
                }
                break;
            case 38:
                {
                alt28=12;
                }
                break;
            case 45:
                {
                alt28=13;
                }
                break;
            case 46:
                {
                alt28=14;
                }
                break;
            case 47:
                {
                alt28=15;
                }
                break;
            case 48:
                {
                alt28=16;
                }
                break;
            case 49:
                {
                alt28=17;
                }
                break;
            case 50:
                {
                alt28=18;
                }
                break;
            case 51:
                {
                alt28=19;
                }
                break;
            case 52:
                {
                alt28=20;
                }
                break;
            case 53:
                {
                alt28=21;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1891:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXID4280); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getXIDAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1900:2: kw= 'namespace'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleXID4304); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getNamespaceKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1907:2: kw= 'interface'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleXID4323); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInterfaceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1914:2: kw= 'internal'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleXID4342); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInternalKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1921:2: kw= 'event'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleXID4361); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEventKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1928:2: kw= 'local'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleXID4380); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getLocalKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1935:2: kw= 'in'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleXID4399); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getInKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1942:2: kw= 'out'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleXID4418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOutKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1949:2: kw= 'var'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleXID4437); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getVarKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1956:2: kw= 'readonly'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleXID4456); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getReadonlyKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1963:2: kw= 'external'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleXID4475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExternalKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1970:2: kw= 'operation'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleXID4494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOperationKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1977:2: kw= 'default'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleXID4513); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getDefaultKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1984:2: kw= 'else'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleXID4532); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getElseKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1991:2: kw= 'entry'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleXID4551); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getEntryKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:1998:2: kw= 'exit'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleXID4570); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getExitKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2005:2: kw= 'always'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleXID4589); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getAlwaysKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2012:2: kw= 'oncycle'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleXID4608); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getOncycleKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2019:2: kw= 'raise'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleXID4627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getRaiseKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2026:2: kw= 'valueof'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleXID4646); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getXIDAccess().getValueofKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2033:2: kw= 'active'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleXID4665); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2046:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2047:2: (iv_ruleFQN= ruleFQN EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2048:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN4706);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN4717); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2055:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_XID_0 = null;

        AntlrDatatypeRuleToken this_XID_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2058:28: ( (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2059:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2059:1: (this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2060:5: this_XID_0= ruleXID (kw= '.' this_XID_2= ruleXID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXID_in_ruleFQN4764);
            this_XID_0=ruleXID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_XID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2070:1: (kw= '.' this_XID_2= ruleXID )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==54) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2071:2: kw= '.' this_XID_2= ruleXID
            	    {
            	    kw=(Token)match(input,54,FOLLOW_54_in_ruleFQN4783); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getFQNAccess().getXIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleXID_in_ruleFQN4805);
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleTransitionReaction"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2097:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2098:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2099:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction4854);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionReaction4864); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2106:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2109:28: ( ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2110:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2110:1: ( () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )? )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2110:2: () ( (lv_trigger_1_0= ruleStextTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )?
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2110:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2111:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionReactionAccess().getTransitionReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2116:2: ( (lv_trigger_1_0= ruleStextTrigger ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==RULE_ID) ) {
                    int LA30_4 = input.LA(3);

                    if ( (LA30_4==EOF||LA30_4==17||LA30_4==23||LA30_4==28||LA30_4==54) ) {
                        alt30=1;
                    }
                }
                else if ( (LA30_1==RULE_INT||LA30_1==24) ) {
                    alt30=1;
                }
            }
            else if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_INT)||LA30_0==24||(LA30_0>=45 && LA30_0<=46)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2117:1: (lv_trigger_1_0= ruleStextTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2117:1: (lv_trigger_1_0= ruleStextTrigger )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2118:3: lv_trigger_1_0= ruleStextTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerStextTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStextTrigger_in_ruleTransitionReaction4919);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2134:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==17) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2134:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleTransitionReaction4933); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2138:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2139:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2139:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2140:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransitionReaction4954);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2156:4: (otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==23) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2156:6: otherlv_4= '#' ( (lv_properties_5_0= ruleTransitionProperty ) )*
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleTransitionReaction4969); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionReactionAccess().getNumberSignKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2160:1: ( (lv_properties_5_0= ruleTransitionProperty ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_ID||LA32_0==55) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2161:1: (lv_properties_5_0= ruleTransitionProperty )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2161:1: (lv_properties_5_0= ruleTransitionProperty )
                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2162:3: lv_properties_5_0= ruleTransitionProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getPropertiesTransitionPropertyParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTransitionProperty_in_ruleTransitionReaction4990);
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
                    	    break loop32;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2186:1: entryRuleStextTrigger returns [EObject current=null] : iv_ruleStextTrigger= ruleStextTrigger EOF ;
    public final EObject entryRuleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStextTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2187:2: (iv_ruleStextTrigger= ruleStextTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2188:2: iv_ruleStextTrigger= ruleStextTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStextTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5029);
            iv_ruleStextTrigger=ruleStextTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStextTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStextTrigger5039); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2195:1: ruleStextTrigger returns [EObject current=null] : (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) ;
    public final EObject ruleStextTrigger() throws RecognitionException {
        EObject current = null;

        EObject this_ReactionTrigger_0 = null;

        EObject this_DefaultTrigger_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2198:28: ( (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2199:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2199:1: (this_ReactionTrigger_0= ruleReactionTrigger | this_DefaultTrigger_1= ruleDefaultTrigger )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_INT)||(LA34_0>=23 && LA34_0<=24)) ) {
                alt34=1;
            }
            else if ( ((LA34_0>=45 && LA34_0<=46)) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2200:5: this_ReactionTrigger_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getReactionTriggerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5086);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2210:5: this_DefaultTrigger_1= ruleDefaultTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStextTriggerAccess().getDefaultTriggerParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5113);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2226:1: entryRuleDefaultTrigger returns [EObject current=null] : iv_ruleDefaultTrigger= ruleDefaultTrigger EOF ;
    public final EObject entryRuleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2227:2: (iv_ruleDefaultTrigger= ruleDefaultTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2228:2: iv_ruleDefaultTrigger= ruleDefaultTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger5148);
            iv_ruleDefaultTrigger=ruleDefaultTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultTrigger5158); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2235:1: ruleDefaultTrigger returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2238:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2239:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2239:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2239:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2239:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2240:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultTriggerAccess().getDefaultTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2245:2: (otherlv_1= 'default' | otherlv_2= 'else' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            else if ( (LA35_0==46) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2245:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleDefaultTrigger5205); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultTriggerAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2250:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleDefaultTrigger5223); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2262:1: entryRuleTransitionProperty returns [EObject current=null] : iv_ruleTransitionProperty= ruleTransitionProperty EOF ;
    public final EObject entryRuleTransitionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionProperty = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2263:2: (iv_ruleTransitionProperty= ruleTransitionProperty EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2264:2: iv_ruleTransitionProperty= ruleTransitionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionProperty_in_entryRuleTransitionProperty5260);
            iv_ruleTransitionProperty=ruleTransitionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionProperty5270); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2271:1: ruleTransitionProperty returns [EObject current=null] : (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) ;
    public final EObject ruleTransitionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_EntryPointSpec_0 = null;

        EObject this_ExitPointSpec_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2274:28: ( (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2275:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2275:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==55) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2276:5: this_EntryPointSpec_0= ruleEntryPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionPropertyAccess().getEntryPointSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryPointSpec_in_ruleTransitionProperty5317);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2286:5: this_ExitPointSpec_1= ruleExitPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTransitionPropertyAccess().getExitPointSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitPointSpec_in_ruleTransitionProperty5344);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2302:1: entryRuleEntryPointSpec returns [EObject current=null] : iv_ruleEntryPointSpec= ruleEntryPointSpec EOF ;
    public final EObject entryRuleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2303:2: (iv_ruleEntryPointSpec= ruleEntryPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2304:2: iv_ruleEntryPointSpec= ruleEntryPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec5379);
            iv_ruleEntryPointSpec=ruleEntryPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryPointSpec5389); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2311:1: ruleEntryPointSpec returns [EObject current=null] : (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_entrypoint_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2314:28: ( (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2315:1: (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2315:1: (otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2315:3: otherlv_0= '>' ( (lv_entrypoint_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleEntryPointSpec5426); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntryPointSpecAccess().getGreaterThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2319:1: ( (lv_entrypoint_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2320:1: (lv_entrypoint_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2320:1: (lv_entrypoint_1_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2321:3: lv_entrypoint_1_0= RULE_ID
            {
            lv_entrypoint_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntryPointSpec5443); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2345:1: entryRuleExitPointSpec returns [EObject current=null] : iv_ruleExitPointSpec= ruleExitPointSpec EOF ;
    public final EObject entryRuleExitPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2346:2: (iv_ruleExitPointSpec= ruleExitPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2347:2: iv_ruleExitPointSpec= ruleExitPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec5484);
            iv_ruleExitPointSpec=ruleExitPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitPointSpec5494); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2354:1: ruleExitPointSpec returns [EObject current=null] : ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' ) ;
    public final EObject ruleExitPointSpec() throws RecognitionException {
        EObject current = null;

        Token lv_exitpoint_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2357:28: ( ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2358:1: ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2358:1: ( ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2358:2: ( (lv_exitpoint_0_0= RULE_ID ) ) otherlv_1= '>'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2358:2: ( (lv_exitpoint_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2359:1: (lv_exitpoint_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2359:1: (lv_exitpoint_0_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2360:3: lv_exitpoint_0_0= RULE_ID
            {
            lv_exitpoint_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExitPointSpec5536); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleExitPointSpec5553); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2390:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2391:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2392:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5591);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularEventSpec5601); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2399:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2402:28: ( ( (lv_event_0_0= ruleFeatureCall ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2403:1: ( (lv_event_0_0= ruleFeatureCall ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2403:1: ( (lv_event_0_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2404:1: (lv_event_0_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2404:1: (lv_event_0_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2405:3: lv_event_0_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5646);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2429:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2430:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2431:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5681);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeEventSpec5691); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2438:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_value_1_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2441:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2442:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2442:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2442:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= ruleConditionalExpression ) ) ( (lv_unit_2_0= ruleTimeUnit ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2442:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2443:1: (lv_type_0_0= ruleTimeEventType )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2443:1: (lv_type_0_0= ruleTimeEventType )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2444:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5737);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2460:2: ( (lv_value_1_0= ruleConditionalExpression ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2461:1: (lv_value_1_0= ruleConditionalExpression )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2461:1: (lv_value_1_0= ruleConditionalExpression )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2462:3: lv_value_1_0= ruleConditionalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getValueConditionalExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec5758);
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

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2478:2: ( (lv_unit_2_0= ruleTimeUnit ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2479:1: (lv_unit_2_0= ruleTimeUnit )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2479:1: (lv_unit_2_0= ruleTimeUnit )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2480:3: lv_unit_2_0= ruleTimeUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5779);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2504:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2505:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2506:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5815);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinEventSpec5825); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2513:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_AlwaysEvent_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2516:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2517:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2517:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_AlwaysEvent_2= ruleAlwaysEvent )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt37=1;
                }
                break;
            case 48:
                {
                alt37=2;
                }
                break;
            case 49:
            case 50:
                {
                alt37=3;
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2518:5: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5872);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2528:5: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5899);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2538:5: this_AlwaysEvent_2= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec5926);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2554:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2555:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2556:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent5961);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryEvent5971); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2563:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2566:28: ( ( () otherlv_1= 'entry' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2567:1: ( () otherlv_1= 'entry' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2567:1: ( () otherlv_1= 'entry' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2567:2: () otherlv_1= 'entry'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2567:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2568:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryEventAccess().getEntryEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleEntryEvent6017); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2585:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2586:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2587:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent6053);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent6063); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2594:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2597:28: ( ( () otherlv_1= 'exit' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2598:1: ( () otherlv_1= 'exit' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2598:1: ( () otherlv_1= 'exit' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2598:2: () otherlv_1= 'exit'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2598:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2599:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitEventAccess().getExitEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleExitEvent6109); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2616:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2617:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2618:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent6145);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEvent6155); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2625:1: ruleAlwaysEvent returns [EObject current=null] : ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2628:28: ( ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2629:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2629:1: ( () (otherlv_1= 'always' | otherlv_2= 'oncycle' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2629:2: () (otherlv_1= 'always' | otherlv_2= 'oncycle' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2629:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2630:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlwaysEventAccess().getAlwaysEventAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2635:2: (otherlv_1= 'always' | otherlv_2= 'oncycle' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==49) ) {
                alt38=1;
            }
            else if ( (LA38_0==50) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2635:4: otherlv_1= 'always'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleAlwaysEvent6202); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAlwaysEventAccess().getAlwaysKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2640:7: otherlv_2= 'oncycle'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleAlwaysEvent6220); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2656:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2657:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2658:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6261);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6271); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2665:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2668:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2670:5: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpression6317);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2686:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2687:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2688:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6351);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression6361); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2695:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2698:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2699:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2699:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2700:5: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6408);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2708:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=64 && LA39_0<=74)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2708:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2708:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2709:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2714:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2715:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2715:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2716:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6438);
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

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2732:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2733:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2733:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2734:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6459);
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
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleConditionalExpression"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2758:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2759:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2760:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6497);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression6507); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2767:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2770:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2771:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2771:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2772:5: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6554);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2780:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==56) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2780:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2780:2: ()
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2781:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleConditionalExpression6575); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2790:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2791:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2791:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2792:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6596);
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

                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleConditionalExpression6608); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2812:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2813:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2813:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2814:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6629);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2838:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2839:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2840:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6667);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression6677); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2847:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2850:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2851:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2851:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2852:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6724);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2860:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==57) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2860:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2860:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2861:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,57,FOLLOW_57_in_ruleLogicalOrExpression6745); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2870:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2871:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2871:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2872:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6766);
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
            	    break loop41;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2896:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2897:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2898:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6804);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression6814); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2905:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2908:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2909:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2909:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2910:5: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6861);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2918:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==19) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2918:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2918:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2919:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleLogicalAndExpression6882); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2928:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2929:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2929:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2930:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6903);
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleLogicalNotExpression"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2954:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2955:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2956:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression6941);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNotExpression6951); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2963:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2966:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2967:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2967:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_STRING)||(LA43_0>=27 && LA43_0<=28)||(LA43_0>=52 && LA43_0<=53)||(LA43_0>=77 && LA43_0<=78)||LA43_0==81) ) {
                alt43=1;
            }
            else if ( (LA43_0==58) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2968:5: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression6998);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2977:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2977:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2977:7: () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2977:7: ()
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2978:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalNotExpressionAccess().getLogicalNotExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleLogicalNotExpression7025); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLogicalNotExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2987:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2988:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2988:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:2989:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7046);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3013:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3014:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3015:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7083);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression7093); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3022:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3025:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3026:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3026:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3027:5: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7140);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3035:1: ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==59) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3035:2: () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3035:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3036:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleBitwiseXorExpression7161); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3045:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3046:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3046:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3047:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7182);
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
    // $ANTLR end "ruleBitwiseXorExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3071:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3072:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3073:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7220);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression7230); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3080:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3083:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3084:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3084:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3085:5: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7277);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3093:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==60) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3093:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3093:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3094:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleBitwiseOrExpression7298); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3103:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3104:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3104:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3105:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7319);
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
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3129:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3130:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3131:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7357);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression7367); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3138:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3141:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3142:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3142:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3143:5: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7414);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3151:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==61) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3151:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3151:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3152:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleBitwiseAndExpression7435); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3161:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3162:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3162:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3163:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7456);
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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleLogicalRelationExpression"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3187:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3188:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3189:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7494);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalRelationExpression7504); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3196:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3199:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3200:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3200:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3201:5: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7551);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3209:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==55||(LA47_0>=82 && LA47_0<=86)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3209:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3209:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3210:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3215:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3216:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3216:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3217:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7581);
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

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3233:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3234:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3234:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3235:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7602);
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
    // $ANTLR end "ruleLogicalRelationExpression"


    // $ANTLR start "entryRuleShiftExpression"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3259:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3260:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3261:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7640);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression7650); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3268:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3271:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3272:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3272:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3273:5: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7697);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3281:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=75 && LA48_0<=76)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3281:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3281:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3282:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3287:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3288:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3288:1: (lv_operator_2_0= ruleShiftOperator )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3289:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression7727);
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

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3305:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3306:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3306:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3307:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7748);
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
    // $ANTLR end "ruleShiftExpression"


    // $ANTLR start "entryRuleNumericalAddSubtractExpression"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3331:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3332:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3333:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7786);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7796); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3340:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3343:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3344:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3344:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3345:5: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7843);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3353:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=77 && LA49_0<=78)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3353:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3353:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3354:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3359:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3360:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3360:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3361:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7873);
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

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3377:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3378:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3378:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3379:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7894);
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
    // $ANTLR end "ruleNumericalAddSubtractExpression"


    // $ANTLR start "entryRuleNumericalMultiplyDivideExpression"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3403:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3404:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3405:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression7932);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression7942); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3412:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3415:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3416:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3416:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3417:5: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression7989);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3425:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==17||(LA50_0>=79 && LA50_0<=80)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3425:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3425:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3426:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3431:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3432:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3432:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3433:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8019);
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

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3449:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3450:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3450:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3451:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8040);
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
    // $ANTLR end "ruleNumericalMultiplyDivideExpression"


    // $ANTLR start "entryRuleNumericalUnaryExpression"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3475:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3476:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3477:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8078);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8088); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3484:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3487:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3488:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3488:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_STRING)||(LA51_0>=27 && LA51_0<=28)||(LA51_0>=52 && LA51_0<=53)) ) {
                alt51=1;
            }
            else if ( ((LA51_0>=77 && LA51_0<=78)||LA51_0==81) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3489:5: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8135);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3498:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3498:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3498:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3498:7: ()
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3499:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumericalUnaryExpressionAccess().getNumericalUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3504:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3505:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3505:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3506:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8171);
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

                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3522:2: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3523:1: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3523:1: (lv_operand_3_0= rulePrimaryExpression )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3524:3: lv_operand_3_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8192);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3548:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3549:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3550:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8229);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValueExpression8239); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3557:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3560:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3561:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3561:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3561:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3561:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3562:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveValueExpressionAccess().getPrimitiveValueExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3567:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3568:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3568:1: (lv_value_1_0= ruleLiteral )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3569:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8294);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3593:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3594:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3595:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8330);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall8340); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3602:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3605:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3606:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3606:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3607:5: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8387);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3615:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==54) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3615:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3615:2: ()
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3616:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleFeatureCall8408); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3625:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3626:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3626:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3627:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureCall8428); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3638:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==28) && (synpred2_InternalSynctext())) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3638:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3638:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3638:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3645:1: (lv_operationCall_4_0= '(' )
            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3646:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,28,FOLLOW_28_in_ruleFeatureCall8462); if (state.failed) return current;
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

            	            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3659:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt53=2;
            	            int LA53_0 = input.LA(1);

            	            if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_STRING)||(LA53_0>=27 && LA53_0<=28)||(LA53_0>=52 && LA53_0<=53)||LA53_0==58||(LA53_0>=77 && LA53_0<=78)||LA53_0==81) ) {
            	                alt53=1;
            	            }
            	            switch (alt53) {
            	                case 1 :
            	                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3659:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3659:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3660:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3660:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3661:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8497);
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

            	                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3677:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop52:
            	                    do {
            	                        int alt52=2;
            	                        int LA52_0 = input.LA(1);

            	                        if ( (LA52_0==26) ) {
            	                            alt52=1;
            	                        }


            	                        switch (alt52) {
            	                    	case 1 :
            	                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3677:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleFeatureCall8510); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3681:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3682:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3682:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3683:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8531);
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
            	                    	    break loop52;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleFeatureCall8547); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getFeatureCallAccess().getRightParenthesisKeyword_1_3_2());
            	                  
            	            }

            	            }
            	            break;

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
    // $ANTLR end "ruleFeatureCall"


    // $ANTLR start "entryRuleElementReferenceExpression"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3711:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3712:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3713:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8587);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementReferenceExpression8597); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3720:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3723:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3724:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3724:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3724:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3724:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3725:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementReferenceExpressionAccess().getElementReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3730:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3731:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3731:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3732:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementReferenceExpression8651); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3743:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==28) && (synpred3_InternalSynctext())) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3743:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3743:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3743:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3750:1: (lv_operationCall_2_0= '(' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3751:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,28,FOLLOW_28_in_ruleElementReferenceExpression8685); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3764:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_STRING)||(LA57_0>=27 && LA57_0<=28)||(LA57_0>=52 && LA57_0<=53)||LA57_0==58||(LA57_0>=77 && LA57_0<=78)||LA57_0==81) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3764:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3764:3: ( (lv_args_3_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3765:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3765:1: (lv_args_3_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3766:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8720);
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

                            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3782:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==26) ) {
                                    alt56=1;
                                }


                                switch (alt56) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3782:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleElementReferenceExpression8733); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3786:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3787:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3787:1: (lv_args_5_0= ruleExpression )
                            	    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3788:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8754);
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
                            	    break loop56;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleElementReferenceExpression8770); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3816:1: entryRuleEventValueReferenceExpression returns [EObject current=null] : iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF ;
    public final EObject entryRuleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventValueReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3817:2: (iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3818:2: iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventValueReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression8808);
            iv_ruleEventValueReferenceExpression=ruleEventValueReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventValueReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventValueReferenceExpression8818); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3825:1: ruleEventValueReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject ruleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3828:28: ( ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3829:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3829:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3829:2: () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3829:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3830:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventValueReferenceExpressionAccess().getEventValueReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleEventValueReferenceExpression8864); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventValueReferenceExpressionAccess().getValueofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleEventValueReferenceExpression8876); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventValueReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3843:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3844:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3844:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3845:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventValueReferenceExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression8897);
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

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleEventValueReferenceExpression8909); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3873:1: entryRuleActiveStateReferenceExpression returns [EObject current=null] : iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF ;
    public final EObject entryRuleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveStateReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3874:2: (iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3875:2: iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveStateReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression8945);
            iv_ruleActiveStateReferenceExpression=ruleActiveStateReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveStateReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression8955); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3882:1: ruleActiveStateReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3885:28: ( ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3886:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3886:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3886:2: () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3886:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3887:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActiveStateReferenceExpressionAccess().getActiveStateReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleActiveStateReferenceExpression9001); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActiveStateReferenceExpressionAccess().getActiveKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleActiveStateReferenceExpression9013); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActiveStateReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3900:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3901:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3901:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3902:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActiveStateReferenceExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActiveStateReferenceExpressionAccess().getValueStateCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9036);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleActiveStateReferenceExpression9048); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3927:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3928:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3929:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression9084);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression9094); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3936:1: ruleParenthesizedExpression returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3939:28: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3940:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3940:1: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3940:2: () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3940:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3941:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParenthesizedExpressionAccess().getParenthesizedExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleParenthesizedExpression9140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3950:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3951:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3951:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3952:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression9161);
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

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleParenthesizedExpression9173); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3980:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3981:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3982:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral9209);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral9219); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3989:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_RealLiteral_3 = null;

        EObject this_StringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3992:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3993:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3993:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            int alt59=5;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt59=1;
                }
                break;
            case RULE_INT:
                {
                alt59=2;
                }
                break;
            case RULE_HEX:
                {
                alt59=3;
                }
                break;
            case RULE_FLOAT:
                {
                alt59=4;
                }
                break;
            case RULE_STRING:
                {
                alt59=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3994:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral9266);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4004:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral9293);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4014:5: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexLiteral_in_ruleLiteral9320);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4024:5: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleLiteral9347);
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4034:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral9374);
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4050:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4051:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4052:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9409);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral9419); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4059:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4062:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4063:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4063:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4063:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4063:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4064:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4069:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4070:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4070:1: (lv_value_1_0= RULE_BOOL )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4071:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral9470); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4095:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4096:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4097:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9511);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral9521); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4104:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4107:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4108:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4108:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4108:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4108:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4109:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4114:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4115:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4115:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4116:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral9572); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4140:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4141:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4142:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9613);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral9623); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4149:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4152:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4153:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4153:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4153:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4153:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4154:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4159:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4160:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4160:1: (lv_value_1_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4161:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleRealLiteral9674); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4185:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4186:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4187:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9715);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexLiteral9725); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4194:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4197:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4198:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4198:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4198:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4198:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4199:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHexLiteralAccess().getHexLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4204:2: ( (lv_value_1_0= RULE_HEX ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4205:1: (lv_value_1_0= RULE_HEX )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4205:1: (lv_value_1_0= RULE_HEX )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4206:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleHexLiteral9776); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4230:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4231:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4232:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9817);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral9827); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4239:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4242:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4243:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4243:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4243:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4243:2: ()
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4244:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4249:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4250:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4250:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4251:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral9878); if (state.failed) return current;
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


    // $ANTLR start "ruleDirection"
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4277:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4279:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4280:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4280:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt60=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt60=1;
                }
                break;
            case 40:
                {
                alt60=2;
                }
                break;
            case 41:
                {
                alt60=3;
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4280:2: (enumLiteral_0= 'local' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4280:2: (enumLiteral_0= 'local' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4280:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_39_in_ruleDirection9935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4286:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4286:6: (enumLiteral_1= 'in' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4286:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleDirection9952); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4292:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4292:6: (enumLiteral_2= 'out' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4292:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_41_in_ruleDirection9969); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4302:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4304:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4305:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4305:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==62) ) {
                alt61=1;
            }
            else if ( (LA61_0==63) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4305:2: (enumLiteral_0= 'after' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4305:2: (enumLiteral_0= 'after' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4305:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_62_in_ruleTimeEventType10014); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4311:6: (enumLiteral_1= 'every' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4311:6: (enumLiteral_1= 'every' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4311:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_63_in_ruleTimeEventType10031); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4321:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4323:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4324:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4324:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            int alt62=11;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt62=1;
                }
                break;
            case 65:
                {
                alt62=2;
                }
                break;
            case 66:
                {
                alt62=3;
                }
                break;
            case 67:
                {
                alt62=4;
                }
                break;
            case 68:
                {
                alt62=5;
                }
                break;
            case 69:
                {
                alt62=6;
                }
                break;
            case 70:
                {
                alt62=7;
                }
                break;
            case 71:
                {
                alt62=8;
                }
                break;
            case 72:
                {
                alt62=9;
                }
                break;
            case 73:
                {
                alt62=10;
                }
                break;
            case 74:
                {
                alt62=11;
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4324:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4324:2: (enumLiteral_0= '=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4324:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_64_in_ruleAssignmentOperator10076); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4330:6: (enumLiteral_1= '*=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4330:6: (enumLiteral_1= '*=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4330:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_65_in_ruleAssignmentOperator10093); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4336:6: (enumLiteral_2= '/=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4336:6: (enumLiteral_2= '/=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4336:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_66_in_ruleAssignmentOperator10110); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4342:6: (enumLiteral_3= '%=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4342:6: (enumLiteral_3= '%=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4342:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_67_in_ruleAssignmentOperator10127); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4348:6: (enumLiteral_4= '+=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4348:6: (enumLiteral_4= '+=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4348:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,68,FOLLOW_68_in_ruleAssignmentOperator10144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4354:6: (enumLiteral_5= '-=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4354:6: (enumLiteral_5= '-=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4354:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,69,FOLLOW_69_in_ruleAssignmentOperator10161); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4360:6: (enumLiteral_6= '<<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4360:6: (enumLiteral_6= '<<=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4360:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,70,FOLLOW_70_in_ruleAssignmentOperator10178); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4366:6: (enumLiteral_7= '>>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4366:6: (enumLiteral_7= '>>=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4366:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,71,FOLLOW_71_in_ruleAssignmentOperator10195); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4372:6: (enumLiteral_8= '&=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4372:6: (enumLiteral_8= '&=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4372:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,72,FOLLOW_72_in_ruleAssignmentOperator10212); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4378:6: (enumLiteral_9= '^=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4378:6: (enumLiteral_9= '^=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4378:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,73,FOLLOW_73_in_ruleAssignmentOperator10229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4384:6: (enumLiteral_10= '|=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4384:6: (enumLiteral_10= '|=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4384:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,74,FOLLOW_74_in_ruleAssignmentOperator10246); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4394:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4396:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4397:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4397:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==75) ) {
                alt63=1;
            }
            else if ( (LA63_0==76) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4397:2: (enumLiteral_0= '<<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4397:2: (enumLiteral_0= '<<' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4397:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_75_in_ruleShiftOperator10291); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4403:6: (enumLiteral_1= '>>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4403:6: (enumLiteral_1= '>>' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4403:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_76_in_ruleShiftOperator10308); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4413:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4415:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4416:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4416:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==77) ) {
                alt64=1;
            }
            else if ( (LA64_0==78) ) {
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4416:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4416:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4416:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_77_in_ruleAdditiveOperator10353); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4422:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4422:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4422:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_78_in_ruleAdditiveOperator10370); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4432:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4434:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4435:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4435:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt65=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt65=1;
                }
                break;
            case 17:
                {
                alt65=2;
                }
                break;
            case 80:
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4435:2: (enumLiteral_0= '*' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4435:2: (enumLiteral_0= '*' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4435:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_79_in_ruleMultiplicativeOperator10415); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4441:6: (enumLiteral_1= '/' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4441:6: (enumLiteral_1= '/' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4441:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,17,FOLLOW_17_in_ruleMultiplicativeOperator10432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4447:6: (enumLiteral_2= '%' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4447:6: (enumLiteral_2= '%' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4447:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,80,FOLLOW_80_in_ruleMultiplicativeOperator10449); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4457:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4459:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4460:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4460:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            int alt66=3;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt66=1;
                }
                break;
            case 78:
                {
                alt66=2;
                }
                break;
            case 81:
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4460:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4460:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4460:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_77_in_ruleUnaryOperator10494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4466:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4466:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4466:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_78_in_ruleUnaryOperator10511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4472:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4472:6: (enumLiteral_2= '~' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4472:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_81_in_ruleUnaryOperator10528); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4482:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4484:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4485:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4485:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt67=6;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt67=1;
                }
                break;
            case 83:
                {
                alt67=2;
                }
                break;
            case 55:
                {
                alt67=3;
                }
                break;
            case 84:
                {
                alt67=4;
                }
                break;
            case 85:
                {
                alt67=5;
                }
                break;
            case 86:
                {
                alt67=6;
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4485:2: (enumLiteral_0= '<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4485:2: (enumLiteral_0= '<' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4485:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_82_in_ruleRelationalOperator10573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4491:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4491:6: (enumLiteral_1= '<=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4491:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_83_in_ruleRelationalOperator10590); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4497:6: (enumLiteral_2= '>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4497:6: (enumLiteral_2= '>' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4497:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_55_in_ruleRelationalOperator10607); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4503:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4503:6: (enumLiteral_3= '>=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4503:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,84,FOLLOW_84_in_ruleRelationalOperator10624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4509:6: (enumLiteral_4= '==' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4509:6: (enumLiteral_4= '==' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4509:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,85,FOLLOW_85_in_ruleRelationalOperator10641); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4515:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4515:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4515:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,86,FOLLOW_86_in_ruleRelationalOperator10658); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4525:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4527:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4528:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4528:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            int alt68=4;
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
            case 89:
                {
                alt68=3;
                }
                break;
            case 90:
                {
                alt68=4;
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
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4528:2: (enumLiteral_0= 's' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4528:2: (enumLiteral_0= 's' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4528:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_ruleTimeUnit10703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4534:6: (enumLiteral_1= 'ms' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4534:6: (enumLiteral_1= 'ms' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4534:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_88_in_ruleTimeUnit10720); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4540:6: (enumLiteral_2= 'us' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4540:6: (enumLiteral_2= 'us' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4540:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,89,FOLLOW_89_in_ruleTimeUnit10737); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4546:6: (enumLiteral_3= 'ns' )
                    {
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4546:6: (enumLiteral_3= 'ns' )
                    // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:4546:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,90,FOLLOW_90_in_ruleTimeUnit10754); if (state.failed) return current;
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
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:781:4: ( ',' )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:781:6: ','
        {
        match(input,26,FOLLOW_26_in_synpred1_InternalSynctext1710); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSynctext

    // $ANTLR start synpred2_InternalSynctext
    public final void synpred2_InternalSynctext_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3638:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3639:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3639:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3640:2: '('
        {
        match(input,28,FOLLOW_28_in_synpred2_InternalSynctext8444); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalSynctext

    // $ANTLR start synpred3_InternalSynctext
    public final void synpred3_InternalSynctext_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3743:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3744:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3744:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.model.stext/src-gen/de/cau/cs/kieler/yakindu/model/stext/parser/antlr/internal/InternalSynctext.g:3745:2: '('
        {
        match(input,28,FOLLOW_28_in_synpred3_InternalSynctext8667); if (state.failed) return ;

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
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStateScope142 = new BitSet(new long[]{0x0000004001F34032L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_ruleStateScope161 = new BitSet(new long[]{0x0000004001F34032L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleStateScope180 = new BitSet(new long[]{0x0000004001F34032L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleStateScope199 = new BitSet(new long[]{0x0000004001F34032L});
    public static final BitSet FOLLOW_ruleSignalDeclaration_in_entryRuleSignalDeclaration239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDeclaration249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDefinition_in_ruleSignalDeclaration295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDefinition_in_entryRuleSignalDefinition329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDefinition339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSignalDefinition385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalDefinition402 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSignalDefinition419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleVariableDefinition511 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDefinition528 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDefinition545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReaction591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionTrigger_in_ruleLocalReaction639 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReaction658 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLocalReaction675 = new BitSet(new long[]{0x04300000180403F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalReaction698 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSuspendEffect_in_ruleLocalReaction717 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLocalReaction733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspendEffect_in_entryRuleSuspendEffect769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuspendEffect779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSuspendEffect825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReactionTrigger_in_entryRuleLocalReactionTrigger861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReactionTrigger871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReaction_in_ruleLocalReactionTrigger926 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleLocalReactionTrigger939 = new BitSet(new long[]{0x0000000001F00032L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReactionTrigger960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReaction_in_entryRuleStateReaction999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateReaction1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_ruleStateReaction1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInside_in_ruleStateReaction1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_ruleStateReaction1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntry_in_entryRuleEntry1145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntry1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleEntry1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInside_in_entryRuleInside1237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInside1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleInside1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_entryRuleExit1329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExit1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleExit1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionTrigger1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleReactionTrigger1483 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReactionTrigger1514 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_ruleReactionTrigger1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleReactionTrigger1561 = new BitSet(new long[]{0x04300000180003F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger1582 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleReactionTrigger1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect1632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionEffect1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect1697 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleReactionEffect1718 = new BitSet(new long[]{0x04300000180003F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect1740 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueExpression_in_rulePrimaryExpression1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueExpression_in_entryRulePreValueExpression2005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreValueExpression2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePreValueExpression2061 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePreValueExpression2073 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePreValueExpression2094 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePreValueExpression2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRoot_in_entryRuleDefRoot2144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRoot2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_ruleDefRoot2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_ruleDefRoot2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_ruleDefRoot2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartRoot2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleStatechartRoot2337 = new BitSet(new long[]{0x0000001600000000L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_entryRuleStateRoot2394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateRoot2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleStateRoot2441 = new BitSet(new long[]{0x0000004001F34030L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleStateRoot2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionRoot2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTransitionRoot2545 = new BitSet(new long[]{0x0000600001F20030L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartSpecification2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleStatechartSpecification2661 = new BitSet(new long[]{0x003FFFF600000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleStatechartSpecification2682 = new BitSet(new long[]{0x0000001400000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification2705 = new BitSet(new long[]{0x0000001400000002L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification2742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateSpecification2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_ruleStateSpecification2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification2832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope2924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartScope2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStatechartScope2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_ruleStatechartScope3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope3045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScope3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleInterfaceScope3101 = new BitSet(new long[]{0x003FFFFE00000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleInterfaceScope3122 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleInterfaceScope3135 = new BitSet(new long[]{0x000003E000010002L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope3158 = new BitSet(new long[]{0x000003E000010002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope3177 = new BitSet(new long[]{0x000003E000010002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope3196 = new BitSet(new long[]{0x000003E000010002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_entryRuleInternalScope3236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalScope3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleInternalScope3292 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleInternalScope3304 = new BitSet(new long[]{0x000003E001F34030L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3327 = new BitSet(new long[]{0x000003E001F34032L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3346 = new BitSet(new long[]{0x000003E001F34032L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3365 = new BitSet(new long[]{0x000003E001F34032L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleInternalScope3384 = new BitSet(new long[]{0x000003E001F34032L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclarartion3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDefinition3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleEventDefinition3574 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleEventDefinition3587 = new BitSet(new long[]{0x003FFFF600000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleEventDefinition3608 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleEventDefinition3621 = new BitSet(new long[]{0x003FFFF600000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEventDefinition3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration3774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDeclaration3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition3866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDefinition3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOperationDefinition3922 = new BitSet(new long[]{0x003FFFF600000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleOperationDefinition3943 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleOperationDefinition3955 = new BitSet(new long[]{0x003FFFF620000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition3977 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_26_in_ruleOperationDefinition3990 = new BitSet(new long[]{0x003FFFF600000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition4011 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_29_in_ruleOperationDefinition4027 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleOperationDefinition4040 = new BitSet(new long[]{0x003FFFF600000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter4111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_ruleParameter4157 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleParameter4169 = new BitSet(new long[]{0x003FFFF600000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleParameter4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_entryRuleXID4229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXID4240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXID4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleXID4304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleXID4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleXID4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleXID4361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleXID4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXID4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleXID4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXID4437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXID4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXID4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleXID4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXID4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXID4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXID4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXID4570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXID4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXID4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXID4627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXID4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXID4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN4706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN4717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN4764 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleFQN4783 = new BitSet(new long[]{0x003FFFF600000010L});
    public static final BitSet FOLLOW_ruleXID_in_ruleFQN4805 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction4854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionReaction4864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_ruleTransitionReaction4919 = new BitSet(new long[]{0x0000000000820002L});
    public static final BitSet FOLLOW_17_in_ruleTransitionReaction4933 = new BitSet(new long[]{0x04300000180003F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransitionReaction4954 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleTransitionReaction4969 = new BitSet(new long[]{0x0080000000000012L});
    public static final BitSet FOLLOW_ruleTransitionProperty_in_ruleTransitionReaction4990 = new BitSet(new long[]{0x0080000000000012L});
    public static final BitSet FOLLOW_ruleStextTrigger_in_entryRuleStextTrigger5029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStextTrigger5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleStextTrigger5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_ruleStextTrigger5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultTrigger_in_entryRuleDefaultTrigger5148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultTrigger5158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDefaultTrigger5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDefaultTrigger5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionProperty_in_entryRuleTransitionProperty5260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionProperty5270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_ruleTransitionProperty5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_ruleTransitionProperty5344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec5379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryPointSpec5389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleEntryPointSpec5426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntryPointSpec5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec5484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitPointSpec5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExitPointSpec5536 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleExitPointSpec5553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularEventSpec5601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeEventSpec5691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5737 = new BitSet(new long[]{0x04300000180003F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleTimeEventSpec5758 = new BitSet(new long[]{0x0000000000000000L,0x0000000007800000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinEventSpec5825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec5926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent5961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryEvent5971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleEntryEvent6017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent6053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent6063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleExitEvent6109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent6145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEvent6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleAlwaysEvent6202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAlwaysEvent6220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpression6317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression6361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6408 = new BitSet(new long[]{0x0000000000000002L,0x00000000000007FFL});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6438 = new BitSet(new long[]{0x04300000180003F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6459 = new BitSet(new long[]{0x0000000000000002L,0x00000000000007FFL});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression6507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6554 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleConditionalExpression6575 = new BitSet(new long[]{0x04300000180003F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6596 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleConditionalExpression6608 = new BitSet(new long[]{0x04300000180003F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression6677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6724 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleLogicalOrExpression6745 = new BitSet(new long[]{0x04300000180003F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6766 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression6814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6861 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleLogicalAndExpression6882 = new BitSet(new long[]{0x04300000180003F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6903 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression6941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNotExpression6951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression6998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleLogicalNotExpression7025 = new BitSet(new long[]{0x00300000180003F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression7093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7140 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleBitwiseXorExpression7161 = new BitSet(new long[]{0x00300000180003F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7182 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression7230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7277 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleBitwiseOrExpression7298 = new BitSet(new long[]{0x00300000180003F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7319 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression7367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7414 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleBitwiseAndExpression7435 = new BitSet(new long[]{0x00300000180003F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7456 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalRelationExpression7504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7551 = new BitSet(new long[]{0x0080000000000002L,0x00000000007C0000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7581 = new BitSet(new long[]{0x00300000180003F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7602 = new BitSet(new long[]{0x0080000000000002L,0x00000000007C0000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression7650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7697 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression7727 = new BitSet(new long[]{0x00300000180003F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7748 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7843 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7873 = new BitSet(new long[]{0x00300000180003F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7894 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression7932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression7942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression7989 = new BitSet(new long[]{0x0000000000020002L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8019 = new BitSet(new long[]{0x00300000180003F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8040 = new BitSet(new long[]{0x0000000000020002L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8171 = new BitSet(new long[]{0x00300000180003F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValueExpression8239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall8340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8387 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleFeatureCall8408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureCall8428 = new BitSet(new long[]{0x0040000010000002L});
    public static final BitSet FOLLOW_28_in_ruleFeatureCall8462 = new BitSet(new long[]{0x04300000380003F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8497 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_26_in_ruleFeatureCall8510 = new BitSet(new long[]{0x04300000180003F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8531 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_29_in_ruleFeatureCall8547 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementReferenceExpression8597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementReferenceExpression8651 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleElementReferenceExpression8685 = new BitSet(new long[]{0x04300000380003F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8720 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_26_in_ruleElementReferenceExpression8733 = new BitSet(new long[]{0x04300000180003F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8754 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_29_in_ruleElementReferenceExpression8770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression8808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventValueReferenceExpression8818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleEventValueReferenceExpression8864 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEventValueReferenceExpression8876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression8897 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleEventValueReferenceExpression8909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression8945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression8955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleActiveStateReferenceExpression9001 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleActiveStateReferenceExpression9013 = new BitSet(new long[]{0x003FFFF600000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9036 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleActiveStateReferenceExpression9048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression9084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression9094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleParenthesizedExpression9140 = new BitSet(new long[]{0x04300000180003F0L,0x0000000000026000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression9161 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleParenthesizedExpression9173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral9209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral9219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral9266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral9293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_ruleLiteral9320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleLiteral9347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral9374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral9419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral9470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral9521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral9572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral9623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRealLiteral9674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexLiteral9725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleHexLiteral9776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral9878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleDirection9935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleDirection9952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDirection9969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleTimeEventType10014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleTimeEventType10031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleAssignmentOperator10076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleAssignmentOperator10093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleAssignmentOperator10110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleAssignmentOperator10127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleAssignmentOperator10144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleAssignmentOperator10161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleAssignmentOperator10178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleAssignmentOperator10195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleAssignmentOperator10212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleAssignmentOperator10229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleAssignmentOperator10246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleShiftOperator10291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleShiftOperator10308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAdditiveOperator10353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleAdditiveOperator10370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleMultiplicativeOperator10415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleMultiplicativeOperator10432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleMultiplicativeOperator10449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleUnaryOperator10494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleUnaryOperator10511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleUnaryOperator10528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleRelationalOperator10573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleRelationalOperator10590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleRelationalOperator10607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleRelationalOperator10624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleRelationalOperator10641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleRelationalOperator10658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleTimeUnit10703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleTimeUnit10720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleTimeUnit10737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleTimeUnit10754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred1_InternalSynctext1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred2_InternalSynctext8444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred3_InternalSynctext8667 = new BitSet(new long[]{0x0000000000000002L});

}