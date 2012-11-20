package de.cau.kieler.scc.model.scctext.parser.antlr.internal; 

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
import de.cau.kieler.scc.model.scctext.services.SCCExpGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSCCExpParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_FLOAT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interface'", "':'", "','", "';'", "'static'", "'='", "'with'", "'Exit'", "'/'", "'Inside'", "'Entry'", "'Suspend'", "'#'", "'('", "')'", "'@@statechart@@'", "'@@state@@'", "'@@transition@@'", "'namespace'", "'internal'", "'event'", "'operation'", "'.'", "'['", "']'", "'>'", "'entry'", "'exit'", "'oncycle'", "'always'", "'default'", "'else'", "'raise'", "'?'", "'||'", "'&&'", "'!'", "'^'", "'|'", "'&'", "'valueof'", "'active'", "'\\'none\\''", "'\\'+\\''", "'\\'*\\''", "'\\'max\\''", "'\\'min\\''", "'\\'or\\''", "'\\'and\\''", "'\\'host\\''", "'inout'", "'in'", "'out'", "'local'", "'after'", "'every'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'%'", "'~'", "'<'", "'<='", "'>='", "'=='", "'!='", "'s'", "'ms'", "'us'", "'ns'"
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
    public String getGrammarFileName() { return "../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g"; }



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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:68:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:69:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:70:2: iv_ruleStateSpecification= ruleStateSpecification EOF
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:77:1: ruleStateSpecification returns [EObject current=null] : ( (lv_scopes_0_0= ruleStateScope ) )* ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_scopes_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:80:28: ( ( (lv_scopes_0_0= ruleStateScope ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:81:1: ( (lv_scopes_0_0= ruleStateScope ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:81:1: ( (lv_scopes_0_0= ruleStateScope ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==21||(LA1_0>=23 && LA1_0<=25)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:82:1: (lv_scopes_0_0= ruleStateScope )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:82:1: (lv_scopes_0_0= ruleStateScope )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:83:3: lv_scopes_0_0= ruleStateScope
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:107:1: entryRuleStateScope returns [EObject current=null] : iv_ruleStateScope= ruleStateScope EOF ;
    public final EObject entryRuleStateScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateScope = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:108:2: (iv_ruleStateScope= ruleStateScope EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:109:2: iv_ruleStateScope= ruleStateScope EOF
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:116:1: ruleStateScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_ReactionScope_1= ruleReactionScope ) ;
    public final EObject ruleStateScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_ReactionScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:119:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_ReactionScope_1= ruleReactionScope ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:120:1: (this_InterfaceScope_0= ruleInterfaceScope | this_ReactionScope_1= ruleReactionScope )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:120:1: (this_InterfaceScope_0= ruleInterfaceScope | this_ReactionScope_1= ruleReactionScope )
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:121:5: this_InterfaceScope_0= ruleInterfaceScope
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:131:5: this_ReactionScope_1= ruleReactionScope
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:147:1: entryRuleInterfaceScope returns [EObject current=null] : iv_ruleInterfaceScope= ruleInterfaceScope EOF ;
    public final EObject entryRuleInterfaceScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceScope = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:148:2: (iv_ruleInterfaceScope= ruleInterfaceScope EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:149:2: iv_ruleInterfaceScope= ruleInterfaceScope EOF
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:156:1: ruleInterfaceScope returns [EObject current=null] : ( () otherlv_1= 'interface' otherlv_2= ':' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ',' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= ';' ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:159:28: ( ( () otherlv_1= 'interface' otherlv_2= ':' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ',' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= ';' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:160:1: ( () otherlv_1= 'interface' otherlv_2= ':' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ',' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= ';' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:160:1: ( () otherlv_1= 'interface' otherlv_2= ':' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ',' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= ';' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:160:2: () otherlv_1= 'interface' otherlv_2= ':' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ',' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= ';'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:160:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:161:5: 
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:174:1: ( (lv_declarations_3_0= ruleDeclaration ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:175:1: (lv_declarations_3_0= ruleDeclaration )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:175:1: (lv_declarations_3_0= ruleDeclaration )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:176:3: lv_declarations_3_0= ruleDeclaration
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:192:2: (otherlv_4= ',' ( (lv_declarations_5_0= ruleDeclaration ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:192:4: otherlv_4= ',' ( (lv_declarations_5_0= ruleDeclaration ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleInterfaceScope387); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getInterfaceScopeAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:196:1: ( (lv_declarations_5_0= ruleDeclaration ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:197:1: (lv_declarations_5_0= ruleDeclaration )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:197:1: (lv_declarations_5_0= ruleDeclaration )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:198:3: lv_declarations_5_0= ruleDeclaration
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:226:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:227:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:228:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:235:1: ruleDeclaration returns [EObject current=null] : (this_VariableDefinition_0= ruleVariableDefinition | this_OperationDeclaration_1= ruleOperationDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;

        EObject this_OperationDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:238:28: ( (this_VariableDefinition_0= ruleVariableDefinition | this_OperationDeclaration_1= ruleOperationDeclaration ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:239:1: (this_VariableDefinition_0= ruleVariableDefinition | this_OperationDeclaration_1= ruleOperationDeclaration )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:239:1: (this_VariableDefinition_0= ruleVariableDefinition | this_OperationDeclaration_1= ruleOperationDeclaration )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18||(LA4_0>=64 && LA4_0<=66)) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:240:5: this_VariableDefinition_0= ruleVariableDefinition
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:250:5: this_OperationDeclaration_1= ruleOperationDeclaration
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:266:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:267:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:268:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:275:1: ruleVariableDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleVarDirection ) )? ( (lv_isStatic_1_0= 'static' ) ) ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_varInitialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_varCombineOperator_8_0= ruleCombineOperator ) ) )? ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:278:28: ( ( ( (lv_direction_0_0= ruleVarDirection ) )? ( (lv_isStatic_1_0= 'static' ) ) ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_varInitialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_varCombineOperator_8_0= ruleCombineOperator ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:279:1: ( ( (lv_direction_0_0= ruleVarDirection ) )? ( (lv_isStatic_1_0= 'static' ) ) ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_varInitialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_varCombineOperator_8_0= ruleCombineOperator ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:279:1: ( ( (lv_direction_0_0= ruleVarDirection ) )? ( (lv_isStatic_1_0= 'static' ) ) ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_varInitialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_varCombineOperator_8_0= ruleCombineOperator ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:279:2: ( (lv_direction_0_0= ruleVarDirection ) )? ( (lv_isStatic_1_0= 'static' ) ) ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_varInitialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_varCombineOperator_8_0= ruleCombineOperator ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:279:2: ( (lv_direction_0_0= ruleVarDirection ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=64 && LA5_0<=66)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:280:1: (lv_direction_0_0= ruleVarDirection )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:280:1: (lv_direction_0_0= ruleVarDirection )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:281:3: lv_direction_0_0= ruleVarDirection
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:297:3: ( (lv_isStatic_1_0= 'static' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:298:1: (lv_isStatic_1_0= 'static' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:298:1: (lv_isStatic_1_0= 'static' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:299:3: lv_isStatic_1_0= 'static'
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:312:2: ( (lv_varName_2_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:313:1: (lv_varName_2_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:313:1: (lv_varName_2_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:314:3: lv_varName_2_0= RULE_ID
            {
            lv_varName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDefinition682); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleVariableDefinition699); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVariableDefinitionAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:334:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:335:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:335:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:336:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getVarTypeTypeCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleVariableDefinition722);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:349:2: (otherlv_5= '=' ( (lv_varInitialValue_6_0= ruleExpression ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:349:4: otherlv_5= '=' ( (lv_varInitialValue_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleVariableDefinition735); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getVariableDefinitionAccess().getEqualsSignKeyword_5_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:353:1: ( (lv_varInitialValue_6_0= ruleExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:354:1: (lv_varInitialValue_6_0= ruleExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:354:1: (lv_varInitialValue_6_0= ruleExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:355:3: lv_varInitialValue_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getVarInitialValueExpressionParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDefinition756);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:371:4: (otherlv_7= 'with' ( (lv_varCombineOperator_8_0= ruleCombineOperator ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:371:6: otherlv_7= 'with' ( (lv_varCombineOperator_8_0= ruleCombineOperator ) )
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleVariableDefinition771); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getVariableDefinitionAccess().getWithKeyword_6_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:375:1: ( (lv_varCombineOperator_8_0= ruleCombineOperator ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:376:1: (lv_varCombineOperator_8_0= ruleCombineOperator )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:376:1: (lv_varCombineOperator_8_0= ruleCombineOperator )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:377:3: lv_varCombineOperator_8_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getVarCombineOperatorCombineOperatorEnumRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleVariableDefinition792);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:401:1: entryRuleReactionScope returns [EObject current=null] : iv_ruleReactionScope= ruleReactionScope EOF ;
    public final EObject entryRuleReactionScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionScope = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:402:2: (iv_ruleReactionScope= ruleReactionScope EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:403:2: iv_ruleReactionScope= ruleReactionScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionScopeRule()); 
            }
            pushFollow(FOLLOW_ruleReactionScope_in_entryRuleReactionScope830);
            iv_ruleReactionScope=ruleReactionScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionScope840); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:410:1: ruleReactionScope returns [EObject current=null] : ( ( (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend ) ) ) ;
    public final EObject ruleReactionScope() throws RecognitionException {
        EObject current = null;

        EObject lv_reactionScope_0_1 = null;

        EObject lv_reactionScope_0_2 = null;

        EObject lv_reactionScope_0_3 = null;

        EObject lv_reactionScope_0_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:413:28: ( ( ( (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:414:1: ( ( (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:414:1: ( ( (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:415:1: ( (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:415:1: ( (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:416:1: (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:416:1: (lv_reactionScope_0_1= ruleEntryAction | lv_reactionScope_0_2= ruleInsideAction | lv_reactionScope_0_3= ruleExitAction | lv_reactionScope_0_4= ruleSuspend )
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:417:3: lv_reactionScope_0_1= ruleEntryAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionScopeAccess().getReactionScopeEntryActionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEntryAction_in_ruleReactionScope887);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:432:8: lv_reactionScope_0_2= ruleInsideAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionScopeAccess().getReactionScopeInsideActionParserRuleCall_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInsideAction_in_ruleReactionScope906);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:447:8: lv_reactionScope_0_3= ruleExitAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionScopeAccess().getReactionScopeExitActionParserRuleCall_0_2()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExitAction_in_ruleReactionScope925);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:462:8: lv_reactionScope_0_4= ruleSuspend
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionScopeAccess().getReactionScopeSuspendParserRuleCall_0_3()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSuspend_in_ruleReactionScope944);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:488:1: entryRuleExitAction returns [EObject current=null] : iv_ruleExitAction= ruleExitAction EOF ;
    public final EObject entryRuleExitAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitAction = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:489:2: (iv_ruleExitAction= ruleExitAction EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:490:2: iv_ruleExitAction= ruleExitAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitActionRule()); 
            }
            pushFollow(FOLLOW_ruleExitAction_in_entryRuleExitAction982);
            iv_ruleExitAction=ruleExitAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitAction992); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:497:1: ruleExitAction returns [EObject current=null] : ( () otherlv_1= 'Exit' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleEffect ) ) otherlv_5= ';' ) ;
    public final EObject ruleExitAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_effect_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:500:28: ( ( () otherlv_1= 'Exit' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleEffect ) ) otherlv_5= ';' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:501:1: ( () otherlv_1= 'Exit' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleEffect ) ) otherlv_5= ';' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:501:1: ( () otherlv_1= 'Exit' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleEffect ) ) otherlv_5= ';' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:501:2: () otherlv_1= 'Exit' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleEffect ) ) otherlv_5= ';'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:501:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:502:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitActionAccess().getExitActionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleExitAction1038); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitActionAccess().getExitKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleExitAction1050); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExitActionAccess().getColonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleExitAction1062); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExitActionAccess().getSolidusKeyword_3());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:519:1: ( (lv_effect_4_0= ruleEffect ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:520:1: (lv_effect_4_0= ruleEffect )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:520:1: (lv_effect_4_0= ruleEffect )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:521:3: lv_effect_4_0= ruleEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExitActionAccess().getEffectEffectParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEffect_in_ruleExitAction1083);
            lv_effect_4_0=ruleEffect();

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
                      		"Effect");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleExitAction1095); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:549:1: entryRuleInsideAction returns [EObject current=null] : iv_ruleInsideAction= ruleInsideAction EOF ;
    public final EObject entryRuleInsideAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsideAction = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:550:2: (iv_ruleInsideAction= ruleInsideAction EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:551:2: iv_ruleInsideAction= ruleInsideAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsideActionRule()); 
            }
            pushFollow(FOLLOW_ruleInsideAction_in_entryRuleInsideAction1131);
            iv_ruleInsideAction=ruleInsideAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInsideAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsideAction1141); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:558:1: ruleInsideAction returns [EObject current=null] : ( () otherlv_1= 'Inside' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleEffect ) ) otherlv_5= ';' ) ;
    public final EObject ruleInsideAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_effect_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:561:28: ( ( () otherlv_1= 'Inside' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleEffect ) ) otherlv_5= ';' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:562:1: ( () otherlv_1= 'Inside' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleEffect ) ) otherlv_5= ';' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:562:1: ( () otherlv_1= 'Inside' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleEffect ) ) otherlv_5= ';' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:562:2: () otherlv_1= 'Inside' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleEffect ) ) otherlv_5= ';'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:562:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:563:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInsideActionAccess().getInsideActionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleInsideAction1187); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInsideActionAccess().getInsideKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleInsideAction1199); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInsideActionAccess().getColonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleInsideAction1211); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInsideActionAccess().getSolidusKeyword_3());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:580:1: ( (lv_effect_4_0= ruleEffect ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:581:1: (lv_effect_4_0= ruleEffect )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:581:1: (lv_effect_4_0= ruleEffect )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:582:3: lv_effect_4_0= ruleEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInsideActionAccess().getEffectEffectParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEffect_in_ruleInsideAction1232);
            lv_effect_4_0=ruleEffect();

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
                      		"Effect");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleInsideAction1244); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:610:1: entryRuleEntryAction returns [EObject current=null] : iv_ruleEntryAction= ruleEntryAction EOF ;
    public final EObject entryRuleEntryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryAction = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:611:2: (iv_ruleEntryAction= ruleEntryAction EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:612:2: iv_ruleEntryAction= ruleEntryAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryActionRule()); 
            }
            pushFollow(FOLLOW_ruleEntryAction_in_entryRuleEntryAction1280);
            iv_ruleEntryAction=ruleEntryAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryAction1290); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:619:1: ruleEntryAction returns [EObject current=null] : ( () otherlv_1= 'Entry' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleEffect ) ) otherlv_5= ';' ) ;
    public final EObject ruleEntryAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_effect_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:622:28: ( ( () otherlv_1= 'Entry' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleEffect ) ) otherlv_5= ';' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:623:1: ( () otherlv_1= 'Entry' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleEffect ) ) otherlv_5= ';' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:623:1: ( () otherlv_1= 'Entry' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleEffect ) ) otherlv_5= ';' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:623:2: () otherlv_1= 'Entry' otherlv_2= ':' otherlv_3= '/' ( (lv_effect_4_0= ruleEffect ) ) otherlv_5= ';'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:623:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:624:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryActionAccess().getEntryActionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleEntryAction1336); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntryActionAccess().getEntryKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleEntryAction1348); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEntryActionAccess().getColonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleEntryAction1360); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEntryActionAccess().getSolidusKeyword_3());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:641:1: ( (lv_effect_4_0= ruleEffect ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:642:1: (lv_effect_4_0= ruleEffect )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:642:1: (lv_effect_4_0= ruleEffect )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:643:3: lv_effect_4_0= ruleEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntryActionAccess().getEffectEffectParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEffect_in_ruleEntryAction1381);
            lv_effect_4_0=ruleEffect();

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
                      		"Effect");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleEntryAction1393); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:671:1: entryRuleSuspend returns [EObject current=null] : iv_ruleSuspend= ruleSuspend EOF ;
    public final EObject entryRuleSuspend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspend = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:672:2: (iv_ruleSuspend= ruleSuspend EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:673:2: iv_ruleSuspend= ruleSuspend EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuspendRule()); 
            }
            pushFollow(FOLLOW_ruleSuspend_in_entryRuleSuspend1429);
            iv_ruleSuspend=ruleSuspend();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuspend; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuspend1439); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:680:1: ruleSuspend returns [EObject current=null] : ( () otherlv_1= 'Suspend' otherlv_2= ':' ( (lv_trigger_3_0= ruleTrigger ) ) otherlv_4= ';' ) ;
    public final EObject ruleSuspend() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:683:28: ( ( () otherlv_1= 'Suspend' otherlv_2= ':' ( (lv_trigger_3_0= ruleTrigger ) ) otherlv_4= ';' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:684:1: ( () otherlv_1= 'Suspend' otherlv_2= ':' ( (lv_trigger_3_0= ruleTrigger ) ) otherlv_4= ';' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:684:1: ( () otherlv_1= 'Suspend' otherlv_2= ':' ( (lv_trigger_3_0= ruleTrigger ) ) otherlv_4= ';' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:684:2: () otherlv_1= 'Suspend' otherlv_2= ':' ( (lv_trigger_3_0= ruleTrigger ) ) otherlv_4= ';'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:684:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:685:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSuspendAccess().getSuspendAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleSuspend1485); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSuspendAccess().getSuspendKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSuspend1497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSuspendAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:698:1: ( (lv_trigger_3_0= ruleTrigger ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:699:1: (lv_trigger_3_0= ruleTrigger )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:699:1: (lv_trigger_3_0= ruleTrigger )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:700:3: lv_trigger_3_0= ruleTrigger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSuspendAccess().getTriggerTriggerParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTrigger_in_ruleSuspend1518);
            lv_trigger_3_0=ruleTrigger();

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
                      		"Trigger");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSuspend1530); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:730:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:731:2: (iv_ruleTransition= ruleTransition EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:732:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition1568);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition1578); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:739:1: ruleTransition returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleEffect ) ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:742:28: ( ( () ( (lv_trigger_1_0= ruleTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleEffect ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:743:1: ( () ( (lv_trigger_1_0= ruleTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleEffect ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:743:1: ( () ( (lv_trigger_1_0= ruleTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleEffect ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:743:2: () ( (lv_trigger_1_0= ruleTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleEffect ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:743:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:744:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionAccess().getTransitionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:749:2: ( (lv_trigger_1_0= ruleTrigger ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||(LA9_0>=26 && LA9_0<=27)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:750:1: (lv_trigger_1_0= ruleTrigger )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:750:1: (lv_trigger_1_0= ruleTrigger )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:751:3: lv_trigger_1_0= ruleTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionAccess().getTriggerTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTrigger_in_ruleTransition1633);
                    lv_trigger_1_0=ruleTrigger();

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
                              		"Trigger");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:767:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleEffect ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:767:5: otherlv_2= '/' ( (lv_effect_3_0= ruleEffect ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleTransition1647); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:771:1: ( (lv_effect_3_0= ruleEffect ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:772:1: (lv_effect_3_0= ruleEffect )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:772:1: (lv_effect_3_0= ruleEffect )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:773:3: lv_effect_3_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEffect_in_ruleTransition1668);
                    lv_effect_3_0=ruleEffect();

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
                              		"Effect");
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


    // $ANTLR start "entryRuleTrigger"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:797:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:798:2: (iv_ruleTrigger= ruleTrigger EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:799:2: iv_ruleTrigger= ruleTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleTrigger_in_entryRuleTrigger1706);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrigger1716); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:806:1: ruleTrigger returns [EObject current=null] : ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? otherlv_3= '(' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_1_0=null;
        Token lv_delay_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:809:28: ( ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? otherlv_3= '(' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:810:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? otherlv_3= '(' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:810:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? otherlv_3= '(' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:810:2: () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? otherlv_3= '(' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:810:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:811:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTriggerAccess().getTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:816:2: ( (lv_isImmediate_1_0= '#' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:817:1: (lv_isImmediate_1_0= '#' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:817:1: (lv_isImmediate_1_0= '#' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:818:3: lv_isImmediate_1_0= '#'
                    {
                    lv_isImmediate_1_0=(Token)match(input,26,FOLLOW_26_in_ruleTrigger1768); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isImmediate_1_0, grammarAccess.getTriggerAccess().getIsImmediateNumberSignKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTriggerRule());
                      	        }
                             		setWithLastConsumed(current, "isImmediate", true, "#");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:831:3: ( (lv_delay_2_0= RULE_INT ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:832:1: (lv_delay_2_0= RULE_INT )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:832:1: (lv_delay_2_0= RULE_INT )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:833:3: lv_delay_2_0= RULE_INT
                    {
                    lv_delay_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTrigger1799); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_delay_2_0, grammarAccess.getTriggerAccess().getDelayINTTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTriggerRule());
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

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleTrigger1817); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTriggerAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:853:1: ( (lv_expression_4_0= ruleExpression ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:854:1: (lv_expression_4_0= ruleExpression )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:854:1: (lv_expression_4_0= ruleExpression )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:855:3: lv_expression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTriggerAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleTrigger1838);
            lv_expression_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTriggerRule());
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

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleTrigger1850); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTriggerAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleEffect"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:883:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:884:2: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:885:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEffectRule()); 
            }
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect1886);
            iv_ruleEffect=ruleEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect1896); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:892:1: ruleEffect returns [EObject current=null] : ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_3_1 = null;

        EObject lv_actions_3_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:895:28: ( ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:896:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:896:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:896:2: () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:896:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:897:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEffectAccess().getEffectAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:902:2: ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:903:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:903:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:904:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:904:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_STRING)||LA13_0==27||LA13_0==50||(LA13_0>=54 && LA13_0<=55)||(LA13_0>=82 && LA13_0<=83)||LA13_0==86) ) {
                alt13=1;
            }
            else if ( (LA13_0==46) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:905:3: lv_actions_1_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEffectAccess().getActionsExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleEffect1953);
                    lv_actions_1_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEffectRule());
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:920:8: lv_actions_1_2= ruleEventRaisingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEffectAccess().getActionsEventRaisingExpressionParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleEffect1972);
                    lv_actions_1_2=ruleEventRaisingExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEffectRule());
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:938:2: ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:938:3: ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:938:3: ( ( ';' )=>otherlv_2= ';' )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:938:4: ( ';' )=>otherlv_2= ';'
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleEffect1996); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getEffectAccess().getSemicolonKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:943:2: ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:944:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:944:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:945:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:945:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)||LA14_0==27||LA14_0==50||(LA14_0>=54 && LA14_0<=55)||(LA14_0>=82 && LA14_0<=83)||LA14_0==86) ) {
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:946:3: lv_actions_3_1= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getEffectAccess().getActionsExpressionParserRuleCall_2_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleEffect2020);
            	            lv_actions_3_1=ruleExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getEffectRule());
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:961:8: lv_actions_3_2= ruleEventRaisingExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getEffectAccess().getActionsEventRaisingExpressionParserRuleCall_2_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleEffect2039);
            	            lv_actions_3_2=ruleEventRaisingExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getEffectRule());
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
            	    break loop15;
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
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleDefRoot"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:989:1: entryRuleDefRoot returns [EObject current=null] : iv_ruleDefRoot= ruleDefRoot EOF ;
    public final EObject entryRuleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRoot = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:990:2: (iv_ruleDefRoot= ruleDefRoot EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:991:2: iv_ruleDefRoot= ruleDefRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefRootRule()); 
            }
            pushFollow(FOLLOW_ruleDefRoot_in_entryRuleDefRoot2082);
            iv_ruleDefRoot=ruleDefRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRoot2092); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:998:1: ruleDefRoot returns [EObject current=null] : (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) ;
    public final EObject ruleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject this_StatechartRoot_0 = null;

        EObject this_StateRoot_1 = null;

        EObject this_TransitionRoot_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1001:28: ( (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1002:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1002:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt16=1;
                }
                break;
            case 30:
                {
                alt16=2;
                }
                break;
            case 31:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1003:5: this_StatechartRoot_0= ruleStatechartRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStatechartRootParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatechartRoot_in_ruleDefRoot2139);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1013:5: this_StateRoot_1= ruleStateRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStateRootParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStateRoot_in_ruleDefRoot2166);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1023:5: this_TransitionRoot_2= ruleTransitionRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getTransitionRootParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransitionRoot_in_ruleDefRoot2193);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1039:1: entryRuleStatechartRoot returns [EObject current=null] : iv_ruleStatechartRoot= ruleStatechartRoot EOF ;
    public final EObject entryRuleStatechartRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartRoot = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1040:2: (iv_ruleStatechartRoot= ruleStatechartRoot EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1041:2: iv_ruleStatechartRoot= ruleStatechartRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartRootRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2228);
            iv_ruleStatechartRoot=ruleStatechartRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartRoot2238); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1048:1: ruleStatechartRoot returns [EObject current=null] : (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) ;
    public final EObject ruleStatechartRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1051:28: ( (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1052:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1052:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1052:3: otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleStatechartRoot2275); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatechartRootAccess().getStatechartKeyword_0());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1056:1: ( (lv_def_1_0= ruleStatechartSpecification ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1057:1: (lv_def_1_0= ruleStatechartSpecification )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1057:1: (lv_def_1_0= ruleStatechartSpecification )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1058:3: lv_def_1_0= ruleStatechartSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatechartRootAccess().getDefStatechartSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2296);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1082:1: entryRuleStateRoot returns [EObject current=null] : iv_ruleStateRoot= ruleStateRoot EOF ;
    public final EObject entryRuleStateRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateRoot = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1083:2: (iv_ruleStateRoot= ruleStateRoot EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1084:2: iv_ruleStateRoot= ruleStateRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRootRule()); 
            }
            pushFollow(FOLLOW_ruleStateRoot_in_entryRuleStateRoot2332);
            iv_ruleStateRoot=ruleStateRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateRoot2342); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1091:1: ruleStateRoot returns [EObject current=null] : (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) ;
    public final EObject ruleStateRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1094:28: ( (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1095:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1095:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1095:3: otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleStateRoot2379); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateRootAccess().getStateKeyword_0());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1099:1: ( (lv_def_1_0= ruleStateSpecification ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1100:1: (lv_def_1_0= ruleStateSpecification )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1100:1: (lv_def_1_0= ruleStateSpecification )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1101:3: lv_def_1_0= ruleStateSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateRootAccess().getDefStateSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_ruleStateRoot2400);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1125:1: entryRuleTransitionRoot returns [EObject current=null] : iv_ruleTransitionRoot= ruleTransitionRoot EOF ;
    public final EObject entryRuleTransitionRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionRoot = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1126:2: (iv_ruleTransitionRoot= ruleTransitionRoot EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1127:2: iv_ruleTransitionRoot= ruleTransitionRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRootRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2436);
            iv_ruleTransitionRoot=ruleTransitionRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionRoot2446); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1134:1: ruleTransitionRoot returns [EObject current=null] : (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) ;
    public final EObject ruleTransitionRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1137:28: ( (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1138:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1138:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1138:3: otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleTransitionRoot2483); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionRootAccess().getTransitionKeyword_0());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1142:1: ( (lv_def_1_0= ruleTransitionSpecification ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1143:1: (lv_def_1_0= ruleTransitionSpecification )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1143:1: (lv_def_1_0= ruleTransitionSpecification )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1144:3: lv_def_1_0= ruleTransitionSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionRootAccess().getDefTransitionSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2504);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1170:1: entryRuleStatechartSpecification returns [EObject current=null] : iv_ruleStatechartSpecification= ruleStatechartSpecification EOF ;
    public final EObject entryRuleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartSpecification = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1171:2: (iv_ruleStatechartSpecification= ruleStatechartSpecification EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1172:2: iv_ruleStatechartSpecification= ruleStatechartSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2542);
            iv_ruleStatechartSpecification=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartSpecification2552); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1179:1: ruleStatechartSpecification returns [EObject current=null] : ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) ;
    public final EObject ruleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        EObject lv_scopes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1182:28: ( ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1183:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1183:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1183:2: () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1183:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1184:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatechartSpecificationAccess().getStatechartSpecificationAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1189:2: (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1189:4: otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleStatechartSpecification2599); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatechartSpecificationAccess().getNamespaceKeyword_1_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1193:1: ( (lv_namespace_2_0= ruleFQN ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1194:1: (lv_namespace_2_0= ruleFQN )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1194:1: (lv_namespace_2_0= ruleFQN )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1195:3: lv_namespace_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getNamespaceFQNParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleStatechartSpecification2620);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1211:4: ( (lv_scopes_3_0= ruleStatechartScope ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==14||LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1212:1: (lv_scopes_3_0= ruleStatechartScope )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1212:1: (lv_scopes_3_0= ruleStatechartScope )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1213:3: lv_scopes_3_0= ruleStatechartScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getScopesStatechartScopeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification2643);
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
    // $ANTLR end "ruleStatechartSpecification"


    // $ANTLR start "entryRuleTransitionSpecification"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1237:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1238:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1239:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification2680);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification2690); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1246:1: ruleTransitionSpecification returns [EObject current=null] : ( (lv_reaction_0_0= ruleTransitionReaction ) ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_reaction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1249:28: ( ( (lv_reaction_0_0= ruleTransitionReaction ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1250:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1250:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1251:1: (lv_reaction_0_0= ruleTransitionReaction )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1251:1: (lv_reaction_0_0= ruleTransitionReaction )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1252:3: lv_reaction_0_0= ruleTransitionReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getReactionTransitionReactionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification2735);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1278:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1279:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1280:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope2772);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartScope2782); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1287:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1290:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1291:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1291:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==14) ) {
                alt19=1;
            }
            else if ( (LA19_0==33) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1292:5: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStatechartScope2829);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1302:5: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalScope_in_ruleStatechartScope2856);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1320:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1321:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1322:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInternalScope_in_entryRuleInternalScope2893);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalScope2903); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1329:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1332:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1333:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1333:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1333:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1333:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1334:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInternalScopeAccess().getInternalScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleInternalScope2949); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleInternalScope2961); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1347:1: ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==18||(LA21_0>=34 && LA21_0<=35)||LA21_0==37||(LA21_0>=40 && LA21_0<=45)||(LA21_0>=64 && LA21_0<=69)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1348:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1348:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1349:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1349:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    int alt20=4;
            	    switch ( input.LA(1) ) {
            	    case 34:
            	    case 67:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 65:
            	        {
            	        int LA20_2 = input.LA(2);

            	        if ( (LA20_2==18) ) {
            	            alt20=2;
            	        }
            	        else if ( (LA20_2==34) ) {
            	            alt20=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 20, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 66:
            	        {
            	        int LA20_3 = input.LA(2);

            	        if ( (LA20_3==34) ) {
            	            alt20=1;
            	        }
            	        else if ( (LA20_3==18) ) {
            	            alt20=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 20, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 18:
            	    case 64:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    case RULE_ID:
            	    case 37:
            	    case 40:
            	    case 41:
            	    case 42:
            	    case 43:
            	    case 44:
            	    case 45:
            	    case 68:
            	    case 69:
            	        {
            	        alt20=4;
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1350:3: lv_declarations_3_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInternalScope2984);
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1365:8: lv_declarations_3_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3003);
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1380:8: lv_declarations_3_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3022);
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1395:8: lv_declarations_3_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsLocalReactionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleInternalScope3041);
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
    // $ANTLR end "ruleInternalScope"


    // $ANTLR start "entryRuleEventDeclarartion"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1421:1: entryRuleEventDeclarartion returns [EObject current=null] : iv_ruleEventDeclarartion= ruleEventDeclarartion EOF ;
    public final EObject entryRuleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclarartion = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1422:2: (iv_ruleEventDeclarartion= ruleEventDeclarartion EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1423:2: iv_ruleEventDeclarartion= ruleEventDeclarartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarartionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3081);
            iv_ruleEventDeclarartion=ruleEventDeclarartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclarartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclarartion3091); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1430:1: ruleEventDeclarartion returns [EObject current=null] : this_EventDefinition_0= ruleEventDefinition ;
    public final EObject ruleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject this_EventDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1433:28: (this_EventDefinition_0= ruleEventDefinition )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1435:5: this_EventDefinition_0= ruleEventDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEventDeclarartionAccess().getEventDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3137);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1453:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1454:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1455:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3173);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDefinition3183); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1462:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1465:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1466:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1466:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1466:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1466:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=65 && LA22_0<=67)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1467:1: (lv_direction_0_0= ruleDirection )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1467:1: (lv_direction_0_0= ruleDirection )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1468:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_ruleEventDefinition3229);
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

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleEventDefinition3242); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1488:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1489:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1489:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1490:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventDefinition3259); if (state.failed) return current;
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1506:2: (otherlv_3= ':' ( ( ruleFQN ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==15) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1506:4: otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleEventDefinition3277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1510:1: ( ( ruleFQN ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1511:1: ( ruleFQN )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1511:1: ( ruleFQN )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1512:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getTypeTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEventDefinition3300);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1533:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1534:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1535:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3338);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration3348); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1542:1: ruleVariableDeclaration returns [EObject current=null] : this_VariableDefinition_0= ruleVariableDefinition ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1545:28: (this_VariableDefinition_0= ruleVariableDefinition )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1547:5: this_VariableDefinition_0= ruleVariableDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration3394);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1565:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1566:2: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1567:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration3430);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDeclaration3440); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1574:1: ruleOperationDeclaration returns [EObject current=null] : this_OperationDefinition_0= ruleOperationDefinition ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1577:28: (this_OperationDefinition_0= ruleOperationDefinition )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1579:5: this_OperationDefinition_0= ruleOperationDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOperationDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration3486);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1597:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1598:2: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1599:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition3522);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDefinition3532); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1606:1: ruleOperationDefinition returns [EObject current=null] : ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1609:28: ( ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1610:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1610:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1610:2: () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1610:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1611:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationDefinitionAccess().getOperationDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleOperationDefinition3578); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionAccess().getOperationKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1620:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1621:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1621:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1622:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperationDefinition3595); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleOperationDefinition3612); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1642:1: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1642:2: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1642:2: ( (lv_parameters_4_0= ruleParameter ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1643:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1643:1: (lv_parameters_4_0= ruleParameter )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1644:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition3634);
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

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1660:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==16) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1660:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleOperationDefinition3647); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getOperationDefinitionAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1664:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1665:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1665:1: (lv_parameters_6_0= ruleParameter )
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1666:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition3668);
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
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleOperationDefinition3684); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1686:1: (otherlv_8= ':' ( ( ruleFQN ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==15) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1686:3: otherlv_8= ':' ( ( ruleFQN ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleOperationDefinition3697); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getOperationDefinitionAccess().getColonKeyword_6_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1690:1: ( ( ruleFQN ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1691:1: ( ruleFQN )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1691:1: ( ruleFQN )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1692:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getTypeTypeCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition3720);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1713:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1714:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1715:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3758);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3768); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1722:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1725:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1726:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1726:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1726:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1726:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1727:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1727:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1728:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter3810); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleParameter3827); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1748:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1749:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1749:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1750:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleParameter3850);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1775:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1776:2: (iv_ruleFQN= ruleFQN EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1777:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN3891);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN3902); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1784:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1787:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1788:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1788:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1788:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3942); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1795:1: (kw= '.' this_ID_2= RULE_ID )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==36) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1796:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,36,FOLLOW_36_in_ruleFQN3961); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3976); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleLocalReaction"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1816:1: entryRuleLocalReaction returns [EObject current=null] : iv_ruleLocalReaction= ruleLocalReaction EOF ;
    public final EObject entryRuleLocalReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReaction = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1817:2: (iv_ruleLocalReaction= ruleLocalReaction EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1818:2: iv_ruleLocalReaction= ruleLocalReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction4023);
            iv_ruleLocalReaction=ruleLocalReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReaction4033); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1825:1: ruleLocalReaction returns [EObject current=null] : ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) ;
    public final EObject ruleLocalReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_trigger_0_0 = null;

        EObject lv_effect_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1828:28: ( ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1829:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1829:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1829:2: ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1829:2: ( (lv_trigger_0_0= ruleReactionTrigger ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1830:1: (lv_trigger_0_0= ruleReactionTrigger )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1830:1: (lv_trigger_0_0= ruleReactionTrigger )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1831:3: lv_trigger_0_0= ruleReactionTrigger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerReactionTriggerParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReaction4079);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1847:2: ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1847:3: ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1852:6: (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1852:8: otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) )
            {
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleLocalReaction4111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalReactionAccess().getSolidusKeyword_1_0_0());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1856:1: ( (lv_effect_2_0= ruleReactionEffect ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1857:1: (lv_effect_2_0= ruleReactionEffect )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1857:1: (lv_effect_2_0= ruleReactionEffect )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1858:3: lv_effect_2_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectReactionEffectParserRuleCall_1_0_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalReaction4132);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1882:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1883:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1884:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction4170);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionReaction4180); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1891:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1894:28: ( ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1895:1: ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1895:1: ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1895:2: () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1895:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1896:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionReactionAccess().getTransitionReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1901:2: ( (lv_trigger_1_0= ruleReactionTrigger ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID||LA28_0==37||(LA28_0>=40 && LA28_0<=45)||(LA28_0>=68 && LA28_0<=69)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1902:1: (lv_trigger_1_0= ruleReactionTrigger )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1902:1: (lv_trigger_1_0= ruleReactionTrigger )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1903:3: lv_trigger_1_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerReactionTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleTransitionReaction4235);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1919:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==22) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1919:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleTransitionReaction4249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1923:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1924:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1924:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1925:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransitionReaction4270);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1941:4: (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1941:6: otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleTransitionReaction4285); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionReactionAccess().getNumberSignKeyword_3_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1945:1: ( (lv_properties_5_0= ruleReactionProperties ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1946:1: (lv_properties_5_0= ruleReactionProperties )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1946:1: (lv_properties_5_0= ruleReactionProperties )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1947:3: lv_properties_5_0= ruleReactionProperties
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getPropertiesReactionPropertiesParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionProperties_in_ruleTransitionReaction4306);
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


    // $ANTLR start "entryRuleReactionTrigger"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1971:1: entryRuleReactionTrigger returns [EObject current=null] : iv_ruleReactionTrigger= ruleReactionTrigger EOF ;
    public final EObject entryRuleReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionTrigger = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1972:2: (iv_ruleReactionTrigger= ruleReactionTrigger EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1973:2: iv_ruleReactionTrigger= ruleReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger4344);
            iv_ruleReactionTrigger=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionTrigger4354); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1980:1: ruleReactionTrigger returns [EObject current=null] : ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ) ;
    public final EObject ruleReactionTrigger() throws RecognitionException {
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1983:28: ( ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1984:1: ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1984:1: ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1984:2: () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1984:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1985:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1990:2: ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID||(LA33_0>=40 && LA33_0<=45)||(LA33_0>=68 && LA33_0<=69)) ) {
                alt33=1;
            }
            else if ( (LA33_0==37) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1990:3: ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1990:3: ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1990:4: ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )?
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1990:4: ( (lv_triggers_1_0= ruleEventSpec ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1991:1: (lv_triggers_1_0= ruleEventSpec )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1991:1: (lv_triggers_1_0= ruleEventSpec )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1992:3: lv_triggers_1_0= ruleEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventSpec_in_ruleReactionTrigger4411);
                    lv_triggers_1_0=ruleEventSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
                      	        }
                             		add(
                             			current, 
                             			"triggers",
                              		lv_triggers_1_0, 
                              		"EventSpec");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2008:2: (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==16) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2008:4: otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleReactionTrigger4424); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getReactionTriggerAccess().getCommaKeyword_1_0_1_0());
                    	          
                    	    }
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2012:1: ( (lv_triggers_3_0= ruleEventSpec ) )
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2013:1: (lv_triggers_3_0= ruleEventSpec )
                    	    {
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2013:1: (lv_triggers_3_0= ruleEventSpec )
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2014:3: lv_triggers_3_0= ruleEventSpec
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_1_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEventSpec_in_ruleReactionTrigger4445);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2030:4: ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==37) && (synpred3_InternalSCCExp())) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2030:5: ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']'
                            {
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2030:5: ( ( '[' )=>otherlv_4= '[' )
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2030:6: ( '[' )=>otherlv_4= '['
                            {
                            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleReactionTrigger4468); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_1_0_2_0());
                                  
                            }

                            }

                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2035:2: ( (lv_guardExpression_5_0= ruleExpression ) )
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2036:1: (lv_guardExpression_5_0= ruleExpression )
                            {
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2036:1: (lv_guardExpression_5_0= ruleExpression )
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2037:3: lv_guardExpression_5_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_1_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger4490);
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

                            otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleReactionTrigger4502); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getReactionTriggerAccess().getRightSquareBracketKeyword_1_0_2_2());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2058:6: (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2058:6: (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2058:8: otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']'
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_37_in_ruleReactionTrigger4524); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_1_1_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2062:1: ( (lv_guardExpression_8_0= ruleExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2063:1: (lv_guardExpression_8_0= ruleExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2063:1: (lv_guardExpression_8_0= ruleExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2064:3: lv_guardExpression_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger4545);
                    lv_guardExpression_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReactionTriggerRule());
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

                    otherlv_9=(Token)match(input,38,FOLLOW_38_in_ruleReactionTrigger4557); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getReactionTriggerAccess().getRightSquareBracketKeyword_1_1_2());
                          
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2092:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2093:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2094:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect4595);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionEffect4605); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2101:1: ruleReactionEffect returns [EObject current=null] : ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_3_1 = null;

        EObject lv_actions_3_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2104:28: ( ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2105:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2105:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2105:2: () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2105:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2106:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2111:2: ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2112:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2112:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2113:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2113:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_STRING)||LA34_0==27||LA34_0==50||(LA34_0>=54 && LA34_0<=55)||(LA34_0>=82 && LA34_0<=83)||LA34_0==86) ) {
                alt34=1;
            }
            else if ( (LA34_0==46) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2114:3: lv_actions_1_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect4662);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2129:8: lv_actions_1_2= ruleEventRaisingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4681);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2147:2: ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==17) && (synpred4_InternalSCCExp())) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2147:3: ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2147:3: ( ( ';' )=>otherlv_2= ';' )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2147:4: ( ';' )=>otherlv_2= ';'
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleReactionEffect4705); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReactionEffectAccess().getSemicolonKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2152:2: ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2153:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2153:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2154:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2154:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_STRING)||LA35_0==27||LA35_0==50||(LA35_0>=54 && LA35_0<=55)||(LA35_0>=82 && LA35_0<=83)||LA35_0==86) ) {
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2155:3: lv_actions_3_1= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect4729);
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2170:8: lv_actions_3_2= ruleEventRaisingExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_2_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4748);
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
            	    break loop36;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2196:1: entryRuleReactionProperties returns [EObject current=null] : iv_ruleReactionProperties= ruleReactionProperties EOF ;
    public final EObject entryRuleReactionProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionProperties = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2197:2: (iv_ruleReactionProperties= ruleReactionProperties EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2198:2: iv_ruleReactionProperties= ruleReactionProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionPropertiesRule()); 
            }
            pushFollow(FOLLOW_ruleReactionProperties_in_entryRuleReactionProperties4789);
            iv_ruleReactionProperties=ruleReactionProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionProperties; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionProperties4799); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2205:1: ruleReactionProperties returns [EObject current=null] : ( () ( (lv_properties_1_0= ruleReactionProperty ) )* ) ;
    public final EObject ruleReactionProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2208:28: ( ( () ( (lv_properties_1_0= ruleReactionProperty ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2209:1: ( () ( (lv_properties_1_0= ruleReactionProperty ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2209:1: ( () ( (lv_properties_1_0= ruleReactionProperty ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2209:2: () ( (lv_properties_1_0= ruleReactionProperty ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2209:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2210:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionPropertiesAccess().getReactionPropertiesAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2215:2: ( (lv_properties_1_0= ruleReactionProperty ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID||LA37_0==39) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2216:1: (lv_properties_1_0= ruleReactionProperty )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2216:1: (lv_properties_1_0= ruleReactionProperty )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2217:3: lv_properties_1_0= ruleReactionProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReactionPropertiesAccess().getPropertiesReactionPropertyParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleReactionProperty_in_ruleReactionProperties4854);
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
            	    break loop37;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2241:1: entryRuleReactionProperty returns [EObject current=null] : iv_ruleReactionProperty= ruleReactionProperty EOF ;
    public final EObject entryRuleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionProperty = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2242:2: (iv_ruleReactionProperty= ruleReactionProperty EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2243:2: iv_ruleReactionProperty= ruleReactionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReactionProperty_in_entryRuleReactionProperty4891);
            iv_ruleReactionProperty=ruleReactionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionProperty4901); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2250:1: ruleReactionProperty returns [EObject current=null] : (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) ;
    public final EObject ruleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_EntryPointSpec_0 = null;

        EObject this_ExitPointSpec_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2253:28: ( (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2254:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2254:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_ID) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2255:5: this_EntryPointSpec_0= ruleEntryPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReactionPropertyAccess().getEntryPointSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryPointSpec_in_ruleReactionProperty4948);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2265:5: this_ExitPointSpec_1= ruleExitPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReactionPropertyAccess().getExitPointSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitPointSpec_in_ruleReactionProperty4975);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2281:1: entryRuleEntryPointSpec returns [EObject current=null] : iv_ruleEntryPointSpec= ruleEntryPointSpec EOF ;
    public final EObject entryRuleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryPointSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2282:2: (iv_ruleEntryPointSpec= ruleEntryPointSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2283:2: iv_ruleEntryPointSpec= ruleEntryPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec5010);
            iv_ruleEntryPointSpec=ruleEntryPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryPointSpec5020); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2290:1: ruleEntryPointSpec returns [EObject current=null] : (otherlv_0= '>' ( ( ruleFQN ) ) ) ;
    public final EObject ruleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2293:28: ( (otherlv_0= '>' ( ( ruleFQN ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2294:1: (otherlv_0= '>' ( ( ruleFQN ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2294:1: (otherlv_0= '>' ( ( ruleFQN ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2294:3: otherlv_0= '>' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleEntryPointSpec5057); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntryPointSpecAccess().getGreaterThanSignKeyword_0());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2298:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2299:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2299:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2300:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEntryPointSpecRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntryPointSpecAccess().getEntrypointEntrypointCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleEntryPointSpec5080);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2321:1: entryRuleExitPointSpec returns [EObject current=null] : iv_ruleExitPointSpec= ruleExitPointSpec EOF ;
    public final EObject entryRuleExitPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitPointSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2322:2: (iv_ruleExitPointSpec= ruleExitPointSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2323:2: iv_ruleExitPointSpec= ruleExitPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec5116);
            iv_ruleExitPointSpec=ruleExitPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitPointSpec5126); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2330:1: ruleExitPointSpec returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= '>' ) ;
    public final EObject ruleExitPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2333:28: ( ( ( ( ruleFQN ) ) otherlv_1= '>' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2334:1: ( ( ( ruleFQN ) ) otherlv_1= '>' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2334:1: ( ( ( ruleFQN ) ) otherlv_1= '>' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2334:2: ( ( ruleFQN ) ) otherlv_1= '>'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2334:2: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2335:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2335:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2336:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExitPointSpecRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExitPointSpecAccess().getExitpointExitpointCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleExitPointSpec5174);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleExitPointSpec5186); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2361:1: entryRuleEventSpec returns [EObject current=null] : iv_ruleEventSpec= ruleEventSpec EOF ;
    public final EObject entryRuleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2362:2: (iv_ruleEventSpec= ruleEventSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2363:2: iv_ruleEventSpec= ruleEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEventSpec_in_entryRuleEventSpec5222);
            iv_ruleEventSpec=ruleEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventSpec5232); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2370:1: ruleEventSpec returns [EObject current=null] : (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) ;
    public final EObject ruleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_RegularEventSpec_0 = null;

        EObject this_TimeEventSpec_1 = null;

        EObject this_BuiltinEventSpec_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2373:28: ( (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2374:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2374:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2375:5: this_RegularEventSpec_0= ruleRegularEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getRegularEventSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRegularEventSpec_in_ruleEventSpec5279);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2385:5: this_TimeEventSpec_1= ruleTimeEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getTimeEventSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTimeEventSpec_in_ruleEventSpec5306);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2395:5: this_BuiltinEventSpec_2= ruleBuiltinEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getBuiltinEventSpecParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBuiltinEventSpec_in_ruleEventSpec5333);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2411:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2412:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2413:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5368);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularEventSpec5378); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2420:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2423:28: ( ( (lv_event_0_0= ruleFeatureCall ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2424:1: ( (lv_event_0_0= ruleFeatureCall ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2424:1: ( (lv_event_0_0= ruleFeatureCall ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2425:1: (lv_event_0_0= ruleFeatureCall )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2425:1: (lv_event_0_0= ruleFeatureCall )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2426:3: lv_event_0_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5423);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2450:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2451:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2452:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5458);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeEventSpec5468); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2459:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_type_0_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2462:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2463:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2463:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2463:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2463:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2464:1: (lv_type_0_0= ruleTimeEventType )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2464:1: (lv_type_0_0= ruleTimeEventType )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2465:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5514);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2481:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2482:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2482:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2483:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeEventSpec5531); if (state.failed) return current;
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2499:2: ( (lv_unit_2_0= ruleTimeUnit ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=92 && LA40_0<=95)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2500:1: (lv_unit_2_0= ruleTimeUnit )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2500:1: (lv_unit_2_0= ruleTimeUnit )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2501:3: lv_unit_2_0= ruleTimeUnit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5557);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2525:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2526:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2527:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5594);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinEventSpec5604); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2534:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_OnCycleEvent_2 = null;

        EObject this_AlwaysEvent_3 = null;

        EObject this_DefaultEvent_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2537:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2538:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2538:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent )
            int alt41=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt41=1;
                }
                break;
            case 41:
                {
                alt41=2;
                }
                break;
            case 42:
                {
                alt41=3;
                }
                break;
            case 43:
                {
                alt41=4;
                }
                break;
            case 44:
            case 45:
                {
                alt41=5;
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2539:5: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5651);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2549:5: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5678);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2559:5: this_OnCycleEvent_2= ruleOnCycleEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getOnCycleEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOnCycleEvent_in_ruleBuiltinEventSpec5705);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2569:5: this_AlwaysEvent_3= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec5732);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2579:5: this_DefaultEvent_4= ruleDefaultEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getDefaultEventParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultEvent_in_ruleBuiltinEventSpec5759);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2595:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2596:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2597:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent5794);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryEvent5804); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2604:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2607:28: ( ( () otherlv_1= 'entry' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2608:1: ( () otherlv_1= 'entry' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2608:1: ( () otherlv_1= 'entry' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2608:2: () otherlv_1= 'entry'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2608:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2609:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryEventAccess().getEntryEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleEntryEvent5850); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2626:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2627:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2628:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent5886);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent5896); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2635:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2638:28: ( ( () otherlv_1= 'exit' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2639:1: ( () otherlv_1= 'exit' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2639:1: ( () otherlv_1= 'exit' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2639:2: () otherlv_1= 'exit'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2639:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2640:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitEventAccess().getExitEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleExitEvent5942); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2657:1: entryRuleOnCycleEvent returns [EObject current=null] : iv_ruleOnCycleEvent= ruleOnCycleEvent EOF ;
    public final EObject entryRuleOnCycleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnCycleEvent = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2658:2: (iv_ruleOnCycleEvent= ruleOnCycleEvent EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2659:2: iv_ruleOnCycleEvent= ruleOnCycleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOnCycleEventRule()); 
            }
            pushFollow(FOLLOW_ruleOnCycleEvent_in_entryRuleOnCycleEvent5978);
            iv_ruleOnCycleEvent=ruleOnCycleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOnCycleEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnCycleEvent5988); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2666:1: ruleOnCycleEvent returns [EObject current=null] : ( () otherlv_1= 'oncycle' ) ;
    public final EObject ruleOnCycleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2669:28: ( ( () otherlv_1= 'oncycle' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2670:1: ( () otherlv_1= 'oncycle' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2670:1: ( () otherlv_1= 'oncycle' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2670:2: () otherlv_1= 'oncycle'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2670:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2671:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOnCycleEventAccess().getOnCycleEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleOnCycleEvent6034); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2688:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2689:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2690:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent6070);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEvent6080); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2697:1: ruleAlwaysEvent returns [EObject current=null] : ( () otherlv_1= 'always' ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2700:28: ( ( () otherlv_1= 'always' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2701:1: ( () otherlv_1= 'always' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2701:1: ( () otherlv_1= 'always' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2701:2: () otherlv_1= 'always'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2701:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2702:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlwaysEventAccess().getAlwaysEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleAlwaysEvent6126); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2719:1: entryRuleDefaultEvent returns [EObject current=null] : iv_ruleDefaultEvent= ruleDefaultEvent EOF ;
    public final EObject entryRuleDefaultEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultEvent = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2720:2: (iv_ruleDefaultEvent= ruleDefaultEvent EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2721:2: iv_ruleDefaultEvent= ruleDefaultEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultEventRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultEvent_in_entryRuleDefaultEvent6162);
            iv_ruleDefaultEvent=ruleDefaultEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultEvent6172); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2728:1: ruleDefaultEvent returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2731:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2732:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2732:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2732:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2732:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2733:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultEventAccess().getDefaultEventAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2738:2: (otherlv_1= 'default' | otherlv_2= 'else' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            else if ( (LA42_0==45) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2738:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleDefaultEvent6219); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultEventAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2743:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleDefaultEvent6237); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2755:1: entryRuleEventRaisingExpression returns [EObject current=null] : iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF ;
    public final EObject entryRuleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventRaisingExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2756:2: (iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2757:2: iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRaisingExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventRaisingExpression_in_entryRuleEventRaisingExpression6274);
            iv_ruleEventRaisingExpression=ruleEventRaisingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventRaisingExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventRaisingExpression6284); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2764:1: ruleEventRaisingExpression returns [EObject current=null] : ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_event_2_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2767:28: ( ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2768:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2768:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2768:2: () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2768:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2769:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventRaisingExpressionAccess().getEventRaisingExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleEventRaisingExpression6330); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventRaisingExpressionAccess().getRaiseKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2778:1: ( (lv_event_2_0= ruleFeatureCall ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2779:1: (lv_event_2_0= ruleFeatureCall )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2779:1: (lv_event_2_0= ruleFeatureCall )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2780:3: lv_event_2_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getEventFeatureCallParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventRaisingExpression6351);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2796:2: (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==15) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2796:4: otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleEventRaisingExpression6364); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventRaisingExpressionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2800:1: ( (lv_value_4_0= ruleExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2801:1: (lv_value_4_0= ruleExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2801:1: (lv_value_4_0= ruleExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2802:3: lv_value_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getValueExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleEventRaisingExpression6385);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2828:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2829:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2830:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6425);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6435); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2837:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2840:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2842:5: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpression6481);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2858:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2859:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2860:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6515);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression6525); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2867:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2870:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2871:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2871:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2872:5: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6572);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2880:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==19||(LA44_0>=70 && LA44_0<=79)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2880:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2880:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2881:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2886:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2887:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2887:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2888:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6602);
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

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2904:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2905:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2905:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2906:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6623);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2930:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2931:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2932:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6661);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression6671); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2939:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2942:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2943:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2943:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2944:5: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6718);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2952:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==47) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2952:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2952:2: ()
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2953:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleConditionalExpression6739); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2962:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2963:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2963:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2964:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6760);
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

                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleConditionalExpression6772); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2984:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2985:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2985:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2986:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6793);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3010:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3011:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3012:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6831);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression6841); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3019:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3022:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3023:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3023:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3024:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6888);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3032:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==48) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3032:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3032:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3033:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleLogicalOrExpression6909); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3042:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3043:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3043:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3044:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6930);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3068:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3069:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3070:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6968);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression6978); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3077:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3080:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3081:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3081:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3082:5: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7025);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3090:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==49) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3090:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3090:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3091:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleLogicalAndExpression7046); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3100:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3101:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3101:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3102:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7067);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3126:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3127:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3128:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression7105);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNotExpression7115); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3135:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3138:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3139:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3139:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_STRING)||LA48_0==27||(LA48_0>=54 && LA48_0<=55)||(LA48_0>=82 && LA48_0<=83)||LA48_0==86) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3140:5: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7162);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3149:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3149:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3149:7: () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3149:7: ()
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3150:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalNotExpressionAccess().getLogicalNotExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleLogicalNotExpression7189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLogicalNotExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3159:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3160:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3160:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3161:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7210);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3185:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3186:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3187:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7247);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression7257); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3194:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3197:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3198:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3198:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3199:5: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7304);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3207:1: ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==51) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3207:2: () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3207:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3208:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleBitwiseXorExpression7325); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3217:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3218:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3218:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3219:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7346);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3243:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3244:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3245:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7384);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression7394); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3252:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3255:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3256:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3256:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3257:5: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7441);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3265:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==52) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3265:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3265:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3266:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleBitwiseOrExpression7462); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3275:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3276:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3276:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3277:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7483);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3301:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3302:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3303:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7521);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression7531); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3310:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3313:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3314:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3314:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3315:5: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7578);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3323:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==53) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3323:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3323:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3324:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleBitwiseAndExpression7599); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3333:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3334:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3334:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3335:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7620);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3359:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3360:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3361:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7658);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalRelationExpression7668); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3368:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3371:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3372:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3372:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3373:5: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7715);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3381:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==39||(LA52_0>=87 && LA52_0<=91)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3381:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3381:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3382:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3387:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3388:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3388:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3389:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7745);
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

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3405:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3406:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3406:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3407:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7766);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3431:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3432:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3433:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7804);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression7814); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3440:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3443:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3444:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3444:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3445:5: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7861);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3453:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=80 && LA53_0<=81)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3453:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3453:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3454:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3459:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3460:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3460:1: (lv_operator_2_0= ruleShiftOperator )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3461:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression7891);
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

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3477:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3478:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3478:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3479:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7912);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3503:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3504:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3505:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7950);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7960); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3512:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3515:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3516:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3516:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3517:5: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8007);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3525:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=82 && LA54_0<=83)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3525:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3525:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3526:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3531:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3532:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3532:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3533:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression8037);
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

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3549:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3550:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3550:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3551:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8058);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3575:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3576:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3577:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression8096);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression8106); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3584:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3587:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3588:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3588:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3589:5: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8153);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3597:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==22||(LA55_0>=84 && LA55_0<=85)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3597:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3597:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3598:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3603:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3604:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3604:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3605:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8183);
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

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3621:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3622:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3622:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3623:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8204);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3647:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3648:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3649:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8242);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8252); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3656:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3659:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3660:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3660:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_ID && LA56_0<=RULE_STRING)||LA56_0==27||(LA56_0>=54 && LA56_0<=55)) ) {
                alt56=1;
            }
            else if ( ((LA56_0>=82 && LA56_0<=83)||LA56_0==86) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3661:5: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8299);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3670:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3670:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3670:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3670:7: ()
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3671:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumericalUnaryExpressionAccess().getNumericalUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3676:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3677:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3677:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3678:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8335);
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

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3694:2: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3695:1: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3695:1: (lv_operand_3_0= rulePrimaryExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3696:3: lv_operand_3_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8356);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3720:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3721:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3722:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression8393);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression8403); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3729:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3732:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3733:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3733:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            int alt57=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_HEX:
            case RULE_STRING:
                {
                alt57=1;
                }
                break;
            case RULE_ID:
                {
                alt57=2;
                }
                break;
            case 55:
                {
                alt57=3;
                }
                break;
            case 54:
                {
                alt57=4;
                }
                break;
            case 27:
                {
                alt57=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3734:5: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrimitiveValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression8450);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3744:5: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression8477);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3754:5: this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getActiveStateReferenceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression8504);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3764:5: this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEventValueReferenceExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression8531);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3773:6: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3773:6: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3773:8: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_rulePrimaryExpression8549); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression8571);
                    this_Expression_5=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_rulePrimaryExpression8582); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3798:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3799:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3800:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8619);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValueExpression8629); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3807:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3810:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3811:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3811:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3811:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3811:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3812:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveValueExpressionAccess().getPrimitiveValueExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3817:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3818:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3818:1: (lv_value_1_0= ruleLiteral )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3819:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8684);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3843:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3844:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3845:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8720);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall8730); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3852:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3855:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3856:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3856:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3857:5: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8777);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3865:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==36) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3865:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3865:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3866:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleFeatureCall8798); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3875:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3876:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3876:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3877:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureCall8818); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3888:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==27) && (synpred5_InternalSCCExp())) {
            	        alt60=1;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3888:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3888:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3888:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3895:1: (lv_operationCall_4_0= '(' )
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3896:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,27,FOLLOW_27_in_ruleFeatureCall8852); if (state.failed) return current;
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

            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3909:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt59=2;
            	            int LA59_0 = input.LA(1);

            	            if ( ((LA59_0>=RULE_ID && LA59_0<=RULE_STRING)||LA59_0==27||LA59_0==50||(LA59_0>=54 && LA59_0<=55)||(LA59_0>=82 && LA59_0<=83)||LA59_0==86) ) {
            	                alt59=1;
            	            }
            	            switch (alt59) {
            	                case 1 :
            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3909:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3909:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3910:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3910:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3911:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8887);
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

            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3927:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop58:
            	                    do {
            	                        int alt58=2;
            	                        int LA58_0 = input.LA(1);

            	                        if ( (LA58_0==16) ) {
            	                            alt58=1;
            	                        }


            	                        switch (alt58) {
            	                    	case 1 :
            	                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3927:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleFeatureCall8900); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3931:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3932:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3932:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3933:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8921);
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
            	                    	    break loop58;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleFeatureCall8937); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getFeatureCallAccess().getRightParenthesisKeyword_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3961:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3962:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3963:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8977);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementReferenceExpression8987); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3970:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3973:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3974:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3974:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3974:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3974:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3975:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementReferenceExpressionAccess().getElementReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3980:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3981:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3981:1: (otherlv_1= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3982:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementReferenceExpression9041); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3993:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==27) && (synpred6_InternalSCCExp())) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3993:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3993:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3993:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4000:1: (lv_operationCall_2_0= '(' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4001:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,27,FOLLOW_27_in_ruleElementReferenceExpression9075); if (state.failed) return current;
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

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4014:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( ((LA63_0>=RULE_ID && LA63_0<=RULE_STRING)||LA63_0==27||LA63_0==50||(LA63_0>=54 && LA63_0<=55)||(LA63_0>=82 && LA63_0<=83)||LA63_0==86) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4014:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4014:3: ( (lv_args_3_0= ruleExpression ) )
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4015:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4015:1: (lv_args_3_0= ruleExpression )
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4016:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression9110);
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

                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4032:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop62:
                            do {
                                int alt62=2;
                                int LA62_0 = input.LA(1);

                                if ( (LA62_0==16) ) {
                                    alt62=1;
                                }


                                switch (alt62) {
                            	case 1 :
                            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4032:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleElementReferenceExpression9123); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4036:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4037:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4037:1: (lv_args_5_0= ruleExpression )
                            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4038:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression9144);
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
                            	    break loop62;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleElementReferenceExpression9160); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4066:1: entryRuleEventValueReferenceExpression returns [EObject current=null] : iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF ;
    public final EObject entryRuleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventValueReferenceExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4067:2: (iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4068:2: iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventValueReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression9198);
            iv_ruleEventValueReferenceExpression=ruleEventValueReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventValueReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventValueReferenceExpression9208); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4075:1: ruleEventValueReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject ruleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4078:28: ( ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4079:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4079:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4079:2: () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4079:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4080:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventValueReferenceExpressionAccess().getEventValueReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleEventValueReferenceExpression9254); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventValueReferenceExpressionAccess().getValueofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleEventValueReferenceExpression9266); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventValueReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4093:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4094:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4094:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4095:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventValueReferenceExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression9287);
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleEventValueReferenceExpression9299); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4123:1: entryRuleActiveStateReferenceExpression returns [EObject current=null] : iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF ;
    public final EObject entryRuleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveStateReferenceExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4124:2: (iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4125:2: iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveStateReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression9335);
            iv_ruleActiveStateReferenceExpression=ruleActiveStateReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveStateReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression9345); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4132:1: ruleActiveStateReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4135:28: ( ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4136:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4136:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4136:2: () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4136:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4137:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActiveStateReferenceExpressionAccess().getActiveStateReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleActiveStateReferenceExpression9391); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActiveStateReferenceExpressionAccess().getActiveKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleActiveStateReferenceExpression9403); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActiveStateReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4150:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4151:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4151:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4152:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActiveStateReferenceExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActiveStateReferenceExpressionAccess().getValueStateCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9426);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleActiveStateReferenceExpression9438); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4177:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4178:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4179:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral9474);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral9484); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4186:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_RealLiteral_3 = null;

        EObject this_StringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4189:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4190:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4190:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            int alt65=5;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt65=1;
                }
                break;
            case RULE_INT:
                {
                alt65=2;
                }
                break;
            case RULE_HEX:
                {
                alt65=3;
                }
                break;
            case RULE_FLOAT:
                {
                alt65=4;
                }
                break;
            case RULE_STRING:
                {
                alt65=5;
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4191:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral9531);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4201:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral9558);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4211:5: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexLiteral_in_ruleLiteral9585);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4221:5: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleLiteral9612);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4231:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral9639);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4247:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4248:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4249:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9674);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral9684); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4256:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4259:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4260:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4260:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4260:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4260:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4261:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4266:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4267:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4267:1: (lv_value_1_0= RULE_BOOL )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4268:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral9735); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4292:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4293:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4294:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9776);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral9786); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4301:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4304:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4305:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4305:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4305:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4305:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4306:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4311:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4312:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4312:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4313:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral9837); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4337:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4338:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4339:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9878);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral9888); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4346:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4349:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4350:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4350:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4350:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4350:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4351:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4356:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4357:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4357:1: (lv_value_1_0= RULE_FLOAT )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4358:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleRealLiteral9939); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4382:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4383:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4384:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9980);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexLiteral9990); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4391:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4394:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4395:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4395:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4395:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4395:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4396:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHexLiteralAccess().getHexLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4401:2: ( (lv_value_1_0= RULE_HEX ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4402:1: (lv_value_1_0= RULE_HEX )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4402:1: (lv_value_1_0= RULE_HEX )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4403:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleHexLiteral10041); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4427:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4428:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4429:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral10082);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral10092); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4436:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4439:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4440:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4440:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4440:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4440:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4441:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4446:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4447:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4447:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4448:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral10143); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4472:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4474:28: ( ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4475:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4475:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            int alt66=8;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt66=1;
                }
                break;
            case 57:
                {
                alt66=2;
                }
                break;
            case 58:
                {
                alt66=3;
                }
                break;
            case 59:
                {
                alt66=4;
                }
                break;
            case 60:
                {
                alt66=5;
                }
                break;
            case 61:
                {
                alt66=6;
                }
                break;
            case 62:
                {
                alt66=7;
                }
                break;
            case 63:
                {
                alt66=8;
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4475:2: (enumLiteral_0= '\\'none\\'' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4475:2: (enumLiteral_0= '\\'none\\'' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4475:4: enumLiteral_0= '\\'none\\''
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleCombineOperator10198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4481:6: (enumLiteral_1= '\\'+\\'' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4481:6: (enumLiteral_1= '\\'+\\'' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4481:8: enumLiteral_1= '\\'+\\''
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_57_in_ruleCombineOperator10215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4487:6: (enumLiteral_2= '\\'*\\'' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4487:6: (enumLiteral_2= '\\'*\\'' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4487:8: enumLiteral_2= '\\'*\\''
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_58_in_ruleCombineOperator10232); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4493:6: (enumLiteral_3= '\\'max\\'' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4493:6: (enumLiteral_3= '\\'max\\'' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4493:8: enumLiteral_3= '\\'max\\''
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_59_in_ruleCombineOperator10249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4499:6: (enumLiteral_4= '\\'min\\'' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4499:6: (enumLiteral_4= '\\'min\\'' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4499:8: enumLiteral_4= '\\'min\\''
                    {
                    enumLiteral_4=(Token)match(input,60,FOLLOW_60_in_ruleCombineOperator10266); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4505:6: (enumLiteral_5= '\\'or\\'' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4505:6: (enumLiteral_5= '\\'or\\'' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4505:8: enumLiteral_5= '\\'or\\''
                    {
                    enumLiteral_5=(Token)match(input,61,FOLLOW_61_in_ruleCombineOperator10283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4511:6: (enumLiteral_6= '\\'and\\'' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4511:6: (enumLiteral_6= '\\'and\\'' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4511:8: enumLiteral_6= '\\'and\\''
                    {
                    enumLiteral_6=(Token)match(input,62,FOLLOW_62_in_ruleCombineOperator10300); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4517:6: (enumLiteral_7= '\\'host\\'' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4517:6: (enumLiteral_7= '\\'host\\'' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4517:8: enumLiteral_7= '\\'host\\''
                    {
                    enumLiteral_7=(Token)match(input,63,FOLLOW_63_in_ruleCombineOperator10317); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4527:1: ruleVarDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'inout' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleVarDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4529:28: ( ( (enumLiteral_0= 'inout' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4530:1: ( (enumLiteral_0= 'inout' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4530:1: ( (enumLiteral_0= 'inout' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt67=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt67=1;
                }
                break;
            case 65:
                {
                alt67=2;
                }
                break;
            case 66:
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4530:2: (enumLiteral_0= 'inout' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4530:2: (enumLiteral_0= 'inout' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4530:4: enumLiteral_0= 'inout'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_64_in_ruleVarDirection10362); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVarDirectionAccess().getINOUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVarDirectionAccess().getINOUTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4536:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4536:6: (enumLiteral_1= 'in' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4536:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_65_in_ruleVarDirection10379); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVarDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getVarDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4542:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4542:6: (enumLiteral_2= 'out' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4542:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_66_in_ruleVarDirection10396); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4552:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4554:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4555:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4555:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt68=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt68=1;
                }
                break;
            case 65:
                {
                alt68=2;
                }
                break;
            case 66:
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4555:2: (enumLiteral_0= 'local' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4555:2: (enumLiteral_0= 'local' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4555:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_67_in_ruleDirection10441); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4561:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4561:6: (enumLiteral_1= 'in' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4561:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_65_in_ruleDirection10458); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4567:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4567:6: (enumLiteral_2= 'out' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4567:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_66_in_ruleDirection10475); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4577:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4579:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4580:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4580:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==68) ) {
                alt69=1;
            }
            else if ( (LA69_0==69) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4580:2: (enumLiteral_0= 'after' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4580:2: (enumLiteral_0= 'after' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4580:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_68_in_ruleTimeEventType10520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4586:6: (enumLiteral_1= 'every' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4586:6: (enumLiteral_1= 'every' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4586:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_69_in_ruleTimeEventType10537); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4596:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4598:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4599:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4599:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            int alt70=11;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt70=1;
                }
                break;
            case 70:
                {
                alt70=2;
                }
                break;
            case 71:
                {
                alt70=3;
                }
                break;
            case 72:
                {
                alt70=4;
                }
                break;
            case 73:
                {
                alt70=5;
                }
                break;
            case 74:
                {
                alt70=6;
                }
                break;
            case 75:
                {
                alt70=7;
                }
                break;
            case 76:
                {
                alt70=8;
                }
                break;
            case 77:
                {
                alt70=9;
                }
                break;
            case 78:
                {
                alt70=10;
                }
                break;
            case 79:
                {
                alt70=11;
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4599:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4599:2: (enumLiteral_0= '=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4599:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_19_in_ruleAssignmentOperator10582); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4605:6: (enumLiteral_1= '*=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4605:6: (enumLiteral_1= '*=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4605:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_70_in_ruleAssignmentOperator10599); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4611:6: (enumLiteral_2= '/=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4611:6: (enumLiteral_2= '/=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4611:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_71_in_ruleAssignmentOperator10616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4617:6: (enumLiteral_3= '%=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4617:6: (enumLiteral_3= '%=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4617:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_72_in_ruleAssignmentOperator10633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4623:6: (enumLiteral_4= '+=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4623:6: (enumLiteral_4= '+=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4623:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,73,FOLLOW_73_in_ruleAssignmentOperator10650); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4629:6: (enumLiteral_5= '-=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4629:6: (enumLiteral_5= '-=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4629:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,74,FOLLOW_74_in_ruleAssignmentOperator10667); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4635:6: (enumLiteral_6= '<<=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4635:6: (enumLiteral_6= '<<=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4635:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,75,FOLLOW_75_in_ruleAssignmentOperator10684); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4641:6: (enumLiteral_7= '>>=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4641:6: (enumLiteral_7= '>>=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4641:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,76,FOLLOW_76_in_ruleAssignmentOperator10701); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4647:6: (enumLiteral_8= '&=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4647:6: (enumLiteral_8= '&=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4647:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,77,FOLLOW_77_in_ruleAssignmentOperator10718); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4653:6: (enumLiteral_9= '^=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4653:6: (enumLiteral_9= '^=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4653:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,78,FOLLOW_78_in_ruleAssignmentOperator10735); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4659:6: (enumLiteral_10= '|=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4659:6: (enumLiteral_10= '|=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4659:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,79,FOLLOW_79_in_ruleAssignmentOperator10752); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4669:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4671:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4672:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4672:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==80) ) {
                alt71=1;
            }
            else if ( (LA71_0==81) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4672:2: (enumLiteral_0= '<<' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4672:2: (enumLiteral_0= '<<' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4672:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_80_in_ruleShiftOperator10797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4678:6: (enumLiteral_1= '>>' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4678:6: (enumLiteral_1= '>>' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4678:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_81_in_ruleShiftOperator10814); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4688:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4690:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4691:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4691:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==82) ) {
                alt72=1;
            }
            else if ( (LA72_0==83) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4691:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4691:2: (enumLiteral_0= '+' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4691:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_82_in_ruleAdditiveOperator10859); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4697:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4697:6: (enumLiteral_1= '-' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4697:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_83_in_ruleAdditiveOperator10876); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4707:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4709:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4710:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4710:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt73=3;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt73=1;
                }
                break;
            case 22:
                {
                alt73=2;
                }
                break;
            case 85:
                {
                alt73=3;
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4710:2: (enumLiteral_0= '*' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4710:2: (enumLiteral_0= '*' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4710:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,84,FOLLOW_84_in_ruleMultiplicativeOperator10921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4716:6: (enumLiteral_1= '/' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4716:6: (enumLiteral_1= '/' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4716:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_22_in_ruleMultiplicativeOperator10938); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4722:6: (enumLiteral_2= '%' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4722:6: (enumLiteral_2= '%' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4722:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_85_in_ruleMultiplicativeOperator10955); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4732:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4734:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4735:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4735:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            int alt74=3;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt74=1;
                }
                break;
            case 83:
                {
                alt74=2;
                }
                break;
            case 86:
                {
                alt74=3;
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4735:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4735:2: (enumLiteral_0= '+' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4735:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_82_in_ruleUnaryOperator11000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4741:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4741:6: (enumLiteral_1= '-' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4741:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_83_in_ruleUnaryOperator11017); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4747:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4747:6: (enumLiteral_2= '~' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4747:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,86,FOLLOW_86_in_ruleUnaryOperator11034); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4757:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4759:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4760:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4760:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt75=6;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt75=1;
                }
                break;
            case 88:
                {
                alt75=2;
                }
                break;
            case 39:
                {
                alt75=3;
                }
                break;
            case 89:
                {
                alt75=4;
                }
                break;
            case 90:
                {
                alt75=5;
                }
                break;
            case 91:
                {
                alt75=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4760:2: (enumLiteral_0= '<' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4760:2: (enumLiteral_0= '<' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4760:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_87_in_ruleRelationalOperator11079); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4766:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4766:6: (enumLiteral_1= '<=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4766:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_88_in_ruleRelationalOperator11096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4772:6: (enumLiteral_2= '>' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4772:6: (enumLiteral_2= '>' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4772:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_39_in_ruleRelationalOperator11113); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4778:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4778:6: (enumLiteral_3= '>=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4778:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,89,FOLLOW_89_in_ruleRelationalOperator11130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4784:6: (enumLiteral_4= '==' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4784:6: (enumLiteral_4= '==' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4784:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,90,FOLLOW_90_in_ruleRelationalOperator11147); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4790:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4790:6: (enumLiteral_5= '!=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4790:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,91,FOLLOW_91_in_ruleRelationalOperator11164); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4800:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4802:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4803:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4803:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            int alt76=4;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt76=1;
                }
                break;
            case 93:
                {
                alt76=2;
                }
                break;
            case 94:
                {
                alt76=3;
                }
                break;
            case 95:
                {
                alt76=4;
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4803:2: (enumLiteral_0= 's' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4803:2: (enumLiteral_0= 's' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4803:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_92_in_ruleTimeUnit11209); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4809:6: (enumLiteral_1= 'ms' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4809:6: (enumLiteral_1= 'ms' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4809:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_93_in_ruleTimeUnit11226); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4815:6: (enumLiteral_2= 'us' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4815:6: (enumLiteral_2= 'us' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4815:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,94,FOLLOW_94_in_ruleTimeUnit11243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4821:6: (enumLiteral_3= 'ns' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4821:6: (enumLiteral_3= 'ns' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4821:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,95,FOLLOW_95_in_ruleTimeUnit11260); if (state.failed) return current;
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
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:938:4: ( ';' )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:938:6: ';'
        {
        match(input,17,FOLLOW_17_in_synpred1_InternalSCCExp1988); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSCCExp

    // $ANTLR start synpred3_InternalSCCExp
    public final void synpred3_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2030:6: ( '[' )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2030:8: '['
        {
        match(input,37,FOLLOW_37_in_synpred3_InternalSCCExp4460); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalSCCExp

    // $ANTLR start synpred4_InternalSCCExp
    public final void synpred4_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2147:4: ( ';' )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2147:6: ';'
        {
        match(input,17,FOLLOW_17_in_synpred4_InternalSCCExp4697); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalSCCExp

    // $ANTLR start synpred5_InternalSCCExp
    public final void synpred5_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3888:4: ( ( '(' ) )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3889:1: ( '(' )
        {
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3889:1: ( '(' )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3890:2: '('
        {
        match(input,27,FOLLOW_27_in_synpred5_InternalSCCExp8834); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalSCCExp

    // $ANTLR start synpred6_InternalSCCExp
    public final void synpred6_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3993:4: ( ( '(' ) )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3994:1: ( '(' )
        {
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3994:1: ( '(' )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3995:2: '('
        {
        match(input,27,FOLLOW_27_in_synpred6_InternalSCCExp9057); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalSCCExp

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
    public final boolean synpred6_InternalSCCExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalSCCExp_fragment(); // can never throw exception
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


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\21\uffff";
    static final String DFA15_eofS =
        "\2\2\17\uffff";
    static final String DFA15_minS =
        "\1\21\1\4\17\uffff";
    static final String DFA15_maxS =
        "\1\21\1\126\17\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\16\1";
    static final String DFA15_specialS =
        "\1\uffff\1\0\17\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1",
            "\1\10\1\4\1\3\1\6\1\5\1\7\4\uffff\1\2\6\uffff\1\2\1\uffff"+
            "\3\2\1\uffff\1\13\22\uffff\1\20\3\uffff\1\17\3\uffff\1\12\1"+
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

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "()* loopback of 938:2: ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_1==EOF||LA15_1==14||LA15_1==21||(LA15_1>=23 && LA15_1<=25)) ) {s = 2;}

                        else if ( (LA15_1==RULE_BOOL) && (synpred1_InternalSCCExp())) {s = 3;}

                        else if ( (LA15_1==RULE_INT) && (synpred1_InternalSCCExp())) {s = 4;}

                        else if ( (LA15_1==RULE_HEX) && (synpred1_InternalSCCExp())) {s = 5;}

                        else if ( (LA15_1==RULE_FLOAT) && (synpred1_InternalSCCExp())) {s = 6;}

                        else if ( (LA15_1==RULE_STRING) && (synpred1_InternalSCCExp())) {s = 7;}

                        else if ( (LA15_1==RULE_ID) && (synpred1_InternalSCCExp())) {s = 8;}

                        else if ( (LA15_1==55) && (synpred1_InternalSCCExp())) {s = 9;}

                        else if ( (LA15_1==54) && (synpred1_InternalSCCExp())) {s = 10;}

                        else if ( (LA15_1==27) && (synpred1_InternalSCCExp())) {s = 11;}

                        else if ( (LA15_1==82) && (synpred1_InternalSCCExp())) {s = 12;}

                        else if ( (LA15_1==83) && (synpred1_InternalSCCExp())) {s = 13;}

                        else if ( (LA15_1==86) && (synpred1_InternalSCCExp())) {s = 14;}

                        else if ( (LA15_1==50) && (synpred1_InternalSCCExp())) {s = 15;}

                        else if ( (LA15_1==46) && (synpred1_InternalSCCExp())) {s = 16;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
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
    public static final BitSet FOLLOW_15_in_ruleInterfaceScope353 = new BitSet(new long[]{0x0000000800040000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleInterfaceScope374 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleInterfaceScope387 = new BitSet(new long[]{0x0000000800040000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleInterfaceScope408 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleInterfaceScope422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleDeclaration515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleDeclaration542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDirection_in_ruleVariableDefinition633 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDefinition652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDefinition682 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVariableDefinition699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleVariableDefinition722 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_19_in_ruleVariableDefinition735 = new BitSet(new long[]{0x00C40000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDefinition756 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleVariableDefinition771 = new BitSet(new long[]{0xFF00000000000000L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleVariableDefinition792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionScope_in_entryRuleReactionScope830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionScope840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryAction_in_ruleReactionScope887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsideAction_in_ruleReactionScope906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitAction_in_ruleReactionScope925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspend_in_ruleReactionScope944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitAction_in_entryRuleExitAction982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitAction992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleExitAction1038 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExitAction1050 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleExitAction1062 = new BitSet(new long[]{0x00C44000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleExitAction1083 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleExitAction1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsideAction_in_entryRuleInsideAction1131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsideAction1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleInsideAction1187 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInsideAction1199 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleInsideAction1211 = new BitSet(new long[]{0x00C44000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleInsideAction1232 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInsideAction1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryAction_in_entryRuleEntryAction1280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryAction1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleEntryAction1336 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEntryAction1348 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEntryAction1360 = new BitSet(new long[]{0x00C44000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleEntryAction1381 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEntryAction1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspend_in_entryRuleSuspend1429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuspend1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSuspend1485 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSuspend1497 = new BitSet(new long[]{0x000000000C000020L});
    public static final BitSet FOLLOW_ruleTrigger_in_ruleSuspend1518 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSuspend1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition1568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrigger_in_ruleTransition1633 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleTransition1647 = new BitSet(new long[]{0x00C44000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleTransition1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrigger_in_entryRuleTrigger1706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrigger1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTrigger1768 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTrigger1799 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTrigger1817 = new BitSet(new long[]{0x00C40000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTrigger1838 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTrigger1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect1886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEffect1953 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleEffect1972 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleEffect1996 = new BitSet(new long[]{0x00C44000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEffect2020 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleEffect2039 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleDefRoot_in_entryRuleDefRoot2082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRoot2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_ruleDefRoot2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_ruleDefRoot2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_ruleDefRoot2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot2228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartRoot2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleStatechartRoot2275 = new BitSet(new long[]{0x0000000300004000L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_entryRuleStateRoot2332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateRoot2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleStateRoot2379 = new BitSet(new long[]{0x0000000003A04000L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleStateRoot2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot2436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionRoot2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTransitionRoot2483 = new BitSet(new long[]{0x00003F2004400010L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification2542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartSpecification2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleStatechartSpecification2599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleStatechartSpecification2620 = new BitSet(new long[]{0x0000000200004002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification2643 = new BitSet(new long[]{0x0000000200004002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification2680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope2772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartScope2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStatechartScope2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_ruleStatechartScope2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_entryRuleInternalScope2893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalScope2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleInternalScope2949 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInternalScope2961 = new BitSet(new long[]{0x00003F2C00040012L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInternalScope2984 = new BitSet(new long[]{0x00003F2C00040012L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3003 = new BitSet(new long[]{0x00003F2C00040012L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3022 = new BitSet(new long[]{0x00003F2C00040012L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleInternalScope3041 = new BitSet(new long[]{0x00003F2C00040012L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclarartion3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDefinition3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleEventDefinition3229 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEventDefinition3242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventDefinition3259 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleEventDefinition3277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEventDefinition3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration3430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDeclaration3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition3522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDefinition3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOperationDefinition3578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperationDefinition3595 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOperationDefinition3612 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition3634 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_16_in_ruleOperationDefinition3647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition3668 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_28_in_ruleOperationDefinition3684 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleOperationDefinition3697 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter3810 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleParameter3827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleParameter3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN3891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3942 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleFQN3961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3976 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction4023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReaction4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReaction4079 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleLocalReaction4111 = new BitSet(new long[]{0x00C44000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalReaction4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction4170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionReaction4180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleTransitionReaction4235 = new BitSet(new long[]{0x0000000004400002L});
    public static final BitSet FOLLOW_22_in_ruleTransitionReaction4249 = new BitSet(new long[]{0x00C44000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransitionReaction4270 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleTransitionReaction4285 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_ruleReactionProperties_in_ruleTransitionReaction4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger4344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionTrigger4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSpec_in_ruleReactionTrigger4411 = new BitSet(new long[]{0x0000002000010002L});
    public static final BitSet FOLLOW_16_in_ruleReactionTrigger4424 = new BitSet(new long[]{0x00003F0000000010L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEventSpec_in_ruleReactionTrigger4445 = new BitSet(new long[]{0x0000002000010002L});
    public static final BitSet FOLLOW_37_in_ruleReactionTrigger4468 = new BitSet(new long[]{0x00C40000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger4490 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleReactionTrigger4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleReactionTrigger4524 = new BitSet(new long[]{0x00C40000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger4545 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleReactionTrigger4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect4595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionEffect4605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect4662 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4681 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleReactionEffect4705 = new BitSet(new long[]{0x00C44000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect4729 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4748 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleReactionProperties_in_entryRuleReactionProperties4789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionProperties4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionProperty_in_ruleReactionProperties4854 = new BitSet(new long[]{0x0000008000000012L});
    public static final BitSet FOLLOW_ruleReactionProperty_in_entryRuleReactionProperty4891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionProperty4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_ruleReactionProperty4948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_ruleReactionProperty4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec5010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryPointSpec5020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEntryPointSpec5057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEntryPointSpec5080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec5116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitPointSpec5126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleExitPointSpec5174 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleExitPointSpec5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSpec_in_entryRuleEventSpec5222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventSpec5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_ruleEventSpec5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_ruleEventSpec5306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_ruleEventSpec5333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularEventSpec5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeEventSpec5468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5514 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeEventSpec5531 = new BitSet(new long[]{0x0000000000000002L,0x00000000F0000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinEventSpec5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCycleEvent_in_ruleBuiltinEventSpec5705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec5732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultEvent_in_ruleBuiltinEventSpec5759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent5794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryEvent5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleEntryEvent5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent5886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent5896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleExitEvent5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCycleEvent_in_entryRuleOnCycleEvent5978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnCycleEvent5988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOnCycleEvent6034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent6070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEvent6080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAlwaysEvent6126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultEvent_in_entryRuleDefaultEvent6162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultEvent6172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDefaultEvent6219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDefaultEvent6237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_entryRuleEventRaisingExpression6274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventRaisingExpression6284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleEventRaisingExpression6330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventRaisingExpression6351 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleEventRaisingExpression6364 = new BitSet(new long[]{0x00C40000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEventRaisingExpression6385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpression6481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression6525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6572 = new BitSet(new long[]{0x0000000000080002L,0x000000000000FFC0L});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6602 = new BitSet(new long[]{0x00C40000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6623 = new BitSet(new long[]{0x0000000000080002L,0x000000000000FFC0L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression6671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6718 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleConditionalExpression6739 = new BitSet(new long[]{0x00C40000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6760 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConditionalExpression6772 = new BitSet(new long[]{0x00C40000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression6841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6888 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleLogicalOrExpression6909 = new BitSet(new long[]{0x00C40000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6930 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression6978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7025 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleLogicalAndExpression7046 = new BitSet(new long[]{0x00C40000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression7067 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression7105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNotExpression7115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleLogicalNotExpression7189 = new BitSet(new long[]{0x00C00000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression7257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7304 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleBitwiseXorExpression7325 = new BitSet(new long[]{0x00C00000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7346 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression7394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7441 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleBitwiseOrExpression7462 = new BitSet(new long[]{0x00C00000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7483 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression7531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7578 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleBitwiseAndExpression7599 = new BitSet(new long[]{0x00C00000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7620 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalRelationExpression7668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7715 = new BitSet(new long[]{0x0000008000000002L,0x000000000F800000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7745 = new BitSet(new long[]{0x00C00000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7766 = new BitSet(new long[]{0x0000008000000002L,0x000000000F800000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression7814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7861 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression7891 = new BitSet(new long[]{0x00C00000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7912 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8007 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression8037 = new BitSet(new long[]{0x00C00000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression8058 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression8096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression8106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8153 = new BitSet(new long[]{0x0000000000400002L,0x0000000000300000L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8183 = new BitSet(new long[]{0x00C00000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8204 = new BitSet(new long[]{0x0000000000400002L,0x0000000000300000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8335 = new BitSet(new long[]{0x00C00000080003F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression8393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression8403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression8450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression8477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression8504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression8531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePrimaryExpression8549 = new BitSet(new long[]{0x00C40000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression8571 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrimaryExpression8582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValueExpression8629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall8730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8777 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleFeatureCall8798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureCall8818 = new BitSet(new long[]{0x0000001008000002L});
    public static final BitSet FOLLOW_27_in_ruleFeatureCall8852 = new BitSet(new long[]{0x00C40000180003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8887 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_16_in_ruleFeatureCall8900 = new BitSet(new long[]{0x00C40000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8921 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_28_in_ruleFeatureCall8937 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementReferenceExpression8987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementReferenceExpression9041 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleElementReferenceExpression9075 = new BitSet(new long[]{0x00C40000180003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression9110 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_16_in_ruleElementReferenceExpression9123 = new BitSet(new long[]{0x00C40000080003F0L,0x00000000004C0000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression9144 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_28_in_ruleElementReferenceExpression9160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression9198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventValueReferenceExpression9208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleEventValueReferenceExpression9254 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEventValueReferenceExpression9266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression9287 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEventValueReferenceExpression9299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression9335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression9345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleActiveStateReferenceExpression9391 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleActiveStateReferenceExpression9403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9426 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleActiveStateReferenceExpression9438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral9474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral9484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral9531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral9558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_ruleLiteral9585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleLiteral9612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral9639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral9684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral9735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral9786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral9837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral9888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRealLiteral9939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexLiteral9990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleHexLiteral10041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral10082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral10092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral10143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleCombineOperator10198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleCombineOperator10215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleCombineOperator10232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleCombineOperator10249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleCombineOperator10266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleCombineOperator10283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleCombineOperator10300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleCombineOperator10317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleVarDirection10362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleVarDirection10379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleVarDirection10396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleDirection10441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDirection10458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleDirection10475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleTimeEventType10520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleTimeEventType10537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAssignmentOperator10582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleAssignmentOperator10599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleAssignmentOperator10616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleAssignmentOperator10633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleAssignmentOperator10650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleAssignmentOperator10667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleAssignmentOperator10684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleAssignmentOperator10701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAssignmentOperator10718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleAssignmentOperator10735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleAssignmentOperator10752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleShiftOperator10797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleShiftOperator10814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleAdditiveOperator10859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleAdditiveOperator10876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleMultiplicativeOperator10921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleMultiplicativeOperator10938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleMultiplicativeOperator10955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleUnaryOperator11000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleUnaryOperator11017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleUnaryOperator11034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleRelationalOperator11079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleRelationalOperator11096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleRelationalOperator11113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleRelationalOperator11130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleRelationalOperator11147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleRelationalOperator11164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleTimeUnit11209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleTimeUnit11226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleTimeUnit11243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleTimeUnit11260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred1_InternalSCCExp1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred3_InternalSCCExp4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred4_InternalSCCExp4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred5_InternalSCCExp8834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred6_InternalSCCExp9057 = new BitSet(new long[]{0x0000000000000002L});

}