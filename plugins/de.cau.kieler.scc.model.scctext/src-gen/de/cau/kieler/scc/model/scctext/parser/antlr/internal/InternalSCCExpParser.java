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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_FLOAT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@@state@@'", "'@@transition@@'", "'interface:'", "','", "';'", "'local'", "':'", "'='", "'with'", "'in'", "'out'", "'inout'", "'OnExitAction:'", "'OnInsideAction:'", "'OnEntryAction:'", "'/'", "'Suspend:'", "'#'", "'some trigger expression'", "'namespace'", "'internal'", "'event'", "'var'", "'readonly'", "'external'", "'operation'", "'('", "')'", "'entrypoint'", "'exitpoint'", "'.'", "'['", "']'", "'>'", "'entry'", "'exit'", "'oncycle'", "'always'", "'default'", "'else'", "'raise'", "'?'", "'||'", "'&&'", "'!'", "'^'", "'|'", "'&'", "'valueof'", "'active'", "'\\'none\\''", "'\\'+\\''", "'\\'*\\''", "'\\'max\\''", "'\\'min\\''", "'\\'or\\''", "'\\'and\\''", "'\\'host\\''", "'after'", "'every'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'%'", "'~'", "'<'", "'<='", "'>='", "'=='", "'!='", "'s'", "'ms'", "'us'", "'ns'"
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

                if ( (LA3_0==16||(LA3_0>=26 && LA3_0<=28)||LA3_0==30) ) {
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
            case 26:
            case 27:
            case 28:
                {
                alt4=2;
                }
                break;
            case 30:
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:367:1: ruleInterfaceDeclaration returns [EObject current=null] : ( () otherlv_1= 'interface:' ( (lv_declaration_2_0= ruleSCCVariableDeclaration ) ) (otherlv_3= ',' ( (lv_declaration_4_0= ruleSCCVariableDeclaration ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleInterfaceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_declaration_2_0 = null;

        EObject lv_declaration_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:370:28: ( ( () otherlv_1= 'interface:' ( (lv_declaration_2_0= ruleSCCVariableDeclaration ) ) (otherlv_3= ',' ( (lv_declaration_4_0= ruleSCCVariableDeclaration ) ) )* otherlv_5= ';' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:371:1: ( () otherlv_1= 'interface:' ( (lv_declaration_2_0= ruleSCCVariableDeclaration ) ) (otherlv_3= ',' ( (lv_declaration_4_0= ruleSCCVariableDeclaration ) ) )* otherlv_5= ';' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:371:1: ( () otherlv_1= 'interface:' ( (lv_declaration_2_0= ruleSCCVariableDeclaration ) ) (otherlv_3= ',' ( (lv_declaration_4_0= ruleSCCVariableDeclaration ) ) )* otherlv_5= ';' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:371:2: () otherlv_1= 'interface:' ( (lv_declaration_2_0= ruleSCCVariableDeclaration ) ) (otherlv_3= ',' ( (lv_declaration_4_0= ruleSCCVariableDeclaration ) ) )* otherlv_5= ';'
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:381:1: ( (lv_declaration_2_0= ruleSCCVariableDeclaration ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:382:1: (lv_declaration_2_0= ruleSCCVariableDeclaration )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:382:1: (lv_declaration_2_0= ruleSCCVariableDeclaration )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:383:3: lv_declaration_2_0= ruleSCCVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getDeclarationSCCVariableDeclarationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSCCVariableDeclaration_in_ruleInterfaceDeclaration908);
            lv_declaration_2_0=ruleSCCVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInterfaceDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"declaration",
                      		lv_declaration_2_0, 
                      		"SCCVariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:399:2: (otherlv_3= ',' ( (lv_declaration_4_0= ruleSCCVariableDeclaration ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:399:4: otherlv_3= ',' ( (lv_declaration_4_0= ruleSCCVariableDeclaration ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleInterfaceDeclaration921); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getInterfaceDeclarationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:403:1: ( (lv_declaration_4_0= ruleSCCVariableDeclaration ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:404:1: (lv_declaration_4_0= ruleSCCVariableDeclaration )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:404:1: (lv_declaration_4_0= ruleSCCVariableDeclaration )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:405:3: lv_declaration_4_0= ruleSCCVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getDeclarationSCCVariableDeclarationParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSCCVariableDeclaration_in_ruleInterfaceDeclaration942);
            	    lv_declaration_4_0=ruleSCCVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInterfaceDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declaration",
            	              		lv_declaration_4_0, 
            	              		"SCCVariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleInterfaceDeclaration956); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getInterfaceDeclarationAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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


    // $ANTLR start "entryRuleSCCVariableDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:433:1: entryRuleSCCVariableDeclaration returns [EObject current=null] : iv_ruleSCCVariableDeclaration= ruleSCCVariableDeclaration EOF ;
    public final EObject entryRuleSCCVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSCCVariableDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:434:2: (iv_ruleSCCVariableDeclaration= ruleSCCVariableDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:435:2: iv_ruleSCCVariableDeclaration= ruleSCCVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSCCVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSCCVariableDeclaration_in_entryRuleSCCVariableDeclaration992);
            iv_ruleSCCVariableDeclaration=ruleSCCVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSCCVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSCCVariableDeclaration1002); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSCCVariableDeclaration"


    // $ANTLR start "ruleSCCVariableDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:442:1: ruleSCCVariableDeclaration returns [EObject current=null] : (this_InputVariableDeclaration_0= ruleInputVariableDeclaration | this_OutputVariableeclaration_1= ruleOutputVariableeclaration | this_InOutVariableDeclaration_2= ruleInOutVariableDeclaration | this_LocalVariableDeclaration_3= ruleLocalVariableDeclaration ) ;
    public final EObject ruleSCCVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_InputVariableDeclaration_0 = null;

        EObject this_OutputVariableeclaration_1 = null;

        EObject this_InOutVariableDeclaration_2 = null;

        EObject this_LocalVariableDeclaration_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:445:28: ( (this_InputVariableDeclaration_0= ruleInputVariableDeclaration | this_OutputVariableeclaration_1= ruleOutputVariableeclaration | this_InOutVariableDeclaration_2= ruleInOutVariableDeclaration | this_LocalVariableDeclaration_3= ruleLocalVariableDeclaration ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:446:1: (this_InputVariableDeclaration_0= ruleInputVariableDeclaration | this_OutputVariableeclaration_1= ruleOutputVariableeclaration | this_InOutVariableDeclaration_2= ruleInOutVariableDeclaration | this_LocalVariableDeclaration_3= ruleLocalVariableDeclaration )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:446:1: (this_InputVariableDeclaration_0= ruleInputVariableDeclaration | this_OutputVariableeclaration_1= ruleOutputVariableeclaration | this_InOutVariableDeclaration_2= ruleInOutVariableDeclaration | this_LocalVariableDeclaration_3= ruleLocalVariableDeclaration )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:447:5: this_InputVariableDeclaration_0= ruleInputVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSCCVariableDeclarationAccess().getInputVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInputVariableDeclaration_in_ruleSCCVariableDeclaration1049);
                    this_InputVariableDeclaration_0=ruleInputVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InputVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:457:5: this_OutputVariableeclaration_1= ruleOutputVariableeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSCCVariableDeclarationAccess().getOutputVariableeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOutputVariableeclaration_in_ruleSCCVariableDeclaration1076);
                    this_OutputVariableeclaration_1=ruleOutputVariableeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OutputVariableeclaration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:467:5: this_InOutVariableDeclaration_2= ruleInOutVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSCCVariableDeclarationAccess().getInOutVariableDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInOutVariableDeclaration_in_ruleSCCVariableDeclaration1103);
                    this_InOutVariableDeclaration_2=ruleInOutVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InOutVariableDeclaration_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:477:5: this_LocalVariableDeclaration_3= ruleLocalVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSCCVariableDeclarationAccess().getLocalVariableDeclarationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLocalVariableDeclaration_in_ruleSCCVariableDeclaration1130);
                    this_LocalVariableDeclaration_3=ruleLocalVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalVariableDeclaration_3; 
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
    // $ANTLR end "ruleSCCVariableDeclaration"


    // $ANTLR start "entryRuleLocalVariableDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:493:1: entryRuleLocalVariableDeclaration returns [EObject current=null] : iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF ;
    public final EObject entryRuleLocalVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariableDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:494:2: (iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:495:2: iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleLocalVariableDeclaration_in_entryRuleLocalVariableDeclaration1165);
            iv_ruleLocalVariableDeclaration=ruleLocalVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalVariableDeclaration1175); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalVariableDeclaration"


    // $ANTLR start "ruleLocalVariableDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:502:1: ruleLocalVariableDeclaration returns [EObject current=null] : ( () otherlv_1= 'local' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_operator_8_0= ruleCombineOperator ) ) )? ) ;
    public final EObject ruleLocalVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_initialValue_6_0 = null;

        Enumerator lv_operator_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:505:28: ( ( () otherlv_1= 'local' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_operator_8_0= ruleCombineOperator ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:506:1: ( () otherlv_1= 'local' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_operator_8_0= ruleCombineOperator ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:506:1: ( () otherlv_1= 'local' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_operator_8_0= ruleCombineOperator ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:506:2: () otherlv_1= 'local' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_operator_8_0= ruleCombineOperator ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:506:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:507:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalVariableDeclarationAccess().getLocalAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleLocalVariableDeclaration1221); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalVariableDeclarationAccess().getLocalKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:516:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:517:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:517:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:518:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalVariableDeclaration1238); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getLocalVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleLocalVariableDeclaration1255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLocalVariableDeclarationAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:538:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:539:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:539:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:540:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalVariableDeclarationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalVariableDeclarationAccess().getTypeTypeCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleLocalVariableDeclaration1278);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:553:2: (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:553:4: otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleLocalVariableDeclaration1291); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getLocalVariableDeclarationAccess().getEqualsSignKeyword_5_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:557:1: ( (lv_initialValue_6_0= ruleExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:558:1: (lv_initialValue_6_0= ruleExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:558:1: (lv_initialValue_6_0= ruleExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:559:3: lv_initialValue_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalVariableDeclarationAccess().getInitialValueExpressionParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleLocalVariableDeclaration1312);
                    lv_initialValue_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocalVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"initialValue",
                              		lv_initialValue_6_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:575:4: (otherlv_7= 'with' ( (lv_operator_8_0= ruleCombineOperator ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:575:6: otherlv_7= 'with' ( (lv_operator_8_0= ruleCombineOperator ) )
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleLocalVariableDeclaration1327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getLocalVariableDeclarationAccess().getWithKeyword_6_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:579:1: ( (lv_operator_8_0= ruleCombineOperator ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:580:1: (lv_operator_8_0= ruleCombineOperator )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:580:1: (lv_operator_8_0= ruleCombineOperator )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:581:3: lv_operator_8_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalVariableDeclarationAccess().getOperatorCombineOperatorEnumRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleLocalVariableDeclaration1348);
                    lv_operator_8_0=ruleCombineOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocalVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_8_0, 
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
    // $ANTLR end "ruleLocalVariableDeclaration"


    // $ANTLR start "entryRuleInOutVariableDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:605:1: entryRuleInOutVariableDeclaration returns [EObject current=null] : iv_ruleInOutVariableDeclaration= ruleInOutVariableDeclaration EOF ;
    public final EObject entryRuleInOutVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInOutVariableDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:606:2: (iv_ruleInOutVariableDeclaration= ruleInOutVariableDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:607:2: iv_ruleInOutVariableDeclaration= ruleInOutVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInOutVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleInOutVariableDeclaration_in_entryRuleInOutVariableDeclaration1386);
            iv_ruleInOutVariableDeclaration=ruleInOutVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInOutVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInOutVariableDeclaration1396); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInOutVariableDeclaration"


    // $ANTLR start "ruleInOutVariableDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:614:1: ruleInOutVariableDeclaration returns [EObject current=null] : ( () otherlv_1= 'in' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_operator_8_0= ruleCombineOperator ) ) )? ) ;
    public final EObject ruleInOutVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_initialValue_6_0 = null;

        Enumerator lv_operator_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:617:28: ( ( () otherlv_1= 'in' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_operator_8_0= ruleCombineOperator ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:618:1: ( () otherlv_1= 'in' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_operator_8_0= ruleCombineOperator ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:618:1: ( () otherlv_1= 'in' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_operator_8_0= ruleCombineOperator ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:618:2: () otherlv_1= 'in' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_operator_8_0= ruleCombineOperator ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:618:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:619:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInOutVariableDeclarationAccess().getInputAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleInOutVariableDeclaration1442); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInOutVariableDeclarationAccess().getInKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:628:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:629:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:629:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:630:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInOutVariableDeclaration1459); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getInOutVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInOutVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleInOutVariableDeclaration1476); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInOutVariableDeclarationAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:650:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:651:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:651:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:652:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInOutVariableDeclarationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInOutVariableDeclarationAccess().getTypeTypeCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleInOutVariableDeclaration1499);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:665:2: (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:665:4: otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleInOutVariableDeclaration1512); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getInOutVariableDeclarationAccess().getEqualsSignKeyword_5_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:669:1: ( (lv_initialValue_6_0= ruleExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:670:1: (lv_initialValue_6_0= ruleExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:670:1: (lv_initialValue_6_0= ruleExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:671:3: lv_initialValue_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInOutVariableDeclarationAccess().getInitialValueExpressionParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleInOutVariableDeclaration1533);
                    lv_initialValue_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInOutVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"initialValue",
                              		lv_initialValue_6_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:687:4: (otherlv_7= 'with' ( (lv_operator_8_0= ruleCombineOperator ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:687:6: otherlv_7= 'with' ( (lv_operator_8_0= ruleCombineOperator ) )
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleInOutVariableDeclaration1548); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getInOutVariableDeclarationAccess().getWithKeyword_6_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:691:1: ( (lv_operator_8_0= ruleCombineOperator ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:692:1: (lv_operator_8_0= ruleCombineOperator )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:692:1: (lv_operator_8_0= ruleCombineOperator )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:693:3: lv_operator_8_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInOutVariableDeclarationAccess().getOperatorCombineOperatorEnumRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleInOutVariableDeclaration1569);
                    lv_operator_8_0=ruleCombineOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInOutVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_8_0, 
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
    // $ANTLR end "ruleInOutVariableDeclaration"


    // $ANTLR start "entryRuleOutputVariableeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:717:1: entryRuleOutputVariableeclaration returns [EObject current=null] : iv_ruleOutputVariableeclaration= ruleOutputVariableeclaration EOF ;
    public final EObject entryRuleOutputVariableeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputVariableeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:718:2: (iv_ruleOutputVariableeclaration= ruleOutputVariableeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:719:2: iv_ruleOutputVariableeclaration= ruleOutputVariableeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputVariableeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOutputVariableeclaration_in_entryRuleOutputVariableeclaration1607);
            iv_ruleOutputVariableeclaration=ruleOutputVariableeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutputVariableeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputVariableeclaration1617); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputVariableeclaration"


    // $ANTLR start "ruleOutputVariableeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:726:1: ruleOutputVariableeclaration returns [EObject current=null] : ( () otherlv_1= 'out' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) )? ) ;
    public final EObject ruleOutputVariableeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_operator_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:729:28: ( ( () otherlv_1= 'out' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:730:1: ( () otherlv_1= 'out' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:730:1: ( () otherlv_1= 'out' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:730:2: () otherlv_1= 'out' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:730:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:731:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOutputVariableeclarationAccess().getOutputAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleOutputVariableeclaration1663); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOutputVariableeclarationAccess().getOutKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:740:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:741:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:741:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:742:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutputVariableeclaration1680); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getOutputVariableeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOutputVariableeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleOutputVariableeclaration1697); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOutputVariableeclarationAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:762:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:763:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:763:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:764:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOutputVariableeclarationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOutputVariableeclarationAccess().getTypeTypeCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleOutputVariableeclaration1720);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:777:2: (otherlv_5= 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:777:4: otherlv_5= 'with' ( (lv_operator_6_0= ruleCombineOperator ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleOutputVariableeclaration1733); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getOutputVariableeclarationAccess().getWithKeyword_5_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:781:1: ( (lv_operator_6_0= ruleCombineOperator ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:782:1: (lv_operator_6_0= ruleCombineOperator )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:782:1: (lv_operator_6_0= ruleCombineOperator )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:783:3: lv_operator_6_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOutputVariableeclarationAccess().getOperatorCombineOperatorEnumRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleOutputVariableeclaration1754);
                    lv_operator_6_0=ruleCombineOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOutputVariableeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_6_0, 
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
    // $ANTLR end "ruleOutputVariableeclaration"


    // $ANTLR start "entryRuleInputVariableDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:807:1: entryRuleInputVariableDeclaration returns [EObject current=null] : iv_ruleInputVariableDeclaration= ruleInputVariableDeclaration EOF ;
    public final EObject entryRuleInputVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputVariableDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:808:2: (iv_ruleInputVariableDeclaration= ruleInputVariableDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:809:2: iv_ruleInputVariableDeclaration= ruleInputVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleInputVariableDeclaration_in_entryRuleInputVariableDeclaration1792);
            iv_ruleInputVariableDeclaration=ruleInputVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInputVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputVariableDeclaration1802); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputVariableDeclaration"


    // $ANTLR start "ruleInputVariableDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:816:1: ruleInputVariableDeclaration returns [EObject current=null] : ( () otherlv_1= 'inout' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_operator_8_0= ruleCombineOperator ) ) )? ) ;
    public final EObject ruleInputVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_initialValue_6_0 = null;

        Enumerator lv_operator_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:819:28: ( ( () otherlv_1= 'inout' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_operator_8_0= ruleCombineOperator ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:820:1: ( () otherlv_1= 'inout' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_operator_8_0= ruleCombineOperator ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:820:1: ( () otherlv_1= 'inout' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_operator_8_0= ruleCombineOperator ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:820:2: () otherlv_1= 'inout' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'with' ( (lv_operator_8_0= ruleCombineOperator ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:820:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:821:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInputVariableDeclarationAccess().getInOutAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleInputVariableDeclaration1848); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInputVariableDeclarationAccess().getInoutKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:830:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:831:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:831:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:832:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInputVariableDeclaration1865); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getInputVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInputVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleInputVariableDeclaration1882); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInputVariableDeclarationAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:852:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:853:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:853:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:854:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInputVariableDeclarationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInputVariableDeclarationAccess().getTypeTypeCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleInputVariableDeclaration1905);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:867:2: (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:867:4: otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleInputVariableDeclaration1918); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getInputVariableDeclarationAccess().getEqualsSignKeyword_5_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:871:1: ( (lv_initialValue_6_0= ruleExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:872:1: (lv_initialValue_6_0= ruleExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:872:1: (lv_initialValue_6_0= ruleExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:873:3: lv_initialValue_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInputVariableDeclarationAccess().getInitialValueExpressionParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleInputVariableDeclaration1939);
                    lv_initialValue_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInputVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"initialValue",
                              		lv_initialValue_6_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:889:4: (otherlv_7= 'with' ( (lv_operator_8_0= ruleCombineOperator ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:889:6: otherlv_7= 'with' ( (lv_operator_8_0= ruleCombineOperator ) )
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleInputVariableDeclaration1954); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getInputVariableDeclarationAccess().getWithKeyword_6_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:893:1: ( (lv_operator_8_0= ruleCombineOperator ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:894:1: (lv_operator_8_0= ruleCombineOperator )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:894:1: (lv_operator_8_0= ruleCombineOperator )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:895:3: lv_operator_8_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInputVariableDeclarationAccess().getOperatorCombineOperatorEnumRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleInputVariableDeclaration1975);
                    lv_operator_8_0=ruleCombineOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInputVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_8_0, 
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
    // $ANTLR end "ruleInputVariableDeclaration"


    // $ANTLR start "entryRuleActionDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:919:1: entryRuleActionDeclaration returns [EObject current=null] : iv_ruleActionDeclaration= ruleActionDeclaration EOF ;
    public final EObject entryRuleActionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:920:2: (iv_ruleActionDeclaration= ruleActionDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:921:2: iv_ruleActionDeclaration= ruleActionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleActionDeclaration_in_entryRuleActionDeclaration2013);
            iv_ruleActionDeclaration=ruleActionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionDeclaration2023); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:928:1: ruleActionDeclaration returns [EObject current=null] : (this_EntryActionDeclaration_0= ruleEntryActionDeclaration | this_InsideActionDeclaration_1= ruleInsideActionDeclaration | this_ExitActionDeclaration_2= ruleExitActionDeclaration ) ;
    public final EObject ruleActionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_EntryActionDeclaration_0 = null;

        EObject this_InsideActionDeclaration_1 = null;

        EObject this_ExitActionDeclaration_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:931:28: ( (this_EntryActionDeclaration_0= ruleEntryActionDeclaration | this_InsideActionDeclaration_1= ruleInsideActionDeclaration | this_ExitActionDeclaration_2= ruleExitActionDeclaration ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:932:1: (this_EntryActionDeclaration_0= ruleEntryActionDeclaration | this_InsideActionDeclaration_1= ruleInsideActionDeclaration | this_ExitActionDeclaration_2= ruleExitActionDeclaration )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:932:1: (this_EntryActionDeclaration_0= ruleEntryActionDeclaration | this_InsideActionDeclaration_1= ruleInsideActionDeclaration | this_ExitActionDeclaration_2= ruleExitActionDeclaration )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt14=1;
                }
                break;
            case 27:
                {
                alt14=2;
                }
                break;
            case 26:
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:933:5: this_EntryActionDeclaration_0= ruleEntryActionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionDeclarationAccess().getEntryActionDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryActionDeclaration_in_ruleActionDeclaration2070);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:943:5: this_InsideActionDeclaration_1= ruleInsideActionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionDeclarationAccess().getInsideActionDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInsideActionDeclaration_in_ruleActionDeclaration2097);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:953:5: this_ExitActionDeclaration_2= ruleExitActionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionDeclarationAccess().getExitActionDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitActionDeclaration_in_ruleActionDeclaration2124);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:969:1: entryRuleExitActionDeclaration returns [EObject current=null] : iv_ruleExitActionDeclaration= ruleExitActionDeclaration EOF ;
    public final EObject entryRuleExitActionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitActionDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:970:2: (iv_ruleExitActionDeclaration= ruleExitActionDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:971:2: iv_ruleExitActionDeclaration= ruleExitActionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitActionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleExitActionDeclaration_in_entryRuleExitActionDeclaration2159);
            iv_ruleExitActionDeclaration=ruleExitActionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitActionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitActionDeclaration2169); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:978:1: ruleExitActionDeclaration returns [EObject current=null] : ( () otherlv_1= 'OnExitAction:' ( (lv_exitActionDeclaration_2_0= ruleActionVariableDeclaration ) ) (otherlv_3= ',' ( (lv_exitActionDeclaration_4_0= ruleActionVariableDeclaration ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleExitActionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exitActionDeclaration_2_0 = null;

        EObject lv_exitActionDeclaration_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:981:28: ( ( () otherlv_1= 'OnExitAction:' ( (lv_exitActionDeclaration_2_0= ruleActionVariableDeclaration ) ) (otherlv_3= ',' ( (lv_exitActionDeclaration_4_0= ruleActionVariableDeclaration ) ) )* otherlv_5= ';' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:982:1: ( () otherlv_1= 'OnExitAction:' ( (lv_exitActionDeclaration_2_0= ruleActionVariableDeclaration ) ) (otherlv_3= ',' ( (lv_exitActionDeclaration_4_0= ruleActionVariableDeclaration ) ) )* otherlv_5= ';' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:982:1: ( () otherlv_1= 'OnExitAction:' ( (lv_exitActionDeclaration_2_0= ruleActionVariableDeclaration ) ) (otherlv_3= ',' ( (lv_exitActionDeclaration_4_0= ruleActionVariableDeclaration ) ) )* otherlv_5= ';' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:982:2: () otherlv_1= 'OnExitAction:' ( (lv_exitActionDeclaration_2_0= ruleActionVariableDeclaration ) ) (otherlv_3= ',' ( (lv_exitActionDeclaration_4_0= ruleActionVariableDeclaration ) ) )* otherlv_5= ';'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:982:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:983:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitActionDeclarationAccess().getExitActionDeclarationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleExitActionDeclaration2215); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitActionDeclarationAccess().getOnExitActionKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:992:1: ( (lv_exitActionDeclaration_2_0= ruleActionVariableDeclaration ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:993:1: (lv_exitActionDeclaration_2_0= ruleActionVariableDeclaration )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:993:1: (lv_exitActionDeclaration_2_0= ruleActionVariableDeclaration )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:994:3: lv_exitActionDeclaration_2_0= ruleActionVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExitActionDeclarationAccess().getExitActionDeclarationActionVariableDeclarationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleActionVariableDeclaration_in_ruleExitActionDeclaration2236);
            lv_exitActionDeclaration_2_0=ruleActionVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExitActionDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"exitActionDeclaration",
                      		lv_exitActionDeclaration_2_0, 
                      		"ActionVariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1010:2: (otherlv_3= ',' ( (lv_exitActionDeclaration_4_0= ruleActionVariableDeclaration ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==17) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1010:4: otherlv_3= ',' ( (lv_exitActionDeclaration_4_0= ruleActionVariableDeclaration ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleExitActionDeclaration2249); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getExitActionDeclarationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1014:1: ( (lv_exitActionDeclaration_4_0= ruleActionVariableDeclaration ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1015:1: (lv_exitActionDeclaration_4_0= ruleActionVariableDeclaration )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1015:1: (lv_exitActionDeclaration_4_0= ruleActionVariableDeclaration )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1016:3: lv_exitActionDeclaration_4_0= ruleActionVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExitActionDeclarationAccess().getExitActionDeclarationActionVariableDeclarationParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleActionVariableDeclaration_in_ruleExitActionDeclaration2270);
            	    lv_exitActionDeclaration_4_0=ruleActionVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExitActionDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"exitActionDeclaration",
            	              		lv_exitActionDeclaration_4_0, 
            	              		"ActionVariableDeclaration");
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

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleExitActionDeclaration2284); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getExitActionDeclarationAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1044:1: entryRuleInsideActionDeclaration returns [EObject current=null] : iv_ruleInsideActionDeclaration= ruleInsideActionDeclaration EOF ;
    public final EObject entryRuleInsideActionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsideActionDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1045:2: (iv_ruleInsideActionDeclaration= ruleInsideActionDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1046:2: iv_ruleInsideActionDeclaration= ruleInsideActionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsideActionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleInsideActionDeclaration_in_entryRuleInsideActionDeclaration2320);
            iv_ruleInsideActionDeclaration=ruleInsideActionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInsideActionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsideActionDeclaration2330); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1053:1: ruleInsideActionDeclaration returns [EObject current=null] : ( () otherlv_1= 'OnInsideAction:' ( (lv_insideActionDeclaration_2_0= ruleActionVariableDeclaration ) ) (otherlv_3= ',' ( (lv_insideActionDeclaration_4_0= ruleActionVariableDeclaration ) ) ) otherlv_5= ';' ) ;
    public final EObject ruleInsideActionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_insideActionDeclaration_2_0 = null;

        EObject lv_insideActionDeclaration_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1056:28: ( ( () otherlv_1= 'OnInsideAction:' ( (lv_insideActionDeclaration_2_0= ruleActionVariableDeclaration ) ) (otherlv_3= ',' ( (lv_insideActionDeclaration_4_0= ruleActionVariableDeclaration ) ) ) otherlv_5= ';' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1057:1: ( () otherlv_1= 'OnInsideAction:' ( (lv_insideActionDeclaration_2_0= ruleActionVariableDeclaration ) ) (otherlv_3= ',' ( (lv_insideActionDeclaration_4_0= ruleActionVariableDeclaration ) ) ) otherlv_5= ';' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1057:1: ( () otherlv_1= 'OnInsideAction:' ( (lv_insideActionDeclaration_2_0= ruleActionVariableDeclaration ) ) (otherlv_3= ',' ( (lv_insideActionDeclaration_4_0= ruleActionVariableDeclaration ) ) ) otherlv_5= ';' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1057:2: () otherlv_1= 'OnInsideAction:' ( (lv_insideActionDeclaration_2_0= ruleActionVariableDeclaration ) ) (otherlv_3= ',' ( (lv_insideActionDeclaration_4_0= ruleActionVariableDeclaration ) ) ) otherlv_5= ';'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1057:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1058:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInsideActionDeclarationAccess().getInsideActionDeclarationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleInsideActionDeclaration2376); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInsideActionDeclarationAccess().getOnInsideActionKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1067:1: ( (lv_insideActionDeclaration_2_0= ruleActionVariableDeclaration ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1068:1: (lv_insideActionDeclaration_2_0= ruleActionVariableDeclaration )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1068:1: (lv_insideActionDeclaration_2_0= ruleActionVariableDeclaration )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1069:3: lv_insideActionDeclaration_2_0= ruleActionVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInsideActionDeclarationAccess().getInsideActionDeclarationActionVariableDeclarationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleActionVariableDeclaration_in_ruleInsideActionDeclaration2397);
            lv_insideActionDeclaration_2_0=ruleActionVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInsideActionDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"insideActionDeclaration",
                      		lv_insideActionDeclaration_2_0, 
                      		"ActionVariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1085:2: (otherlv_3= ',' ( (lv_insideActionDeclaration_4_0= ruleActionVariableDeclaration ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1085:4: otherlv_3= ',' ( (lv_insideActionDeclaration_4_0= ruleActionVariableDeclaration ) )
            {
            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleInsideActionDeclaration2410); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInsideActionDeclarationAccess().getCommaKeyword_3_0());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1089:1: ( (lv_insideActionDeclaration_4_0= ruleActionVariableDeclaration ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1090:1: (lv_insideActionDeclaration_4_0= ruleActionVariableDeclaration )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1090:1: (lv_insideActionDeclaration_4_0= ruleActionVariableDeclaration )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1091:3: lv_insideActionDeclaration_4_0= ruleActionVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInsideActionDeclarationAccess().getInsideActionDeclarationActionVariableDeclarationParserRuleCall_3_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleActionVariableDeclaration_in_ruleInsideActionDeclaration2431);
            lv_insideActionDeclaration_4_0=ruleActionVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInsideActionDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"insideActionDeclaration",
                      		lv_insideActionDeclaration_4_0, 
                      		"ActionVariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleInsideActionDeclaration2444); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getInsideActionDeclarationAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1119:1: entryRuleEntryActionDeclaration returns [EObject current=null] : iv_ruleEntryActionDeclaration= ruleEntryActionDeclaration EOF ;
    public final EObject entryRuleEntryActionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryActionDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1120:2: (iv_ruleEntryActionDeclaration= ruleEntryActionDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1121:2: iv_ruleEntryActionDeclaration= ruleEntryActionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryActionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleEntryActionDeclaration_in_entryRuleEntryActionDeclaration2480);
            iv_ruleEntryActionDeclaration=ruleEntryActionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryActionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryActionDeclaration2490); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1128:1: ruleEntryActionDeclaration returns [EObject current=null] : ( () otherlv_1= 'OnEntryAction:' ( (lv_entryActionDeclaration_2_0= ruleActionVariableDeclaration ) ) (otherlv_3= ',' ( (lv_entryActionDeclaration_4_0= ruleActionVariableDeclaration ) ) ) otherlv_5= ';' ) ;
    public final EObject ruleEntryActionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_entryActionDeclaration_2_0 = null;

        EObject lv_entryActionDeclaration_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1131:28: ( ( () otherlv_1= 'OnEntryAction:' ( (lv_entryActionDeclaration_2_0= ruleActionVariableDeclaration ) ) (otherlv_3= ',' ( (lv_entryActionDeclaration_4_0= ruleActionVariableDeclaration ) ) ) otherlv_5= ';' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1132:1: ( () otherlv_1= 'OnEntryAction:' ( (lv_entryActionDeclaration_2_0= ruleActionVariableDeclaration ) ) (otherlv_3= ',' ( (lv_entryActionDeclaration_4_0= ruleActionVariableDeclaration ) ) ) otherlv_5= ';' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1132:1: ( () otherlv_1= 'OnEntryAction:' ( (lv_entryActionDeclaration_2_0= ruleActionVariableDeclaration ) ) (otherlv_3= ',' ( (lv_entryActionDeclaration_4_0= ruleActionVariableDeclaration ) ) ) otherlv_5= ';' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1132:2: () otherlv_1= 'OnEntryAction:' ( (lv_entryActionDeclaration_2_0= ruleActionVariableDeclaration ) ) (otherlv_3= ',' ( (lv_entryActionDeclaration_4_0= ruleActionVariableDeclaration ) ) ) otherlv_5= ';'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1132:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1133:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryActionDeclarationAccess().getEntryActionDeclarationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleEntryActionDeclaration2536); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntryActionDeclarationAccess().getOnEntryActionKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1142:1: ( (lv_entryActionDeclaration_2_0= ruleActionVariableDeclaration ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1143:1: (lv_entryActionDeclaration_2_0= ruleActionVariableDeclaration )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1143:1: (lv_entryActionDeclaration_2_0= ruleActionVariableDeclaration )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1144:3: lv_entryActionDeclaration_2_0= ruleActionVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntryActionDeclarationAccess().getEntryActionDeclarationActionVariableDeclarationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleActionVariableDeclaration_in_ruleEntryActionDeclaration2557);
            lv_entryActionDeclaration_2_0=ruleActionVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEntryActionDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"entryActionDeclaration",
                      		lv_entryActionDeclaration_2_0, 
                      		"ActionVariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1160:2: (otherlv_3= ',' ( (lv_entryActionDeclaration_4_0= ruleActionVariableDeclaration ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1160:4: otherlv_3= ',' ( (lv_entryActionDeclaration_4_0= ruleActionVariableDeclaration ) )
            {
            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleEntryActionDeclaration2570); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEntryActionDeclarationAccess().getCommaKeyword_3_0());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1164:1: ( (lv_entryActionDeclaration_4_0= ruleActionVariableDeclaration ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1165:1: (lv_entryActionDeclaration_4_0= ruleActionVariableDeclaration )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1165:1: (lv_entryActionDeclaration_4_0= ruleActionVariableDeclaration )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1166:3: lv_entryActionDeclaration_4_0= ruleActionVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntryActionDeclarationAccess().getEntryActionDeclarationActionVariableDeclarationParserRuleCall_3_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleActionVariableDeclaration_in_ruleEntryActionDeclaration2591);
            lv_entryActionDeclaration_4_0=ruleActionVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEntryActionDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"entryActionDeclaration",
                      		lv_entryActionDeclaration_4_0, 
                      		"ActionVariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleEntryActionDeclaration2604); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEntryActionDeclarationAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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


    // $ANTLR start "entryRuleActionVariableDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1194:1: entryRuleActionVariableDeclaration returns [EObject current=null] : iv_ruleActionVariableDeclaration= ruleActionVariableDeclaration EOF ;
    public final EObject entryRuleActionVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionVariableDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1195:2: (iv_ruleActionVariableDeclaration= ruleActionVariableDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1196:2: iv_ruleActionVariableDeclaration= ruleActionVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleActionVariableDeclaration_in_entryRuleActionVariableDeclaration2640);
            iv_ruleActionVariableDeclaration=ruleActionVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActionVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionVariableDeclaration2650); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionVariableDeclaration"


    // $ANTLR start "ruleActionVariableDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1203:1: ruleActionVariableDeclaration returns [EObject current=null] : (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleActionVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1206:28: ( (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1207:1: (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1207:1: (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1207:3: otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleActionVariableDeclaration2687); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getActionVariableDeclarationAccess().getSolidusKeyword_0());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1211:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1212:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1212:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1213:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionVariableDeclaration2704); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getActionVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getActionVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
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
    // $ANTLR end "ruleActionVariableDeclaration"


    // $ANTLR start "entryRuleSuspendDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1237:1: entryRuleSuspendDeclaration returns [EObject current=null] : iv_ruleSuspendDeclaration= ruleSuspendDeclaration EOF ;
    public final EObject entryRuleSuspendDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspendDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1238:2: (iv_ruleSuspendDeclaration= ruleSuspendDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1239:2: iv_ruleSuspendDeclaration= ruleSuspendDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuspendDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSuspendDeclaration_in_entryRuleSuspendDeclaration2745);
            iv_ruleSuspendDeclaration=ruleSuspendDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuspendDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuspendDeclaration2755); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1246:1: ruleSuspendDeclaration returns [EObject current=null] : ( () otherlv_1= 'Suspend:' ( (lv_suspendDeclaration_2_0= ruleSuspendVariableDeclaration ) ) (otherlv_3= ',' ( (lv_suspendDeclaration_4_0= ruleSuspendVariableDeclaration ) ) ) otherlv_5= ';' ) ;
    public final EObject ruleSuspendDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_suspendDeclaration_2_0 = null;

        EObject lv_suspendDeclaration_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1249:28: ( ( () otherlv_1= 'Suspend:' ( (lv_suspendDeclaration_2_0= ruleSuspendVariableDeclaration ) ) (otherlv_3= ',' ( (lv_suspendDeclaration_4_0= ruleSuspendVariableDeclaration ) ) ) otherlv_5= ';' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1250:1: ( () otherlv_1= 'Suspend:' ( (lv_suspendDeclaration_2_0= ruleSuspendVariableDeclaration ) ) (otherlv_3= ',' ( (lv_suspendDeclaration_4_0= ruleSuspendVariableDeclaration ) ) ) otherlv_5= ';' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1250:1: ( () otherlv_1= 'Suspend:' ( (lv_suspendDeclaration_2_0= ruleSuspendVariableDeclaration ) ) (otherlv_3= ',' ( (lv_suspendDeclaration_4_0= ruleSuspendVariableDeclaration ) ) ) otherlv_5= ';' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1250:2: () otherlv_1= 'Suspend:' ( (lv_suspendDeclaration_2_0= ruleSuspendVariableDeclaration ) ) (otherlv_3= ',' ( (lv_suspendDeclaration_4_0= ruleSuspendVariableDeclaration ) ) ) otherlv_5= ';'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1250:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1251:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSuspendDeclarationAccess().getSuspendDeclarationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleSuspendDeclaration2801); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSuspendDeclarationAccess().getSuspendKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1260:1: ( (lv_suspendDeclaration_2_0= ruleSuspendVariableDeclaration ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1261:1: (lv_suspendDeclaration_2_0= ruleSuspendVariableDeclaration )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1261:1: (lv_suspendDeclaration_2_0= ruleSuspendVariableDeclaration )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1262:3: lv_suspendDeclaration_2_0= ruleSuspendVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSuspendDeclarationAccess().getSuspendDeclarationSuspendVariableDeclarationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSuspendVariableDeclaration_in_ruleSuspendDeclaration2822);
            lv_suspendDeclaration_2_0=ruleSuspendVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSuspendDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"suspendDeclaration",
                      		lv_suspendDeclaration_2_0, 
                      		"SuspendVariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1278:2: (otherlv_3= ',' ( (lv_suspendDeclaration_4_0= ruleSuspendVariableDeclaration ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1278:4: otherlv_3= ',' ( (lv_suspendDeclaration_4_0= ruleSuspendVariableDeclaration ) )
            {
            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSuspendDeclaration2835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSuspendDeclarationAccess().getCommaKeyword_3_0());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1282:1: ( (lv_suspendDeclaration_4_0= ruleSuspendVariableDeclaration ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1283:1: (lv_suspendDeclaration_4_0= ruleSuspendVariableDeclaration )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1283:1: (lv_suspendDeclaration_4_0= ruleSuspendVariableDeclaration )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1284:3: lv_suspendDeclaration_4_0= ruleSuspendVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSuspendDeclarationAccess().getSuspendDeclarationSuspendVariableDeclarationParserRuleCall_3_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSuspendVariableDeclaration_in_ruleSuspendDeclaration2856);
            lv_suspendDeclaration_4_0=ruleSuspendVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSuspendDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"suspendDeclaration",
                      		lv_suspendDeclaration_4_0, 
                      		"SuspendVariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleSuspendDeclaration2869); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSuspendDeclarationAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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


    // $ANTLR start "entryRuleSuspendVariableDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1312:1: entryRuleSuspendVariableDeclaration returns [EObject current=null] : iv_ruleSuspendVariableDeclaration= ruleSuspendVariableDeclaration EOF ;
    public final EObject entryRuleSuspendVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspendVariableDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1313:2: (iv_ruleSuspendVariableDeclaration= ruleSuspendVariableDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1314:2: iv_ruleSuspendVariableDeclaration= ruleSuspendVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuspendVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSuspendVariableDeclaration_in_entryRuleSuspendVariableDeclaration2905);
            iv_ruleSuspendVariableDeclaration=ruleSuspendVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuspendVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuspendVariableDeclaration2915); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuspendVariableDeclaration"


    // $ANTLR start "ruleSuspendVariableDeclaration"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1321:1: ruleSuspendVariableDeclaration returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSuspendVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1324:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1325:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1325:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1326:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1326:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1327:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSuspendVariableDeclaration2956); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getSuspendVariableDeclarationAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSuspendVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
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
    // $ANTLR end "ruleSuspendVariableDeclaration"


    // $ANTLR start "entryRuleTransitionReaction"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1351:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1352:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1353:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction2996);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionReaction3006); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1360:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleMyTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1363:28: ( ( () ( (lv_trigger_1_0= ruleMyTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1364:1: ( () ( (lv_trigger_1_0= ruleMyTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1364:1: ( () ( (lv_trigger_1_0= ruleMyTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1364:2: () ( (lv_trigger_1_0= ruleMyTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1364:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1365:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionReactionAccess().getTransitionReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1370:2: ( (lv_trigger_1_0= ruleMyTrigger ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1371:1: (lv_trigger_1_0= ruleMyTrigger )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1371:1: (lv_trigger_1_0= ruleMyTrigger )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1372:3: lv_trigger_1_0= ruleMyTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerMyTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMyTrigger_in_ruleTransitionReaction3061);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1388:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1388:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleTransitionReaction3075); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1392:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1393:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1393:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1394:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransitionReaction3096);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1410:4: (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1410:6: otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleTransitionReaction3111); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionReactionAccess().getNumberSignKeyword_3_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1414:1: ( (lv_properties_5_0= ruleReactionProperties ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1415:1: (lv_properties_5_0= ruleReactionProperties )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1415:1: (lv_properties_5_0= ruleReactionProperties )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1416:3: lv_properties_5_0= ruleReactionProperties
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getPropertiesReactionPropertiesParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionProperties_in_ruleTransitionReaction3132);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1440:1: entryRuleMyTrigger returns [EObject current=null] : iv_ruleMyTrigger= ruleMyTrigger EOF ;
    public final EObject entryRuleMyTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyTrigger = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1441:2: (iv_ruleMyTrigger= ruleMyTrigger EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1442:2: iv_ruleMyTrigger= ruleMyTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMyTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleMyTrigger_in_entryRuleMyTrigger3170);
            iv_ruleMyTrigger=ruleMyTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMyTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMyTrigger3180); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1449:1: ruleMyTrigger returns [EObject current=null] : ( () otherlv_1= 'some trigger expression' ) ;
    public final EObject ruleMyTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1452:28: ( ( () otherlv_1= 'some trigger expression' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1453:1: ( () otherlv_1= 'some trigger expression' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1453:1: ( () otherlv_1= 'some trigger expression' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1453:2: () otherlv_1= 'some trigger expression'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1453:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1454:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMyTriggerAccess().getMyTriggerAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleMyTrigger3226); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1475:1: entryRuleStatechartSpecification returns [EObject current=null] : iv_ruleStatechartSpecification= ruleStatechartSpecification EOF ;
    public final EObject entryRuleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartSpecification = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1476:2: (iv_ruleStatechartSpecification= ruleStatechartSpecification EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1477:2: iv_ruleStatechartSpecification= ruleStatechartSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification3266);
            iv_ruleStatechartSpecification=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartSpecification3276); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1484:1: ruleStatechartSpecification returns [EObject current=null] : ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) ;
    public final EObject ruleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_2_0 = null;

        EObject lv_scopes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1487:28: ( ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1488:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1488:1: ( () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1488:2: () (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )? ( (lv_scopes_3_0= ruleStatechartScope ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1488:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1489:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatechartSpecificationAccess().getStatechartSpecificationAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1494:2: (otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1494:4: otherlv_1= 'namespace' ( (lv_namespace_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleStatechartSpecification3323); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatechartSpecificationAccess().getNamespaceKeyword_1_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1498:1: ( (lv_namespace_2_0= ruleFQN ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1499:1: (lv_namespace_2_0= ruleFQN )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1499:1: (lv_namespace_2_0= ruleFQN )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1500:3: lv_namespace_2_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getNamespaceFQNParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleStatechartSpecification3344);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1516:4: ( (lv_scopes_3_0= ruleStatechartScope ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16||(LA20_0>=26 && LA20_0<=28)||LA20_0==30||LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1517:1: (lv_scopes_3_0= ruleStatechartScope )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1517:1: (lv_scopes_3_0= ruleStatechartScope )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1518:3: lv_scopes_3_0= ruleStatechartScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatechartSpecificationAccess().getScopesStatechartScopeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification3367);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1542:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1543:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1544:2: iv_ruleStateSpecification= ruleStateSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3404);
            iv_ruleStateSpecification=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateSpecification3414); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1551:1: ruleStateSpecification returns [EObject current=null] : ( (lv_scope_0_0= ruleStateScope ) ) ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_scope_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1554:28: ( ( (lv_scope_0_0= ruleStateScope ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1555:1: ( (lv_scope_0_0= ruleStateScope ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1555:1: ( (lv_scope_0_0= ruleStateScope ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1556:1: (lv_scope_0_0= ruleStateScope )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1556:1: (lv_scope_0_0= ruleStateScope )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1557:3: lv_scope_0_0= ruleStateScope
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateSpecificationAccess().getScopeStateScopeParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateScope_in_ruleStateSpecification3459);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1581:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1582:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1583:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3494);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification3504); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1590:1: ruleTransitionSpecification returns [EObject current=null] : ( (lv_reaction_0_0= ruleTransitionReaction ) ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_reaction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1593:28: ( ( (lv_reaction_0_0= ruleTransitionReaction ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1594:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1594:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1595:1: (lv_reaction_0_0= ruleTransitionReaction )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1595:1: (lv_reaction_0_0= ruleTransitionReaction )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1596:3: lv_reaction_0_0= ruleTransitionReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getReactionTransitionReactionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification3549);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1622:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1623:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1624:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope3586);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartScope3596); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1631:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1634:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1635:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1635:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==16||(LA21_0>=26 && LA21_0<=28)||LA21_0==30) ) {
                alt21=1;
            }
            else if ( (LA21_0==34) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1636:5: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStatechartScope3643);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1646:5: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalScope_in_ruleStatechartScope3670);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1664:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1665:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1666:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInternalScope_in_entryRuleInternalScope3707);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalScope3717); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1673:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1676:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1677:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1677:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1677:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1677:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1678:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInternalScopeAccess().getInternalScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleInternalScope3763); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleInternalScope3775); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1691:1: ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==19||(LA23_0>=23 && LA23_0<=24)||(LA23_0>=35 && LA23_0<=36)||LA23_0==39||LA23_0==45||(LA23_0>=48 && LA23_0<=53)||(LA23_0>=72 && LA23_0<=73)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1692:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1692:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1693:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1693:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    int alt22=4;
            	    switch ( input.LA(1) ) {
            	    case 19:
            	    case 23:
            	    case 24:
            	    case 35:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    case RULE_ID:
            	    case 45:
            	    case 48:
            	    case 49:
            	    case 50:
            	    case 51:
            	    case 52:
            	    case 53:
            	    case 72:
            	    case 73:
            	        {
            	        alt22=4;
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1694:3: lv_declarations_3_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3798);
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1709:8: lv_declarations_3_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3817);
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1724:8: lv_declarations_3_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3836);
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1739:8: lv_declarations_3_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsLocalReactionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleInternalScope3855);
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
    // $ANTLR end "ruleInternalScope"


    // $ANTLR start "entryRuleEventDeclarartion"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1767:1: entryRuleEventDeclarartion returns [EObject current=null] : iv_ruleEventDeclarartion= ruleEventDeclarartion EOF ;
    public final EObject entryRuleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclarartion = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1768:2: (iv_ruleEventDeclarartion= ruleEventDeclarartion EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1769:2: iv_ruleEventDeclarartion= ruleEventDeclarartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarartionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3897);
            iv_ruleEventDeclarartion=ruleEventDeclarartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclarartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclarartion3907); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1776:1: ruleEventDeclarartion returns [EObject current=null] : this_EventDefinition_0= ruleEventDefinition ;
    public final EObject ruleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject this_EventDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1779:28: (this_EventDefinition_0= ruleEventDefinition )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1781:5: this_EventDefinition_0= ruleEventDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEventDeclarartionAccess().getEventDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3953);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1799:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1800:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1801:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3989);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDefinition3999); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1808:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1811:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1812:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1812:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1812:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1812:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19||(LA24_0>=23 && LA24_0<=24)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1813:1: (lv_direction_0_0= ruleDirection )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1813:1: (lv_direction_0_0= ruleDirection )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1814:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_ruleEventDefinition4045);
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

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleEventDefinition4058); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1834:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1835:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1835:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1836:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventDefinition4075); if (state.failed) return current;
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1852:2: (otherlv_3= ':' ( ( ruleFQN ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1852:4: otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleEventDefinition4093); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1856:1: ( ( ruleFQN ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1857:1: ( ruleFQN )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1857:1: ( ruleFQN )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1858:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getTypeTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEventDefinition4116);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1879:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1880:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1881:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4154);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration4164); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1888:1: ruleVariableDeclaration returns [EObject current=null] : this_VariableDefinition_0= ruleVariableDefinition ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1891:28: (this_VariableDefinition_0= ruleVariableDefinition )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1893:5: this_VariableDefinition_0= ruleVariableDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration4210);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1911:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1912:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1913:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition4246);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition4256); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1920:1: ruleVariableDefinition returns [EObject current=null] : ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1923:28: ( ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1924:1: ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1924:1: ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1924:2: () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1924:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1925:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleVariableDefinition4302); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableDefinitionAccess().getVarKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1934:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1936:1: ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1936:1: ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1937:2: ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1940:2: ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1941:3: ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1941:3: ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( LA26_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {
                    alt26=1;
                }
                else if ( LA26_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1943:4: ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1943:4: ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1944:5: {...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1944:115: ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1945:6: ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0);
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1948:6: ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1948:7: {...}? => ( (lv_readonly_3_0= 'readonly' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "true");
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1948:16: ( (lv_readonly_3_0= 'readonly' ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1949:1: (lv_readonly_3_0= 'readonly' )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1949:1: (lv_readonly_3_0= 'readonly' )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1950:3: lv_readonly_3_0= 'readonly'
            	    {
            	    lv_readonly_3_0=(Token)match(input,37,FOLLOW_37_in_ruleVariableDefinition4365); if (state.failed) return current;
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
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1970:4: ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1970:4: ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1971:5: {...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1971:115: ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1972:6: ({...}? => ( (lv_external_4_0= 'external' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1);
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1975:6: ({...}? => ( (lv_external_4_0= 'external' ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1975:7: {...}? => ( (lv_external_4_0= 'external' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "true");
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1975:16: ( (lv_external_4_0= 'external' ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1976:1: (lv_external_4_0= 'external' )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1976:1: (lv_external_4_0= 'external' )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:1977:3: lv_external_4_0= 'external'
            	    {
            	    lv_external_4_0=(Token)match(input,38,FOLLOW_38_in_ruleVariableDefinition4450); if (state.failed) return current;
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
            	    break loop26;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2004:2: ( (lv_name_5_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2005:1: (lv_name_5_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2005:1: (lv_name_5_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2006:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDefinition4520); if (state.failed) return current;
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

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleVariableDefinition4537); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionAccess().getColonKeyword_4());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2026:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2027:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2027:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2028:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getTypeTypeCrossReference_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleVariableDefinition4560);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2041:2: (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==21) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2041:4: otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) )
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleVariableDefinition4573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getVariableDefinitionAccess().getEqualsSignKeyword_6_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2045:1: ( (lv_initialValue_9_0= ruleExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2046:1: (lv_initialValue_9_0= ruleExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2046:1: (lv_initialValue_9_0= ruleExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2047:3: lv_initialValue_9_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getInitialValueExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDefinition4594);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2071:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2072:2: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2073:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4632);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDeclaration4642); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2080:1: ruleOperationDeclaration returns [EObject current=null] : this_OperationDefinition_0= ruleOperationDefinition ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2083:28: (this_OperationDefinition_0= ruleOperationDefinition )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2085:5: this_OperationDefinition_0= ruleOperationDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOperationDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4688);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2103:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2104:2: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2105:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition4724);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDefinition4734); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2112:1: ruleOperationDefinition returns [EObject current=null] : ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2115:28: ( ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2116:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2116:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2116:2: () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2116:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2117:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationDefinitionAccess().getOperationDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleOperationDefinition4780); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionAccess().getOperationKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2126:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2127:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2127:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2128:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperationDefinition4797); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleOperationDefinition4814); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2148:1: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2148:2: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2148:2: ( (lv_parameters_4_0= ruleParameter ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2149:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2149:1: (lv_parameters_4_0= ruleParameter )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2150:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition4836);
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

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2166:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==17) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2166:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleOperationDefinition4849); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getOperationDefinitionAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2170:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2171:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2171:1: (lv_parameters_6_0= ruleParameter )
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2172:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition4870);
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
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,41,FOLLOW_41_in_ruleOperationDefinition4886); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2192:1: (otherlv_8= ':' ( ( ruleFQN ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2192:3: otherlv_8= ':' ( ( ruleFQN ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleOperationDefinition4899); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getOperationDefinitionAccess().getColonKeyword_6_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2196:1: ( ( ruleFQN ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2197:1: ( ruleFQN )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2197:1: ( ruleFQN )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2198:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getTypeTypeCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition4922);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2219:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2220:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2221:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter4960);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter4970); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2228:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2231:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2232:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2232:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2232:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2232:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2233:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2233:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2234:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter5012); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleParameter5029); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2254:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2255:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2255:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2256:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleParameter5052);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2277:1: entryRuleEntrypoint returns [EObject current=null] : iv_ruleEntrypoint= ruleEntrypoint EOF ;
    public final EObject entryRuleEntrypoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntrypoint = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2278:2: (iv_ruleEntrypoint= ruleEntrypoint EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2279:2: iv_ruleEntrypoint= ruleEntrypoint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntrypointRule()); 
            }
            pushFollow(FOLLOW_ruleEntrypoint_in_entryRuleEntrypoint5088);
            iv_ruleEntrypoint=ruleEntrypoint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntrypoint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntrypoint5098); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2286:1: ruleEntrypoint returns [EObject current=null] : ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleEntrypoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2289:28: ( ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2290:1: ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2290:1: ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2290:2: () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2290:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2291:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntrypointAccess().getEntrypointAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleEntrypoint5144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntrypointAccess().getEntrypointKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2300:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2301:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2301:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2302:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntrypoint5161); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2326:1: entryRuleExitpoint returns [EObject current=null] : iv_ruleExitpoint= ruleExitpoint EOF ;
    public final EObject entryRuleExitpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitpoint = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2327:2: (iv_ruleExitpoint= ruleExitpoint EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2328:2: iv_ruleExitpoint= ruleExitpoint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitpointRule()); 
            }
            pushFollow(FOLLOW_ruleExitpoint_in_entryRuleExitpoint5202);
            iv_ruleExitpoint=ruleExitpoint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitpoint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitpoint5212); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2335:1: ruleExitpoint returns [EObject current=null] : ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleExitpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2338:28: ( ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2339:1: ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2339:1: ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2339:2: () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2339:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2340:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitpointAccess().getExitpointAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleExitpoint5258); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitpointAccess().getExitpointKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2349:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2350:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2350:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2351:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExitpoint5275); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2375:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2376:2: (iv_ruleFQN= ruleFQN EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2377:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN5317);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN5328); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2384:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2387:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2388:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2388:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2388:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN5368); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2395:1: (kw= '.' this_ID_2= RULE_ID )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==44) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2396:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,44,FOLLOW_44_in_ruleFQN5387); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN5402); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleLocalReaction"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2418:1: entryRuleLocalReaction returns [EObject current=null] : iv_ruleLocalReaction= ruleLocalReaction EOF ;
    public final EObject entryRuleLocalReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReaction = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2419:2: (iv_ruleLocalReaction= ruleLocalReaction EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2420:2: iv_ruleLocalReaction= ruleLocalReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction5451);
            iv_ruleLocalReaction=ruleLocalReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReaction5461); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2427:1: ruleLocalReaction returns [EObject current=null] : ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) ;
    public final EObject ruleLocalReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_trigger_0_0 = null;

        EObject lv_effect_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2430:28: ( ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2431:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2431:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2431:2: ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2431:2: ( (lv_trigger_0_0= ruleReactionTrigger ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2432:1: (lv_trigger_0_0= ruleReactionTrigger )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2432:1: (lv_trigger_0_0= ruleReactionTrigger )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2433:3: lv_trigger_0_0= ruleReactionTrigger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerReactionTriggerParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReaction5507);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2449:2: ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2449:3: ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2454:6: (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2454:8: otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) )
            {
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleLocalReaction5539); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalReactionAccess().getSolidusKeyword_1_0_0());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2458:1: ( (lv_effect_2_0= ruleReactionEffect ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2459:1: (lv_effect_2_0= ruleReactionEffect )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2459:1: (lv_effect_2_0= ruleReactionEffect )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2460:3: lv_effect_2_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectReactionEffectParserRuleCall_1_0_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalReaction5560);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2484:1: entryRuleReactionTrigger returns [EObject current=null] : iv_ruleReactionTrigger= ruleReactionTrigger EOF ;
    public final EObject entryRuleReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionTrigger = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2485:2: (iv_ruleReactionTrigger= ruleReactionTrigger EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2486:2: iv_ruleReactionTrigger= ruleReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger5598);
            iv_ruleReactionTrigger=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionTrigger5608); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2493:1: ruleReactionTrigger returns [EObject current=null] : ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2496:28: ( ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2497:1: ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2497:1: ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2497:2: () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2497:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2498:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2503:2: ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID||(LA34_0>=48 && LA34_0<=53)||(LA34_0>=72 && LA34_0<=73)) ) {
                alt34=1;
            }
            else if ( (LA34_0==45) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2503:3: ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2503:3: ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2503:4: ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )?
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2503:4: ( (lv_triggers_1_0= ruleEventSpec ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2504:1: (lv_triggers_1_0= ruleEventSpec )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2504:1: (lv_triggers_1_0= ruleEventSpec )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2505:3: lv_triggers_1_0= ruleEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventSpec_in_ruleReactionTrigger5665);
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

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2521:2: (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==17) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2521:4: otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) )
                    	    {
                    	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleReactionTrigger5678); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getReactionTriggerAccess().getCommaKeyword_1_0_1_0());
                    	          
                    	    }
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2525:1: ( (lv_triggers_3_0= ruleEventSpec ) )
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2526:1: (lv_triggers_3_0= ruleEventSpec )
                    	    {
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2526:1: (lv_triggers_3_0= ruleEventSpec )
                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2527:3: lv_triggers_3_0= ruleEventSpec
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_1_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEventSpec_in_ruleReactionTrigger5699);
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
                    	    break loop32;
                        }
                    } while (true);

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2543:4: ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==45) && (synpred2_InternalSCCExp())) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2543:5: ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']'
                            {
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2543:5: ( ( '[' )=>otherlv_4= '[' )
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2543:6: ( '[' )=>otherlv_4= '['
                            {
                            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleReactionTrigger5722); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_1_0_2_0());
                                  
                            }

                            }

                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2548:2: ( (lv_guardExpression_5_0= ruleExpression ) )
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2549:1: (lv_guardExpression_5_0= ruleExpression )
                            {
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2549:1: (lv_guardExpression_5_0= ruleExpression )
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2550:3: lv_guardExpression_5_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_1_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger5744);
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

                            otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleReactionTrigger5756); if (state.failed) return current;
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2571:6: (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2571:6: (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2571:8: otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']'
                    {
                    otherlv_7=(Token)match(input,45,FOLLOW_45_in_ruleReactionTrigger5778); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_1_1_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2575:1: ( (lv_guardExpression_8_0= ruleExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2576:1: (lv_guardExpression_8_0= ruleExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2576:1: (lv_guardExpression_8_0= ruleExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2577:3: lv_guardExpression_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger5799);
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

                    otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleReactionTrigger5811); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2605:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2606:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2607:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect5849);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionEffect5859); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2614:1: ruleReactionEffect returns [EObject current=null] : ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_3_1 = null;

        EObject lv_actions_3_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2617:28: ( ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2618:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2618:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2618:2: () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2618:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2619:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2624:2: ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2625:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2625:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2626:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2626:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_STRING)||LA35_0==40||LA35_0==58||(LA35_0>=62 && LA35_0<=63)||(LA35_0>=86 && LA35_0<=87)||LA35_0==90) ) {
                alt35=1;
            }
            else if ( (LA35_0==54) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2627:3: lv_actions_1_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect5916);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2642:8: lv_actions_1_2= ruleEventRaisingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect5935);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2660:2: ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==18) && (synpred3_InternalSCCExp())) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2660:3: ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2660:3: ( ( ';' )=>otherlv_2= ';' )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2660:4: ( ';' )=>otherlv_2= ';'
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleReactionEffect5959); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReactionEffectAccess().getSemicolonKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2665:2: ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2666:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2666:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2667:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2667:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_STRING)||LA36_0==40||LA36_0==58||(LA36_0>=62 && LA36_0<=63)||(LA36_0>=86 && LA36_0<=87)||LA36_0==90) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==54) ) {
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2668:3: lv_actions_3_1= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect5983);
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
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2683:8: lv_actions_3_2= ruleEventRaisingExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_2_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect6002);
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
    // $ANTLR end "ruleReactionEffect"


    // $ANTLR start "entryRuleReactionProperties"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2709:1: entryRuleReactionProperties returns [EObject current=null] : iv_ruleReactionProperties= ruleReactionProperties EOF ;
    public final EObject entryRuleReactionProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionProperties = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2710:2: (iv_ruleReactionProperties= ruleReactionProperties EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2711:2: iv_ruleReactionProperties= ruleReactionProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionPropertiesRule()); 
            }
            pushFollow(FOLLOW_ruleReactionProperties_in_entryRuleReactionProperties6043);
            iv_ruleReactionProperties=ruleReactionProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionProperties; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionProperties6053); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2718:1: ruleReactionProperties returns [EObject current=null] : ( () ( (lv_properties_1_0= ruleReactionProperty ) )* ) ;
    public final EObject ruleReactionProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2721:28: ( ( () ( (lv_properties_1_0= ruleReactionProperty ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2722:1: ( () ( (lv_properties_1_0= ruleReactionProperty ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2722:1: ( () ( (lv_properties_1_0= ruleReactionProperty ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2722:2: () ( (lv_properties_1_0= ruleReactionProperty ) )*
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2722:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2723:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionPropertiesAccess().getReactionPropertiesAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2728:2: ( (lv_properties_1_0= ruleReactionProperty ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID||LA38_0==47) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2729:1: (lv_properties_1_0= ruleReactionProperty )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2729:1: (lv_properties_1_0= ruleReactionProperty )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2730:3: lv_properties_1_0= ruleReactionProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReactionPropertiesAccess().getPropertiesReactionPropertyParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleReactionProperty_in_ruleReactionProperties6108);
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
    // $ANTLR end "ruleReactionProperties"


    // $ANTLR start "entryRuleReactionProperty"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2754:1: entryRuleReactionProperty returns [EObject current=null] : iv_ruleReactionProperty= ruleReactionProperty EOF ;
    public final EObject entryRuleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionProperty = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2755:2: (iv_ruleReactionProperty= ruleReactionProperty EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2756:2: iv_ruleReactionProperty= ruleReactionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReactionProperty_in_entryRuleReactionProperty6145);
            iv_ruleReactionProperty=ruleReactionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionProperty6155); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2763:1: ruleReactionProperty returns [EObject current=null] : (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) ;
    public final EObject ruleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_EntryPointSpec_0 = null;

        EObject this_ExitPointSpec_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2766:28: ( (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2767:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2767:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==47) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_ID) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2768:5: this_EntryPointSpec_0= ruleEntryPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReactionPropertyAccess().getEntryPointSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryPointSpec_in_ruleReactionProperty6202);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2778:5: this_ExitPointSpec_1= ruleExitPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReactionPropertyAccess().getExitPointSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitPointSpec_in_ruleReactionProperty6229);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2794:1: entryRuleEntryPointSpec returns [EObject current=null] : iv_ruleEntryPointSpec= ruleEntryPointSpec EOF ;
    public final EObject entryRuleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryPointSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2795:2: (iv_ruleEntryPointSpec= ruleEntryPointSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2796:2: iv_ruleEntryPointSpec= ruleEntryPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec6264);
            iv_ruleEntryPointSpec=ruleEntryPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryPointSpec6274); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2803:1: ruleEntryPointSpec returns [EObject current=null] : (otherlv_0= '>' ( ( ruleFQN ) ) ) ;
    public final EObject ruleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2806:28: ( (otherlv_0= '>' ( ( ruleFQN ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2807:1: (otherlv_0= '>' ( ( ruleFQN ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2807:1: (otherlv_0= '>' ( ( ruleFQN ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2807:3: otherlv_0= '>' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleEntryPointSpec6311); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntryPointSpecAccess().getGreaterThanSignKeyword_0());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2811:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2812:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2812:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2813:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEntryPointSpecRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntryPointSpecAccess().getEntrypointEntrypointCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleEntryPointSpec6334);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2834:1: entryRuleExitPointSpec returns [EObject current=null] : iv_ruleExitPointSpec= ruleExitPointSpec EOF ;
    public final EObject entryRuleExitPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitPointSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2835:2: (iv_ruleExitPointSpec= ruleExitPointSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2836:2: iv_ruleExitPointSpec= ruleExitPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec6370);
            iv_ruleExitPointSpec=ruleExitPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitPointSpec6380); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2843:1: ruleExitPointSpec returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= '>' ) ;
    public final EObject ruleExitPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2846:28: ( ( ( ( ruleFQN ) ) otherlv_1= '>' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2847:1: ( ( ( ruleFQN ) ) otherlv_1= '>' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2847:1: ( ( ( ruleFQN ) ) otherlv_1= '>' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2847:2: ( ( ruleFQN ) ) otherlv_1= '>'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2847:2: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2848:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2848:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2849:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExitPointSpecRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExitPointSpecAccess().getExitpointExitpointCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleExitPointSpec6428);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleExitPointSpec6440); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2874:1: entryRuleEventSpec returns [EObject current=null] : iv_ruleEventSpec= ruleEventSpec EOF ;
    public final EObject entryRuleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2875:2: (iv_ruleEventSpec= ruleEventSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2876:2: iv_ruleEventSpec= ruleEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEventSpec_in_entryRuleEventSpec6476);
            iv_ruleEventSpec=ruleEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventSpec6486); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2883:1: ruleEventSpec returns [EObject current=null] : (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) ;
    public final EObject ruleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_RegularEventSpec_0 = null;

        EObject this_TimeEventSpec_1 = null;

        EObject this_BuiltinEventSpec_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2886:28: ( (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2887:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2887:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
            int alt40=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt40=1;
                }
                break;
            case 72:
            case 73:
                {
                alt40=2;
                }
                break;
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                {
                alt40=3;
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2888:5: this_RegularEventSpec_0= ruleRegularEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getRegularEventSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRegularEventSpec_in_ruleEventSpec6533);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2898:5: this_TimeEventSpec_1= ruleTimeEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getTimeEventSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTimeEventSpec_in_ruleEventSpec6560);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2908:5: this_BuiltinEventSpec_2= ruleBuiltinEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getBuiltinEventSpecParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBuiltinEventSpec_in_ruleEventSpec6587);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2924:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2925:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2926:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec6622);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularEventSpec6632); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2933:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2936:28: ( ( (lv_event_0_0= ruleFeatureCall ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2937:1: ( (lv_event_0_0= ruleFeatureCall ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2937:1: ( (lv_event_0_0= ruleFeatureCall ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2938:1: (lv_event_0_0= ruleFeatureCall )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2938:1: (lv_event_0_0= ruleFeatureCall )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2939:3: lv_event_0_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec6677);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2963:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2964:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2965:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec6712);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeEventSpec6722); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2972:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_type_0_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2975:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2976:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2976:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2976:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2976:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2977:1: (lv_type_0_0= ruleTimeEventType )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2977:1: (lv_type_0_0= ruleTimeEventType )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2978:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec6768);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2994:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2995:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2995:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2996:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeEventSpec6785); if (state.failed) return current;
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3012:2: ( (lv_unit_2_0= ruleTimeUnit ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=96 && LA41_0<=99)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3013:1: (lv_unit_2_0= ruleTimeUnit )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3013:1: (lv_unit_2_0= ruleTimeUnit )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3014:3: lv_unit_2_0= ruleTimeUnit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec6811);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3038:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3039:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3040:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec6848);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinEventSpec6858); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3047:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_OnCycleEvent_2 = null;

        EObject this_AlwaysEvent_3 = null;

        EObject this_DefaultEvent_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3050:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3051:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3051:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent )
            int alt42=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt42=1;
                }
                break;
            case 49:
                {
                alt42=2;
                }
                break;
            case 50:
                {
                alt42=3;
                }
                break;
            case 51:
                {
                alt42=4;
                }
                break;
            case 52:
            case 53:
                {
                alt42=5;
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3052:5: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec6905);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3062:5: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec6932);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3072:5: this_OnCycleEvent_2= ruleOnCycleEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getOnCycleEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOnCycleEvent_in_ruleBuiltinEventSpec6959);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3082:5: this_AlwaysEvent_3= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec6986);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3092:5: this_DefaultEvent_4= ruleDefaultEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getDefaultEventParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultEvent_in_ruleBuiltinEventSpec7013);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3108:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3109:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3110:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent7048);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryEvent7058); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3117:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3120:28: ( ( () otherlv_1= 'entry' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3121:1: ( () otherlv_1= 'entry' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3121:1: ( () otherlv_1= 'entry' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3121:2: () otherlv_1= 'entry'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3121:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3122:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryEventAccess().getEntryEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleEntryEvent7104); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3139:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3140:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3141:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent7140);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent7150); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3148:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3151:28: ( ( () otherlv_1= 'exit' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3152:1: ( () otherlv_1= 'exit' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3152:1: ( () otherlv_1= 'exit' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3152:2: () otherlv_1= 'exit'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3152:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3153:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitEventAccess().getExitEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleExitEvent7196); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3170:1: entryRuleOnCycleEvent returns [EObject current=null] : iv_ruleOnCycleEvent= ruleOnCycleEvent EOF ;
    public final EObject entryRuleOnCycleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnCycleEvent = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3171:2: (iv_ruleOnCycleEvent= ruleOnCycleEvent EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3172:2: iv_ruleOnCycleEvent= ruleOnCycleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOnCycleEventRule()); 
            }
            pushFollow(FOLLOW_ruleOnCycleEvent_in_entryRuleOnCycleEvent7232);
            iv_ruleOnCycleEvent=ruleOnCycleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOnCycleEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnCycleEvent7242); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3179:1: ruleOnCycleEvent returns [EObject current=null] : ( () otherlv_1= 'oncycle' ) ;
    public final EObject ruleOnCycleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3182:28: ( ( () otherlv_1= 'oncycle' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3183:1: ( () otherlv_1= 'oncycle' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3183:1: ( () otherlv_1= 'oncycle' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3183:2: () otherlv_1= 'oncycle'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3183:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3184:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOnCycleEventAccess().getOnCycleEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleOnCycleEvent7288); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3201:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3202:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3203:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent7324);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEvent7334); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3210:1: ruleAlwaysEvent returns [EObject current=null] : ( () otherlv_1= 'always' ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3213:28: ( ( () otherlv_1= 'always' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3214:1: ( () otherlv_1= 'always' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3214:1: ( () otherlv_1= 'always' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3214:2: () otherlv_1= 'always'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3214:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3215:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlwaysEventAccess().getAlwaysEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleAlwaysEvent7380); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3232:1: entryRuleDefaultEvent returns [EObject current=null] : iv_ruleDefaultEvent= ruleDefaultEvent EOF ;
    public final EObject entryRuleDefaultEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultEvent = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3233:2: (iv_ruleDefaultEvent= ruleDefaultEvent EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3234:2: iv_ruleDefaultEvent= ruleDefaultEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultEventRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultEvent_in_entryRuleDefaultEvent7416);
            iv_ruleDefaultEvent=ruleDefaultEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultEvent7426); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3241:1: ruleDefaultEvent returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3244:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3245:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3245:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3245:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3245:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3246:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultEventAccess().getDefaultEventAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3251:2: (otherlv_1= 'default' | otherlv_2= 'else' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==52) ) {
                alt43=1;
            }
            else if ( (LA43_0==53) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3251:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleDefaultEvent7473); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultEventAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3256:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleDefaultEvent7491); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3268:1: entryRuleEventRaisingExpression returns [EObject current=null] : iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF ;
    public final EObject entryRuleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventRaisingExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3269:2: (iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3270:2: iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRaisingExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventRaisingExpression_in_entryRuleEventRaisingExpression7528);
            iv_ruleEventRaisingExpression=ruleEventRaisingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventRaisingExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventRaisingExpression7538); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3277:1: ruleEventRaisingExpression returns [EObject current=null] : ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_event_2_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3280:28: ( ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3281:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3281:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3281:2: () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3281:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3282:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventRaisingExpressionAccess().getEventRaisingExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleEventRaisingExpression7584); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventRaisingExpressionAccess().getRaiseKeyword_1());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3291:1: ( (lv_event_2_0= ruleFeatureCall ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3292:1: (lv_event_2_0= ruleFeatureCall )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3292:1: (lv_event_2_0= ruleFeatureCall )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3293:3: lv_event_2_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getEventFeatureCallParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventRaisingExpression7605);
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

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3309:2: (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==20) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3309:4: otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleEventRaisingExpression7618); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventRaisingExpressionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3313:1: ( (lv_value_4_0= ruleExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3314:1: (lv_value_4_0= ruleExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3314:1: (lv_value_4_0= ruleExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3315:3: lv_value_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getValueExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleEventRaisingExpression7639);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3341:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3342:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3343:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression7679);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression7689); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3350:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3353:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3355:5: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpression7735);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3371:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3372:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3373:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression7769);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression7779); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3380:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3383:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3384:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3384:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3385:5: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression7826);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3393:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==21||(LA45_0>=74 && LA45_0<=83)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3393:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3393:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3394:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3399:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3400:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3400:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3401:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression7856);
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

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3417:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3418:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3418:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3419:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression7877);
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
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleConditionalExpression"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3443:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3444:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3445:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression7915);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression7925); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3452:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3455:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3456:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3456:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3457:5: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression7972);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3465:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==55) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3465:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3465:2: ()
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3466:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleConditionalExpression7993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3475:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3476:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3476:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3477:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression8014);
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

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleConditionalExpression8026); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3497:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3498:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3498:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3499:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression8047);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3523:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3524:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3525:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression8085);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression8095); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3532:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3535:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3536:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3536:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3537:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression8142);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3545:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==56) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3545:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3545:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3546:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleLogicalOrExpression8163); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3555:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3556:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3556:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3557:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression8184);
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3581:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3582:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3583:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression8222);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression8232); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3590:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3593:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3594:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3594:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3595:5: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression8279);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3603:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==57) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3603:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3603:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3604:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,57,FOLLOW_57_in_ruleLogicalAndExpression8300); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3613:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3614:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3614:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3615:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression8321);
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleLogicalNotExpression"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3639:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3640:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3641:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression8359);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNotExpression8369); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3648:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3651:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3652:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3652:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_STRING)||LA49_0==40||(LA49_0>=62 && LA49_0<=63)||(LA49_0>=86 && LA49_0<=87)||LA49_0==90) ) {
                alt49=1;
            }
            else if ( (LA49_0==58) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3653:5: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression8416);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3662:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3662:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3662:7: () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3662:7: ()
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3663:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalNotExpressionAccess().getLogicalNotExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleLogicalNotExpression8443); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLogicalNotExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3672:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3673:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3673:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3674:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression8464);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3698:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3699:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3700:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression8501);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression8511); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3707:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3710:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3711:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3711:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3712:5: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression8558);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3720:1: ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==59) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3720:2: () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3720:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3721:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleBitwiseXorExpression8579); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3730:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3731:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3731:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3732:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression8600);
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
    // $ANTLR end "ruleBitwiseXorExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3756:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3757:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3758:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression8638);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression8648); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3765:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3768:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3769:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3769:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3770:5: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression8695);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3778:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==60) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3778:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3778:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3779:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleBitwiseOrExpression8716); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3788:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3789:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3789:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3790:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression8737);
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
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3814:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3815:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3816:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression8775);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression8785); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3823:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3826:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3827:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3827:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3828:5: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression8832);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3836:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==61) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3836:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3836:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3837:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleBitwiseAndExpression8853); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3846:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3847:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3847:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3848:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression8874);
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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleLogicalRelationExpression"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3872:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3873:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3874:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression8912);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalRelationExpression8922); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3881:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3884:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3885:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3885:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3886:5: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression8969);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3894:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==47||(LA53_0>=91 && LA53_0<=95)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3894:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3894:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3895:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3900:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3901:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3901:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3902:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression8999);
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

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3918:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3919:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3919:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3920:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression9020);
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
    // $ANTLR end "ruleLogicalRelationExpression"


    // $ANTLR start "entryRuleShiftExpression"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3944:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3945:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3946:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression9058);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression9068); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3953:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3956:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3957:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3957:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3958:5: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression9115);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3966:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=84 && LA54_0<=85)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3966:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3966:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3967:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3972:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3973:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3973:1: (lv_operator_2_0= ruleShiftOperator )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3974:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression9145);
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

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3990:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3991:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3991:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:3992:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression9166);
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
    // $ANTLR end "ruleShiftExpression"


    // $ANTLR start "entryRuleNumericalAddSubtractExpression"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4016:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4017:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4018:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression9204);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression9214); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4025:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4028:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4029:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4029:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4030:5: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression9261);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4038:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=86 && LA55_0<=87)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4038:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4038:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4039:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4044:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4045:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4045:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4046:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression9291);
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

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4062:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4063:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4063:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4064:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression9312);
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
    // $ANTLR end "ruleNumericalAddSubtractExpression"


    // $ANTLR start "entryRuleNumericalMultiplyDivideExpression"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4088:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4089:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4090:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression9350);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression9360); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4097:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4100:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4101:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4101:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4102:5: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression9407);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4110:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==29||(LA56_0>=88 && LA56_0<=89)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4110:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4110:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4111:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4116:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4117:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4117:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4118:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression9437);
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

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4134:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4135:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4135:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4136:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression9458);
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
    // $ANTLR end "ruleNumericalMultiplyDivideExpression"


    // $ANTLR start "entryRuleNumericalUnaryExpression"
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4160:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4161:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4162:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression9496);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalUnaryExpression9506); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4169:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4172:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4173:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4173:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_STRING)||LA57_0==40||(LA57_0>=62 && LA57_0<=63)) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=86 && LA57_0<=87)||LA57_0==90) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4174:5: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression9553);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4183:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4183:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4183:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4183:7: ()
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4184:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumericalUnaryExpressionAccess().getNumericalUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4189:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4190:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4190:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4191:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression9589);
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

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4207:2: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4208:1: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4208:1: (lv_operand_3_0= rulePrimaryExpression )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4209:3: lv_operand_3_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression9610);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4233:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4234:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4235:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression9647);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression9657); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4242:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4245:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4246:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4246:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            int alt58=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_HEX:
            case RULE_STRING:
                {
                alt58=1;
                }
                break;
            case RULE_ID:
                {
                alt58=2;
                }
                break;
            case 63:
                {
                alt58=3;
                }
                break;
            case 62:
                {
                alt58=4;
                }
                break;
            case 40:
                {
                alt58=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4247:5: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrimitiveValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression9704);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4257:5: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression9731);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4267:5: this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getActiveStateReferenceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression9758);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4277:5: this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEventValueReferenceExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression9785);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4286:6: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4286:6: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4286:8: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_40_in_rulePrimaryExpression9803); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression9825);
                    this_Expression_5=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_6=(Token)match(input,41,FOLLOW_41_in_rulePrimaryExpression9836); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4311:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4312:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4313:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression9873);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValueExpression9883); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4320:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4323:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4324:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4324:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4324:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4324:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4325:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveValueExpressionAccess().getPrimitiveValueExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4330:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4331:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4331:1: (lv_value_1_0= ruleLiteral )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4332:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression9938);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4356:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4357:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4358:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall9974);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall9984); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4365:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4368:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4369:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4369:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4370:5: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall10031);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4378:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==44) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4378:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4378:2: ()
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4379:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleFeatureCall10052); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4388:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4389:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4389:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4390:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureCall10072); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4401:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt61=2;
            	    int LA61_0 = input.LA(1);

            	    if ( (LA61_0==40) && (synpred4_InternalSCCExp())) {
            	        alt61=1;
            	    }
            	    switch (alt61) {
            	        case 1 :
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4401:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4401:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4401:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4408:1: (lv_operationCall_4_0= '(' )
            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4409:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,40,FOLLOW_40_in_ruleFeatureCall10106); if (state.failed) return current;
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

            	            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4422:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt60=2;
            	            int LA60_0 = input.LA(1);

            	            if ( ((LA60_0>=RULE_ID && LA60_0<=RULE_STRING)||LA60_0==40||LA60_0==58||(LA60_0>=62 && LA60_0<=63)||(LA60_0>=86 && LA60_0<=87)||LA60_0==90) ) {
            	                alt60=1;
            	            }
            	            switch (alt60) {
            	                case 1 :
            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4422:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4422:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4423:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4423:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4424:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall10141);
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

            	                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4440:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop59:
            	                    do {
            	                        int alt59=2;
            	                        int LA59_0 = input.LA(1);

            	                        if ( (LA59_0==17) ) {
            	                            alt59=1;
            	                        }


            	                        switch (alt59) {
            	                    	case 1 :
            	                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4440:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleFeatureCall10154); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4444:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4445:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4445:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4446:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall10175);
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
            	                    	    break loop59;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,41,FOLLOW_41_in_ruleFeatureCall10191); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getFeatureCallAccess().getRightParenthesisKeyword_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4474:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4475:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4476:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression10231);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementReferenceExpression10241); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4483:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4486:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4487:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4487:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4487:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4487:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4488:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementReferenceExpressionAccess().getElementReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4493:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4494:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4494:1: (otherlv_1= RULE_ID )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4495:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementReferenceExpression10295); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4506:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==40) && (synpred5_InternalSCCExp())) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4506:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4506:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4506:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4513:1: (lv_operationCall_2_0= '(' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4514:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,40,FOLLOW_40_in_ruleElementReferenceExpression10329); if (state.failed) return current;
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

                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4527:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( ((LA64_0>=RULE_ID && LA64_0<=RULE_STRING)||LA64_0==40||LA64_0==58||(LA64_0>=62 && LA64_0<=63)||(LA64_0>=86 && LA64_0<=87)||LA64_0==90) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4527:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4527:3: ( (lv_args_3_0= ruleExpression ) )
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4528:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4528:1: (lv_args_3_0= ruleExpression )
                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4529:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression10364);
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

                            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4545:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==17) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4545:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleElementReferenceExpression10377); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4549:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4550:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4550:1: (lv_args_5_0= ruleExpression )
                            	    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4551:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression10398);
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
                            	    break loop63;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleElementReferenceExpression10414); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4579:1: entryRuleEventValueReferenceExpression returns [EObject current=null] : iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF ;
    public final EObject entryRuleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventValueReferenceExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4580:2: (iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4581:2: iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventValueReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression10452);
            iv_ruleEventValueReferenceExpression=ruleEventValueReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventValueReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventValueReferenceExpression10462); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4588:1: ruleEventValueReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject ruleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4591:28: ( ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4592:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4592:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4592:2: () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4592:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4593:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventValueReferenceExpressionAccess().getEventValueReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleEventValueReferenceExpression10508); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventValueReferenceExpressionAccess().getValueofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleEventValueReferenceExpression10520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventValueReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4606:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4607:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4607:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4608:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventValueReferenceExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression10541);
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

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleEventValueReferenceExpression10553); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4636:1: entryRuleActiveStateReferenceExpression returns [EObject current=null] : iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF ;
    public final EObject entryRuleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveStateReferenceExpression = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4637:2: (iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4638:2: iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveStateReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression10589);
            iv_ruleActiveStateReferenceExpression=ruleActiveStateReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveStateReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression10599); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4645:1: ruleActiveStateReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4648:28: ( ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4649:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4649:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4649:2: () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4649:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4650:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActiveStateReferenceExpressionAccess().getActiveStateReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleActiveStateReferenceExpression10645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActiveStateReferenceExpressionAccess().getActiveKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleActiveStateReferenceExpression10657); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActiveStateReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4663:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4664:1: ( ruleFQN )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4664:1: ( ruleFQN )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4665:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActiveStateReferenceExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActiveStateReferenceExpressionAccess().getValueStateCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression10680);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleActiveStateReferenceExpression10692); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4690:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4691:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4692:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral10728);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral10738); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4699:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_RealLiteral_3 = null;

        EObject this_StringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4702:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4703:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4703:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            int alt66=5;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt66=1;
                }
                break;
            case RULE_INT:
                {
                alt66=2;
                }
                break;
            case RULE_HEX:
                {
                alt66=3;
                }
                break;
            case RULE_FLOAT:
                {
                alt66=4;
                }
                break;
            case RULE_STRING:
                {
                alt66=5;
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4704:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral10785);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4714:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral10812);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4724:5: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexLiteral_in_ruleLiteral10839);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4734:5: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleLiteral10866);
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4744:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral10893);
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4760:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4761:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4762:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral10928);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral10938); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4769:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4772:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4773:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4773:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4773:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4773:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4774:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4779:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4780:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4780:1: (lv_value_1_0= RULE_BOOL )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4781:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral10989); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4805:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4806:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4807:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral11030);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral11040); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4814:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4817:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4818:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4818:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4818:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4818:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4819:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4824:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4825:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4825:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4826:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral11091); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4850:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4851:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4852:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral11132);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral11142); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4859:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4862:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4863:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4863:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4863:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4863:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4864:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4869:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4870:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4870:1: (lv_value_1_0= RULE_FLOAT )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4871:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleRealLiteral11193); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4895:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4896:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4897:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral11234);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexLiteral11244); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4904:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4907:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4908:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4908:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4908:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4908:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4909:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHexLiteralAccess().getHexLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4914:2: ( (lv_value_1_0= RULE_HEX ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4915:1: (lv_value_1_0= RULE_HEX )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4915:1: (lv_value_1_0= RULE_HEX )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4916:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleHexLiteral11295); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4940:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4941:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4942:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral11336);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral11346); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4949:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4952:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4953:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4953:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4953:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4953:2: ()
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4954:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4959:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4960:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4960:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4961:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral11397); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4985:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4987:28: ( ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4988:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4988:1: ( (enumLiteral_0= '\\'none\\'' ) | (enumLiteral_1= '\\'+\\'' ) | (enumLiteral_2= '\\'*\\'' ) | (enumLiteral_3= '\\'max\\'' ) | (enumLiteral_4= '\\'min\\'' ) | (enumLiteral_5= '\\'or\\'' ) | (enumLiteral_6= '\\'and\\'' ) | (enumLiteral_7= '\\'host\\'' ) )
            int alt67=8;
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
            case 67:
                {
                alt67=4;
                }
                break;
            case 68:
                {
                alt67=5;
                }
                break;
            case 69:
                {
                alt67=6;
                }
                break;
            case 70:
                {
                alt67=7;
                }
                break;
            case 71:
                {
                alt67=8;
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4988:2: (enumLiteral_0= '\\'none\\'' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4988:2: (enumLiteral_0= '\\'none\\'' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4988:4: enumLiteral_0= '\\'none\\''
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_64_in_ruleCombineOperator11452); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4994:6: (enumLiteral_1= '\\'+\\'' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4994:6: (enumLiteral_1= '\\'+\\'' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4994:8: enumLiteral_1= '\\'+\\''
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_65_in_ruleCombineOperator11469); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5000:6: (enumLiteral_2= '\\'*\\'' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5000:6: (enumLiteral_2= '\\'*\\'' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5000:8: enumLiteral_2= '\\'*\\''
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_66_in_ruleCombineOperator11486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5006:6: (enumLiteral_3= '\\'max\\'' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5006:6: (enumLiteral_3= '\\'max\\'' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5006:8: enumLiteral_3= '\\'max\\''
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_67_in_ruleCombineOperator11503); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5012:6: (enumLiteral_4= '\\'min\\'' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5012:6: (enumLiteral_4= '\\'min\\'' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5012:8: enumLiteral_4= '\\'min\\''
                    {
                    enumLiteral_4=(Token)match(input,68,FOLLOW_68_in_ruleCombineOperator11520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5018:6: (enumLiteral_5= '\\'or\\'' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5018:6: (enumLiteral_5= '\\'or\\'' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5018:8: enumLiteral_5= '\\'or\\''
                    {
                    enumLiteral_5=(Token)match(input,69,FOLLOW_69_in_ruleCombineOperator11537); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5024:6: (enumLiteral_6= '\\'and\\'' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5024:6: (enumLiteral_6= '\\'and\\'' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5024:8: enumLiteral_6= '\\'and\\''
                    {
                    enumLiteral_6=(Token)match(input,70,FOLLOW_70_in_ruleCombineOperator11554); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5030:6: (enumLiteral_7= '\\'host\\'' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5030:6: (enumLiteral_7= '\\'host\\'' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5030:8: enumLiteral_7= '\\'host\\''
                    {
                    enumLiteral_7=(Token)match(input,71,FOLLOW_71_in_ruleCombineOperator11571); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5040:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5042:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5043:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5043:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt68=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt68=1;
                }
                break;
            case 23:
                {
                alt68=2;
                }
                break;
            case 24:
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5043:2: (enumLiteral_0= 'local' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5043:2: (enumLiteral_0= 'local' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5043:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_19_in_ruleDirection11616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5049:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5049:6: (enumLiteral_1= 'in' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5049:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_23_in_ruleDirection11633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5055:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5055:6: (enumLiteral_2= 'out' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5055:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_24_in_ruleDirection11650); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5065:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5067:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5068:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5068:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==72) ) {
                alt69=1;
            }
            else if ( (LA69_0==73) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5068:2: (enumLiteral_0= 'after' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5068:2: (enumLiteral_0= 'after' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5068:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_72_in_ruleTimeEventType11695); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5074:6: (enumLiteral_1= 'every' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5074:6: (enumLiteral_1= 'every' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5074:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_73_in_ruleTimeEventType11712); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5084:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5086:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5087:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5087:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            int alt70=11;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt70=1;
                }
                break;
            case 74:
                {
                alt70=2;
                }
                break;
            case 75:
                {
                alt70=3;
                }
                break;
            case 76:
                {
                alt70=4;
                }
                break;
            case 77:
                {
                alt70=5;
                }
                break;
            case 78:
                {
                alt70=6;
                }
                break;
            case 79:
                {
                alt70=7;
                }
                break;
            case 80:
                {
                alt70=8;
                }
                break;
            case 81:
                {
                alt70=9;
                }
                break;
            case 82:
                {
                alt70=10;
                }
                break;
            case 83:
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5087:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5087:2: (enumLiteral_0= '=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5087:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_21_in_ruleAssignmentOperator11757); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5093:6: (enumLiteral_1= '*=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5093:6: (enumLiteral_1= '*=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5093:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_74_in_ruleAssignmentOperator11774); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5099:6: (enumLiteral_2= '/=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5099:6: (enumLiteral_2= '/=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5099:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_75_in_ruleAssignmentOperator11791); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5105:6: (enumLiteral_3= '%=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5105:6: (enumLiteral_3= '%=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5105:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_76_in_ruleAssignmentOperator11808); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5111:6: (enumLiteral_4= '+=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5111:6: (enumLiteral_4= '+=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5111:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,77,FOLLOW_77_in_ruleAssignmentOperator11825); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5117:6: (enumLiteral_5= '-=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5117:6: (enumLiteral_5= '-=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5117:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,78,FOLLOW_78_in_ruleAssignmentOperator11842); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5123:6: (enumLiteral_6= '<<=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5123:6: (enumLiteral_6= '<<=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5123:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,79,FOLLOW_79_in_ruleAssignmentOperator11859); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5129:6: (enumLiteral_7= '>>=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5129:6: (enumLiteral_7= '>>=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5129:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,80,FOLLOW_80_in_ruleAssignmentOperator11876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5135:6: (enumLiteral_8= '&=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5135:6: (enumLiteral_8= '&=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5135:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,81,FOLLOW_81_in_ruleAssignmentOperator11893); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5141:6: (enumLiteral_9= '^=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5141:6: (enumLiteral_9= '^=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5141:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,82,FOLLOW_82_in_ruleAssignmentOperator11910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5147:6: (enumLiteral_10= '|=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5147:6: (enumLiteral_10= '|=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5147:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,83,FOLLOW_83_in_ruleAssignmentOperator11927); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5157:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5159:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5160:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5160:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==84) ) {
                alt71=1;
            }
            else if ( (LA71_0==85) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5160:2: (enumLiteral_0= '<<' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5160:2: (enumLiteral_0= '<<' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5160:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,84,FOLLOW_84_in_ruleShiftOperator11972); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5166:6: (enumLiteral_1= '>>' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5166:6: (enumLiteral_1= '>>' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5166:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,85,FOLLOW_85_in_ruleShiftOperator11989); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5176:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5178:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5179:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5179:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==86) ) {
                alt72=1;
            }
            else if ( (LA72_0==87) ) {
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5179:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5179:2: (enumLiteral_0= '+' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5179:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_86_in_ruleAdditiveOperator12034); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5185:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5185:6: (enumLiteral_1= '-' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5185:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_87_in_ruleAdditiveOperator12051); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5195:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5197:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5198:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5198:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt73=3;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt73=1;
                }
                break;
            case 29:
                {
                alt73=2;
                }
                break;
            case 89:
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5198:2: (enumLiteral_0= '*' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5198:2: (enumLiteral_0= '*' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5198:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_88_in_ruleMultiplicativeOperator12096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5204:6: (enumLiteral_1= '/' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5204:6: (enumLiteral_1= '/' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5204:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_29_in_ruleMultiplicativeOperator12113); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5210:6: (enumLiteral_2= '%' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5210:6: (enumLiteral_2= '%' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5210:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,89,FOLLOW_89_in_ruleMultiplicativeOperator12130); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5220:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5222:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5223:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5223:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            int alt74=3;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt74=1;
                }
                break;
            case 87:
                {
                alt74=2;
                }
                break;
            case 90:
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5223:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5223:2: (enumLiteral_0= '+' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5223:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_86_in_ruleUnaryOperator12175); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5229:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5229:6: (enumLiteral_1= '-' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5229:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_87_in_ruleUnaryOperator12192); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5235:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5235:6: (enumLiteral_2= '~' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5235:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_90_in_ruleUnaryOperator12209); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5245:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5247:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5248:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5248:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt75=6;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt75=1;
                }
                break;
            case 92:
                {
                alt75=2;
                }
                break;
            case 47:
                {
                alt75=3;
                }
                break;
            case 93:
                {
                alt75=4;
                }
                break;
            case 94:
                {
                alt75=5;
                }
                break;
            case 95:
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5248:2: (enumLiteral_0= '<' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5248:2: (enumLiteral_0= '<' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5248:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,91,FOLLOW_91_in_ruleRelationalOperator12254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5254:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5254:6: (enumLiteral_1= '<=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5254:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,92,FOLLOW_92_in_ruleRelationalOperator12271); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5260:6: (enumLiteral_2= '>' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5260:6: (enumLiteral_2= '>' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5260:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_47_in_ruleRelationalOperator12288); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5266:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5266:6: (enumLiteral_3= '>=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5266:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,93,FOLLOW_93_in_ruleRelationalOperator12305); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5272:6: (enumLiteral_4= '==' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5272:6: (enumLiteral_4= '==' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5272:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,94,FOLLOW_94_in_ruleRelationalOperator12322); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5278:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5278:6: (enumLiteral_5= '!=' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5278:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,95,FOLLOW_95_in_ruleRelationalOperator12339); if (state.failed) return current;
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
    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5288:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5290:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5291:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5291:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            int alt76=4;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt76=1;
                }
                break;
            case 97:
                {
                alt76=2;
                }
                break;
            case 98:
                {
                alt76=3;
                }
                break;
            case 99:
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
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5291:2: (enumLiteral_0= 's' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5291:2: (enumLiteral_0= 's' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5291:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_96_in_ruleTimeUnit12384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5297:6: (enumLiteral_1= 'ms' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5297:6: (enumLiteral_1= 'ms' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5297:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_97_in_ruleTimeUnit12401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5303:6: (enumLiteral_2= 'us' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5303:6: (enumLiteral_2= 'us' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5303:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,98,FOLLOW_98_in_ruleTimeUnit12418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5309:6: (enumLiteral_3= 'ns' )
                    {
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5309:6: (enumLiteral_3= 'ns' )
                    // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:5309:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,99,FOLLOW_99_in_ruleTimeUnit12435); if (state.failed) return current;
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
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2543:6: ( '[' )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2543:8: '['
        {
        match(input,45,FOLLOW_45_in_synpred2_InternalSCCExp5714); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalSCCExp

    // $ANTLR start synpred3_InternalSCCExp
    public final void synpred3_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2660:4: ( ';' )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:2660:6: ';'
        {
        match(input,18,FOLLOW_18_in_synpred3_InternalSCCExp5951); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalSCCExp

    // $ANTLR start synpred4_InternalSCCExp
    public final void synpred4_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4401:4: ( ( '(' ) )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4402:1: ( '(' )
        {
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4402:1: ( '(' )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4403:2: '('
        {
        match(input,40,FOLLOW_40_in_synpred4_InternalSCCExp10088); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalSCCExp

    // $ANTLR start synpred5_InternalSCCExp
    public final void synpred5_InternalSCCExp_fragment() throws RecognitionException {   
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4506:4: ( ( '(' ) )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4507:1: ( '(' )
        {
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4507:1: ( '(' )
        // ../de.cau.kieler.scc.model.scctext/src-gen/de/cau/kieler/scc/model/scctext/parser/antlr/internal/InternalSCCExp.g:4508:2: '('
        {
        match(input,40,FOLLOW_40_in_synpred5_InternalSCCExp10311); if (state.failed) return ;

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
    public static final BitSet FOLLOW_14_in_ruleStateRoot332 = new BitSet(new long[]{0x000000005C010000L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleStateRoot353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionRoot399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleTransitionRoot436 = new BitSet(new long[]{0x00000001A0000000L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_entryRuleStateScope493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateScope503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScopeRoot_in_ruleStateScope549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScopeRoot_in_entryRuleInterfaceScopeRoot583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScopeRoot593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleInterfaceScopeRoot648 = new BitSet(new long[]{0x000000005C010002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScope695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDeclaration_in_ruleInterfaceScope742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionDeclaration_in_ruleInterfaceScope769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspendDeclaration_in_ruleInterfaceScope796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDeclaration_in_entryRuleInterfaceDeclaration831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDeclaration841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleInterfaceDeclaration887 = new BitSet(new long[]{0x0000000003880000L});
    public static final BitSet FOLLOW_ruleSCCVariableDeclaration_in_ruleInterfaceDeclaration908 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleInterfaceDeclaration921 = new BitSet(new long[]{0x0000000003880000L});
    public static final BitSet FOLLOW_ruleSCCVariableDeclaration_in_ruleInterfaceDeclaration942 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleInterfaceDeclaration956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSCCVariableDeclaration_in_entryRuleSCCVariableDeclaration992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSCCVariableDeclaration1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputVariableDeclaration_in_ruleSCCVariableDeclaration1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputVariableeclaration_in_ruleSCCVariableDeclaration1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOutVariableDeclaration_in_ruleSCCVariableDeclaration1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVariableDeclaration_in_ruleSCCVariableDeclaration1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVariableDeclaration_in_entryRuleLocalVariableDeclaration1165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalVariableDeclaration1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleLocalVariableDeclaration1221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalVariableDeclaration1238 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLocalVariableDeclaration1255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleLocalVariableDeclaration1278 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_ruleLocalVariableDeclaration1291 = new BitSet(new long[]{0xC4000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLocalVariableDeclaration1312 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleLocalVariableDeclaration1327 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleLocalVariableDeclaration1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOutVariableDeclaration_in_entryRuleInOutVariableDeclaration1386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInOutVariableDeclaration1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleInOutVariableDeclaration1442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInOutVariableDeclaration1459 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInOutVariableDeclaration1476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleInOutVariableDeclaration1499 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_ruleInOutVariableDeclaration1512 = new BitSet(new long[]{0xC4000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInOutVariableDeclaration1533 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleInOutVariableDeclaration1548 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleInOutVariableDeclaration1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputVariableeclaration_in_entryRuleOutputVariableeclaration1607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputVariableeclaration1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOutputVariableeclaration1663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutputVariableeclaration1680 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOutputVariableeclaration1697 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOutputVariableeclaration1720 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleOutputVariableeclaration1733 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleOutputVariableeclaration1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputVariableDeclaration_in_entryRuleInputVariableDeclaration1792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputVariableDeclaration1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleInputVariableDeclaration1848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInputVariableDeclaration1865 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInputVariableDeclaration1882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleInputVariableDeclaration1905 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_ruleInputVariableDeclaration1918 = new BitSet(new long[]{0xC4000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInputVariableDeclaration1939 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleInputVariableDeclaration1954 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleInputVariableDeclaration1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionDeclaration_in_entryRuleActionDeclaration2013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionDeclaration2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryActionDeclaration_in_ruleActionDeclaration2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsideActionDeclaration_in_ruleActionDeclaration2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitActionDeclaration_in_ruleActionDeclaration2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitActionDeclaration_in_entryRuleExitActionDeclaration2159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitActionDeclaration2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleExitActionDeclaration2215 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleActionVariableDeclaration_in_ruleExitActionDeclaration2236 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleExitActionDeclaration2249 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleActionVariableDeclaration_in_ruleExitActionDeclaration2270 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleExitActionDeclaration2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsideActionDeclaration_in_entryRuleInsideActionDeclaration2320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsideActionDeclaration2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleInsideActionDeclaration2376 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleActionVariableDeclaration_in_ruleInsideActionDeclaration2397 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInsideActionDeclaration2410 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleActionVariableDeclaration_in_ruleInsideActionDeclaration2431 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleInsideActionDeclaration2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryActionDeclaration_in_entryRuleEntryActionDeclaration2480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryActionDeclaration2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEntryActionDeclaration2536 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleActionVariableDeclaration_in_ruleEntryActionDeclaration2557 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEntryActionDeclaration2570 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleActionVariableDeclaration_in_ruleEntryActionDeclaration2591 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEntryActionDeclaration2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionVariableDeclaration_in_entryRuleActionVariableDeclaration2640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionVariableDeclaration2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleActionVariableDeclaration2687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionVariableDeclaration2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspendDeclaration_in_entryRuleSuspendDeclaration2745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuspendDeclaration2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSuspendDeclaration2801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSuspendVariableDeclaration_in_ruleSuspendDeclaration2822 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSuspendDeclaration2835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSuspendVariableDeclaration_in_ruleSuspendDeclaration2856 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSuspendDeclaration2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspendVariableDeclaration_in_entryRuleSuspendVariableDeclaration2905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuspendVariableDeclaration2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSuspendVariableDeclaration2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction2996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionReaction3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyTrigger_in_ruleTransitionReaction3061 = new BitSet(new long[]{0x00000000A0000002L});
    public static final BitSet FOLLOW_29_in_ruleTransitionReaction3075 = new BitSet(new long[]{0xC4400100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransitionReaction3096 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleTransitionReaction3111 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_ruleReactionProperties_in_ruleTransitionReaction3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyTrigger_in_entryRuleMyTrigger3170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMyTrigger3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleMyTrigger3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification3266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartSpecification3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleStatechartSpecification3323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleStatechartSpecification3344 = new BitSet(new long[]{0x000000045C010002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_ruleStatechartSpecification3367 = new BitSet(new long[]{0x000000045C010002L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateSpecification3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_ruleStateSpecification3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification3494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope3586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartScope3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStatechartScope3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_ruleStatechartScope3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_entryRuleInternalScope3707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalScope3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleInternalScope3763 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInternalScope3775 = new BitSet(new long[]{0x003F209801880012L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInternalScope3798 = new BitSet(new long[]{0x003F209801880012L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInternalScope3817 = new BitSet(new long[]{0x003F209801880012L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInternalScope3836 = new BitSet(new long[]{0x003F209801880012L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleInternalScope3855 = new BitSet(new long[]{0x003F209801880012L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion3897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclarartion3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition3989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDefinition3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleEventDefinition4045 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleEventDefinition4058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventDefinition4075 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleEventDefinition4093 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEventDefinition4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration4164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration4210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition4246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleVariableDefinition4302 = new BitSet(new long[]{0x0000006000000010L});
    public static final BitSet FOLLOW_37_in_ruleVariableDefinition4365 = new BitSet(new long[]{0x0000006000000010L});
    public static final BitSet FOLLOW_38_in_ruleVariableDefinition4450 = new BitSet(new long[]{0x0000006000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDefinition4520 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleVariableDefinition4537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleVariableDefinition4560 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleVariableDefinition4573 = new BitSet(new long[]{0xC4000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDefinition4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration4632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDeclaration4642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition4724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDefinition4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOperationDefinition4780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperationDefinition4797 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleOperationDefinition4814 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition4836 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_17_in_ruleOperationDefinition4849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition4870 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_41_in_ruleOperationDefinition4886 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleOperationDefinition4899 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition4922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter4970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter5012 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleParameter5029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleParameter5052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntrypoint_in_entryRuleEntrypoint5088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntrypoint5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEntrypoint5144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntrypoint5161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitpoint_in_entryRuleExitpoint5202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitpoint5212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleExitpoint5258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExitpoint5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN5317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN5328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN5368 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleFQN5387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN5402 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction5451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReaction5461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReaction5507 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleLocalReaction5539 = new BitSet(new long[]{0xC4400100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalReaction5560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger5598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionTrigger5608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSpec_in_ruleReactionTrigger5665 = new BitSet(new long[]{0x0000200000020002L});
    public static final BitSet FOLLOW_17_in_ruleReactionTrigger5678 = new BitSet(new long[]{0x003F000000000010L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleEventSpec_in_ruleReactionTrigger5699 = new BitSet(new long[]{0x0000200000020002L});
    public static final BitSet FOLLOW_45_in_ruleReactionTrigger5722 = new BitSet(new long[]{0xC4000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger5744 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleReactionTrigger5756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleReactionTrigger5778 = new BitSet(new long[]{0xC4000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger5799 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleReactionTrigger5811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect5849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionEffect5859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect5916 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect5935 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleReactionEffect5959 = new BitSet(new long[]{0xC4400100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect5983 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect6002 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleReactionProperties_in_entryRuleReactionProperties6043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionProperties6053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionProperty_in_ruleReactionProperties6108 = new BitSet(new long[]{0x0000800000000012L});
    public static final BitSet FOLLOW_ruleReactionProperty_in_entryRuleReactionProperty6145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionProperty6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_ruleReactionProperty6202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_ruleReactionProperty6229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec6264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryPointSpec6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleEntryPointSpec6311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEntryPointSpec6334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec6370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitPointSpec6380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleExitPointSpec6428 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleExitPointSpec6440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSpec_in_entryRuleEventSpec6476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventSpec6486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_ruleEventSpec6533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_ruleEventSpec6560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_ruleEventSpec6587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec6622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularEventSpec6632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec6677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec6712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeEventSpec6722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec6768 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeEventSpec6785 = new BitSet(new long[]{0x0000000000000002L,0x0000000F00000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec6811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec6848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinEventSpec6858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec6905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCycleEvent_in_ruleBuiltinEventSpec6959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec6986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultEvent_in_ruleBuiltinEventSpec7013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent7048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryEvent7058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleEntryEvent7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent7140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent7150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleExitEvent7196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCycleEvent_in_entryRuleOnCycleEvent7232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnCycleEvent7242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOnCycleEvent7288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent7324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEvent7334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAlwaysEvent7380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultEvent_in_entryRuleDefaultEvent7416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultEvent7426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDefaultEvent7473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleDefaultEvent7491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_entryRuleEventRaisingExpression7528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventRaisingExpression7538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleEventRaisingExpression7584 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventRaisingExpression7605 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleEventRaisingExpression7618 = new BitSet(new long[]{0xC4000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEventRaisingExpression7639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression7679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression7689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpression7735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression7769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression7779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression7826 = new BitSet(new long[]{0x0000000000200002L,0x00000000000FFC00L});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression7856 = new BitSet(new long[]{0xC4000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression7877 = new BitSet(new long[]{0x0000000000200002L,0x00000000000FFC00L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression7915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression7925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression7972 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleConditionalExpression7993 = new BitSet(new long[]{0xC4000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression8014 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConditionalExpression8026 = new BitSet(new long[]{0xC4000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression8047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression8085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression8095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression8142 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleLogicalOrExpression8163 = new BitSet(new long[]{0xC4000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression8184 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression8222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression8232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression8279 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleLogicalAndExpression8300 = new BitSet(new long[]{0xC4000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression8321 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression8359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNotExpression8369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression8416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleLogicalNotExpression8443 = new BitSet(new long[]{0xC0000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression8464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression8501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression8511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression8558 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleBitwiseXorExpression8579 = new BitSet(new long[]{0xC0000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression8600 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression8638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression8648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression8695 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleBitwiseOrExpression8716 = new BitSet(new long[]{0xC0000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression8737 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression8775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression8785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression8832 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleBitwiseAndExpression8853 = new BitSet(new long[]{0xC0000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression8874 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression8912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalRelationExpression8922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression8969 = new BitSet(new long[]{0x0000800000000002L,0x00000000F8000000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression8999 = new BitSet(new long[]{0xC0000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression9020 = new BitSet(new long[]{0x0000800000000002L,0x00000000F8000000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression9058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression9068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression9115 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression9145 = new BitSet(new long[]{0xC0000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression9166 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression9204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression9214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression9261 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression9291 = new BitSet(new long[]{0xC0000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression9312 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression9350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression9360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression9407 = new BitSet(new long[]{0x0000000020000002L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression9437 = new BitSet(new long[]{0xC0000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression9458 = new BitSet(new long[]{0x0000000020000002L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression9496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalUnaryExpression9506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression9553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression9589 = new BitSet(new long[]{0xC0000100000003F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression9610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression9647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression9657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression9704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression9731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression9758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression9785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePrimaryExpression9803 = new BitSet(new long[]{0xC4000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression9825 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_rulePrimaryExpression9836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression9873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValueExpression9883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression9938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall9974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall9984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall10031 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleFeatureCall10052 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureCall10072 = new BitSet(new long[]{0x0000110000000002L});
    public static final BitSet FOLLOW_40_in_ruleFeatureCall10106 = new BitSet(new long[]{0xC4000300000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall10141 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_17_in_ruleFeatureCall10154 = new BitSet(new long[]{0xC4000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall10175 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_41_in_ruleFeatureCall10191 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression10231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementReferenceExpression10241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementReferenceExpression10295 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleElementReferenceExpression10329 = new BitSet(new long[]{0xC4000300000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression10364 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_17_in_ruleElementReferenceExpression10377 = new BitSet(new long[]{0xC4000100000003F0L,0x0000000004C00000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression10398 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_41_in_ruleElementReferenceExpression10414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression10452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventValueReferenceExpression10462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleEventValueReferenceExpression10508 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleEventValueReferenceExpression10520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression10541 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleEventValueReferenceExpression10553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression10589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression10599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleActiveStateReferenceExpression10645 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleActiveStateReferenceExpression10657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression10680 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleActiveStateReferenceExpression10692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral10728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral10738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral10785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral10812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_ruleLiteral10839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleLiteral10866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral10893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral10928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral10938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral10989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral11030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral11040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral11091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral11132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral11142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRealLiteral11193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral11234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexLiteral11244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleHexLiteral11295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral11336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral11346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral11397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleCombineOperator11452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCombineOperator11469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleCombineOperator11486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleCombineOperator11503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCombineOperator11520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCombineOperator11537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleCombineOperator11554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleCombineOperator11571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleDirection11616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDirection11633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleDirection11650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleTimeEventType11695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleTimeEventType11712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAssignmentOperator11757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleAssignmentOperator11774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleAssignmentOperator11791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleAssignmentOperator11808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAssignmentOperator11825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleAssignmentOperator11842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleAssignmentOperator11859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleAssignmentOperator11876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleAssignmentOperator11893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleAssignmentOperator11910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleAssignmentOperator11927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleShiftOperator11972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleShiftOperator11989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleAdditiveOperator12034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleAdditiveOperator12051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleMultiplicativeOperator12096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleMultiplicativeOperator12113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleMultiplicativeOperator12130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleUnaryOperator12175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleUnaryOperator12192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleUnaryOperator12209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleRelationalOperator12254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleRelationalOperator12271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleRelationalOperator12288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleRelationalOperator12305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleRelationalOperator12322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleRelationalOperator12339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleTimeUnit12384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleTimeUnit12401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleTimeUnit12418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleTimeUnit12435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred2_InternalSCCExp5714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred3_InternalSCCExp5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred4_InternalSCCExp10088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred5_InternalSCCExp10311 = new BitSet(new long[]{0x0000000000000002L});

}
