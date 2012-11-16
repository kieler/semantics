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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_FLOAT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@@state@@'", "'@@transition@@'", "'interface:'", "';'", "'/'", "','", "'OnExitAction:'", "'OnInsideAction:'", "'OnEntryAction:'", "'Suspend:'", "'#'", "'some trigger expression'", "'namespace'", "'internal'", "':'", "'event'", "'var'", "'readonly'", "'external'", "'='", "'operation'", "'('", "')'", "'entrypoint'", "'exitpoint'", "'.'", "'['", "']'", "'>'", "'entry'", "'exit'", "'oncycle'", "'always'", "'default'", "'else'", "'raise'", "'?'", "'||'", "'&&'", "'!'", "'^'", "'|'", "'&'", "'valueof'", "'active'", "'local'", "'in'", "'out'", "'after'", "'every'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'%'", "'~'", "'<'", "'<='", "'>='", "'=='", "'!='", "'s'", "'ms'", "'us'", "'ns'"
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
        	return "Root";	
       	}
       	
       	@Override
       	protected SCCExpGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRoot"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:68:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:69:2: (iv_ruleRoot= ruleRoot EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:70:2: iv_ruleRoot= ruleRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRootRule()); 
            }
            pushFollow(FOLLOW_ruleRoot_in_entryRuleRoot75);
            iv_ruleRoot=ruleRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoot85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:77:1: ruleRoot returns [EObject current=null] : ( (lv_roots_0_0= ruleDefRoot ) )* ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_roots_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:80:28: ( ( (lv_roots_0_0= ruleDefRoot ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:81:1: ( (lv_roots_0_0= ruleDefRoot ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:81:1: ( (lv_roots_0_0= ruleDefRoot ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:82:1: (lv_roots_0_0= ruleDefRoot )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:82:1: (lv_roots_0_0= ruleDefRoot )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:83:3: lv_roots_0_0= ruleDefRoot
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRootAccess().getRootsDefRootParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDefRoot_in_ruleRoot130);
            	    lv_roots_0_0=ruleDefRoot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRootRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"roots",
            	              		lv_roots_0_0, 
            	              		"DefRoot");
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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleDefRoot"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:107:1: entryRuleDefRoot returns [EObject current=null] : iv_ruleDefRoot= ruleDefRoot EOF ;
    public final EObject entryRuleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRoot = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:108:2: (iv_ruleDefRoot= ruleDefRoot EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:109:2: iv_ruleDefRoot= ruleDefRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefRootRule()); 
            }
            pushFollow(FOLLOW_ruleDefRoot_in_entryRuleDefRoot166);
            iv_ruleDefRoot=ruleDefRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRoot176); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:116:1: ruleDefRoot returns [EObject current=null] : (this_StateRoot_0= ruleStateRoot | this_TransitionRoot_1= ruleTransitionRoot ) ;
    public final EObject ruleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject this_StateRoot_0 = null;

        EObject this_TransitionRoot_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:119:28: ( (this_StateRoot_0= ruleStateRoot | this_TransitionRoot_1= ruleTransitionRoot ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:120:1: (this_StateRoot_0= ruleStateRoot | this_TransitionRoot_1= ruleTransitionRoot )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:120:1: (this_StateRoot_0= ruleStateRoot | this_TransitionRoot_1= ruleTransitionRoot )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:121:5: this_StateRoot_0= ruleStateRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStateRootParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStateRoot_in_ruleDefRoot223);
                    this_StateRoot_0=ruleStateRoot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StateRoot_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:131:5: this_TransitionRoot_1= ruleTransitionRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getTransitionRootParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransitionRoot_in_ruleDefRoot250);
                    this_TransitionRoot_1=ruleTransitionRoot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TransitionRoot_1; 
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


    // $ANTLR start "entryRuleStateRoot"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:147:1: entryRuleStateRoot returns [EObject current=null] : iv_ruleStateRoot= ruleStateRoot EOF ;
    public final EObject entryRuleStateRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateRoot = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:148:2: (iv_ruleStateRoot= ruleStateRoot EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:149:2: iv_ruleStateRoot= ruleStateRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRootRule()); 
            }
            pushFollow(FOLLOW_ruleStateRoot_in_entryRuleStateRoot285);
            iv_ruleStateRoot=ruleStateRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateRoot295); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:156:1: ruleStateRoot returns [EObject current=null] : (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) ;
    public final EObject ruleStateRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:159:28: ( (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:160:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:160:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:160:3: otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleStateRoot332); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateRootAccess().getStateKeyword_0());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:164:1: ( (lv_def_1_0= ruleStateSpecification ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:165:1: (lv_def_1_0= ruleStateSpecification )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:165:1: (lv_def_1_0= ruleStateSpecification )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:166:3: lv_def_1_0= ruleStateSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateRootAccess().getDefStateSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_ruleStateRoot353);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:190:1: entryRuleTransitionRoot returns [EObject current=null] : iv_ruleTransitionRoot= ruleTransitionRoot EOF ;
    public final EObject entryRuleTransitionRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionRoot = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:191:2: (iv_ruleTransitionRoot= ruleTransitionRoot EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:192:2: iv_ruleTransitionRoot= ruleTransitionRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRootRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot389);
            iv_ruleTransitionRoot=ruleTransitionRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionRoot399); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:199:1: ruleTransitionRoot returns [EObject current=null] : (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) ;
    public final EObject ruleTransitionRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:202:28: ( (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:203:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:203:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:203:3: otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleTransitionRoot436); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionRootAccess().getTransitionKeyword_0());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:207:1: ( (lv_def_1_0= ruleTransitionSpecification ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:208:1: (lv_def_1_0= ruleTransitionSpecification )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:208:1: (lv_def_1_0= ruleTransitionSpecification )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:209:3: lv_def_1_0= ruleTransitionSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionRootAccess().getDefTransitionSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot457);
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


    // $ANTLR start "entryRuleStateScope"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:233:1: entryRuleStateScope returns [EObject current=null] : iv_ruleStateScope= ruleStateScope EOF ;
    public final EObject entryRuleStateScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateScope = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:234:2: (iv_ruleStateScope= ruleStateScope EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:235:2: iv_ruleStateScope= ruleStateScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStateScope_in_entryRuleStateScope493);
            iv_ruleStateScope=ruleStateScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateScope503); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:242:1: ruleStateScope returns [EObject current=null] : this_InterfaceScopeRoot_0= ruleInterfaceScopeRoot ;
    public final EObject ruleStateScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScopeRoot_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:245:28: (this_InterfaceScopeRoot_0= ruleInterfaceScopeRoot )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:247:5: this_InterfaceScopeRoot_0= ruleInterfaceScopeRoot
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getStateScopeAccess().getInterfaceScopeRootParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleInterfaceScopeRoot_in_ruleStateScope549);
            this_InterfaceScopeRoot_0=ruleInterfaceScopeRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_InterfaceScopeRoot_0; 
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
    // $ANTLR end "ruleStateScope"


    // $ANTLR start "entryRuleInterfaceScopeRoot"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:263:1: entryRuleInterfaceScopeRoot returns [EObject current=null] : iv_ruleInterfaceScopeRoot= ruleInterfaceScopeRoot EOF ;
    public final EObject entryRuleInterfaceScopeRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceScopeRoot = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:264:2: (iv_ruleInterfaceScopeRoot= ruleInterfaceScopeRoot EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:265:2: iv_ruleInterfaceScopeRoot= ruleInterfaceScopeRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceScopeRootRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceScopeRoot_in_entryRuleInterfaceScopeRoot583);
            iv_ruleInterfaceScopeRoot=ruleInterfaceScopeRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceScopeRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceScopeRoot593); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceScopeRoot"


    // $ANTLR start "ruleInterfaceScopeRoot"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:272:1: ruleInterfaceScopeRoot returns [EObject current=null] : ( () ( (lv_interfaceScope_1_0= ruleInterfaceScope ) )* ) ;
    public final EObject ruleInterfaceScopeRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_interfaceScope_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:275:28: ( ( () ( (lv_interfaceScope_1_0= ruleInterfaceScope ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:276:1: ( () ( (lv_interfaceScope_1_0= ruleInterfaceScope ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:276:1: ( () ( (lv_interfaceScope_1_0= ruleInterfaceScope ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:276:2: () ( (lv_interfaceScope_1_0= ruleInterfaceScope ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:276:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:277:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInterfaceScopeRootAccess().getInterfaceScopeRootAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:282:2: ( (lv_interfaceScope_1_0= ruleInterfaceScope ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||(LA3_0>=20 && LA3_0<=23)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:283:1: (lv_interfaceScope_1_0= ruleInterfaceScope )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:283:1: (lv_interfaceScope_1_0= ruleInterfaceScope )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:284:3: lv_interfaceScope_1_0= ruleInterfaceScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterfaceScopeRootAccess().getInterfaceScopeInterfaceScopeParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleInterfaceScopeRoot648);
            	    lv_interfaceScope_1_0=ruleInterfaceScope();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInterfaceScopeRootRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"interfaceScope",
            	              		lv_interfaceScope_1_0, 
            	              		"InterfaceScope");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleInterfaceScopeRoot"


    // $ANTLR start "entryRuleInterfaceScope"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:308:1: entryRuleInterfaceScope returns [EObject current=null] : iv_ruleInterfaceScope= ruleInterfaceScope EOF ;
    public final EObject entryRuleInterfaceScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceScope = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:309:2: (iv_ruleInterfaceScope= ruleInterfaceScope EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:310:2: iv_ruleInterfaceScope= ruleInterfaceScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope685);
            iv_ruleInterfaceScope=ruleInterfaceScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceScope695); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:317:1: ruleInterfaceScope returns [EObject current=null] : (this_InterfaceDeclaration_0= ruleInterfaceDeclaration | this_ActionDeclaration_1= ruleActionDeclaration | this_SuspendDeclaration_2= ruleSuspendDeclaration ) ;
    public final EObject ruleInterfaceScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceDeclaration_0 = null;

        EObject this_ActionDeclaration_1 = null;

        EObject this_SuspendDeclaration_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:320:28: ( (this_InterfaceDeclaration_0= ruleInterfaceDeclaration | this_ActionDeclaration_1= ruleActionDeclaration | this_SuspendDeclaration_2= ruleSuspendDeclaration ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:321:1: (this_InterfaceDeclaration_0= ruleInterfaceDeclaration | this_ActionDeclaration_1= ruleActionDeclaration | this_SuspendDeclaration_2= ruleSuspendDeclaration )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:321:1: (this_InterfaceDeclaration_0= ruleInterfaceDeclaration | this_ActionDeclaration_1= ruleActionDeclaration | this_SuspendDeclaration_2= ruleSuspendDeclaration )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 20:
            case 21:
            case 22:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:322:5: this_InterfaceDeclaration_0= ruleInterfaceDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInterfaceScopeAccess().getInterfaceDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceDeclaration_in_ruleInterfaceScope742);
                    this_InterfaceDeclaration_0=ruleInterfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InterfaceDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:332:5: this_ActionDeclaration_1= ruleActionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInterfaceScopeAccess().getActionDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActionDeclaration_in_ruleInterfaceScope769);
                    this_ActionDeclaration_1=ruleActionDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ActionDeclaration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:342:5: this_SuspendDeclaration_2= ruleSuspendDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInterfaceScopeAccess().getSuspendDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSuspendDeclaration_in_ruleInterfaceScope796);
                    this_SuspendDeclaration_2=ruleSuspendDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SuspendDeclaration_2; 
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
    // $ANTLR end "ruleInterfaceScope"


    // $ANTLR start "entryRuleInterfaceDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:358:1: entryRuleInterfaceDeclaration returns [EObject current=null] : iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF ;
    public final EObject entryRuleInterfaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:359:2: (iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:360:2: iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceDeclaration_in_entryRuleInterfaceDeclaration831);
            iv_ruleInterfaceDeclaration=ruleInterfaceDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceDeclaration841); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceDeclaration"


    // $ANTLR start "ruleInterfaceDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:367:1: ruleInterfaceDeclaration returns [EObject current=null] : ( () otherlv_1= 'interface:' ( ( (lv_declarations_2_1= ruleEventDeclarartion | lv_declarations_2_2= ruleVariableDeclaration | lv_declarations_2_3= ruleOperationDeclaration | lv_declarations_2_4= ruleEntrypoint | lv_declarations_2_5= ruleExitpoint ) ) )* otherlv_3= ';' ) ;
    public final EObject ruleInterfaceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declarations_2_1 = null;

        EObject lv_declarations_2_2 = null;

        EObject lv_declarations_2_3 = null;

        EObject lv_declarations_2_4 = null;

        EObject lv_declarations_2_5 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:370:28: ( ( () otherlv_1= 'interface:' ( ( (lv_declarations_2_1= ruleEventDeclarartion | lv_declarations_2_2= ruleVariableDeclaration | lv_declarations_2_3= ruleOperationDeclaration | lv_declarations_2_4= ruleEntrypoint | lv_declarations_2_5= ruleExitpoint ) ) )* otherlv_3= ';' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:371:1: ( () otherlv_1= 'interface:' ( ( (lv_declarations_2_1= ruleEventDeclarartion | lv_declarations_2_2= ruleVariableDeclaration | lv_declarations_2_3= ruleOperationDeclaration | lv_declarations_2_4= ruleEntrypoint | lv_declarations_2_5= ruleExitpoint ) ) )* otherlv_3= ';' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:371:1: ( () otherlv_1= 'interface:' ( ( (lv_declarations_2_1= ruleEventDeclarartion | lv_declarations_2_2= ruleVariableDeclaration | lv_declarations_2_3= ruleOperationDeclaration | lv_declarations_2_4= ruleEntrypoint | lv_declarations_2_5= ruleExitpoint ) ) )* otherlv_3= ';' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:371:2: () otherlv_1= 'interface:' ( ( (lv_declarations_2_1= ruleEventDeclarartion | lv_declarations_2_2= ruleVariableDeclaration | lv_declarations_2_3= ruleOperationDeclaration | lv_declarations_2_4= ruleEntrypoint | lv_declarations_2_5= ruleExitpoint ) ) )* otherlv_3= ';'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:371:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:372:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInterfaceDeclarationAccess().getInterfaceDeclarationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleInterfaceDeclaration887); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceDeclarationAccess().getInterfaceKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:381:1: ( ( (lv_declarations_2_1= ruleEventDeclarartion | lv_declarations_2_2= ruleVariableDeclaration | lv_declarations_2_3= ruleOperationDeclaration | lv_declarations_2_4= ruleEntrypoint | lv_declarations_2_5= ruleExitpoint ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=29 && LA6_0<=30)||LA6_0==34||(LA6_0>=37 && LA6_0<=38)||(LA6_0>=59 && LA6_0<=61)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:382:1: ( (lv_declarations_2_1= ruleEventDeclarartion | lv_declarations_2_2= ruleVariableDeclaration | lv_declarations_2_3= ruleOperationDeclaration | lv_declarations_2_4= ruleEntrypoint | lv_declarations_2_5= ruleExitpoint ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:382:1: ( (lv_declarations_2_1= ruleEventDeclarartion | lv_declarations_2_2= ruleVariableDeclaration | lv_declarations_2_3= ruleOperationDeclaration | lv_declarations_2_4= ruleEntrypoint | lv_declarations_2_5= ruleExitpoint ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:383:1: (lv_declarations_2_1= ruleEventDeclarartion | lv_declarations_2_2= ruleVariableDeclaration | lv_declarations_2_3= ruleOperationDeclaration | lv_declarations_2_4= ruleEntrypoint | lv_declarations_2_5= ruleExitpoint )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:383:1: (lv_declarations_2_1= ruleEventDeclarartion | lv_declarations_2_2= ruleVariableDeclaration | lv_declarations_2_3= ruleOperationDeclaration | lv_declarations_2_4= ruleEntrypoint | lv_declarations_2_5= ruleExitpoint )
            	    int alt5=5;
            	    switch ( input.LA(1) ) {
            	    case 29:
            	    case 59:
            	    case 60:
            	    case 61:
            	        {
            	        alt5=1;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt5=2;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt5=3;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt5=4;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt5=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt5) {
            	        case 1 :
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:384:3: lv_declarations_2_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getDeclarationsEventDeclarartionParserRuleCall_2_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInterfaceDeclaration910);
            	            lv_declarations_2_1=ruleEventDeclarartion();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceDeclarationRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_2_1, 
            	                      		"EventDeclarartion");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:399:8: lv_declarations_2_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getDeclarationsVariableDeclarationParserRuleCall_2_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInterfaceDeclaration929);
            	            lv_declarations_2_2=ruleVariableDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceDeclarationRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_2_2, 
            	                      		"VariableDeclaration");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:414:8: lv_declarations_2_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getDeclarationsOperationDeclarationParserRuleCall_2_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInterfaceDeclaration948);
            	            lv_declarations_2_3=ruleOperationDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceDeclarationRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_2_3, 
            	                      		"OperationDeclaration");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:429:8: lv_declarations_2_4= ruleEntrypoint
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getDeclarationsEntrypointParserRuleCall_2_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEntrypoint_in_ruleInterfaceDeclaration967);
            	            lv_declarations_2_4=ruleEntrypoint();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceDeclarationRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_2_4, 
            	                      		"Entrypoint");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:444:8: lv_declarations_2_5= ruleExitpoint
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getDeclarationsExitpointParserRuleCall_2_0_4()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExitpoint_in_ruleInterfaceDeclaration986);
            	            lv_declarations_2_5=ruleExitpoint();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceDeclarationRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_2_5, 
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
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleInterfaceDeclaration1002); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInterfaceDeclarationAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceDeclaration"


    // $ANTLR start "entryRuleActionDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:474:1: entryRuleActionDeclaration returns [EObject current=null] : iv_ruleActionDeclaration= ruleActionDeclaration EOF ;
    public final EObject entryRuleActionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:475:2: (iv_ruleActionDeclaration= ruleActionDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:476:2: iv_ruleActionDeclaration= ruleActionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleActionDeclaration_in_entryRuleActionDeclaration1038);
            iv_ruleActionDeclaration=ruleActionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionDeclaration1048); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionDeclaration"


    // $ANTLR start "ruleActionDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:483:1: ruleActionDeclaration returns [EObject current=null] : ( (this_EntryActionDeclaration_0= ruleEntryActionDeclaration | this_InsideActionDeclaration_1= ruleInsideActionDeclaration | this_ExitActionDeclaration_2= ruleExitActionDeclaration ) otherlv_3= '/' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' otherlv_6= '/' this_ID_7= RULE_ID )* otherlv_8= ';' ) ;
    public final EObject ruleActionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_ID_7=null;
        Token otherlv_8=null;
        EObject this_EntryActionDeclaration_0 = null;

        EObject this_InsideActionDeclaration_1 = null;

        EObject this_ExitActionDeclaration_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:486:28: ( ( (this_EntryActionDeclaration_0= ruleEntryActionDeclaration | this_InsideActionDeclaration_1= ruleInsideActionDeclaration | this_ExitActionDeclaration_2= ruleExitActionDeclaration ) otherlv_3= '/' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' otherlv_6= '/' this_ID_7= RULE_ID )* otherlv_8= ';' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:487:1: ( (this_EntryActionDeclaration_0= ruleEntryActionDeclaration | this_InsideActionDeclaration_1= ruleInsideActionDeclaration | this_ExitActionDeclaration_2= ruleExitActionDeclaration ) otherlv_3= '/' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' otherlv_6= '/' this_ID_7= RULE_ID )* otherlv_8= ';' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:487:1: ( (this_EntryActionDeclaration_0= ruleEntryActionDeclaration | this_InsideActionDeclaration_1= ruleInsideActionDeclaration | this_ExitActionDeclaration_2= ruleExitActionDeclaration ) otherlv_3= '/' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' otherlv_6= '/' this_ID_7= RULE_ID )* otherlv_8= ';' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:487:2: (this_EntryActionDeclaration_0= ruleEntryActionDeclaration | this_InsideActionDeclaration_1= ruleInsideActionDeclaration | this_ExitActionDeclaration_2= ruleExitActionDeclaration ) otherlv_3= '/' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' otherlv_6= '/' this_ID_7= RULE_ID )* otherlv_8= ';'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:487:2: (this_EntryActionDeclaration_0= ruleEntryActionDeclaration | this_InsideActionDeclaration_1= ruleInsideActionDeclaration | this_ExitActionDeclaration_2= ruleExitActionDeclaration )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:488:5: this_EntryActionDeclaration_0= ruleEntryActionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionDeclarationAccess().getEntryActionDeclarationParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryActionDeclaration_in_ruleActionDeclaration1096);
                    this_EntryActionDeclaration_0=ruleEntryActionDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EntryActionDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:498:5: this_InsideActionDeclaration_1= ruleInsideActionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionDeclarationAccess().getInsideActionDeclarationParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInsideActionDeclaration_in_ruleActionDeclaration1123);
                    this_InsideActionDeclaration_1=ruleInsideActionDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InsideActionDeclaration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:508:5: this_ExitActionDeclaration_2= ruleExitActionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionDeclarationAccess().getExitActionDeclarationParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitActionDeclaration_in_ruleActionDeclaration1150);
                    this_ExitActionDeclaration_2=ruleExitActionDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExitActionDeclaration_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleActionDeclaration1162); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getActionDeclarationAccess().getSolidusKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:520:1: ( (lv_name_4_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:521:1: (lv_name_4_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:521:1: (lv_name_4_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:522:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionDeclaration1179); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getActionDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getActionDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:538:2: (otherlv_5= ',' otherlv_6= '/' this_ID_7= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:538:4: otherlv_5= ',' otherlv_6= '/' this_ID_7= RULE_ID
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleActionDeclaration1197); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getActionDeclarationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleActionDeclaration1209); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getActionDeclarationAccess().getSolidusKeyword_3_1());
            	          
            	    }
            	    this_ID_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionDeclaration1220); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_7, grammarAccess.getActionDeclarationAccess().getIDTerminalRuleCall_3_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleActionDeclaration1233); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getActionDeclarationAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionDeclaration"


    // $ANTLR start "entryRuleExitActionDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:562:1: entryRuleExitActionDeclaration returns [EObject current=null] : iv_ruleExitActionDeclaration= ruleExitActionDeclaration EOF ;
    public final EObject entryRuleExitActionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitActionDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:563:2: (iv_ruleExitActionDeclaration= ruleExitActionDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:564:2: iv_ruleExitActionDeclaration= ruleExitActionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitActionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleExitActionDeclaration_in_entryRuleExitActionDeclaration1269);
            iv_ruleExitActionDeclaration=ruleExitActionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitActionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitActionDeclaration1279); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExitActionDeclaration"


    // $ANTLR start "ruleExitActionDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:571:1: ruleExitActionDeclaration returns [EObject current=null] : ( () otherlv_1= 'OnExitAction:' ) ;
    public final EObject ruleExitActionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:574:28: ( ( () otherlv_1= 'OnExitAction:' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:575:1: ( () otherlv_1= 'OnExitAction:' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:575:1: ( () otherlv_1= 'OnExitAction:' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:575:2: () otherlv_1= 'OnExitAction:'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:575:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:576:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitActionDeclarationAccess().getExitActionDeclarationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleExitActionDeclaration1325); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitActionDeclarationAccess().getOnExitActionKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExitActionDeclaration"


    // $ANTLR start "entryRuleInsideActionDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:593:1: entryRuleInsideActionDeclaration returns [EObject current=null] : iv_ruleInsideActionDeclaration= ruleInsideActionDeclaration EOF ;
    public final EObject entryRuleInsideActionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsideActionDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:594:2: (iv_ruleInsideActionDeclaration= ruleInsideActionDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:595:2: iv_ruleInsideActionDeclaration= ruleInsideActionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsideActionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleInsideActionDeclaration_in_entryRuleInsideActionDeclaration1361);
            iv_ruleInsideActionDeclaration=ruleInsideActionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInsideActionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsideActionDeclaration1371); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInsideActionDeclaration"


    // $ANTLR start "ruleInsideActionDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:602:1: ruleInsideActionDeclaration returns [EObject current=null] : ( () otherlv_1= 'OnInsideAction:' ) ;
    public final EObject ruleInsideActionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:605:28: ( ( () otherlv_1= 'OnInsideAction:' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:606:1: ( () otherlv_1= 'OnInsideAction:' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:606:1: ( () otherlv_1= 'OnInsideAction:' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:606:2: () otherlv_1= 'OnInsideAction:'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:606:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:607:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInsideActionDeclarationAccess().getInsideActionDeclarationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleInsideActionDeclaration1417); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInsideActionDeclarationAccess().getOnInsideActionKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInsideActionDeclaration"


    // $ANTLR start "entryRuleEntryActionDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:624:1: entryRuleEntryActionDeclaration returns [EObject current=null] : iv_ruleEntryActionDeclaration= ruleEntryActionDeclaration EOF ;
    public final EObject entryRuleEntryActionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryActionDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:625:2: (iv_ruleEntryActionDeclaration= ruleEntryActionDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:626:2: iv_ruleEntryActionDeclaration= ruleEntryActionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryActionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleEntryActionDeclaration_in_entryRuleEntryActionDeclaration1453);
            iv_ruleEntryActionDeclaration=ruleEntryActionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryActionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryActionDeclaration1463); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntryActionDeclaration"


    // $ANTLR start "ruleEntryActionDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:633:1: ruleEntryActionDeclaration returns [EObject current=null] : ( () otherlv_1= 'OnEntryAction:' ) ;
    public final EObject ruleEntryActionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:636:28: ( ( () otherlv_1= 'OnEntryAction:' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:637:1: ( () otherlv_1= 'OnEntryAction:' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:637:1: ( () otherlv_1= 'OnEntryAction:' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:637:2: () otherlv_1= 'OnEntryAction:'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:637:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:638:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryActionDeclarationAccess().getEntryActionDeclarationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleEntryActionDeclaration1509); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntryActionDeclarationAccess().getOnEntryActionKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntryActionDeclaration"


    // $ANTLR start "entryRuleSuspendDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:655:1: entryRuleSuspendDeclaration returns [EObject current=null] : iv_ruleSuspendDeclaration= ruleSuspendDeclaration EOF ;
    public final EObject entryRuleSuspendDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspendDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:656:2: (iv_ruleSuspendDeclaration= ruleSuspendDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:657:2: iv_ruleSuspendDeclaration= ruleSuspendDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuspendDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSuspendDeclaration_in_entryRuleSuspendDeclaration1545);
            iv_ruleSuspendDeclaration=ruleSuspendDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuspendDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuspendDeclaration1555); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuspendDeclaration"


    // $ANTLR start "ruleSuspendDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:664:1: ruleSuspendDeclaration returns [EObject current=null] : ( () otherlv_1= 'Suspend:' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSuspendDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:667:28: ( ( () otherlv_1= 'Suspend:' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:668:1: ( () otherlv_1= 'Suspend:' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:668:1: ( () otherlv_1= 'Suspend:' ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:668:2: () otherlv_1= 'Suspend:' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:668:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:669:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSuspendDeclarationAccess().getSuspendDeclarationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleSuspendDeclaration1601); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSuspendDeclarationAccess().getSuspendKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:678:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:679:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:679:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:680:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSuspendDeclaration1618); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getSuspendDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSuspendDeclarationRule());
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
    // $ANTLR end "ruleSuspendDeclaration"


    // $ANTLR start "entryRuleTransitionReaction"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:704:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:705:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:706:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction1659);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionReaction1669); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:713:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleMyTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:716:28: ( ( () ( (lv_trigger_1_0= ruleMyTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:717:1: ( () ( (lv_trigger_1_0= ruleMyTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:717:1: ( () ( (lv_trigger_1_0= ruleMyTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:717:2: () ( (lv_trigger_1_0= ruleMyTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:717:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:718:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionReactionAccess().getTransitionReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:723:2: ( (lv_trigger_1_0= ruleMyTrigger ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:724:1: (lv_trigger_1_0= ruleMyTrigger )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:724:1: (lv_trigger_1_0= ruleMyTrigger )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:725:3: lv_trigger_1_0= ruleMyTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerMyTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMyTrigger_in_ruleTransitionReaction1724);
                    lv_trigger_1_0=ruleMyTrigger();

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
                              		"MyTrigger");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:741:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:741:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleTransitionReaction1738); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:745:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:746:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:746:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:747:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransitionReaction1759);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:763:4: (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:763:6: otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleTransitionReaction1774); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionReactionAccess().getNumberSignKeyword_3_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:767:1: ( (lv_properties_5_0= ruleReactionProperties ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:768:1: (lv_properties_5_0= ruleReactionProperties )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:768:1: (lv_properties_5_0= ruleReactionProperties )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:769:3: lv_properties_5_0= ruleReactionProperties
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getPropertiesReactionPropertiesParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionProperties_in_ruleTransitionReaction1795);
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


    // $ANTLR start "entryRuleMyTrigger"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:793:1: entryRuleMyTrigger returns [EObject current=null] : iv_ruleMyTrigger= ruleMyTrigger EOF ;
    public final EObject entryRuleMyTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyTrigger = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:794:2: (iv_ruleMyTrigger= ruleMyTrigger EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:795:2: iv_ruleMyTrigger= ruleMyTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMyTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleMyTrigger_in_entryRuleMyTrigger1833);
            iv_ruleMyTrigger=ruleMyTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMyTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMyTrigger1843); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMyTrigger"


    // $ANTLR start "ruleMyTrigger"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:802:1: ruleMyTrigger returns [EObject current=null] : ( () otherlv_1= 'some trigger expression' ) ;
    public final EObject ruleMyTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:805:28: ( ( () otherlv_1= 'some trigger expression' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:806:1: ( () otherlv_1= 'some trigger expression' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:806:1: ( () otherlv_1= 'some trigger expression' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:806:2: () otherlv_1= 'some trigger expression'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:806:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:807:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMyTriggerAccess().getMyTriggerAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleMyTrigger1889); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMyTriggerAccess().getSomeTriggerExpressionKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMyTrigger"


    // $ANTLR start "entryRuleStatechartSpecification"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:828:1: entryRuleStatechartSpecification returns [EObject current=null] : iv_ruleStatechartSpecification= ruleStatechartSpecification EOF ;
    public final EObject entryRuleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartSpecification = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:829:2: (iv_ruleStatechartSpecification= ruleStatechartSpecification EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:830:2: iv_ruleStatechartSpecification= ruleStatechartSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification1929);
            iv_ruleStatechartSpecification=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartSpecification1939); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:837:1: ruleStatechartSpecification returns [EObject current=null] : ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) ;
    public final EObject ruleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        EObject lv_scopes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:840:28: ( ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:841:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:841:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:841:2: () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:841:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:842:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatechartSpecificationAccess().getStatechartSpecificationAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:847:2: (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:847:4: otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleStatechartSpecification1986); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatechartSpecificationAccess().getNamespaceKeyword_1_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:851:1: ( (lv_namespace_2_0= ruleFQN ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:852:1: (lv_namespace_2_0= ruleFQN )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:852:1: (lv_namespace_2_0= ruleFQN )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:853:3: lv_namespace_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getNamespaceFQNParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleStatechartSpecification2007);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:869:4: ( (lv_scopes_3_0= ruleStatechartScope ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16||(LA13_0>=20 && LA13_0<=23)||LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:870:1: (lv_scopes_3_0= ruleStatechartScope )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:870:1: (lv_scopes_3_0= ruleStatechartScope )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:871:3: lv_scopes_3_0= ruleStatechartScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getScopesStatechartScopeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification2030);
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
            	    break loop13;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:895:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:896:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:897:2: iv_ruleStateSpecification= ruleStateSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification2067);
            iv_ruleStateSpecification=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateSpecification2077); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:904:1: ruleStateSpecification returns [EObject current=null] : ( (lv_scope_0_0= ruleStateScope ) ) ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_scope_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:907:28: ( ( (lv_scope_0_0= ruleStateScope ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:908:1: ( (lv_scope_0_0= ruleStateScope ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:908:1: ( (lv_scope_0_0= ruleStateScope ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:909:1: (lv_scope_0_0= ruleStateScope )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:909:1: (lv_scope_0_0= ruleStateScope )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:910:3: lv_scope_0_0= ruleStateScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateSpecificationAccess().getScopeStateScopeParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateScope_in_ruleStateSpecification2122);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:934:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:935:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:936:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification2157);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification2167); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:943:1: ruleTransitionSpecification returns [EObject current=null] : ( (lv_reaction_0_0= ruleTransitionReaction ) ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_reaction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:946:28: ( ( (lv_reaction_0_0= ruleTransitionReaction ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:947:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:947:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:948:1: (lv_reaction_0_0= ruleTransitionReaction )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:948:1: (lv_reaction_0_0= ruleTransitionReaction )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:949:3: lv_reaction_0_0= ruleTransitionReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getReactionTransitionReactionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification2212);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:975:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:976:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:977:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope2249);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartScope2259); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:984:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:987:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:988:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:988:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16||(LA14_0>=20 && LA14_0<=23)) ) {
                alt14=1;
            }
            else if ( (LA14_0==27) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:989:5: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStatechartScope2306);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:999:5: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalScope_in_ruleStatechartScope2333);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1017:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1018:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1019:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInternalScope_in_entryRuleInternalScope2370);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalScope2380); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1026:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1029:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1030:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1030:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1030:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1030:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1031:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInternalScopeAccess().getInternalScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleInternalScope2426); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleInternalScope2438); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1044:1: ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||(LA16_0>=29 && LA16_0<=30)||LA16_0==34||LA16_0==40||(LA16_0>=43 && LA16_0<=48)||(LA16_0>=59 && LA16_0<=63)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1045:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1045:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1046:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1046:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    int alt15=4;
            	    switch ( input.LA(1) ) {
            	    case 29:
            	    case 59:
            	    case 60:
            	    case 61:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    case RULE_ID:
            	    case 40:
            	    case 43:
            	    case 44:
            	    case 45:
            	    case 46:
            	    case 47:
            	    case 48:
            	    case 62:
            	    case 63:
            	        {
            	        alt15=4;
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1047:3: lv_declarations_3_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInternalScope2461);
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1062:8: lv_declarations_3_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInternalScope2480);
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1077:8: lv_declarations_3_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInternalScope2499);
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1092:8: lv_declarations_3_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsLocalReactionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleInternalScope2518);
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
    // $ANTLR end "ruleInternalScope"


    // $ANTLR start "entryRuleEventDeclarartion"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1120:1: entryRuleEventDeclarartion returns [EObject current=null] : iv_ruleEventDeclarartion= ruleEventDeclarartion EOF ;
    public final EObject entryRuleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclarartion = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1121:2: (iv_ruleEventDeclarartion= ruleEventDeclarartion EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1122:2: iv_ruleEventDeclarartion= ruleEventDeclarartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarartionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion2560);
            iv_ruleEventDeclarartion=ruleEventDeclarartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclarartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclarartion2570); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1129:1: ruleEventDeclarartion returns [EObject current=null] : this_EventDefinition_0= ruleEventDefinition ;
    public final EObject ruleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject this_EventDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1132:28: (this_EventDefinition_0= ruleEventDefinition )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1134:5: this_EventDefinition_0= ruleEventDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEventDeclarartionAccess().getEventDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion2616);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1152:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1153:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1154:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition2652);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDefinition2662); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1161:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1164:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1165:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1165:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1165:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1165:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=59 && LA17_0<=61)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1166:1: (lv_direction_0_0= ruleDirection )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1166:1: (lv_direction_0_0= ruleDirection )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1167:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_ruleEventDefinition2708);
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

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleEventDefinition2721); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1187:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1188:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1188:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1189:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventDefinition2738); if (state.failed) return current;
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1205:2: (otherlv_3= ':' ( ( ruleFQN ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1205:4: otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleEventDefinition2756); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1209:1: ( ( ruleFQN ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1210:1: ( ruleFQN )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1210:1: ( ruleFQN )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1211:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getTypeTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEventDefinition2779);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1232:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1233:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1234:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2817);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration2827); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1241:1: ruleVariableDeclaration returns [EObject current=null] : this_VariableDefinition_0= ruleVariableDefinition ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1244:28: (this_VariableDefinition_0= ruleVariableDefinition )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1246:5: this_VariableDefinition_0= ruleVariableDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration2873);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1264:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1265:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1266:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition2909);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition2919); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1273:1: ruleVariableDefinition returns [EObject current=null] : ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_readonly_3_0=null;
        Token lv_external_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_initialValue_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1276:28: ( ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1277:1: ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1277:1: ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1277:2: () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1277:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1278:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleVariableDefinition2965); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableDefinitionAccess().getVarKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1287:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1289:1: ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1289:1: ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1290:2: ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1293:2: ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1294:3: ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1294:3: ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( LA19_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {
                    alt19=1;
                }
                else if ( LA19_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1296:4: ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1296:4: ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1297:5: {...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1297:115: ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1298:6: ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0);
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1301:6: ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1301:7: {...}? => ( (lv_readonly_3_0= 'readonly' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "true");
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1301:16: ( (lv_readonly_3_0= 'readonly' ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1302:1: (lv_readonly_3_0= 'readonly' )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1302:1: (lv_readonly_3_0= 'readonly' )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1303:3: lv_readonly_3_0= 'readonly'
            	    {
            	    lv_readonly_3_0=(Token)match(input,31,FOLLOW_31_in_ruleVariableDefinition3028); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_readonly_3_0, grammarAccess.getVariableDefinitionAccess().getReadonlyReadonlyKeyword_2_0_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
            	      	        }
            	             		setWithLastConsumed(current, "readonly", true, "readonly");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1323:4: ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1323:4: ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1324:5: {...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1324:115: ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1325:6: ({...}? => ( (lv_external_4_0= 'external' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1);
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1328:6: ({...}? => ( (lv_external_4_0= 'external' ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1328:7: {...}? => ( (lv_external_4_0= 'external' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "true");
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1328:16: ( (lv_external_4_0= 'external' ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1329:1: (lv_external_4_0= 'external' )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1329:1: (lv_external_4_0= 'external' )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1330:3: lv_external_4_0= 'external'
            	    {
            	    lv_external_4_0=(Token)match(input,32,FOLLOW_32_in_ruleVariableDefinition3113); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_external_4_0, grammarAccess.getVariableDefinitionAccess().getExternalExternalKeyword_2_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
            	      	        }
            	             		setWithLastConsumed(current, "external", true, "external");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());

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

            getUnorderedGroupHelper().leave(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1357:2: ( (lv_name_5_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1358:1: (lv_name_5_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1358:1: (lv_name_5_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1359:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDefinition3183); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getVariableDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 
              		
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

            otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleVariableDefinition3200); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionAccess().getColonKeyword_4());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1379:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1380:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1380:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1381:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getTypeTypeCrossReference_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleVariableDefinition3223);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1394:2: (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1394:4: otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) )
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleVariableDefinition3236); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getVariableDefinitionAccess().getEqualsSignKeyword_6_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1398:1: ( (lv_initialValue_9_0= ruleExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1399:1: (lv_initialValue_9_0= ruleExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1399:1: (lv_initialValue_9_0= ruleExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1400:3: lv_initialValue_9_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getInitialValueExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDefinition3257);
                    lv_initialValue_9_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"initialValue",
                              		lv_initialValue_9_0, 
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
    // $ANTLR end "ruleVariableDefinition"


    // $ANTLR start "entryRuleOperationDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1424:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1425:2: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1426:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration3295);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDeclaration3305); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1433:1: ruleOperationDeclaration returns [EObject current=null] : this_OperationDefinition_0= ruleOperationDefinition ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1436:28: (this_OperationDefinition_0= ruleOperationDefinition )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1438:5: this_OperationDefinition_0= ruleOperationDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOperationDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration3351);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1456:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1457:2: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1458:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition3387);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDefinition3397); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1465:1: ruleOperationDefinition returns [EObject current=null] : ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1468:28: ( ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1469:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1469:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1469:2: () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1469:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1470:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationDefinitionAccess().getOperationDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleOperationDefinition3443); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionAccess().getOperationKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1479:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1480:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1480:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1481:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperationDefinition3460); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleOperationDefinition3477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1501:1: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1501:2: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1501:2: ( (lv_parameters_4_0= ruleParameter ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1502:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1502:1: (lv_parameters_4_0= ruleParameter )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1503:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition3499);
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

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1519:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==19) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1519:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleOperationDefinition3512); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getOperationDefinitionAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1523:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1524:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1524:1: (lv_parameters_6_0= ruleParameter )
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1525:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition3533);
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
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleOperationDefinition3549); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1545:1: (otherlv_8= ':' ( ( ruleFQN ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1545:3: otherlv_8= ':' ( ( ruleFQN ) )
                    {
                    otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleOperationDefinition3562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getOperationDefinitionAccess().getColonKeyword_6_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1549:1: ( ( ruleFQN ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1550:1: ( ruleFQN )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1550:1: ( ruleFQN )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1551:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getTypeTypeCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition3585);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1572:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1573:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1574:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3623);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3633); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1581:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1584:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1585:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1585:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1585:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1585:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1586:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1586:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1587:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter3675); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleParameter3692); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1607:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1608:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1608:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1609:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleParameter3715);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1630:1: entryRuleEntrypoint returns [EObject current=null] : iv_ruleEntrypoint= ruleEntrypoint EOF ;
    public final EObject entryRuleEntrypoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntrypoint = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1631:2: (iv_ruleEntrypoint= ruleEntrypoint EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1632:2: iv_ruleEntrypoint= ruleEntrypoint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntrypointRule()); 
            }
            pushFollow(FOLLOW_ruleEntrypoint_in_entryRuleEntrypoint3751);
            iv_ruleEntrypoint=ruleEntrypoint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntrypoint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntrypoint3761); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1639:1: ruleEntrypoint returns [EObject current=null] : ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleEntrypoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1642:28: ( ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1643:1: ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1643:1: ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1643:2: () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1643:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1644:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntrypointAccess().getEntrypointAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleEntrypoint3807); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntrypointAccess().getEntrypointKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1653:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1654:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1654:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1655:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntrypoint3824); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1679:1: entryRuleExitpoint returns [EObject current=null] : iv_ruleExitpoint= ruleExitpoint EOF ;
    public final EObject entryRuleExitpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitpoint = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1680:2: (iv_ruleExitpoint= ruleExitpoint EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1681:2: iv_ruleExitpoint= ruleExitpoint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitpointRule()); 
            }
            pushFollow(FOLLOW_ruleExitpoint_in_entryRuleExitpoint3865);
            iv_ruleExitpoint=ruleExitpoint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitpoint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitpoint3875); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1688:1: ruleExitpoint returns [EObject current=null] : ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleExitpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1691:28: ( ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1692:1: ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1692:1: ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1692:2: () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1692:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1693:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitpointAccess().getExitpointAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleExitpoint3921); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitpointAccess().getExitpointKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1702:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1703:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1703:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1704:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExitpoint3938); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1728:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1729:2: (iv_ruleFQN= ruleFQN EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1730:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN3980);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN3991); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1737:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1740:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1741:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1741:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1741:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN4031); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1748:1: (kw= '.' this_ID_2= RULE_ID )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1749:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,39,FOLLOW_39_in_ruleFQN4050); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN4065); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleLocalReaction"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1771:1: entryRuleLocalReaction returns [EObject current=null] : iv_ruleLocalReaction= ruleLocalReaction EOF ;
    public final EObject entryRuleLocalReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReaction = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1772:2: (iv_ruleLocalReaction= ruleLocalReaction EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1773:2: iv_ruleLocalReaction= ruleLocalReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction4114);
            iv_ruleLocalReaction=ruleLocalReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReaction4124); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1780:1: ruleLocalReaction returns [EObject current=null] : ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) ;
    public final EObject ruleLocalReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_trigger_0_0 = null;

        EObject lv_effect_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1783:28: ( ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1784:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1784:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1784:2: ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1784:2: ( (lv_trigger_0_0= ruleReactionTrigger ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1785:1: (lv_trigger_0_0= ruleReactionTrigger )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1785:1: (lv_trigger_0_0= ruleReactionTrigger )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1786:3: lv_trigger_0_0= ruleReactionTrigger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerReactionTriggerParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReaction4170);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1802:2: ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1802:3: ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1807:6: (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1807:8: otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) )
            {
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleLocalReaction4202); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalReactionAccess().getSolidusKeyword_1_0_0());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1811:1: ( (lv_effect_2_0= ruleReactionEffect ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1812:1: (lv_effect_2_0= ruleReactionEffect )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1812:1: (lv_effect_2_0= ruleReactionEffect )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1813:3: lv_effect_2_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectReactionEffectParserRuleCall_1_0_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalReaction4223);
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


    // $ANTLR start "entryRuleReactionTrigger"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1837:1: entryRuleReactionTrigger returns [EObject current=null] : iv_ruleReactionTrigger= ruleReactionTrigger EOF ;
    public final EObject entryRuleReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionTrigger = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1838:2: (iv_ruleReactionTrigger= ruleReactionTrigger EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1839:2: iv_ruleReactionTrigger= ruleReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger4261);
            iv_ruleReactionTrigger=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionTrigger4271); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1846:1: ruleReactionTrigger returns [EObject current=null] : ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1849:28: ( ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1850:1: ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1850:1: ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1850:2: () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1850:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1851:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1856:2: ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID||(LA27_0>=43 && LA27_0<=48)||(LA27_0>=62 && LA27_0<=63)) ) {
                alt27=1;
            }
            else if ( (LA27_0==40) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1856:3: ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1856:3: ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1856:4: ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )?
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1856:4: ( (lv_triggers_1_0= ruleEventSpec ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1857:1: (lv_triggers_1_0= ruleEventSpec )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1857:1: (lv_triggers_1_0= ruleEventSpec )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1858:3: lv_triggers_1_0= ruleEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventSpec_in_ruleReactionTrigger4328);
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

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1874:2: (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==19) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1874:4: otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) )
                    	    {
                    	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleReactionTrigger4341); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getReactionTriggerAccess().getCommaKeyword_1_0_1_0());
                    	          
                    	    }
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1878:1: ( (lv_triggers_3_0= ruleEventSpec ) )
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1879:1: (lv_triggers_3_0= ruleEventSpec )
                    	    {
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1879:1: (lv_triggers_3_0= ruleEventSpec )
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1880:3: lv_triggers_3_0= ruleEventSpec
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_1_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEventSpec_in_ruleReactionTrigger4362);
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
                    	    break loop25;
                        }
                    } while (true);

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1896:4: ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==40) && (synpred2_InternalSCCExp())) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1896:5: ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']'
                            {
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1896:5: ( ( '[' )=>otherlv_4= '[' )
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1896:6: ( '[' )=>otherlv_4= '['
                            {
                            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleReactionTrigger4385); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_1_0_2_0());
                                  
                            }

                            }

                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1901:2: ( (lv_guardExpression_5_0= ruleExpression ) )
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1902:1: (lv_guardExpression_5_0= ruleExpression )
                            {
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1902:1: (lv_guardExpression_5_0= ruleExpression )
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1903:3: lv_guardExpression_5_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_1_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger4407);
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

                            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleReactionTrigger4419); if (state.failed) return current;
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1924:6: (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1924:6: (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1924:8: otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']'
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_40_in_ruleReactionTrigger4441); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_1_1_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1928:1: ( (lv_guardExpression_8_0= ruleExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1929:1: (lv_guardExpression_8_0= ruleExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1929:1: (lv_guardExpression_8_0= ruleExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1930:3: lv_guardExpression_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger4462);
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

                    otherlv_9=(Token)match(input,41,FOLLOW_41_in_ruleReactionTrigger4474); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1958:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1959:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1960:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect4512);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionEffect4522); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1967:1: ruleReactionEffect returns [EObject current=null] : ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_3_1 = null;

        EObject lv_actions_3_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1970:28: ( ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1971:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1971:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1971:2: () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1971:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1972:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1977:2: ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1978:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1978:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1979:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1979:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)||LA28_0==35||LA28_0==53||(LA28_0>=57 && LA28_0<=58)||(LA28_0>=76 && LA28_0<=77)||LA28_0==80) ) {
                alt28=1;
            }
            else if ( (LA28_0==49) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1980:3: lv_actions_1_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect4579);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1995:8: lv_actions_1_2= ruleEventRaisingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4598);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2013:2: ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==17) && (synpred3_InternalSCCExp())) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2013:3: ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2013:3: ( ( ';' )=>otherlv_2= ';' )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2013:4: ( ';' )=>otherlv_2= ';'
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleReactionEffect4622); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReactionEffectAccess().getSemicolonKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2018:2: ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2019:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2019:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2020:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2020:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_STRING)||LA29_0==35||LA29_0==53||(LA29_0>=57 && LA29_0<=58)||(LA29_0>=76 && LA29_0<=77)||LA29_0==80) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==49) ) {
            	        alt29=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2021:3: lv_actions_3_1= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect4646);
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2036:8: lv_actions_3_2= ruleEventRaisingExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_2_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4665);
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
    // $ANTLR end "ruleReactionEffect"


    // $ANTLR start "entryRuleReactionProperties"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2062:1: entryRuleReactionProperties returns [EObject current=null] : iv_ruleReactionProperties= ruleReactionProperties EOF ;
    public final EObject entryRuleReactionProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionProperties = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2063:2: (iv_ruleReactionProperties= ruleReactionProperties EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2064:2: iv_ruleReactionProperties= ruleReactionProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionPropertiesRule()); 
            }
            pushFollow(FOLLOW_ruleReactionProperties_in_entryRuleReactionProperties4706);
            iv_ruleReactionProperties=ruleReactionProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionProperties; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionProperties4716); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2071:1: ruleReactionProperties returns [EObject current=null] : ( () ( (lv_properties_1_0= ruleReactionProperty ) )* ) ;
    public final EObject ruleReactionProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2074:28: ( ( () ( (lv_properties_1_0= ruleReactionProperty ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2075:1: ( () ( (lv_properties_1_0= ruleReactionProperty ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2075:1: ( () ( (lv_properties_1_0= ruleReactionProperty ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2075:2: () ( (lv_properties_1_0= ruleReactionProperty ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2075:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2076:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionPropertiesAccess().getReactionPropertiesAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2081:2: ( (lv_properties_1_0= ruleReactionProperty ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||LA31_0==42) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2082:1: (lv_properties_1_0= ruleReactionProperty )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2082:1: (lv_properties_1_0= ruleReactionProperty )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2083:3: lv_properties_1_0= ruleReactionProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReactionPropertiesAccess().getPropertiesReactionPropertyParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleReactionProperty_in_ruleReactionProperties4771);
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
            	    break loop31;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2107:1: entryRuleReactionProperty returns [EObject current=null] : iv_ruleReactionProperty= ruleReactionProperty EOF ;
    public final EObject entryRuleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionProperty = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2108:2: (iv_ruleReactionProperty= ruleReactionProperty EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2109:2: iv_ruleReactionProperty= ruleReactionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReactionProperty_in_entryRuleReactionProperty4808);
            iv_ruleReactionProperty=ruleReactionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionProperty4818); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2116:1: ruleReactionProperty returns [EObject current=null] : (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) ;
    public final EObject ruleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_EntryPointSpec_0 = null;

        EObject this_ExitPointSpec_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2119:28: ( (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2120:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2120:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_ID) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2121:5: this_EntryPointSpec_0= ruleEntryPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReactionPropertyAccess().getEntryPointSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryPointSpec_in_ruleReactionProperty4865);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2131:5: this_ExitPointSpec_1= ruleExitPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReactionPropertyAccess().getExitPointSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitPointSpec_in_ruleReactionProperty4892);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2147:1: entryRuleEntryPointSpec returns [EObject current=null] : iv_ruleEntryPointSpec= ruleEntryPointSpec EOF ;
    public final EObject entryRuleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryPointSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2148:2: (iv_ruleEntryPointSpec= ruleEntryPointSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2149:2: iv_ruleEntryPointSpec= ruleEntryPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec4927);
            iv_ruleEntryPointSpec=ruleEntryPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryPointSpec4937); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2156:1: ruleEntryPointSpec returns [EObject current=null] : (otherlv_0= '>' ( ( ruleFQN ) ) ) ;
    public final EObject ruleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2159:28: ( (otherlv_0= '>' ( ( ruleFQN ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2160:1: (otherlv_0= '>' ( ( ruleFQN ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2160:1: (otherlv_0= '>' ( ( ruleFQN ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2160:3: otherlv_0= '>' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleEntryPointSpec4974); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntryPointSpecAccess().getGreaterThanSignKeyword_0());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2164:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2165:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2165:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2166:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEntryPointSpecRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntryPointSpecAccess().getEntrypointEntrypointCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleEntryPointSpec4997);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2187:1: entryRuleExitPointSpec returns [EObject current=null] : iv_ruleExitPointSpec= ruleExitPointSpec EOF ;
    public final EObject entryRuleExitPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitPointSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2188:2: (iv_ruleExitPointSpec= ruleExitPointSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2189:2: iv_ruleExitPointSpec= ruleExitPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec5033);
            iv_ruleExitPointSpec=ruleExitPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitPointSpec5043); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2196:1: ruleExitPointSpec returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= '>' ) ;
    public final EObject ruleExitPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2199:28: ( ( ( ( ruleFQN ) ) otherlv_1= '>' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2200:1: ( ( ( ruleFQN ) ) otherlv_1= '>' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2200:1: ( ( ( ruleFQN ) ) otherlv_1= '>' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2200:2: ( ( ruleFQN ) ) otherlv_1= '>'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2200:2: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2201:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2201:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2202:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExitPointSpecRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExitPointSpecAccess().getExitpointExitpointCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleExitPointSpec5091);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleExitPointSpec5103); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2227:1: entryRuleEventSpec returns [EObject current=null] : iv_ruleEventSpec= ruleEventSpec EOF ;
    public final EObject entryRuleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2228:2: (iv_ruleEventSpec= ruleEventSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2229:2: iv_ruleEventSpec= ruleEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEventSpec_in_entryRuleEventSpec5139);
            iv_ruleEventSpec=ruleEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventSpec5149); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2236:1: ruleEventSpec returns [EObject current=null] : (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) ;
    public final EObject ruleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_RegularEventSpec_0 = null;

        EObject this_TimeEventSpec_1 = null;

        EObject this_BuiltinEventSpec_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2239:28: ( (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2240:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2240:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
            int alt33=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt33=1;
                }
                break;
            case 62:
            case 63:
                {
                alt33=2;
                }
                break;
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt33=3;
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2241:5: this_RegularEventSpec_0= ruleRegularEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getRegularEventSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRegularEventSpec_in_ruleEventSpec5196);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2251:5: this_TimeEventSpec_1= ruleTimeEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getTimeEventSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTimeEventSpec_in_ruleEventSpec5223);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2261:5: this_BuiltinEventSpec_2= ruleBuiltinEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getBuiltinEventSpecParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBuiltinEventSpec_in_ruleEventSpec5250);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2277:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2278:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2279:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5285);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularEventSpec5295); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2286:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2289:28: ( ( (lv_event_0_0= ruleFeatureCall ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2290:1: ( (lv_event_0_0= ruleFeatureCall ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2290:1: ( (lv_event_0_0= ruleFeatureCall ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2291:1: (lv_event_0_0= ruleFeatureCall )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2291:1: (lv_event_0_0= ruleFeatureCall )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2292:3: lv_event_0_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5340);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2316:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2317:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2318:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5375);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeEventSpec5385); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2325:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_type_0_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2328:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2329:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2329:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2329:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2329:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2330:1: (lv_type_0_0= ruleTimeEventType )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2330:1: (lv_type_0_0= ruleTimeEventType )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2331:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5431);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2347:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2348:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2348:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2349:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeEventSpec5448); if (state.failed) return current;
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2365:2: ( (lv_unit_2_0= ruleTimeUnit ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=86 && LA34_0<=89)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2366:1: (lv_unit_2_0= ruleTimeUnit )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2366:1: (lv_unit_2_0= ruleTimeUnit )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2367:3: lv_unit_2_0= ruleTimeUnit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5474);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2391:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2392:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2393:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5511);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinEventSpec5521); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2400:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_OnCycleEvent_2 = null;

        EObject this_AlwaysEvent_3 = null;

        EObject this_DefaultEvent_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2403:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2404:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2404:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent )
            int alt35=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt35=1;
                }
                break;
            case 44:
                {
                alt35=2;
                }
                break;
            case 45:
                {
                alt35=3;
                }
                break;
            case 46:
                {
                alt35=4;
                }
                break;
            case 47:
            case 48:
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2405:5: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5568);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2415:5: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5595);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2425:5: this_OnCycleEvent_2= ruleOnCycleEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getOnCycleEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOnCycleEvent_in_ruleBuiltinEventSpec5622);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2435:5: this_AlwaysEvent_3= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec5649);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2445:5: this_DefaultEvent_4= ruleDefaultEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getDefaultEventParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultEvent_in_ruleBuiltinEventSpec5676);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2461:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2462:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2463:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent5711);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryEvent5721); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2470:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2473:28: ( ( () otherlv_1= 'entry' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2474:1: ( () otherlv_1= 'entry' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2474:1: ( () otherlv_1= 'entry' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2474:2: () otherlv_1= 'entry'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2474:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2475:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryEventAccess().getEntryEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleEntryEvent5767); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2492:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2493:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2494:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent5803);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent5813); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2501:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2504:28: ( ( () otherlv_1= 'exit' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2505:1: ( () otherlv_1= 'exit' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2505:1: ( () otherlv_1= 'exit' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2505:2: () otherlv_1= 'exit'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2505:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2506:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitEventAccess().getExitEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleExitEvent5859); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2523:1: entryRuleOnCycleEvent returns [EObject current=null] : iv_ruleOnCycleEvent= ruleOnCycleEvent EOF ;
    public final EObject entryRuleOnCycleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnCycleEvent = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2524:2: (iv_ruleOnCycleEvent= ruleOnCycleEvent EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2525:2: iv_ruleOnCycleEvent= ruleOnCycleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOnCycleEventRule()); 
            }
            pushFollow(FOLLOW_ruleOnCycleEvent_in_entryRuleOnCycleEvent5895);
            iv_ruleOnCycleEvent=ruleOnCycleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOnCycleEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnCycleEvent5905); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2532:1: ruleOnCycleEvent returns [EObject current=null] : ( () otherlv_1= 'oncycle' ) ;
    public final EObject ruleOnCycleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2535:28: ( ( () otherlv_1= 'oncycle' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2536:1: ( () otherlv_1= 'oncycle' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2536:1: ( () otherlv_1= 'oncycle' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2536:2: () otherlv_1= 'oncycle'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2536:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2537:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOnCycleEventAccess().getOnCycleEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleOnCycleEvent5951); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2554:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2555:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2556:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent5987);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEvent5997); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2563:1: ruleAlwaysEvent returns [EObject current=null] : ( () otherlv_1= 'always' ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2566:28: ( ( () otherlv_1= 'always' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2567:1: ( () otherlv_1= 'always' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2567:1: ( () otherlv_1= 'always' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2567:2: () otherlv_1= 'always'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2567:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2568:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlwaysEventAccess().getAlwaysEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleAlwaysEvent6043); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2585:1: entryRuleDefaultEvent returns [EObject current=null] : iv_ruleDefaultEvent= ruleDefaultEvent EOF ;
    public final EObject entryRuleDefaultEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultEvent = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2586:2: (iv_ruleDefaultEvent= ruleDefaultEvent EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2587:2: iv_ruleDefaultEvent= ruleDefaultEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultEventRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultEvent_in_entryRuleDefaultEvent6079);
            iv_ruleDefaultEvent=ruleDefaultEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultEvent6089); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2594:1: ruleDefaultEvent returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2597:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2598:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2598:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2598:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2598:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2599:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultEventAccess().getDefaultEventAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2604:2: (otherlv_1= 'default' | otherlv_2= 'else' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                alt36=1;
            }
            else if ( (LA36_0==48) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2604:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleDefaultEvent6136); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultEventAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2609:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleDefaultEvent6154); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2621:1: entryRuleEventRaisingExpression returns [EObject current=null] : iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF ;
    public final EObject entryRuleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventRaisingExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2622:2: (iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2623:2: iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRaisingExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventRaisingExpression_in_entryRuleEventRaisingExpression6191);
            iv_ruleEventRaisingExpression=ruleEventRaisingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventRaisingExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventRaisingExpression6201); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2630:1: ruleEventRaisingExpression returns [EObject current=null] : ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_event_2_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2633:28: ( ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2634:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2634:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2634:2: () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2634:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2635:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventRaisingExpressionAccess().getEventRaisingExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleEventRaisingExpression6247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventRaisingExpressionAccess().getRaiseKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2644:1: ( (lv_event_2_0= ruleFeatureCall ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2645:1: (lv_event_2_0= ruleFeatureCall )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2645:1: (lv_event_2_0= ruleFeatureCall )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2646:3: lv_event_2_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getEventFeatureCallParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventRaisingExpression6268);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2662:2: (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==28) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2662:4: otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleEventRaisingExpression6281); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventRaisingExpressionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2666:1: ( (lv_value_4_0= ruleExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2667:1: (lv_value_4_0= ruleExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2667:1: (lv_value_4_0= ruleExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2668:3: lv_value_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getValueExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleEventRaisingExpression6302);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2694:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2695:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2696:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6342);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6352); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2703:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2706:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2708:5: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpression6398);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2724:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2725:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2726:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6432);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression6442); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2733:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2736:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2737:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2737:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2738:5: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6489);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2746:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==33||(LA38_0>=64 && LA38_0<=73)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2746:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2746:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2747:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2752:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2753:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2753:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2754:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6519);
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

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2770:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2771:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2771:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2772:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6540);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2796:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2797:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2798:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6578);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression6588); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2805:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2808:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2809:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2809:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2810:5: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6635);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2818:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==50) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2818:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2818:2: ()
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2819:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleConditionalExpression6656); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2828:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2829:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2829:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2830:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6677);
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

                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleConditionalExpression6689); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2850:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2851:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2851:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2852:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6710);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2876:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2877:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2878:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6748);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression6758); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2885:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2888:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2889:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2889:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2890:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6805);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2898:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==51) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2898:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2898:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2899:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleLogicalOrExpression6826); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2908:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2909:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2909:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2910:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6847);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2934:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2935:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2936:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6885);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression6895); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2943:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2946:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2947:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2947:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2948:5: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6942);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2956:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==52) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2956:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2956:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2957:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleLogicalAndExpression6963); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2966:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2967:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2967:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2968:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6984);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2992:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2993:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2994:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression7022);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNotExpression7032); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3001:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3004:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3005:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3005:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_STRING)||LA42_0==35||(LA42_0>=57 && LA42_0<=58)||(LA42_0>=76 && LA42_0<=77)||LA42_0==80) ) {
                alt42=1;
            }
            else if ( (LA42_0==53) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3006:5: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7079);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3015:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3015:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3015:7: () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3015:7: ()
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3016:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalNotExpressionAccess().getLogicalNotExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleLogicalNotExpression7106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLogicalNotExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3025:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3026:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3026:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3027:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7127);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3051:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3052:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3053:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7164);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression7174); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3060:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3063:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3064:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3064:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3065:5: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7221);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3073:1: ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==54) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3073:2: () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3073:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3074:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleBitwiseXorExpression7242); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3083:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3084:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3084:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3085:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7263);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3109:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3110:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3111:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7301);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression7311); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3118:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3121:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3122:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3122:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3123:5: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7358);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3131:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==55) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3131:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3131:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3132:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleBitwiseOrExpression7379); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3141:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3142:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3142:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3143:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7400);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3167:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3168:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3169:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7438);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression7448); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3176:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3179:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3180:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3180:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3181:5: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7495);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3189:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==56) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3189:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3189:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3190:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleBitwiseAndExpression7516); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3199:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3200:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3200:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3201:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7537);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3225:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3226:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3227:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7575);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalRelationExpression7585); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3234:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3237:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3238:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3238:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3239:5: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7632);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3247:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==42||(LA46_0>=81 && LA46_0<=85)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3247:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3247:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3248:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3253:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3254:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3254:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3255:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7662);
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

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3271:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3272:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3272:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3273:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7683);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3297:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3298:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3299:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7721);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression7731); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3306:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3309:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3310:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3310:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3311:5: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7778);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3319:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=74 && LA47_0<=75)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3319:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3319:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3320:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3325:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3326:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3326:1: (lv_operator_2_0= ruleShiftOperator )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3327:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression7808);
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

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3343:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3344:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3344:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3345:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7829);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3369:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3370:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3371:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7867);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7877); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3378:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3381:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3382:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3382:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3383:5: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7924);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3391:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=76 && LA48_0<=77)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3391:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3391:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3392:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3397:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3398:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3398:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3399:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7954);
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

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3415:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3416:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3416:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3417:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7975);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3441:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3442:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3443:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression8013);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression8023); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3450:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3453:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3454:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3454:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3455:5: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8070);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3463:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==18||(LA49_0>=78 && LA49_0<=79)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3463:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3463:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3464:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3469:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3470:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3470:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3471:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8100);
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

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3487:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3488:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3488:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3489:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8121);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3513:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3514:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3515:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8159);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8169); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3522:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3525:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3526:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3526:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_STRING)||LA50_0==35||(LA50_0>=57 && LA50_0<=58)) ) {
                alt50=1;
            }
            else if ( ((LA50_0>=76 && LA50_0<=77)||LA50_0==80) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3527:5: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8216);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3536:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3536:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3536:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3536:7: ()
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3537:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumericalUnaryExpressionAccess().getNumericalUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3542:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3543:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3543:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3544:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8252);
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

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3560:2: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3561:1: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3561:1: (lv_operand_3_0= rulePrimaryExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3562:3: lv_operand_3_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8273);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3586:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3587:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3588:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression8310);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression8320); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3595:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3598:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3599:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3599:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
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
            case 58:
                {
                alt51=3;
                }
                break;
            case 57:
                {
                alt51=4;
                }
                break;
            case 35:
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3600:5: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrimitiveValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression8367);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3610:5: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression8394);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3620:5: this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getActiveStateReferenceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression8421);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3630:5: this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEventValueReferenceExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression8448);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3639:6: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3639:6: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3639:8: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_rulePrimaryExpression8466); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression8488);
                    this_Expression_5=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_rulePrimaryExpression8499); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3664:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3665:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3666:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8536);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValueExpression8546); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3673:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3676:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3677:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3677:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3677:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3677:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3678:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveValueExpressionAccess().getPrimitiveValueExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3683:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3684:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3684:1: (lv_value_1_0= ruleLiteral )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3685:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8601);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3709:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3710:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3711:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8637);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall8647); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3718:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3721:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3722:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3722:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3723:5: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8694);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3731:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==39) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3731:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3731:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3732:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleFeatureCall8715); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3741:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3742:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3742:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3743:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureCall8735); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3754:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==35) && (synpred4_InternalSCCExp())) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3754:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3754:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3754:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3761:1: (lv_operationCall_4_0= '(' )
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3762:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,35,FOLLOW_35_in_ruleFeatureCall8769); if (state.failed) return current;
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

            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3775:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt53=2;
            	            int LA53_0 = input.LA(1);

            	            if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_STRING)||LA53_0==35||LA53_0==53||(LA53_0>=57 && LA53_0<=58)||(LA53_0>=76 && LA53_0<=77)||LA53_0==80) ) {
            	                alt53=1;
            	            }
            	            switch (alt53) {
            	                case 1 :
            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3775:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3775:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3776:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3776:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3777:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8804);
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

            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3793:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop52:
            	                    do {
            	                        int alt52=2;
            	                        int LA52_0 = input.LA(1);

            	                        if ( (LA52_0==19) ) {
            	                            alt52=1;
            	                        }


            	                        switch (alt52) {
            	                    	case 1 :
            	                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3793:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleFeatureCall8817); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3797:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3798:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3798:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3799:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8838);
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

            	            otherlv_8=(Token)match(input,36,FOLLOW_36_in_ruleFeatureCall8854); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3827:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3828:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3829:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8894);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementReferenceExpression8904); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3836:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3839:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3840:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3840:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3840:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3840:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3841:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementReferenceExpressionAccess().getElementReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3846:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3847:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3847:1: (otherlv_1= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3848:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementReferenceExpression8958); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3859:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==35) && (synpred5_InternalSCCExp())) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3859:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3859:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3859:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3866:1: (lv_operationCall_2_0= '(' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3867:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,35,FOLLOW_35_in_ruleElementReferenceExpression8992); if (state.failed) return current;
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

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3880:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_STRING)||LA57_0==35||LA57_0==53||(LA57_0>=57 && LA57_0<=58)||(LA57_0>=76 && LA57_0<=77)||LA57_0==80) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3880:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3880:3: ( (lv_args_3_0= ruleExpression ) )
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3881:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3881:1: (lv_args_3_0= ruleExpression )
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3882:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression9027);
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

                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3898:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==19) ) {
                                    alt56=1;
                                }


                                switch (alt56) {
                            	case 1 :
                            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3898:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleElementReferenceExpression9040); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3902:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3903:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3903:1: (lv_args_5_0= ruleExpression )
                            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3904:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression9061);
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

                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleElementReferenceExpression9077); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3932:1: entryRuleEventValueReferenceExpression returns [EObject current=null] : iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF ;
    public final EObject entryRuleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventValueReferenceExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3933:2: (iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3934:2: iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventValueReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression9115);
            iv_ruleEventValueReferenceExpression=ruleEventValueReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventValueReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventValueReferenceExpression9125); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3941:1: ruleEventValueReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject ruleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3944:28: ( ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3945:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3945:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3945:2: () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3945:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3946:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventValueReferenceExpressionAccess().getEventValueReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleEventValueReferenceExpression9171); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventValueReferenceExpressionAccess().getValueofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleEventValueReferenceExpression9183); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventValueReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3959:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3960:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3960:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3961:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventValueReferenceExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression9204);
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

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleEventValueReferenceExpression9216); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3989:1: entryRuleActiveStateReferenceExpression returns [EObject current=null] : iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF ;
    public final EObject entryRuleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveStateReferenceExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3990:2: (iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3991:2: iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveStateReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression9252);
            iv_ruleActiveStateReferenceExpression=ruleActiveStateReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveStateReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression9262); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3998:1: ruleActiveStateReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4001:28: ( ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4002:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4002:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4002:2: () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4002:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4003:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActiveStateReferenceExpressionAccess().getActiveStateReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleActiveStateReferenceExpression9308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActiveStateReferenceExpressionAccess().getActiveKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleActiveStateReferenceExpression9320); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActiveStateReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4016:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4017:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4017:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4018:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActiveStateReferenceExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActiveStateReferenceExpressionAccess().getValueStateCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9343);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleActiveStateReferenceExpression9355); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4043:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4044:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4045:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral9391);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral9401); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4052:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_RealLiteral_3 = null;

        EObject this_StringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4055:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4056:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4056:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4057:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral9448);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4067:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral9475);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4077:5: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexLiteral_in_ruleLiteral9502);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4087:5: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleLiteral9529);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4097:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral9556);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4113:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4114:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4115:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9591);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral9601); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4122:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4125:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4126:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4126:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4126:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4126:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4127:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4132:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4133:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4133:1: (lv_value_1_0= RULE_BOOL )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4134:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral9652); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4158:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4159:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4160:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9693);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral9703); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4167:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4170:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4171:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4171:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4171:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4171:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4172:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4177:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4178:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4178:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4179:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral9754); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4203:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4204:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4205:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9795);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral9805); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4212:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4215:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4216:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4216:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4216:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4216:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4217:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4222:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4223:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4223:1: (lv_value_1_0= RULE_FLOAT )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4224:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleRealLiteral9856); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4248:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4249:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4250:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9897);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexLiteral9907); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4257:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4260:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4261:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4261:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4261:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4261:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4262:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHexLiteralAccess().getHexLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4267:2: ( (lv_value_1_0= RULE_HEX ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4268:1: (lv_value_1_0= RULE_HEX )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4268:1: (lv_value_1_0= RULE_HEX )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4269:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleHexLiteral9958); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4293:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4294:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4295:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9999);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral10009); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4302:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4305:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4306:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4306:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4306:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4306:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4307:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4312:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4313:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4313:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4314:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral10060); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4338:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4340:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4341:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4341:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt60=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt60=1;
                }
                break;
            case 60:
                {
                alt60=2;
                }
                break;
            case 61:
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4341:2: (enumLiteral_0= 'local' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4341:2: (enumLiteral_0= 'local' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4341:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_59_in_ruleDirection10115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4347:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4347:6: (enumLiteral_1= 'in' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4347:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_60_in_ruleDirection10132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4353:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4353:6: (enumLiteral_2= 'out' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4353:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_61_in_ruleDirection10149); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4363:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4365:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4366:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4366:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4366:2: (enumLiteral_0= 'after' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4366:2: (enumLiteral_0= 'after' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4366:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_62_in_ruleTimeEventType10194); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4372:6: (enumLiteral_1= 'every' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4372:6: (enumLiteral_1= 'every' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4372:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_63_in_ruleTimeEventType10211); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4382:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4384:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4385:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4385:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            int alt62=11;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt62=1;
                }
                break;
            case 64:
                {
                alt62=2;
                }
                break;
            case 65:
                {
                alt62=3;
                }
                break;
            case 66:
                {
                alt62=4;
                }
                break;
            case 67:
                {
                alt62=5;
                }
                break;
            case 68:
                {
                alt62=6;
                }
                break;
            case 69:
                {
                alt62=7;
                }
                break;
            case 70:
                {
                alt62=8;
                }
                break;
            case 71:
                {
                alt62=9;
                }
                break;
            case 72:
                {
                alt62=10;
                }
                break;
            case 73:
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4385:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4385:2: (enumLiteral_0= '=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4385:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_33_in_ruleAssignmentOperator10256); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4391:6: (enumLiteral_1= '*=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4391:6: (enumLiteral_1= '*=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4391:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_64_in_ruleAssignmentOperator10273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4397:6: (enumLiteral_2= '/=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4397:6: (enumLiteral_2= '/=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4397:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_65_in_ruleAssignmentOperator10290); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4403:6: (enumLiteral_3= '%=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4403:6: (enumLiteral_3= '%=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4403:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_66_in_ruleAssignmentOperator10307); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4409:6: (enumLiteral_4= '+=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4409:6: (enumLiteral_4= '+=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4409:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,67,FOLLOW_67_in_ruleAssignmentOperator10324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4415:6: (enumLiteral_5= '-=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4415:6: (enumLiteral_5= '-=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4415:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,68,FOLLOW_68_in_ruleAssignmentOperator10341); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4421:6: (enumLiteral_6= '<<=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4421:6: (enumLiteral_6= '<<=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4421:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,69,FOLLOW_69_in_ruleAssignmentOperator10358); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4427:6: (enumLiteral_7= '>>=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4427:6: (enumLiteral_7= '>>=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4427:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,70,FOLLOW_70_in_ruleAssignmentOperator10375); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4433:6: (enumLiteral_8= '&=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4433:6: (enumLiteral_8= '&=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4433:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,71,FOLLOW_71_in_ruleAssignmentOperator10392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4439:6: (enumLiteral_9= '^=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4439:6: (enumLiteral_9= '^=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4439:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,72,FOLLOW_72_in_ruleAssignmentOperator10409); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4445:6: (enumLiteral_10= '|=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4445:6: (enumLiteral_10= '|=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4445:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,73,FOLLOW_73_in_ruleAssignmentOperator10426); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4455:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4457:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4458:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4458:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==74) ) {
                alt63=1;
            }
            else if ( (LA63_0==75) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4458:2: (enumLiteral_0= '<<' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4458:2: (enumLiteral_0= '<<' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4458:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_74_in_ruleShiftOperator10471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4464:6: (enumLiteral_1= '>>' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4464:6: (enumLiteral_1= '>>' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4464:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_75_in_ruleShiftOperator10488); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4474:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4476:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4477:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4477:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==76) ) {
                alt64=1;
            }
            else if ( (LA64_0==77) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4477:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4477:2: (enumLiteral_0= '+' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4477:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_76_in_ruleAdditiveOperator10533); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4483:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4483:6: (enumLiteral_1= '-' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4483:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_77_in_ruleAdditiveOperator10550); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4493:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4495:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4496:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4496:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt65=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt65=1;
                }
                break;
            case 18:
                {
                alt65=2;
                }
                break;
            case 79:
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4496:2: (enumLiteral_0= '*' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4496:2: (enumLiteral_0= '*' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4496:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_78_in_ruleMultiplicativeOperator10595); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4502:6: (enumLiteral_1= '/' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4502:6: (enumLiteral_1= '/' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4502:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_18_in_ruleMultiplicativeOperator10612); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4508:6: (enumLiteral_2= '%' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4508:6: (enumLiteral_2= '%' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4508:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_79_in_ruleMultiplicativeOperator10629); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4518:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4520:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4521:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4521:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            int alt66=3;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt66=1;
                }
                break;
            case 77:
                {
                alt66=2;
                }
                break;
            case 80:
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4521:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4521:2: (enumLiteral_0= '+' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4521:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_76_in_ruleUnaryOperator10674); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4527:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4527:6: (enumLiteral_1= '-' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4527:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_77_in_ruleUnaryOperator10691); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4533:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4533:6: (enumLiteral_2= '~' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4533:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,80,FOLLOW_80_in_ruleUnaryOperator10708); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4543:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4545:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4546:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4546:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt67=6;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt67=1;
                }
                break;
            case 82:
                {
                alt67=2;
                }
                break;
            case 42:
                {
                alt67=3;
                }
                break;
            case 83:
                {
                alt67=4;
                }
                break;
            case 84:
                {
                alt67=5;
                }
                break;
            case 85:
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4546:2: (enumLiteral_0= '<' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4546:2: (enumLiteral_0= '<' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4546:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_81_in_ruleRelationalOperator10753); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4552:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4552:6: (enumLiteral_1= '<=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4552:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_82_in_ruleRelationalOperator10770); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4558:6: (enumLiteral_2= '>' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4558:6: (enumLiteral_2= '>' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4558:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_42_in_ruleRelationalOperator10787); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4564:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4564:6: (enumLiteral_3= '>=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4564:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,83,FOLLOW_83_in_ruleRelationalOperator10804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4570:6: (enumLiteral_4= '==' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4570:6: (enumLiteral_4= '==' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4570:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,84,FOLLOW_84_in_ruleRelationalOperator10821); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4576:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4576:6: (enumLiteral_5= '!=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4576:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,85,FOLLOW_85_in_ruleRelationalOperator10838); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4586:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4588:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4589:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4589:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            int alt68=4;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt68=1;
                }
                break;
            case 87:
                {
                alt68=2;
                }
                break;
            case 88:
                {
                alt68=3;
                }
                break;
            case 89:
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4589:2: (enumLiteral_0= 's' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4589:2: (enumLiteral_0= 's' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4589:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_86_in_ruleTimeUnit10883); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4595:6: (enumLiteral_1= 'ms' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4595:6: (enumLiteral_1= 'ms' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4595:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_87_in_ruleTimeUnit10900); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4601:6: (enumLiteral_2= 'us' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4601:6: (enumLiteral_2= 'us' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4601:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,88,FOLLOW_88_in_ruleTimeUnit10917); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4607:6: (enumLiteral_3= 'ns' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4607:6: (enumLiteral_3= 'ns' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4607:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,89,FOLLOW_89_in_ruleTimeUnit10934); if (state.failed) return current;
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

    // $ANTLR start synpred2_InternalSCCExp
    public final void synpred2_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1896:6: ( '[' )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1896:8: '['
        {
        match(input,40,FOLLOW_40_in_synpred2_InternalSCCExp4377); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalSCCExp

    // $ANTLR start synpred3_InternalSCCExp
    public final void synpred3_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2013:4: ( ';' )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2013:6: ';'
        {
        match(input,17,FOLLOW_17_in_synpred3_InternalSCCExp4614); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalSCCExp

    // $ANTLR start synpred4_InternalSCCExp
    public final void synpred4_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3754:4: ( ( '(' ) )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3755:1: ( '(' )
        {
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3755:1: ( '(' )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3756:2: '('
        {
        match(input,35,FOLLOW_35_in_synpred4_InternalSCCExp8751); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalSCCExp

    // $ANTLR start synpred5_InternalSCCExp
    public final void synpred5_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3859:4: ( ( '(' ) )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3860:1: ( '(' )
        {
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3860:1: ( '(' )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3861:2: '('
        {
        match(input,35,FOLLOW_35_in_synpred5_InternalSCCExp8974); if (state.failed) return ;

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
    public final boolean synpred2_InternalSCCExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSCCExp_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoot85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRoot_in_ruleRoot130 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_ruleDefRoot_in_entryRuleDefRoot166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRoot176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_ruleDefRoot223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_ruleDefRoot250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_entryRuleStateRoot285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateRoot295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStateRoot332 = new BitSet(new long[]{0x0000000000F10000L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleStateRoot353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionRoot399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleTransitionRoot436 = new BitSet(new long[]{0x0000000003040000L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_entryRuleStateScope493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateScope503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScopeRoot_in_ruleStateScope549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScopeRoot_in_entryRuleInterfaceScopeRoot583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScopeRoot593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleInterfaceScopeRoot648 = new BitSet(new long[]{0x0000000000F10002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScope695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDeclaration_in_ruleInterfaceScope742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionDeclaration_in_ruleInterfaceScope769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspendDeclaration_in_ruleInterfaceScope796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDeclaration_in_entryRuleInterfaceDeclaration831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDeclaration841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleInterfaceDeclaration887 = new BitSet(new long[]{0x3800006460020000L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInterfaceDeclaration910 = new BitSet(new long[]{0x3800006460020000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInterfaceDeclaration929 = new BitSet(new long[]{0x3800006460020000L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInterfaceDeclaration948 = new BitSet(new long[]{0x3800006460020000L});
    public static final BitSet FOLLOW_ruleEntrypoint_in_ruleInterfaceDeclaration967 = new BitSet(new long[]{0x3800006460020000L});
    public static final BitSet FOLLOW_ruleExitpoint_in_ruleInterfaceDeclaration986 = new BitSet(new long[]{0x3800006460020000L});
    public static final BitSet FOLLOW_17_in_ruleInterfaceDeclaration1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionDeclaration_in_entryRuleActionDeclaration1038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionDeclaration1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryActionDeclaration_in_ruleActionDeclaration1096 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleInsideActionDeclaration_in_ruleActionDeclaration1123 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleExitActionDeclaration_in_ruleActionDeclaration1150 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleActionDeclaration1162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionDeclaration1179 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_19_in_ruleActionDeclaration1197 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleActionDeclaration1209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionDeclaration1220 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_17_in_ruleActionDeclaration1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitActionDeclaration_in_entryRuleExitActionDeclaration1269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitActionDeclaration1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleExitActionDeclaration1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsideActionDeclaration_in_entryRuleInsideActionDeclaration1361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsideActionDeclaration1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleInsideActionDeclaration1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryActionDeclaration_in_entryRuleEntryActionDeclaration1453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryActionDeclaration1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEntryActionDeclaration1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspendDeclaration_in_entryRuleSuspendDeclaration1545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuspendDeclaration1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSuspendDeclaration1601 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSuspendDeclaration1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction1659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionReaction1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyTrigger_in_ruleTransitionReaction1724 = new BitSet(new long[]{0x0000000001040002L});
    public static final BitSet FOLLOW_18_in_ruleTransitionReaction1738 = new BitSet(new long[]{0x06220008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransitionReaction1759 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleTransitionReaction1774 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_ruleReactionProperties_in_ruleTransitionReaction1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyTrigger_in_entryRuleMyTrigger1833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMyTrigger1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMyTrigger1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification1929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartSpecification1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleStatechartSpecification1986 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleStatechartSpecification2007 = new BitSet(new long[]{0x0000000008F10002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification2030 = new BitSet(new long[]{0x0000000008F10002L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification2067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateSpecification2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_ruleStateSpecification2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification2157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope2249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartScope2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStatechartScope2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_ruleStatechartScope2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_entryRuleInternalScope2370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalScope2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleInternalScope2426 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleInternalScope2438 = new BitSet(new long[]{0xF801F90460000012L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInternalScope2461 = new BitSet(new long[]{0xF801F90460000012L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInternalScope2480 = new BitSet(new long[]{0xF801F90460000012L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInternalScope2499 = new BitSet(new long[]{0xF801F90460000012L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleInternalScope2518 = new BitSet(new long[]{0xF801F90460000012L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion2560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclarartion2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition2652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDefinition2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleEventDefinition2708 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleEventDefinition2721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventDefinition2738 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleEventDefinition2756 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEventDefinition2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition2909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleVariableDefinition2965 = new BitSet(new long[]{0x0000000180000010L});
    public static final BitSet FOLLOW_31_in_ruleVariableDefinition3028 = new BitSet(new long[]{0x0000000180000010L});
    public static final BitSet FOLLOW_32_in_ruleVariableDefinition3113 = new BitSet(new long[]{0x0000000180000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDefinition3183 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleVariableDefinition3200 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleVariableDefinition3223 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleVariableDefinition3236 = new BitSet(new long[]{0x06200008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDefinition3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration3295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDeclaration3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition3387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDefinition3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOperationDefinition3443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperationDefinition3460 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleOperationDefinition3477 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition3499 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_19_in_ruleOperationDefinition3512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition3533 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_36_in_ruleOperationDefinition3549 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleOperationDefinition3562 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter3675 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleParameter3692 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleParameter3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntrypoint_in_entryRuleEntrypoint3751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntrypoint3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleEntrypoint3807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntrypoint3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitpoint_in_entryRuleExitpoint3865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitpoint3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleExitpoint3921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExitpoint3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN3980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN4031 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleFQN4050 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN4065 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction4114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReaction4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReaction4170 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleLocalReaction4202 = new BitSet(new long[]{0x06220008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalReaction4223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger4261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionTrigger4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSpec_in_ruleReactionTrigger4328 = new BitSet(new long[]{0x0000010000080002L});
    public static final BitSet FOLLOW_19_in_ruleReactionTrigger4341 = new BitSet(new long[]{0xC001F80000000010L});
    public static final BitSet FOLLOW_ruleEventSpec_in_ruleReactionTrigger4362 = new BitSet(new long[]{0x0000010000080002L});
    public static final BitSet FOLLOW_40_in_ruleReactionTrigger4385 = new BitSet(new long[]{0x06200008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger4407 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleReactionTrigger4419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleReactionTrigger4441 = new BitSet(new long[]{0x06200008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger4462 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleReactionTrigger4474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect4512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionEffect4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect4579 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4598 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleReactionEffect4622 = new BitSet(new long[]{0x06220008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect4646 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4665 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleReactionProperties_in_entryRuleReactionProperties4706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionProperties4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionProperty_in_ruleReactionProperties4771 = new BitSet(new long[]{0x0000040000000012L});
    public static final BitSet FOLLOW_ruleReactionProperty_in_entryRuleReactionProperty4808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionProperty4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_ruleReactionProperty4865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_ruleReactionProperty4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec4927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryPointSpec4937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEntryPointSpec4974 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEntryPointSpec4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec5033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitPointSpec5043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleExitPointSpec5091 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleExitPointSpec5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSpec_in_entryRuleEventSpec5139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventSpec5149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_ruleEventSpec5196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_ruleEventSpec5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_ruleEventSpec5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularEventSpec5295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeEventSpec5385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5431 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeEventSpec5448 = new BitSet(new long[]{0x0000000000000002L,0x0000000003C00000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinEventSpec5521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCycleEvent_in_ruleBuiltinEventSpec5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec5649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultEvent_in_ruleBuiltinEventSpec5676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent5711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryEvent5721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEntryEvent5767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent5803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent5813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleExitEvent5859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCycleEvent_in_entryRuleOnCycleEvent5895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnCycleEvent5905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOnCycleEvent5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent5987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEvent5997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleAlwaysEvent6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultEvent_in_entryRuleDefaultEvent6079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultEvent6089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDefaultEvent6136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDefaultEvent6154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_entryRuleEventRaisingExpression6191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventRaisingExpression6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleEventRaisingExpression6247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventRaisingExpression6268 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleEventRaisingExpression6281 = new BitSet(new long[]{0x06200008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEventRaisingExpression6302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpression6398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression6442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6489 = new BitSet(new long[]{0x0000000200000002L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6519 = new BitSet(new long[]{0x06200008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6540 = new BitSet(new long[]{0x0000000200000002L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression6588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6635 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleConditionalExpression6656 = new BitSet(new long[]{0x06200008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6677 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleConditionalExpression6689 = new BitSet(new long[]{0x06200008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression6758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6805 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleLogicalOrExpression6826 = new BitSet(new long[]{0x06200008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6847 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression6895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6942 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleLogicalAndExpression6963 = new BitSet(new long[]{0x06200008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6984 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression7022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNotExpression7032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleLogicalNotExpression7106 = new BitSet(new long[]{0x06000008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression7174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7221 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleBitwiseXorExpression7242 = new BitSet(new long[]{0x06000008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7263 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression7311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7358 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleBitwiseOrExpression7379 = new BitSet(new long[]{0x06000008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7400 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression7448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7495 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleBitwiseAndExpression7516 = new BitSet(new long[]{0x06000008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7537 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalRelationExpression7585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7632 = new BitSet(new long[]{0x0000040000000002L,0x00000000003E0000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7662 = new BitSet(new long[]{0x06000008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7683 = new BitSet(new long[]{0x0000040000000002L,0x00000000003E0000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression7731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7778 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression7808 = new BitSet(new long[]{0x06000008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7829 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7924 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7954 = new BitSet(new long[]{0x06000008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7975 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression8013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression8023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8070 = new BitSet(new long[]{0x0000000000040002L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8100 = new BitSet(new long[]{0x06000008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8121 = new BitSet(new long[]{0x0000000000040002L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8252 = new BitSet(new long[]{0x06000008000003F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression8310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression8320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression8367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression8394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression8421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression8448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePrimaryExpression8466 = new BitSet(new long[]{0x06200008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression8488 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulePrimaryExpression8499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValueExpression8546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall8647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8694 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleFeatureCall8715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureCall8735 = new BitSet(new long[]{0x0000008800000002L});
    public static final BitSet FOLLOW_35_in_ruleFeatureCall8769 = new BitSet(new long[]{0x06200018000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8804 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_19_in_ruleFeatureCall8817 = new BitSet(new long[]{0x06200008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8838 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_36_in_ruleFeatureCall8854 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementReferenceExpression8904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementReferenceExpression8958 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleElementReferenceExpression8992 = new BitSet(new long[]{0x06200018000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression9027 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_19_in_ruleElementReferenceExpression9040 = new BitSet(new long[]{0x06200008000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression9061 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_36_in_ruleElementReferenceExpression9077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression9115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventValueReferenceExpression9125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleEventValueReferenceExpression9171 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleEventValueReferenceExpression9183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression9204 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleEventValueReferenceExpression9216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression9252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression9262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleActiveStateReferenceExpression9308 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleActiveStateReferenceExpression9320 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9343 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleActiveStateReferenceExpression9355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral9391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral9401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral9448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral9475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_ruleLiteral9502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleLiteral9529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral9556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral9601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral9652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral9703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral9754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral9805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRealLiteral9856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexLiteral9907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleHexLiteral9958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral10009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral10060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleDirection10115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDirection10132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleDirection10149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleTimeEventType10194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleTimeEventType10211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleAssignmentOperator10256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleAssignmentOperator10273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleAssignmentOperator10290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleAssignmentOperator10307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleAssignmentOperator10324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleAssignmentOperator10341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleAssignmentOperator10358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleAssignmentOperator10375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleAssignmentOperator10392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleAssignmentOperator10409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleAssignmentOperator10426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleShiftOperator10471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleShiftOperator10488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleAdditiveOperator10533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAdditiveOperator10550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleMultiplicativeOperator10595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMultiplicativeOperator10612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleMultiplicativeOperator10629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleUnaryOperator10674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleUnaryOperator10691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleUnaryOperator10708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleRelationalOperator10753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleRelationalOperator10770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleRelationalOperator10787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleRelationalOperator10804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleRelationalOperator10821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleRelationalOperator10838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleTimeUnit10883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleTimeUnit10900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleTimeUnit10917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleTimeUnit10934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred2_InternalSCCExp4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred3_InternalSCCExp4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred4_InternalSCCExp8751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred5_InternalSCCExp8974 = new BitSet(new long[]{0x0000000000000002L});

}
