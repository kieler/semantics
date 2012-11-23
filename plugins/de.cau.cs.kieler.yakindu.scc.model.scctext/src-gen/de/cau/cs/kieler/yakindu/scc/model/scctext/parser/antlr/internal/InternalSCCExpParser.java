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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_FLOAT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interface'", "':'", "','", "';'", "'static'", "'='", "'with'", "'Exit'", "'/'", "'Inside'", "'Entry'", "'Suspend'", "'#'", "'['", "']'", "'@@statechart@@'", "'@@state@@'", "'@@transition@@'", "'namespace'", "'internal'", "'event'", "'operation'", "'('", "')'", "'.'", "'>'", "'entry'", "'exit'", "'oncycle'", "'always'", "'default'", "'else'", "'raise'", "'?'", "'||'", "'&&'", "'!'", "'^'", "'|'", "'&'", "'valueof'", "'active'", "'\\'none\\''", "'\\'+\\''", "'\\'*\\''", "'\\'max\\''", "'\\'min\\''", "'\\'or\\''", "'\\'and\\''", "'\\'host\\''", "'inout'", "'in'", "'out'", "'local'", "'after'", "'every'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'%'", "'~'", "'<'", "'<='", "'>='", "'=='", "'!='", "'s'", "'ms'", "'us'", "'ns'"
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
    public static final int T__92=92;
    public static final int RULE_HEX=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:77:1: ruleStateSpecification returns [EObject current=null] : ( (lv_scopes_0_0= ruleStateScope ) )* ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_scopes_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:80:28: ( ( (lv_scopes_0_0= ruleStateScope ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:81:1: ( (lv_scopes_0_0= ruleStateScope ) )*
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:81:1: ( (lv_scopes_0_0= ruleStateScope ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==21||(LA1_0>=23 && LA1_0<=25)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:82:1: (lv_scopes_0_0= ruleStateScope )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:82:1: (lv_scopes_0_0= ruleStateScope )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:83:3: lv_scopes_0_0= ruleStateScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateSpecificationAccess().getScopesStateScopeParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStateScope_in_ruleStateSpecification130);
            	    lv_scopes_0_0=ruleStateScope();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStateSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"scopes",
            	              		lv_scopes_0_0, 
            	              		"StateScope");
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

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:107:1: entryRuleStateScope returns [EObject current=null] : iv_ruleStateScope= ruleStateScope EOF ;
    public final EObject entryRuleStateScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:108:2: (iv_ruleStateScope= ruleStateScope EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:109:2: iv_ruleStateScope= ruleStateScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStateScope_in_entryRuleStateScope166);
            iv_ruleStateScope=ruleStateScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateScope176); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:116:1: ruleStateScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_ReactionScope_1= ruleReactionScope ) ;
    public final EObject ruleStateScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_ReactionScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:119:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_ReactionScope_1= ruleReactionScope ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:120:1: (this_InterfaceScope_0= ruleInterfaceScope | this_ReactionScope_1= ruleReactionScope )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:120:1: (this_InterfaceScope_0= ruleInterfaceScope | this_ReactionScope_1= ruleReactionScope )
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:121:5: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStateScope223);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:131:5: this_ReactionScope_1= ruleReactionScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStateScopeAccess().getReactionScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReactionScope_in_ruleStateScope250);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:147:1: entryRuleInterfaceScope returns [EObject current=null] : iv_ruleInterfaceScope= ruleInterfaceScope EOF ;
    public final EObject entryRuleInterfaceScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:148:2: (iv_ruleInterfaceScope= ruleInterfaceScope EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:149:2: iv_ruleInterfaceScope= ruleInterfaceScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope285);
            iv_ruleInterfaceScope=ruleInterfaceScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceScope295); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:156:1: ruleInterfaceScope returns [EObject current=null] : ( () otherlv_1= 'interface' otherlv_2= ':' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ',' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= ';' ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:159:28: ( ( () otherlv_1= 'interface' otherlv_2= ':' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ',' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= ';' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:160:1: ( () otherlv_1= 'interface' otherlv_2= ':' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ',' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:160:1: ( () otherlv_1= 'interface' otherlv_2= ':' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ',' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= ';' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:160:2: () otherlv_1= 'interface' otherlv_2= ':' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ',' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= ';'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:160:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:161:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInterfaceScopeAccess().getInterfaceScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleInterfaceScope341); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceScopeAccess().getInterfaceKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleInterfaceScope353); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInterfaceScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:174:1: ( (lv_declarations_3_0= ruleDeclaration ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:175:1: (lv_declarations_3_0= ruleDeclaration )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:175:1: (lv_declarations_3_0= ruleDeclaration )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:176:3: lv_declarations_3_0= ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDeclaration_in_ruleInterfaceScope374);
            lv_declarations_3_0=ruleDeclaration();

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
                      		"Declaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:192:2: (otherlv_4= ',' ( (lv_declarations_5_0= ruleDeclaration ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:192:4: otherlv_4= ',' ( (lv_declarations_5_0= ruleDeclaration ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleInterfaceScope387); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getInterfaceScopeAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:196:1: ( (lv_declarations_5_0= ruleDeclaration ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:197:1: (lv_declarations_5_0= ruleDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:197:1: (lv_declarations_5_0= ruleDeclaration )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:198:3: lv_declarations_5_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsDeclarationParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleInterfaceScope408);
            	    lv_declarations_5_0=ruleDeclaration();

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
            	              		"Declaration");
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

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleInterfaceScope422); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDeclaration"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:226:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:227:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:228:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration458);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration468); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:235:1: ruleDeclaration returns [EObject current=null] : (this_VariableDefinition_0= ruleVariableDefinition | this_OperationDeclaration_1= ruleOperationDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;

        EObject this_OperationDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:238:28: ( (this_VariableDefinition_0= ruleVariableDefinition | this_OperationDeclaration_1= ruleOperationDeclaration ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:239:1: (this_VariableDefinition_0= ruleVariableDefinition | this_OperationDeclaration_1= ruleOperationDeclaration )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:239:1: (this_VariableDefinition_0= ruleVariableDefinition | this_OperationDeclaration_1= ruleOperationDeclaration )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||LA4_0==18||(LA4_0>=64 && LA4_0<=66)) ) {
                alt4=1;
            }
            else if ( (LA4_0==35) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:240:5: this_VariableDefinition_0= ruleVariableDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getVariableDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDefinition_in_ruleDeclaration515);
                    this_VariableDefinition_0=ruleVariableDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:250:5: this_OperationDeclaration_1= ruleOperationDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getOperationDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleDeclaration542);
                    this_OperationDeclaration_1=ruleOperationDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OperationDeclaration_1; 
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


    // $ANTLR start "entryRuleVariableDefinition"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:266:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:267:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:268:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition577);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition587); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:275:1: ruleVariableDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleVarDirection ) )? ( (lv_isStatic_1_0= 'static' ) )? ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_varInitialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_varCombineOperator_8_0= ruleCombineOperator ) ) )? ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_isStatic_1_0=null;
        Token lv_varName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_direction_0_0 = null;

        EObject lv_varInitialValue_6_0 = null;

        Enumerator lv_varCombineOperator_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:278:28: ( ( ( (lv_direction_0_0= ruleVarDirection ) )? ( (lv_isStatic_1_0= 'static' ) )? ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_varInitialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_varCombineOperator_8_0= ruleCombineOperator ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:279:1: ( ( (lv_direction_0_0= ruleVarDirection ) )? ( (lv_isStatic_1_0= 'static' ) )? ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_varInitialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_varCombineOperator_8_0= ruleCombineOperator ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:279:1: ( ( (lv_direction_0_0= ruleVarDirection ) )? ( (lv_isStatic_1_0= 'static' ) )? ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_varInitialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_varCombineOperator_8_0= ruleCombineOperator ) ) )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:279:2: ( (lv_direction_0_0= ruleVarDirection ) )? ( (lv_isStatic_1_0= 'static' ) )? ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_varInitialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_varCombineOperator_8_0= ruleCombineOperator ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:279:2: ( (lv_direction_0_0= ruleVarDirection ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=64 && LA5_0<=66)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:280:1: (lv_direction_0_0= ruleVarDirection )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:280:1: (lv_direction_0_0= ruleVarDirection )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:281:3: lv_direction_0_0= ruleVarDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDirectionVarDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVarDirection_in_ruleVariableDefinition633);
                    lv_direction_0_0=ruleVarDirection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"direction",
                              		lv_direction_0_0, 
                              		"VarDirection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:297:3: ( (lv_isStatic_1_0= 'static' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:298:1: (lv_isStatic_1_0= 'static' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:298:1: (lv_isStatic_1_0= 'static' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:299:3: lv_isStatic_1_0= 'static'
                    {
                    lv_isStatic_1_0=(Token)match(input,18,FOLLOW_18_in_ruleVariableDefinition652); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:312:3: ( (lv_varName_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:313:1: (lv_varName_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:313:1: (lv_varName_2_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:314:3: lv_varName_2_0= RULE_ID
            {
            lv_varName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDefinition683); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_varName_2_0, grammarAccess.getVariableDefinitionAccess().getVarNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"varName",
                      		lv_varName_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleVariableDefinition700); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVariableDefinitionAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:334:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:335:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:335:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:336:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getVarTypeTypeCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleVariableDefinition723);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:349:2: (otherlv_5= '=' ( (lv_varInitialValue_6_0= ruleExpression ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:349:4: otherlv_5= '=' ( (lv_varInitialValue_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleVariableDefinition736); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getVariableDefinitionAccess().getEqualsSignKeyword_5_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:353:1: ( (lv_varInitialValue_6_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:354:1: (lv_varInitialValue_6_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:354:1: (lv_varInitialValue_6_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:355:3: lv_varInitialValue_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getVarInitialValueExpressionParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDefinition757);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:371:4: (otherlv_7= 'with' ( (lv_varCombineOperator_8_0= ruleCombineOperator ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:371:6: otherlv_7= 'with' ( (lv_varCombineOperator_8_0= ruleCombineOperator ) )
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleVariableDefinition772); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getVariableDefinitionAccess().getWithKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:375:1: ( (lv_varCombineOperator_8_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:376:1: (lv_varCombineOperator_8_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:376:1: (lv_varCombineOperator_8_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:377:3: lv_varCombineOperator_8_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getVarCombineOperatorCombineOperatorEnumRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleVariableDefinition793);
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


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:401:1: entryRuleReactionScope returns [EObject current=null] : iv_ruleReactionScope= ruleReactionScope EOF ;
    public final EObject entryRuleReactionScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:402:2: (iv_ruleReactionScope= ruleReactionScope EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:403:2: iv_ruleReactionScope= ruleReactionScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionScopeRule()); 
            }
            pushFollow(FOLLOW_ruleReactionScope_in_entryRuleReactionScope831);
            iv_ruleReactionScope=ruleReactionScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionScope841); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:410:1: ruleReactionScope returns [EObject current=null] : ( ( (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend ) ) ) ;
    public final EObject ruleReactionScope() throws RecognitionException {
        EObject current = null;

        EObject lv_reactionScope_0_1 = null;

        EObject lv_reactionScope_0_2 = null;

        EObject lv_reactionScope_0_3 = null;

        EObject lv_reactionScope_0_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:413:28: ( ( ( (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:414:1: ( ( (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:414:1: ( ( (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:415:1: ( (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:415:1: ( (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:416:1: (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:416:1: (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            case 25:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:417:3: lv_reactionScope_0_1= ruleEntryAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionScopeAccess().getReactionScopeEntryActionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEntryAction_in_ruleReactionScope888);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:432:8: lv_reactionScope_0_2= ruleInsideAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionScopeAccess().getReactionScopeInsideActionParserRuleCall_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInsideAction_in_ruleReactionScope907);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:447:8: lv_reactionScope_0_3= ruleExitAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionScopeAccess().getReactionScopeExitActionParserRuleCall_0_2()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExitAction_in_ruleReactionScope926);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:462:8: lv_reactionScope_0_4= ruleSuspend
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionScopeAccess().getReactionScopeSuspendParserRuleCall_0_3()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSuspend_in_ruleReactionScope945);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:488:1: entryRuleExitAction returns [EObject current=null] : iv_ruleExitAction= ruleExitAction EOF ;
    public final EObject entryRuleExitAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitAction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:489:2: (iv_ruleExitAction= ruleExitAction EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:490:2: iv_ruleExitAction= ruleExitAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitActionRule()); 
            }
            pushFollow(FOLLOW_ruleExitAction_in_entryRuleExitAction983);
            iv_ruleExitAction=ruleExitAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitAction993); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:497:1: ruleExitAction returns [EObject current=null] : ( () otherlv_1= 'Exit' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' ) ;
    public final EObject ruleExitAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_effect_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:500:28: ( ( () otherlv_1= 'Exit' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:501:1: ( () otherlv_1= 'Exit' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:501:1: ( () otherlv_1= 'Exit' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:501:2: () otherlv_1= 'Exit' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:501:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:502:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitActionAccess().getExitActionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleExitAction1039); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitActionAccess().getExitKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleExitAction1051); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExitActionAccess().getColonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleExitAction1063); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExitActionAccess().getSolidusKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:519:1: ( (lv_effect_4_0= ruleReactionEffect ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:520:1: (lv_effect_4_0= ruleReactionEffect )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:520:1: (lv_effect_4_0= ruleReactionEffect )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:521:3: lv_effect_4_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExitActionAccess().getEffectReactionEffectParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleExitAction1084);
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

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleExitAction1096); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:549:1: entryRuleInsideAction returns [EObject current=null] : iv_ruleInsideAction= ruleInsideAction EOF ;
    public final EObject entryRuleInsideAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsideAction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:550:2: (iv_ruleInsideAction= ruleInsideAction EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:551:2: iv_ruleInsideAction= ruleInsideAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsideActionRule()); 
            }
            pushFollow(FOLLOW_ruleInsideAction_in_entryRuleInsideAction1132);
            iv_ruleInsideAction=ruleInsideAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInsideAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsideAction1142); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:558:1: ruleInsideAction returns [EObject current=null] : ( () otherlv_1= 'Inside' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' ) ;
    public final EObject ruleInsideAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_effect_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:561:28: ( ( () otherlv_1= 'Inside' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:562:1: ( () otherlv_1= 'Inside' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:562:1: ( () otherlv_1= 'Inside' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:562:2: () otherlv_1= 'Inside' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:562:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:563:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInsideActionAccess().getInsideActionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleInsideAction1188); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInsideActionAccess().getInsideKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleInsideAction1200); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInsideActionAccess().getColonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleInsideAction1212); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInsideActionAccess().getSolidusKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:580:1: ( (lv_effect_4_0= ruleReactionEffect ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:581:1: (lv_effect_4_0= ruleReactionEffect )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:581:1: (lv_effect_4_0= ruleReactionEffect )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:582:3: lv_effect_4_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInsideActionAccess().getEffectReactionEffectParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleInsideAction1233);
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

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleInsideAction1245); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:610:1: entryRuleEntryAction returns [EObject current=null] : iv_ruleEntryAction= ruleEntryAction EOF ;
    public final EObject entryRuleEntryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryAction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:611:2: (iv_ruleEntryAction= ruleEntryAction EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:612:2: iv_ruleEntryAction= ruleEntryAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryActionRule()); 
            }
            pushFollow(FOLLOW_ruleEntryAction_in_entryRuleEntryAction1281);
            iv_ruleEntryAction=ruleEntryAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryAction1291); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:619:1: ruleEntryAction returns [EObject current=null] : ( () otherlv_1= 'Entry' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' ) ;
    public final EObject ruleEntryAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_effect_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:622:28: ( ( () otherlv_1= 'Entry' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:623:1: ( () otherlv_1= 'Entry' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:623:1: ( () otherlv_1= 'Entry' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:623:2: () otherlv_1= 'Entry' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleReactionEffect ) ) otherlv_5= ';'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:623:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:624:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryActionAccess().getEntryActionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleEntryAction1337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntryActionAccess().getEntryKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleEntryAction1349); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEntryActionAccess().getColonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleEntryAction1361); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEntryActionAccess().getSolidusKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:641:1: ( (lv_effect_4_0= ruleReactionEffect ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:642:1: (lv_effect_4_0= ruleReactionEffect )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:642:1: (lv_effect_4_0= ruleReactionEffect )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:643:3: lv_effect_4_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntryActionAccess().getEffectReactionEffectParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleEntryAction1382);
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

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleEntryAction1394); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:671:1: entryRuleSuspend returns [EObject current=null] : iv_ruleSuspend= ruleSuspend EOF ;
    public final EObject entryRuleSuspend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspend = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:672:2: (iv_ruleSuspend= ruleSuspend EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:673:2: iv_ruleSuspend= ruleSuspend EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuspendRule()); 
            }
            pushFollow(FOLLOW_ruleSuspend_in_entryRuleSuspend1430);
            iv_ruleSuspend=ruleSuspend();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuspend; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuspend1440); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:680:1: ruleSuspend returns [EObject current=null] : ( () otherlv_1= 'Suspend' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) ) otherlv_4= ';' ) ;
    public final EObject ruleSuspend() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:683:28: ( ( () otherlv_1= 'Suspend' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) ) otherlv_4= ';' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:684:1: ( () otherlv_1= 'Suspend' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) ) otherlv_4= ';' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:684:1: ( () otherlv_1= 'Suspend' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) ) otherlv_4= ';' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:684:2: () otherlv_1= 'Suspend' otherlv_2= ':' ( (lv_trigger_3_0= ruleReactionTrigger ) ) otherlv_4= ';'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:684:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:685:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSuspendAccess().getSuspendAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleSuspend1486); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSuspendAccess().getSuspendKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSuspend1498); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSuspendAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:698:1: ( (lv_trigger_3_0= ruleReactionTrigger ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:699:1: (lv_trigger_3_0= ruleReactionTrigger )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:699:1: (lv_trigger_3_0= ruleReactionTrigger )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:700:3: lv_trigger_3_0= ruleReactionTrigger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSuspendAccess().getTriggerReactionTriggerParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleSuspend1519);
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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSuspend1531); if (state.failed) return current;
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


    // $ANTLR start "entryRuleTransition"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:730:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:731:2: (iv_ruleTransition= ruleTransition EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:732:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition1569);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition1579); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:739:1: ruleTransition returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:742:28: ( ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:743:1: ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:743:1: ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:743:2: () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:743:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:744:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionAccess().getTransitionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:749:2: ( (lv_trigger_1_0= ruleReactionTrigger ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT||(LA10_0>=26 && LA10_0<=27)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:750:1: (lv_trigger_1_0= ruleReactionTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:750:1: (lv_trigger_1_0= ruleReactionTrigger )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:751:3: lv_trigger_1_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionAccess().getTriggerReactionTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleTransition1634);
                    lv_trigger_1_0=ruleReactionTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:767:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:767:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleTransition1648); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:771:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:772:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:772:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:773:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransition1669);
                    lv_effect_3_0=ruleReactionEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleReactionTrigger"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:797:1: entryRuleReactionTrigger returns [EObject current=null] : iv_ruleReactionTrigger= ruleReactionTrigger EOF ;
    public final EObject entryRuleReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionTrigger = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:798:2: (iv_ruleReactionTrigger= ruleReactionTrigger EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:799:2: iv_ruleReactionTrigger= ruleReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1707);
            iv_ruleReactionTrigger=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionTrigger1717); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:806:1: ruleReactionTrigger returns [EObject current=null] : ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? (otherlv_3= '[' ( (lv_guardExpression_4_0= ruleExpression ) ) otherlv_5= ']' ) ) ;
    public final EObject ruleReactionTrigger() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_1_0=null;
        Token lv_delay_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_guardExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:809:28: ( ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? (otherlv_3= '[' ( (lv_guardExpression_4_0= ruleExpression ) ) otherlv_5= ']' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:810:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? (otherlv_3= '[' ( (lv_guardExpression_4_0= ruleExpression ) ) otherlv_5= ']' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:810:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? (otherlv_3= '[' ( (lv_guardExpression_4_0= ruleExpression ) ) otherlv_5= ']' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:810:2: () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? (otherlv_3= '[' ( (lv_guardExpression_4_0= ruleExpression ) ) otherlv_5= ']' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:810:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:811:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:816:2: ( (lv_isImmediate_1_0= '#' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:817:1: (lv_isImmediate_1_0= '#' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:817:1: (lv_isImmediate_1_0= '#' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:818:3: lv_isImmediate_1_0= '#'
                    {
                    lv_isImmediate_1_0=(Token)match(input,26,FOLLOW_26_in_ruleReactionTrigger1769); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:831:3: ( (lv_delay_2_0= RULE_INT ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:832:1: (lv_delay_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:832:1: (lv_delay_2_0= RULE_INT )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:833:3: lv_delay_2_0= RULE_INT
                    {
                    lv_delay_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReactionTrigger1800); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:849:3: (otherlv_3= '[' ( (lv_guardExpression_4_0= ruleExpression ) ) otherlv_5= ']' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:849:5: otherlv_3= '[' ( (lv_guardExpression_4_0= ruleExpression ) ) otherlv_5= ']'
            {
            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleReactionTrigger1819); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_3_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:853:1: ( (lv_guardExpression_4_0= ruleExpression ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:854:1: (lv_guardExpression_4_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:854:1: (lv_guardExpression_4_0= ruleExpression )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:855:3: lv_guardExpression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_3_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger1840);
            lv_guardExpression_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
              	        }
                     		set(
                     			current, 
                     			"guardExpression",
                      		lv_guardExpression_4_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleReactionTrigger1852); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getReactionTriggerAccess().getRightSquareBracketKeyword_3_2());
                  
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
    // $ANTLR end "ruleReactionTrigger"


    // $ANTLR start "entryRuleReactionEffect"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:883:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:884:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:885:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect1889);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionEffect1899); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:892:1: ruleReactionEffect returns [EObject current=null] : ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_3_1 = null;

        EObject lv_actions_3_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:895:28: ( ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:896:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:896:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:896:2: () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:896:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:897:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:902:2: ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:903:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:903:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:904:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:904:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)||LA14_0==36||LA14_0==50||(LA14_0>=54 && LA14_0<=55)||(LA14_0>=82 && LA14_0<=83)||LA14_0==86) ) {
                alt14=1;
            }
            else if ( (LA14_0==46) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:905:3: lv_actions_1_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect1956);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:920:8: lv_actions_1_2= ruleEventRaisingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect1975);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:938:2: ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            loop16:
            do {
                int alt16=2;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:938:3: ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:938:3: ( ( ';' )=>otherlv_2= ';' )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:938:4: ( ';' )=>otherlv_2= ';'
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleReactionEffect1999); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReactionEffectAccess().getSemicolonKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:943:2: ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:944:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:944:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:945:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:945:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)||LA15_0==36||LA15_0==50||(LA15_0>=54 && LA15_0<=55)||(LA15_0>=82 && LA15_0<=83)||LA15_0==86) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==46) ) {
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
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:946:3: lv_actions_3_1= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect2023);
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
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:961:8: lv_actions_3_2= ruleEventRaisingExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_2_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect2042);
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


    // $ANTLR start "entryRuleDefRoot"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:989:1: entryRuleDefRoot returns [EObject current=null] : iv_ruleDefRoot= ruleDefRoot EOF ;
    public final EObject entryRuleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:990:2: (iv_ruleDefRoot= ruleDefRoot EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:991:2: iv_ruleDefRoot= ruleDefRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefRootRule()); 
            }
            pushFollow(FOLLOW_ruleDefRoot_in_entryRuleDefRoot2085);
            iv_ruleDefRoot=ruleDefRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRoot2095); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:998:1: ruleDefRoot returns [EObject current=null] : (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) ;
    public final EObject ruleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject this_StatechartRoot_0 = null;

        EObject this_StateRoot_1 = null;

        EObject this_TransitionRoot_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1001:28: ( (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1002:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1002:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt17=1;
                }
                break;
            case 30:
                {
                alt17=2;
                }
                break;
            case 31:
                {
                alt17=3;
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1003:5: this_StatechartRoot_0= ruleStatechartRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStatechartRootParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatechartRoot_in_ruleDefRoot2142);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1013:5: this_StateRoot_1= ruleStateRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStateRootParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStateRoot_in_ruleDefRoot2169);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1023:5: this_TransitionRoot_2= ruleTransitionRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getTransitionRootParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransitionRoot_in_ruleDefRoot2196);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1039:1: entryRuleStatechartRoot returns [EObject current=null] : iv_ruleStatechartRoot= ruleStatechartRoot EOF ;
    public final EObject entryRuleStatechartRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1040:2: (iv_ruleStatechartRoot= ruleStatechartRoot EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1041:2: iv_ruleStatechartRoot= ruleStatechartRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartRootRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2231);
            iv_ruleStatechartRoot=ruleStatechartRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartRoot2241); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1048:1: ruleStatechartRoot returns [EObject current=null] : (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) ;
    public final EObject ruleStatechartRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1051:28: ( (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1052:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1052:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1052:3: otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleStatechartRoot2278); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatechartRootAccess().getStatechartKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1056:1: ( (lv_def_1_0= ruleStatechartSpecification ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1057:1: (lv_def_1_0= ruleStatechartSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1057:1: (lv_def_1_0= ruleStatechartSpecification )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1058:3: lv_def_1_0= ruleStatechartSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatechartRootAccess().getDefStatechartSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2299);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1082:1: entryRuleStateRoot returns [EObject current=null] : iv_ruleStateRoot= ruleStateRoot EOF ;
    public final EObject entryRuleStateRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1083:2: (iv_ruleStateRoot= ruleStateRoot EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1084:2: iv_ruleStateRoot= ruleStateRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRootRule()); 
            }
            pushFollow(FOLLOW_ruleStateRoot_in_entryRuleStateRoot2335);
            iv_ruleStateRoot=ruleStateRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateRoot2345); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1091:1: ruleStateRoot returns [EObject current=null] : (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) ;
    public final EObject ruleStateRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1094:28: ( (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1095:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1095:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1095:3: otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleStateRoot2382); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateRootAccess().getStateKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1099:1: ( (lv_def_1_0= ruleStateSpecification ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1100:1: (lv_def_1_0= ruleStateSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1100:1: (lv_def_1_0= ruleStateSpecification )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1101:3: lv_def_1_0= ruleStateSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateRootAccess().getDefStateSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_ruleStateRoot2403);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1125:1: entryRuleTransitionRoot returns [EObject current=null] : iv_ruleTransitionRoot= ruleTransitionRoot EOF ;
    public final EObject entryRuleTransitionRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionRoot = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1126:2: (iv_ruleTransitionRoot= ruleTransitionRoot EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1127:2: iv_ruleTransitionRoot= ruleTransitionRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRootRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2439);
            iv_ruleTransitionRoot=ruleTransitionRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionRoot2449); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1134:1: ruleTransitionRoot returns [EObject current=null] : (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) ;
    public final EObject ruleTransitionRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1137:28: ( (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1138:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1138:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1138:3: otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleTransitionRoot2486); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionRootAccess().getTransitionKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1142:1: ( (lv_def_1_0= ruleTransitionSpecification ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1143:1: (lv_def_1_0= ruleTransitionSpecification )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1143:1: (lv_def_1_0= ruleTransitionSpecification )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1144:3: lv_def_1_0= ruleTransitionSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionRootAccess().getDefTransitionSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2507);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1170:1: entryRuleStatechartSpecification returns [EObject current=null] : iv_ruleStatechartSpecification= ruleStatechartSpecification EOF ;
    public final EObject entryRuleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1171:2: (iv_ruleStatechartSpecification= ruleStatechartSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1172:2: iv_ruleStatechartSpecification= ruleStatechartSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2545);
            iv_ruleStatechartSpecification=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartSpecification2555); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1179:1: ruleStatechartSpecification returns [EObject current=null] : ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) ;
    public final EObject ruleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        EObject lv_scopes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1182:28: ( ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1183:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1183:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1183:2: () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )*
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1183:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1184:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatechartSpecificationAccess().getStatechartSpecificationAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1189:2: (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1189:4: otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleStatechartSpecification2602); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatechartSpecificationAccess().getNamespaceKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1193:1: ( (lv_namespace_2_0= ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1194:1: (lv_namespace_2_0= ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1194:1: (lv_namespace_2_0= ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1195:3: lv_namespace_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getNamespaceFQNParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleStatechartSpecification2623);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1211:4: ( (lv_scopes_3_0= ruleStatechartScope ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==14||LA19_0==33) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1212:1: (lv_scopes_3_0= ruleStatechartScope )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1212:1: (lv_scopes_3_0= ruleStatechartScope )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1213:3: lv_scopes_3_0= ruleStatechartScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getScopesStatechartScopeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification2646);
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
    // $ANTLR end "ruleStatechartSpecification"


    // $ANTLR start "entryRuleTransitionSpecification"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1237:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1238:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1239:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification2683);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification2693); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1246:1: ruleTransitionSpecification returns [EObject current=null] : ( (lv_reaction_0_0= ruleTransitionReaction ) ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_reaction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1249:28: ( ( (lv_reaction_0_0= ruleTransitionReaction ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1250:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1250:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1251:1: (lv_reaction_0_0= ruleTransitionReaction )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1251:1: (lv_reaction_0_0= ruleTransitionReaction )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1252:3: lv_reaction_0_0= ruleTransitionReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getReactionTransitionReactionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification2738);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1278:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1279:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1280:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope2775);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartScope2785); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1287:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1290:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1291:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1291:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==14) ) {
                alt20=1;
            }
            else if ( (LA20_0==33) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1292:5: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStatechartScope2832);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1302:5: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalScope_in_ruleStatechartScope2859);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1320:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1321:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1322:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInternalScope_in_entryRuleInternalScope2896);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalScope2906); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1329:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1332:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1333:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1333:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1333:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1333:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1334:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInternalScopeAccess().getInternalScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleInternalScope2952); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleInternalScope2964); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1347:1: ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_INT)||LA22_0==18||(LA22_0>=26 && LA22_0<=27)||(LA22_0>=34 && LA22_0<=35)||(LA22_0>=64 && LA22_0<=67)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1348:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1348:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1349:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1349:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    int alt21=4;
            	    switch ( input.LA(1) ) {
            	    case 34:
            	    case 67:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 65:
            	        {
            	        int LA21_2 = input.LA(2);

            	        if ( (LA21_2==RULE_ID||LA21_2==18) ) {
            	            alt21=2;
            	        }
            	        else if ( (LA21_2==34) ) {
            	            alt21=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 21, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 66:
            	        {
            	        int LA21_3 = input.LA(2);

            	        if ( (LA21_3==34) ) {
            	            alt21=1;
            	        }
            	        else if ( (LA21_3==RULE_ID||LA21_3==18) ) {
            	            alt21=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 21, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case RULE_ID:
            	    case 18:
            	    case 64:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    case RULE_INT:
            	    case 26:
            	    case 27:
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
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1350:3: lv_declarations_3_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInternalScope2987);
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
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1365:8: lv_declarations_3_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3006);
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
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1380:8: lv_declarations_3_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3025);
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
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1395:8: lv_declarations_3_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsLocalReactionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleInternalScope3044);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1421:1: entryRuleEventDeclarartion returns [EObject current=null] : iv_ruleEventDeclarartion= ruleEventDeclarartion EOF ;
    public final EObject entryRuleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclarartion = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1422:2: (iv_ruleEventDeclarartion= ruleEventDeclarartion EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1423:2: iv_ruleEventDeclarartion= ruleEventDeclarartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarartionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3084);
            iv_ruleEventDeclarartion=ruleEventDeclarartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclarartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclarartion3094); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1430:1: ruleEventDeclarartion returns [EObject current=null] : this_EventDefinition_0= ruleEventDefinition ;
    public final EObject ruleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject this_EventDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1433:28: (this_EventDefinition_0= ruleEventDefinition )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1435:5: this_EventDefinition_0= ruleEventDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEventDeclarartionAccess().getEventDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3140);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1453:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1454:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1455:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3176);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDefinition3186); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1462:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1465:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1466:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1466:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1466:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1466:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=65 && LA23_0<=67)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1467:1: (lv_direction_0_0= ruleDirection )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1467:1: (lv_direction_0_0= ruleDirection )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1468:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_ruleEventDefinition3232);
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

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleEventDefinition3245); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1488:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1489:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1489:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1490:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventDefinition3262); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1506:2: (otherlv_3= ':' ( ( ruleFQN ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==15) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1506:4: otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleEventDefinition3280); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1510:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1511:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1511:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1512:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getTypeTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEventDefinition3303);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1533:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1534:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1535:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3341);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration3351); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1542:1: ruleVariableDeclaration returns [EObject current=null] : this_VariableDefinition_0= ruleVariableDefinition ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1545:28: (this_VariableDefinition_0= ruleVariableDefinition )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1547:5: this_VariableDefinition_0= ruleVariableDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration3397);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1565:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1566:2: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1567:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration3433);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDeclaration3443); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1574:1: ruleOperationDeclaration returns [EObject current=null] : this_OperationDefinition_0= ruleOperationDefinition ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1577:28: (this_OperationDefinition_0= ruleOperationDefinition )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1579:5: this_OperationDefinition_0= ruleOperationDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOperationDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration3489);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1597:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1598:2: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1599:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition3525);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDefinition3535); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1606:1: ruleOperationDefinition returns [EObject current=null] : ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1609:28: ( ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1610:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1610:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1610:2: () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1610:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1611:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationDefinitionAccess().getOperationDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleOperationDefinition3581); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionAccess().getOperationKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1620:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1621:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1621:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1622:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperationDefinition3598); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleOperationDefinition3615); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1642:1: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1642:2: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1642:2: ( (lv_parameters_4_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1643:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1643:1: (lv_parameters_4_0= ruleParameter )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1644:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition3637);
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

                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1660:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==16) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1660:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleOperationDefinition3650); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getOperationDefinitionAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1664:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1665:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1665:1: (lv_parameters_6_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1666:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition3671);
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

            otherlv_7=(Token)match(input,37,FOLLOW_37_in_ruleOperationDefinition3687); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1686:1: (otherlv_8= ':' ( ( ruleFQN ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==15) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1686:3: otherlv_8= ':' ( ( ruleFQN ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleOperationDefinition3700); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getOperationDefinitionAccess().getColonKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1690:1: ( ( ruleFQN ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1691:1: ( ruleFQN )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1691:1: ( ruleFQN )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1692:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getTypeTypeCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition3723);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1713:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1714:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1715:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3761);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3771); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1722:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1725:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1726:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1726:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1726:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1726:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1727:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1727:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1728:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter3813); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleParameter3830); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1748:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1749:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1749:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1750:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleParameter3853);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1775:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1776:2: (iv_ruleFQN= ruleFQN EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1777:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN3894);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN3905); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1784:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1787:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1788:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1788:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1788:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3945); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1795:1: (kw= '.' this_ID_2= RULE_ID )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==38) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1796:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,38,FOLLOW_38_in_ruleFQN3964); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3979); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleLocalReaction"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1816:1: entryRuleLocalReaction returns [EObject current=null] : iv_ruleLocalReaction= ruleLocalReaction EOF ;
    public final EObject entryRuleLocalReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1817:2: (iv_ruleLocalReaction= ruleLocalReaction EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1818:2: iv_ruleLocalReaction= ruleLocalReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction4026);
            iv_ruleLocalReaction=ruleLocalReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReaction4036); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1825:1: ruleLocalReaction returns [EObject current=null] : ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) ;
    public final EObject ruleLocalReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_trigger_0_0 = null;

        EObject lv_effect_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1828:28: ( ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1829:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1829:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1829:2: ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1829:2: ( (lv_trigger_0_0= ruleReactionTrigger ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1830:1: (lv_trigger_0_0= ruleReactionTrigger )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1830:1: (lv_trigger_0_0= ruleReactionTrigger )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1831:3: lv_trigger_0_0= ruleReactionTrigger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerReactionTriggerParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReaction4082);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1847:2: ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1847:3: ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1852:6: (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1852:8: otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) )
            {
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleLocalReaction4114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalReactionAccess().getSolidusKeyword_1_0_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1856:1: ( (lv_effect_2_0= ruleReactionEffect ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1857:1: (lv_effect_2_0= ruleReactionEffect )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1857:1: (lv_effect_2_0= ruleReactionEffect )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1858:3: lv_effect_2_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectReactionEffectParserRuleCall_1_0_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalReaction4135);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1882:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1883:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1884:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction4173);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionReaction4183); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1891:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1894:28: ( ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1895:1: ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1895:1: ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1895:2: () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1895:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1896:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionReactionAccess().getTransitionReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1901:2: ( (lv_trigger_1_0= ruleReactionTrigger ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==RULE_INT||LA29_1==27) ) {
                    alt29=1;
                }
            }
            else if ( (LA29_0==RULE_INT||LA29_0==27) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1902:1: (lv_trigger_1_0= ruleReactionTrigger )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1902:1: (lv_trigger_1_0= ruleReactionTrigger )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1903:3: lv_trigger_1_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerReactionTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleTransitionReaction4238);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1919:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==22) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1919:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleTransitionReaction4252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1923:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1924:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1924:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1925:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransitionReaction4273);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1941:4: (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==26) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1941:6: otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleTransitionReaction4288); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionReactionAccess().getNumberSignKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1945:1: ( (lv_properties_5_0= ruleReactionProperties ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1946:1: (lv_properties_5_0= ruleReactionProperties )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1946:1: (lv_properties_5_0= ruleReactionProperties )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1947:3: lv_properties_5_0= ruleReactionProperties
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getPropertiesReactionPropertiesParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionProperties_in_ruleTransitionReaction4309);
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


    // $ANTLR start "entryRuleReactionProperties"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1971:1: entryRuleReactionProperties returns [EObject current=null] : iv_ruleReactionProperties= ruleReactionProperties EOF ;
    public final EObject entryRuleReactionProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionProperties = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1972:2: (iv_ruleReactionProperties= ruleReactionProperties EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1973:2: iv_ruleReactionProperties= ruleReactionProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionPropertiesRule()); 
            }
            pushFollow(FOLLOW_ruleReactionProperties_in_entryRuleReactionProperties4347);
            iv_ruleReactionProperties=ruleReactionProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionProperties; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionProperties4357); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1980:1: ruleReactionProperties returns [EObject current=null] : ( () ( (lv_properties_1_0= ruleReactionProperty ) )* ) ;
    public final EObject ruleReactionProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1983:28: ( ( () ( (lv_properties_1_0= ruleReactionProperty ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1984:1: ( () ( (lv_properties_1_0= ruleReactionProperty ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1984:1: ( () ( (lv_properties_1_0= ruleReactionProperty ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1984:2: () ( (lv_properties_1_0= ruleReactionProperty ) )*
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1984:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1985:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionPropertiesAccess().getReactionPropertiesAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1990:2: ( (lv_properties_1_0= ruleReactionProperty ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||LA32_0==39) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1991:1: (lv_properties_1_0= ruleReactionProperty )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1991:1: (lv_properties_1_0= ruleReactionProperty )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1992:3: lv_properties_1_0= ruleReactionProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReactionPropertiesAccess().getPropertiesReactionPropertyParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleReactionProperty_in_ruleReactionProperties4412);
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
    // $ANTLR end "ruleReactionProperties"


    // $ANTLR start "entryRuleReactionProperty"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2016:1: entryRuleReactionProperty returns [EObject current=null] : iv_ruleReactionProperty= ruleReactionProperty EOF ;
    public final EObject entryRuleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionProperty = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2017:2: (iv_ruleReactionProperty= ruleReactionProperty EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2018:2: iv_ruleReactionProperty= ruleReactionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReactionProperty_in_entryRuleReactionProperty4449);
            iv_ruleReactionProperty=ruleReactionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionProperty4459); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2025:1: ruleReactionProperty returns [EObject current=null] : (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) ;
    public final EObject ruleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_EntryPointSpec_0 = null;

        EObject this_ExitPointSpec_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2028:28: ( (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2029:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2029:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_ID) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2030:5: this_EntryPointSpec_0= ruleEntryPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReactionPropertyAccess().getEntryPointSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryPointSpec_in_ruleReactionProperty4506);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2040:5: this_ExitPointSpec_1= ruleExitPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReactionPropertyAccess().getExitPointSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitPointSpec_in_ruleReactionProperty4533);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2056:1: entryRuleEntryPointSpec returns [EObject current=null] : iv_ruleEntryPointSpec= ruleEntryPointSpec EOF ;
    public final EObject entryRuleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2057:2: (iv_ruleEntryPointSpec= ruleEntryPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2058:2: iv_ruleEntryPointSpec= ruleEntryPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec4568);
            iv_ruleEntryPointSpec=ruleEntryPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryPointSpec4578); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2065:1: ruleEntryPointSpec returns [EObject current=null] : (otherlv_0= '>' ( ( ruleFQN ) ) ) ;
    public final EObject ruleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2068:28: ( (otherlv_0= '>' ( ( ruleFQN ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2069:1: (otherlv_0= '>' ( ( ruleFQN ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2069:1: (otherlv_0= '>' ( ( ruleFQN ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2069:3: otherlv_0= '>' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleEntryPointSpec4615); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntryPointSpecAccess().getGreaterThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2073:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2074:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2074:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2075:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEntryPointSpecRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntryPointSpecAccess().getEntrypointEntrypointCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleEntryPointSpec4638);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2096:1: entryRuleExitPointSpec returns [EObject current=null] : iv_ruleExitPointSpec= ruleExitPointSpec EOF ;
    public final EObject entryRuleExitPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitPointSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2097:2: (iv_ruleExitPointSpec= ruleExitPointSpec EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2098:2: iv_ruleExitPointSpec= ruleExitPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec4674);
            iv_ruleExitPointSpec=ruleExitPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitPointSpec4684); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2105:1: ruleExitPointSpec returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= '>' ) ;
    public final EObject ruleExitPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2108:28: ( ( ( ( ruleFQN ) ) otherlv_1= '>' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2109:1: ( ( ( ruleFQN ) ) otherlv_1= '>' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2109:1: ( ( ( ruleFQN ) ) otherlv_1= '>' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2109:2: ( ( ruleFQN ) ) otherlv_1= '>'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2109:2: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2110:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2110:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2111:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExitPointSpecRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExitPointSpecAccess().getExitpointExitpointCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleExitPointSpec4732);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleExitPointSpec4744); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2138:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2139:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2140:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec4782);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularEventSpec4792); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2147:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2150:28: ( ( (lv_event_0_0= ruleFeatureCall ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2151:1: ( (lv_event_0_0= ruleFeatureCall ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2151:1: ( (lv_event_0_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2152:1: (lv_event_0_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2152:1: (lv_event_0_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2153:3: lv_event_0_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec4837);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2177:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2178:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2179:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec4872);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeEventSpec4882); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2186:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_type_0_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2189:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2190:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2190:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2190:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )?
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2190:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2191:1: (lv_type_0_0= ruleTimeEventType )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2191:1: (lv_type_0_0= ruleTimeEventType )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2192:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec4928);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2208:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2209:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2209:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2210:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeEventSpec4945); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2226:2: ( (lv_unit_2_0= ruleTimeUnit ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=92 && LA34_0<=95)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2227:1: (lv_unit_2_0= ruleTimeUnit )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2227:1: (lv_unit_2_0= ruleTimeUnit )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2228:3: lv_unit_2_0= ruleTimeUnit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec4971);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2252:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2253:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2254:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5008);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinEventSpec5018); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2261:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_OnCycleEvent_2 = null;

        EObject this_AlwaysEvent_3 = null;

        EObject this_DefaultEvent_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2264:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2265:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2265:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent )
            int alt35=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt35=1;
                }
                break;
            case 41:
                {
                alt35=2;
                }
                break;
            case 42:
                {
                alt35=3;
                }
                break;
            case 43:
                {
                alt35=4;
                }
                break;
            case 44:
            case 45:
                {
                alt35=5;
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2266:5: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5065);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2276:5: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5092);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2286:5: this_OnCycleEvent_2= ruleOnCycleEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getOnCycleEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOnCycleEvent_in_ruleBuiltinEventSpec5119);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2296:5: this_AlwaysEvent_3= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec5146);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2306:5: this_DefaultEvent_4= ruleDefaultEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getDefaultEventParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultEvent_in_ruleBuiltinEventSpec5173);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2322:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2323:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2324:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent5208);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryEvent5218); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2331:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2334:28: ( ( () otherlv_1= 'entry' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2335:1: ( () otherlv_1= 'entry' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2335:1: ( () otherlv_1= 'entry' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2335:2: () otherlv_1= 'entry'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2335:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2336:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryEventAccess().getEntryEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleEntryEvent5264); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2353:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2354:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2355:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent5300);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent5310); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2362:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2365:28: ( ( () otherlv_1= 'exit' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2366:1: ( () otherlv_1= 'exit' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2366:1: ( () otherlv_1= 'exit' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2366:2: () otherlv_1= 'exit'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2366:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2367:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitEventAccess().getExitEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleExitEvent5356); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2384:1: entryRuleOnCycleEvent returns [EObject current=null] : iv_ruleOnCycleEvent= ruleOnCycleEvent EOF ;
    public final EObject entryRuleOnCycleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnCycleEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2385:2: (iv_ruleOnCycleEvent= ruleOnCycleEvent EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2386:2: iv_ruleOnCycleEvent= ruleOnCycleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOnCycleEventRule()); 
            }
            pushFollow(FOLLOW_ruleOnCycleEvent_in_entryRuleOnCycleEvent5392);
            iv_ruleOnCycleEvent=ruleOnCycleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOnCycleEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnCycleEvent5402); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2393:1: ruleOnCycleEvent returns [EObject current=null] : ( () otherlv_1= 'oncycle' ) ;
    public final EObject ruleOnCycleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2396:28: ( ( () otherlv_1= 'oncycle' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2397:1: ( () otherlv_1= 'oncycle' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2397:1: ( () otherlv_1= 'oncycle' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2397:2: () otherlv_1= 'oncycle'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2397:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2398:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOnCycleEventAccess().getOnCycleEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleOnCycleEvent5448); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2415:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2416:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2417:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent5484);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEvent5494); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2424:1: ruleAlwaysEvent returns [EObject current=null] : ( () otherlv_1= 'always' ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2427:28: ( ( () otherlv_1= 'always' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2428:1: ( () otherlv_1= 'always' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2428:1: ( () otherlv_1= 'always' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2428:2: () otherlv_1= 'always'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2428:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2429:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlwaysEventAccess().getAlwaysEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleAlwaysEvent5540); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2446:1: entryRuleDefaultEvent returns [EObject current=null] : iv_ruleDefaultEvent= ruleDefaultEvent EOF ;
    public final EObject entryRuleDefaultEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultEvent = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2447:2: (iv_ruleDefaultEvent= ruleDefaultEvent EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2448:2: iv_ruleDefaultEvent= ruleDefaultEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultEventRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultEvent_in_entryRuleDefaultEvent5576);
            iv_ruleDefaultEvent=ruleDefaultEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultEvent5586); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2455:1: ruleDefaultEvent returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2458:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2459:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2459:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2459:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2459:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2460:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultEventAccess().getDefaultEventAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2465:2: (otherlv_1= 'default' | otherlv_2= 'else' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==44) ) {
                alt36=1;
            }
            else if ( (LA36_0==45) ) {
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2465:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleDefaultEvent5633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultEventAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2470:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleDefaultEvent5651); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2482:1: entryRuleEventRaisingExpression returns [EObject current=null] : iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF ;
    public final EObject entryRuleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventRaisingExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2483:2: (iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2484:2: iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRaisingExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventRaisingExpression_in_entryRuleEventRaisingExpression5688);
            iv_ruleEventRaisingExpression=ruleEventRaisingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventRaisingExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventRaisingExpression5698); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2491:1: ruleEventRaisingExpression returns [EObject current=null] : ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_event_2_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2494:28: ( ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2495:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2495:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2495:2: () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2495:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2496:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventRaisingExpressionAccess().getEventRaisingExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleEventRaisingExpression5744); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventRaisingExpressionAccess().getRaiseKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2505:1: ( (lv_event_2_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2506:1: (lv_event_2_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2506:1: (lv_event_2_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2507:3: lv_event_2_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getEventFeatureCallParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventRaisingExpression5765);
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

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2523:2: (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==15) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2523:4: otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleEventRaisingExpression5778); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventRaisingExpressionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2527:1: ( (lv_value_4_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2528:1: (lv_value_4_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2528:1: (lv_value_4_0= ruleExpression )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2529:3: lv_value_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getValueExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleEventRaisingExpression5799);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2555:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2556:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2557:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression5839);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression5849); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2564:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2567:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2569:5: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpression5895);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2585:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2586:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2587:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression5929);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression5939); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2594:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2597:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2598:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2598:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2599:5: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression5986);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2607:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==19||(LA38_0>=70 && LA38_0<=79)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2607:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2607:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2608:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2613:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2614:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2614:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2615:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6016);
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

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2631:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2632:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2632:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2633:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6037);
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
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleConditionalExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2657:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2658:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2659:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6075);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression6085); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2666:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2669:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2670:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2670:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2671:5: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6132);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2679:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==47) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2679:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2679:2: ()
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2680:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleConditionalExpression6153); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2689:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2690:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2690:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2691:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6174);
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

                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleConditionalExpression6186); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2711:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2712:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2712:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2713:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6207);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2737:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2738:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2739:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6245);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression6255); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2746:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2749:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2750:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2750:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2751:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6302);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2759:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==48) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2759:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2759:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2760:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleLogicalOrExpression6323); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2769:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2770:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2770:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2771:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6344);
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2795:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2796:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2797:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6382);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression6392); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2804:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2807:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2808:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2808:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2809:5: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6439);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2817:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==49) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2817:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2817:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2818:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleLogicalAndExpression6460); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2827:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2828:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2828:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2829:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6481);
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleLogicalNotExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2853:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2854:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2855:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression6519);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNotExpression6529); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2862:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2865:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2866:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2866:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_STRING)||LA42_0==36||(LA42_0>=54 && LA42_0<=55)||(LA42_0>=82 && LA42_0<=83)||LA42_0==86) ) {
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2867:5: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression6576);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2876:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2876:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2876:7: () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2876:7: ()
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2877:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalNotExpressionAccess().getLogicalNotExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleLogicalNotExpression6603); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLogicalNotExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2886:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2887:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2887:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2888:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression6624);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2912:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2913:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2914:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression6661);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression6671); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2921:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2924:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2925:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2925:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2926:5: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression6718);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2934:1: ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==51) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2934:2: () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2934:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2935:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleBitwiseXorExpression6739); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2944:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2945:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2945:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2946:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression6760);
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
    // $ANTLR end "ruleBitwiseXorExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2970:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2971:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2972:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression6798);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression6808); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2979:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2982:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2983:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2983:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2984:5: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression6855);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2992:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==52) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2992:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2992:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2993:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleBitwiseOrExpression6876); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3002:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3003:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3003:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3004:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression6897);
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
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3028:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3029:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3030:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression6935);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression6945); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3037:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3040:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3041:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3041:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3042:5: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression6992);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3050:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==53) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3050:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3050:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3051:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleBitwiseAndExpression7013); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3060:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3061:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3061:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3062:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7034);
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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleLogicalRelationExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3086:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3087:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3088:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7072);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalRelationExpression7082); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3095:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3098:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3099:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3099:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3100:5: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7129);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3108:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==39||(LA46_0>=87 && LA46_0<=91)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3108:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3108:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3109:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3114:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3115:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3115:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3116:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7159);
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

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3132:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3133:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3133:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3134:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7180);
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
    // $ANTLR end "ruleLogicalRelationExpression"


    // $ANTLR start "entryRuleShiftExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3158:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3159:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3160:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7218);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression7228); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3167:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3170:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3171:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3171:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3172:5: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7275);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3180:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=80 && LA47_0<=81)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3180:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3180:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3181:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3186:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3187:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3187:1: (lv_operator_2_0= ruleShiftOperator )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3188:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression7305);
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

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3204:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3205:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3205:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3206:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7326);
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
    // $ANTLR end "ruleShiftExpression"


    // $ANTLR start "entryRuleNumericalAddSubtractExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3230:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3231:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3232:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7364);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7374); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3239:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3242:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3243:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3243:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3244:5: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7421);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3252:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=82 && LA48_0<=83)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3252:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3252:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3253:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3258:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3259:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3259:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3260:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7451);
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

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3276:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3277:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3277:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3278:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7472);
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
    // $ANTLR end "ruleNumericalAddSubtractExpression"


    // $ANTLR start "entryRuleNumericalMultiplyDivideExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3302:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3303:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3304:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression7510);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression7520); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3311:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3314:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3315:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3315:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3316:5: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression7567);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3324:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==22||(LA49_0>=84 && LA49_0<=85)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3324:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3324:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3325:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3330:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3331:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3331:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3332:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression7597);
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

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3348:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3349:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3349:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3350:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression7618);
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
    // $ANTLR end "ruleNumericalMultiplyDivideExpression"


    // $ANTLR start "entryRuleNumericalUnaryExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3374:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3375:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3376:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression7656);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalUnaryExpression7666); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3383:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3386:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3387:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3387:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_STRING)||LA50_0==36||(LA50_0>=54 && LA50_0<=55)) ) {
                alt50=1;
            }
            else if ( ((LA50_0>=82 && LA50_0<=83)||LA50_0==86) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3388:5: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression7713);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3397:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3397:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3397:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3397:7: ()
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3398:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumericalUnaryExpressionAccess().getNumericalUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3403:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3404:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3404:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3405:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression7749);
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

                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3421:2: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3422:1: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3422:1: (lv_operand_3_0= rulePrimaryExpression )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3423:3: lv_operand_3_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression7770);
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


    // $ANTLR start "entryRulePrimaryExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3447:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3448:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3449:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression7807);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression7817); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3456:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_PrimitiveValueExpression_0 = null;

        EObject this_FeatureCall_1 = null;

        EObject this_ActiveStateReferenceExpression_2 = null;

        EObject this_EventValueReferenceExpression_3 = null;

        EObject this_Expression_5 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3459:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3460:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3460:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            int alt51=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_HEX:
            case RULE_STRING:
                {
                alt51=1;
                }
                break;
            case RULE_ID:
                {
                alt51=2;
                }
                break;
            case 55:
                {
                alt51=3;
                }
                break;
            case 54:
                {
                alt51=4;
                }
                break;
            case 36:
                {
                alt51=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3461:5: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrimitiveValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression7864);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3471:5: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression7891);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3481:5: this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getActiveStateReferenceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression7918);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3491:5: this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEventValueReferenceExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression7945);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3500:6: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3500:6: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3500:8: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_36_in_rulePrimaryExpression7963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression7985);
                    this_Expression_5=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_6=(Token)match(input,37,FOLLOW_37_in_rulePrimaryExpression7996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_2());
                          
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


    // $ANTLR start "entryRulePrimitiveValueExpression"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3525:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3526:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3527:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8033);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValueExpression8043); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3534:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3537:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3538:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3538:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3538:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3538:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3539:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveValueExpressionAccess().getPrimitiveValueExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3544:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3545:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3545:1: (lv_value_1_0= ruleLiteral )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3546:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8098);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3570:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3571:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3572:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8134);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall8144); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3579:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3582:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3583:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3583:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3584:5: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8191);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3592:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==38) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3592:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3592:2: ()
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3593:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleFeatureCall8212); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3602:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3603:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3603:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3604:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureCall8232); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3615:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==36) && (synpred3_InternalSCCExp())) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3615:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3615:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3615:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3622:1: (lv_operationCall_4_0= '(' )
            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3623:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,36,FOLLOW_36_in_ruleFeatureCall8266); if (state.failed) return current;
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

            	            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3636:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt53=2;
            	            int LA53_0 = input.LA(1);

            	            if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_STRING)||LA53_0==36||LA53_0==50||(LA53_0>=54 && LA53_0<=55)||(LA53_0>=82 && LA53_0<=83)||LA53_0==86) ) {
            	                alt53=1;
            	            }
            	            switch (alt53) {
            	                case 1 :
            	                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3636:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3636:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3637:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3637:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3638:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8301);
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

            	                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3654:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop52:
            	                    do {
            	                        int alt52=2;
            	                        int LA52_0 = input.LA(1);

            	                        if ( (LA52_0==16) ) {
            	                            alt52=1;
            	                        }


            	                        switch (alt52) {
            	                    	case 1 :
            	                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3654:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleFeatureCall8314); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3658:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3659:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3659:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3660:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8335);
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

            	            otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleFeatureCall8351); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3688:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3689:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3690:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8391);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementReferenceExpression8401); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3697:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3700:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3701:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3701:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3701:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3701:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3702:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementReferenceExpressionAccess().getElementReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3707:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3708:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3708:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3709:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementReferenceExpression8455); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3720:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==36) && (synpred4_InternalSCCExp())) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3720:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3720:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3720:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3727:1: (lv_operationCall_2_0= '(' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3728:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,36,FOLLOW_36_in_ruleElementReferenceExpression8489); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3741:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_STRING)||LA57_0==36||LA57_0==50||(LA57_0>=54 && LA57_0<=55)||(LA57_0>=82 && LA57_0<=83)||LA57_0==86) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3741:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3741:3: ( (lv_args_3_0= ruleExpression ) )
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3742:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3742:1: (lv_args_3_0= ruleExpression )
                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3743:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8524);
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

                            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3759:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==16) ) {
                                    alt56=1;
                                }


                                switch (alt56) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3759:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleElementReferenceExpression8537); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3763:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3764:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3764:1: (lv_args_5_0= ruleExpression )
                            	    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3765:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8558);
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

                    otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleElementReferenceExpression8574); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3793:1: entryRuleEventValueReferenceExpression returns [EObject current=null] : iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF ;
    public final EObject entryRuleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventValueReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3794:2: (iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3795:2: iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventValueReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression8612);
            iv_ruleEventValueReferenceExpression=ruleEventValueReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventValueReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventValueReferenceExpression8622); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3802:1: ruleEventValueReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject ruleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3805:28: ( ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3806:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3806:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3806:2: () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3806:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3807:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventValueReferenceExpressionAccess().getEventValueReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleEventValueReferenceExpression8668); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventValueReferenceExpressionAccess().getValueofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleEventValueReferenceExpression8680); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventValueReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3820:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3821:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3821:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3822:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventValueReferenceExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression8701);
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

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleEventValueReferenceExpression8713); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3850:1: entryRuleActiveStateReferenceExpression returns [EObject current=null] : iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF ;
    public final EObject entryRuleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveStateReferenceExpression = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3851:2: (iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3852:2: iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveStateReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression8749);
            iv_ruleActiveStateReferenceExpression=ruleActiveStateReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveStateReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression8759); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3859:1: ruleActiveStateReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3862:28: ( ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3863:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3863:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3863:2: () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3863:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3864:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActiveStateReferenceExpressionAccess().getActiveStateReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleActiveStateReferenceExpression8805); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActiveStateReferenceExpressionAccess().getActiveKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleActiveStateReferenceExpression8817); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActiveStateReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3877:1: ( ( ruleFQN ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3878:1: ( ruleFQN )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3878:1: ( ruleFQN )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3879:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActiveStateReferenceExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActiveStateReferenceExpressionAccess().getValueStateCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression8840);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleActiveStateReferenceExpression8852); if (state.failed) return current;
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


    // $ANTLR start "entryRuleLiteral"
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3904:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3905:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3906:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral8888);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral8898); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3913:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_RealLiteral_3 = null;

        EObject this_StringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3916:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3917:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3917:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3918:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral8945);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3928:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral8972);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3938:5: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexLiteral_in_ruleLiteral8999);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3948:5: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleLiteral9026);
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3958:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral9053);
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3974:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3975:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3976:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9088);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral9098); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3983:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3986:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3987:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3987:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3987:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3987:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3988:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3993:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3994:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3994:1: (lv_value_1_0= RULE_BOOL )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3995:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral9149); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4019:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4020:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4021:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9190);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral9200); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4028:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4031:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4032:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4032:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4032:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4032:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4033:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4038:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4039:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4039:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4040:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral9251); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4064:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4065:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4066:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9292);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral9302); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4073:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4076:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4077:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4077:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4077:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4077:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4078:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4083:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4084:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4084:1: (lv_value_1_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4085:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleRealLiteral9353); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4109:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4110:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4111:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9394);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexLiteral9404); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4118:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4121:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4122:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4122:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4122:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4122:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4123:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHexLiteralAccess().getHexLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4128:2: ( (lv_value_1_0= RULE_HEX ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4129:1: (lv_value_1_0= RULE_HEX )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4129:1: (lv_value_1_0= RULE_HEX )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4130:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleHexLiteral9455); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4154:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4155:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4156:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9496);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral9506); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4163:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4166:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4167:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4167:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4167:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4167:2: ()
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4168:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4173:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4174:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4174:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4175:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral9557); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4199:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4201:28: ( ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4202:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4202:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            int alt60=8;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt60=1;
                }
                break;
            case 57:
                {
                alt60=2;
                }
                break;
            case 58:
                {
                alt60=3;
                }
                break;
            case 59:
                {
                alt60=4;
                }
                break;
            case 60:
                {
                alt60=5;
                }
                break;
            case 61:
                {
                alt60=6;
                }
                break;
            case 62:
                {
                alt60=7;
                }
                break;
            case 63:
                {
                alt60=8;
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4202:2: (enumLiteral_0= '\\'none\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4202:2: (enumLiteral_0= '\\'none\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4202:4: enumLiteral_0= '\\'none\\''
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleCombineOperator9612); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4208:6: (enumLiteral_1= '\\'+\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4208:6: (enumLiteral_1= '\\'+\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4208:8: enumLiteral_1= '\\'+\\''
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_57_in_ruleCombineOperator9629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4214:6: (enumLiteral_2= '\\'*\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4214:6: (enumLiteral_2= '\\'*\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4214:8: enumLiteral_2= '\\'*\\''
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_58_in_ruleCombineOperator9646); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4220:6: (enumLiteral_3= '\\'max\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4220:6: (enumLiteral_3= '\\'max\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4220:8: enumLiteral_3= '\\'max\\''
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_59_in_ruleCombineOperator9663); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4226:6: (enumLiteral_4= '\\'min\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4226:6: (enumLiteral_4= '\\'min\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4226:8: enumLiteral_4= '\\'min\\''
                    {
                    enumLiteral_4=(Token)match(input,60,FOLLOW_60_in_ruleCombineOperator9680); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4232:6: (enumLiteral_5= '\\'or\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4232:6: (enumLiteral_5= '\\'or\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4232:8: enumLiteral_5= '\\'or\\''
                    {
                    enumLiteral_5=(Token)match(input,61,FOLLOW_61_in_ruleCombineOperator9697); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4238:6: (enumLiteral_6= '\\'and\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4238:6: (enumLiteral_6= '\\'and\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4238:8: enumLiteral_6= '\\'and\\''
                    {
                    enumLiteral_6=(Token)match(input,62,FOLLOW_62_in_ruleCombineOperator9714); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4244:6: (enumLiteral_7= '\\'host\\'' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4244:6: (enumLiteral_7= '\\'host\\'' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4244:8: enumLiteral_7= '\\'host\\''
                    {
                    enumLiteral_7=(Token)match(input,63,FOLLOW_63_in_ruleCombineOperator9731); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4254:1: ruleVarDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'inout' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleVarDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4256:28: ( ( (enumLiteral_0= 'inout' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4257:1: ( (enumLiteral_0= 'inout' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4257:1: ( (enumLiteral_0= 'inout' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt61=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt61=1;
                }
                break;
            case 65:
                {
                alt61=2;
                }
                break;
            case 66:
                {
                alt61=3;
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4257:2: (enumLiteral_0= 'inout' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4257:2: (enumLiteral_0= 'inout' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4257:4: enumLiteral_0= 'inout'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_64_in_ruleVarDirection9776); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVarDirectionAccess().getINOUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVarDirectionAccess().getINOUTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4263:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4263:6: (enumLiteral_1= 'in' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4263:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_65_in_ruleVarDirection9793); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVarDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getVarDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4269:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4269:6: (enumLiteral_2= 'out' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4269:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_66_in_ruleVarDirection9810); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4279:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4281:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4282:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4282:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt62=3;
            switch ( input.LA(1) ) {
            case 67:
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
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4282:2: (enumLiteral_0= 'local' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4282:2: (enumLiteral_0= 'local' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4282:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_67_in_ruleDirection9855); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4288:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4288:6: (enumLiteral_1= 'in' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4288:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_65_in_ruleDirection9872); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4294:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4294:6: (enumLiteral_2= 'out' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4294:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_66_in_ruleDirection9889); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4304:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4306:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4307:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4307:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==68) ) {
                alt63=1;
            }
            else if ( (LA63_0==69) ) {
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4307:2: (enumLiteral_0= 'after' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4307:2: (enumLiteral_0= 'after' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4307:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_68_in_ruleTimeEventType9934); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4313:6: (enumLiteral_1= 'every' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4313:6: (enumLiteral_1= 'every' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4313:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_69_in_ruleTimeEventType9951); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4323:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4325:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4326:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4326:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            int alt64=11;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt64=1;
                }
                break;
            case 70:
                {
                alt64=2;
                }
                break;
            case 71:
                {
                alt64=3;
                }
                break;
            case 72:
                {
                alt64=4;
                }
                break;
            case 73:
                {
                alt64=5;
                }
                break;
            case 74:
                {
                alt64=6;
                }
                break;
            case 75:
                {
                alt64=7;
                }
                break;
            case 76:
                {
                alt64=8;
                }
                break;
            case 77:
                {
                alt64=9;
                }
                break;
            case 78:
                {
                alt64=10;
                }
                break;
            case 79:
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4326:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4326:2: (enumLiteral_0= '=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4326:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_19_in_ruleAssignmentOperator9996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4332:6: (enumLiteral_1= '*=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4332:6: (enumLiteral_1= '*=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4332:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_70_in_ruleAssignmentOperator10013); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4338:6: (enumLiteral_2= '/=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4338:6: (enumLiteral_2= '/=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4338:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_71_in_ruleAssignmentOperator10030); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4344:6: (enumLiteral_3= '%=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4344:6: (enumLiteral_3= '%=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4344:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_72_in_ruleAssignmentOperator10047); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4350:6: (enumLiteral_4= '+=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4350:6: (enumLiteral_4= '+=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4350:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,73,FOLLOW_73_in_ruleAssignmentOperator10064); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4356:6: (enumLiteral_5= '-=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4356:6: (enumLiteral_5= '-=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4356:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,74,FOLLOW_74_in_ruleAssignmentOperator10081); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4362:6: (enumLiteral_6= '<<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4362:6: (enumLiteral_6= '<<=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4362:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,75,FOLLOW_75_in_ruleAssignmentOperator10098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4368:6: (enumLiteral_7= '>>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4368:6: (enumLiteral_7= '>>=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4368:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,76,FOLLOW_76_in_ruleAssignmentOperator10115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4374:6: (enumLiteral_8= '&=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4374:6: (enumLiteral_8= '&=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4374:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,77,FOLLOW_77_in_ruleAssignmentOperator10132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4380:6: (enumLiteral_9= '^=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4380:6: (enumLiteral_9= '^=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4380:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,78,FOLLOW_78_in_ruleAssignmentOperator10149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4386:6: (enumLiteral_10= '|=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4386:6: (enumLiteral_10= '|=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4386:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,79,FOLLOW_79_in_ruleAssignmentOperator10166); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4396:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4398:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4399:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4399:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==80) ) {
                alt65=1;
            }
            else if ( (LA65_0==81) ) {
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4399:2: (enumLiteral_0= '<<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4399:2: (enumLiteral_0= '<<' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4399:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_80_in_ruleShiftOperator10211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4405:6: (enumLiteral_1= '>>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4405:6: (enumLiteral_1= '>>' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4405:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_81_in_ruleShiftOperator10228); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4415:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4417:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4418:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4418:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==82) ) {
                alt66=1;
            }
            else if ( (LA66_0==83) ) {
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4418:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4418:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4418:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_82_in_ruleAdditiveOperator10273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4424:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4424:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4424:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_83_in_ruleAdditiveOperator10290); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4434:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4436:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4437:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4437:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt67=3;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt67=1;
                }
                break;
            case 22:
                {
                alt67=2;
                }
                break;
            case 85:
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4437:2: (enumLiteral_0= '*' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4437:2: (enumLiteral_0= '*' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4437:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,84,FOLLOW_84_in_ruleMultiplicativeOperator10335); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4443:6: (enumLiteral_1= '/' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4443:6: (enumLiteral_1= '/' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4443:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_22_in_ruleMultiplicativeOperator10352); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4449:6: (enumLiteral_2= '%' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4449:6: (enumLiteral_2= '%' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4449:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_85_in_ruleMultiplicativeOperator10369); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4459:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4461:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4462:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4462:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            int alt68=3;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt68=1;
                }
                break;
            case 83:
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4462:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4462:2: (enumLiteral_0= '+' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4462:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_82_in_ruleUnaryOperator10414); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4468:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4468:6: (enumLiteral_1= '-' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4468:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_83_in_ruleUnaryOperator10431); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4474:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4474:6: (enumLiteral_2= '~' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4474:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,86,FOLLOW_86_in_ruleUnaryOperator10448); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4484:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4486:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4487:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4487:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt69=6;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt69=1;
                }
                break;
            case 88:
                {
                alt69=2;
                }
                break;
            case 39:
                {
                alt69=3;
                }
                break;
            case 89:
                {
                alt69=4;
                }
                break;
            case 90:
                {
                alt69=5;
                }
                break;
            case 91:
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4487:2: (enumLiteral_0= '<' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4487:2: (enumLiteral_0= '<' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4487:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_ruleRelationalOperator10493); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4493:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4493:6: (enumLiteral_1= '<=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4493:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_88_in_ruleRelationalOperator10510); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4499:6: (enumLiteral_2= '>' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4499:6: (enumLiteral_2= '>' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4499:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_39_in_ruleRelationalOperator10527); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4505:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4505:6: (enumLiteral_3= '>=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4505:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,89,FOLLOW_89_in_ruleRelationalOperator10544); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4511:6: (enumLiteral_4= '==' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4511:6: (enumLiteral_4= '==' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4511:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,90,FOLLOW_90_in_ruleRelationalOperator10561); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4517:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4517:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4517:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,91,FOLLOW_91_in_ruleRelationalOperator10578); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4527:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4529:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4530:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4530:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            int alt70=4;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt70=1;
                }
                break;
            case 93:
                {
                alt70=2;
                }
                break;
            case 94:
                {
                alt70=3;
                }
                break;
            case 95:
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
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4530:2: (enumLiteral_0= 's' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4530:2: (enumLiteral_0= 's' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4530:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_92_in_ruleTimeUnit10623); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4536:6: (enumLiteral_1= 'ms' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4536:6: (enumLiteral_1= 'ms' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4536:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_93_in_ruleTimeUnit10640); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4542:6: (enumLiteral_2= 'us' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4542:6: (enumLiteral_2= 'us' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4542:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,94,FOLLOW_94_in_ruleTimeUnit10657); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4548:6: (enumLiteral_3= 'ns' )
                    {
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4548:6: (enumLiteral_3= 'ns' )
                    // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4548:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,95,FOLLOW_95_in_ruleTimeUnit10674); if (state.failed) return current;
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
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:938:4: ( ';' )
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:938:6: ';'
        {
        match(input,17,FOLLOW_17_in_synpred1_InternalSCCExp1991); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSCCExp

    // $ANTLR start synpred3_InternalSCCExp
    public final void synpred3_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3615:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3616:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3616:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3617:2: '('
        {
        match(input,36,FOLLOW_36_in_synpred3_InternalSCCExp8248); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalSCCExp

    // $ANTLR start synpred4_InternalSCCExp
    public final void synpred4_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3720:4: ( ( '(' ) )
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3721:1: ( '(' )
        {
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3721:1: ( '(' )
        // ../de.cau.cs.kieler.yakindu.scc.model.scctext/src-gen/de/cau/cs/kieler/yakindu/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3722:2: '('
        {
        match(input,36,FOLLOW_36_in_synpred4_InternalSCCExp8471); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalSCCExp

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


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\21\uffff";
    static final String DFA16_eofS =
        "\2\2\17\uffff";
    static final String DFA16_minS =
        "\2\4\17\uffff";
    static final String DFA16_maxS =
        "\1\103\1\126\17\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\16\1";
    static final String DFA16_specialS =
        "\1\uffff\1\0\17\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\2\10\uffff\1\2\2\uffff\1\1\1\2\7\uffff\2\2\5\uffff\3\2\34"+
            "\uffff\4\2",
            "\1\10\1\4\1\3\1\6\1\5\1\7\4\uffff\1\2\6\uffff\1\2\1\uffff"+
            "\3\2\12\uffff\1\13\11\uffff\1\20\3\uffff\1\17\3\uffff\1\12\1"+
            "\11\32\uffff\1\14\1\15\2\uffff\1\16",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "()* loopback of 938:2: ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_1 = input.LA(1);

                         
                        int index16_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_1==EOF||LA16_1==14||LA16_1==21||(LA16_1>=23 && LA16_1<=25)) ) {s = 2;}

                        else if ( (LA16_1==RULE_BOOL) && (synpred1_InternalSCCExp())) {s = 3;}

                        else if ( (LA16_1==RULE_INT) && (synpred1_InternalSCCExp())) {s = 4;}

                        else if ( (LA16_1==RULE_HEX) && (synpred1_InternalSCCExp())) {s = 5;}

                        else if ( (LA16_1==RULE_FLOAT) && (synpred1_InternalSCCExp())) {s = 6;}

                        else if ( (LA16_1==RULE_STRING) && (synpred1_InternalSCCExp())) {s = 7;}

                        else if ( (LA16_1==RULE_ID) && (synpred1_InternalSCCExp())) {s = 8;}

                        else if ( (LA16_1==55) && (synpred1_InternalSCCExp())) {s = 9;}

                        else if ( (LA16_1==54) && (synpred1_InternalSCCExp())) {s = 10;}

                        else if ( (LA16_1==36) && (synpred1_InternalSCCExp())) {s = 11;}

                        else if ( (LA16_1==82) && (synpred1_InternalSCCExp())) {s = 12;}

                        else if ( (LA16_1==83) && (synpred1_InternalSCCExp())) {s = 13;}

                        else if ( (LA16_1==86) && (synpred1_InternalSCCExp())) {s = 14;}

                        else if ( (LA16_1==50) && (synpred1_InternalSCCExp())) {s = 15;}

                        else if ( (LA16_1==46) && (synpred1_InternalSCCExp())) {s = 16;}

                         
                        input.seek(index16_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateSpecification85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_ruleStateSpecification130 = new BitSet(new long[]{0x0000000003A04002L});
    public static final BitSet FOLLOW_ruleStateScope_in_entryRuleStateScope166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateScope176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStateScope223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionScope_in_ruleStateScope250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScope295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleInterfaceScope341 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInterfaceScope353 = new BitSet(new long[]{0x0000000800040010L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleInterfaceScope374 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleInterfaceScope387 = new BitSet(new long[]{0x0000000800040010L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleInterfaceScope408 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleInterfaceScope422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleDeclaration515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleDeclaration542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDirection_in_ruleVariableDefinition633 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleVariableDefinition652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDefinition683 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDefinition700 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleVariableDefinition723 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_19_in_ruleVariableDefinition736 = new BitSet(new long[]{0x00C40010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDefinition757 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleVariableDefinition772 = new BitSet(new long[]{0xFF00000000000000L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleVariableDefinition793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionScope_in_entryRuleReactionScope831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionScope841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryAction_in_ruleReactionScope888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsideAction_in_ruleReactionScope907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitAction_in_ruleReactionScope926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspend_in_ruleReactionScope945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitAction_in_entryRuleExitAction983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitAction993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleExitAction1039 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExitAction1051 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleExitAction1063 = new BitSet(new long[]{0x00C44010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleExitAction1084 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleExitAction1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsideAction_in_entryRuleInsideAction1132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsideAction1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleInsideAction1188 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInsideAction1200 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleInsideAction1212 = new BitSet(new long[]{0x00C44010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleInsideAction1233 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInsideAction1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryAction_in_entryRuleEntryAction1281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryAction1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleEntryAction1337 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEntryAction1349 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEntryAction1361 = new BitSet(new long[]{0x00C44010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleEntryAction1382 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEntryAction1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspend_in_entryRuleSuspend1430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuspend1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSuspend1486 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSuspend1498 = new BitSet(new long[]{0x000000000C000020L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleSuspend1519 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSuspend1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition1569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleTransition1634 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleTransition1648 = new BitSet(new long[]{0x00C44010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransition1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger1707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionTrigger1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleReactionTrigger1769 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReactionTrigger1800 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleReactionTrigger1819 = new BitSet(new long[]{0x00C40010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger1840 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleReactionTrigger1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect1889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionEffect1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect1956 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect1975 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleReactionEffect1999 = new BitSet(new long[]{0x00C44010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect2023 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect2042 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleDefRoot_in_entryRuleDefRoot2085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRoot2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_ruleDefRoot2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_ruleDefRoot2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_ruleDefRoot2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartRoot2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleStatechartRoot2278 = new BitSet(new long[]{0x0000000300004000L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_entryRuleStateRoot2335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateRoot2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleStateRoot2382 = new BitSet(new long[]{0x0000000003A04000L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleStateRoot2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionRoot2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTransitionRoot2486 = new BitSet(new long[]{0x000000000C400020L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartSpecification2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleStatechartSpecification2602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleStatechartSpecification2623 = new BitSet(new long[]{0x0000000200004002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification2646 = new BitSet(new long[]{0x0000000200004002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification2683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope2775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartScope2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStatechartScope2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_ruleStatechartScope2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_entryRuleInternalScope2896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalScope2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleInternalScope2952 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInternalScope2964 = new BitSet(new long[]{0x0000000C0C040032L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInternalScope2987 = new BitSet(new long[]{0x0000000C0C040032L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3006 = new BitSet(new long[]{0x0000000C0C040032L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3025 = new BitSet(new long[]{0x0000000C0C040032L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleInternalScope3044 = new BitSet(new long[]{0x0000000C0C040032L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclarartion3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDefinition3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleEventDefinition3232 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEventDefinition3245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventDefinition3262 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleEventDefinition3280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEventDefinition3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration3433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDeclaration3443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition3525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDefinition3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOperationDefinition3581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperationDefinition3598 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleOperationDefinition3615 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition3637 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_16_in_ruleOperationDefinition3650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition3671 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_37_in_ruleOperationDefinition3687 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleOperationDefinition3700 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter3813 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleParameter3830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleParameter3853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN3894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN3905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3945 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleFQN3964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3979 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction4026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReaction4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReaction4082 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleLocalReaction4114 = new BitSet(new long[]{0x00C44010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalReaction4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction4173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionReaction4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleTransitionReaction4238 = new BitSet(new long[]{0x0000000004400002L});
    public static final BitSet FOLLOW_22_in_ruleTransitionReaction4252 = new BitSet(new long[]{0x00C44010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransitionReaction4273 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleTransitionReaction4288 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_ruleReactionProperties_in_ruleTransitionReaction4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionProperties_in_entryRuleReactionProperties4347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionProperties4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionProperty_in_ruleReactionProperties4412 = new BitSet(new long[]{0x0000008000000012L});
    public static final BitSet FOLLOW_ruleReactionProperty_in_entryRuleReactionProperty4449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionProperty4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_ruleReactionProperty4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_ruleReactionProperty4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec4568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryPointSpec4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEntryPointSpec4615 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEntryPointSpec4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec4674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitPointSpec4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleExitPointSpec4732 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleExitPointSpec4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec4782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularEventSpec4792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec4837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec4872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeEventSpec4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec4928 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeEventSpec4945 = new BitSet(new long[]{0x0000000000000002L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinEventSpec5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCycleEvent_in_ruleBuiltinEventSpec5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultEvent_in_ruleBuiltinEventSpec5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent5208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryEvent5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleEntryEvent5264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent5300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent5310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleExitEvent5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCycleEvent_in_entryRuleOnCycleEvent5392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnCycleEvent5402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOnCycleEvent5448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent5484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEvent5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAlwaysEvent5540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultEvent_in_entryRuleDefaultEvent5576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultEvent5586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDefaultEvent5633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDefaultEvent5651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_entryRuleEventRaisingExpression5688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventRaisingExpression5698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleEventRaisingExpression5744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventRaisingExpression5765 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleEventRaisingExpression5778 = new BitSet(new long[]{0x00C40010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEventRaisingExpression5799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression5839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression5849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpression5895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression5929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression5939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression5986 = new BitSet(new long[]{0x0000000000080002L,0x000000000000FFC0L});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6016 = new BitSet(new long[]{0x00C40010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6037 = new BitSet(new long[]{0x0000000000080002L,0x000000000000FFC0L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression6085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6132 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleConditionalExpression6153 = new BitSet(new long[]{0x00C40010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6174 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConditionalExpression6186 = new BitSet(new long[]{0x00C40010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression6255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6302 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleLogicalOrExpression6323 = new BitSet(new long[]{0x00C40010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6344 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression6392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6439 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleLogicalAndExpression6460 = new BitSet(new long[]{0x00C40010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6481 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression6519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNotExpression6529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression6576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleLogicalNotExpression6603 = new BitSet(new long[]{0x00C00010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression6624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression6661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression6671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression6718 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleBitwiseXorExpression6739 = new BitSet(new long[]{0x00C00010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression6760 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression6798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression6808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression6855 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleBitwiseOrExpression6876 = new BitSet(new long[]{0x00C00010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression6897 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression6935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression6945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression6992 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleBitwiseAndExpression7013 = new BitSet(new long[]{0x00C00010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7034 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalRelationExpression7082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7129 = new BitSet(new long[]{0x0000008000000002L,0x000000000F800000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7159 = new BitSet(new long[]{0x00C00010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7180 = new BitSet(new long[]{0x0000008000000002L,0x000000000F800000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression7228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7275 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression7305 = new BitSet(new long[]{0x00C00010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7326 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7421 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7451 = new BitSet(new long[]{0x00C00010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7472 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression7510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression7520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression7567 = new BitSet(new long[]{0x0000000000400002L,0x0000000000300000L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression7597 = new BitSet(new long[]{0x00C00010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression7618 = new BitSet(new long[]{0x0000000000400002L,0x0000000000300000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression7656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalUnaryExpression7666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression7713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression7749 = new BitSet(new long[]{0x00C00010000003F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression7770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression7807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression7817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression7864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression7891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression7918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression7945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulePrimaryExpression7963 = new BitSet(new long[]{0x00C40010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression7985 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulePrimaryExpression7996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValueExpression8043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall8144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8191 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleFeatureCall8212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureCall8232 = new BitSet(new long[]{0x0000005000000002L});
    public static final BitSet FOLLOW_36_in_ruleFeatureCall8266 = new BitSet(new long[]{0x00C40030000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8301 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_16_in_ruleFeatureCall8314 = new BitSet(new long[]{0x00C40010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8335 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_37_in_ruleFeatureCall8351 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementReferenceExpression8401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementReferenceExpression8455 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleElementReferenceExpression8489 = new BitSet(new long[]{0x00C40030000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8524 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_16_in_ruleElementReferenceExpression8537 = new BitSet(new long[]{0x00C40010000003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8558 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_37_in_ruleElementReferenceExpression8574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression8612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventValueReferenceExpression8622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleEventValueReferenceExpression8668 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleEventValueReferenceExpression8680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression8701 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleEventValueReferenceExpression8713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression8749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression8759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleActiveStateReferenceExpression8805 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleActiveStateReferenceExpression8817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression8840 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleActiveStateReferenceExpression8852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral8888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral8898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral8945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral8972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_ruleLiteral8999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleLiteral9026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral9053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral9098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral9149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral9200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral9251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral9302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRealLiteral9353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexLiteral9404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleHexLiteral9455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral9557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleCombineOperator9612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleCombineOperator9629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleCombineOperator9646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleCombineOperator9663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleCombineOperator9680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleCombineOperator9697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleCombineOperator9714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleCombineOperator9731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleVarDirection9776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleVarDirection9793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleVarDirection9810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleDirection9855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDirection9872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleDirection9889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleTimeEventType9934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleTimeEventType9951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAssignmentOperator9996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleAssignmentOperator10013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleAssignmentOperator10030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleAssignmentOperator10047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleAssignmentOperator10064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleAssignmentOperator10081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleAssignmentOperator10098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleAssignmentOperator10115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAssignmentOperator10132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleAssignmentOperator10149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleAssignmentOperator10166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleShiftOperator10211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleShiftOperator10228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleAdditiveOperator10273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleAdditiveOperator10290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleMultiplicativeOperator10335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleMultiplicativeOperator10352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleMultiplicativeOperator10369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleUnaryOperator10414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleUnaryOperator10431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleUnaryOperator10448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleRelationalOperator10493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleRelationalOperator10510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleRelationalOperator10527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleRelationalOperator10544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleRelationalOperator10561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleRelationalOperator10578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleTimeUnit10623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleTimeUnit10640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleTimeUnit10657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleTimeUnit10674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred1_InternalSCCExp1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred3_InternalSCCExp8248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred4_InternalSCCExp8471 = new BitSet(new long[]{0x0000000000000002L});

}