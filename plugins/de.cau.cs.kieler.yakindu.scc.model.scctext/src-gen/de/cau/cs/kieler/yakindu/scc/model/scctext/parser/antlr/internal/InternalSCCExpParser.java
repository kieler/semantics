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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_FLOAT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interface'", "':'", "','", "';'", "'static'", "'='", "'with'", "'Exit'", "'/'", "'Inside'", "'Entry'", "'Suspend'", "'#'", "'['", "']'", "'('", "')'", "'pre'", "'@@statechart@@'", "'@@state@@'", "'@@transition@@'", "'namespace'", "'internal'", "'event'", "'operation'", "'entrypoint'", "'exitpoint'", "'.'", "'>'", "'entry'", "'exit'", "'oncycle'", "'always'", "'default'", "'else'", "'raise'", "'?'", "'||'", "'&&'", "'!'", "'^'", "'|'", "'&'", "'\\'none\\''", "'\\'+\\''", "'\\'*\\''", "'\\'max\\''", "'\\'min\\''", "'\\'or\\''", "'\\'and\\''", "'\\'host\\''", "'inout'", "'in'", "'out'", "'local'", "'after'", "'every'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'%'", "'~'", "'<'", "'<='", "'>='", "'=='", "'!='", "'s'", "'ms'", "'us'", "'ns'"
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
        	return "StateSpecification";	
       	}
       	
       	@Override
       	protected SCCExpGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStateSpecification"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:68:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:69:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:70:2: iv_ruleStateSpecification= ruleStateSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification75);
            iv_ruleStateSpecification=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateSpecification85); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:77:1: ruleStateSpecification returns [EObject current=null] : ( () ( (lv_scopes_1_0= ruleInterfaceScope ) )* ) ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_scopes_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:80:28: ( ( () ( (lv_scopes_1_0= ruleInterfaceScope ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:81:1: ( () ( (lv_scopes_1_0= ruleInterfaceScope ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:81:1: ( () ( (lv_scopes_1_0= ruleInterfaceScope ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:81:2: () ( (lv_scopes_1_0= ruleInterfaceScope ) )*
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:81:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:82:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStateSpecificationAccess().getStateSpecificationAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:87:2: ( (lv_scopes_1_0= ruleInterfaceScope ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:88:1: (lv_scopes_1_0= ruleInterfaceScope )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:88:1: (lv_scopes_1_0= ruleInterfaceScope )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:89:3: lv_scopes_1_0= ruleInterfaceScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateSpecificationAccess().getScopesInterfaceScopeParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStateSpecification140);
            	    lv_scopes_1_0=ruleInterfaceScope();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStateSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"scopes",
            	              		lv_scopes_1_0, 
            	              		"InterfaceScope");
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
    // $ANTLR end "ruleStateSpecification"


    // $ANTLR start "entryRuleStateScope"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:113:1: entryRuleStateScope returns [EObject current=null] : iv_ruleStateScope= ruleStateScope EOF ;
    public final EObject entryRuleStateScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:114:2: (iv_ruleStateScope= ruleStateScope EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:115:2: iv_ruleStateScope= ruleStateScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStateScope_in_entryRuleStateScope177);
            iv_ruleStateScope=ruleStateScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateScope187); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:122:1: ruleStateScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_ReactionScope_1= ruleReactionScope ) ;
    public final EObject ruleStateScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_ReactionScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:125:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_ReactionScope_1= ruleReactionScope ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:126:1: (this_InterfaceScope_0= ruleInterfaceScope | this_ReactionScope_1= ruleReactionScope )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:126:1: (this_InterfaceScope_0= ruleInterfaceScope | this_ReactionScope_1= ruleReactionScope )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==21||(LA2_0>=23 && LA2_0<=25)) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:127:5: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStateScope234);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:137:5: this_ReactionScope_1= ruleReactionScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateScopeAccess().getReactionScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReactionScope_in_ruleStateScope261);
                    this_ReactionScope_1=ruleReactionScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReactionScope_1; 
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
    // $ANTLR end "ruleStateScope"


    // $ANTLR start "entryRuleInterfaceScope"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:153:1: entryRuleInterfaceScope returns [EObject current=null] : iv_ruleInterfaceScope= ruleInterfaceScope EOF ;
    public final EObject entryRuleInterfaceScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:154:2: (iv_ruleInterfaceScope= ruleInterfaceScope EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:155:2: iv_ruleInterfaceScope= ruleInterfaceScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope296);
            iv_ruleInterfaceScope=ruleInterfaceScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceScope306); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:162:1: ruleInterfaceScope returns [EObject current=null] : ( () otherlv_1= 'interface' otherlv_2= ':' ( (lv_declarations_3_0= ruleVariableDeclaration ) ) (otherlv_4= ',' ( (lv_declarations_5_0= ruleVariableDeclaration ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleInterfaceScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declarations_3_0 = null;

        EObject lv_declarations_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:165:28: ( ( () otherlv_1= 'interface' otherlv_2= ':' ( (lv_declarations_3_0= ruleVariableDeclaration ) ) (otherlv_4= ',' ( (lv_declarations_5_0= ruleVariableDeclaration ) ) )* otherlv_6= ';' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:166:1: ( () otherlv_1= 'interface' otherlv_2= ':' ( (lv_declarations_3_0= ruleVariableDeclaration ) ) (otherlv_4= ',' ( (lv_declarations_5_0= ruleVariableDeclaration ) ) )* otherlv_6= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:166:1: ( () otherlv_1= 'interface' otherlv_2= ':' ( (lv_declarations_3_0= ruleVariableDeclaration ) ) (otherlv_4= ',' ( (lv_declarations_5_0= ruleVariableDeclaration ) ) )* otherlv_6= ';' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:166:2: () otherlv_1= 'interface' otherlv_2= ':' ( (lv_declarations_3_0= ruleVariableDeclaration ) ) (otherlv_4= ',' ( (lv_declarations_5_0= ruleVariableDeclaration ) ) )* otherlv_6= ';'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:166:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:167:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInterfaceScopeAccess().getInterfaceScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleInterfaceScope352); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceScopeAccess().getInterfaceKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleInterfaceScope364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInterfaceScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:180:1: ( (lv_declarations_3_0= ruleVariableDeclaration ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:181:1: (lv_declarations_3_0= ruleVariableDeclaration )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:181:1: (lv_declarations_3_0= ruleVariableDeclaration )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:182:3: lv_declarations_3_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope385);
            lv_declarations_3_0=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInterfaceScopeRule());
              	        }
                     		add(
                     			current, 
                     			"declarations",
                      		lv_declarations_3_0, 
                      		"VariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:198:2: (otherlv_4= ',' ( (lv_declarations_5_0= ruleVariableDeclaration ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:198:4: otherlv_4= ',' ( (lv_declarations_5_0= ruleVariableDeclaration ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleInterfaceScope398); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getInterfaceScopeAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:202:1: ( (lv_declarations_5_0= ruleVariableDeclaration ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:203:1: (lv_declarations_5_0= ruleVariableDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:203:1: (lv_declarations_5_0= ruleVariableDeclaration )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:204:3: lv_declarations_5_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope419);
            	    lv_declarations_5_0=ruleVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInterfaceScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_5_0, 
            	              		"VariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleInterfaceScope433); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getInterfaceScopeAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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


    // $ANTLR start "entryRuleVariableDefinition"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:232:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:233:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:234:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition469);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition479); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:241:1: ruleVariableDefinition returns [EObject current=null] : ( () ( (lv_direction_1_0= ruleVarDirection ) )? ( (lv_isStatic_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) (otherlv_6= '=' ( (lv_varInitialValue_7_0= ruleExpression ) ) )? (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )? ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:244:28: ( ( () ( (lv_direction_1_0= ruleVarDirection ) )? ( (lv_isStatic_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) (otherlv_6= '=' ( (lv_varInitialValue_7_0= ruleExpression ) ) )? (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:245:1: ( () ( (lv_direction_1_0= ruleVarDirection ) )? ( (lv_isStatic_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) (otherlv_6= '=' ( (lv_varInitialValue_7_0= ruleExpression ) ) )? (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:245:1: ( () ( (lv_direction_1_0= ruleVarDirection ) )? ( (lv_isStatic_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) (otherlv_6= '=' ( (lv_varInitialValue_7_0= ruleExpression ) ) )? (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:245:2: () ( (lv_direction_1_0= ruleVarDirection ) )? ( (lv_isStatic_2_0= 'static' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( ruleFQN ) ) (otherlv_6= '=' ( (lv_varInitialValue_7_0= ruleExpression ) ) )? (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:245:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:246:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:251:2: ( (lv_direction_1_0= ruleVarDirection ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=65 && LA4_0<=67)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:252:1: (lv_direction_1_0= ruleVarDirection )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:252:1: (lv_direction_1_0= ruleVarDirection )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:253:3: lv_direction_1_0= ruleVarDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDirectionVarDirectionEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVarDirection_in_ruleVariableDefinition534);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:269:3: ( (lv_isStatic_2_0= 'static' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:270:1: (lv_isStatic_2_0= 'static' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:270:1: (lv_isStatic_2_0= 'static' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:271:3: lv_isStatic_2_0= 'static'
                    {
                    lv_isStatic_2_0=(Token)match(input,18,FOLLOW_18_in_ruleVariableDefinition553); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:284:3: ( (lv_name_3_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:285:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:285:1: (lv_name_3_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:286:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDefinition584); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleVariableDefinition601); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionAccess().getColonKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:306:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:307:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:307:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:308:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getTypeTypeCrossReference_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleVariableDefinition624);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:321:2: (otherlv_6= '=' ( (lv_varInitialValue_7_0= ruleExpression ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:321:4: otherlv_6= '=' ( (lv_varInitialValue_7_0= ruleExpression ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleVariableDefinition637); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionAccess().getEqualsSignKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:325:1: ( (lv_varInitialValue_7_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:326:1: (lv_varInitialValue_7_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:326:1: (lv_varInitialValue_7_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:327:3: lv_varInitialValue_7_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getVarInitialValueExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDefinition658);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:343:4: (otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:343:6: otherlv_8= 'with' ( (lv_varCombineOperator_9_0= ruleCombineOperator ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleVariableDefinition673); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getVariableDefinitionAccess().getWithKeyword_7_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:347:1: ( (lv_varCombineOperator_9_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:348:1: (lv_varCombineOperator_9_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:348:1: (lv_varCombineOperator_9_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:349:3: lv_varCombineOperator_9_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getVarCombineOperatorCombineOperatorEnumRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleVariableDefinition694);
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


    // $ANTLR start "entryRuleReactionScope"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:373:1: entryRuleReactionScope returns [EObject current=null] : iv_ruleReactionScope= ruleReactionScope EOF ;
    public final EObject entryRuleReactionScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:374:2: (iv_ruleReactionScope= ruleReactionScope EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:375:2: iv_ruleReactionScope= ruleReactionScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionScopeRule()); 
            }
            pushFollow(FOLLOW_ruleReactionScope_in_entryRuleReactionScope732);
            iv_ruleReactionScope=ruleReactionScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionScope742); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactionScope"


    // $ANTLR start "ruleReactionScope"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:382:1: ruleReactionScope returns [EObject current=null] : ( ( (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend ) ) ) ;
    public final EObject ruleReactionScope() throws RecognitionException {
        EObject current = null;

        EObject lv_reactionScope_0_1 = null;

        EObject lv_reactionScope_0_2 = null;

        EObject lv_reactionScope_0_3 = null;

        EObject lv_reactionScope_0_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:385:28: ( ( ( (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:386:1: ( ( (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:386:1: ( ( (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:387:1: ( (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:387:1: ( (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:388:1: (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:388:1: (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            case 25:
                {
                alt8=4;
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:389:3: lv_reactionScope_0_1= ruleEntryAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionScopeAccess().getReactionScopeEntryActionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEntryAction_in_ruleReactionScope789);
                    lv_reactionScope_0_1=ruleEntryAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionScopeRule());
                      	        }
                             		add(
                             			current, 
                             			"reactionScope",
                              		lv_reactionScope_0_1, 
                              		"EntryAction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:404:8: lv_reactionScope_0_2= ruleInsideAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionScopeAccess().getReactionScopeInsideActionParserRuleCall_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInsideAction_in_ruleReactionScope808);
                    lv_reactionScope_0_2=ruleInsideAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionScopeRule());
                      	        }
                             		add(
                             			current, 
                             			"reactionScope",
                              		lv_reactionScope_0_2, 
                              		"InsideAction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:419:8: lv_reactionScope_0_3= ruleExitAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionScopeAccess().getReactionScopeExitActionParserRuleCall_0_2()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExitAction_in_ruleReactionScope827);
                    lv_reactionScope_0_3=ruleExitAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionScopeRule());
                      	        }
                             		add(
                             			current, 
                             			"reactionScope",
                              		lv_reactionScope_0_3, 
                              		"ExitAction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:434:8: lv_reactionScope_0_4= ruleSuspend
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionScopeAccess().getReactionScopeSuspendParserRuleCall_0_3()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSuspend_in_ruleReactionScope846);
                    lv_reactionScope_0_4=ruleSuspend();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionScopeRule());
                      	        }
                             		add(
                             			current, 
                             			"reactionScope",
                              		lv_reactionScope_0_4, 
                              		"Suspend");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

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
    // $ANTLR end "ruleReactionScope"


    // $ANTLR start "entryRuleExitAction"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:460:1: entryRuleExitAction returns [EObject current=null] : iv_ruleExitAction= ruleExitAction EOF ;
    public final EObject entryRuleExitAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitAction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:461:2: (iv_ruleExitAction= ruleExitAction EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:462:2: iv_ruleExitAction= ruleExitAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitActionRule()); 
            }
            pushFollow(FOLLOW_ruleExitAction_in_entryRuleExitAction884);
            iv_ruleExitAction=ruleExitAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitAction894); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:469:1: ruleExitAction returns [EObject current=null] : ( () otherlv_1= 'Exit' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' ) ;
    public final EObject ruleExitAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_effect_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:472:28: ( ( () otherlv_1= 'Exit' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:473:1: ( () otherlv_1= 'Exit' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:473:1: ( () otherlv_1= 'Exit' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:473:2: () otherlv_1= 'Exit' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:473:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:474:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitActionAccess().getExitActionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleExitAction940); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitActionAccess().getExitKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleExitAction952); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExitActionAccess().getColonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleExitAction964); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExitActionAccess().getSolidusKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:491:1: ( (lv_effect_4_0= ruleReactionEffect ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:492:1: (lv_effect_4_0= ruleReactionEffect )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:492:1: (lv_effect_4_0= ruleReactionEffect )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:493:3: lv_effect_4_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExitActionAccess().getEffectReactionEffectParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleExitAction985);
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

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleExitAction997); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:521:1: entryRuleInsideAction returns [EObject current=null] : iv_ruleInsideAction= ruleInsideAction EOF ;
    public final EObject entryRuleInsideAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsideAction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:522:2: (iv_ruleInsideAction= ruleInsideAction EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:523:2: iv_ruleInsideAction= ruleInsideAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsideActionRule()); 
            }
            pushFollow(FOLLOW_ruleInsideAction_in_entryRuleInsideAction1033);
            iv_ruleInsideAction=ruleInsideAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInsideAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsideAction1043); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:530:1: ruleInsideAction returns [EObject current=null] : ( () otherlv_1= 'Inside' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' ) ;
    public final EObject ruleInsideAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_effect_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:533:28: ( ( () otherlv_1= 'Inside' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:534:1: ( () otherlv_1= 'Inside' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:534:1: ( () otherlv_1= 'Inside' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:534:2: () otherlv_1= 'Inside' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:534:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:535:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInsideActionAccess().getInsideActionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleInsideAction1089); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInsideActionAccess().getInsideKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleInsideAction1101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInsideActionAccess().getColonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleInsideAction1113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInsideActionAccess().getSolidusKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:552:1: ( (lv_effect_4_0= ruleReactionEffect ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:553:1: (lv_effect_4_0= ruleReactionEffect )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:553:1: (lv_effect_4_0= ruleReactionEffect )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:554:3: lv_effect_4_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInsideActionAccess().getEffectReactionEffectParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleInsideAction1134);
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

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleInsideAction1146); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:582:1: entryRuleEntryAction returns [EObject current=null] : iv_ruleEntryAction= ruleEntryAction EOF ;
    public final EObject entryRuleEntryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryAction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:583:2: (iv_ruleEntryAction= ruleEntryAction EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:584:2: iv_ruleEntryAction= ruleEntryAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryActionRule()); 
            }
            pushFollow(FOLLOW_ruleEntryAction_in_entryRuleEntryAction1182);
            iv_ruleEntryAction=ruleEntryAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryAction1192); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:591:1: ruleEntryAction returns [EObject current=null] : ( () otherlv_1= 'Entry' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' ) ;
    public final EObject ruleEntryAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_effect_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:594:28: ( ( () otherlv_1= 'Entry' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:595:1: ( () otherlv_1= 'Entry' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:595:1: ( () otherlv_1= 'Entry' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:595:2: () otherlv_1= 'Entry' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:595:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:596:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryActionAccess().getEntryActionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleEntryAction1238); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntryActionAccess().getEntryKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleEntryAction1250); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEntryActionAccess().getColonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleEntryAction1262); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEntryActionAccess().getSolidusKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:613:1: ( (lv_effect_4_0= ruleReactionEffect ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:614:1: (lv_effect_4_0= ruleReactionEffect )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:614:1: (lv_effect_4_0= ruleReactionEffect )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:615:3: lv_effect_4_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntryActionAccess().getEffectReactionEffectParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleEntryAction1283);
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

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleEntryAction1295); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:643:1: entryRuleSuspend returns [EObject current=null] : iv_ruleSuspend= ruleSuspend EOF ;
    public final EObject entryRuleSuspend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspend = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:644:2: (iv_ruleSuspend= ruleSuspend EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:645:2: iv_ruleSuspend= ruleSuspend EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuspendRule()); 
            }
            pushFollow(FOLLOW_ruleSuspend_in_entryRuleSuspend1331);
            iv_ruleSuspend=ruleSuspend();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuspend; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuspend1341); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:652:1: ruleSuspend returns [EObject current=null] : ( () otherlv_1= 'Suspend' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) ) otherlv_4= ';' ) ;
    public final EObject ruleSuspend() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:655:28: ( ( () otherlv_1= 'Suspend' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) ) otherlv_4= ';' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:656:1: ( () otherlv_1= 'Suspend' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) ) otherlv_4= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:656:1: ( () otherlv_1= 'Suspend' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) ) otherlv_4= ';' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:656:2: () otherlv_1= 'Suspend' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) ) otherlv_4= ';'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:656:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:657:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSuspendAccess().getSuspendAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleSuspend1387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSuspendAccess().getSuspendKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSuspend1399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSuspendAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:670:1: ( (lv_trigger_3_0= ruleReactionTrigger ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:671:1: (lv_trigger_3_0= ruleReactionTrigger )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:671:1: (lv_trigger_3_0= ruleReactionTrigger )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:672:3: lv_trigger_3_0= ruleReactionTrigger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSuspendAccess().getTriggerReactionTriggerParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleSuspend1420);
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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSuspend1432); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:700:1: entryRuleReactionTrigger returns [EObject current=null] : iv_ruleReactionTrigger= ruleReactionTrigger EOF ;
    public final EObject entryRuleReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:701:2: (iv_ruleReactionTrigger= ruleReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:702:2: iv_ruleReactionTrigger= ruleReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1468);
            iv_ruleReactionTrigger=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionTrigger1478); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:709:1: ruleReactionTrigger returns [EObject current=null] : ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? ) | (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' ) ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:712:28: ( ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? ) | (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:713:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? ) | (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:713:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? ) | (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:713:2: () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? ) | (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:713:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:714:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:719:2: ( (lv_isImmediate_1_0= '#' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:720:1: (lv_isImmediate_1_0= '#' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:720:1: (lv_isImmediate_1_0= '#' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:721:3: lv_isImmediate_1_0= '#'
                    {
                    lv_isImmediate_1_0=(Token)match(input,26,FOLLOW_26_in_ruleReactionTrigger1530); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:734:3: ( (lv_delay_2_0= RULE_INT ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:735:1: (lv_delay_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:735:1: (lv_delay_2_0= RULE_INT )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:736:3: lv_delay_2_0= RULE_INT
                    {
                    lv_delay_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReactionTrigger1561); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:752:3: ( ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? ) | (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||(LA13_0>=43 && LA13_0<=48)||(LA13_0>=69 && LA13_0<=70)) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:752:4: ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:752:4: ( ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )? )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:752:5: ( (lv_triggers_3_0= ruleEventSpec ) ) (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )?
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:752:5: ( (lv_triggers_3_0= ruleEventSpec ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:753:1: (lv_triggers_3_0= ruleEventSpec )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:753:1: (lv_triggers_3_0= ruleEventSpec )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:754:3: lv_triggers_3_0= ruleEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_3_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventSpec_in_ruleReactionTrigger1590);
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

                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:770:2: (otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==16) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:770:4: otherlv_4= ',' ( (lv_triggers_5_0= ruleEventSpec ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleReactionTrigger1603); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getReactionTriggerAccess().getCommaKeyword_3_0_1_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:774:1: ( (lv_triggers_5_0= ruleEventSpec ) )
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:775:1: (lv_triggers_5_0= ruleEventSpec )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:775:1: (lv_triggers_5_0= ruleEventSpec )
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:776:3: lv_triggers_5_0= ruleEventSpec
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_3_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEventSpec_in_ruleReactionTrigger1624);
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
                    	    break loop11;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:792:4: ( ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==27) && (synpred1_InternalSCCExp())) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:792:5: ( ( '[' )=>otherlv_6= '[' ) ( (lv_guardExpression_7_0= ruleExpression ) ) otherlv_8= ']'
                            {
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:792:5: ( ( '[' )=>otherlv_6= '[' )
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:792:6: ( '[' )=>otherlv_6= '['
                            {
                            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleReactionTrigger1647); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_3_0_2_0());
                                  
                            }

                            }

                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:797:2: ( (lv_guardExpression_7_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:798:1: (lv_guardExpression_7_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:798:1: (lv_guardExpression_7_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:799:3: lv_guardExpression_7_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_3_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger1669);
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

                            otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleReactionTrigger1681); if (state.failed) return current;
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:820:6: (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:820:6: (otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:820:8: otherlv_9= '[' ( (lv_guardExpression_10_0= ruleExpression ) ) otherlv_11= ']'
                    {
                    otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleReactionTrigger1703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_3_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:824:1: ( (lv_guardExpression_10_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:825:1: (lv_guardExpression_10_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:825:1: (lv_guardExpression_10_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:826:3: lv_guardExpression_10_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger1724);
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

                    otherlv_11=(Token)match(input,28,FOLLOW_28_in_ruleReactionTrigger1736); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:854:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:855:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:856:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1774);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression1784); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:863:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_PreValueExpressionreturns_2= rulePreValueExpressionreturns | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:866:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_PreValueExpressionreturns_2= rulePreValueExpressionreturns | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:867:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_PreValueExpressionreturns_2= rulePreValueExpressionreturns | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:867:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_PreValueExpressionreturns_2= rulePreValueExpressionreturns | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_HEX:
            case RULE_STRING:
                {
                alt14=1;
                }
                break;
            case RULE_ID:
                {
                alt14=2;
                }
                break;
            case 31:
                {
                alt14=3;
                }
                break;
            case 29:
                {
                alt14=4;
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:868:5: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrimitiveValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression1831);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:878:5: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression1858);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:888:5: this_PreValueExpressionreturns_2= rulePreValueExpressionreturns
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPreValueExpressionreturnsParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulePreValueExpressionreturns_in_rulePrimaryExpression1885);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:897:6: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:897:6: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:897:8: otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_rulePrimaryExpression1903); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression1925);
                    this_Expression_4=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,30,FOLLOW_30_in_rulePrimaryExpression1936); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:922:1: entryRulePreValueExpressionreturns returns [EObject current=null] : iv_rulePreValueExpressionreturns= rulePreValueExpressionreturns EOF ;
    public final EObject entryRulePreValueExpressionreturns() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreValueExpressionreturns = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:923:2: (iv_rulePreValueExpressionreturns= rulePreValueExpressionreturns EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:924:2: iv_rulePreValueExpressionreturns= rulePreValueExpressionreturns EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreValueExpressionreturnsRule()); 
            }
            pushFollow(FOLLOW_rulePreValueExpressionreturns_in_entryRulePreValueExpressionreturns1973);
            iv_rulePreValueExpressionreturns=rulePreValueExpressionreturns();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreValueExpressionreturns; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreValueExpressionreturns1983); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:931:1: rulePreValueExpressionreturns returns [EObject current=null] : ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject rulePreValueExpressionreturns() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:934:28: ( ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:935:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:935:1: ( () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:935:2: () otherlv_1= 'pre' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:935:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:936:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPreValueExpressionreturnsAccess().getPreValueExpressionreturnsAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_rulePreValueExpressionreturns2029); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPreValueExpressionreturnsAccess().getPreKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,29,FOLLOW_29_in_rulePreValueExpressionreturns2041); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPreValueExpressionreturnsAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:949:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:950:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:950:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:951:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPreValueExpressionreturnsAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_rulePreValueExpressionreturns2062);
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

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_rulePreValueExpressionreturns2074); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:981:1: entryRuleDefRoot returns [EObject current=null] : iv_ruleDefRoot= ruleDefRoot EOF ;
    public final EObject entryRuleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:982:2: (iv_ruleDefRoot= ruleDefRoot EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:983:2: iv_ruleDefRoot= ruleDefRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefRootRule()); 
            }
            pushFollow(FOLLOW_ruleDefRoot_in_entryRuleDefRoot2112);
            iv_ruleDefRoot=ruleDefRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRoot2122); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:990:1: ruleDefRoot returns [EObject current=null] : (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) ;
    public final EObject ruleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject this_StatechartRoot_0 = null;

        EObject this_StateRoot_1 = null;

        EObject this_TransitionRoot_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:993:28: ( (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:994:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:994:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt15=1;
                }
                break;
            case 33:
                {
                alt15=2;
                }
                break;
            case 34:
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:995:5: this_StatechartRoot_0= ruleStatechartRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStatechartRootParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatechartRoot_in_ruleDefRoot2169);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1005:5: this_StateRoot_1= ruleStateRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStateRootParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStateRoot_in_ruleDefRoot2196);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1015:5: this_TransitionRoot_2= ruleTransitionRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getTransitionRootParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransitionRoot_in_ruleDefRoot2223);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1031:1: entryRuleStatechartRoot returns [EObject current=null] : iv_ruleStatechartRoot= ruleStatechartRoot EOF ;
    public final EObject entryRuleStatechartRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1032:2: (iv_ruleStatechartRoot= ruleStatechartRoot EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1033:2: iv_ruleStatechartRoot= ruleStatechartRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartRootRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2258);
            iv_ruleStatechartRoot=ruleStatechartRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartRoot2268); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1040:1: ruleStatechartRoot returns [EObject current=null] : (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) ;
    public final EObject ruleStatechartRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1043:28: ( (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1044:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1044:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1044:3: otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleStatechartRoot2305); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatechartRootAccess().getStatechartKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1048:1: ( (lv_def_1_0= ruleStatechartSpecification ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1049:1: (lv_def_1_0= ruleStatechartSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1049:1: (lv_def_1_0= ruleStatechartSpecification )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1050:3: lv_def_1_0= ruleStatechartSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatechartRootAccess().getDefStatechartSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2326);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1074:1: entryRuleStateRoot returns [EObject current=null] : iv_ruleStateRoot= ruleStateRoot EOF ;
    public final EObject entryRuleStateRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1075:2: (iv_ruleStateRoot= ruleStateRoot EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1076:2: iv_ruleStateRoot= ruleStateRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRootRule()); 
            }
            pushFollow(FOLLOW_ruleStateRoot_in_entryRuleStateRoot2362);
            iv_ruleStateRoot=ruleStateRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateRoot2372); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1083:1: ruleStateRoot returns [EObject current=null] : (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) ;
    public final EObject ruleStateRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1086:28: ( (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1087:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1087:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1087:3: otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleStateRoot2409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateRootAccess().getStateKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1091:1: ( (lv_def_1_0= ruleStateSpecification ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1092:1: (lv_def_1_0= ruleStateSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1092:1: (lv_def_1_0= ruleStateSpecification )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1093:3: lv_def_1_0= ruleStateSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateRootAccess().getDefStateSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_ruleStateRoot2430);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1117:1: entryRuleTransitionRoot returns [EObject current=null] : iv_ruleTransitionRoot= ruleTransitionRoot EOF ;
    public final EObject entryRuleTransitionRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1118:2: (iv_ruleTransitionRoot= ruleTransitionRoot EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1119:2: iv_ruleTransitionRoot= ruleTransitionRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRootRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2466);
            iv_ruleTransitionRoot=ruleTransitionRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionRoot2476); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1126:1: ruleTransitionRoot returns [EObject current=null] : (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) ;
    public final EObject ruleTransitionRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1129:28: ( (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1130:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1130:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1130:3: otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleTransitionRoot2513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionRootAccess().getTransitionKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1134:1: ( (lv_def_1_0= ruleTransitionSpecification ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1135:1: (lv_def_1_0= ruleTransitionSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1135:1: (lv_def_1_0= ruleTransitionSpecification )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1136:3: lv_def_1_0= ruleTransitionSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionRootAccess().getDefTransitionSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2534);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1162:1: entryRuleStatechartSpecification returns [EObject current=null] : iv_ruleStatechartSpecification= ruleStatechartSpecification EOF ;
    public final EObject entryRuleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1163:2: (iv_ruleStatechartSpecification= ruleStatechartSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1164:2: iv_ruleStatechartSpecification= ruleStatechartSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2572);
            iv_ruleStatechartSpecification=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartSpecification2582); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1171:1: ruleStatechartSpecification returns [EObject current=null] : ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) ;
    public final EObject ruleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        EObject lv_scopes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1174:28: ( ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1175:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1175:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1175:2: () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )*
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1175:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1176:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatechartSpecificationAccess().getStatechartSpecificationAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1181:2: (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1181:4: otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleStatechartSpecification2629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatechartSpecificationAccess().getNamespaceKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1185:1: ( (lv_namespace_2_0= ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1186:1: (lv_namespace_2_0= ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1186:1: (lv_namespace_2_0= ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1187:3: lv_namespace_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getNamespaceFQNParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleStatechartSpecification2650);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1203:4: ( (lv_scopes_3_0= ruleStatechartScope ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==14||LA17_0==36) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1204:1: (lv_scopes_3_0= ruleStatechartScope )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1204:1: (lv_scopes_3_0= ruleStatechartScope )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1205:3: lv_scopes_3_0= ruleStatechartScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getScopesStatechartScopeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification2673);
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
    // $ANTLR end "ruleStatechartSpecification"


    // $ANTLR start "entryRuleTransitionSpecification"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1229:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1230:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1231:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification2710);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification2720); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1238:1: ruleTransitionSpecification returns [EObject current=null] : ( (lv_reaction_0_0= ruleTransitionReaction ) ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_reaction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1241:28: ( ( (lv_reaction_0_0= ruleTransitionReaction ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1242:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1242:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1243:1: (lv_reaction_0_0= ruleTransitionReaction )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1243:1: (lv_reaction_0_0= ruleTransitionReaction )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1244:3: lv_reaction_0_0= ruleTransitionReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getReactionTransitionReactionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification2765);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1270:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1271:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1272:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope2802);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartScope2812); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1279:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1282:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1283:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1283:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            else if ( (LA18_0==36) ) {
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1284:5: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStatechartScope2859);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1294:5: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalScope_in_ruleStatechartScope2886);
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


    // $ANTLR start "entryRuleInternalScope"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1312:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1313:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1314:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInternalScope_in_entryRuleInternalScope2923);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalScope2933); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1321:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1324:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1325:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1325:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1325:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1325:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1326:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInternalScopeAccess().getInternalScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleInternalScope2979); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleInternalScope2991); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1339:1: ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_INT)||LA20_0==18||(LA20_0>=26 && LA20_0<=27)||(LA20_0>=37 && LA20_0<=38)||(LA20_0>=43 && LA20_0<=48)||(LA20_0>=65 && LA20_0<=70)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1340:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1340:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1341:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1341:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
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

            	        if ( (LA19_2==RULE_ID||LA19_2==18) ) {
            	            alt19=2;
            	        }
            	        else if ( (LA19_2==37) ) {
            	            alt19=1;
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

            	        if ( (LA19_3==RULE_ID||LA19_3==18) ) {
            	            alt19=2;
            	        }
            	        else if ( (LA19_3==37) ) {
            	            alt19=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 19, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 18:
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
            	        else if ( (LA19_5==16||LA19_5==22||LA19_5==27||LA19_5==29||LA19_5==41) ) {
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
            	    case 26:
            	    case 27:
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
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1342:3: lv_declarations_3_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3014);
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
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1357:8: lv_declarations_3_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3033);
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
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1372:8: lv_declarations_3_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3052);
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
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1387:8: lv_declarations_3_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsLocalReactionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleInternalScope3071);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1415:1: entryRuleEventDeclarartion returns [EObject current=null] : iv_ruleEventDeclarartion= ruleEventDeclarartion EOF ;
    public final EObject entryRuleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclarartion = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1416:2: (iv_ruleEventDeclarartion= ruleEventDeclarartion EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1417:2: iv_ruleEventDeclarartion= ruleEventDeclarartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarartionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3113);
            iv_ruleEventDeclarartion=ruleEventDeclarartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclarartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclarartion3123); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1424:1: ruleEventDeclarartion returns [EObject current=null] : this_EventDefinition_0= ruleEventDefinition ;
    public final EObject ruleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject this_EventDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1427:28: (this_EventDefinition_0= ruleEventDefinition )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1429:5: this_EventDefinition_0= ruleEventDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEventDeclarartionAccess().getEventDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3169);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1447:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1448:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1449:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3205);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDefinition3215); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1456:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1459:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1460:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1460:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1460:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1460:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=66 && LA21_0<=68)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1461:1: (lv_direction_0_0= ruleDirection )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1461:1: (lv_direction_0_0= ruleDirection )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1462:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_ruleEventDefinition3261);
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

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleEventDefinition3274); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1482:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1483:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1483:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1484:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventDefinition3291); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1500:2: (otherlv_3= ':' ( ( ruleFQN ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==15) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1500:4: otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleEventDefinition3309); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1504:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1505:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1505:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1506:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getTypeTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEventDefinition3332);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1527:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1528:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1529:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3370);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration3380); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1536:1: ruleVariableDeclaration returns [EObject current=null] : this_VariableDefinition_0= ruleVariableDefinition ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1539:28: (this_VariableDefinition_0= ruleVariableDefinition )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1541:5: this_VariableDefinition_0= ruleVariableDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration3426);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1559:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1560:2: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1561:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration3462);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDeclaration3472); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1568:1: ruleOperationDeclaration returns [EObject current=null] : this_OperationDefinition_0= ruleOperationDefinition ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1571:28: (this_OperationDefinition_0= ruleOperationDefinition )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1573:5: this_OperationDefinition_0= ruleOperationDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOperationDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration3518);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1591:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1592:2: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1593:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition3554);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDefinition3564); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1600:1: ruleOperationDefinition returns [EObject current=null] : ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1603:28: ( ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1604:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1604:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1604:2: () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1604:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1605:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationDefinitionAccess().getOperationDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleOperationDefinition3610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionAccess().getOperationKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1614:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1615:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1615:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1616:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperationDefinition3627); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleOperationDefinition3644); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1636:1: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1636:2: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1636:2: ( (lv_parameters_4_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1637:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1637:1: (lv_parameters_4_0= ruleParameter )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1638:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition3666);
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

                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1654:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==16) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1654:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleOperationDefinition3679); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getOperationDefinitionAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1658:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1659:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1659:1: (lv_parameters_6_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1660:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition3700);
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

            otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleOperationDefinition3716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1680:1: (otherlv_8= ':' ( ( ruleFQN ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==15) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1680:3: otherlv_8= ':' ( ( ruleFQN ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleOperationDefinition3729); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getOperationDefinitionAccess().getColonKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1684:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1685:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1685:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1686:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getTypeTypeCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition3752);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1707:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1708:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1709:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3790);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3800); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1716:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1719:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1720:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1720:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1720:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1720:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1721:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1721:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1722:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter3842); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleParameter3859); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1742:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1743:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1743:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1744:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleParameter3882);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1765:1: entryRuleEntrypoint returns [EObject current=null] : iv_ruleEntrypoint= ruleEntrypoint EOF ;
    public final EObject entryRuleEntrypoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntrypoint = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1766:2: (iv_ruleEntrypoint= ruleEntrypoint EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1767:2: iv_ruleEntrypoint= ruleEntrypoint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntrypointRule()); 
            }
            pushFollow(FOLLOW_ruleEntrypoint_in_entryRuleEntrypoint3918);
            iv_ruleEntrypoint=ruleEntrypoint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntrypoint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntrypoint3928); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1774:1: ruleEntrypoint returns [EObject current=null] : ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleEntrypoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1777:28: ( ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1778:1: ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1778:1: ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1778:2: () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1778:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1779:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntrypointAccess().getEntrypointAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleEntrypoint3974); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntrypointAccess().getEntrypointKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1788:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1789:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1789:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1790:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntrypoint3991); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1814:1: entryRuleExitpoint returns [EObject current=null] : iv_ruleExitpoint= ruleExitpoint EOF ;
    public final EObject entryRuleExitpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitpoint = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1815:2: (iv_ruleExitpoint= ruleExitpoint EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1816:2: iv_ruleExitpoint= ruleExitpoint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitpointRule()); 
            }
            pushFollow(FOLLOW_ruleExitpoint_in_entryRuleExitpoint4032);
            iv_ruleExitpoint=ruleExitpoint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitpoint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitpoint4042); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1823:1: ruleExitpoint returns [EObject current=null] : ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleExitpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1826:28: ( ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1827:1: ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1827:1: ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1827:2: () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1827:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1828:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitpointAccess().getExitpointAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleExitpoint4088); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitpointAccess().getExitpointKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1837:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1838:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1838:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1839:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExitpoint4105); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1863:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1864:2: (iv_ruleFQN= ruleFQN EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1865:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN4147);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN4158); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1872:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1875:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1876:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1876:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1876:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN4198); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1883:1: (kw= '.' this_ID_2= RULE_ID )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==41) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1884:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,41,FOLLOW_41_in_ruleFQN4217); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN4232); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1906:1: entryRuleLocalReaction returns [EObject current=null] : iv_ruleLocalReaction= ruleLocalReaction EOF ;
    public final EObject entryRuleLocalReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1907:2: (iv_ruleLocalReaction= ruleLocalReaction EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1908:2: iv_ruleLocalReaction= ruleLocalReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction4281);
            iv_ruleLocalReaction=ruleLocalReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReaction4291); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1915:1: ruleLocalReaction returns [EObject current=null] : ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) ;
    public final EObject ruleLocalReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_trigger_0_0 = null;

        EObject lv_effect_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1918:28: ( ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1919:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1919:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1919:2: ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1919:2: ( (lv_trigger_0_0= ruleReactionTrigger ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1920:1: (lv_trigger_0_0= ruleReactionTrigger )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1920:1: (lv_trigger_0_0= ruleReactionTrigger )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1921:3: lv_trigger_0_0= ruleReactionTrigger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerReactionTriggerParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReaction4337);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1937:2: ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1937:3: ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1942:6: (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1942:8: otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) )
            {
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleLocalReaction4369); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalReactionAccess().getSolidusKeyword_1_0_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1946:1: ( (lv_effect_2_0= ruleReactionEffect ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1947:1: (lv_effect_2_0= ruleReactionEffect )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1947:1: (lv_effect_2_0= ruleReactionEffect )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1948:3: lv_effect_2_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectReactionEffectParserRuleCall_1_0_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalReaction4390);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1972:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1973:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1974:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction4428);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionReaction4438); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1981:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1984:28: ( ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1985:1: ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1985:1: ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1985:2: () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1985:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1986:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionReactionAccess().getTransitionReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1991:2: ( (lv_trigger_1_0= ruleReactionTrigger ) )?
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1992:1: (lv_trigger_1_0= ruleReactionTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1992:1: (lv_trigger_1_0= ruleReactionTrigger )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1993:3: lv_trigger_1_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerReactionTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleTransitionReaction4493);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2009:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==22) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2009:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleTransitionReaction4507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2013:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2014:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2014:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2015:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransitionReaction4528);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2031:4: (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2031:6: otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleTransitionReaction4543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionReactionAccess().getNumberSignKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2035:1: ( (lv_properties_5_0= ruleReactionProperties ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2036:1: (lv_properties_5_0= ruleReactionProperties )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2036:1: (lv_properties_5_0= ruleReactionProperties )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2037:3: lv_properties_5_0= ruleReactionProperties
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getPropertiesReactionPropertiesParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionProperties_in_ruleTransitionReaction4564);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2061:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2062:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2063:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect4602);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionEffect4612); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2070:1: ruleReactionEffect returns [EObject current=null] : ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_3_1 = null;

        EObject lv_actions_3_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2073:28: ( ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2074:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2074:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2074:2: () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2074:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2075:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2080:2: ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2081:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2081:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2082:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2082:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_STRING)||LA30_0==29||LA30_0==31||LA30_0==53||(LA30_0>=83 && LA30_0<=84)||LA30_0==87) ) {
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2083:3: lv_actions_1_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect4669);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2098:8: lv_actions_1_2= ruleEventRaisingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4688);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2116:2: ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            loop32:
            do {
                int alt32=2;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2116:3: ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2116:3: ( ( ';' )=>otherlv_2= ';' )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2116:4: ( ';' )=>otherlv_2= ';'
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleReactionEffect4712); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReactionEffectAccess().getSemicolonKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2121:2: ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2122:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2122:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2123:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2123:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_STRING)||LA31_0==29||LA31_0==31||LA31_0==53||(LA31_0>=83 && LA31_0<=84)||LA31_0==87) ) {
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
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2124:3: lv_actions_3_1= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect4736);
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
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2139:8: lv_actions_3_2= ruleEventRaisingExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_2_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4755);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2165:1: entryRuleReactionProperties returns [EObject current=null] : iv_ruleReactionProperties= ruleReactionProperties EOF ;
    public final EObject entryRuleReactionProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionProperties = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2166:2: (iv_ruleReactionProperties= ruleReactionProperties EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2167:2: iv_ruleReactionProperties= ruleReactionProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionPropertiesRule()); 
            }
            pushFollow(FOLLOW_ruleReactionProperties_in_entryRuleReactionProperties4796);
            iv_ruleReactionProperties=ruleReactionProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionProperties; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionProperties4806); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2174:1: ruleReactionProperties returns [EObject current=null] : ( () ( (lv_properties_1_0= ruleReactionProperty ) )* ) ;
    public final EObject ruleReactionProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2177:28: ( ( () ( (lv_properties_1_0= ruleReactionProperty ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2178:1: ( () ( (lv_properties_1_0= ruleReactionProperty ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2178:1: ( () ( (lv_properties_1_0= ruleReactionProperty ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2178:2: () ( (lv_properties_1_0= ruleReactionProperty ) )*
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2178:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2179:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionPropertiesAccess().getReactionPropertiesAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2184:2: ( (lv_properties_1_0= ruleReactionProperty ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||LA33_0==42) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2185:1: (lv_properties_1_0= ruleReactionProperty )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2185:1: (lv_properties_1_0= ruleReactionProperty )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2186:3: lv_properties_1_0= ruleReactionProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReactionPropertiesAccess().getPropertiesReactionPropertyParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleReactionProperty_in_ruleReactionProperties4861);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2210:1: entryRuleReactionProperty returns [EObject current=null] : iv_ruleReactionProperty= ruleReactionProperty EOF ;
    public final EObject entryRuleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionProperty = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2211:2: (iv_ruleReactionProperty= ruleReactionProperty EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2212:2: iv_ruleReactionProperty= ruleReactionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReactionProperty_in_entryRuleReactionProperty4898);
            iv_ruleReactionProperty=ruleReactionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionProperty4908); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2219:1: ruleReactionProperty returns [EObject current=null] : (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) ;
    public final EObject ruleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_EntryPointSpec_0 = null;

        EObject this_ExitPointSpec_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2222:28: ( (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2223:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2223:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2224:5: this_EntryPointSpec_0= ruleEntryPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReactionPropertyAccess().getEntryPointSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryPointSpec_in_ruleReactionProperty4955);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2234:5: this_ExitPointSpec_1= ruleExitPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReactionPropertyAccess().getExitPointSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitPointSpec_in_ruleReactionProperty4982);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2250:1: entryRuleEntryPointSpec returns [EObject current=null] : iv_ruleEntryPointSpec= ruleEntryPointSpec EOF ;
    public final EObject entryRuleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2251:2: (iv_ruleEntryPointSpec= ruleEntryPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2252:2: iv_ruleEntryPointSpec= ruleEntryPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec5017);
            iv_ruleEntryPointSpec=ruleEntryPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryPointSpec5027); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2259:1: ruleEntryPointSpec returns [EObject current=null] : (otherlv_0= '>' ( ( ruleFQN ) ) ) ;
    public final EObject ruleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2262:28: ( (otherlv_0= '>' ( ( ruleFQN ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2263:1: (otherlv_0= '>' ( ( ruleFQN ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2263:1: (otherlv_0= '>' ( ( ruleFQN ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2263:3: otherlv_0= '>' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleEntryPointSpec5064); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntryPointSpecAccess().getGreaterThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2267:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2268:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2268:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2269:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEntryPointSpecRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntryPointSpecAccess().getEntrypointEntrypointCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleEntryPointSpec5087);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2290:1: entryRuleExitPointSpec returns [EObject current=null] : iv_ruleExitPointSpec= ruleExitPointSpec EOF ;
    public final EObject entryRuleExitPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2291:2: (iv_ruleExitPointSpec= ruleExitPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2292:2: iv_ruleExitPointSpec= ruleExitPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec5123);
            iv_ruleExitPointSpec=ruleExitPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitPointSpec5133); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2299:1: ruleExitPointSpec returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= '>' ) ;
    public final EObject ruleExitPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2302:28: ( ( ( ( ruleFQN ) ) otherlv_1= '>' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2303:1: ( ( ( ruleFQN ) ) otherlv_1= '>' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2303:1: ( ( ( ruleFQN ) ) otherlv_1= '>' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2303:2: ( ( ruleFQN ) ) otherlv_1= '>'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2303:2: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2304:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2304:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2305:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExitPointSpecRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExitPointSpecAccess().getExitpointExitpointCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleExitPointSpec5181);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleExitPointSpec5193); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2330:1: entryRuleEventSpec returns [EObject current=null] : iv_ruleEventSpec= ruleEventSpec EOF ;
    public final EObject entryRuleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2331:2: (iv_ruleEventSpec= ruleEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2332:2: iv_ruleEventSpec= ruleEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEventSpec_in_entryRuleEventSpec5229);
            iv_ruleEventSpec=ruleEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventSpec5239); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2339:1: ruleEventSpec returns [EObject current=null] : (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) ;
    public final EObject ruleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_RegularEventSpec_0 = null;

        EObject this_TimeEventSpec_1 = null;

        EObject this_BuiltinEventSpec_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2342:28: ( (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2343:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2343:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2344:5: this_RegularEventSpec_0= ruleRegularEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getRegularEventSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRegularEventSpec_in_ruleEventSpec5286);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2354:5: this_TimeEventSpec_1= ruleTimeEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getTimeEventSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTimeEventSpec_in_ruleEventSpec5313);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2364:5: this_BuiltinEventSpec_2= ruleBuiltinEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getBuiltinEventSpecParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBuiltinEventSpec_in_ruleEventSpec5340);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2380:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2381:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2382:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5375);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularEventSpec5385); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2389:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2392:28: ( ( (lv_event_0_0= ruleFeatureCall ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2393:1: ( (lv_event_0_0= ruleFeatureCall ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2393:1: ( (lv_event_0_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2394:1: (lv_event_0_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2394:1: (lv_event_0_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2395:3: lv_event_0_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5430);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2419:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2420:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2421:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5465);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeEventSpec5475); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2428:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_type_0_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2431:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2432:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2432:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2432:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )?
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2432:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2433:1: (lv_type_0_0= ruleTimeEventType )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2433:1: (lv_type_0_0= ruleTimeEventType )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2434:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5521);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2450:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2451:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2451:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2452:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeEventSpec5538); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2468:2: ( (lv_unit_2_0= ruleTimeUnit ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=93 && LA36_0<=96)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2469:1: (lv_unit_2_0= ruleTimeUnit )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2469:1: (lv_unit_2_0= ruleTimeUnit )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2470:3: lv_unit_2_0= ruleTimeUnit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5564);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2494:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2495:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2496:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5601);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinEventSpec5611); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2503:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_OnCycleEvent_2 = null;

        EObject this_AlwaysEvent_3 = null;

        EObject this_DefaultEvent_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2506:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2507:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2507:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent )
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2508:5: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5658);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2518:5: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5685);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2528:5: this_OnCycleEvent_2= ruleOnCycleEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getOnCycleEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOnCycleEvent_in_ruleBuiltinEventSpec5712);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2538:5: this_AlwaysEvent_3= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec5739);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2548:5: this_DefaultEvent_4= ruleDefaultEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getDefaultEventParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultEvent_in_ruleBuiltinEventSpec5766);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2564:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2565:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2566:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent5801);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryEvent5811); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2573:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2576:28: ( ( () otherlv_1= 'entry' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2577:1: ( () otherlv_1= 'entry' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2577:1: ( () otherlv_1= 'entry' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2577:2: () otherlv_1= 'entry'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2577:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2578:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryEventAccess().getEntryEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleEntryEvent5857); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2595:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2596:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2597:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent5893);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent5903); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2604:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2607:28: ( ( () otherlv_1= 'exit' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2608:1: ( () otherlv_1= 'exit' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2608:1: ( () otherlv_1= 'exit' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2608:2: () otherlv_1= 'exit'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2608:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2609:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitEventAccess().getExitEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleExitEvent5949); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2626:1: entryRuleOnCycleEvent returns [EObject current=null] : iv_ruleOnCycleEvent= ruleOnCycleEvent EOF ;
    public final EObject entryRuleOnCycleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnCycleEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2627:2: (iv_ruleOnCycleEvent= ruleOnCycleEvent EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2628:2: iv_ruleOnCycleEvent= ruleOnCycleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOnCycleEventRule()); 
            }
            pushFollow(FOLLOW_ruleOnCycleEvent_in_entryRuleOnCycleEvent5985);
            iv_ruleOnCycleEvent=ruleOnCycleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOnCycleEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnCycleEvent5995); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2635:1: ruleOnCycleEvent returns [EObject current=null] : ( () otherlv_1= 'oncycle' ) ;
    public final EObject ruleOnCycleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2638:28: ( ( () otherlv_1= 'oncycle' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2639:1: ( () otherlv_1= 'oncycle' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2639:1: ( () otherlv_1= 'oncycle' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2639:2: () otherlv_1= 'oncycle'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2639:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2640:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOnCycleEventAccess().getOnCycleEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleOnCycleEvent6041); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2657:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2658:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2659:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent6077);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEvent6087); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2666:1: ruleAlwaysEvent returns [EObject current=null] : ( () otherlv_1= 'always' ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2669:28: ( ( () otherlv_1= 'always' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2670:1: ( () otherlv_1= 'always' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2670:1: ( () otherlv_1= 'always' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2670:2: () otherlv_1= 'always'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2670:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2671:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlwaysEventAccess().getAlwaysEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleAlwaysEvent6133); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2688:1: entryRuleDefaultEvent returns [EObject current=null] : iv_ruleDefaultEvent= ruleDefaultEvent EOF ;
    public final EObject entryRuleDefaultEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2689:2: (iv_ruleDefaultEvent= ruleDefaultEvent EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2690:2: iv_ruleDefaultEvent= ruleDefaultEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultEventRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultEvent_in_entryRuleDefaultEvent6169);
            iv_ruleDefaultEvent=ruleDefaultEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultEvent6179); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2697:1: ruleDefaultEvent returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2700:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2701:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2701:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2701:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2701:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2702:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultEventAccess().getDefaultEventAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2707:2: (otherlv_1= 'default' | otherlv_2= 'else' )
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2707:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleDefaultEvent6226); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultEventAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2712:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleDefaultEvent6244); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2724:1: entryRuleEventRaisingExpression returns [EObject current=null] : iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF ;
    public final EObject entryRuleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventRaisingExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2725:2: (iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2726:2: iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRaisingExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventRaisingExpression_in_entryRuleEventRaisingExpression6281);
            iv_ruleEventRaisingExpression=ruleEventRaisingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventRaisingExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventRaisingExpression6291); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2733:1: ruleEventRaisingExpression returns [EObject current=null] : ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_event_2_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2736:28: ( ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2737:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2737:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2737:2: () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2737:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2738:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventRaisingExpressionAccess().getEventRaisingExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleEventRaisingExpression6337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventRaisingExpressionAccess().getRaiseKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2747:1: ( (lv_event_2_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2748:1: (lv_event_2_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2748:1: (lv_event_2_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2749:3: lv_event_2_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getEventFeatureCallParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventRaisingExpression6358);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2765:2: (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==15) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2765:4: otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleEventRaisingExpression6371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventRaisingExpressionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2769:1: ( (lv_value_4_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2770:1: (lv_value_4_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2770:1: (lv_value_4_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2771:3: lv_value_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getValueExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleEventRaisingExpression6392);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2797:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2798:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2799:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6432);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6442); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2806:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2809:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2811:5: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpression6488);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2827:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2828:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2829:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6522);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression6532); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2836:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2839:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2840:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2840:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2841:5: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6579);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2849:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==19||(LA40_0>=71 && LA40_0<=80)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2849:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2849:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2850:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2855:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2856:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2856:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2857:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6609);
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

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2873:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2874:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2874:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2875:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6630);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2899:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2900:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2901:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6668);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression6678); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2908:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2911:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2912:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2912:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2913:5: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6725);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2921:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==50) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2921:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2921:2: ()
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2922:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleConditionalExpression6746); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2931:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2932:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2932:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2933:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6767);
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

                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleConditionalExpression6779); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2953:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2954:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2954:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2955:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6800);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2979:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2980:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2981:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6838);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression6848); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2988:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2991:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2992:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2992:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2993:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6895);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3001:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==51) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3001:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3001:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3002:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleLogicalOrExpression6916); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3011:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3012:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3012:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3013:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6937);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3037:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3038:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3039:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6975);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression6985); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3046:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3049:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3050:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3050:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3051:5: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7032);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3059:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==52) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3059:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3059:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3060:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleLogicalAndExpression7053); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3069:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3070:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3070:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3071:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7074);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3095:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3096:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3097:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression7112);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNotExpression7122); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3104:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3107:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3108:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3108:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_STRING)||LA44_0==29||LA44_0==31||(LA44_0>=83 && LA44_0<=84)||LA44_0==87) ) {
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3109:5: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7169);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3118:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3118:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3118:7: () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3118:7: ()
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3119:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalNotExpressionAccess().getLogicalNotExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleLogicalNotExpression7196); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLogicalNotExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3128:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3129:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3129:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3130:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7217);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3154:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3155:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3156:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7254);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression7264); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3163:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3166:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3167:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3167:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3168:5: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7311);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3176:1: ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==54) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3176:2: () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3176:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3177:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleBitwiseXorExpression7332); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3186:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3187:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3187:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3188:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7353);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3212:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3213:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3214:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7391);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression7401); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3221:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3224:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3225:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3225:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3226:5: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7448);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3234:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==55) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3234:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3234:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3235:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleBitwiseOrExpression7469); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3244:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3245:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3245:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3246:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7490);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3270:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3271:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3272:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7528);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression7538); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3279:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3282:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3283:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3283:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3284:5: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7585);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3292:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==56) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3292:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3292:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3293:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleBitwiseAndExpression7606); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3302:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3303:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3303:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3304:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7627);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3328:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3329:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3330:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7665);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalRelationExpression7675); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3337:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3340:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3341:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3341:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3342:5: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7722);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3350:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==42||(LA48_0>=88 && LA48_0<=92)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3350:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3350:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3351:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3356:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3357:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3357:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3358:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7752);
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

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3374:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3375:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3375:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3376:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7773);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3400:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3401:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3402:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7811);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression7821); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3409:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3412:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3413:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3413:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3414:5: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7868);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3422:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=81 && LA49_0<=82)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3422:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3422:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3423:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3428:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3429:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3429:1: (lv_operator_2_0= ruleShiftOperator )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3430:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression7898);
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

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3446:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3447:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3447:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3448:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7919);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3472:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3473:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3474:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7957);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7967); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3481:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3484:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3485:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3485:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3486:5: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8014);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3494:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=83 && LA50_0<=84)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3494:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3494:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3495:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3500:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3501:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3501:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3502:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression8044);
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

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3518:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3519:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3519:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3520:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8065);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3544:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3545:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3546:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression8103);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression8113); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3553:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3556:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3557:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3557:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3558:5: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8160);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3566:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==22||(LA51_0>=85 && LA51_0<=86)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3566:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3566:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3567:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3572:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3573:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3573:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3574:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8190);
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

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3590:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3591:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3591:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3592:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8211);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3616:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3617:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3618:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8249);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8259); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3625:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3628:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3629:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3629:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_ID && LA52_0<=RULE_STRING)||LA52_0==29||LA52_0==31) ) {
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3630:5: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8306);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3639:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3639:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3639:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3639:7: ()
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3640:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumericalUnaryExpressionAccess().getNumericalUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3645:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3646:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3646:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3647:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8342);
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

                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3663:2: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3664:1: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3664:1: (lv_operand_3_0= rulePrimaryExpression )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3665:3: lv_operand_3_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8363);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3689:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3690:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3691:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8400);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValueExpression8410); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3698:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3701:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3702:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3702:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3702:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3702:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3703:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveValueExpressionAccess().getPrimitiveValueExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3708:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3709:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3709:1: (lv_value_1_0= ruleLiteral )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3710:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8465);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3734:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3735:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3736:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8501);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall8511); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3743:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3746:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3747:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3747:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3748:5: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8558);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3756:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==41) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3756:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3756:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3757:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleFeatureCall8579); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3766:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3767:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3767:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3768:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureCall8599); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3779:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==29) && (synpred4_InternalSCCExp())) {
            	        alt55=1;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3779:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3779:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3779:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3786:1: (lv_operationCall_4_0= '(' )
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3787:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,29,FOLLOW_29_in_ruleFeatureCall8633); if (state.failed) return current;
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

            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3800:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt54=2;
            	            int LA54_0 = input.LA(1);

            	            if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_STRING)||LA54_0==29||LA54_0==31||LA54_0==53||(LA54_0>=83 && LA54_0<=84)||LA54_0==87) ) {
            	                alt54=1;
            	            }
            	            switch (alt54) {
            	                case 1 :
            	                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3800:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3800:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3801:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3801:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3802:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8668);
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

            	                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3818:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop53:
            	                    do {
            	                        int alt53=2;
            	                        int LA53_0 = input.LA(1);

            	                        if ( (LA53_0==16) ) {
            	                            alt53=1;
            	                        }


            	                        switch (alt53) {
            	                    	case 1 :
            	                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3818:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleFeatureCall8681); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3822:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3823:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3823:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3824:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8702);
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

            	            otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleFeatureCall8718); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3852:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3853:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3854:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8758);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementReferenceExpression8768); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3861:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3864:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3865:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3865:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3865:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3865:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3866:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementReferenceExpressionAccess().getElementReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3871:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3872:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3872:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3873:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementReferenceExpression8822); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3884:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==29) && (synpred5_InternalSCCExp())) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3884:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3884:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3884:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3891:1: (lv_operationCall_2_0= '(' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3892:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,29,FOLLOW_29_in_ruleElementReferenceExpression8856); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3905:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_STRING)||LA58_0==29||LA58_0==31||LA58_0==53||(LA58_0>=83 && LA58_0<=84)||LA58_0==87) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3905:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3905:3: ( (lv_args_3_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3906:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3906:1: (lv_args_3_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3907:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8891);
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

                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3923:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop57:
                            do {
                                int alt57=2;
                                int LA57_0 = input.LA(1);

                                if ( (LA57_0==16) ) {
                                    alt57=1;
                                }


                                switch (alt57) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3923:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleElementReferenceExpression8904); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3927:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3928:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3928:1: (lv_args_5_0= ruleExpression )
                            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3929:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8925);
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

                    otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleElementReferenceExpression8941); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3961:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3962:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3963:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral8983);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral8993); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3970:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_RealLiteral_3 = null;

        EObject this_StringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3973:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3974:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3974:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3975:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral9040);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3985:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral9067);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3995:5: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexLiteral_in_ruleLiteral9094);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4005:5: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleLiteral9121);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4015:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral9148);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4031:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4032:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4033:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9183);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral9193); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4040:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4043:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4044:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4044:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4044:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4044:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4045:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4050:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4051:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4051:1: (lv_value_1_0= RULE_BOOL )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4052:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral9244); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4076:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4077:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4078:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9285);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral9295); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4085:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4088:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4089:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4089:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4089:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4089:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4090:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4095:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4096:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4096:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4097:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral9346); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4121:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4122:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4123:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9387);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral9397); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4130:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4133:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4134:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4134:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4134:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4134:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4135:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4140:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4141:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4141:1: (lv_value_1_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4142:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleRealLiteral9448); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4166:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4167:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4168:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9489);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexLiteral9499); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4175:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4178:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4179:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4179:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4179:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4179:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4180:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHexLiteralAccess().getHexLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4185:2: ( (lv_value_1_0= RULE_HEX ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4186:1: (lv_value_1_0= RULE_HEX )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4186:1: (lv_value_1_0= RULE_HEX )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4187:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleHexLiteral9550); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4211:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4212:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4213:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9591);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral9601); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4220:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4223:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4224:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4224:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4224:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4224:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4225:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4230:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4231:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4231:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4232:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral9652); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4256:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4258:28: ( ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4259:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4259:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4259:2: (enumLiteral_0= '\\'none\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4259:2: (enumLiteral_0= '\\'none\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4259:4: enumLiteral_0= '\\'none\\''
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_57_in_ruleCombineOperator9707); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4265:6: (enumLiteral_1= '\\'+\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4265:6: (enumLiteral_1= '\\'+\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4265:8: enumLiteral_1= '\\'+\\''
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_58_in_ruleCombineOperator9724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4271:6: (enumLiteral_2= '\\'*\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4271:6: (enumLiteral_2= '\\'*\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4271:8: enumLiteral_2= '\\'*\\''
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_59_in_ruleCombineOperator9741); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4277:6: (enumLiteral_3= '\\'max\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4277:6: (enumLiteral_3= '\\'max\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4277:8: enumLiteral_3= '\\'max\\''
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_60_in_ruleCombineOperator9758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4283:6: (enumLiteral_4= '\\'min\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4283:6: (enumLiteral_4= '\\'min\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4283:8: enumLiteral_4= '\\'min\\''
                    {
                    enumLiteral_4=(Token)match(input,61,FOLLOW_61_in_ruleCombineOperator9775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4289:6: (enumLiteral_5= '\\'or\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4289:6: (enumLiteral_5= '\\'or\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4289:8: enumLiteral_5= '\\'or\\''
                    {
                    enumLiteral_5=(Token)match(input,62,FOLLOW_62_in_ruleCombineOperator9792); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4295:6: (enumLiteral_6= '\\'and\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4295:6: (enumLiteral_6= '\\'and\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4295:8: enumLiteral_6= '\\'and\\''
                    {
                    enumLiteral_6=(Token)match(input,63,FOLLOW_63_in_ruleCombineOperator9809); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4301:6: (enumLiteral_7= '\\'host\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4301:6: (enumLiteral_7= '\\'host\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4301:8: enumLiteral_7= '\\'host\\''
                    {
                    enumLiteral_7=(Token)match(input,64,FOLLOW_64_in_ruleCombineOperator9826); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4311:1: ruleVarDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'inout' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleVarDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4313:28: ( ( (enumLiteral_0= 'inout' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4314:1: ( (enumLiteral_0= 'inout' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4314:1: ( (enumLiteral_0= 'inout' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4314:2: (enumLiteral_0= 'inout' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4314:2: (enumLiteral_0= 'inout' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4314:4: enumLiteral_0= 'inout'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_65_in_ruleVarDirection9871); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVarDirectionAccess().getINOUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVarDirectionAccess().getINOUTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4320:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4320:6: (enumLiteral_1= 'in' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4320:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_66_in_ruleVarDirection9888); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVarDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getVarDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4326:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4326:6: (enumLiteral_2= 'out' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4326:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_67_in_ruleVarDirection9905); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4336:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4338:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4339:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4339:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4339:2: (enumLiteral_0= 'local' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4339:2: (enumLiteral_0= 'local' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4339:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_68_in_ruleDirection9950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4345:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4345:6: (enumLiteral_1= 'in' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4345:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_66_in_ruleDirection9967); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4351:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4351:6: (enumLiteral_2= 'out' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4351:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_67_in_ruleDirection9984); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4361:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4363:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4364:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4364:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4364:2: (enumLiteral_0= 'after' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4364:2: (enumLiteral_0= 'after' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4364:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_69_in_ruleTimeEventType10029); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4370:6: (enumLiteral_1= 'every' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4370:6: (enumLiteral_1= 'every' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4370:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_70_in_ruleTimeEventType10046); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4380:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4382:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4383:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4383:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            int alt65=11;
            switch ( input.LA(1) ) {
            case 19:
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4383:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4383:2: (enumLiteral_0= '=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4383:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_19_in_ruleAssignmentOperator10091); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4389:6: (enumLiteral_1= '*=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4389:6: (enumLiteral_1= '*=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4389:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_71_in_ruleAssignmentOperator10108); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4395:6: (enumLiteral_2= '/=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4395:6: (enumLiteral_2= '/=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4395:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_72_in_ruleAssignmentOperator10125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4401:6: (enumLiteral_3= '%=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4401:6: (enumLiteral_3= '%=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4401:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,73,FOLLOW_73_in_ruleAssignmentOperator10142); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4407:6: (enumLiteral_4= '+=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4407:6: (enumLiteral_4= '+=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4407:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,74,FOLLOW_74_in_ruleAssignmentOperator10159); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4413:6: (enumLiteral_5= '-=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4413:6: (enumLiteral_5= '-=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4413:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,75,FOLLOW_75_in_ruleAssignmentOperator10176); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4419:6: (enumLiteral_6= '<<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4419:6: (enumLiteral_6= '<<=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4419:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,76,FOLLOW_76_in_ruleAssignmentOperator10193); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4425:6: (enumLiteral_7= '>>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4425:6: (enumLiteral_7= '>>=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4425:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,77,FOLLOW_77_in_ruleAssignmentOperator10210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4431:6: (enumLiteral_8= '&=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4431:6: (enumLiteral_8= '&=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4431:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,78,FOLLOW_78_in_ruleAssignmentOperator10227); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4437:6: (enumLiteral_9= '^=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4437:6: (enumLiteral_9= '^=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4437:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,79,FOLLOW_79_in_ruleAssignmentOperator10244); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4443:6: (enumLiteral_10= '|=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4443:6: (enumLiteral_10= '|=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4443:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,80,FOLLOW_80_in_ruleAssignmentOperator10261); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4453:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4455:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4456:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4456:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4456:2: (enumLiteral_0= '<<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4456:2: (enumLiteral_0= '<<' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4456:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_81_in_ruleShiftOperator10306); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4462:6: (enumLiteral_1= '>>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4462:6: (enumLiteral_1= '>>' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4462:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_82_in_ruleShiftOperator10323); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4472:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4474:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4475:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4475:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4475:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4475:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4475:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_83_in_ruleAdditiveOperator10368); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4481:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4481:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4481:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_84_in_ruleAdditiveOperator10385); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4491:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4493:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4494:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4494:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt68=3;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt68=1;
                }
                break;
            case 22:
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4494:2: (enumLiteral_0= '*' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4494:2: (enumLiteral_0= '*' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4494:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_85_in_ruleMultiplicativeOperator10430); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4500:6: (enumLiteral_1= '/' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4500:6: (enumLiteral_1= '/' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4500:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_22_in_ruleMultiplicativeOperator10447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4506:6: (enumLiteral_2= '%' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4506:6: (enumLiteral_2= '%' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4506:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,86,FOLLOW_86_in_ruleMultiplicativeOperator10464); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4516:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4518:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4519:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4519:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4519:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4519:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4519:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_83_in_ruleUnaryOperator10509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4525:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4525:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4525:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_84_in_ruleUnaryOperator10526); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4531:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4531:6: (enumLiteral_2= '~' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4531:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,87,FOLLOW_87_in_ruleUnaryOperator10543); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4541:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4543:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4544:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4544:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4544:2: (enumLiteral_0= '<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4544:2: (enumLiteral_0= '<' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4544:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_88_in_ruleRelationalOperator10588); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4550:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4550:6: (enumLiteral_1= '<=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4550:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_89_in_ruleRelationalOperator10605); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4556:6: (enumLiteral_2= '>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4556:6: (enumLiteral_2= '>' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4556:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_42_in_ruleRelationalOperator10622); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4562:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4562:6: (enumLiteral_3= '>=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4562:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,90,FOLLOW_90_in_ruleRelationalOperator10639); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4568:6: (enumLiteral_4= '==' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4568:6: (enumLiteral_4= '==' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4568:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,91,FOLLOW_91_in_ruleRelationalOperator10656); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4574:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4574:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4574:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,92,FOLLOW_92_in_ruleRelationalOperator10673); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4584:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4586:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4587:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4587:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4587:2: (enumLiteral_0= 's' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4587:2: (enumLiteral_0= 's' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4587:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,93,FOLLOW_93_in_ruleTimeUnit10718); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4593:6: (enumLiteral_1= 'ms' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4593:6: (enumLiteral_1= 'ms' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4593:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,94,FOLLOW_94_in_ruleTimeUnit10735); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4599:6: (enumLiteral_2= 'us' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4599:6: (enumLiteral_2= 'us' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4599:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,95,FOLLOW_95_in_ruleTimeUnit10752); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4605:6: (enumLiteral_3= 'ns' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4605:6: (enumLiteral_3= 'ns' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4605:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,96,FOLLOW_96_in_ruleTimeUnit10769); if (state.failed) return current;
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
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:792:6: ( '[' )
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:792:8: '['
        {
        match(input,27,FOLLOW_27_in_synpred1_InternalSCCExp1639); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSCCExp

    // $ANTLR start synpred3_InternalSCCExp
    public final void synpred3_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2116:4: ( ';' )
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2116:6: ';'
        {
        match(input,17,FOLLOW_17_in_synpred3_InternalSCCExp4704); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalSCCExp

    // $ANTLR start synpred4_InternalSCCExp
    public final void synpred4_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3779:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3780:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3780:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3781:2: '('
        {
        match(input,29,FOLLOW_29_in_synpred4_InternalSCCExp8615); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalSCCExp

    // $ANTLR start synpred5_InternalSCCExp
    public final void synpred5_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3884:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3885:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3885:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3886:2: '('
        {
        match(input,29,FOLLOW_29_in_synpred5_InternalSCCExp8838); if (state.failed) return ;

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
        "\2\4\2\uffff\1\20\1\4\1\20";
    static final String DFA27_maxS =
        "\2\106\2\uffff\1\52\1\4\1\52";
    static final String DFA27_acceptS =
        "\2\uffff\1\1\1\2\3\uffff";
    static final String DFA27_specialS =
        "\7\uffff}>";
    static final String[] DFA27_transitionS = {
            "\2\2\20\uffff\1\3\3\uffff\1\1\1\2\17\uffff\6\2\24\uffff\2\2",
            "\1\4\1\2\25\uffff\1\2\16\uffff\1\3\6\2\24\uffff\2\2",
            "",
            "",
            "\1\2\5\uffff\1\2\3\uffff\2\2\1\uffff\1\2\13\uffff\1\5\1\3",
            "\1\6",
            "\1\2\5\uffff\1\2\3\uffff\2\2\1\uffff\1\2\13\uffff\1\5\1\3"
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
            return "1991:2: ( (lv_trigger_1_0= ruleReactionTrigger ) )?";
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
            "\2\2\10\uffff\1\2\2\uffff\1\1\1\2\7\uffff\2\2\10\uffff\3\2"+
            "\4\uffff\6\2\20\uffff\6\2",
            "\1\10\1\4\1\3\1\6\1\5\1\7\23\uffff\1\12\1\uffff\1\11\21\uffff"+
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
            return "()* loopback of 2116:2: ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*";
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

                        else if ( (LA32_1==31) && (synpred3_InternalSCCExp())) {s = 9;}

                        else if ( (LA32_1==29) && (synpred3_InternalSCCExp())) {s = 10;}

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
 

    public static final BitSet FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateSpecification85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStateSpecification140 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleStateScope_in_entryRuleStateScope177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateScope187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStateScope234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionScope_in_ruleStateScope261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScope306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleInterfaceScope352 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInterfaceScope364 = new BitSet(new long[]{0x0000000000040010L,0x000000000000000EL});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope385 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleInterfaceScope398 = new BitSet(new long[]{0x0000000000040010L,0x000000000000000EL});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope419 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleInterfaceScope433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDirection_in_ruleVariableDefinition534 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleVariableDefinition553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDefinition584 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDefinition601 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleVariableDefinition624 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_19_in_ruleVariableDefinition637 = new BitSet(new long[]{0x00200000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDefinition658 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleVariableDefinition673 = new BitSet(new long[]{0xFE00000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleVariableDefinition694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionScope_in_entryRuleReactionScope732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionScope742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryAction_in_ruleReactionScope789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsideAction_in_ruleReactionScope808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitAction_in_ruleReactionScope827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspend_in_ruleReactionScope846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitAction_in_entryRuleExitAction884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitAction894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleExitAction940 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExitAction952 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleExitAction964 = new BitSet(new long[]{0x00220000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleExitAction985 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleExitAction997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsideAction_in_entryRuleInsideAction1033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsideAction1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleInsideAction1089 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInsideAction1101 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleInsideAction1113 = new BitSet(new long[]{0x00220000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleInsideAction1134 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInsideAction1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryAction_in_entryRuleEntryAction1182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryAction1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleEntryAction1238 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEntryAction1250 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEntryAction1262 = new BitSet(new long[]{0x00220000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleEntryAction1283 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEntryAction1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspend_in_entryRuleSuspend1331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuspend1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSuspend1387 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSuspend1399 = new BitSet(new long[]{0x0001F8000C000030L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleSuspend1420 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSuspend1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionTrigger1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleReactionTrigger1530 = new BitSet(new long[]{0x0001F80008000030L,0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReactionTrigger1561 = new BitSet(new long[]{0x0001F80008000010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEventSpec_in_ruleReactionTrigger1590 = new BitSet(new long[]{0x0000000008010002L});
    public static final BitSet FOLLOW_16_in_ruleReactionTrigger1603 = new BitSet(new long[]{0x0001F80000000010L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEventSpec_in_ruleReactionTrigger1624 = new BitSet(new long[]{0x0000000008010002L});
    public static final BitSet FOLLOW_27_in_ruleReactionTrigger1647 = new BitSet(new long[]{0x00200000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger1669 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleReactionTrigger1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleReactionTrigger1703 = new BitSet(new long[]{0x00200000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger1724 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleReactionTrigger1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueExpressionreturns_in_rulePrimaryExpression1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePrimaryExpression1903 = new BitSet(new long[]{0x00200000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression1925 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePrimaryExpression1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueExpressionreturns_in_entryRulePreValueExpressionreturns1973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreValueExpressionreturns1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePreValueExpressionreturns2029 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePreValueExpressionreturns2041 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePreValueExpressionreturns2062 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePreValueExpressionreturns2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRoot_in_entryRuleDefRoot2112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRoot2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_ruleDefRoot2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_ruleDefRoot2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_ruleDefRoot2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartRoot2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleStatechartRoot2305 = new BitSet(new long[]{0x0000001800004000L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_entryRuleStateRoot2362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateRoot2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleStateRoot2409 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleStateRoot2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionRoot2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTransitionRoot2513 = new BitSet(new long[]{0x0001F8000C400030L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartSpecification2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleStatechartSpecification2629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleStatechartSpecification2650 = new BitSet(new long[]{0x0000001000004002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification2673 = new BitSet(new long[]{0x0000001000004002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification2710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope2802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartScope2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStatechartScope2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_ruleStatechartScope2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_entryRuleInternalScope2923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalScope2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleInternalScope2979 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInternalScope2991 = new BitSet(new long[]{0x0001F8600C040032L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3014 = new BitSet(new long[]{0x0001F8600C040032L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3033 = new BitSet(new long[]{0x0001F8600C040032L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3052 = new BitSet(new long[]{0x0001F8600C040032L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleInternalScope3071 = new BitSet(new long[]{0x0001F8600C040032L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclarartion3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDefinition3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleEventDefinition3261 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleEventDefinition3274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventDefinition3291 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleEventDefinition3309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEventDefinition3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration3462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDeclaration3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition3554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDefinition3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOperationDefinition3610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperationDefinition3627 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleOperationDefinition3644 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition3666 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleOperationDefinition3679 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition3700 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_30_in_ruleOperationDefinition3716 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleOperationDefinition3729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter3842 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleParameter3859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleParameter3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntrypoint_in_entryRuleEntrypoint3918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntrypoint3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEntrypoint3974 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntrypoint3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitpoint_in_entryRuleExitpoint4032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitpoint4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleExitpoint4088 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExitpoint4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN4147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN4158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN4198 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleFQN4217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN4232 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction4281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReaction4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReaction4337 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleLocalReaction4369 = new BitSet(new long[]{0x00220000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalReaction4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction4428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionReaction4438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleTransitionReaction4493 = new BitSet(new long[]{0x0000000004400002L});
    public static final BitSet FOLLOW_22_in_ruleTransitionReaction4507 = new BitSet(new long[]{0x00220000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransitionReaction4528 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleTransitionReaction4543 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_ruleReactionProperties_in_ruleTransitionReaction4564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect4602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionEffect4612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect4669 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4688 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleReactionEffect4712 = new BitSet(new long[]{0x00220000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect4736 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4755 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleReactionProperties_in_entryRuleReactionProperties4796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionProperties4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionProperty_in_ruleReactionProperties4861 = new BitSet(new long[]{0x0000040000000012L});
    public static final BitSet FOLLOW_ruleReactionProperty_in_entryRuleReactionProperty4898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionProperty4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_ruleReactionProperty4955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_ruleReactionProperty4982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec5017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryPointSpec5027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEntryPointSpec5064 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEntryPointSpec5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec5123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitPointSpec5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleExitPointSpec5181 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleExitPointSpec5193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSpec_in_entryRuleEventSpec5229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventSpec5239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_ruleEventSpec5286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_ruleEventSpec5313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_ruleEventSpec5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularEventSpec5385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeEventSpec5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5521 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeEventSpec5538 = new BitSet(new long[]{0x0000000000000002L,0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinEventSpec5611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCycleEvent_in_ruleBuiltinEventSpec5712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec5739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultEvent_in_ruleBuiltinEventSpec5766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent5801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryEvent5811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEntryEvent5857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent5893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent5903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleExitEvent5949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCycleEvent_in_entryRuleOnCycleEvent5985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnCycleEvent5995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOnCycleEvent6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent6077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEvent6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleAlwaysEvent6133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultEvent_in_entryRuleDefaultEvent6169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultEvent6179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDefaultEvent6226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDefaultEvent6244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_entryRuleEventRaisingExpression6281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventRaisingExpression6291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleEventRaisingExpression6337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventRaisingExpression6358 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleEventRaisingExpression6371 = new BitSet(new long[]{0x00200000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEventRaisingExpression6392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpression6488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression6532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6579 = new BitSet(new long[]{0x0000000000080002L,0x000000000001FF80L});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6609 = new BitSet(new long[]{0x00200000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6630 = new BitSet(new long[]{0x0000000000080002L,0x000000000001FF80L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression6678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6725 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleConditionalExpression6746 = new BitSet(new long[]{0x00200000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6767 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConditionalExpression6779 = new BitSet(new long[]{0x00200000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression6848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6895 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleLogicalOrExpression6916 = new BitSet(new long[]{0x00200000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6937 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression6985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7032 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleLogicalAndExpression7053 = new BitSet(new long[]{0x00200000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7074 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression7112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNotExpression7122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleLogicalNotExpression7196 = new BitSet(new long[]{0x00000000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression7264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7311 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleBitwiseXorExpression7332 = new BitSet(new long[]{0x00000000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7353 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression7401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7448 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleBitwiseOrExpression7469 = new BitSet(new long[]{0x00000000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7490 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression7538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7585 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleBitwiseAndExpression7606 = new BitSet(new long[]{0x00000000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7627 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalRelationExpression7675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7722 = new BitSet(new long[]{0x0000040000000002L,0x000000001F000000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7752 = new BitSet(new long[]{0x00000000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7773 = new BitSet(new long[]{0x0000040000000002L,0x000000001F000000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression7821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7868 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060000L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression7898 = new BitSet(new long[]{0x00000000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7919 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8014 = new BitSet(new long[]{0x0000000000000002L,0x0000000000180000L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression8044 = new BitSet(new long[]{0x00000000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8065 = new BitSet(new long[]{0x0000000000000002L,0x0000000000180000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression8103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression8113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8160 = new BitSet(new long[]{0x0000000000400002L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8190 = new BitSet(new long[]{0x00000000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8211 = new BitSet(new long[]{0x0000000000400002L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8342 = new BitSet(new long[]{0x00000000A00003F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValueExpression8410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall8511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8558 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleFeatureCall8579 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureCall8599 = new BitSet(new long[]{0x0000020020000002L});
    public static final BitSet FOLLOW_29_in_ruleFeatureCall8633 = new BitSet(new long[]{0x00200000E00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8668 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleFeatureCall8681 = new BitSet(new long[]{0x00200000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8702 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_30_in_ruleFeatureCall8718 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementReferenceExpression8768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementReferenceExpression8822 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleElementReferenceExpression8856 = new BitSet(new long[]{0x00200000E00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8891 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_16_in_ruleElementReferenceExpression8904 = new BitSet(new long[]{0x00200000A00003F0L,0x0000000000980000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8925 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_30_in_ruleElementReferenceExpression8941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral8983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral8993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral9040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral9067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_ruleLiteral9094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleLiteral9121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral9148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral9193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral9244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral9295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral9346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral9397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRealLiteral9448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexLiteral9499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleHexLiteral9550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral9652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleCombineOperator9707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleCombineOperator9724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleCombineOperator9741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleCombineOperator9758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleCombineOperator9775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleCombineOperator9792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleCombineOperator9809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleCombineOperator9826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleVarDirection9871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleVarDirection9888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleVarDirection9905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleDirection9950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleDirection9967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleDirection9984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleTimeEventType10029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleTimeEventType10046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAssignmentOperator10091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleAssignmentOperator10108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleAssignmentOperator10125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleAssignmentOperator10142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleAssignmentOperator10159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleAssignmentOperator10176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleAssignmentOperator10193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAssignmentOperator10210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleAssignmentOperator10227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleAssignmentOperator10244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleAssignmentOperator10261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleShiftOperator10306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleShiftOperator10323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleAdditiveOperator10368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleAdditiveOperator10385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleMultiplicativeOperator10430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleMultiplicativeOperator10447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleMultiplicativeOperator10464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleUnaryOperator10509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleUnaryOperator10526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleUnaryOperator10543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleRelationalOperator10588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleRelationalOperator10605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleRelationalOperator10622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleRelationalOperator10639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleRelationalOperator10656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleRelationalOperator10673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleTimeUnit10718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleTimeUnit10735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleTimeUnit10752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleTimeUnit10769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred1_InternalSCCExp1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred3_InternalSCCExp4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred4_InternalSCCExp8615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred5_InternalSCCExp8838 = new BitSet(new long[]{0x0000000000000002L});

}