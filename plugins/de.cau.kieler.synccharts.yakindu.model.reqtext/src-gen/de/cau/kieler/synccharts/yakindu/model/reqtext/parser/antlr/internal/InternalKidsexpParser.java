package de.cau.kieler.synccharts.yakindu.model.reqtext.parser.antlr.internal; 

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
import de.cau.kieler.synccharts.yakindu.model.reqtext.services.KidsexpGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKidsexpParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_FLOAT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@@statechart@@'", "'@@state@@'", "'@@transition@@'", "'statechart'", "'state'", "'interface'", "':'", "'internal'", "'event'", "'var'", "'readonly'", "'external'", "'='", "'operation'", "'('", "','", "')'", "'entrypoint'", "'exitpoint'", "'.'", "'/'", "'#'", "'['", "']'", "';'", "'>'", "'entry'", "'exit'", "'oncycle'", "'always'", "'default'", "'else'", "'raise'", "'?'", "'||'", "'&&'", "'!'", "'^'", "'|'", "'&'", "'valueof'", "'active'", "'local'", "'in'", "'out'", "'after'", "'every'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'%'", "'~'", "'<'", "'<='", "'>='", "'=='", "'!='", "'s'", "'ms'", "'us'", "'ns'"
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
    public static final int T__18=18;
    public static final int T__53=53;
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
    public static final int T__86=86;
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


        public InternalKidsexpParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKidsexpParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKidsexpParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g"; }



     	private KidsexpGrammarAccess grammarAccess;
     	
        public InternalKidsexpParser(TokenStream input, KidsexpGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Root";	
       	}
       	
       	@Override
       	protected KidsexpGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRoot"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:68:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:69:2: (iv_ruleRoot= ruleRoot EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:70:2: iv_ruleRoot= ruleRoot EOF
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:77:1: ruleRoot returns [EObject current=null] : ( (lv_roots_0_0= ruleDefRoot ) )* ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_roots_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:80:28: ( ( (lv_roots_0_0= ruleDefRoot ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:81:1: ( (lv_roots_0_0= ruleDefRoot ) )*
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:81:1: ( (lv_roots_0_0= ruleDefRoot ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:82:1: (lv_roots_0_0= ruleDefRoot )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:82:1: (lv_roots_0_0= ruleDefRoot )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:83:3: lv_roots_0_0= ruleDefRoot
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:107:1: entryRuleDefRoot returns [EObject current=null] : iv_ruleDefRoot= ruleDefRoot EOF ;
    public final EObject entryRuleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRoot = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:108:2: (iv_ruleDefRoot= ruleDefRoot EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:109:2: iv_ruleDefRoot= ruleDefRoot EOF
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:116:1: ruleDefRoot returns [EObject current=null] : (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) ;
    public final EObject ruleDefRoot() throws RecognitionException {
        EObject current = null;

        EObject this_StatechartRoot_0 = null;

        EObject this_StateRoot_1 = null;

        EObject this_TransitionRoot_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:119:28: ( (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:120:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:120:1: (this_StatechartRoot_0= ruleStatechartRoot | this_StateRoot_1= ruleStateRoot | this_TransitionRoot_2= ruleTransitionRoot )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:121:5: this_StatechartRoot_0= ruleStatechartRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStatechartRootParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatechartRoot_in_ruleDefRoot223);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:131:5: this_StateRoot_1= ruleStateRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getStateRootParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStateRoot_in_ruleDefRoot250);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:141:5: this_TransitionRoot_2= ruleTransitionRoot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefRootAccess().getTransitionRootParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransitionRoot_in_ruleDefRoot277);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:157:1: entryRuleStatechartRoot returns [EObject current=null] : iv_ruleStatechartRoot= ruleStatechartRoot EOF ;
    public final EObject entryRuleStatechartRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartRoot = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:158:2: (iv_ruleStatechartRoot= ruleStatechartRoot EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:159:2: iv_ruleStatechartRoot= ruleStatechartRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartRootRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot312);
            iv_ruleStatechartRoot=ruleStatechartRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartRoot322); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:166:1: ruleStatechartRoot returns [EObject current=null] : (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) ;
    public final EObject ruleStatechartRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:169:28: ( (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:170:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:170:1: (otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:170:3: otherlv_0= '@@statechart@@' ( (lv_def_1_0= ruleStatechartSpecification ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleStatechartRoot359); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatechartRootAccess().getStatechartKeyword_0());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:174:1: ( (lv_def_1_0= ruleStatechartSpecification ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:175:1: (lv_def_1_0= ruleStatechartSpecification )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:175:1: (lv_def_1_0= ruleStatechartSpecification )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:176:3: lv_def_1_0= ruleStatechartSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatechartRootAccess().getDefStatechartSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot380);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:200:1: entryRuleStateRoot returns [EObject current=null] : iv_ruleStateRoot= ruleStateRoot EOF ;
    public final EObject entryRuleStateRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateRoot = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:201:2: (iv_ruleStateRoot= ruleStateRoot EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:202:2: iv_ruleStateRoot= ruleStateRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRootRule()); 
            }
            pushFollow(FOLLOW_ruleStateRoot_in_entryRuleStateRoot416);
            iv_ruleStateRoot=ruleStateRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateRoot426); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:209:1: ruleStateRoot returns [EObject current=null] : (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) ;
    public final EObject ruleStateRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:212:28: ( (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:213:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:213:1: (otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:213:3: otherlv_0= '@@state@@' ( (lv_def_1_0= ruleStateSpecification ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleStateRoot463); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateRootAccess().getStateKeyword_0());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:217:1: ( (lv_def_1_0= ruleStateSpecification ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:218:1: (lv_def_1_0= ruleStateSpecification )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:218:1: (lv_def_1_0= ruleStateSpecification )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:219:3: lv_def_1_0= ruleStateSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateRootAccess().getDefStateSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_ruleStateRoot484);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:243:1: entryRuleTransitionRoot returns [EObject current=null] : iv_ruleTransitionRoot= ruleTransitionRoot EOF ;
    public final EObject entryRuleTransitionRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionRoot = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:244:2: (iv_ruleTransitionRoot= ruleTransitionRoot EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:245:2: iv_ruleTransitionRoot= ruleTransitionRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRootRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot520);
            iv_ruleTransitionRoot=ruleTransitionRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionRoot530); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:252:1: ruleTransitionRoot returns [EObject current=null] : (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) ;
    public final EObject ruleTransitionRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_def_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:255:28: ( (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:256:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:256:1: (otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:256:3: otherlv_0= '@@transition@@' ( (lv_def_1_0= ruleTransitionSpecification ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleTransitionRoot567); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionRootAccess().getTransitionKeyword_0());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:260:1: ( (lv_def_1_0= ruleTransitionSpecification ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:261:1: (lv_def_1_0= ruleTransitionSpecification )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:261:1: (lv_def_1_0= ruleTransitionSpecification )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:262:3: lv_def_1_0= ruleTransitionSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionRootAccess().getDefTransitionSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot588);
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


    // $ANTLR start "entryRuleTransitionSpecification"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:286:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:287:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:288:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification624);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification634); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:295:1: ruleTransitionSpecification returns [EObject current=null] : ( (lv_reaction_0_0= ruleTransitionReaction ) ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_reaction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:298:28: ( ( (lv_reaction_0_0= ruleTransitionReaction ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:299:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:299:1: ( (lv_reaction_0_0= ruleTransitionReaction ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:300:1: (lv_reaction_0_0= ruleTransitionReaction )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:300:1: (lv_reaction_0_0= ruleTransitionReaction )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:301:3: lv_reaction_0_0= ruleTransitionReaction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getReactionTransitionReactionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification679);
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


    // $ANTLR start "entryRuleStatechartSpecification"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:325:1: entryRuleStatechartSpecification returns [EObject current=null] : iv_ruleStatechartSpecification= ruleStatechartSpecification EOF ;
    public final EObject entryRuleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartSpecification = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:326:2: (iv_ruleStatechartSpecification= ruleStatechartSpecification EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:327:2: iv_ruleStatechartSpecification= ruleStatechartSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification714);
            iv_ruleStatechartSpecification=ruleStatechartSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartSpecification724); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:334:1: ruleStatechartSpecification returns [EObject current=null] : ( () otherlv_1= 'statechart' ) ;
    public final EObject ruleStatechartSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:337:28: ( ( () otherlv_1= 'statechart' ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:338:1: ( () otherlv_1= 'statechart' )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:338:1: ( () otherlv_1= 'statechart' )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:338:2: () otherlv_1= 'statechart'
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:338:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:339:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatechartSpecificationAccess().getStatechartSpecificationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleStatechartSpecification770); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStatechartSpecificationAccess().getStatechartKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:356:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:357:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:358:2: iv_ruleStateSpecification= ruleStateSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification806);
            iv_ruleStateSpecification=ruleStateSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateSpecification816); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:365:1: ruleStateSpecification returns [EObject current=null] : ( () otherlv_1= 'state' ) ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:368:28: ( ( () otherlv_1= 'state' ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:369:1: ( () otherlv_1= 'state' )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:369:1: ( () otherlv_1= 'state' )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:369:2: () otherlv_1= 'state'
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:369:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:370:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStateSpecificationAccess().getStateSpecificationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleStateSpecification862); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStateSpecificationAccess().getStateKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:391:1: entryRuleStateScope returns [EObject current=null] : iv_ruleStateScope= ruleStateScope EOF ;
    public final EObject entryRuleStateScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateScope = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:392:2: (iv_ruleStateScope= ruleStateScope EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:393:2: iv_ruleStateScope= ruleStateScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStateScope_in_entryRuleStateScope902);
            iv_ruleStateScope=ruleStateScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateScope912); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:400:1: ruleStateScope returns [EObject current=null] : ( () ( ( (lv_declarations_1_1= ruleLocalReaction | lv_declarations_1_2= ruleEntrypoint | lv_declarations_1_3= ruleExitpoint ) ) )* ) ;
    public final EObject ruleStateScope() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_1_1 = null;

        EObject lv_declarations_1_2 = null;

        EObject lv_declarations_1_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:403:28: ( ( () ( ( (lv_declarations_1_1= ruleLocalReaction | lv_declarations_1_2= ruleEntrypoint | lv_declarations_1_3= ruleExitpoint ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:404:1: ( () ( ( (lv_declarations_1_1= ruleLocalReaction | lv_declarations_1_2= ruleEntrypoint | lv_declarations_1_3= ruleExitpoint ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:404:1: ( () ( ( (lv_declarations_1_1= ruleLocalReaction | lv_declarations_1_2= ruleEntrypoint | lv_declarations_1_3= ruleExitpoint ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:404:2: () ( ( (lv_declarations_1_1= ruleLocalReaction | lv_declarations_1_2= ruleEntrypoint | lv_declarations_1_3= ruleExitpoint ) ) )*
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:404:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:405:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStateScopeAccess().getSimpleScopeAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:410:2: ( ( (lv_declarations_1_1= ruleLocalReaction | lv_declarations_1_2= ruleEntrypoint | lv_declarations_1_3= ruleExitpoint ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=31 && LA4_0<=32)||LA4_0==36||(LA4_0>=40 && LA4_0<=45)||(LA4_0>=59 && LA4_0<=60)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:411:1: ( (lv_declarations_1_1= ruleLocalReaction | lv_declarations_1_2= ruleEntrypoint | lv_declarations_1_3= ruleExitpoint ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:411:1: ( (lv_declarations_1_1= ruleLocalReaction | lv_declarations_1_2= ruleEntrypoint | lv_declarations_1_3= ruleExitpoint ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:412:1: (lv_declarations_1_1= ruleLocalReaction | lv_declarations_1_2= ruleEntrypoint | lv_declarations_1_3= ruleExitpoint )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:412:1: (lv_declarations_1_1= ruleLocalReaction | lv_declarations_1_2= ruleEntrypoint | lv_declarations_1_3= ruleExitpoint )
            	    int alt3=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	    case 36:
            	    case 40:
            	    case 41:
            	    case 42:
            	    case 43:
            	    case 44:
            	    case 45:
            	    case 59:
            	    case 60:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt3) {
            	        case 1 :
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:413:3: lv_declarations_1_1= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsLocalReactionParserRuleCall_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleStateScope969);
            	            lv_declarations_1_1=ruleLocalReaction();

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
            	                      		"LocalReaction");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:428:8: lv_declarations_1_2= ruleEntrypoint
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsEntrypointParserRuleCall_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEntrypoint_in_ruleStateScope988);
            	            lv_declarations_1_2=ruleEntrypoint();

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
            	                      		"Entrypoint");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:443:8: lv_declarations_1_3= ruleExitpoint
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsExitpointParserRuleCall_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExitpoint_in_ruleStateScope1007);
            	            lv_declarations_1_3=ruleExitpoint();

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
            	    break loop4;
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


    // $ANTLR start "entryRuleStatechartScope"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:469:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:470:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:471:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope1047);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartScope1057); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:478:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:481:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:482:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:482:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:483:5: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStatechartScope1104);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:493:5: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalScope_in_ruleStatechartScope1131);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:511:1: entryRuleInterfaceScope returns [EObject current=null] : iv_ruleInterfaceScope= ruleInterfaceScope EOF ;
    public final EObject entryRuleInterfaceScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceScope = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:512:2: (iv_ruleInterfaceScope= ruleInterfaceScope EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:513:2: iv_ruleInterfaceScope= ruleInterfaceScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope1168);
            iv_ruleInterfaceScope=ruleInterfaceScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceScope1178); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:520:1: ruleInterfaceScope returns [EObject current=null] : ( () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )* ) ;
    public final EObject ruleInterfaceScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_declarations_4_1 = null;

        EObject lv_declarations_4_2 = null;

        EObject lv_declarations_4_3 = null;

        EObject lv_declarations_4_4 = null;

        EObject lv_declarations_4_5 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:523:28: ( ( () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:524:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:524:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:524:2: () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )*
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:524:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:525:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInterfaceScopeAccess().getInterfaceScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleInterfaceScope1224); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceScopeAccess().getInterfaceKeyword_1());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:534:1: ( (lv_name_2_0= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:535:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:535:1: (lv_name_2_0= RULE_ID )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:536:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceScope1241); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_0, grammarAccess.getInterfaceScopeAccess().getNameIDTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInterfaceScopeRule());
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleInterfaceScope1259); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInterfaceScopeAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:556:1: ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=22 && LA8_0<=23)||LA8_0==27||(LA8_0>=31 && LA8_0<=32)||(LA8_0>=56 && LA8_0<=58)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:557:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:557:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:558:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:558:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint )
            	    int alt7=5;
            	    switch ( input.LA(1) ) {
            	    case 22:
            	    case 56:
            	    case 57:
            	    case 58:
            	        {
            	        alt7=1;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt7=2;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt7=3;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt7=4;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt7=5;
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
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:559:3: lv_declarations_4_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope1282);
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
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:574:8: lv_declarations_4_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope1301);
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
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:589:8: lv_declarations_4_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_4_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope1320);
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
            	        case 4 :
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:604:8: lv_declarations_4_4= ruleEntrypoint
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsEntrypointParserRuleCall_4_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEntrypoint_in_ruleInterfaceScope1339);
            	            lv_declarations_4_4=ruleEntrypoint();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceScopeRule());
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
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:619:8: lv_declarations_4_5= ruleExitpoint
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsExitpointParserRuleCall_4_0_4()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExitpoint_in_ruleInterfaceScope1358);
            	            lv_declarations_4_5=ruleExitpoint();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getInterfaceScopeRule());
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
            	    break loop8;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:645:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:646:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:647:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInternalScope_in_entryRuleInternalScope1398);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalScope1408); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:654:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) ;
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
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:657:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:658:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:658:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:658:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:658:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:659:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInternalScopeAccess().getInternalScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleInternalScope1454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleInternalScope1466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:672:1: ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=22 && LA10_0<=23)||LA10_0==27||LA10_0==36||(LA10_0>=40 && LA10_0<=45)||(LA10_0>=56 && LA10_0<=60)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:673:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:673:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:674:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:674:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    int alt9=4;
            	    switch ( input.LA(1) ) {
            	    case 22:
            	    case 56:
            	    case 57:
            	    case 58:
            	        {
            	        alt9=1;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt9=2;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt9=3;
            	        }
            	        break;
            	    case RULE_ID:
            	    case 36:
            	    case 40:
            	    case 41:
            	    case 42:
            	    case 43:
            	    case 44:
            	    case 45:
            	    case 59:
            	    case 60:
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
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:675:3: lv_declarations_3_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInternalScope1489);
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
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:690:8: lv_declarations_3_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInternalScope1508);
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
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:705:8: lv_declarations_3_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInternalScope1527);
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
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:720:8: lv_declarations_3_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsLocalReactionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleInternalScope1546);
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
            	    break loop10;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:748:1: entryRuleEventDeclarartion returns [EObject current=null] : iv_ruleEventDeclarartion= ruleEventDeclarartion EOF ;
    public final EObject entryRuleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclarartion = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:749:2: (iv_ruleEventDeclarartion= ruleEventDeclarartion EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:750:2: iv_ruleEventDeclarartion= ruleEventDeclarartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarartionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion1588);
            iv_ruleEventDeclarartion=ruleEventDeclarartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclarartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclarartion1598); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:757:1: ruleEventDeclarartion returns [EObject current=null] : this_EventDefinition_0= ruleEventDefinition ;
    public final EObject ruleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject this_EventDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:760:28: (this_EventDefinition_0= ruleEventDefinition )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:762:5: this_EventDefinition_0= ruleEventDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEventDeclarartionAccess().getEventDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion1644);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:780:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:781:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:782:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition1680);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDefinition1690); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:789:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:792:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:793:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:793:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:793:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:793:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=56 && LA11_0<=58)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:794:1: (lv_direction_0_0= ruleDirection )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:794:1: (lv_direction_0_0= ruleDirection )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:795:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_ruleEventDefinition1736);
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

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleEventDefinition1749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:815:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:816:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:816:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:817:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventDefinition1766); if (state.failed) return current;
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

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:833:2: (otherlv_3= ':' ( ( ruleFQN ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:833:4: otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleEventDefinition1784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:837:1: ( ( ruleFQN ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:838:1: ( ruleFQN )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:838:1: ( ruleFQN )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:839:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getTypeTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEventDefinition1807);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:860:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:861:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:862:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1845);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration1855); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:869:1: ruleVariableDeclaration returns [EObject current=null] : this_VariableDefinition_0= ruleVariableDefinition ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:872:28: (this_VariableDefinition_0= ruleVariableDefinition )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:874:5: this_VariableDefinition_0= ruleVariableDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration1901);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:892:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:893:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:894:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition1937);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition1947); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:901:1: ruleVariableDefinition returns [EObject current=null] : ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? ) ;
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
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:904:28: ( ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:905:1: ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:905:1: ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:905:2: () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )?
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:905:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:906:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleVariableDefinition1993); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableDefinitionAccess().getVarKeyword_1());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:915:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:917:1: ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:917:1: ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:918:2: ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:921:2: ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:922:3: ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )*
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:922:3: ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( LA13_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:924:4: ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:924:4: ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:925:5: {...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:925:115: ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:926:6: ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0);
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:929:6: ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:929:7: {...}? => ( (lv_readonly_3_0= 'readonly' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "true");
            	    }
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:929:16: ( (lv_readonly_3_0= 'readonly' ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:930:1: (lv_readonly_3_0= 'readonly' )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:930:1: (lv_readonly_3_0= 'readonly' )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:931:3: lv_readonly_3_0= 'readonly'
            	    {
            	    lv_readonly_3_0=(Token)match(input,24,FOLLOW_24_in_ruleVariableDefinition2056); if (state.failed) return current;
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
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:951:4: ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:951:4: ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:952:5: {...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:952:115: ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:953:6: ({...}? => ( (lv_external_4_0= 'external' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1);
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:956:6: ({...}? => ( (lv_external_4_0= 'external' ) ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:956:7: {...}? => ( (lv_external_4_0= 'external' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "true");
            	    }
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:956:16: ( (lv_external_4_0= 'external' ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:957:1: (lv_external_4_0= 'external' )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:957:1: (lv_external_4_0= 'external' )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:958:3: lv_external_4_0= 'external'
            	    {
            	    lv_external_4_0=(Token)match(input,25,FOLLOW_25_in_ruleVariableDefinition2141); if (state.failed) return current;
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
            	    break loop13;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:985:2: ( (lv_name_5_0= RULE_ID ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:986:1: (lv_name_5_0= RULE_ID )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:986:1: (lv_name_5_0= RULE_ID )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:987:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDefinition2211); if (state.failed) return current;
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

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleVariableDefinition2228); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionAccess().getColonKeyword_4());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1007:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1008:1: ( ruleFQN )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1008:1: ( ruleFQN )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1009:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getTypeTypeCrossReference_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleVariableDefinition2251);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1022:2: (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1022:4: otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleVariableDefinition2264); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getVariableDefinitionAccess().getEqualsSignKeyword_6_0());
                          
                    }
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1026:1: ( (lv_initialValue_9_0= ruleExpression ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1027:1: (lv_initialValue_9_0= ruleExpression )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1027:1: (lv_initialValue_9_0= ruleExpression )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1028:3: lv_initialValue_9_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getInitialValueExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDefinition2285);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1052:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1053:2: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1054:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration2323);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDeclaration2333); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1061:1: ruleOperationDeclaration returns [EObject current=null] : this_OperationDefinition_0= ruleOperationDefinition ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1064:28: (this_OperationDefinition_0= ruleOperationDefinition )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1066:5: this_OperationDefinition_0= ruleOperationDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOperationDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration2379);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1084:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1085:2: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1086:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition2415);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDefinition2425); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1093:1: ruleOperationDefinition returns [EObject current=null] : ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) ;
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
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1096:28: ( ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1097:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1097:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1097:2: () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1097:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1098:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationDefinitionAccess().getOperationDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleOperationDefinition2471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionAccess().getOperationKeyword_1());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1107:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1108:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1108:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1109:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperationDefinition2488); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleOperationDefinition2505); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1129:1: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1129:2: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1129:2: ( (lv_parameters_4_0= ruleParameter ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1130:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1130:1: (lv_parameters_4_0= ruleParameter )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1131:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition2527);
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

                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1147:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==29) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1147:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleOperationDefinition2540); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getOperationDefinitionAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1151:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1152:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1152:1: (lv_parameters_6_0= ruleParameter )
                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1153:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition2561);
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
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleOperationDefinition2577); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1173:1: (otherlv_8= ':' ( ( ruleFQN ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1173:3: otherlv_8= ':' ( ( ruleFQN ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleOperationDefinition2590); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getOperationDefinitionAccess().getColonKeyword_6_0());
                          
                    }
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1177:1: ( ( ruleFQN ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1178:1: ( ruleFQN )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1178:1: ( ruleFQN )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1179:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getTypeTypeCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition2613);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1200:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1201:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1202:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter2651);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2661); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1209:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1212:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1213:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1213:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1213:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1213:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1214:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1214:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1215:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter2703); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleParameter2720); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1235:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1236:1: ( ruleFQN )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1236:1: ( ruleFQN )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1237:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleParameter2743);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1258:1: entryRuleEntrypoint returns [EObject current=null] : iv_ruleEntrypoint= ruleEntrypoint EOF ;
    public final EObject entryRuleEntrypoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntrypoint = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1259:2: (iv_ruleEntrypoint= ruleEntrypoint EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1260:2: iv_ruleEntrypoint= ruleEntrypoint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntrypointRule()); 
            }
            pushFollow(FOLLOW_ruleEntrypoint_in_entryRuleEntrypoint2779);
            iv_ruleEntrypoint=ruleEntrypoint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntrypoint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntrypoint2789); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1267:1: ruleEntrypoint returns [EObject current=null] : ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleEntrypoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1270:28: ( ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1271:1: ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1271:1: ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1271:2: () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1271:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1272:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntrypointAccess().getEntrypointAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleEntrypoint2835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntrypointAccess().getEntrypointKeyword_1());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1281:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1282:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1282:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1283:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntrypoint2852); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1307:1: entryRuleExitpoint returns [EObject current=null] : iv_ruleExitpoint= ruleExitpoint EOF ;
    public final EObject entryRuleExitpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitpoint = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1308:2: (iv_ruleExitpoint= ruleExitpoint EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1309:2: iv_ruleExitpoint= ruleExitpoint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitpointRule()); 
            }
            pushFollow(FOLLOW_ruleExitpoint_in_entryRuleExitpoint2893);
            iv_ruleExitpoint=ruleExitpoint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitpoint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitpoint2903); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1316:1: ruleExitpoint returns [EObject current=null] : ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleExitpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1319:28: ( ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1320:1: ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1320:1: ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1320:2: () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1320:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1321:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitpointAccess().getExitpointAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleExitpoint2949); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitpointAccess().getExitpointKeyword_1());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1330:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1331:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1331:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1332:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExitpoint2966); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1356:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1357:2: (iv_ruleFQN= ruleFQN EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1358:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN3008);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN3019); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1365:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1368:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1369:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1369:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1369:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3059); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1376:1: (kw= '.' this_ID_2= RULE_ID )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1377:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,33,FOLLOW_33_in_ruleFQN3078); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3093); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleLocalReaction"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1399:1: entryRuleLocalReaction returns [EObject current=null] : iv_ruleLocalReaction= ruleLocalReaction EOF ;
    public final EObject entryRuleLocalReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReaction = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1400:2: (iv_ruleLocalReaction= ruleLocalReaction EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1401:2: iv_ruleLocalReaction= ruleLocalReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction3142);
            iv_ruleLocalReaction=ruleLocalReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReaction3152); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1408:1: ruleLocalReaction returns [EObject current=null] : ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) ;
    public final EObject ruleLocalReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_trigger_0_0 = null;

        EObject lv_effect_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1411:28: ( ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1412:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1412:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1412:2: ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1412:2: ( (lv_trigger_0_0= ruleReactionTrigger ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1413:1: (lv_trigger_0_0= ruleReactionTrigger )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1413:1: (lv_trigger_0_0= ruleReactionTrigger )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1414:3: lv_trigger_0_0= ruleReactionTrigger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerReactionTriggerParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReaction3198);
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

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1430:2: ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1430:3: ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1435:6: (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1435:8: otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) )
            {
            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleLocalReaction3230); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalReactionAccess().getSolidusKeyword_1_0_0());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1439:1: ( (lv_effect_2_0= ruleReactionEffect ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1440:1: (lv_effect_2_0= ruleReactionEffect )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1440:1: (lv_effect_2_0= ruleReactionEffect )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1441:3: lv_effect_2_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectReactionEffectParserRuleCall_1_0_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalReaction3251);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1465:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1466:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1467:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction3289);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionReaction3299); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1474:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1477:28: ( ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1478:1: ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1478:1: ( () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )? )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1478:2: () ( (lv_trigger_1_0= ruleReactionTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )?
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1478:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1479:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionReactionAccess().getTransitionReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1484:2: ( (lv_trigger_1_0= ruleReactionTrigger ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||LA19_0==36||(LA19_0>=40 && LA19_0<=45)||(LA19_0>=59 && LA19_0<=60)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1485:1: (lv_trigger_1_0= ruleReactionTrigger )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1485:1: (lv_trigger_1_0= ruleReactionTrigger )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1486:3: lv_trigger_1_0= ruleReactionTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerReactionTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionTrigger_in_ruleTransitionReaction3354);
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

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1502:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1502:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleTransitionReaction3368); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1506:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1507:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1507:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1508:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransitionReaction3389);
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

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1524:4: (otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1524:6: otherlv_4= '#' ( (lv_properties_5_0= ruleReactionProperties ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleTransitionReaction3404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionReactionAccess().getNumberSignKeyword_3_0());
                          
                    }
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1528:1: ( (lv_properties_5_0= ruleReactionProperties ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1529:1: (lv_properties_5_0= ruleReactionProperties )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1529:1: (lv_properties_5_0= ruleReactionProperties )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1530:3: lv_properties_5_0= ruleReactionProperties
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getPropertiesReactionPropertiesParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionProperties_in_ruleTransitionReaction3425);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1554:1: entryRuleReactionTrigger returns [EObject current=null] : iv_ruleReactionTrigger= ruleReactionTrigger EOF ;
    public final EObject entryRuleReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionTrigger = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1555:2: (iv_ruleReactionTrigger= ruleReactionTrigger EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1556:2: iv_ruleReactionTrigger= ruleReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger3463);
            iv_ruleReactionTrigger=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionTrigger3473); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1563:1: ruleReactionTrigger returns [EObject current=null] : ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ) ;
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
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1566:28: ( ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1567:1: ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1567:1: ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1567:2: () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1567:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1568:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1573:2: ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID||(LA24_0>=40 && LA24_0<=45)||(LA24_0>=59 && LA24_0<=60)) ) {
                alt24=1;
            }
            else if ( (LA24_0==36) ) {
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1573:3: ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1573:3: ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1573:4: ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )?
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1573:4: ( (lv_triggers_1_0= ruleEventSpec ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1574:1: (lv_triggers_1_0= ruleEventSpec )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1574:1: (lv_triggers_1_0= ruleEventSpec )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1575:3: lv_triggers_1_0= ruleEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventSpec_in_ruleReactionTrigger3530);
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

                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1591:2: (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==29) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1591:4: otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) )
                    	    {
                    	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleReactionTrigger3543); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getReactionTriggerAccess().getCommaKeyword_1_0_1_0());
                    	          
                    	    }
                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1595:1: ( (lv_triggers_3_0= ruleEventSpec ) )
                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1596:1: (lv_triggers_3_0= ruleEventSpec )
                    	    {
                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1596:1: (lv_triggers_3_0= ruleEventSpec )
                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1597:3: lv_triggers_3_0= ruleEventSpec
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_1_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEventSpec_in_ruleReactionTrigger3564);
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
                    	    break loop22;
                        }
                    } while (true);

                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1613:4: ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==36) && (synpred2_InternalKidsexp())) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1613:5: ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']'
                            {
                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1613:5: ( ( '[' )=>otherlv_4= '[' )
                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1613:6: ( '[' )=>otherlv_4= '['
                            {
                            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleReactionTrigger3587); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_1_0_2_0());
                                  
                            }

                            }

                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1618:2: ( (lv_guardExpression_5_0= ruleExpression ) )
                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1619:1: (lv_guardExpression_5_0= ruleExpression )
                            {
                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1619:1: (lv_guardExpression_5_0= ruleExpression )
                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1620:3: lv_guardExpression_5_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_1_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger3609);
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

                            otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleReactionTrigger3621); if (state.failed) return current;
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1641:6: (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1641:6: (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1641:8: otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']'
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleReactionTrigger3643); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_1_1_0());
                          
                    }
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1645:1: ( (lv_guardExpression_8_0= ruleExpression ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1646:1: (lv_guardExpression_8_0= ruleExpression )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1646:1: (lv_guardExpression_8_0= ruleExpression )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1647:3: lv_guardExpression_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger3664);
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

                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleReactionTrigger3676); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1675:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1676:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1677:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect3714);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionEffect3724); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1684:1: ruleReactionEffect returns [EObject current=null] : ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_actions_1_1 = null;

        EObject lv_actions_1_2 = null;

        EObject lv_actions_3_1 = null;

        EObject lv_actions_3_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1687:28: ( ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1688:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1688:1: ( () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1688:2: () ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) ) ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1688:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1689:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1694:2: ( ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1695:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1695:1: ( (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1696:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1696:1: (lv_actions_1_1= ruleExpression | lv_actions_1_2= ruleEventRaisingExpression )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_STRING)||LA25_0==28||LA25_0==50||(LA25_0>=54 && LA25_0<=55)||(LA25_0>=73 && LA25_0<=74)||LA25_0==77) ) {
                alt25=1;
            }
            else if ( (LA25_0==46) ) {
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1697:3: lv_actions_1_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect3781);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1712:8: lv_actions_1_2= ruleEventRaisingExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect3800);
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

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1730:2: ( ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==38) && (synpred3_InternalKidsexp())) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1730:3: ( ( ';' )=>otherlv_2= ';' ) ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1730:3: ( ( ';' )=>otherlv_2= ';' )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1730:4: ( ';' )=>otherlv_2= ';'
            	    {
            	    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleReactionEffect3824); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReactionEffectAccess().getSemicolonKeyword_2_0());
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1735:2: ( ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1736:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1736:1: ( (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1737:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1737:1: (lv_actions_3_1= ruleExpression | lv_actions_3_2= ruleEventRaisingExpression )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)||LA26_0==28||LA26_0==50||(LA26_0>=54 && LA26_0<=55)||(LA26_0>=73 && LA26_0<=74)||LA26_0==77) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==46) ) {
            	        alt26=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1738:3: lv_actions_3_1= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsExpressionParserRuleCall_2_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleReactionEffect3848);
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
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1753:8: lv_actions_3_2= ruleEventRaisingExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getReactionEffectAccess().getActionsEventRaisingExpressionParserRuleCall_2_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect3867);
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
    // $ANTLR end "ruleReactionEffect"


    // $ANTLR start "entryRuleReactionProperties"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1779:1: entryRuleReactionProperties returns [EObject current=null] : iv_ruleReactionProperties= ruleReactionProperties EOF ;
    public final EObject entryRuleReactionProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionProperties = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1780:2: (iv_ruleReactionProperties= ruleReactionProperties EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1781:2: iv_ruleReactionProperties= ruleReactionProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionPropertiesRule()); 
            }
            pushFollow(FOLLOW_ruleReactionProperties_in_entryRuleReactionProperties3908);
            iv_ruleReactionProperties=ruleReactionProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionProperties; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionProperties3918); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1788:1: ruleReactionProperties returns [EObject current=null] : ( () ( (lv_properties_1_0= ruleReactionProperty ) )* ) ;
    public final EObject ruleReactionProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1791:28: ( ( () ( (lv_properties_1_0= ruleReactionProperty ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1792:1: ( () ( (lv_properties_1_0= ruleReactionProperty ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1792:1: ( () ( (lv_properties_1_0= ruleReactionProperty ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1792:2: () ( (lv_properties_1_0= ruleReactionProperty ) )*
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1792:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1793:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionPropertiesAccess().getReactionPropertiesAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1798:2: ( (lv_properties_1_0= ruleReactionProperty ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||LA28_0==39) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1799:1: (lv_properties_1_0= ruleReactionProperty )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1799:1: (lv_properties_1_0= ruleReactionProperty )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1800:3: lv_properties_1_0= ruleReactionProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReactionPropertiesAccess().getPropertiesReactionPropertyParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleReactionProperty_in_ruleReactionProperties3973);
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
    // $ANTLR end "ruleReactionProperties"


    // $ANTLR start "entryRuleReactionProperty"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1824:1: entryRuleReactionProperty returns [EObject current=null] : iv_ruleReactionProperty= ruleReactionProperty EOF ;
    public final EObject entryRuleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionProperty = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1825:2: (iv_ruleReactionProperty= ruleReactionProperty EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1826:2: iv_ruleReactionProperty= ruleReactionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReactionProperty_in_entryRuleReactionProperty4010);
            iv_ruleReactionProperty=ruleReactionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionProperty4020); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1833:1: ruleReactionProperty returns [EObject current=null] : (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) ;
    public final EObject ruleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_EntryPointSpec_0 = null;

        EObject this_ExitPointSpec_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1836:28: ( (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1837:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1837:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1838:5: this_EntryPointSpec_0= ruleEntryPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReactionPropertyAccess().getEntryPointSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryPointSpec_in_ruleReactionProperty4067);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1848:5: this_ExitPointSpec_1= ruleExitPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReactionPropertyAccess().getExitPointSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitPointSpec_in_ruleReactionProperty4094);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1864:1: entryRuleEntryPointSpec returns [EObject current=null] : iv_ruleEntryPointSpec= ruleEntryPointSpec EOF ;
    public final EObject entryRuleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryPointSpec = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1865:2: (iv_ruleEntryPointSpec= ruleEntryPointSpec EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1866:2: iv_ruleEntryPointSpec= ruleEntryPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec4129);
            iv_ruleEntryPointSpec=ruleEntryPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryPointSpec4139); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1873:1: ruleEntryPointSpec returns [EObject current=null] : (otherlv_0= '>' ( ( ruleFQN ) ) ) ;
    public final EObject ruleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1876:28: ( (otherlv_0= '>' ( ( ruleFQN ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1877:1: (otherlv_0= '>' ( ( ruleFQN ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1877:1: (otherlv_0= '>' ( ( ruleFQN ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1877:3: otherlv_0= '>' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleEntryPointSpec4176); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntryPointSpecAccess().getGreaterThanSignKeyword_0());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1881:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1882:1: ( ruleFQN )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1882:1: ( ruleFQN )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1883:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEntryPointSpecRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntryPointSpecAccess().getEntrypointEntrypointCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleEntryPointSpec4199);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1904:1: entryRuleExitPointSpec returns [EObject current=null] : iv_ruleExitPointSpec= ruleExitPointSpec EOF ;
    public final EObject entryRuleExitPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitPointSpec = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1905:2: (iv_ruleExitPointSpec= ruleExitPointSpec EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1906:2: iv_ruleExitPointSpec= ruleExitPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec4235);
            iv_ruleExitPointSpec=ruleExitPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitPointSpec4245); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1913:1: ruleExitPointSpec returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= '>' ) ;
    public final EObject ruleExitPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1916:28: ( ( ( ( ruleFQN ) ) otherlv_1= '>' ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1917:1: ( ( ( ruleFQN ) ) otherlv_1= '>' )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1917:1: ( ( ( ruleFQN ) ) otherlv_1= '>' )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1917:2: ( ( ruleFQN ) ) otherlv_1= '>'
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1917:2: ( ( ruleFQN ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1918:1: ( ruleFQN )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1918:1: ( ruleFQN )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1919:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExitPointSpecRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExitPointSpecAccess().getExitpointExitpointCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleExitPointSpec4293);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleExitPointSpec4305); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1944:1: entryRuleEventSpec returns [EObject current=null] : iv_ruleEventSpec= ruleEventSpec EOF ;
    public final EObject entryRuleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSpec = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1945:2: (iv_ruleEventSpec= ruleEventSpec EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1946:2: iv_ruleEventSpec= ruleEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEventSpec_in_entryRuleEventSpec4341);
            iv_ruleEventSpec=ruleEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventSpec4351); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1953:1: ruleEventSpec returns [EObject current=null] : (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) ;
    public final EObject ruleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_RegularEventSpec_0 = null;

        EObject this_TimeEventSpec_1 = null;

        EObject this_BuiltinEventSpec_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1956:28: ( (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1957:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1957:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
            int alt30=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt30=1;
                }
                break;
            case 59:
            case 60:
                {
                alt30=2;
                }
                break;
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1958:5: this_RegularEventSpec_0= ruleRegularEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getRegularEventSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRegularEventSpec_in_ruleEventSpec4398);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1968:5: this_TimeEventSpec_1= ruleTimeEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getTimeEventSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTimeEventSpec_in_ruleEventSpec4425);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1978:5: this_BuiltinEventSpec_2= ruleBuiltinEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getBuiltinEventSpecParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBuiltinEventSpec_in_ruleEventSpec4452);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1994:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1995:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1996:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec4487);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularEventSpec4497); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2003:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2006:28: ( ( (lv_event_0_0= ruleFeatureCall ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2007:1: ( (lv_event_0_0= ruleFeatureCall ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2007:1: ( (lv_event_0_0= ruleFeatureCall ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2008:1: (lv_event_0_0= ruleFeatureCall )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2008:1: (lv_event_0_0= ruleFeatureCall )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2009:3: lv_event_0_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec4542);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2033:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2034:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2035:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec4577);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeEventSpec4587); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2042:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_type_0_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2045:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2046:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2046:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2046:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )?
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2046:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2047:1: (lv_type_0_0= ruleTimeEventType )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2047:1: (lv_type_0_0= ruleTimeEventType )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2048:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec4633);
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

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2064:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2065:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2065:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2066:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeEventSpec4650); if (state.failed) return current;
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

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2082:2: ( (lv_unit_2_0= ruleTimeUnit ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=83 && LA31_0<=86)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2083:1: (lv_unit_2_0= ruleTimeUnit )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2083:1: (lv_unit_2_0= ruleTimeUnit )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2084:3: lv_unit_2_0= ruleTimeUnit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec4676);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2108:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2109:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2110:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec4713);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinEventSpec4723); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2117:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_OnCycleEvent_2 = null;

        EObject this_AlwaysEvent_3 = null;

        EObject this_DefaultEvent_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2120:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2121:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2121:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent )
            int alt32=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt32=1;
                }
                break;
            case 41:
                {
                alt32=2;
                }
                break;
            case 42:
                {
                alt32=3;
                }
                break;
            case 43:
                {
                alt32=4;
                }
                break;
            case 44:
            case 45:
                {
                alt32=5;
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2122:5: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec4770);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2132:5: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec4797);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2142:5: this_OnCycleEvent_2= ruleOnCycleEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getOnCycleEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOnCycleEvent_in_ruleBuiltinEventSpec4824);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2152:5: this_AlwaysEvent_3= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec4851);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2162:5: this_DefaultEvent_4= ruleDefaultEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getDefaultEventParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultEvent_in_ruleBuiltinEventSpec4878);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2178:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2179:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2180:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent4913);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryEvent4923); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2187:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2190:28: ( ( () otherlv_1= 'entry' ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2191:1: ( () otherlv_1= 'entry' )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2191:1: ( () otherlv_1= 'entry' )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2191:2: () otherlv_1= 'entry'
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2191:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2192:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryEventAccess().getEntryEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleEntryEvent4969); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2209:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2210:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2211:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent5005);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent5015); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2218:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2221:28: ( ( () otherlv_1= 'exit' ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2222:1: ( () otherlv_1= 'exit' )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2222:1: ( () otherlv_1= 'exit' )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2222:2: () otherlv_1= 'exit'
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2222:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2223:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitEventAccess().getExitEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleExitEvent5061); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2240:1: entryRuleOnCycleEvent returns [EObject current=null] : iv_ruleOnCycleEvent= ruleOnCycleEvent EOF ;
    public final EObject entryRuleOnCycleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnCycleEvent = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2241:2: (iv_ruleOnCycleEvent= ruleOnCycleEvent EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2242:2: iv_ruleOnCycleEvent= ruleOnCycleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOnCycleEventRule()); 
            }
            pushFollow(FOLLOW_ruleOnCycleEvent_in_entryRuleOnCycleEvent5097);
            iv_ruleOnCycleEvent=ruleOnCycleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOnCycleEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnCycleEvent5107); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2249:1: ruleOnCycleEvent returns [EObject current=null] : ( () otherlv_1= 'oncycle' ) ;
    public final EObject ruleOnCycleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2252:28: ( ( () otherlv_1= 'oncycle' ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2253:1: ( () otherlv_1= 'oncycle' )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2253:1: ( () otherlv_1= 'oncycle' )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2253:2: () otherlv_1= 'oncycle'
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2253:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2254:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOnCycleEventAccess().getOnCycleEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleOnCycleEvent5153); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2271:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2272:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2273:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent5189);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEvent5199); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2280:1: ruleAlwaysEvent returns [EObject current=null] : ( () otherlv_1= 'always' ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2283:28: ( ( () otherlv_1= 'always' ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2284:1: ( () otherlv_1= 'always' )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2284:1: ( () otherlv_1= 'always' )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2284:2: () otherlv_1= 'always'
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2284:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2285:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlwaysEventAccess().getAlwaysEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleAlwaysEvent5245); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2302:1: entryRuleDefaultEvent returns [EObject current=null] : iv_ruleDefaultEvent= ruleDefaultEvent EOF ;
    public final EObject entryRuleDefaultEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultEvent = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2303:2: (iv_ruleDefaultEvent= ruleDefaultEvent EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2304:2: iv_ruleDefaultEvent= ruleDefaultEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultEventRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultEvent_in_entryRuleDefaultEvent5281);
            iv_ruleDefaultEvent=ruleDefaultEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultEvent5291); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2311:1: ruleDefaultEvent returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2314:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2315:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2315:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2315:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2315:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2316:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultEventAccess().getDefaultEventAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2321:2: (otherlv_1= 'default' | otherlv_2= 'else' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==44) ) {
                alt33=1;
            }
            else if ( (LA33_0==45) ) {
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2321:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleDefaultEvent5338); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultEventAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2326:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleDefaultEvent5356); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2338:1: entryRuleEventRaisingExpression returns [EObject current=null] : iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF ;
    public final EObject entryRuleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventRaisingExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2339:2: (iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2340:2: iv_ruleEventRaisingExpression= ruleEventRaisingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRaisingExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventRaisingExpression_in_entryRuleEventRaisingExpression5393);
            iv_ruleEventRaisingExpression=ruleEventRaisingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventRaisingExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventRaisingExpression5403); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2347:1: ruleEventRaisingExpression returns [EObject current=null] : ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleEventRaisingExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_event_2_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2350:28: ( ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2351:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2351:1: ( () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )? )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2351:2: () otherlv_1= 'raise' ( (lv_event_2_0= ruleFeatureCall ) ) (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2351:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2352:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventRaisingExpressionAccess().getEventRaisingExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleEventRaisingExpression5449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventRaisingExpressionAccess().getRaiseKeyword_1());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2361:1: ( (lv_event_2_0= ruleFeatureCall ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2362:1: (lv_event_2_0= ruleFeatureCall )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2362:1: (lv_event_2_0= ruleFeatureCall )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2363:3: lv_event_2_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getEventFeatureCallParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventRaisingExpression5470);
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

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2379:2: (otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==20) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2379:4: otherlv_3= ':' ( (lv_value_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleEventRaisingExpression5483); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventRaisingExpressionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2383:1: ( (lv_value_4_0= ruleExpression ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2384:1: (lv_value_4_0= ruleExpression )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2384:1: (lv_value_4_0= ruleExpression )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2385:3: lv_value_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventRaisingExpressionAccess().getValueExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleEventRaisingExpression5504);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2411:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2412:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2413:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression5544);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression5554); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2420:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2423:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2425:5: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpression5600);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2441:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2442:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2443:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression5634);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression5644); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2450:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2453:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2454:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2454:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2455:5: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression5691);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2463:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==26||(LA35_0>=61 && LA35_0<=70)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2463:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2463:2: ()
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2464:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2469:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2470:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2470:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2471:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression5721);
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

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2487:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2488:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2488:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2489:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression5742);
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
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleConditionalExpression"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2513:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2514:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2515:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression5780);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression5790); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2522:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2525:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2526:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2526:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2527:5: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression5837);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2535:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2535:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2535:2: ()
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2536:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleConditionalExpression5858); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2545:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2546:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2546:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2547:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression5879);
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

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleConditionalExpression5891); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2567:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2568:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2568:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2569:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression5912);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2593:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2594:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2595:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression5950);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression5960); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2602:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2605:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2606:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2606:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2607:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6007);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2615:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==48) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2615:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2615:2: ()
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2616:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleLogicalOrExpression6028); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2625:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2626:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2626:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2627:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6049);
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2651:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2652:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2653:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6087);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression6097); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2660:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2663:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2664:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2664:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2665:5: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6144);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2673:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==49) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2673:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2673:2: ()
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2674:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleLogicalAndExpression6165); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2683:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2684:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2684:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2685:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6186);
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleLogicalNotExpression"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2709:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2710:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2711:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression6224);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNotExpression6234); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2718:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2721:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2722:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2722:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_STRING)||LA39_0==28||(LA39_0>=54 && LA39_0<=55)||(LA39_0>=73 && LA39_0<=74)||LA39_0==77) ) {
                alt39=1;
            }
            else if ( (LA39_0==50) ) {
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2723:5: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression6281);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2732:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2732:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2732:7: () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2732:7: ()
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2733:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalNotExpressionAccess().getLogicalNotExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleLogicalNotExpression6308); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLogicalNotExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2742:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2743:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2743:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2744:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression6329);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2768:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2769:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2770:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression6366);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression6376); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2777:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2780:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2781:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2781:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2782:5: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression6423);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2790:1: ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==51) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2790:2: () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2790:2: ()
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2791:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleBitwiseXorExpression6444); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2800:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2801:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2801:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2802:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression6465);
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
    // $ANTLR end "ruleBitwiseXorExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2826:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2827:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2828:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression6503);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression6513); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2835:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2838:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2839:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2839:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2840:5: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression6560);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2848:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==52) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2848:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2848:2: ()
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2849:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleBitwiseOrExpression6581); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2858:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2859:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2859:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2860:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression6602);
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
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2884:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2885:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2886:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression6640);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression6650); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2893:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2896:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2897:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2897:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2898:5: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression6697);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2906:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==53) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2906:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2906:2: ()
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2907:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleBitwiseAndExpression6718); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2916:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2917:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2917:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2918:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression6739);
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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleLogicalRelationExpression"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2942:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2943:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2944:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression6777);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalRelationExpression6787); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2951:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2954:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2955:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2955:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2956:5: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression6834);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2964:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==39||(LA43_0>=78 && LA43_0<=82)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2964:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2964:2: ()
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2965:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2970:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2971:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2971:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2972:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression6864);
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

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2988:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2989:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2989:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2990:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression6885);
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
    // $ANTLR end "ruleLogicalRelationExpression"


    // $ANTLR start "entryRuleShiftExpression"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3014:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3015:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3016:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression6923);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression6933); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3023:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3026:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3027:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3027:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3028:5: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression6980);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3036:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=71 && LA44_0<=72)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3036:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3036:2: ()
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3037:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3042:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3043:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3043:1: (lv_operator_2_0= ruleShiftOperator )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3044:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression7010);
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

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3060:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3061:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3061:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3062:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7031);
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
    // $ANTLR end "ruleShiftExpression"


    // $ANTLR start "entryRuleNumericalAddSubtractExpression"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3086:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3087:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3088:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7069);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7079); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3095:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3098:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3099:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3099:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3100:5: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7126);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3108:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=73 && LA45_0<=74)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3108:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3108:2: ()
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3109:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3114:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3115:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3115:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3116:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7156);
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

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3132:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3133:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3133:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3134:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7177);
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
    // $ANTLR end "ruleNumericalAddSubtractExpression"


    // $ANTLR start "entryRuleNumericalMultiplyDivideExpression"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3158:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3159:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3160:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression7215);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression7225); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3167:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3170:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3171:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3171:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3172:5: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression7272);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3180:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==34||(LA46_0>=75 && LA46_0<=76)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3180:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3180:2: ()
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3181:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3186:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3187:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3187:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3188:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression7302);
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

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3204:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3205:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3205:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3206:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression7323);
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
    // $ANTLR end "ruleNumericalMultiplyDivideExpression"


    // $ANTLR start "entryRuleNumericalUnaryExpression"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3230:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3231:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3232:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression7361);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalUnaryExpression7371); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3239:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3242:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3243:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3243:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_STRING)||LA47_0==28||(LA47_0>=54 && LA47_0<=55)) ) {
                alt47=1;
            }
            else if ( ((LA47_0>=73 && LA47_0<=74)||LA47_0==77) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3244:5: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression7418);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3253:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3253:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3253:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3253:7: ()
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3254:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumericalUnaryExpressionAccess().getNumericalUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3259:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3260:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3260:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3261:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression7454);
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

                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3277:2: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3278:1: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3278:1: (lv_operand_3_0= rulePrimaryExpression )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3279:3: lv_operand_3_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression7475);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3303:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3304:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3305:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression7512);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression7522); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3312:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
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
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3315:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3316:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3316:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            int alt48=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_HEX:
            case RULE_STRING:
                {
                alt48=1;
                }
                break;
            case RULE_ID:
                {
                alt48=2;
                }
                break;
            case 55:
                {
                alt48=3;
                }
                break;
            case 54:
                {
                alt48=4;
                }
                break;
            case 28:
                {
                alt48=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3317:5: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrimitiveValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression7569);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3327:5: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression7596);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3337:5: this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getActiveStateReferenceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression7623);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3347:5: this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEventValueReferenceExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression7650);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3356:6: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3356:6: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3356:8: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_rulePrimaryExpression7668); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression7690);
                    this_Expression_5=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_6=(Token)match(input,30,FOLLOW_30_in_rulePrimaryExpression7701); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3381:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3382:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3383:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression7738);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValueExpression7748); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3390:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3393:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3394:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3394:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3394:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3394:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3395:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveValueExpressionAccess().getPrimitiveValueExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3400:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3401:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3401:1: (lv_value_1_0= ruleLiteral )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3402:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression7803);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3426:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3427:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3428:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall7839);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall7849); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3435:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3438:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3439:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3439:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3440:5: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall7896);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3448:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==33) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3448:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3448:2: ()
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3449:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleFeatureCall7917); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3458:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3459:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3459:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3460:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureCall7937); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3471:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==28) && (synpred4_InternalKidsexp())) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3471:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3471:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3471:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3478:1: (lv_operationCall_4_0= '(' )
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3479:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,28,FOLLOW_28_in_ruleFeatureCall7971); if (state.failed) return current;
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

            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3492:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt50=2;
            	            int LA50_0 = input.LA(1);

            	            if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_STRING)||LA50_0==28||LA50_0==50||(LA50_0>=54 && LA50_0<=55)||(LA50_0>=73 && LA50_0<=74)||LA50_0==77) ) {
            	                alt50=1;
            	            }
            	            switch (alt50) {
            	                case 1 :
            	                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3492:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3492:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3493:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3493:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3494:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8006);
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

            	                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3510:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop49:
            	                    do {
            	                        int alt49=2;
            	                        int LA49_0 = input.LA(1);

            	                        if ( (LA49_0==29) ) {
            	                            alt49=1;
            	                        }


            	                        switch (alt49) {
            	                    	case 1 :
            	                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3510:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleFeatureCall8019); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3514:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3515:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3515:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3516:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall8040);
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
            	                    	    break loop49;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleFeatureCall8056); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getFeatureCallAccess().getRightParenthesisKeyword_1_3_2());
            	                  
            	            }

            	            }
            	            break;

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
    // $ANTLR end "ruleFeatureCall"


    // $ANTLR start "entryRuleElementReferenceExpression"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3544:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3545:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3546:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8096);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementReferenceExpression8106); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3553:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
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
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3556:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3557:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3557:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3557:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3557:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3558:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementReferenceExpressionAccess().getElementReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3563:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3564:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3564:1: (otherlv_1= RULE_ID )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3565:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementReferenceExpression8160); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3576:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==28) && (synpred5_InternalKidsexp())) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3576:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3576:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3576:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3583:1: (lv_operationCall_2_0= '(' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3584:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,28,FOLLOW_28_in_ruleElementReferenceExpression8194); if (state.failed) return current;
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

                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3597:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_STRING)||LA54_0==28||LA54_0==50||(LA54_0>=54 && LA54_0<=55)||(LA54_0>=73 && LA54_0<=74)||LA54_0==77) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3597:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3597:3: ( (lv_args_3_0= ruleExpression ) )
                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3598:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3598:1: (lv_args_3_0= ruleExpression )
                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3599:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8229);
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

                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3615:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==29) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3615:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleElementReferenceExpression8242); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3619:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3620:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3620:1: (lv_args_5_0= ruleExpression )
                            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3621:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression8263);
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
                            	    break loop53;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleElementReferenceExpression8279); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3649:1: entryRuleEventValueReferenceExpression returns [EObject current=null] : iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF ;
    public final EObject entryRuleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventValueReferenceExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3650:2: (iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3651:2: iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventValueReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression8317);
            iv_ruleEventValueReferenceExpression=ruleEventValueReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventValueReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventValueReferenceExpression8327); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3658:1: ruleEventValueReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject ruleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3661:28: ( ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3662:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3662:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3662:2: () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3662:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3663:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventValueReferenceExpressionAccess().getEventValueReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleEventValueReferenceExpression8373); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventValueReferenceExpressionAccess().getValueofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleEventValueReferenceExpression8385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventValueReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3676:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3677:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3677:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3678:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventValueReferenceExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression8406);
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

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleEventValueReferenceExpression8418); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3706:1: entryRuleActiveStateReferenceExpression returns [EObject current=null] : iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF ;
    public final EObject entryRuleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveStateReferenceExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3707:2: (iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3708:2: iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveStateReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression8454);
            iv_ruleActiveStateReferenceExpression=ruleActiveStateReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveStateReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression8464); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3715:1: ruleActiveStateReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3718:28: ( ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3719:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3719:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3719:2: () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3719:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3720:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActiveStateReferenceExpressionAccess().getActiveStateReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleActiveStateReferenceExpression8510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActiveStateReferenceExpressionAccess().getActiveKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleActiveStateReferenceExpression8522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActiveStateReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3733:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3734:1: ( ruleFQN )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3734:1: ( ruleFQN )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3735:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActiveStateReferenceExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActiveStateReferenceExpressionAccess().getValueStateCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression8545);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleActiveStateReferenceExpression8557); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3760:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3761:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3762:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral8593);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral8603); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3769:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_RealLiteral_3 = null;

        EObject this_StringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3772:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3773:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3773:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            int alt56=5;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt56=1;
                }
                break;
            case RULE_INT:
                {
                alt56=2;
                }
                break;
            case RULE_HEX:
                {
                alt56=3;
                }
                break;
            case RULE_FLOAT:
                {
                alt56=4;
                }
                break;
            case RULE_STRING:
                {
                alt56=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3774:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral8650);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3784:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral8677);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3794:5: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexLiteral_in_ruleLiteral8704);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3804:5: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleLiteral8731);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3814:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral8758);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3830:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3831:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3832:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral8793);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral8803); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3839:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3842:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3843:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3843:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3843:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3843:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3844:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3849:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3850:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3850:1: (lv_value_1_0= RULE_BOOL )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3851:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral8854); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3875:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3876:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3877:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral8895);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral8905); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3884:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3887:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3888:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3888:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3888:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3888:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3889:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3894:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3895:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3895:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3896:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral8956); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3920:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3921:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3922:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral8997);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral9007); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3929:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3932:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3933:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3933:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3933:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3933:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3934:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3939:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3940:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3940:1: (lv_value_1_0= RULE_FLOAT )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3941:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleRealLiteral9058); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3965:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3966:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3967:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9099);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexLiteral9109); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3974:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3977:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3978:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3978:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3978:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3978:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3979:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHexLiteralAccess().getHexLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3984:2: ( (lv_value_1_0= RULE_HEX ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3985:1: (lv_value_1_0= RULE_HEX )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3985:1: (lv_value_1_0= RULE_HEX )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3986:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleHexLiteral9160); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4010:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4011:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4012:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9201);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral9211); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4019:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4022:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4023:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4023:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4023:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4023:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4024:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4029:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4030:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4030:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4031:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral9262); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4055:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4057:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4058:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4058:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt57=1;
                }
                break;
            case 57:
                {
                alt57=2;
                }
                break;
            case 58:
                {
                alt57=3;
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4058:2: (enumLiteral_0= 'local' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4058:2: (enumLiteral_0= 'local' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4058:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleDirection9317); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4064:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4064:6: (enumLiteral_1= 'in' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4064:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_57_in_ruleDirection9334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4070:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4070:6: (enumLiteral_2= 'out' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4070:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_58_in_ruleDirection9351); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4080:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4082:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4083:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4083:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==59) ) {
                alt58=1;
            }
            else if ( (LA58_0==60) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4083:2: (enumLiteral_0= 'after' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4083:2: (enumLiteral_0= 'after' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4083:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_59_in_ruleTimeEventType9396); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4089:6: (enumLiteral_1= 'every' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4089:6: (enumLiteral_1= 'every' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4089:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_60_in_ruleTimeEventType9413); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4099:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
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
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4101:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4102:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4102:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            int alt59=11;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt59=1;
                }
                break;
            case 61:
                {
                alt59=2;
                }
                break;
            case 62:
                {
                alt59=3;
                }
                break;
            case 63:
                {
                alt59=4;
                }
                break;
            case 64:
                {
                alt59=5;
                }
                break;
            case 65:
                {
                alt59=6;
                }
                break;
            case 66:
                {
                alt59=7;
                }
                break;
            case 67:
                {
                alt59=8;
                }
                break;
            case 68:
                {
                alt59=9;
                }
                break;
            case 69:
                {
                alt59=10;
                }
                break;
            case 70:
                {
                alt59=11;
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4102:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4102:2: (enumLiteral_0= '=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4102:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_26_in_ruleAssignmentOperator9458); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4108:6: (enumLiteral_1= '*=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4108:6: (enumLiteral_1= '*=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4108:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_61_in_ruleAssignmentOperator9475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4114:6: (enumLiteral_2= '/=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4114:6: (enumLiteral_2= '/=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4114:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_62_in_ruleAssignmentOperator9492); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4120:6: (enumLiteral_3= '%=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4120:6: (enumLiteral_3= '%=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4120:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_63_in_ruleAssignmentOperator9509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4126:6: (enumLiteral_4= '+=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4126:6: (enumLiteral_4= '+=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4126:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,64,FOLLOW_64_in_ruleAssignmentOperator9526); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4132:6: (enumLiteral_5= '-=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4132:6: (enumLiteral_5= '-=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4132:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,65,FOLLOW_65_in_ruleAssignmentOperator9543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4138:6: (enumLiteral_6= '<<=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4138:6: (enumLiteral_6= '<<=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4138:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,66,FOLLOW_66_in_ruleAssignmentOperator9560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4144:6: (enumLiteral_7= '>>=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4144:6: (enumLiteral_7= '>>=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4144:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,67,FOLLOW_67_in_ruleAssignmentOperator9577); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4150:6: (enumLiteral_8= '&=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4150:6: (enumLiteral_8= '&=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4150:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,68,FOLLOW_68_in_ruleAssignmentOperator9594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4156:6: (enumLiteral_9= '^=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4156:6: (enumLiteral_9= '^=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4156:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,69,FOLLOW_69_in_ruleAssignmentOperator9611); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4162:6: (enumLiteral_10= '|=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4162:6: (enumLiteral_10= '|=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4162:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,70,FOLLOW_70_in_ruleAssignmentOperator9628); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4172:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4174:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4175:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4175:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==71) ) {
                alt60=1;
            }
            else if ( (LA60_0==72) ) {
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4175:2: (enumLiteral_0= '<<' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4175:2: (enumLiteral_0= '<<' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4175:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_71_in_ruleShiftOperator9673); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4181:6: (enumLiteral_1= '>>' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4181:6: (enumLiteral_1= '>>' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4181:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_72_in_ruleShiftOperator9690); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4191:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4193:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4194:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4194:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==73) ) {
                alt61=1;
            }
            else if ( (LA61_0==74) ) {
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4194:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4194:2: (enumLiteral_0= '+' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4194:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_73_in_ruleAdditiveOperator9735); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4200:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4200:6: (enumLiteral_1= '-' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4200:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_74_in_ruleAdditiveOperator9752); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4210:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4212:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4213:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4213:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt62=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt62=1;
                }
                break;
            case 34:
                {
                alt62=2;
                }
                break;
            case 76:
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4213:2: (enumLiteral_0= '*' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4213:2: (enumLiteral_0= '*' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4213:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_75_in_ruleMultiplicativeOperator9797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4219:6: (enumLiteral_1= '/' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4219:6: (enumLiteral_1= '/' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4219:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_34_in_ruleMultiplicativeOperator9814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4225:6: (enumLiteral_2= '%' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4225:6: (enumLiteral_2= '%' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4225:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_76_in_ruleMultiplicativeOperator9831); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4235:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4237:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4238:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4238:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            int alt63=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt63=1;
                }
                break;
            case 74:
                {
                alt63=2;
                }
                break;
            case 77:
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4238:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4238:2: (enumLiteral_0= '+' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4238:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_73_in_ruleUnaryOperator9876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4244:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4244:6: (enumLiteral_1= '-' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4244:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_74_in_ruleUnaryOperator9893); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4250:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4250:6: (enumLiteral_2= '~' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4250:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_77_in_ruleUnaryOperator9910); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4260:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4262:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4263:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4263:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt64=6;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt64=1;
                }
                break;
            case 79:
                {
                alt64=2;
                }
                break;
            case 39:
                {
                alt64=3;
                }
                break;
            case 80:
                {
                alt64=4;
                }
                break;
            case 81:
                {
                alt64=5;
                }
                break;
            case 82:
                {
                alt64=6;
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4263:2: (enumLiteral_0= '<' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4263:2: (enumLiteral_0= '<' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4263:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_78_in_ruleRelationalOperator9955); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4269:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4269:6: (enumLiteral_1= '<=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4269:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_79_in_ruleRelationalOperator9972); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4275:6: (enumLiteral_2= '>' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4275:6: (enumLiteral_2= '>' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4275:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_39_in_ruleRelationalOperator9989); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4281:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4281:6: (enumLiteral_3= '>=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4281:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,80,FOLLOW_80_in_ruleRelationalOperator10006); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4287:6: (enumLiteral_4= '==' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4287:6: (enumLiteral_4= '==' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4287:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,81,FOLLOW_81_in_ruleRelationalOperator10023); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4293:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4293:6: (enumLiteral_5= '!=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4293:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,82,FOLLOW_82_in_ruleRelationalOperator10040); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4303:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4305:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4306:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4306:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            int alt65=4;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt65=1;
                }
                break;
            case 84:
                {
                alt65=2;
                }
                break;
            case 85:
                {
                alt65=3;
                }
                break;
            case 86:
                {
                alt65=4;
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4306:2: (enumLiteral_0= 's' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4306:2: (enumLiteral_0= 's' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4306:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_83_in_ruleTimeUnit10085); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4312:6: (enumLiteral_1= 'ms' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4312:6: (enumLiteral_1= 'ms' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4312:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_84_in_ruleTimeUnit10102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4318:6: (enumLiteral_2= 'us' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4318:6: (enumLiteral_2= 'us' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4318:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_85_in_ruleTimeUnit10119); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4324:6: (enumLiteral_3= 'ns' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4324:6: (enumLiteral_3= 'ns' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4324:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,86,FOLLOW_86_in_ruleTimeUnit10136); if (state.failed) return current;
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

    // $ANTLR start synpred2_InternalKidsexp
    public final void synpred2_InternalKidsexp_fragment() throws RecognitionException {   
        // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1613:6: ( '[' )
        // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1613:8: '['
        {
        match(input,36,FOLLOW_36_in_synpred2_InternalKidsexp3579); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalKidsexp

    // $ANTLR start synpred3_InternalKidsexp
    public final void synpred3_InternalKidsexp_fragment() throws RecognitionException {   
        // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1730:4: ( ';' )
        // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1730:6: ';'
        {
        match(input,38,FOLLOW_38_in_synpred3_InternalKidsexp3816); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalKidsexp

    // $ANTLR start synpred4_InternalKidsexp
    public final void synpred4_InternalKidsexp_fragment() throws RecognitionException {   
        // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3471:4: ( ( '(' ) )
        // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3472:1: ( '(' )
        {
        // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3472:1: ( '(' )
        // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3473:2: '('
        {
        match(input,28,FOLLOW_28_in_synpred4_InternalKidsexp7953); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalKidsexp

    // $ANTLR start synpred5_InternalKidsexp
    public final void synpred5_InternalKidsexp_fragment() throws RecognitionException {   
        // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3576:4: ( ( '(' ) )
        // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3577:1: ( '(' )
        {
        // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3577:1: ( '(' )
        // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3578:2: '('
        {
        match(input,28,FOLLOW_28_in_synpred5_InternalKidsexp8176); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalKidsexp

    // Delegated rules

    public final boolean synpred4_InternalKidsexp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalKidsexp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalKidsexp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalKidsexp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalKidsexp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalKidsexp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalKidsexp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalKidsexp_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_ruleDefRoot_in_ruleRoot130 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_ruleDefRoot_in_entryRuleDefRoot166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRoot176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_ruleDefRoot223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_ruleDefRoot250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_ruleDefRoot277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartRoot_in_entryRuleStatechartRoot312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartRoot322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStatechartRoot359 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_ruleStatechartRoot380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateRoot_in_entryRuleStateRoot416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateRoot426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStateRoot463 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleStateRoot484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionRoot_in_entryRuleTransitionRoot520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionRoot530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTransitionRoot567 = new BitSet(new long[]{0x18003F1C00000010L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleTransitionRoot588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_ruleTransitionSpecification679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatechartSpecification_in_entryRuleStatechartSpecification714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartSpecification724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleStatechartSpecification770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateSpecification816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleStateSpecification862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_entryRuleStateScope902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateScope912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleStateScope969 = new BitSet(new long[]{0x18003F1180000012L});
    public static final BitSet FOLLOW_ruleEntrypoint_in_ruleStateScope988 = new BitSet(new long[]{0x18003F1180000012L});
    public static final BitSet FOLLOW_ruleExitpoint_in_ruleStateScope1007 = new BitSet(new long[]{0x18003F1180000012L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope1047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartScope1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStatechartScope1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_ruleStatechartScope1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope1168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScope1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleInterfaceScope1224 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceScope1241 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInterfaceScope1259 = new BitSet(new long[]{0x1F003F1188C00010L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope1282 = new BitSet(new long[]{0x1F003F1188C00012L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope1301 = new BitSet(new long[]{0x1F003F1188C00012L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope1320 = new BitSet(new long[]{0x1F003F1188C00012L});
    public static final BitSet FOLLOW_ruleEntrypoint_in_ruleInterfaceScope1339 = new BitSet(new long[]{0x1F003F1188C00012L});
    public static final BitSet FOLLOW_ruleExitpoint_in_ruleInterfaceScope1358 = new BitSet(new long[]{0x1F003F1188C00012L});
    public static final BitSet FOLLOW_ruleInternalScope_in_entryRuleInternalScope1398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalScope1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleInternalScope1454 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInternalScope1466 = new BitSet(new long[]{0x1F003F1008C00012L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInternalScope1489 = new BitSet(new long[]{0x1F003F1008C00012L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInternalScope1508 = new BitSet(new long[]{0x1F003F1008C00012L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInternalScope1527 = new BitSet(new long[]{0x1F003F1008C00012L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleInternalScope1546 = new BitSet(new long[]{0x1F003F1008C00012L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion1588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclarartion1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition1680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDefinition1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleEventDefinition1736 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEventDefinition1749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventDefinition1766 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleEventDefinition1784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEventDefinition1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition1937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleVariableDefinition1993 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_24_in_ruleVariableDefinition2056 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_25_in_ruleVariableDefinition2141 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDefinition2211 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleVariableDefinition2228 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleVariableDefinition2251 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleVariableDefinition2264 = new BitSet(new long[]{0x00C40000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDefinition2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration2323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDeclaration2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition2415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDefinition2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOperationDefinition2471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperationDefinition2488 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleOperationDefinition2505 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition2527 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleOperationDefinition2540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition2561 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_30_in_ruleOperationDefinition2577 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleOperationDefinition2590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2703 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleParameter2720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleParameter2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntrypoint_in_entryRuleEntrypoint2779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntrypoint2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEntrypoint2835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntrypoint2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitpoint_in_entryRuleExitpoint2893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitpoint2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleExitpoint2949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExitpoint2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN3008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3059 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleFQN3078 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3093 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction3142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReaction3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReaction3198 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleLocalReaction3230 = new BitSet(new long[]{0x00C44000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalReaction3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction3289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionReaction3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleTransitionReaction3354 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_ruleTransitionReaction3368 = new BitSet(new long[]{0x00C44000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransitionReaction3389 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleTransitionReaction3404 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_ruleReactionProperties_in_ruleTransitionReaction3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger3463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionTrigger3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSpec_in_ruleReactionTrigger3530 = new BitSet(new long[]{0x0000001020000002L});
    public static final BitSet FOLLOW_29_in_ruleReactionTrigger3543 = new BitSet(new long[]{0x18003F0000000010L});
    public static final BitSet FOLLOW_ruleEventSpec_in_ruleReactionTrigger3564 = new BitSet(new long[]{0x0000001020000002L});
    public static final BitSet FOLLOW_36_in_ruleReactionTrigger3587 = new BitSet(new long[]{0x00C40000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger3609 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleReactionTrigger3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleReactionTrigger3643 = new BitSet(new long[]{0x00C40000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger3664 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleReactionTrigger3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect3714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionEffect3724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect3781 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect3800 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleReactionEffect3824 = new BitSet(new long[]{0x00C44000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionEffect3848 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_ruleReactionEffect3867 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleReactionProperties_in_entryRuleReactionProperties3908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionProperties3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionProperty_in_ruleReactionProperties3973 = new BitSet(new long[]{0x0000008000000012L});
    public static final BitSet FOLLOW_ruleReactionProperty_in_entryRuleReactionProperty4010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionProperty4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_ruleReactionProperty4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_ruleReactionProperty4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec4129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryPointSpec4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEntryPointSpec4176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEntryPointSpec4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec4235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitPointSpec4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleExitPointSpec4293 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleExitPointSpec4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSpec_in_entryRuleEventSpec4341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventSpec4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_ruleEventSpec4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_ruleEventSpec4425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_ruleEventSpec4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec4487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularEventSpec4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec4577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeEventSpec4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec4633 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeEventSpec4650 = new BitSet(new long[]{0x0000000000000002L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec4713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinEventSpec4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCycleEvent_in_ruleBuiltinEventSpec4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultEvent_in_ruleBuiltinEventSpec4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent4913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryEvent4923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleEntryEvent4969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent5005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent5015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleExitEvent5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCycleEvent_in_entryRuleOnCycleEvent5097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnCycleEvent5107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOnCycleEvent5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent5189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEvent5199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAlwaysEvent5245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultEvent_in_entryRuleDefaultEvent5281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultEvent5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDefaultEvent5338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDefaultEvent5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRaisingExpression_in_entryRuleEventRaisingExpression5393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventRaisingExpression5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleEventRaisingExpression5449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventRaisingExpression5470 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleEventRaisingExpression5483 = new BitSet(new long[]{0x00C40000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEventRaisingExpression5504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression5544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpression5600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression5634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression5691 = new BitSet(new long[]{0xE000000004000002L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression5721 = new BitSet(new long[]{0x00C40000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression5742 = new BitSet(new long[]{0xE000000004000002L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression5780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression5790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression5837 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleConditionalExpression5858 = new BitSet(new long[]{0x00C40000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression5879 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConditionalExpression5891 = new BitSet(new long[]{0x00C40000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression5912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression5950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression5960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6007 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleLogicalOrExpression6028 = new BitSet(new long[]{0x00C40000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression6049 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression6087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression6097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6144 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleLogicalAndExpression6165 = new BitSet(new long[]{0x00C40000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression6186 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression6224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNotExpression6234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression6281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleLogicalNotExpression6308 = new BitSet(new long[]{0x00C00000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression6329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression6366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression6376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression6423 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleBitwiseXorExpression6444 = new BitSet(new long[]{0x00C00000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression6465 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression6503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression6513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression6560 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleBitwiseOrExpression6581 = new BitSet(new long[]{0x00C00000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression6602 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression6640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression6650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression6697 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleBitwiseAndExpression6718 = new BitSet(new long[]{0x00C00000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression6739 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression6777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalRelationExpression6787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression6834 = new BitSet(new long[]{0x0000008000000002L,0x000000000007C000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression6864 = new BitSet(new long[]{0x00C00000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression6885 = new BitSet(new long[]{0x0000008000000002L,0x000000000007C000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression6923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression6933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression6980 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression7010 = new BitSet(new long[]{0x00C00000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression7031 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression7069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression7079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7126 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression7156 = new BitSet(new long[]{0x00C00000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression7177 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression7215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression7225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression7272 = new BitSet(new long[]{0x0000000400000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression7302 = new BitSet(new long[]{0x00C00000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression7323 = new BitSet(new long[]{0x0000000400000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression7361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalUnaryExpression7371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression7418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression7454 = new BitSet(new long[]{0x00C00000100003F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression7475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression7512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression7522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression7569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression7596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression7623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression7650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePrimaryExpression7668 = new BitSet(new long[]{0x00C40000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression7690 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePrimaryExpression7701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression7738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValueExpression7748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression7803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall7839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall7849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall7896 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleFeatureCall7917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureCall7937 = new BitSet(new long[]{0x0000000210000002L});
    public static final BitSet FOLLOW_28_in_ruleFeatureCall7971 = new BitSet(new long[]{0x00C40000500003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8006 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleFeatureCall8019 = new BitSet(new long[]{0x00C40000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall8040 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_30_in_ruleFeatureCall8056 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression8096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementReferenceExpression8106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementReferenceExpression8160 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleElementReferenceExpression8194 = new BitSet(new long[]{0x00C40000500003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8229 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleElementReferenceExpression8242 = new BitSet(new long[]{0x00C40000100003F0L,0x0000000000002600L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression8263 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_30_in_ruleElementReferenceExpression8279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression8317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventValueReferenceExpression8327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleEventValueReferenceExpression8373 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEventValueReferenceExpression8385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression8406 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleEventValueReferenceExpression8418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression8454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression8464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleActiveStateReferenceExpression8510 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleActiveStateReferenceExpression8522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression8545 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleActiveStateReferenceExpression8557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral8593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral8603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral8650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral8677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_ruleLiteral8704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleLiteral8731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral8758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral8793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral8803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral8854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral8895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral8905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral8956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral8997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral9007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRealLiteral9058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral9099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexLiteral9109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleHexLiteral9160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral9262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleDirection9317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleDirection9334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleDirection9351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTimeEventType9396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleTimeEventType9413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAssignmentOperator9458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleAssignmentOperator9475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleAssignmentOperator9492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleAssignmentOperator9509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleAssignmentOperator9526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleAssignmentOperator9543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleAssignmentOperator9560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleAssignmentOperator9577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleAssignmentOperator9594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleAssignmentOperator9611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleAssignmentOperator9628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleShiftOperator9673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleShiftOperator9690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleAdditiveOperator9735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleAdditiveOperator9752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleMultiplicativeOperator9797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleMultiplicativeOperator9814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleMultiplicativeOperator9831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleUnaryOperator9876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleUnaryOperator9893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleUnaryOperator9910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleRelationalOperator9955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleRelationalOperator9972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleRelationalOperator9989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleRelationalOperator10006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleRelationalOperator10023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleRelationalOperator10040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleTimeUnit10085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleTimeUnit10102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleTimeUnit10119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleTimeUnit10136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred2_InternalKidsexp3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred3_InternalKidsexp3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred4_InternalKidsexp7953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred5_InternalKidsexp8176 = new BitSet(new long[]{0x0000000000000002L});

}
