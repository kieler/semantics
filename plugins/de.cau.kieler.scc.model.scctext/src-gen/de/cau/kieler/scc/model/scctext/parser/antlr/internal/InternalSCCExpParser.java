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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_FLOAT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@@state@@'", "'@@transition@@'", "'interface'", "':'", "';'", "'OnExitAction'", "'OnInsideAction'", "'OnEntryAction'", "'Suspend'", "'/'", "'#'", "'some trigger expression'", "'namespace'", "'internal'", "'event'", "'var'", "'readonly'", "'external'", "'='", "'operation'", "'('", "','", "')'", "'entrypoint'", "'exitpoint'", "'.'", "'['", "']'", "'>'", "'entry'", "'exit'", "'oncycle'", "'always'", "'default'", "'else'", "'raise'", "'?'", "'||'", "'&&'", "'!'", "'^'", "'|'", "'&'", "'valueof'", "'active'", "'local'", "'in'", "'out'", "'after'", "'every'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'%'", "'~'", "'<'", "'<='", "'>='", "'=='", "'!='", "'s'", "'ms'", "'us'", "'ns'"
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

                if ( (LA3_0==16||(LA3_0>=19 && LA3_0<=22)) ) {
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
            case 19:
            case 20:
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:367:1: ruleInterfaceDeclaration returns [EObject current=null] : ( () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleInterfaceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_declarations_4_1 = null;

        EObject lv_declarations_4_2 = null;

        EObject lv_declarations_4_3 = null;

        EObject lv_declarations_4_4 = null;

        EObject lv_declarations_4_5 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:370:28: ( ( () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )* otherlv_5= ';' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:371:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )* otherlv_5= ';' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:371:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )* otherlv_5= ';' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:371:2: () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )* otherlv_5= ';'
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:381:1: ( (lv_name_2_0= RULE_ID ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:382:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:382:1: (lv_name_2_0= RULE_ID )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:383:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceDeclaration904); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_0, grammarAccess.getInterfaceDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInterfaceDeclarationRule());
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleInterfaceDeclaration922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInterfaceDeclarationAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:403:1: ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=28 && LA7_0<=29)||LA7_0==33||(LA7_0>=37 && LA7_0<=38)||(LA7_0>=59 && LA7_0<=61)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:404:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:404:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:405:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:405:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint )
            	    int alt6=5;
            	    switch ( input.LA(1) ) {
            	    case 28:
            	    case 59:
            	    case 60:
            	    case 61:
            	        {
            	        alt6=1;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt6=2;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt6=3;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt6=4;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt6=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt6) {
            	        case 1 :
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:406:3: lv_declarations_4_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getDeclarationsEventDeclarartionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInterfaceDeclaration945);
            	            lv_declarations_4_1=ruleEventDeclarartion();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceDeclarationRule());
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:421:8: lv_declarations_4_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getDeclarationsVariableDeclarationParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInterfaceDeclaration964);
            	            lv_declarations_4_2=ruleVariableDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceDeclarationRule());
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:436:8: lv_declarations_4_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getDeclarationsOperationDeclarationParserRuleCall_4_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInterfaceDeclaration983);
            	            lv_declarations_4_3=ruleOperationDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceDeclarationRule());
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:451:8: lv_declarations_4_4= ruleEntrypoint
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getDeclarationsEntrypointParserRuleCall_4_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEntrypoint_in_ruleInterfaceDeclaration1002);
            	            lv_declarations_4_4=ruleEntrypoint();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceDeclarationRule());
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:466:8: lv_declarations_4_5= ruleExitpoint
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getDeclarationsExitpointParserRuleCall_4_0_4()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExitpoint_in_ruleInterfaceDeclaration1021);
            	            lv_declarations_4_5=ruleExitpoint();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceDeclarationRule());
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
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleInterfaceDeclaration1037); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getInterfaceDeclarationAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:496:1: entryRuleActionDeclaration returns [EObject current=null] : iv_ruleActionDeclaration= ruleActionDeclaration EOF ;
    public final EObject entryRuleActionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:497:2: (iv_ruleActionDeclaration= ruleActionDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:498:2: iv_ruleActionDeclaration= ruleActionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleActionDeclaration_in_entryRuleActionDeclaration1073);
            iv_ruleActionDeclaration=ruleActionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionDeclaration1083); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:505:1: ruleActionDeclaration returns [EObject current=null] : (this_EntryActionDeclaration_0= ruleEntryActionDeclaration | this_InsideActionDeclaration_1= ruleInsideActionDeclaration | this_ExitActionDeclaration_2= ruleExitActionDeclaration ) ;
    public final EObject ruleActionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_EntryActionDeclaration_0 = null;

        EObject this_InsideActionDeclaration_1 = null;

        EObject this_ExitActionDeclaration_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:508:28: ( (this_EntryActionDeclaration_0= ruleEntryActionDeclaration | this_InsideActionDeclaration_1= ruleInsideActionDeclaration | this_ExitActionDeclaration_2= ruleExitActionDeclaration ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:509:1: (this_EntryActionDeclaration_0= ruleEntryActionDeclaration | this_InsideActionDeclaration_1= ruleInsideActionDeclaration | this_ExitActionDeclaration_2= ruleExitActionDeclaration )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:509:1: (this_EntryActionDeclaration_0= ruleEntryActionDeclaration | this_InsideActionDeclaration_1= ruleInsideActionDeclaration | this_ExitActionDeclaration_2= ruleExitActionDeclaration )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 19:
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:510:5: this_EntryActionDeclaration_0= ruleEntryActionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionDeclarationAccess().getEntryActionDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryActionDeclaration_in_ruleActionDeclaration1130);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:520:5: this_InsideActionDeclaration_1= ruleInsideActionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionDeclarationAccess().getInsideActionDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInsideActionDeclaration_in_ruleActionDeclaration1157);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:530:5: this_ExitActionDeclaration_2= ruleExitActionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionDeclarationAccess().getExitActionDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitActionDeclaration_in_ruleActionDeclaration1184);
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:546:1: entryRuleExitActionDeclaration returns [EObject current=null] : iv_ruleExitActionDeclaration= ruleExitActionDeclaration EOF ;
    public final EObject entryRuleExitActionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitActionDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:547:2: (iv_ruleExitActionDeclaration= ruleExitActionDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:548:2: iv_ruleExitActionDeclaration= ruleExitActionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitActionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleExitActionDeclaration_in_entryRuleExitActionDeclaration1219);
            iv_ruleExitActionDeclaration=ruleExitActionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitActionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitActionDeclaration1229); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:555:1: ruleExitActionDeclaration returns [EObject current=null] : ( () otherlv_1= 'OnExitAction' ) ;
    public final EObject ruleExitActionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:558:28: ( ( () otherlv_1= 'OnExitAction' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:559:1: ( () otherlv_1= 'OnExitAction' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:559:1: ( () otherlv_1= 'OnExitAction' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:559:2: () otherlv_1= 'OnExitAction'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:559:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:560:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitActionDeclarationAccess().getExitActionDeclarationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleExitActionDeclaration1275); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:577:1: entryRuleInsideActionDeclaration returns [EObject current=null] : iv_ruleInsideActionDeclaration= ruleInsideActionDeclaration EOF ;
    public final EObject entryRuleInsideActionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsideActionDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:578:2: (iv_ruleInsideActionDeclaration= ruleInsideActionDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:579:2: iv_ruleInsideActionDeclaration= ruleInsideActionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsideActionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleInsideActionDeclaration_in_entryRuleInsideActionDeclaration1311);
            iv_ruleInsideActionDeclaration=ruleInsideActionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInsideActionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsideActionDeclaration1321); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:586:1: ruleInsideActionDeclaration returns [EObject current=null] : ( () otherlv_1= 'OnInsideAction' ) ;
    public final EObject ruleInsideActionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:589:28: ( ( () otherlv_1= 'OnInsideAction' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:590:1: ( () otherlv_1= 'OnInsideAction' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:590:1: ( () otherlv_1= 'OnInsideAction' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:590:2: () otherlv_1= 'OnInsideAction'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:590:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:591:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInsideActionDeclarationAccess().getInsideActionDeclarationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleInsideActionDeclaration1367); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:608:1: entryRuleEntryActionDeclaration returns [EObject current=null] : iv_ruleEntryActionDeclaration= ruleEntryActionDeclaration EOF ;
    public final EObject entryRuleEntryActionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryActionDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:609:2: (iv_ruleEntryActionDeclaration= ruleEntryActionDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:610:2: iv_ruleEntryActionDeclaration= ruleEntryActionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryActionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleEntryActionDeclaration_in_entryRuleEntryActionDeclaration1403);
            iv_ruleEntryActionDeclaration=ruleEntryActionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryActionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryActionDeclaration1413); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:617:1: ruleEntryActionDeclaration returns [EObject current=null] : ( () otherlv_1= 'OnEntryAction' ) ;
    public final EObject ruleEntryActionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:620:28: ( ( () otherlv_1= 'OnEntryAction' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:621:1: ( () otherlv_1= 'OnEntryAction' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:621:1: ( () otherlv_1= 'OnEntryAction' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:621:2: () otherlv_1= 'OnEntryAction'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:621:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:622:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryActionDeclarationAccess().getEntryActionDeclarationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleEntryActionDeclaration1459); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:639:1: entryRuleSuspendDeclaration returns [EObject current=null] : iv_ruleSuspendDeclaration= ruleSuspendDeclaration EOF ;
    public final EObject entryRuleSuspendDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspendDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:640:2: (iv_ruleSuspendDeclaration= ruleSuspendDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:641:2: iv_ruleSuspendDeclaration= ruleSuspendDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuspendDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSuspendDeclaration_in_entryRuleSuspendDeclaration1495);
            iv_ruleSuspendDeclaration=ruleSuspendDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuspendDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuspendDeclaration1505); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:648:1: ruleSuspendDeclaration returns [EObject current=null] : ( () otherlv_1= 'Suspend' ) ;
    public final EObject ruleSuspendDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:651:28: ( ( () otherlv_1= 'Suspend' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:652:1: ( () otherlv_1= 'Suspend' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:652:1: ( () otherlv_1= 'Suspend' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:652:2: () otherlv_1= 'Suspend'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:652:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:653:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSuspendDeclarationAccess().getSuspendDeclarationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleSuspendDeclaration1551); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSuspendDeclarationAccess().getSuspendKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:670:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:671:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:672:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction1587);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionReaction1597); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:679:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleMyTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:682:28: ( ( () ( (lv_trigger_1_0= ruleMyTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:683:1: ( () ( (lv_trigger_1_0= ruleMyTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:683:1: ( () ( (lv_trigger_1_0= ruleMyTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:683:2: () ( (lv_trigger_1_0= ruleMyTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:683:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:684:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionReactionAccess().getTransitionReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:689:2: ( (lv_trigger_1_0= ruleMyTrigger ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:690:1: (lv_trigger_1_0= ruleMyTrigger )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:690:1: (lv_trigger_1_0= ruleMyTrigger )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:691:3: lv_trigger_1_0= ruleMyTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerMyTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMyTrigger_in_ruleTransitionReaction1652);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:707:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:707:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleTransitionReaction1666); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:711:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:712:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:712:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:713:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransitionReaction1687);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:729:4: (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:729:6: otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleTransitionReaction1702); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionReactionAccess().getNumberSignKeyword_3_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:733:1: ( (lv_properties_5_0= ruleReactionProperties ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:734:1: (lv_properties_5_0= ruleReactionProperties )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:734:1: (lv_properties_5_0= ruleReactionProperties )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:735:3: lv_properties_5_0= ruleReactionProperties
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getPropertiesReactionPropertiesParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionProperties_in_ruleTransitionReaction1723);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:759:1: entryRuleMyTrigger returns [EObject current=null] : iv_ruleMyTrigger= ruleMyTrigger EOF ;
    public final EObject entryRuleMyTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyTrigger = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:760:2: (iv_ruleMyTrigger= ruleMyTrigger EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:761:2: iv_ruleMyTrigger= ruleMyTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMyTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleMyTrigger_in_entryRuleMyTrigger1761);
            iv_ruleMyTrigger=ruleMyTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMyTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMyTrigger1771); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:768:1: ruleMyTrigger returns [EObject current=null] : ( () otherlv_1= 'some trigger expression' ) ;
    public final EObject ruleMyTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:771:28: ( ( () otherlv_1= 'some trigger expression' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:772:1: ( () otherlv_1= 'some trigger expression' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:772:1: ( () otherlv_1= 'some trigger expression' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:772:2: () otherlv_1= 'some trigger expression'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:772:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:773:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMyTriggerAccess().getMyTriggerAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleMyTrigger1817); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:794:1: entryRuleStatechartSpecification returns [EObject current=null] : iv_ruleStatechartSpecification= ruleStatechartSpecification EOF ;
    public final EObject entryRuleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartSpecification = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:795:2: (iv_ruleStatechartSpecification= ruleStatechartSpecification EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:796:2: iv_ruleStatechartSpecification= ruleStatechartSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification1857);
            iv_ruleStatechartSpecification=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartSpecification1867); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:803:1: ruleStatechartSpecification returns [EObject current=null] : ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) ;
    public final EObject ruleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        EObject lv_scopes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:806:28: ( ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:807:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:807:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:807:2: () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:807:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:808:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatechartSpecificationAccess().getStatechartSpecificationAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:813:2: (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:813:4: otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleStatechartSpecification1914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatechartSpecificationAccess().getNamespaceKeyword_1_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:817:1: ( (lv_namespace_2_0= ruleFQN ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:818:1: (lv_namespace_2_0= ruleFQN )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:818:1: (lv_namespace_2_0= ruleFQN )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:819:3: lv_namespace_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getNamespaceFQNParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleStatechartSpecification1935);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:835:4: ( (lv_scopes_3_0= ruleStatechartScope ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16||(LA13_0>=19 && LA13_0<=22)||LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:836:1: (lv_scopes_3_0= ruleStatechartScope )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:836:1: (lv_scopes_3_0= ruleStatechartScope )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:837:3: lv_scopes_3_0= ruleStatechartScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getScopesStatechartScopeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification1958);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:861:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:862:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:863:2: iv_ruleStateSpecification= ruleStateSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification1995);
            iv_ruleStateSpecification=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateSpecification2005); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:870:1: ruleStateSpecification returns [EObject current=null] : ( (lv_scope_0_0= ruleStateScope ) ) ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_scope_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:873:28: ( ( (lv_scope_0_0= ruleStateScope ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:874:1: ( (lv_scope_0_0= ruleStateScope ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:874:1: ( (lv_scope_0_0= ruleStateScope ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:875:1: (lv_scope_0_0= ruleStateScope )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:875:1: (lv_scope_0_0= ruleStateScope )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:876:3: lv_scope_0_0= ruleStateScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateSpecificationAccess().getScopeStateScopeParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateScope_in_ruleStateSpecification2050);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:900:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:901:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:902:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification2085);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification2095); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:909:1: ruleTransitionSpecification returns [EObject current=null] : ( (lv_reaction_0_0= ruleTransitionReaction ) ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_reaction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:912:28: ( ( (lv_reaction_0_0= ruleTransitionReaction ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:913:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:913:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:914:1: (lv_reaction_0_0= ruleTransitionReaction )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:914:1: (lv_reaction_0_0= ruleTransitionReaction )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:915:3: lv_reaction_0_0= ruleTransitionReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getReactionTransitionReactionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification2140);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:941:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:942:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:943:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope2177);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartScope2187); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:950:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:953:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:954:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:954:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16||(LA14_0>=19 && LA14_0<=22)) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:955:5: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStatechartScope2234);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:965:5: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalScope_in_ruleStatechartScope2261);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:983:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:984:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:985:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInternalScope_in_entryRuleInternalScope2298);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalScope2308); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:992:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:995:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:996:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:996:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:996:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:996:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:997:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInternalScopeAccess().getInternalScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleInternalScope2354); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleInternalScope2366); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1010:1: ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||(LA16_0>=28 && LA16_0<=29)||LA16_0==33||LA16_0==40||(LA16_0>=43 && LA16_0<=48)||(LA16_0>=59 && LA16_0<=63)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1011:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1011:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1012:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1012:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    int alt15=4;
            	    switch ( input.LA(1) ) {
            	    case 28:
            	    case 59:
            	    case 60:
            	    case 61:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case 33:
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1013:3: lv_declarations_3_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInternalScope2389);
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1028:8: lv_declarations_3_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInternalScope2408);
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1043:8: lv_declarations_3_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInternalScope2427);
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1058:8: lv_declarations_3_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsLocalReactionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleInternalScope2446);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1086:1: entryRuleEventDeclarartion returns [EObject current=null] : iv_ruleEventDeclarartion= ruleEventDeclarartion EOF ;
    public final EObject entryRuleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclarartion = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1087:2: (iv_ruleEventDeclarartion= ruleEventDeclarartion EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1088:2: iv_ruleEventDeclarartion= ruleEventDeclarartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarartionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion2488);
            iv_ruleEventDeclarartion=ruleEventDeclarartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclarartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclarartion2498); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1095:1: ruleEventDeclarartion returns [EObject current=null] : this_EventDefinition_0= ruleEventDefinition ;
    public final EObject ruleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject this_EventDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1098:28: (this_EventDefinition_0= ruleEventDefinition )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1100:5: this_EventDefinition_0= ruleEventDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEventDeclarartionAccess().getEventDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion2544);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1118:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1119:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1120:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition2580);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDefinition2590); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1127:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1130:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1131:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1131:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1131:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1131:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=59 && LA17_0<=61)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1132:1: (lv_direction_0_0= ruleDirection )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1132:1: (lv_direction_0_0= ruleDirection )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1133:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_ruleEventDefinition2636);
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

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleEventDefinition2649); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1153:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1154:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1154:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1155:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventDefinition2666); if (state.failed) return current;
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1171:2: (otherlv_3= ':' ( ( ruleFQN ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1171:4: otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleEventDefinition2684); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1175:1: ( ( ruleFQN ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1176:1: ( ruleFQN )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1176:1: ( ruleFQN )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1177:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getTypeTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEventDefinition2707);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1198:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1199:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1200:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2745);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration2755); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1207:1: ruleVariableDeclaration returns [EObject current=null] : this_VariableDefinition_0= ruleVariableDefinition ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1210:28: (this_VariableDefinition_0= ruleVariableDefinition )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1212:5: this_VariableDefinition_0= ruleVariableDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration2801);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1230:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1231:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1232:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition2837);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition2847); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1239:1: ruleVariableDefinition returns [EObject current=null] : ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1242:28: ( ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1243:1: ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1243:1: ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1243:2: () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1243:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1244:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleVariableDefinition2893); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableDefinitionAccess().getVarKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1253:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1255:1: ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1255:1: ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1256:2: ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1259:2: ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1260:3: ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1260:3: ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( LA19_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {
                    alt19=1;
                }
                else if ( LA19_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1262:4: ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1262:4: ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1263:5: {...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1263:115: ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1264:6: ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0);
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1267:6: ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1267:7: {...}? => ( (lv_readonly_3_0= 'readonly' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "true");
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1267:16: ( (lv_readonly_3_0= 'readonly' ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1268:1: (lv_readonly_3_0= 'readonly' )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1268:1: (lv_readonly_3_0= 'readonly' )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1269:3: lv_readonly_3_0= 'readonly'
            	    {
            	    lv_readonly_3_0=(Token)match(input,30,FOLLOW_30_in_ruleVariableDefinition2956); if (state.failed) return current;
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
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1289:4: ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1289:4: ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1290:5: {...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1290:115: ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1291:6: ({...}? => ( (lv_external_4_0= 'external' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1);
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1294:6: ({...}? => ( (lv_external_4_0= 'external' ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1294:7: {...}? => ( (lv_external_4_0= 'external' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "true");
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1294:16: ( (lv_external_4_0= 'external' ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1295:1: (lv_external_4_0= 'external' )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1295:1: (lv_external_4_0= 'external' )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1296:3: lv_external_4_0= 'external'
            	    {
            	    lv_external_4_0=(Token)match(input,31,FOLLOW_31_in_ruleVariableDefinition3041); if (state.failed) return current;
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1323:2: ( (lv_name_5_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1324:1: (lv_name_5_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1324:1: (lv_name_5_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1325:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDefinition3111); if (state.failed) return current;
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

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleVariableDefinition3128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionAccess().getColonKeyword_4());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1345:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1346:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1346:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1347:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getTypeTypeCrossReference_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleVariableDefinition3151);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1360:2: (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1360:4: otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) )
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_32_in_ruleVariableDefinition3164); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getVariableDefinitionAccess().getEqualsSignKeyword_6_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1364:1: ( (lv_initialValue_9_0= ruleExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1365:1: (lv_initialValue_9_0= ruleExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1365:1: (lv_initialValue_9_0= ruleExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1366:3: lv_initialValue_9_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getInitialValueExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDefinition3185);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1390:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1391:2: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1392:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration3223);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDeclaration3233); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1399:1: ruleOperationDeclaration returns [EObject current=null] : this_OperationDefinition_0= ruleOperationDefinition ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1402:28: (this_OperationDefinition_0= ruleOperationDefinition )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1404:5: this_OperationDefinition_0= ruleOperationDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOperationDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration3279);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1422:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1423:2: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1424:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition3315);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDefinition3325); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1431:1: ruleOperationDefinition returns [EObject current=null] : ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1434:28: ( ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1435:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1435:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1435:2: () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1435:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1436:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationDefinitionAccess().getOperationDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleOperationDefinition3371); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionAccess().getOperationKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1445:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1446:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1446:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1447:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperationDefinition3388); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleOperationDefinition3405); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1467:1: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1467:2: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1467:2: ( (lv_parameters_4_0= ruleParameter ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1468:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1468:1: (lv_parameters_4_0= ruleParameter )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1469:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition3427);
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

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1485:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==35) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1485:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleOperationDefinition3440); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getOperationDefinitionAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1489:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1490:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1490:1: (lv_parameters_6_0= ruleParameter )
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1491:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition3461);
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

            otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleOperationDefinition3477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1511:1: (otherlv_8= ':' ( ( ruleFQN ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1511:3: otherlv_8= ':' ( ( ruleFQN ) )
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleOperationDefinition3490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getOperationDefinitionAccess().getColonKeyword_6_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1515:1: ( ( ruleFQN ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1516:1: ( ruleFQN )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1516:1: ( ruleFQN )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1517:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getTypeTypeCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition3513);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1538:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1539:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1540:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3551);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3561); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1547:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1550:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1551:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1551:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1551:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1551:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1552:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1552:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1553:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter3603); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleParameter3620); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1573:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1574:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1574:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1575:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleParameter3643);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1596:1: entryRuleEntrypoint returns [EObject current=null] : iv_ruleEntrypoint= ruleEntrypoint EOF ;
    public final EObject entryRuleEntrypoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntrypoint = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1597:2: (iv_ruleEntrypoint= ruleEntrypoint EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1598:2: iv_ruleEntrypoint= ruleEntrypoint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntrypointRule()); 
            }
            pushFollow(FOLLOW_ruleEntrypoint_in_entryRuleEntrypoint3679);
            iv_ruleEntrypoint=ruleEntrypoint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntrypoint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntrypoint3689); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1605:1: ruleEntrypoint returns [EObject current=null] : ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleEntrypoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1608:28: ( ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1609:1: ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1609:1: ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1609:2: () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1609:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1610:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntrypointAccess().getEntrypointAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleEntrypoint3735); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntrypointAccess().getEntrypointKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1619:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1620:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1620:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1621:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntrypoint3752); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1645:1: entryRuleExitpoint returns [EObject current=null] : iv_ruleExitpoint= ruleExitpoint EOF ;
    public final EObject entryRuleExitpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitpoint = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1646:2: (iv_ruleExitpoint= ruleExitpoint EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1647:2: iv_ruleExitpoint= ruleExitpoint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitpointRule()); 
            }
            pushFollow(FOLLOW_ruleExitpoint_in_entryRuleExitpoint3793);
            iv_ruleExitpoint=ruleExitpoint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitpoint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitpoint3803); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1654:1: ruleExitpoint returns [EObject current=null] : ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleExitpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1657:28: ( ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1658:1: ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1658:1: ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1658:2: () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1658:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1659:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitpointAccess().getExitpointAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleExitpoint3849); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitpointAccess().getExitpointKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1668:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1669:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1669:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1670:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExitpoint3866); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1694:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1695:2: (iv_ruleFQN= ruleFQN EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1696:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN3908);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN3919); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1703:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1706:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1707:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1707:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1707:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3959); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1714:1: (kw= '.' this_ID_2= RULE_ID )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1715:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,39,FOLLOW_39_in_ruleFQN3978); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3993); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1737:1: entryRuleLocalReaction returns [EObject current=null] : iv_ruleLocalReaction= ruleLocalReaction EOF ;
    public final EObject entryRuleLocalReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReaction = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1738:2: (iv_ruleLocalReaction= ruleLocalReaction EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1739:2: iv_ruleLocalReaction= ruleLocalReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction4042);
            iv_ruleLocalReaction=ruleLocalReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReaction4052); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1746:1: ruleLocalReaction returns [EObject current=null] : ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) ;
    public final EObject ruleLocalReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_trigger_0_0 = null;

        EObject lv_effect_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1749:28: ( ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1750:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1750:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1750:2: ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1750:2: ( (lv_trigger_0_0= ruleReactionTrigger ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1751:1: (lv_trigger_0_0= ruleReactionTrigger )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1751:1: (lv_trigger_0_0= ruleReactionTrigger )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1752:3: lv_trigger_0_0= ruleReactionTrigger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerReactionTriggerParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReaction4098);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1768:2: ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1768:3: ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1773:6: (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1773:8: otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) )
            {
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleLocalReaction4130); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalReactionAccess().getSolidusKeyword_1_0_0());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1777:1: ( (lv_effect_2_0= ruleReactionEffect ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1778:1: (lv_effect_2_0= ruleReactionEffect )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1778:1: (lv_effect_2_0= ruleReactionEffect )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1779:3: lv_effect_2_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectReactionEffectParserRuleCall_1_0_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalReaction4151);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1803:1: entryRuleReactionTrigger returns [EObject current=null] : iv_ruleReactionTrigger= ruleReactionTrigger EOF ;
    public final EObject entryRuleReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionTrigger = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1804:2: (iv_ruleReactionTrigger= ruleReactionTrigger EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1805:2: iv_ruleReactionTrigger= ruleReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger4189);
            iv_ruleReactionTrigger=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionTrigger4199); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1812:1: ruleReactionTrigger returns [EObject current=null] : ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1815:28: ( ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1816:1: ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1816:1: ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1816:2: () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1816:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1817:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1822:2: ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) )
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1822:3: ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1822:3: ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1822:4: ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )?
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1822:4: ( (lv_triggers_1_0= ruleEventSpec ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1823:1: (lv_triggers_1_0= ruleEventSpec )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1823:1: (lv_triggers_1_0= ruleEventSpec )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1824:3: lv_triggers_1_0= ruleEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventSpec_in_ruleReactionTrigger4256);
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

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1840:2: (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==35) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1840:4: otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) )
                    	    {
                    	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleReactionTrigger4269); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getReactionTriggerAccess().getCommaKeyword_1_0_1_0());
                    	          
                    	    }
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1844:1: ( (lv_triggers_3_0= ruleEventSpec ) )
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1845:1: (lv_triggers_3_0= ruleEventSpec )
                    	    {
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1845:1: (lv_triggers_3_0= ruleEventSpec )
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1846:3: lv_triggers_3_0= ruleEventSpec
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_1_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEventSpec_in_ruleReactionTrigger4290);
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

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1862:4: ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==40) && (synpred2_InternalSCCExp())) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1862:5: ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']'
                            {
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1862:5: ( ( '[' )=>otherlv_4= '[' )
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1862:6: ( '[' )=>otherlv_4= '['
                            {
                            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleReactionTrigger4313); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_1_0_2_0());
                                  
                            }

                            }

                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1867:2: ( (lv_guardExpression_5_0= ruleExpression ) )
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1868:1: (lv_guardExpression_5_0= ruleExpression )
                            {
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1868:1: (lv_guardExpression_5_0= ruleExpression )
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1869:3: lv_guardExpression_5_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_1_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger4335);
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

                            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleReactionTrigger4347); if (state.failed) return current;
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1890:6: (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1890:6: (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1890:8: otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']'
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_40_in_ruleReactionTrigger4369); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_1_1_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1894:1: ( (lv_guardExpression_8_0= ruleExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1895:1: (lv_guardExpression_8_0= ruleExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1895:1: (lv_guardExpression_8_0= ruleExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1896:3: lv_guardExpression_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger4390);
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

                    otherlv_9=(Token)match(input,41,FOLLOW_41_in_ruleReactionTrigger4402); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1924:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1925:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1926:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect4440);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionEffect4450); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1933:1: ruleReactionEffect returns [EObject current=null] : ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_3_1 = null;

        EObject lv_actions_3_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1936:28: ( ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1937:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1937:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1937:2: () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1937:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1938:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1943:2: ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1944:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1944:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1945:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1945:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)||LA28_0==34||LA28_0==53||(LA28_0>=57 && LA28_0<=58)||(LA28_0>=76 && LA28_0<=77)||LA28_0==80) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1946:3: lv_actions_1_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect4507);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1961:8: lv_actions_1_2= ruleEventRaisingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4526);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1979:2: ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==18) && (synpred3_InternalSCCExp())) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1979:3: ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1979:3: ( ( ';' )=>otherlv_2= ';' )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1979:4: ( ';' )=>otherlv_2= ';'
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleReactionEffect4550); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReactionEffectAccess().getSemicolonKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1984:2: ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1985:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1985:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1986:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1986:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_STRING)||LA29_0==34||LA29_0==53||(LA29_0>=57 && LA29_0<=58)||(LA29_0>=76 && LA29_0<=77)||LA29_0==80) ) {
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1987:3: lv_actions_3_1= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect4574);
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2002:8: lv_actions_3_2= ruleEventRaisingExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_2_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4593);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2028:1: entryRuleReactionProperties returns [EObject current=null] : iv_ruleReactionProperties= ruleReactionProperties EOF ;
    public final EObject entryRuleReactionProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionProperties = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2029:2: (iv_ruleReactionProperties= ruleReactionProperties EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2030:2: iv_ruleReactionProperties= ruleReactionProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionPropertiesRule()); 
            }
            pushFollow(FOLLOW_ruleReactionProperties_in_entryRuleReactionProperties4634);
            iv_ruleReactionProperties=ruleReactionProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionProperties; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionProperties4644); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2037:1: ruleReactionProperties returns [EObject current=null] : ( () ( (lv_properties_1_0= ruleReactionProperty ) )* ) ;
    public final EObject ruleReactionProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2040:28: ( ( () ( (lv_properties_1_0= ruleReactionProperty ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2041:1: ( () ( (lv_properties_1_0= ruleReactionProperty ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2041:1: ( () ( (lv_properties_1_0= ruleReactionProperty ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2041:2: () ( (lv_properties_1_0= ruleReactionProperty ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2041:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2042:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionPropertiesAccess().getReactionPropertiesAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2047:2: ( (lv_properties_1_0= ruleReactionProperty ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||LA31_0==42) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2048:1: (lv_properties_1_0= ruleReactionProperty )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2048:1: (lv_properties_1_0= ruleReactionProperty )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2049:3: lv_properties_1_0= ruleReactionProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReactionPropertiesAccess().getPropertiesReactionPropertyParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleReactionProperty_in_ruleReactionProperties4699);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2073:1: entryRuleReactionProperty returns [EObject current=null] : iv_ruleReactionProperty= ruleReactionProperty EOF ;
    public final EObject entryRuleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionProperty = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2074:2: (iv_ruleReactionProperty= ruleReactionProperty EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2075:2: iv_ruleReactionProperty= ruleReactionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReactionProperty_in_entryRuleReactionProperty4736);
            iv_ruleReactionProperty=ruleReactionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionProperty4746); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2082:1: ruleReactionProperty returns [EObject current=null] : (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) ;
    public final EObject ruleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_EntryPointSpec_0 = null;

        EObject this_ExitPointSpec_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2085:28: ( (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2086:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2086:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2087:5: this_EntryPointSpec_0= ruleEntryPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReactionPropertyAccess().getEntryPointSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryPointSpec_in_ruleReactionProperty4793);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2097:5: this_ExitPointSpec_1= ruleExitPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReactionPropertyAccess().getExitPointSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitPointSpec_in_ruleReactionProperty4820);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2113:1: entryRuleEntryPointSpec returns [EObject current=null] : iv_ruleEntryPointSpec= ruleEntryPointSpec EOF ;
    public final EObject entryRuleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryPointSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2114:2: (iv_ruleEntryPointSpec= ruleEntryPointSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2115:2: iv_ruleEntryPointSpec= ruleEntryPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec4855);
            iv_ruleEntryPointSpec=ruleEntryPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryPointSpec4865); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2122:1: ruleEntryPointSpec returns [EObject current=null] : (otherlv_0= '>' ( ( ruleFQN ) ) ) ;
    public final EObject ruleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2125:28: ( (otherlv_0= '>' ( ( ruleFQN ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2126:1: (otherlv_0= '>' ( ( ruleFQN ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2126:1: (otherlv_0= '>' ( ( ruleFQN ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2126:3: otherlv_0= '>' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleEntryPointSpec4902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntryPointSpecAccess().getGreaterThanSignKeyword_0());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2130:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2131:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2131:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2132:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEntryPointSpecRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntryPointSpecAccess().getEntrypointEntrypointCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleEntryPointSpec4925);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2153:1: entryRuleExitPointSpec returns [EObject current=null] : iv_ruleExitPointSpec= ruleExitPointSpec EOF ;
    public final EObject entryRuleExitPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitPointSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2154:2: (iv_ruleExitPointSpec= ruleExitPointSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2155:2: iv_ruleExitPointSpec= ruleExitPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec4961);
            iv_ruleExitPointSpec=ruleExitPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitPointSpec4971); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2162:1: ruleExitPointSpec returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= '>' ) ;
    public final EObject ruleExitPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2165:28: ( ( ( ( ruleFQN ) ) otherlv_1= '>' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2166:1: ( ( ( ruleFQN ) ) otherlv_1= '>' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2166:1: ( ( ( ruleFQN ) ) otherlv_1= '>' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2166:2: ( ( ruleFQN ) ) otherlv_1= '>'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2166:2: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2167:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2167:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2168:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExitPointSpecRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExitPointSpecAccess().getExitpointExitpointCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleExitPointSpec5019);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleExitPointSpec5031); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2193:1: entryRuleEventSpec returns [EObject current=null] : iv_ruleEventSpec= ruleEventSpec EOF ;
    public final EObject entryRuleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2194:2: (iv_ruleEventSpec= ruleEventSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2195:2: iv_ruleEventSpec= ruleEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEventSpec_in_entryRuleEventSpec5067);
            iv_ruleEventSpec=ruleEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventSpec5077); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2202:1: ruleEventSpec returns [EObject current=null] : (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) ;
    public final EObject ruleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_RegularEventSpec_0 = null;

        EObject this_TimeEventSpec_1 = null;

        EObject this_BuiltinEventSpec_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2205:28: ( (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2206:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2206:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2207:5: this_RegularEventSpec_0= ruleRegularEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getRegularEventSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRegularEventSpec_in_ruleEventSpec5124);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2217:5: this_TimeEventSpec_1= ruleTimeEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getTimeEventSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTimeEventSpec_in_ruleEventSpec5151);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2227:5: this_BuiltinEventSpec_2= ruleBuiltinEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getBuiltinEventSpecParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBuiltinEventSpec_in_ruleEventSpec5178);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2243:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2244:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2245:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5213);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularEventSpec5223); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2252:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2255:28: ( ( (lv_event_0_0= ruleFeatureCall ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2256:1: ( (lv_event_0_0= ruleFeatureCall ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2256:1: ( (lv_event_0_0= ruleFeatureCall ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2257:1: (lv_event_0_0= ruleFeatureCall )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2257:1: (lv_event_0_0= ruleFeatureCall )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2258:3: lv_event_0_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5268);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2282:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2283:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2284:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5303);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeEventSpec5313); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2291:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_type_0_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2294:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2295:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2295:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2295:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2295:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2296:1: (lv_type_0_0= ruleTimeEventType )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2296:1: (lv_type_0_0= ruleTimeEventType )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2297:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5359);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2313:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2314:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2314:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2315:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeEventSpec5376); if (state.failed) return current;
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2331:2: ( (lv_unit_2_0= ruleTimeUnit ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=86 && LA34_0<=89)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2332:1: (lv_unit_2_0= ruleTimeUnit )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2332:1: (lv_unit_2_0= ruleTimeUnit )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2333:3: lv_unit_2_0= ruleTimeUnit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5402);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2357:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2358:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2359:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5439);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinEventSpec5449); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2366:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_OnCycleEvent_2 = null;

        EObject this_AlwaysEvent_3 = null;

        EObject this_DefaultEvent_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2369:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2370:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2370:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent )
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2371:5: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5496);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2381:5: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5523);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2391:5: this_OnCycleEvent_2= ruleOnCycleEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getOnCycleEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOnCycleEvent_in_ruleBuiltinEventSpec5550);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2401:5: this_AlwaysEvent_3= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec5577);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2411:5: this_DefaultEvent_4= ruleDefaultEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getDefaultEventParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultEvent_in_ruleBuiltinEventSpec5604);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2427:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2428:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2429:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent5639);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryEvent5649); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2436:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2439:28: ( ( () otherlv_1= 'entry' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2440:1: ( () otherlv_1= 'entry' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2440:1: ( () otherlv_1= 'entry' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2440:2: () otherlv_1= 'entry'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2440:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2441:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryEventAccess().getEntryEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleEntryEvent5695); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2458:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2459:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2460:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent5731);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent5741); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2467:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2470:28: ( ( () otherlv_1= 'exit' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2471:1: ( () otherlv_1= 'exit' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2471:1: ( () otherlv_1= 'exit' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2471:2: () otherlv_1= 'exit'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2471:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2472:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitEventAccess().getExitEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleExitEvent5787); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2489:1: entryRuleOnCycleEvent returns [EObject current=null] : iv_ruleOnCycleEvent= ruleOnCycleEvent EOF ;
    public final EObject entryRuleOnCycleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnCycleEvent = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2490:2: (iv_ruleOnCycleEvent= ruleOnCycleEvent EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2491:2: iv_ruleOnCycleEvent= ruleOnCycleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOnCycleEventRule()); 
            }
            pushFollow(FOLLOW_ruleOnCycleEvent_in_entryRuleOnCycleEvent5823);
            iv_ruleOnCycleEvent=ruleOnCycleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOnCycleEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnCycleEvent5833); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2498:1: ruleOnCycleEvent returns [EObject current=null] : ( () otherlv_1= 'oncycle' ) ;
    public final EObject ruleOnCycleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2501:28: ( ( () otherlv_1= 'oncycle' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2502:1: ( () otherlv_1= 'oncycle' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2502:1: ( () otherlv_1= 'oncycle' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2502:2: () otherlv_1= 'oncycle'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2502:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2503:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOnCycleEventAccess().getOnCycleEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleOnCycleEvent5879); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2520:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2521:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2522:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent5915);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEvent5925); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2529:1: ruleAlwaysEvent returns [EObject current=null] : ( () otherlv_1= 'always' ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2532:28: ( ( () otherlv_1= 'always' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2533:1: ( () otherlv_1= 'always' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2533:1: ( () otherlv_1= 'always' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2533:2: () otherlv_1= 'always'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2533:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2534:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlwaysEventAccess().getAlwaysEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleAlwaysEvent5971); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2551:1: entryRuleDefaultEvent returns [EObject current=null] : iv_ruleDefaultEvent= ruleDefaultEvent EOF ;
    public final EObject entryRuleDefaultEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultEvent = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2552:2: (iv_ruleDefaultEvent= ruleDefaultEvent EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2553:2: iv_ruleDefaultEvent= ruleDefaultEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultEventRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultEvent_in_entryRuleDefaultEvent6007);
            iv_ruleDefaultEvent=ruleDefaultEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultEvent6017); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2560:1: ruleDefaultEvent returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2563:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2564:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2564:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2564:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2564:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2565:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultEventAccess().getDefaultEventAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2570:2: (otherlv_1= 'default' | otherlv_2= 'else' )
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2570:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleDefaultEvent6064); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultEventAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2575:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleDefaultEvent6082); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2587:1: entryRuleEventRaisingExpression returns [EObject current=null] : iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF ;
    public final EObject entryRuleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventRaisingExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2588:2: (iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2589:2: iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRaisingExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventRaisingExpression_in_entryRuleEventRaisingExpression6119);
            iv_ruleEventRaisingExpression=ruleEventRaisingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventRaisingExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventRaisingExpression6129); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2596:1: ruleEventRaisingExpression returns [EObject current=null] : ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_event_2_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2599:28: ( ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2600:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2600:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2600:2: () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2600:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2601:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventRaisingExpressionAccess().getEventRaisingExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleEventRaisingExpression6175); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventRaisingExpressionAccess().getRaiseKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2610:1: ( (lv_event_2_0= ruleFeatureCall ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2611:1: (lv_event_2_0= ruleFeatureCall )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2611:1: (lv_event_2_0= ruleFeatureCall )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2612:3: lv_event_2_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getEventFeatureCallParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventRaisingExpression6196);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2628:2: (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==17) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2628:4: otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleEventRaisingExpression6209); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventRaisingExpressionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2632:1: ( (lv_value_4_0= ruleExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2633:1: (lv_value_4_0= ruleExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2633:1: (lv_value_4_0= ruleExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2634:3: lv_value_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getValueExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleEventRaisingExpression6230);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2660:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2661:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2662:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6270);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6280); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2669:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2672:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2674:5: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpression6326);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2690:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2691:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2692:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6360);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression6370); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2699:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2702:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2703:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2703:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2704:5: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6417);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2712:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==32||(LA38_0>=64 && LA38_0<=73)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2712:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2712:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2713:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2718:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2719:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2719:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2720:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6447);
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

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2736:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2737:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2737:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2738:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6468);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2762:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2763:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2764:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6506);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression6516); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2771:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2774:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2775:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2775:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2776:5: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6563);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2784:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==50) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2784:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2784:2: ()
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2785:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleConditionalExpression6584); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2794:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2795:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2795:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2796:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6605);
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

                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleConditionalExpression6617); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2816:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2817:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2817:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2818:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6638);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2842:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2843:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2844:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6676);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression6686); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2851:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2854:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2855:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2855:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2856:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6733);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2864:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==51) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2864:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2864:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2865:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleLogicalOrExpression6754); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2874:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2875:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2875:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2876:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6775);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2900:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2901:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2902:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6813);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression6823); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2909:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2912:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2913:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2913:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2914:5: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6870);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2922:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==52) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2922:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2922:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2923:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleLogicalAndExpression6891); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2932:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2933:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2933:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2934:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6912);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2958:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2959:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2960:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression6950);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNotExpression6960); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2967:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2970:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2971:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2971:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_STRING)||LA42_0==34||(LA42_0>=57 && LA42_0<=58)||(LA42_0>=76 && LA42_0<=77)||LA42_0==80) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2972:5: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7007);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2981:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2981:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2981:7: () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2981:7: ()
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2982:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalNotExpressionAccess().getLogicalNotExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleLogicalNotExpression7034); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLogicalNotExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2991:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2992:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2992:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2993:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7055);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3017:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3018:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3019:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7092);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression7102); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3026:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3029:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3030:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3030:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3031:5: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7149);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3039:1: ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==54) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3039:2: () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3039:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3040:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleBitwiseXorExpression7170); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3049:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3050:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3050:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3051:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7191);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3075:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3076:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3077:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7229);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression7239); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3084:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3087:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3088:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3088:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3089:5: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7286);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3097:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==55) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3097:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3097:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3098:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleBitwiseOrExpression7307); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3107:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3108:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3108:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3109:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7328);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3133:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3134:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3135:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7366);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression7376); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3142:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3145:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3146:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3146:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3147:5: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7423);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3155:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==56) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3155:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3155:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3156:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleBitwiseAndExpression7444); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3165:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3166:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3166:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3167:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7465);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3191:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3192:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3193:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7503);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalRelationExpression7513); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3200:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3203:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3204:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3204:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3205:5: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7560);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3213:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==42||(LA46_0>=81 && LA46_0<=85)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3213:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3213:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3214:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3219:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3220:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3220:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3221:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7590);
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

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3237:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3238:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3238:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3239:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7611);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3263:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3264:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3265:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7649);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression7659); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3272:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3275:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3276:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3276:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3277:5: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7706);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3285:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=74 && LA47_0<=75)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3285:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3285:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3286:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3291:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3292:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3292:1: (lv_operator_2_0= ruleShiftOperator )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3293:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression7736);
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

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3309:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3310:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3310:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3311:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7757);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3335:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3336:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3337:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7795);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7805); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3344:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3347:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3348:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3348:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3349:5: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7852);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3357:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=76 && LA48_0<=77)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3357:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3357:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3358:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3363:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3364:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3364:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3365:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7882);
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

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3381:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3382:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3382:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3383:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7903);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3407:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3408:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3409:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression7941);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression7951); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3416:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3419:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3420:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3420:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3421:5: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression7998);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3429:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==23||(LA49_0>=78 && LA49_0<=79)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3429:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3429:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3430:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3435:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3436:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3436:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3437:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8028);
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

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3453:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3454:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3454:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3455:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8049);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3479:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3480:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3481:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8087);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8097); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3488:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3491:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3492:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3492:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_STRING)||LA50_0==34||(LA50_0>=57 && LA50_0<=58)) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3493:5: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8144);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3502:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3502:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3502:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3502:7: ()
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3503:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumericalUnaryExpressionAccess().getNumericalUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3508:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3509:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3509:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3510:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8180);
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

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3526:2: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3527:1: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3527:1: (lv_operand_3_0= rulePrimaryExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3528:3: lv_operand_3_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8201);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3552:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3553:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3554:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression8238);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression8248); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3561:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3564:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3565:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3565:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
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
            case 34:
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3566:5: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrimitiveValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression8295);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3576:5: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression8322);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3586:5: this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getActiveStateReferenceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression8349);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3596:5: this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEventValueReferenceExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression8376);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3605:6: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3605:6: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3605:8: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_rulePrimaryExpression8394); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression8416);
                    this_Expression_5=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_rulePrimaryExpression8427); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3630:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3631:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3632:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8464);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValueExpression8474); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3639:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3642:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3643:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3643:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3643:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3643:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3644:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveValueExpressionAccess().getPrimitiveValueExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3649:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3650:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3650:1: (lv_value_1_0= ruleLiteral )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3651:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8529);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3675:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3676:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3677:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8565);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall8575); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3684:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3687:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3688:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3688:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3689:5: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8622);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3697:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==39) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3697:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3697:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3698:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleFeatureCall8643); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3707:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3708:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3708:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3709:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureCall8663); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3720:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==34) && (synpred4_InternalSCCExp())) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3720:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3720:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3720:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3727:1: (lv_operationCall_4_0= '(' )
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3728:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,34,FOLLOW_34_in_ruleFeatureCall8697); if (state.failed) return current;
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

            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3741:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt53=2;
            	            int LA53_0 = input.LA(1);

            	            if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_STRING)||LA53_0==34||LA53_0==53||(LA53_0>=57 && LA53_0<=58)||(LA53_0>=76 && LA53_0<=77)||LA53_0==80) ) {
            	                alt53=1;
            	            }
            	            switch (alt53) {
            	                case 1 :
            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3741:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3741:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3742:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3742:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3743:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8732);
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

            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3759:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop52:
            	                    do {
            	                        int alt52=2;
            	                        int LA52_0 = input.LA(1);

            	                        if ( (LA52_0==35) ) {
            	                            alt52=1;
            	                        }


            	                        switch (alt52) {
            	                    	case 1 :
            	                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3759:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleFeatureCall8745); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3763:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3764:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3764:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3765:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8766);
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

            	            otherlv_8=(Token)match(input,36,FOLLOW_36_in_ruleFeatureCall8782); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3793:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3794:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3795:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8822);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementReferenceExpression8832); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3802:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3805:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3806:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3806:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3806:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3806:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3807:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementReferenceExpressionAccess().getElementReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3812:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3813:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3813:1: (otherlv_1= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3814:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementReferenceExpression8886); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3825:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==34) && (synpred5_InternalSCCExp())) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3825:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3825:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3825:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3832:1: (lv_operationCall_2_0= '(' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3833:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,34,FOLLOW_34_in_ruleElementReferenceExpression8920); if (state.failed) return current;
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

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3846:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_STRING)||LA57_0==34||LA57_0==53||(LA57_0>=57 && LA57_0<=58)||(LA57_0>=76 && LA57_0<=77)||LA57_0==80) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3846:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3846:3: ( (lv_args_3_0= ruleExpression ) )
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3847:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3847:1: (lv_args_3_0= ruleExpression )
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3848:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8955);
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

                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3864:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==35) ) {
                                    alt56=1;
                                }


                                switch (alt56) {
                            	case 1 :
                            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3864:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleElementReferenceExpression8968); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3868:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3869:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3869:1: (lv_args_5_0= ruleExpression )
                            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3870:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8989);
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

                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleElementReferenceExpression9005); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3898:1: entryRuleEventValueReferenceExpression returns [EObject current=null] : iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF ;
    public final EObject entryRuleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventValueReferenceExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3899:2: (iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3900:2: iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventValueReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression9043);
            iv_ruleEventValueReferenceExpression=ruleEventValueReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventValueReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventValueReferenceExpression9053); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3907:1: ruleEventValueReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject ruleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3910:28: ( ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3911:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3911:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3911:2: () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3911:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3912:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventValueReferenceExpressionAccess().getEventValueReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleEventValueReferenceExpression9099); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventValueReferenceExpressionAccess().getValueofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleEventValueReferenceExpression9111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventValueReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3925:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3926:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3926:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3927:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventValueReferenceExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression9132);
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

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleEventValueReferenceExpression9144); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3955:1: entryRuleActiveStateReferenceExpression returns [EObject current=null] : iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF ;
    public final EObject entryRuleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveStateReferenceExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3956:2: (iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3957:2: iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveStateReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression9180);
            iv_ruleActiveStateReferenceExpression=ruleActiveStateReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveStateReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression9190); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3964:1: ruleActiveStateReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3967:28: ( ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3968:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3968:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3968:2: () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3968:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3969:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActiveStateReferenceExpressionAccess().getActiveStateReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleActiveStateReferenceExpression9236); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActiveStateReferenceExpressionAccess().getActiveKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleActiveStateReferenceExpression9248); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActiveStateReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3982:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3983:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3983:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3984:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActiveStateReferenceExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActiveStateReferenceExpressionAccess().getValueStateCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9271);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleActiveStateReferenceExpression9283); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4009:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4010:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4011:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral9319);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral9329); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4018:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_RealLiteral_3 = null;

        EObject this_StringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4021:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4022:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4022:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4023:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral9376);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4033:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral9403);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4043:5: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexLiteral_in_ruleLiteral9430);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4053:5: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleLiteral9457);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4063:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral9484);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4079:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4080:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4081:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9519);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral9529); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4088:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4091:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4092:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4092:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4092:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4092:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4093:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4098:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4099:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4099:1: (lv_value_1_0= RULE_BOOL )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4100:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral9580); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4124:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4125:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4126:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9621);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral9631); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4133:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4136:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4137:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4137:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4137:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4137:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4138:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4143:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4144:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4144:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4145:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral9682); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4169:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4170:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4171:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9723);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral9733); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4178:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4181:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4182:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4182:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4182:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4182:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4183:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4188:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4189:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4189:1: (lv_value_1_0= RULE_FLOAT )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4190:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleRealLiteral9784); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4214:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4215:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4216:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9825);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexLiteral9835); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4223:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4226:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4227:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4227:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4227:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4227:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4228:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHexLiteralAccess().getHexLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4233:2: ( (lv_value_1_0= RULE_HEX ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4234:1: (lv_value_1_0= RULE_HEX )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4234:1: (lv_value_1_0= RULE_HEX )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4235:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleHexLiteral9886); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4259:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4260:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4261:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9927);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral9937); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4268:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4271:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4272:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4272:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4272:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4272:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4273:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4278:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4279:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4279:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4280:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral9988); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4304:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4306:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4307:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4307:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4307:2: (enumLiteral_0= 'local' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4307:2: (enumLiteral_0= 'local' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4307:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_59_in_ruleDirection10043); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4313:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4313:6: (enumLiteral_1= 'in' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4313:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_60_in_ruleDirection10060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4319:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4319:6: (enumLiteral_2= 'out' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4319:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_61_in_ruleDirection10077); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4329:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4331:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4332:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4332:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4332:2: (enumLiteral_0= 'after' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4332:2: (enumLiteral_0= 'after' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4332:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_62_in_ruleTimeEventType10122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4338:6: (enumLiteral_1= 'every' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4338:6: (enumLiteral_1= 'every' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4338:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_63_in_ruleTimeEventType10139); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4348:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4350:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4351:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4351:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            int alt62=11;
            switch ( input.LA(1) ) {
            case 32:
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4351:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4351:2: (enumLiteral_0= '=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4351:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_32_in_ruleAssignmentOperator10184); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4357:6: (enumLiteral_1= '*=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4357:6: (enumLiteral_1= '*=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4357:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_64_in_ruleAssignmentOperator10201); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4363:6: (enumLiteral_2= '/=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4363:6: (enumLiteral_2= '/=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4363:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_65_in_ruleAssignmentOperator10218); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4369:6: (enumLiteral_3= '%=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4369:6: (enumLiteral_3= '%=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4369:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_66_in_ruleAssignmentOperator10235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4375:6: (enumLiteral_4= '+=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4375:6: (enumLiteral_4= '+=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4375:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,67,FOLLOW_67_in_ruleAssignmentOperator10252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4381:6: (enumLiteral_5= '-=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4381:6: (enumLiteral_5= '-=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4381:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,68,FOLLOW_68_in_ruleAssignmentOperator10269); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4387:6: (enumLiteral_6= '<<=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4387:6: (enumLiteral_6= '<<=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4387:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,69,FOLLOW_69_in_ruleAssignmentOperator10286); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4393:6: (enumLiteral_7= '>>=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4393:6: (enumLiteral_7= '>>=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4393:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,70,FOLLOW_70_in_ruleAssignmentOperator10303); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4399:6: (enumLiteral_8= '&=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4399:6: (enumLiteral_8= '&=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4399:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,71,FOLLOW_71_in_ruleAssignmentOperator10320); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4405:6: (enumLiteral_9= '^=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4405:6: (enumLiteral_9= '^=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4405:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,72,FOLLOW_72_in_ruleAssignmentOperator10337); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4411:6: (enumLiteral_10= '|=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4411:6: (enumLiteral_10= '|=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4411:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,73,FOLLOW_73_in_ruleAssignmentOperator10354); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4421:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4423:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4424:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4424:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4424:2: (enumLiteral_0= '<<' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4424:2: (enumLiteral_0= '<<' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4424:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_74_in_ruleShiftOperator10399); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4430:6: (enumLiteral_1= '>>' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4430:6: (enumLiteral_1= '>>' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4430:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_75_in_ruleShiftOperator10416); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4440:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4442:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4443:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4443:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4443:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4443:2: (enumLiteral_0= '+' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4443:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_76_in_ruleAdditiveOperator10461); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4449:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4449:6: (enumLiteral_1= '-' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4449:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_77_in_ruleAdditiveOperator10478); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4459:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4461:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4462:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4462:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt65=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt65=1;
                }
                break;
            case 23:
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4462:2: (enumLiteral_0= '*' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4462:2: (enumLiteral_0= '*' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4462:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_78_in_ruleMultiplicativeOperator10523); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4468:6: (enumLiteral_1= '/' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4468:6: (enumLiteral_1= '/' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4468:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_23_in_ruleMultiplicativeOperator10540); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4474:6: (enumLiteral_2= '%' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4474:6: (enumLiteral_2= '%' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4474:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_79_in_ruleMultiplicativeOperator10557); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4484:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4486:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4487:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4487:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4487:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4487:2: (enumLiteral_0= '+' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4487:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_76_in_ruleUnaryOperator10602); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4493:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4493:6: (enumLiteral_1= '-' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4493:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_77_in_ruleUnaryOperator10619); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4499:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4499:6: (enumLiteral_2= '~' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4499:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,80,FOLLOW_80_in_ruleUnaryOperator10636); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4509:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4511:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4512:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4512:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4512:2: (enumLiteral_0= '<' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4512:2: (enumLiteral_0= '<' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4512:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_81_in_ruleRelationalOperator10681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4518:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4518:6: (enumLiteral_1= '<=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4518:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_82_in_ruleRelationalOperator10698); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4524:6: (enumLiteral_2= '>' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4524:6: (enumLiteral_2= '>' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4524:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_42_in_ruleRelationalOperator10715); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4530:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4530:6: (enumLiteral_3= '>=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4530:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,83,FOLLOW_83_in_ruleRelationalOperator10732); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4536:6: (enumLiteral_4= '==' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4536:6: (enumLiteral_4= '==' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4536:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,84,FOLLOW_84_in_ruleRelationalOperator10749); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4542:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4542:6: (enumLiteral_5= '!=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4542:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,85,FOLLOW_85_in_ruleRelationalOperator10766); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4552:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4554:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4555:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4555:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4555:2: (enumLiteral_0= 's' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4555:2: (enumLiteral_0= 's' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4555:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_86_in_ruleTimeUnit10811); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4561:6: (enumLiteral_1= 'ms' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4561:6: (enumLiteral_1= 'ms' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4561:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_87_in_ruleTimeUnit10828); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4567:6: (enumLiteral_2= 'us' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4567:6: (enumLiteral_2= 'us' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4567:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,88,FOLLOW_88_in_ruleTimeUnit10845); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4573:6: (enumLiteral_3= 'ns' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4573:6: (enumLiteral_3= 'ns' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4573:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,89,FOLLOW_89_in_ruleTimeUnit10862); if (state.failed) return current;
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
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1862:6: ( '[' )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1862:8: '['
        {
        match(input,40,FOLLOW_40_in_synpred2_InternalSCCExp4305); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalSCCExp

    // $ANTLR start synpred3_InternalSCCExp
    public final void synpred3_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1979:4: ( ';' )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1979:6: ';'
        {
        match(input,18,FOLLOW_18_in_synpred3_InternalSCCExp4542); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalSCCExp

    // $ANTLR start synpred4_InternalSCCExp
    public final void synpred4_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3720:4: ( ( '(' ) )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3721:1: ( '(' )
        {
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3721:1: ( '(' )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3722:2: '('
        {
        match(input,34,FOLLOW_34_in_synpred4_InternalSCCExp8679); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalSCCExp

    // $ANTLR start synpred5_InternalSCCExp
    public final void synpred5_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3825:4: ( ( '(' ) )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3826:1: ( '(' )
        {
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3826:1: ( '(' )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3827:2: '('
        {
        match(input,34,FOLLOW_34_in_synpred5_InternalSCCExp8902); if (state.failed) return ;

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
    public static final BitSet FOLLOW_14_in_ruleStateRoot332 = new BitSet(new long[]{0x0000000000790000L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleStateRoot353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionRoot399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleTransitionRoot436 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_entryRuleStateScope493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateScope503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScopeRoot_in_ruleStateScope549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScopeRoot_in_entryRuleInterfaceScopeRoot583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScopeRoot593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleInterfaceScopeRoot648 = new BitSet(new long[]{0x0000000000790002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScope695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDeclaration_in_ruleInterfaceScope742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionDeclaration_in_ruleInterfaceScope769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspendDeclaration_in_ruleInterfaceScope796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDeclaration_in_entryRuleInterfaceDeclaration831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDeclaration841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleInterfaceDeclaration887 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceDeclaration904 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInterfaceDeclaration922 = new BitSet(new long[]{0x3800006230040000L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInterfaceDeclaration945 = new BitSet(new long[]{0x3800006230040000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInterfaceDeclaration964 = new BitSet(new long[]{0x3800006230040000L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInterfaceDeclaration983 = new BitSet(new long[]{0x3800006230040000L});
    public static final BitSet FOLLOW_ruleEntrypoint_in_ruleInterfaceDeclaration1002 = new BitSet(new long[]{0x3800006230040000L});
    public static final BitSet FOLLOW_ruleExitpoint_in_ruleInterfaceDeclaration1021 = new BitSet(new long[]{0x3800006230040000L});
    public static final BitSet FOLLOW_18_in_ruleInterfaceDeclaration1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionDeclaration_in_entryRuleActionDeclaration1073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionDeclaration1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryActionDeclaration_in_ruleActionDeclaration1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsideActionDeclaration_in_ruleActionDeclaration1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitActionDeclaration_in_ruleActionDeclaration1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitActionDeclaration_in_entryRuleExitActionDeclaration1219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitActionDeclaration1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleExitActionDeclaration1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsideActionDeclaration_in_entryRuleInsideActionDeclaration1311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsideActionDeclaration1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleInsideActionDeclaration1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryActionDeclaration_in_entryRuleEntryActionDeclaration1403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryActionDeclaration1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEntryActionDeclaration1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspendDeclaration_in_entryRuleSuspendDeclaration1495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuspendDeclaration1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSuspendDeclaration1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction1587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionReaction1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyTrigger_in_ruleTransitionReaction1652 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_23_in_ruleTransitionReaction1666 = new BitSet(new long[]{0x06220004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransitionReaction1687 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleTransitionReaction1702 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_ruleReactionProperties_in_ruleTransitionReaction1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyTrigger_in_entryRuleMyTrigger1761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMyTrigger1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMyTrigger1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification1857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartSpecification1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleStatechartSpecification1914 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleStatechartSpecification1935 = new BitSet(new long[]{0x0000000008790002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification1958 = new BitSet(new long[]{0x0000000008790002L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification1995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateSpecification2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_ruleStateSpecification2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification2085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope2177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartScope2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStatechartScope2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_ruleStatechartScope2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_entryRuleInternalScope2298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalScope2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleInternalScope2354 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInternalScope2366 = new BitSet(new long[]{0xF801F90230000012L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInternalScope2389 = new BitSet(new long[]{0xF801F90230000012L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInternalScope2408 = new BitSet(new long[]{0xF801F90230000012L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInternalScope2427 = new BitSet(new long[]{0xF801F90230000012L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleInternalScope2446 = new BitSet(new long[]{0xF801F90230000012L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion2488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclarartion2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition2580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDefinition2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleEventDefinition2636 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEventDefinition2649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventDefinition2666 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleEventDefinition2684 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEventDefinition2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition2837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleVariableDefinition2893 = new BitSet(new long[]{0x00000000C0000010L});
    public static final BitSet FOLLOW_30_in_ruleVariableDefinition2956 = new BitSet(new long[]{0x00000000C0000010L});
    public static final BitSet FOLLOW_31_in_ruleVariableDefinition3041 = new BitSet(new long[]{0x00000000C0000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDefinition3111 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVariableDefinition3128 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleVariableDefinition3151 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleVariableDefinition3164 = new BitSet(new long[]{0x06200004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDefinition3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration3223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDeclaration3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition3315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDefinition3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOperationDefinition3371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperationDefinition3388 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleOperationDefinition3405 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition3427 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleOperationDefinition3440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition3461 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_36_in_ruleOperationDefinition3477 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleOperationDefinition3490 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter3603 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleParameter3620 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleParameter3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntrypoint_in_entryRuleEntrypoint3679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntrypoint3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleEntrypoint3735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntrypoint3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitpoint_in_entryRuleExitpoint3793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitpoint3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleExitpoint3849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExitpoint3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN3908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3959 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleFQN3978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3993 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction4042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReaction4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReaction4098 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleLocalReaction4130 = new BitSet(new long[]{0x06220004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalReaction4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger4189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionTrigger4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSpec_in_ruleReactionTrigger4256 = new BitSet(new long[]{0x0000010800000002L});
    public static final BitSet FOLLOW_35_in_ruleReactionTrigger4269 = new BitSet(new long[]{0xC001F80000000010L});
    public static final BitSet FOLLOW_ruleEventSpec_in_ruleReactionTrigger4290 = new BitSet(new long[]{0x0000010800000002L});
    public static final BitSet FOLLOW_40_in_ruleReactionTrigger4313 = new BitSet(new long[]{0x06200004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger4335 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleReactionTrigger4347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleReactionTrigger4369 = new BitSet(new long[]{0x06200004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger4390 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleReactionTrigger4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect4440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionEffect4450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect4507 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4526 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleReactionEffect4550 = new BitSet(new long[]{0x06220004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect4574 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect4593 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleReactionProperties_in_entryRuleReactionProperties4634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionProperties4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionProperty_in_ruleReactionProperties4699 = new BitSet(new long[]{0x0000040000000012L});
    public static final BitSet FOLLOW_ruleReactionProperty_in_entryRuleReactionProperty4736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionProperty4746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_ruleReactionProperty4793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_ruleReactionProperty4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec4855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryPointSpec4865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEntryPointSpec4902 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEntryPointSpec4925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec4961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitPointSpec4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleExitPointSpec5019 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleExitPointSpec5031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSpec_in_entryRuleEventSpec5067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventSpec5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_ruleEventSpec5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_ruleEventSpec5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_ruleEventSpec5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec5213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularEventSpec5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec5268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec5303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeEventSpec5313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec5359 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeEventSpec5376 = new BitSet(new long[]{0x0000000000000002L,0x0000000003C00000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec5402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec5439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinEventSpec5449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCycleEvent_in_ruleBuiltinEventSpec5550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec5577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultEvent_in_ruleBuiltinEventSpec5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent5639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryEvent5649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEntryEvent5695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent5731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent5741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleExitEvent5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCycleEvent_in_entryRuleOnCycleEvent5823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnCycleEvent5833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOnCycleEvent5879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent5915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEvent5925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleAlwaysEvent5971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultEvent_in_entryRuleDefaultEvent6007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultEvent6017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDefaultEvent6064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDefaultEvent6082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_entryRuleEventRaisingExpression6119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventRaisingExpression6129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleEventRaisingExpression6175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventRaisingExpression6196 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleEventRaisingExpression6209 = new BitSet(new long[]{0x06200004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEventRaisingExpression6230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpression6326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression6360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression6370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6417 = new BitSet(new long[]{0x0000000100000002L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression6447 = new BitSet(new long[]{0x06200004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression6468 = new BitSet(new long[]{0x0000000100000002L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression6516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6563 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleConditionalExpression6584 = new BitSet(new long[]{0x06200004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6605 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleConditionalExpression6617 = new BitSet(new long[]{0x06200004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression6638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression6676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression6686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6733 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleLogicalOrExpression6754 = new BitSet(new long[]{0x06200004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6775 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression6823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6870 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleLogicalAndExpression6891 = new BitSet(new long[]{0x06200004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6912 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression6950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNotExpression6960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleLogicalNotExpression7034 = new BitSet(new long[]{0x06000004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression7055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression7102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7149 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleBitwiseXorExpression7170 = new BitSet(new long[]{0x06000004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression7191 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression7239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7286 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleBitwiseOrExpression7307 = new BitSet(new long[]{0x06000004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression7328 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression7376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7423 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleBitwiseAndExpression7444 = new BitSet(new long[]{0x06000004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression7465 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression7503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalRelationExpression7513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7560 = new BitSet(new long[]{0x0000040000000002L,0x00000000003E0000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression7590 = new BitSet(new long[]{0x06000004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression7611 = new BitSet(new long[]{0x0000040000000002L,0x00000000003E0000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression7649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression7659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7706 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression7736 = new BitSet(new long[]{0x06000004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7757 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7852 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7882 = new BitSet(new long[]{0x06000004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7903 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression7941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression7951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression7998 = new BitSet(new long[]{0x0000000000800002L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression8028 = new BitSet(new long[]{0x06000004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression8049 = new BitSet(new long[]{0x0000000000800002L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression8087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalUnaryExpression8097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression8180 = new BitSet(new long[]{0x06000004000003F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression8201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression8238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression8248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression8295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression8322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression8349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression8376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePrimaryExpression8394 = new BitSet(new long[]{0x06200004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression8416 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_rulePrimaryExpression8427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression8464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValueExpression8474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression8529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall8565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall8575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall8622 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleFeatureCall8643 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureCall8663 = new BitSet(new long[]{0x0000008400000002L});
    public static final BitSet FOLLOW_34_in_ruleFeatureCall8697 = new BitSet(new long[]{0x06200014000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8732 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleFeatureCall8745 = new BitSet(new long[]{0x06200004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8766 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_36_in_ruleFeatureCall8782 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementReferenceExpression8832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementReferenceExpression8886 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleElementReferenceExpression8920 = new BitSet(new long[]{0x06200014000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8955 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleElementReferenceExpression8968 = new BitSet(new long[]{0x06200004000003F0L,0x0000000000013000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8989 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_36_in_ruleElementReferenceExpression9005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression9043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventValueReferenceExpression9053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleEventValueReferenceExpression9099 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEventValueReferenceExpression9111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression9132 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleEventValueReferenceExpression9144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression9180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression9190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleActiveStateReferenceExpression9236 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleActiveStateReferenceExpression9248 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression9271 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleActiveStateReferenceExpression9283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral9319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral9329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral9376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral9403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_ruleLiteral9430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleLiteral9457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral9484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral9519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral9529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral9580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral9621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral9631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral9682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral9723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral9733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRealLiteral9784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexLiteral9835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleHexLiteral9886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral9988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleDirection10043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDirection10060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleDirection10077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleTimeEventType10122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleTimeEventType10139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAssignmentOperator10184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleAssignmentOperator10201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleAssignmentOperator10218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleAssignmentOperator10235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleAssignmentOperator10252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleAssignmentOperator10269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleAssignmentOperator10286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleAssignmentOperator10303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleAssignmentOperator10320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleAssignmentOperator10337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleAssignmentOperator10354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleShiftOperator10399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleShiftOperator10416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleAdditiveOperator10461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAdditiveOperator10478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleMultiplicativeOperator10523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleMultiplicativeOperator10540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleMultiplicativeOperator10557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleUnaryOperator10602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleUnaryOperator10619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleUnaryOperator10636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleRelationalOperator10681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleRelationalOperator10698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleRelationalOperator10715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleRelationalOperator10732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleRelationalOperator10749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleRelationalOperator10766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleTimeUnit10811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleTimeUnit10828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleTimeUnit10845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleTimeUnit10862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred2_InternalSCCExp4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred3_InternalSCCExp4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_synpred4_InternalSCCExp8679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_synpred5_InternalSCCExp8902 = new BitSet(new long[]{0x0000000000000002L});

}
