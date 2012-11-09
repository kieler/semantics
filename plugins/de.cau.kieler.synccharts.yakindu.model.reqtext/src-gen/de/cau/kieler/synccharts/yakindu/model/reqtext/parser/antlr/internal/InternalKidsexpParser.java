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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_FLOAT", "RULE_HEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@@statechart@@'", "'@@state@@'", "'@@transition@@'", "'statechart'", "'state'", "'/'", "'trigger'", "'effect'", "'interface'", "':'", "'internal'", "'event'", "'var'", "'readonly'", "'external'", "'='", "'operation'", "'('", "','", "')'", "'entrypoint'", "'exitpoint'", "'.'", "'['", "']'", "'>'", "'entry'", "'exit'", "'oncycle'", "'always'", "'default'", "'else'", "'?'", "'||'", "'&&'", "'!'", "'^'", "'|'", "'&'", "'valueof'", "'active'", "'local'", "'in'", "'out'", "'after'", "'every'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'%'", "'~'", "'<'", "'<='", "'>='", "'=='", "'!='", "'s'", "'ms'", "'us'", "'ns'"
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


    // $ANTLR start "entryRuleTransitionReaction"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:387:1: entryRuleTransitionReaction returns [EObject current=null] : iv_ruleTransitionReaction= ruleTransitionReaction EOF ;
    public final EObject entryRuleTransitionReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionReaction = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:388:2: (iv_ruleTransitionReaction= ruleTransitionReaction EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:389:2: iv_ruleTransitionReaction= ruleTransitionReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionReactionRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction898);
            iv_ruleTransitionReaction=ruleTransitionReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionReaction908); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:396:1: ruleTransitionReaction returns [EObject current=null] : ( () ( (lv_trigger_1_0= ruleMyTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? ) ;
    public final EObject ruleTransitionReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_effect_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:399:28: ( ( () ( (lv_trigger_1_0= ruleMyTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:400:1: ( () ( (lv_trigger_1_0= ruleMyTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:400:1: ( () ( (lv_trigger_1_0= ruleMyTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )? )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:400:2: () ( (lv_trigger_1_0= ruleMyTrigger ) )? (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:400:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:401:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionReactionAccess().getTransitionReactionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:406:2: ( (lv_trigger_1_0= ruleMyTrigger ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:407:1: (lv_trigger_1_0= ruleMyTrigger )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:407:1: (lv_trigger_1_0= ruleMyTrigger )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:408:3: lv_trigger_1_0= ruleMyTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getTriggerMyTriggerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMyTrigger_in_ruleTransitionReaction963);
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

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:424:3: (otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:424:5: otherlv_2= '/' ( (lv_effect_3_0= ruleReactionEffect ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleTransitionReaction977); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionReactionAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:428:1: ( (lv_effect_3_0= ruleReactionEffect ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:429:1: (lv_effect_3_0= ruleReactionEffect )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:429:1: (lv_effect_3_0= ruleReactionEffect )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:430:3: lv_effect_3_0= ruleReactionEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionReactionAccess().getEffectReactionEffectParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReactionEffect_in_ruleTransitionReaction998);
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


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:454:1: entryRuleMyTrigger returns [EObject current=null] : iv_ruleMyTrigger= ruleMyTrigger EOF ;
    public final EObject entryRuleMyTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyTrigger = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:455:2: (iv_ruleMyTrigger= ruleMyTrigger EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:456:2: iv_ruleMyTrigger= ruleMyTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMyTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleMyTrigger_in_entryRuleMyTrigger1036);
            iv_ruleMyTrigger=ruleMyTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMyTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMyTrigger1046); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:463:1: ruleMyTrigger returns [EObject current=null] : ( () otherlv_1= 'trigger' ) ;
    public final EObject ruleMyTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:466:28: ( ( () otherlv_1= 'trigger' ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:467:1: ( () otherlv_1= 'trigger' )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:467:1: ( () otherlv_1= 'trigger' )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:467:2: () otherlv_1= 'trigger'
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:467:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:468:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMyTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleMyTrigger1092); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMyTriggerAccess().getTriggerKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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


    // $ANTLR start "entryRuleReactionEffect"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:485:1: entryRuleReactionEffect returns [EObject current=null] : iv_ruleReactionEffect= ruleReactionEffect EOF ;
    public final EObject entryRuleReactionEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionEffect = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:486:2: (iv_ruleReactionEffect= ruleReactionEffect EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:487:2: iv_ruleReactionEffect= ruleReactionEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionEffectRule()); 
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect1128);
            iv_ruleReactionEffect=ruleReactionEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionEffect1138); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:494:1: ruleReactionEffect returns [EObject current=null] : ( () otherlv_1= 'effect' ) ;
    public final EObject ruleReactionEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:497:28: ( ( () otherlv_1= 'effect' ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:498:1: ( () otherlv_1= 'effect' )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:498:1: ( () otherlv_1= 'effect' )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:498:2: () otherlv_1= 'effect'
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:498:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:499:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionEffectAccess().getReactionEffectAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleReactionEffect1184); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReactionEffectAccess().getEffectKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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


    // $ANTLR start "entryRuleStateScope"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:520:1: entryRuleStateScope returns [EObject current=null] : iv_ruleStateScope= ruleStateScope EOF ;
    public final EObject entryRuleStateScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateScope = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:521:2: (iv_ruleStateScope= ruleStateScope EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:522:2: iv_ruleStateScope= ruleStateScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStateScope_in_entryRuleStateScope1224);
            iv_ruleStateScope=ruleStateScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateScope1234); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:529:1: ruleStateScope returns [EObject current=null] : ( () ( ( (lv_declarations_1_1= ruleLocalReaction | lv_declarations_1_2= ruleEntrypoint | lv_declarations_1_3= ruleExitpoint ) ) )* ) ;
    public final EObject ruleStateScope() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_1_1 = null;

        EObject lv_declarations_1_2 = null;

        EObject lv_declarations_1_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:532:28: ( ( () ( ( (lv_declarations_1_1= ruleLocalReaction | lv_declarations_1_2= ruleEntrypoint | lv_declarations_1_3= ruleExitpoint ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:533:1: ( () ( ( (lv_declarations_1_1= ruleLocalReaction | lv_declarations_1_2= ruleEntrypoint | lv_declarations_1_3= ruleExitpoint ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:533:1: ( () ( ( (lv_declarations_1_1= ruleLocalReaction | lv_declarations_1_2= ruleEntrypoint | lv_declarations_1_3= ruleExitpoint ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:533:2: () ( ( (lv_declarations_1_1= ruleLocalReaction | lv_declarations_1_2= ruleEntrypoint | lv_declarations_1_3= ruleExitpoint ) ) )*
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:533:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:534:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStateScopeAccess().getSimpleScopeAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:539:2: ( ( (lv_declarations_1_1= ruleLocalReaction | lv_declarations_1_2= ruleEntrypoint | lv_declarations_1_3= ruleExitpoint ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=34 && LA6_0<=35)||LA6_0==37||(LA6_0>=40 && LA6_0<=45)||(LA6_0>=58 && LA6_0<=59)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:540:1: ( (lv_declarations_1_1= ruleLocalReaction | lv_declarations_1_2= ruleEntrypoint | lv_declarations_1_3= ruleExitpoint ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:540:1: ( (lv_declarations_1_1= ruleLocalReaction | lv_declarations_1_2= ruleEntrypoint | lv_declarations_1_3= ruleExitpoint ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:541:1: (lv_declarations_1_1= ruleLocalReaction | lv_declarations_1_2= ruleEntrypoint | lv_declarations_1_3= ruleExitpoint )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:541:1: (lv_declarations_1_1= ruleLocalReaction | lv_declarations_1_2= ruleEntrypoint | lv_declarations_1_3= ruleExitpoint )
            	    int alt5=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	    case 37:
            	    case 40:
            	    case 41:
            	    case 42:
            	    case 43:
            	    case 44:
            	    case 45:
            	    case 58:
            	    case 59:
            	        {
            	        alt5=1;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt5=2;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt5=3;
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
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:542:3: lv_declarations_1_1= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsLocalReactionParserRuleCall_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleStateScope1291);
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
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:557:8: lv_declarations_1_2= ruleEntrypoint
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsEntrypointParserRuleCall_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEntrypoint_in_ruleStateScope1310);
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
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:572:8: lv_declarations_1_3= ruleExitpoint
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getStateScopeAccess().getDeclarationsExitpointParserRuleCall_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExitpoint_in_ruleStateScope1329);
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
            	    break loop6;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:598:1: entryRuleStatechartScope returns [EObject current=null] : iv_ruleStatechartScope= ruleStatechartScope EOF ;
    public final EObject entryRuleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartScope = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:599:2: (iv_ruleStatechartScope= ruleStatechartScope EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:600:2: iv_ruleStatechartScope= ruleStatechartScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatechartScopeRule()); 
            }
            pushFollow(FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope1369);
            iv_ruleStatechartScope=ruleStatechartScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatechartScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatechartScope1379); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:607:1: ruleStatechartScope returns [EObject current=null] : (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) ;
    public final EObject ruleStatechartScope() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceScope_0 = null;

        EObject this_InternalScope_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:610:28: ( (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:611:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:611:1: (this_InterfaceScope_0= ruleInterfaceScope | this_InternalScope_1= ruleInternalScope )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:612:5: this_InterfaceScope_0= ruleInterfaceScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInterfaceScopeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceScope_in_ruleStatechartScope1426);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:622:5: this_InternalScope_1= ruleInternalScope
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatechartScopeAccess().getInternalScopeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInternalScope_in_ruleStatechartScope1453);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:640:1: entryRuleInterfaceScope returns [EObject current=null] : iv_ruleInterfaceScope= ruleInterfaceScope EOF ;
    public final EObject entryRuleInterfaceScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceScope = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:641:2: (iv_ruleInterfaceScope= ruleInterfaceScope EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:642:2: iv_ruleInterfaceScope= ruleInterfaceScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope1490);
            iv_ruleInterfaceScope=ruleInterfaceScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceScope1500); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:649:1: ruleInterfaceScope returns [EObject current=null] : ( () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )* ) ;
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
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:652:28: ( ( () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:653:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:653:1: ( () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:653:2: () otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )*
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:653:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:654:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInterfaceScopeAccess().getInterfaceScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleInterfaceScope1546); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceScopeAccess().getInterfaceKeyword_1());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:663:1: ( (lv_name_2_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:664:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:664:1: (lv_name_2_0= RULE_ID )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:665:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceScope1563); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleInterfaceScope1581); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInterfaceScopeAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:685:1: ( ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=25 && LA10_0<=26)||LA10_0==30||(LA10_0>=34 && LA10_0<=35)||(LA10_0>=55 && LA10_0<=57)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:686:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:686:1: ( (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:687:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:687:1: (lv_declarations_4_1= ruleEventDeclarartion | lv_declarations_4_2= ruleVariableDeclaration | lv_declarations_4_3= ruleOperationDeclaration | lv_declarations_4_4= ruleEntrypoint | lv_declarations_4_5= ruleExitpoint )
            	    int alt9=5;
            	    switch ( input.LA(1) ) {
            	    case 25:
            	    case 55:
            	    case 56:
            	    case 57:
            	        {
            	        alt9=1;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt9=2;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt9=3;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt9=4;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt9=5;
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
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:688:3: lv_declarations_4_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope1604);
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
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:703:8: lv_declarations_4_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope1623);
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
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:718:8: lv_declarations_4_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_4_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope1642);
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
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:733:8: lv_declarations_4_4= ruleEntrypoint
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsEntrypointParserRuleCall_4_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEntrypoint_in_ruleInterfaceScope1661);
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
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:748:8: lv_declarations_4_5= ruleExitpoint
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInterfaceScopeAccess().getDeclarationsExitpointParserRuleCall_4_0_4()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExitpoint_in_ruleInterfaceScope1680);
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
    // $ANTLR end "ruleInterfaceScope"


    // $ANTLR start "entryRuleInternalScope"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:774:1: entryRuleInternalScope returns [EObject current=null] : iv_ruleInternalScope= ruleInternalScope EOF ;
    public final EObject entryRuleInternalScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalScope = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:775:2: (iv_ruleInternalScope= ruleInternalScope EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:776:2: iv_ruleInternalScope= ruleInternalScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalScopeRule()); 
            }
            pushFollow(FOLLOW_ruleInternalScope_in_entryRuleInternalScope1720);
            iv_ruleInternalScope=ruleInternalScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInternalScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalScope1730); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:783:1: ruleInternalScope returns [EObject current=null] : ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) ;
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
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:786:28: ( ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:787:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:787:1: ( () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:787:2: () otherlv_1= 'internal' otherlv_2= ':' ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:787:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:788:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInternalScopeAccess().getInternalScopeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleInternalScope1776); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInternalScopeAccess().getInternalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleInternalScope1788); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInternalScopeAccess().getColonKeyword_2());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:801:1: ( ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=25 && LA12_0<=26)||LA12_0==30||LA12_0==37||(LA12_0>=40 && LA12_0<=45)||(LA12_0>=55 && LA12_0<=59)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:802:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:802:1: ( (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:803:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:803:1: (lv_declarations_3_1= ruleEventDeclarartion | lv_declarations_3_2= ruleVariableDeclaration | lv_declarations_3_3= ruleOperationDeclaration | lv_declarations_3_4= ruleLocalReaction )
            	    int alt11=4;
            	    switch ( input.LA(1) ) {
            	    case 25:
            	    case 55:
            	    case 56:
            	    case 57:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt11=3;
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
            	    case 58:
            	    case 59:
            	        {
            	        alt11=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:804:3: lv_declarations_3_1= ruleEventDeclarartion
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsEventDeclarartionParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEventDeclarartion_in_ruleInternalScope1811);
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
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:819:8: lv_declarations_3_2= ruleVariableDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsVariableDeclarationParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInternalScope1830);
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
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:834:8: lv_declarations_3_3= ruleOperationDeclaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsOperationDeclarationParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOperationDeclaration_in_ruleInternalScope1849);
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
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:849:8: lv_declarations_3_4= ruleLocalReaction
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getInternalScopeAccess().getDeclarationsLocalReactionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLocalReaction_in_ruleInternalScope1868);
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
    // $ANTLR end "ruleInternalScope"


    // $ANTLR start "entryRuleEventDeclarartion"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:877:1: entryRuleEventDeclarartion returns [EObject current=null] : iv_ruleEventDeclarartion= ruleEventDeclarartion EOF ;
    public final EObject entryRuleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclarartion = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:878:2: (iv_ruleEventDeclarartion= ruleEventDeclarartion EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:879:2: iv_ruleEventDeclarartion= ruleEventDeclarartion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarartionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion1910);
            iv_ruleEventDeclarartion=ruleEventDeclarartion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclarartion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclarartion1920); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:886:1: ruleEventDeclarartion returns [EObject current=null] : this_EventDefinition_0= ruleEventDefinition ;
    public final EObject ruleEventDeclarartion() throws RecognitionException {
        EObject current = null;

        EObject this_EventDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:889:28: (this_EventDefinition_0= ruleEventDefinition )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:891:5: this_EventDefinition_0= ruleEventDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEventDeclarartionAccess().getEventDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion1966);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:909:1: entryRuleEventDefinition returns [EObject current=null] : iv_ruleEventDefinition= ruleEventDefinition EOF ;
    public final EObject entryRuleEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDefinition = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:910:2: (iv_ruleEventDefinition= ruleEventDefinition EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:911:2: iv_ruleEventDefinition= ruleEventDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition2002);
            iv_ruleEventDefinition=ruleEventDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDefinition2012); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:918:1: ruleEventDefinition returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:921:28: ( ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:922:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:922:1: ( ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:922:2: ( (lv_direction_0_0= ruleDirection ) )? otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:922:2: ( (lv_direction_0_0= ruleDirection ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=55 && LA13_0<=57)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:923:1: (lv_direction_0_0= ruleDirection )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:923:1: (lv_direction_0_0= ruleDirection )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:924:3: lv_direction_0_0= ruleDirection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getDirectionDirectionEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDirection_in_ruleEventDefinition2058);
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

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleEventDefinition2071); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDefinitionAccess().getEventKeyword_1());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:944:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:945:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:945:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:946:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventDefinition2088); if (state.failed) return current;
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

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:962:2: (otherlv_3= ':' ( ( ruleFQN ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:962:4: otherlv_3= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleEventDefinition2106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDefinitionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:966:1: ( ( ruleFQN ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:967:1: ( ruleFQN )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:967:1: ( ruleFQN )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:968:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEventDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDefinitionAccess().getTypeTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleEventDefinition2129);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:989:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:990:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:991:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2167);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration2177); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:998:1: ruleVariableDeclaration returns [EObject current=null] : this_VariableDefinition_0= ruleVariableDefinition ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1001:28: (this_VariableDefinition_0= ruleVariableDefinition )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1003:5: this_VariableDefinition_0= ruleVariableDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration2223);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1021:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1022:2: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1023:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition2259);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDefinition2269); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1030:1: ruleVariableDefinition returns [EObject current=null] : ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? ) ;
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
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1033:28: ( ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1034:1: ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1034:1: ( () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )? )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1034:2: () otherlv_1= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( ( ruleFQN ) ) (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )?
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1034:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1035:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDefinitionAccess().getVariableDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleVariableDefinition2315); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableDefinitionAccess().getVarKeyword_1());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1044:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1046:1: ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1046:1: ( ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1047:2: ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1050:2: ( ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1051:3: ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )*
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1051:3: ( ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( LA15_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1053:4: ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1053:4: ({...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1054:5: {...}? => ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1054:115: ( ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1055:6: ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 0);
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1058:6: ({...}? => ( (lv_readonly_3_0= 'readonly' ) ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1058:7: {...}? => ( (lv_readonly_3_0= 'readonly' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "true");
            	    }
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1058:16: ( (lv_readonly_3_0= 'readonly' ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1059:1: (lv_readonly_3_0= 'readonly' )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1059:1: (lv_readonly_3_0= 'readonly' )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1060:3: lv_readonly_3_0= 'readonly'
            	    {
            	    lv_readonly_3_0=(Token)match(input,27,FOLLOW_27_in_ruleVariableDefinition2378); if (state.failed) return current;
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
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1080:4: ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1080:4: ({...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1081:5: {...}? => ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1081:115: ( ({...}? => ( (lv_external_4_0= 'external' ) ) ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1082:6: ({...}? => ( (lv_external_4_0= 'external' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), 1);
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1085:6: ({...}? => ( (lv_external_4_0= 'external' ) ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1085:7: {...}? => ( (lv_external_4_0= 'external' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVariableDefinition", "true");
            	    }
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1085:16: ( (lv_external_4_0= 'external' ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1086:1: (lv_external_4_0= 'external' )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1086:1: (lv_external_4_0= 'external' )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1087:3: lv_external_4_0= 'external'
            	    {
            	    lv_external_4_0=(Token)match(input,28,FOLLOW_28_in_ruleVariableDefinition2463); if (state.failed) return current;
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
            	    break loop15;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2());

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1114:2: ( (lv_name_5_0= RULE_ID ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1115:1: (lv_name_5_0= RULE_ID )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1115:1: (lv_name_5_0= RULE_ID )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1116:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDefinition2533); if (state.failed) return current;
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

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleVariableDefinition2550); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionAccess().getColonKeyword_4());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1136:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1137:1: ( ruleFQN )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1137:1: ( ruleFQN )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1138:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getTypeTypeCrossReference_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleVariableDefinition2573);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1151:2: (otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1151:4: otherlv_8= '=' ( (lv_initialValue_9_0= ruleExpression ) )
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleVariableDefinition2586); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getVariableDefinitionAccess().getEqualsSignKeyword_6_0());
                          
                    }
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1155:1: ( (lv_initialValue_9_0= ruleExpression ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1156:1: (lv_initialValue_9_0= ruleExpression )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1156:1: (lv_initialValue_9_0= ruleExpression )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1157:3: lv_initialValue_9_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDefinitionAccess().getInitialValueExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVariableDefinition2607);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1181:1: entryRuleOperationDeclaration returns [EObject current=null] : iv_ruleOperationDeclaration= ruleOperationDeclaration EOF ;
    public final EObject entryRuleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDeclaration = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1182:2: (iv_ruleOperationDeclaration= ruleOperationDeclaration EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1183:2: iv_ruleOperationDeclaration= ruleOperationDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration2645);
            iv_ruleOperationDeclaration=ruleOperationDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDeclaration2655); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1190:1: ruleOperationDeclaration returns [EObject current=null] : this_OperationDefinition_0= ruleOperationDefinition ;
    public final EObject ruleOperationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1193:28: (this_OperationDefinition_0= ruleOperationDefinition )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1195:5: this_OperationDefinition_0= ruleOperationDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationDeclarationAccess().getOperationDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration2701);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1213:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1214:2: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1215:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition2737);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationDefinition2747); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1222:1: ruleOperationDefinition returns [EObject current=null] : ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) ;
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
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1225:28: ( ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1226:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1226:1: ( () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )? )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1226:2: () otherlv_1= 'operation' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= ')' (otherlv_8= ':' ( ( ruleFQN ) ) )?
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1226:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1227:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationDefinitionAccess().getOperationDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleOperationDefinition2793); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationDefinitionAccess().getOperationKeyword_1());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1236:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1237:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1237:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1238:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperationDefinition2810); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleOperationDefinition2827); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1258:1: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1258:2: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1258:2: ( (lv_parameters_4_0= ruleParameter ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1259:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1259:1: (lv_parameters_4_0= ruleParameter )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1260:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition2849);
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

                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1276:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==32) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1276:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleOperationDefinition2862); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getOperationDefinitionAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1280:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1281:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1281:1: (lv_parameters_6_0= ruleParameter )
                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1282:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleOperationDefinition2883);
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
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleOperationDefinition2899); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1302:1: (otherlv_8= ':' ( ( ruleFQN ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1302:3: otherlv_8= ':' ( ( ruleFQN ) )
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleOperationDefinition2912); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getOperationDefinitionAccess().getColonKeyword_6_0());
                          
                    }
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1306:1: ( ( ruleFQN ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1307:1: ( ruleFQN )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1307:1: ( ruleFQN )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1308:3: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationDefinitionAccess().getTypeTypeCrossReference_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFQN_in_ruleOperationDefinition2935);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1329:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1330:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1331:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter2973);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2983); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1338:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1341:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1342:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1342:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1342:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1342:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1343:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1343:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1344:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter3025); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleParameter3042); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1364:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1365:1: ( ruleFQN )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1365:1: ( ruleFQN )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1366:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleParameter3065);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1387:1: entryRuleEntrypoint returns [EObject current=null] : iv_ruleEntrypoint= ruleEntrypoint EOF ;
    public final EObject entryRuleEntrypoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntrypoint = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1388:2: (iv_ruleEntrypoint= ruleEntrypoint EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1389:2: iv_ruleEntrypoint= ruleEntrypoint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntrypointRule()); 
            }
            pushFollow(FOLLOW_ruleEntrypoint_in_entryRuleEntrypoint3101);
            iv_ruleEntrypoint=ruleEntrypoint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntrypoint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntrypoint3111); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1396:1: ruleEntrypoint returns [EObject current=null] : ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleEntrypoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1399:28: ( ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1400:1: ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1400:1: ( () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1400:2: () otherlv_1= 'entrypoint' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1400:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1401:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntrypointAccess().getEntrypointAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleEntrypoint3157); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntrypointAccess().getEntrypointKeyword_1());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1410:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1411:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1411:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1412:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntrypoint3174); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1436:1: entryRuleExitpoint returns [EObject current=null] : iv_ruleExitpoint= ruleExitpoint EOF ;
    public final EObject entryRuleExitpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitpoint = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1437:2: (iv_ruleExitpoint= ruleExitpoint EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1438:2: iv_ruleExitpoint= ruleExitpoint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitpointRule()); 
            }
            pushFollow(FOLLOW_ruleExitpoint_in_entryRuleExitpoint3215);
            iv_ruleExitpoint=ruleExitpoint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitpoint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitpoint3225); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1445:1: ruleExitpoint returns [EObject current=null] : ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleExitpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1448:28: ( ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1449:1: ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1449:1: ( () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1449:2: () otherlv_1= 'exitpoint' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1449:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1450:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitpointAccess().getExitpointAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleExitpoint3271); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitpointAccess().getExitpointKeyword_1());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1459:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1460:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1460:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1461:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExitpoint3288); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1485:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1486:2: (iv_ruleFQN= ruleFQN EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1487:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN3330);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN3341); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1494:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1497:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1498:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1498:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1498:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3381); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1505:1: (kw= '.' this_ID_2= RULE_ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==36) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1506:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,36,FOLLOW_36_in_ruleFQN3400); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3415); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleLocalReaction"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1528:1: entryRuleLocalReaction returns [EObject current=null] : iv_ruleLocalReaction= ruleLocalReaction EOF ;
    public final EObject entryRuleLocalReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalReaction = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1529:2: (iv_ruleLocalReaction= ruleLocalReaction EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1530:2: iv_ruleLocalReaction= ruleLocalReaction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalReactionRule()); 
            }
            pushFollow(FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction3464);
            iv_ruleLocalReaction=ruleLocalReaction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalReaction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalReaction3474); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1537:1: ruleLocalReaction returns [EObject current=null] : ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) ;
    public final EObject ruleLocalReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_trigger_0_0 = null;

        EObject lv_effect_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1540:28: ( ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1541:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1541:1: ( ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1541:2: ( (lv_trigger_0_0= ruleReactionTrigger ) ) ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1541:2: ( (lv_trigger_0_0= ruleReactionTrigger ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1542:1: (lv_trigger_0_0= ruleReactionTrigger )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1542:1: (lv_trigger_0_0= ruleReactionTrigger )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1543:3: lv_trigger_0_0= ruleReactionTrigger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getTriggerReactionTriggerParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_ruleLocalReaction3520);
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

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1559:2: ( ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1559:3: ( ( '/' ( ( ruleReactionEffect ) ) ) )=> (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1564:6: (otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1564:8: otherlv_1= '/' ( (lv_effect_2_0= ruleReactionEffect ) )
            {
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleLocalReaction3552); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalReactionAccess().getSolidusKeyword_1_0_0());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1568:1: ( (lv_effect_2_0= ruleReactionEffect ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1569:1: (lv_effect_2_0= ruleReactionEffect )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1569:1: (lv_effect_2_0= ruleReactionEffect )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1570:3: lv_effect_2_0= ruleReactionEffect
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalReactionAccess().getEffectReactionEffectParserRuleCall_1_0_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReactionEffect_in_ruleLocalReaction3573);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1594:1: entryRuleReactionTrigger returns [EObject current=null] : iv_ruleReactionTrigger= ruleReactionTrigger EOF ;
    public final EObject entryRuleReactionTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionTrigger = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1595:2: (iv_ruleReactionTrigger= ruleReactionTrigger EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1596:2: iv_ruleReactionTrigger= ruleReactionTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger3611);
            iv_ruleReactionTrigger=ruleReactionTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionTrigger3621); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1603:1: ruleReactionTrigger returns [EObject current=null] : ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ) ;
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
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1606:28: ( ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1607:1: ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1607:1: ( () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1607:2: () ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1607:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1608:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReactionTriggerAccess().getReactionTriggerAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1613:2: ( ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? ) | (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||(LA23_0>=40 && LA23_0<=45)||(LA23_0>=58 && LA23_0<=59)) ) {
                alt23=1;
            }
            else if ( (LA23_0==37) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1613:3: ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1613:3: ( ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )? )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1613:4: ( (lv_triggers_1_0= ruleEventSpec ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )* ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )?
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1613:4: ( (lv_triggers_1_0= ruleEventSpec ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1614:1: (lv_triggers_1_0= ruleEventSpec )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1614:1: (lv_triggers_1_0= ruleEventSpec )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1615:3: lv_triggers_1_0= ruleEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEventSpec_in_ruleReactionTrigger3678);
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

                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1631:2: (otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==32) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1631:4: otherlv_2= ',' ( (lv_triggers_3_0= ruleEventSpec ) )
                    	    {
                    	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleReactionTrigger3691); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getReactionTriggerAccess().getCommaKeyword_1_0_1_0());
                    	          
                    	    }
                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1635:1: ( (lv_triggers_3_0= ruleEventSpec ) )
                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1636:1: (lv_triggers_3_0= ruleEventSpec )
                    	    {
                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1636:1: (lv_triggers_3_0= ruleEventSpec )
                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1637:3: lv_triggers_3_0= ruleEventSpec
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getTriggersEventSpecParserRuleCall_1_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEventSpec_in_ruleReactionTrigger3712);
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
                    	    break loop21;
                        }
                    } while (true);

                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1653:4: ( ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==37) && (synpred2_InternalKidsexp())) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1653:5: ( ( '[' )=>otherlv_4= '[' ) ( (lv_guardExpression_5_0= ruleExpression ) ) otherlv_6= ']'
                            {
                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1653:5: ( ( '[' )=>otherlv_4= '[' )
                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1653:6: ( '[' )=>otherlv_4= '['
                            {
                            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleReactionTrigger3735); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_1_0_2_0());
                                  
                            }

                            }

                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1658:2: ( (lv_guardExpression_5_0= ruleExpression ) )
                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1659:1: (lv_guardExpression_5_0= ruleExpression )
                            {
                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1659:1: (lv_guardExpression_5_0= ruleExpression )
                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1660:3: lv_guardExpression_5_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_1_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger3757);
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

                            otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleReactionTrigger3769); if (state.failed) return current;
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1681:6: (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1681:6: (otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1681:8: otherlv_7= '[' ( (lv_guardExpression_8_0= ruleExpression ) ) otherlv_9= ']'
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_37_in_ruleReactionTrigger3791); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getReactionTriggerAccess().getLeftSquareBracketKeyword_1_1_0());
                          
                    }
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1685:1: ( (lv_guardExpression_8_0= ruleExpression ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1686:1: (lv_guardExpression_8_0= ruleExpression )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1686:1: (lv_guardExpression_8_0= ruleExpression )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1687:3: lv_guardExpression_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReactionTriggerAccess().getGuardExpressionExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReactionTrigger3812);
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

                    otherlv_9=(Token)match(input,38,FOLLOW_38_in_ruleReactionTrigger3824); if (state.failed) return current;
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


    // $ANTLR start "entryRuleReactionProperty"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1717:1: entryRuleReactionProperty returns [EObject current=null] : iv_ruleReactionProperty= ruleReactionProperty EOF ;
    public final EObject entryRuleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactionProperty = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1718:2: (iv_ruleReactionProperty= ruleReactionProperty EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1719:2: iv_ruleReactionProperty= ruleReactionProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReactionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReactionProperty_in_entryRuleReactionProperty3864);
            iv_ruleReactionProperty=ruleReactionProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReactionProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReactionProperty3874); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1726:1: ruleReactionProperty returns [EObject current=null] : (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) ;
    public final EObject ruleReactionProperty() throws RecognitionException {
        EObject current = null;

        EObject this_EntryPointSpec_0 = null;

        EObject this_ExitPointSpec_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1729:28: ( (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1730:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1730:1: (this_EntryPointSpec_0= ruleEntryPointSpec | this_ExitPointSpec_1= ruleExitPointSpec )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID) ) {
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1731:5: this_EntryPointSpec_0= ruleEntryPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReactionPropertyAccess().getEntryPointSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryPointSpec_in_ruleReactionProperty3921);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1741:5: this_ExitPointSpec_1= ruleExitPointSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getReactionPropertyAccess().getExitPointSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitPointSpec_in_ruleReactionProperty3948);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1757:1: entryRuleEntryPointSpec returns [EObject current=null] : iv_ruleEntryPointSpec= ruleEntryPointSpec EOF ;
    public final EObject entryRuleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryPointSpec = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1758:2: (iv_ruleEntryPointSpec= ruleEntryPointSpec EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1759:2: iv_ruleEntryPointSpec= ruleEntryPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec3983);
            iv_ruleEntryPointSpec=ruleEntryPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryPointSpec3993); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1766:1: ruleEntryPointSpec returns [EObject current=null] : (otherlv_0= '>' ( ( ruleFQN ) ) ) ;
    public final EObject ruleEntryPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1769:28: ( (otherlv_0= '>' ( ( ruleFQN ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1770:1: (otherlv_0= '>' ( ( ruleFQN ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1770:1: (otherlv_0= '>' ( ( ruleFQN ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1770:3: otherlv_0= '>' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleEntryPointSpec4030); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntryPointSpecAccess().getGreaterThanSignKeyword_0());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1774:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1775:1: ( ruleFQN )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1775:1: ( ruleFQN )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1776:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEntryPointSpecRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntryPointSpecAccess().getEntrypointEntrypointCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleEntryPointSpec4053);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1797:1: entryRuleExitPointSpec returns [EObject current=null] : iv_ruleExitPointSpec= ruleExitPointSpec EOF ;
    public final EObject entryRuleExitPointSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitPointSpec = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1798:2: (iv_ruleExitPointSpec= ruleExitPointSpec EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1799:2: iv_ruleExitPointSpec= ruleExitPointSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitPointSpecRule()); 
            }
            pushFollow(FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec4089);
            iv_ruleExitPointSpec=ruleExitPointSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitPointSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitPointSpec4099); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1806:1: ruleExitPointSpec returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= '>' ) ;
    public final EObject ruleExitPointSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1809:28: ( ( ( ( ruleFQN ) ) otherlv_1= '>' ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1810:1: ( ( ( ruleFQN ) ) otherlv_1= '>' )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1810:1: ( ( ( ruleFQN ) ) otherlv_1= '>' )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1810:2: ( ( ruleFQN ) ) otherlv_1= '>'
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1810:2: ( ( ruleFQN ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1811:1: ( ruleFQN )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1811:1: ( ruleFQN )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1812:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getExitPointSpecRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExitPointSpecAccess().getExitpointExitpointCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleExitPointSpec4147);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleExitPointSpec4159); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1837:1: entryRuleEventSpec returns [EObject current=null] : iv_ruleEventSpec= ruleEventSpec EOF ;
    public final EObject entryRuleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSpec = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1838:2: (iv_ruleEventSpec= ruleEventSpec EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1839:2: iv_ruleEventSpec= ruleEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleEventSpec_in_entryRuleEventSpec4195);
            iv_ruleEventSpec=ruleEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventSpec4205); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1846:1: ruleEventSpec returns [EObject current=null] : (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) ;
    public final EObject ruleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_RegularEventSpec_0 = null;

        EObject this_TimeEventSpec_1 = null;

        EObject this_BuiltinEventSpec_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1849:28: ( (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1850:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1850:1: (this_RegularEventSpec_0= ruleRegularEventSpec | this_TimeEventSpec_1= ruleTimeEventSpec | this_BuiltinEventSpec_2= ruleBuiltinEventSpec )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt25=1;
                }
                break;
            case 58:
            case 59:
                {
                alt25=2;
                }
                break;
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1851:5: this_RegularEventSpec_0= ruleRegularEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getRegularEventSpecParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRegularEventSpec_in_ruleEventSpec4252);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1861:5: this_TimeEventSpec_1= ruleTimeEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getTimeEventSpecParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTimeEventSpec_in_ruleEventSpec4279);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1871:5: this_BuiltinEventSpec_2= ruleBuiltinEventSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEventSpecAccess().getBuiltinEventSpecParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBuiltinEventSpec_in_ruleEventSpec4306);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1887:1: entryRuleRegularEventSpec returns [EObject current=null] : iv_ruleRegularEventSpec= ruleRegularEventSpec EOF ;
    public final EObject entryRuleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEventSpec = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1888:2: (iv_ruleRegularEventSpec= ruleRegularEventSpec EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1889:2: iv_ruleRegularEventSpec= ruleRegularEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec4341);
            iv_ruleRegularEventSpec=ruleRegularEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegularEventSpec4351); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1896:1: ruleRegularEventSpec returns [EObject current=null] : ( (lv_event_0_0= ruleFeatureCall ) ) ;
    public final EObject ruleRegularEventSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1899:28: ( ( (lv_event_0_0= ruleFeatureCall ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1900:1: ( (lv_event_0_0= ruleFeatureCall ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1900:1: ( (lv_event_0_0= ruleFeatureCall ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1901:1: (lv_event_0_0= ruleFeatureCall )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1901:1: (lv_event_0_0= ruleFeatureCall )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1902:3: lv_event_0_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRegularEventSpecAccess().getEventFeatureCallParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec4396);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1926:1: entryRuleTimeEventSpec returns [EObject current=null] : iv_ruleTimeEventSpec= ruleTimeEventSpec EOF ;
    public final EObject entryRuleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEventSpec = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1927:2: (iv_ruleTimeEventSpec= ruleTimeEventSpec EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1928:2: iv_ruleTimeEventSpec= ruleTimeEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec4431);
            iv_ruleTimeEventSpec=ruleTimeEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeEventSpec4441); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1935:1: ruleTimeEventSpec returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? ) ;
    public final EObject ruleTimeEventSpec() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_type_0_0 = null;

        Enumerator lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1938:28: ( ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1939:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1939:1: ( ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )? )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1939:2: ( (lv_type_0_0= ruleTimeEventType ) ) ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleTimeUnit ) )?
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1939:2: ( (lv_type_0_0= ruleTimeEventType ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1940:1: (lv_type_0_0= ruleTimeEventType )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1940:1: (lv_type_0_0= ruleTimeEventType )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1941:3: lv_type_0_0= ruleTimeEventType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getTypeTimeEventTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec4487);
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

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1957:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1958:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1958:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1959:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeEventSpec4504); if (state.failed) return current;
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

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1975:2: ( (lv_unit_2_0= ruleTimeUnit ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=82 && LA26_0<=85)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1976:1: (lv_unit_2_0= ruleTimeUnit )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1976:1: (lv_unit_2_0= ruleTimeUnit )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1977:3: lv_unit_2_0= ruleTimeUnit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTimeEventSpecAccess().getUnitTimeUnitEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec4530);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2001:1: entryRuleBuiltinEventSpec returns [EObject current=null] : iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF ;
    public final EObject entryRuleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinEventSpec = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2002:2: (iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2003:2: iv_ruleBuiltinEventSpec= ruleBuiltinEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltinEventSpecRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec4567);
            iv_ruleBuiltinEventSpec=ruleBuiltinEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltinEventSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinEventSpec4577); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2010:1: ruleBuiltinEventSpec returns [EObject current=null] : (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent ) ;
    public final EObject ruleBuiltinEventSpec() throws RecognitionException {
        EObject current = null;

        EObject this_EntryEvent_0 = null;

        EObject this_ExitEvent_1 = null;

        EObject this_OnCycleEvent_2 = null;

        EObject this_AlwaysEvent_3 = null;

        EObject this_DefaultEvent_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2013:28: ( (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2014:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2014:1: (this_EntryEvent_0= ruleEntryEvent | this_ExitEvent_1= ruleExitEvent | this_OnCycleEvent_2= ruleOnCycleEvent | this_AlwaysEvent_3= ruleAlwaysEvent | this_DefaultEvent_4= ruleDefaultEvent )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt27=1;
                }
                break;
            case 41:
                {
                alt27=2;
                }
                break;
            case 42:
                {
                alt27=3;
                }
                break;
            case 43:
                {
                alt27=4;
                }
                break;
            case 44:
            case 45:
                {
                alt27=5;
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2015:5: this_EntryEvent_0= ruleEntryEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getEntryEventParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec4624);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2025:5: this_ExitEvent_1= ruleExitEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getExitEventParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec4651);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2035:5: this_OnCycleEvent_2= ruleOnCycleEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getOnCycleEventParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOnCycleEvent_in_ruleBuiltinEventSpec4678);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2045:5: this_AlwaysEvent_3= ruleAlwaysEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getAlwaysEventParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec4705);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2055:5: this_DefaultEvent_4= ruleDefaultEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBuiltinEventSpecAccess().getDefaultEventParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefaultEvent_in_ruleBuiltinEventSpec4732);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2071:1: entryRuleEntryEvent returns [EObject current=null] : iv_ruleEntryEvent= ruleEntryEvent EOF ;
    public final EObject entryRuleEntryEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryEvent = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2072:2: (iv_ruleEntryEvent= ruleEntryEvent EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2073:2: iv_ruleEntryEvent= ruleEntryEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryEventRule()); 
            }
            pushFollow(FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent4767);
            iv_ruleEntryEvent=ruleEntryEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryEvent4777); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2080:1: ruleEntryEvent returns [EObject current=null] : ( () otherlv_1= 'entry' ) ;
    public final EObject ruleEntryEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2083:28: ( ( () otherlv_1= 'entry' ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2084:1: ( () otherlv_1= 'entry' )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2084:1: ( () otherlv_1= 'entry' )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2084:2: () otherlv_1= 'entry'
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2084:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2085:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryEventAccess().getEntryEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleEntryEvent4823); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2102:1: entryRuleExitEvent returns [EObject current=null] : iv_ruleExitEvent= ruleExitEvent EOF ;
    public final EObject entryRuleExitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitEvent = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2103:2: (iv_ruleExitEvent= ruleExitEvent EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2104:2: iv_ruleExitEvent= ruleExitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitEventRule()); 
            }
            pushFollow(FOLLOW_ruleExitEvent_in_entryRuleExitEvent4859);
            iv_ruleExitEvent=ruleExitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitEvent4869); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2111:1: ruleExitEvent returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2114:28: ( ( () otherlv_1= 'exit' ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2115:1: ( () otherlv_1= 'exit' )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2115:1: ( () otherlv_1= 'exit' )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2115:2: () otherlv_1= 'exit'
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2115:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2116:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitEventAccess().getExitEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleExitEvent4915); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2133:1: entryRuleOnCycleEvent returns [EObject current=null] : iv_ruleOnCycleEvent= ruleOnCycleEvent EOF ;
    public final EObject entryRuleOnCycleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnCycleEvent = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2134:2: (iv_ruleOnCycleEvent= ruleOnCycleEvent EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2135:2: iv_ruleOnCycleEvent= ruleOnCycleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOnCycleEventRule()); 
            }
            pushFollow(FOLLOW_ruleOnCycleEvent_in_entryRuleOnCycleEvent4951);
            iv_ruleOnCycleEvent=ruleOnCycleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOnCycleEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnCycleEvent4961); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2142:1: ruleOnCycleEvent returns [EObject current=null] : ( () otherlv_1= 'oncycle' ) ;
    public final EObject ruleOnCycleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2145:28: ( ( () otherlv_1= 'oncycle' ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2146:1: ( () otherlv_1= 'oncycle' )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2146:1: ( () otherlv_1= 'oncycle' )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2146:2: () otherlv_1= 'oncycle'
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2146:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2147:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOnCycleEventAccess().getOnCycleEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleOnCycleEvent5007); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2164:1: entryRuleAlwaysEvent returns [EObject current=null] : iv_ruleAlwaysEvent= ruleAlwaysEvent EOF ;
    public final EObject entryRuleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysEvent = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2165:2: (iv_ruleAlwaysEvent= ruleAlwaysEvent EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2166:2: iv_ruleAlwaysEvent= ruleAlwaysEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlwaysEventRule()); 
            }
            pushFollow(FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent5043);
            iv_ruleAlwaysEvent=ruleAlwaysEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlwaysEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlwaysEvent5053); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2173:1: ruleAlwaysEvent returns [EObject current=null] : ( () otherlv_1= 'always' ) ;
    public final EObject ruleAlwaysEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2176:28: ( ( () otherlv_1= 'always' ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2177:1: ( () otherlv_1= 'always' )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2177:1: ( () otherlv_1= 'always' )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2177:2: () otherlv_1= 'always'
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2177:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2178:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlwaysEventAccess().getAlwaysEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleAlwaysEvent5099); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2195:1: entryRuleDefaultEvent returns [EObject current=null] : iv_ruleDefaultEvent= ruleDefaultEvent EOF ;
    public final EObject entryRuleDefaultEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultEvent = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2196:2: (iv_ruleDefaultEvent= ruleDefaultEvent EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2197:2: iv_ruleDefaultEvent= ruleDefaultEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultEventRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultEvent_in_entryRuleDefaultEvent5135);
            iv_ruleDefaultEvent=ruleDefaultEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultEvent5145); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2204:1: ruleDefaultEvent returns [EObject current=null] : ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) ;
    public final EObject ruleDefaultEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2207:28: ( ( () (otherlv_1= 'default' | otherlv_2= 'else' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2208:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2208:1: ( () (otherlv_1= 'default' | otherlv_2= 'else' ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2208:2: () (otherlv_1= 'default' | otherlv_2= 'else' )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2208:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2209:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultEventAccess().getDefaultEventAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2214:2: (otherlv_1= 'default' | otherlv_2= 'else' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                alt28=1;
            }
            else if ( (LA28_0==45) ) {
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2214:4: otherlv_1= 'default'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleDefaultEvent5192); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefaultEventAccess().getDefaultKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2219:7: otherlv_2= 'else'
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleDefaultEvent5210); if (state.failed) return current;
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


    // $ANTLR start "entryRuleExpression"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2235:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2236:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2237:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression5251);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression5261); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2244:1: ruleExpression returns [EObject current=null] : this_AssignmentExpression_0= ruleAssignmentExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2247:28: (this_AssignmentExpression_0= ruleAssignmentExpression )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2249:5: this_AssignmentExpression_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpression5307);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2265:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2266:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2267:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression5341);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression5351); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2274:1: ruleAssignmentExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2277:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2278:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2278:1: (this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2279:5: this_ConditionalExpression_0= ruleConditionalExpression ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression5398);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2287:1: ( () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==29||(LA29_0>=60 && LA29_0<=69)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2287:2: () ( (lv_operator_2_0= ruleAssignmentOperator ) ) ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2287:2: ()
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2288:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2293:2: ( (lv_operator_2_0= ruleAssignmentOperator ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2294:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2294:1: (lv_operator_2_0= ruleAssignmentOperator )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2295:3: lv_operator_2_0= ruleAssignmentOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignmentOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression5428);
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

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2311:2: ( (lv_expression_3_0= ruleConditionalExpression ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2312:1: (lv_expression_3_0= ruleConditionalExpression )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2312:1: (lv_expression_3_0= ruleConditionalExpression )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2313:3: lv_expression_3_0= ruleConditionalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getExpressionConditionalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression5449);
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
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleConditionalExpression"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2337:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2338:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2339:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression5487);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression5497); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2346:1: ruleConditionalExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_trueCase_3_0 = null;

        EObject lv_falseCase_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2349:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2350:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2350:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )? )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2351:5: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression5544);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2359:1: ( () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==46) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2359:2: () otherlv_2= '?' ( (lv_trueCase_3_0= ruleLogicalOrExpression ) ) otherlv_4= ':' ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2359:2: ()
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2360:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleConditionalExpression5565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2369:1: ( (lv_trueCase_3_0= ruleLogicalOrExpression ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2370:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2370:1: (lv_trueCase_3_0= ruleLogicalOrExpression )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2371:3: lv_trueCase_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTrueCaseLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression5586);
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

                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleConditionalExpression5598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_3());
                          
                    }
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2391:1: ( (lv_falseCase_5_0= ruleLogicalOrExpression ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2392:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2392:1: (lv_falseCase_5_0= ruleLogicalOrExpression )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2393:3: lv_falseCase_5_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getFalseCaseLogicalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression5619);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2417:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2418:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2419:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression5657);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression5667); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2426:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2429:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2430:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2430:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2431:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression5714);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2439:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==47) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2439:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2439:2: ()
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2440:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleLogicalOrExpression5735); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2449:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2450:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2450:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2451:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression5756);
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2475:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2476:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2477:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression5794);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression5804); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2484:1: ruleLogicalAndExpression returns [EObject current=null] : (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalNotExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2487:28: ( (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2488:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2488:1: (this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2489:5: this_LogicalNotExpression_0= ruleLogicalNotExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLogicalNotExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression5851);
            this_LogicalNotExpression_0=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalNotExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2497:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==48) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2497:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2497:2: ()
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2498:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleLogicalAndExpression5872); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2507:1: ( (lv_rightOperand_3_0= ruleLogicalNotExpression ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2508:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2508:1: (lv_rightOperand_3_0= ruleLogicalNotExpression )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2509:3: lv_rightOperand_3_0= ruleLogicalNotExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandLogicalNotExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression5893);
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleLogicalNotExpression"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2533:1: entryRuleLogicalNotExpression returns [EObject current=null] : iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF ;
    public final EObject entryRuleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalNotExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2534:2: (iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2535:2: iv_ruleLogicalNotExpression= ruleLogicalNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression5931);
            iv_ruleLogicalNotExpression=ruleLogicalNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalNotExpression5941); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2542:1: ruleLogicalNotExpression returns [EObject current=null] : (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) ;
    public final EObject ruleLogicalNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseXorExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2545:28: ( (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2546:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2546:1: (this_BitwiseXorExpression_0= ruleBitwiseXorExpression | ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_STRING)||LA33_0==31||(LA33_0>=53 && LA33_0<=54)||(LA33_0>=72 && LA33_0<=73)||LA33_0==76) ) {
                alt33=1;
            }
            else if ( (LA33_0==49) ) {
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2547:5: this_BitwiseXorExpression_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getBitwiseXorExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression5988);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2556:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2556:6: ( () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2556:7: () otherlv_2= '!' ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2556:7: ()
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2557:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLogicalNotExpressionAccess().getLogicalNotExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleLogicalNotExpression6015); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLogicalNotExpressionAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2566:1: ( (lv_operand_3_0= ruleBitwiseXorExpression ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2567:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2567:1: (lv_operand_3_0= ruleBitwiseXorExpression )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2568:3: lv_operand_3_0= ruleBitwiseXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalNotExpressionAccess().getOperandBitwiseXorExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression6036);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2592:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2593:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2594:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression6073);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression6083); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2601:1: ruleBitwiseXorExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2604:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2605:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2605:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2606:5: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression6130);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2614:1: ( () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==50) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2614:2: () otherlv_2= '^' ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2614:2: ()
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2615:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleBitwiseXorExpression6151); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2624:1: ( (lv_rightOperand_3_0= ruleBitwiseOrExpression ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2625:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2625:1: (lv_rightOperand_3_0= ruleBitwiseOrExpression )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2626:3: lv_rightOperand_3_0= ruleBitwiseOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandBitwiseOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression6172);
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
            	    break loop34;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2650:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2651:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2652:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression6210);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression6220); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2659:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BitwiseAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2662:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2663:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2663:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2664:5: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression6267);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2672:1: ( () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==51) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2672:2: () otherlv_2= '|' ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2672:2: ()
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2673:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleBitwiseOrExpression6288); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2682:1: ( (lv_rightOperand_3_0= ruleBitwiseAndExpression ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2683:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2683:1: (lv_rightOperand_3_0= ruleBitwiseAndExpression )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2684:3: lv_rightOperand_3_0= ruleBitwiseAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandBitwiseAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression6309);
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
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2708:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2709:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2710:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression6347);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression6357); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2717:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalRelationExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2720:28: ( (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2721:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2721:1: (this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2722:5: this_LogicalRelationExpression_0= ruleLogicalRelationExpression ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getLogicalRelationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression6404);
            this_LogicalRelationExpression_0=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalRelationExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2730:1: ( () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==52) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2730:2: () otherlv_2= '&' ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2730:2: ()
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2731:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleBitwiseAndExpression6425); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2740:1: ( (lv_rightOperand_3_0= ruleLogicalRelationExpression ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2741:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2741:1: (lv_rightOperand_3_0= ruleLogicalRelationExpression )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2742:3: lv_rightOperand_3_0= ruleLogicalRelationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandLogicalRelationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression6446);
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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleLogicalRelationExpression"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2766:1: entryRuleLogicalRelationExpression returns [EObject current=null] : iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF ;
    public final EObject entryRuleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalRelationExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2767:2: (iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2768:2: iv_ruleLogicalRelationExpression= ruleLogicalRelationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRelationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression6484);
            iv_ruleLogicalRelationExpression=ruleLogicalRelationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalRelationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalRelationExpression6494); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2775:1: ruleLogicalRelationExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleLogicalRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2778:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2779:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2779:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2780:5: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression6541);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2788:1: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==39||(LA37_0>=77 && LA37_0<=81)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2788:2: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2788:2: ()
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2789:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2794:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2795:1: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2795:1: (lv_operator_2_0= ruleRelationalOperator )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2796:3: lv_operator_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression6571);
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

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2812:2: ( (lv_rightOperand_3_0= ruleShiftExpression ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2813:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2813:1: (lv_rightOperand_3_0= ruleShiftExpression )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2814:3: lv_rightOperand_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression6592);
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
    // $ANTLR end "ruleLogicalRelationExpression"


    // $ANTLR start "entryRuleShiftExpression"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2838:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2839:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2840:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression6630);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression6640); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2847:1: ruleShiftExpression returns [EObject current=null] : (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalAddSubtractExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2850:28: ( (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2851:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2851:1: (this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2852:5: this_NumericalAddSubtractExpression_0= ruleNumericalAddSubtractExpression ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getNumericalAddSubtractExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression6687);
            this_NumericalAddSubtractExpression_0=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalAddSubtractExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2860:1: ( () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=70 && LA38_0<=71)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2860:2: () ( (lv_operator_2_0= ruleShiftOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2860:2: ()
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2861:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2866:2: ( (lv_operator_2_0= ruleShiftOperator ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2867:1: (lv_operator_2_0= ruleShiftOperator )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2867:1: (lv_operator_2_0= ruleShiftOperator )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2868:3: lv_operator_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOperatorShiftOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression6717);
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

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2884:2: ( (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2885:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2885:1: (lv_rightOperand_3_0= ruleNumericalAddSubtractExpression )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2886:3: lv_rightOperand_3_0= ruleNumericalAddSubtractExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightOperandNumericalAddSubtractExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression6738);
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
    // $ANTLR end "ruleShiftExpression"


    // $ANTLR start "entryRuleNumericalAddSubtractExpression"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2910:1: entryRuleNumericalAddSubtractExpression returns [EObject current=null] : iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF ;
    public final EObject entryRuleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalAddSubtractExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2911:2: (iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2912:2: iv_ruleNumericalAddSubtractExpression= ruleNumericalAddSubtractExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression6776);
            iv_ruleNumericalAddSubtractExpression=ruleNumericalAddSubtractExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalAddSubtractExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression6786); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2919:1: ruleNumericalAddSubtractExpression returns [EObject current=null] : (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) ;
    public final EObject ruleNumericalAddSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalMultiplyDivideExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2922:28: ( (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2923:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2923:1: (this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2924:5: this_NumericalMultiplyDivideExpression_0= ruleNumericalMultiplyDivideExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalMultiplyDivideExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression6833);
            this_NumericalMultiplyDivideExpression_0=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalMultiplyDivideExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2932:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=72 && LA39_0<=73)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2932:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2932:2: ()
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2933:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2938:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2939:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2939:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2940:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression6863);
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

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2956:2: ( (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2957:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2957:1: (lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2958:3: lv_rightOperand_3_0= ruleNumericalMultiplyDivideExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandNumericalMultiplyDivideExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression6884);
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
    // $ANTLR end "ruleNumericalAddSubtractExpression"


    // $ANTLR start "entryRuleNumericalMultiplyDivideExpression"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2982:1: entryRuleNumericalMultiplyDivideExpression returns [EObject current=null] : iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF ;
    public final EObject entryRuleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalMultiplyDivideExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2983:2: (iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2984:2: iv_ruleNumericalMultiplyDivideExpression= ruleNumericalMultiplyDivideExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression6922);
            iv_ruleNumericalMultiplyDivideExpression=ruleNumericalMultiplyDivideExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalMultiplyDivideExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression6932); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2991:1: ruleNumericalMultiplyDivideExpression returns [EObject current=null] : (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) ;
    public final EObject ruleNumericalMultiplyDivideExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericalUnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2994:28: ( (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2995:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2995:1: (this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:2996:5: this_NumericalUnaryExpression_0= ruleNumericalUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression6979);
            this_NumericalUnaryExpression_0=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumericalUnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3004:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==19||(LA40_0>=74 && LA40_0<=75)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3004:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3004:2: ()
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3005:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3010:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3011:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3011:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3012:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression7009);
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

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3028:2: ( (lv_rightOperand_3_0= ruleNumericalUnaryExpression ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3029:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3029:1: (lv_rightOperand_3_0= ruleNumericalUnaryExpression )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3030:3: lv_rightOperand_3_0= ruleNumericalUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression7030);
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
    // $ANTLR end "ruleNumericalMultiplyDivideExpression"


    // $ANTLR start "entryRuleNumericalUnaryExpression"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3054:1: entryRuleNumericalUnaryExpression returns [EObject current=null] : iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF ;
    public final EObject entryRuleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericalUnaryExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3055:2: (iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3056:2: iv_ruleNumericalUnaryExpression= ruleNumericalUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericalUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression7068);
            iv_ruleNumericalUnaryExpression=ruleNumericalUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericalUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericalUnaryExpression7078); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3063:1: ruleNumericalUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleNumericalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3066:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3067:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3067:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_STRING)||LA41_0==31||(LA41_0>=53 && LA41_0<=54)) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=72 && LA41_0<=73)||LA41_0==76) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3068:5: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression7125);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3077:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3077:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3077:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePrimaryExpression ) )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3077:7: ()
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3078:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNumericalUnaryExpressionAccess().getNumericalUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3083:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3084:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3084:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3085:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression7161);
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

                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3101:2: ( (lv_operand_3_0= rulePrimaryExpression ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3102:1: (lv_operand_3_0= rulePrimaryExpression )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3102:1: (lv_operand_3_0= rulePrimaryExpression )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3103:3: lv_operand_3_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericalUnaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression7182);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3127:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3128:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3129:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression7219);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression7229); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3136:1: rulePrimaryExpression returns [EObject current=null] : (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
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
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3139:28: ( (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3140:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3140:1: (this_PrimitiveValueExpression_0= rulePrimitiveValueExpression | this_FeatureCall_1= ruleFeatureCall | this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression | this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            int alt42=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_HEX:
            case RULE_STRING:
                {
                alt42=1;
                }
                break;
            case RULE_ID:
                {
                alt42=2;
                }
                break;
            case 54:
                {
                alt42=3;
                }
                break;
            case 53:
                {
                alt42=4;
                }
                break;
            case 31:
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3141:5: this_PrimitiveValueExpression_0= rulePrimitiveValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPrimitiveValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression7276);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3151:5: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression7303);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3161:5: this_ActiveStateReferenceExpression_2= ruleActiveStateReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getActiveStateReferenceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression7330);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3171:5: this_EventValueReferenceExpression_3= ruleEventValueReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEventValueReferenceExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression7357);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3180:6: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3180:6: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3180:8: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_rulePrimaryExpression7375); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression7397);
                    this_Expression_5=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_rulePrimaryExpression7408); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3205:1: entryRulePrimitiveValueExpression returns [EObject current=null] : iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF ;
    public final EObject entryRulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValueExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3206:2: (iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3207:2: iv_rulePrimitiveValueExpression= rulePrimitiveValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveValueExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression7445);
            iv_rulePrimitiveValueExpression=rulePrimitiveValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValueExpression7455); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3214:1: rulePrimitiveValueExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject rulePrimitiveValueExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3217:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3218:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3218:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3218:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3218:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3219:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimitiveValueExpressionAccess().getPrimitiveValueExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3224:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3225:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3225:1: (lv_value_1_0= ruleLiteral )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3226:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveValueExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression7510);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3250:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3251:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3252:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall7546);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall7556); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3259:1: ruleFeatureCall returns [EObject current=null] : (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
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
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3262:28: ( (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3263:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3263:1: (this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3264:5: this_ElementReferenceExpression_0= ruleElementReferenceExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFeatureCallAccess().getElementReferenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall7603);
            this_ElementReferenceExpression_0=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ElementReferenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3272:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==36) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3272:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3272:2: ()
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3273:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleFeatureCall7624); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3282:1: ( (otherlv_3= RULE_ID ) )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3283:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3283:1: (otherlv_3= RULE_ID )
            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3284:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureCall7644); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getFeatureEObjectCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3295:2: ( ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==31) && (synpred3_InternalKidsexp())) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3295:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3295:3: ( ( ( '(' ) )=> (lv_operationCall_4_0= '(' ) )
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3295:4: ( ( '(' ) )=> (lv_operationCall_4_0= '(' )
            	            {
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3302:1: (lv_operationCall_4_0= '(' )
            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3303:3: lv_operationCall_4_0= '('
            	            {
            	            lv_operationCall_4_0=(Token)match(input,31,FOLLOW_31_in_ruleFeatureCall7678); if (state.failed) return current;
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

            	            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3316:2: ( ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* )?
            	            int alt44=2;
            	            int LA44_0 = input.LA(1);

            	            if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_STRING)||LA44_0==31||LA44_0==49||(LA44_0>=53 && LA44_0<=54)||(LA44_0>=72 && LA44_0<=73)||LA44_0==76) ) {
            	                alt44=1;
            	            }
            	            switch (alt44) {
            	                case 1 :
            	                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3316:3: ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    {
            	                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3316:3: ( (lv_args_5_0= ruleExpression ) )
            	                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3317:1: (lv_args_5_0= ruleExpression )
            	                    {
            	                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3317:1: (lv_args_5_0= ruleExpression )
            	                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3318:3: lv_args_5_0= ruleExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall7713);
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

            	                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3334:2: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
            	                    loop43:
            	                    do {
            	                        int alt43=2;
            	                        int LA43_0 = input.LA(1);

            	                        if ( (LA43_0==32) ) {
            	                            alt43=1;
            	                        }


            	                        switch (alt43) {
            	                    	case 1 :
            	                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3334:4: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleFeatureCall7726); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3338:1: ( (lv_args_7_0= ruleExpression ) )
            	                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3339:1: (lv_args_7_0= ruleExpression )
            	                    	    {
            	                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3339:1: (lv_args_7_0= ruleExpression )
            	                    	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3340:3: lv_args_7_0= ruleExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall7747);
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
            	                    	    break loop43;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleFeatureCall7763); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getFeatureCallAccess().getRightParenthesisKeyword_1_3_2());
            	                  
            	            }

            	            }
            	            break;

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
    // $ANTLR end "ruleFeatureCall"


    // $ANTLR start "entryRuleElementReferenceExpression"
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3368:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3369:2: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3370:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression7803);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementReferenceExpression7813); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3377:1: ruleElementReferenceExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
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
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3380:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3381:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3381:1: ( () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3381:2: () ( (otherlv_1= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3381:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3382:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementReferenceExpressionAccess().getElementReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3387:2: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3388:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3388:1: (otherlv_1= RULE_ID )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3389:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementReferenceExpression7867); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getElementReferenceExpressionAccess().getReferenceEObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3400:2: ( ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==31) && (synpred4_InternalKidsexp())) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3400:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) ) ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3400:3: ( ( ( '(' ) )=> (lv_operationCall_2_0= '(' ) )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3400:4: ( ( '(' ) )=> (lv_operationCall_2_0= '(' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3407:1: (lv_operationCall_2_0= '(' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3408:3: lv_operationCall_2_0= '('
                    {
                    lv_operationCall_2_0=(Token)match(input,31,FOLLOW_31_in_ruleElementReferenceExpression7901); if (state.failed) return current;
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

                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3421:2: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_STRING)||LA48_0==31||LA48_0==49||(LA48_0>=53 && LA48_0<=54)||(LA48_0>=72 && LA48_0<=73)||LA48_0==76) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3421:3: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            {
                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3421:3: ( (lv_args_3_0= ruleExpression ) )
                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3422:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3422:1: (lv_args_3_0= ruleExpression )
                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3423:3: lv_args_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression7936);
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

                            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3439:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                            loop47:
                            do {
                                int alt47=2;
                                int LA47_0 = input.LA(1);

                                if ( (LA47_0==32) ) {
                                    alt47=1;
                                }


                                switch (alt47) {
                            	case 1 :
                            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3439:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleElementReferenceExpression7949); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getElementReferenceExpressionAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3443:1: ( (lv_args_5_0= ruleExpression ) )
                            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3444:1: (lv_args_5_0= ruleExpression )
                            	    {
                            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3444:1: (lv_args_5_0= ruleExpression )
                            	    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3445:3: lv_args_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getArgsExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleElementReferenceExpression7970);
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
                            	    break loop47;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleElementReferenceExpression7986); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3473:1: entryRuleEventValueReferenceExpression returns [EObject current=null] : iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF ;
    public final EObject entryRuleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventValueReferenceExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3474:2: (iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3475:2: iv_ruleEventValueReferenceExpression= ruleEventValueReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventValueReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression8024);
            iv_ruleEventValueReferenceExpression=ruleEventValueReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventValueReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventValueReferenceExpression8034); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3482:1: ruleEventValueReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) ;
    public final EObject ruleEventValueReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3485:28: ( ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3486:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3486:1: ( () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')' )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3486:2: () otherlv_1= 'valueof' otherlv_2= '(' ( (lv_value_3_0= ruleFeatureCall ) ) otherlv_4= ')'
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3486:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3487:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventValueReferenceExpressionAccess().getEventValueReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleEventValueReferenceExpression8080); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventValueReferenceExpressionAccess().getValueofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleEventValueReferenceExpression8092); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEventValueReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3500:1: ( (lv_value_3_0= ruleFeatureCall ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3501:1: (lv_value_3_0= ruleFeatureCall )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3501:1: (lv_value_3_0= ruleFeatureCall )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3502:3: lv_value_3_0= ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventValueReferenceExpressionAccess().getValueFeatureCallParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression8113);
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

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleEventValueReferenceExpression8125); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3530:1: entryRuleActiveStateReferenceExpression returns [EObject current=null] : iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF ;
    public final EObject entryRuleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveStateReferenceExpression = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3531:2: (iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3532:2: iv_ruleActiveStateReferenceExpression= ruleActiveStateReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveStateReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression8161);
            iv_ruleActiveStateReferenceExpression=ruleActiveStateReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveStateReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression8171); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3539:1: ruleActiveStateReferenceExpression returns [EObject current=null] : ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) ;
    public final EObject ruleActiveStateReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3542:28: ( ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3543:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3543:1: ( () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')' )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3543:2: () otherlv_1= 'active' otherlv_2= '(' ( ( ruleFQN ) ) otherlv_4= ')'
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3543:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3544:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActiveStateReferenceExpressionAccess().getActiveStateReferenceExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleActiveStateReferenceExpression8217); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getActiveStateReferenceExpressionAccess().getActiveKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleActiveStateReferenceExpression8229); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getActiveStateReferenceExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3557:1: ( ( ruleFQN ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3558:1: ( ruleFQN )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3558:1: ( ruleFQN )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3559:3: ruleFQN
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActiveStateReferenceExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActiveStateReferenceExpressionAccess().getValueStateCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression8252);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleActiveStateReferenceExpression8264); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3584:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3585:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3586:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral8300);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral8310); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3593:1: ruleLiteral returns [EObject current=null] : (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BoolLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_HexLiteral_2 = null;

        EObject this_RealLiteral_3 = null;

        EObject this_StringLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3596:28: ( (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3597:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3597:1: (this_BoolLiteral_0= ruleBoolLiteral | this_IntLiteral_1= ruleIntLiteral | this_HexLiteral_2= ruleHexLiteral | this_RealLiteral_3= ruleRealLiteral | this_StringLiteral_4= ruleStringLiteral )
            int alt50=5;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt50=1;
                }
                break;
            case RULE_INT:
                {
                alt50=2;
                }
                break;
            case RULE_HEX:
                {
                alt50=3;
                }
                break;
            case RULE_FLOAT:
                {
                alt50=4;
                }
                break;
            case RULE_STRING:
                {
                alt50=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3598:5: this_BoolLiteral_0= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral8357);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3608:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral8384);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3618:5: this_HexLiteral_2= ruleHexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getHexLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexLiteral_in_ruleLiteral8411);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3628:5: this_RealLiteral_3= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleLiteral8438);
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3638:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral8465);
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3654:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3655:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3656:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral8500);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral8510); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3663:1: ruleBoolLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3666:28: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3667:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3667:1: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3667:2: () ( (lv_value_1_0= RULE_BOOL ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3667:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3668:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3673:2: ( (lv_value_1_0= RULE_BOOL ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3674:1: (lv_value_1_0= RULE_BOOL )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3674:1: (lv_value_1_0= RULE_BOOL )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3675:3: lv_value_1_0= RULE_BOOL
            {
            lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral8561); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3699:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3700:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3701:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral8602);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral8612); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3708:1: ruleIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3711:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3712:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3712:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3712:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3712:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3713:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntLiteralAccess().getIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3718:2: ( (lv_value_1_0= RULE_INT ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3719:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3719:1: (lv_value_1_0= RULE_INT )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3720:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral8663); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3744:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3745:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3746:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral8704);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral8714); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3753:1: ruleRealLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3756:28: ( ( () ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3757:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3757:1: ( () ( (lv_value_1_0= RULE_FLOAT ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3757:2: () ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3757:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3758:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealLiteralAccess().getRealLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3763:2: ( (lv_value_1_0= RULE_FLOAT ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3764:1: (lv_value_1_0= RULE_FLOAT )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3764:1: (lv_value_1_0= RULE_FLOAT )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3765:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleRealLiteral8765); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3789:1: entryRuleHexLiteral returns [EObject current=null] : iv_ruleHexLiteral= ruleHexLiteral EOF ;
    public final EObject entryRuleHexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexLiteral = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3790:2: (iv_ruleHexLiteral= ruleHexLiteral EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3791:2: iv_ruleHexLiteral= ruleHexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral8806);
            iv_ruleHexLiteral=ruleHexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexLiteral8816); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3798:1: ruleHexLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3801:28: ( ( () ( (lv_value_1_0= RULE_HEX ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3802:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3802:1: ( () ( (lv_value_1_0= RULE_HEX ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3802:2: () ( (lv_value_1_0= RULE_HEX ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3802:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3803:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHexLiteralAccess().getHexLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3808:2: ( (lv_value_1_0= RULE_HEX ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3809:1: (lv_value_1_0= RULE_HEX )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3809:1: (lv_value_1_0= RULE_HEX )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3810:3: lv_value_1_0= RULE_HEX
            {
            lv_value_1_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleHexLiteral8867); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3834:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3835:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3836:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral8908);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral8918); if (state.failed) return current;

            }

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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3843:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3846:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3847:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3847:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3847:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3847:2: ()
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3848:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3853:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3854:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3854:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3855:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral8969); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3879:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3881:28: ( ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3882:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3882:1: ( (enumLiteral_0= 'local' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt51=1;
                }
                break;
            case 56:
                {
                alt51=2;
                }
                break;
            case 57:
                {
                alt51=3;
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3882:2: (enumLiteral_0= 'local' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3882:2: (enumLiteral_0= 'local' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3882:4: enumLiteral_0= 'local'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_55_in_ruleDirection9024); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getLOCALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3888:6: (enumLiteral_1= 'in' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3888:6: (enumLiteral_1= 'in' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3888:8: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_56_in_ruleDirection9041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3894:6: (enumLiteral_2= 'out' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3894:6: (enumLiteral_2= 'out' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3894:8: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_57_in_ruleDirection9058); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3904:1: ruleTimeEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) ;
    public final Enumerator ruleTimeEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3906:28: ( ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3907:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3907:1: ( (enumLiteral_0= 'after' ) | (enumLiteral_1= 'every' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==58) ) {
                alt52=1;
            }
            else if ( (LA52_0==59) ) {
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3907:2: (enumLiteral_0= 'after' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3907:2: (enumLiteral_0= 'after' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3907:4: enumLiteral_0= 'after'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_58_in_ruleTimeEventType9103); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeEventTypeAccess().getAfterEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3913:6: (enumLiteral_1= 'every' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3913:6: (enumLiteral_1= 'every' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3913:8: enumLiteral_1= 'every'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_59_in_ruleTimeEventType9120); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3923:1: ruleAssignmentOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) ;
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
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3925:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3926:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3926:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '*=' ) | (enumLiteral_2= '/=' ) | (enumLiteral_3= '%=' ) | (enumLiteral_4= '+=' ) | (enumLiteral_5= '-=' ) | (enumLiteral_6= '<<=' ) | (enumLiteral_7= '>>=' ) | (enumLiteral_8= '&=' ) | (enumLiteral_9= '^=' ) | (enumLiteral_10= '|=' ) )
            int alt53=11;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt53=1;
                }
                break;
            case 60:
                {
                alt53=2;
                }
                break;
            case 61:
                {
                alt53=3;
                }
                break;
            case 62:
                {
                alt53=4;
                }
                break;
            case 63:
                {
                alt53=5;
                }
                break;
            case 64:
                {
                alt53=6;
                }
                break;
            case 65:
                {
                alt53=7;
                }
                break;
            case 66:
                {
                alt53=8;
                }
                break;
            case 67:
                {
                alt53=9;
                }
                break;
            case 68:
                {
                alt53=10;
                }
                break;
            case 69:
                {
                alt53=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3926:2: (enumLiteral_0= '=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3926:2: (enumLiteral_0= '=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3926:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_29_in_ruleAssignmentOperator9165); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignmentOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3932:6: (enumLiteral_1= '*=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3932:6: (enumLiteral_1= '*=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3932:8: enumLiteral_1= '*='
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_60_in_ruleAssignmentOperator9182); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignmentOperatorAccess().getMultAssignEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3938:6: (enumLiteral_2= '/=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3938:6: (enumLiteral_2= '/=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3938:8: enumLiteral_2= '/='
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_61_in_ruleAssignmentOperator9199); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignmentOperatorAccess().getDivAssignEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3944:6: (enumLiteral_3= '%=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3944:6: (enumLiteral_3= '%=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3944:8: enumLiteral_3= '%='
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_62_in_ruleAssignmentOperator9216); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignmentOperatorAccess().getModAssignEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3950:6: (enumLiteral_4= '+=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3950:6: (enumLiteral_4= '+=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3950:8: enumLiteral_4= '+='
                    {
                    enumLiteral_4=(Token)match(input,63,FOLLOW_63_in_ruleAssignmentOperator9233); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignmentOperatorAccess().getAddAssignEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3956:6: (enumLiteral_5= '-=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3956:6: (enumLiteral_5= '-=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3956:8: enumLiteral_5= '-='
                    {
                    enumLiteral_5=(Token)match(input,64,FOLLOW_64_in_ruleAssignmentOperator9250); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignmentOperatorAccess().getSubAssignEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3962:6: (enumLiteral_6= '<<=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3962:6: (enumLiteral_6= '<<=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3962:8: enumLiteral_6= '<<='
                    {
                    enumLiteral_6=(Token)match(input,65,FOLLOW_65_in_ruleAssignmentOperator9267); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignmentOperatorAccess().getLeftShiftAssignEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3968:6: (enumLiteral_7= '>>=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3968:6: (enumLiteral_7= '>>=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3968:8: enumLiteral_7= '>>='
                    {
                    enumLiteral_7=(Token)match(input,66,FOLLOW_66_in_ruleAssignmentOperator9284); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignmentOperatorAccess().getRightShiftAssignEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3974:6: (enumLiteral_8= '&=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3974:6: (enumLiteral_8= '&=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3974:8: enumLiteral_8= '&='
                    {
                    enumLiteral_8=(Token)match(input,67,FOLLOW_67_in_ruleAssignmentOperator9301); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignmentOperatorAccess().getAndAssignEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3980:6: (enumLiteral_9= '^=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3980:6: (enumLiteral_9= '^=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3980:8: enumLiteral_9= '^='
                    {
                    enumLiteral_9=(Token)match(input,68,FOLLOW_68_in_ruleAssignmentOperator9318); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getAssignmentOperatorAccess().getXorAssignEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3986:6: (enumLiteral_10= '|=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3986:6: (enumLiteral_10= '|=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3986:8: enumLiteral_10= '|='
                    {
                    enumLiteral_10=(Token)match(input,69,FOLLOW_69_in_ruleAssignmentOperator9335); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3996:1: ruleShiftOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) ;
    public final Enumerator ruleShiftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3998:28: ( ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3999:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3999:1: ( (enumLiteral_0= '<<' ) | (enumLiteral_1= '>>' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==70) ) {
                alt54=1;
            }
            else if ( (LA54_0==71) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3999:2: (enumLiteral_0= '<<' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3999:2: (enumLiteral_0= '<<' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3999:4: enumLiteral_0= '<<'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_70_in_ruleShiftOperator9380); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getShiftOperatorAccess().getLeftEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4005:6: (enumLiteral_1= '>>' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4005:6: (enumLiteral_1= '>>' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4005:8: enumLiteral_1= '>>'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_71_in_ruleShiftOperator9397); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4015:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4017:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4018:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4018:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==72) ) {
                alt55=1;
            }
            else if ( (LA55_0==73) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4018:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4018:2: (enumLiteral_0= '+' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4018:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_72_in_ruleAdditiveOperator9442); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getPlusEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4024:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4024:6: (enumLiteral_1= '-' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4024:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_73_in_ruleAdditiveOperator9459); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4034:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4036:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4037:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4037:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '%' ) )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt56=1;
                }
                break;
            case 19:
                {
                alt56=2;
                }
                break;
            case 75:
                {
                alt56=3;
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4037:2: (enumLiteral_0= '*' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4037:2: (enumLiteral_0= '*' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4037:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_74_in_ruleMultiplicativeOperator9504); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMulEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4043:6: (enumLiteral_1= '/' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4043:6: (enumLiteral_1= '/' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4043:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_19_in_ruleMultiplicativeOperator9521); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4049:6: (enumLiteral_2= '%' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4049:6: (enumLiteral_2= '%' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4049:8: enumLiteral_2= '%'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_75_in_ruleMultiplicativeOperator9538); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4059:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4061:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4062:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4062:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '~' ) )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt57=1;
                }
                break;
            case 73:
                {
                alt57=2;
                }
                break;
            case 76:
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4062:2: (enumLiteral_0= '+' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4062:2: (enumLiteral_0= '+' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4062:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_72_in_ruleUnaryOperator9583); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4068:6: (enumLiteral_1= '-' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4068:6: (enumLiteral_1= '-' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4068:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_73_in_ruleUnaryOperator9600); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4074:6: (enumLiteral_2= '~' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4074:6: (enumLiteral_2= '~' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4074:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_76_in_ruleUnaryOperator9617); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4084:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4086:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4087:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4087:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt58=6;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt58=1;
                }
                break;
            case 78:
                {
                alt58=2;
                }
                break;
            case 39:
                {
                alt58=3;
                }
                break;
            case 79:
                {
                alt58=4;
                }
                break;
            case 80:
                {
                alt58=5;
                }
                break;
            case 81:
                {
                alt58=6;
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4087:2: (enumLiteral_0= '<' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4087:2: (enumLiteral_0= '<' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4087:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_77_in_ruleRelationalOperator9662); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getSmallerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4093:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4093:6: (enumLiteral_1= '<=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4093:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_78_in_ruleRelationalOperator9679); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getSmallerEqualEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4099:6: (enumLiteral_2= '>' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4099:6: (enumLiteral_2= '>' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4099:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_39_in_ruleRelationalOperator9696); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4105:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4105:6: (enumLiteral_3= '>=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4105:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,79,FOLLOW_79_in_ruleRelationalOperator9713); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4111:6: (enumLiteral_4= '==' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4111:6: (enumLiteral_4= '==' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4111:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,80,FOLLOW_80_in_ruleRelationalOperator9730); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationalOperatorAccess().getEqualsEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4117:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4117:6: (enumLiteral_5= '!=' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4117:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,81,FOLLOW_81_in_ruleRelationalOperator9747); if (state.failed) return current;
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
    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4127:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4129:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) ) )
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4130:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            {
            // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4130:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) | (enumLiteral_2= 'us' ) | (enumLiteral_3= 'ns' ) )
            int alt59=4;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt59=1;
                }
                break;
            case 83:
                {
                alt59=2;
                }
                break;
            case 84:
                {
                alt59=3;
                }
                break;
            case 85:
                {
                alt59=4;
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
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4130:2: (enumLiteral_0= 's' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4130:2: (enumLiteral_0= 's' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4130:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_82_in_ruleTimeUnit9792); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4136:6: (enumLiteral_1= 'ms' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4136:6: (enumLiteral_1= 'ms' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4136:8: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_83_in_ruleTimeUnit9809); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4142:6: (enumLiteral_2= 'us' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4142:6: (enumLiteral_2= 'us' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4142:8: enumLiteral_2= 'us'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_84_in_ruleTimeUnit9826); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMicrosecondEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4148:6: (enumLiteral_3= 'ns' )
                    {
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4148:6: (enumLiteral_3= 'ns' )
                    // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:4148:8: enumLiteral_3= 'ns'
                    {
                    enumLiteral_3=(Token)match(input,85,FOLLOW_85_in_ruleTimeUnit9843); if (state.failed) return current;
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
        // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1653:6: ( '[' )
        // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:1653:8: '['
        {
        match(input,37,FOLLOW_37_in_synpred2_InternalKidsexp3727); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalKidsexp

    // $ANTLR start synpred3_InternalKidsexp
    public final void synpred3_InternalKidsexp_fragment() throws RecognitionException {   
        // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3295:4: ( ( '(' ) )
        // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3296:1: ( '(' )
        {
        // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3296:1: ( '(' )
        // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3297:2: '('
        {
        match(input,31,FOLLOW_31_in_synpred3_InternalKidsexp7660); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalKidsexp

    // $ANTLR start synpred4_InternalKidsexp
    public final void synpred4_InternalKidsexp_fragment() throws RecognitionException {   
        // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3400:4: ( ( '(' ) )
        // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3401:1: ( '(' )
        {
        // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3401:1: ( '(' )
        // ../de.cau.kieler.synccharts.yakindu.model.reqtext/src-gen/de/cau/kieler/synccharts/yakindu/model/reqtext/parser/antlr/internal/InternalKidsexp.g:3402:2: '('
        {
        match(input,31,FOLLOW_31_in_synpred4_InternalKidsexp7883); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalKidsexp

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
    public static final BitSet FOLLOW_16_in_ruleTransitionRoot567 = new BitSet(new long[]{0x0000000000180000L});
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
    public static final BitSet FOLLOW_ruleTransitionReaction_in_entryRuleTransitionReaction898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionReaction908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyTrigger_in_ruleTransitionReaction963 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleTransitionReaction977 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleTransitionReaction998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyTrigger_in_entryRuleMyTrigger1036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMyTrigger1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleMyTrigger1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_entryRuleReactionEffect1128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionEffect1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleReactionEffect1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateScope_in_entryRuleStateScope1224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateScope1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleStateScope1291 = new BitSet(new long[]{0x0C003F2C00000012L});
    public static final BitSet FOLLOW_ruleEntrypoint_in_ruleStateScope1310 = new BitSet(new long[]{0x0C003F2C00000012L});
    public static final BitSet FOLLOW_ruleExitpoint_in_ruleStateScope1329 = new BitSet(new long[]{0x0C003F2C00000012L});
    public static final BitSet FOLLOW_ruleStatechartScope_in_entryRuleStatechartScope1369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatechartScope1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_ruleStatechartScope1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalScope_in_ruleStatechartScope1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceScope_in_entryRuleInterfaceScope1490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceScope1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleInterfaceScope1546 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceScope1563 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleInterfaceScope1581 = new BitSet(new long[]{0x0F803F2C46000010L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInterfaceScope1604 = new BitSet(new long[]{0x0F803F2C46000012L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInterfaceScope1623 = new BitSet(new long[]{0x0F803F2C46000012L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInterfaceScope1642 = new BitSet(new long[]{0x0F803F2C46000012L});
    public static final BitSet FOLLOW_ruleEntrypoint_in_ruleInterfaceScope1661 = new BitSet(new long[]{0x0F803F2C46000012L});
    public static final BitSet FOLLOW_ruleExitpoint_in_ruleInterfaceScope1680 = new BitSet(new long[]{0x0F803F2C46000012L});
    public static final BitSet FOLLOW_ruleInternalScope_in_entryRuleInternalScope1720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalScope1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleInternalScope1776 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleInternalScope1788 = new BitSet(new long[]{0x0F803F2046000012L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_ruleInternalScope1811 = new BitSet(new long[]{0x0F803F2046000012L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInternalScope1830 = new BitSet(new long[]{0x0F803F2046000012L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_ruleInternalScope1849 = new BitSet(new long[]{0x0F803F2046000012L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_ruleInternalScope1868 = new BitSet(new long[]{0x0F803F2046000012L});
    public static final BitSet FOLLOW_ruleEventDeclarartion_in_entryRuleEventDeclarartion1910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclarartion1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_ruleEventDeclarartion1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDefinition_in_entryRuleEventDefinition2002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDefinition2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleEventDefinition2058 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEventDefinition2071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventDefinition2088 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleEventDefinition2106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEventDefinition2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_ruleVariableDeclaration2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDefinition_in_entryRuleVariableDefinition2259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDefinition2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleVariableDefinition2315 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_27_in_ruleVariableDefinition2378 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_28_in_ruleVariableDefinition2463 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDefinition2533 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleVariableDefinition2550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleVariableDefinition2573 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleVariableDefinition2586 = new BitSet(new long[]{0x00620000800003F0L,0x0000000000001300L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDefinition2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDeclaration_in_entryRuleOperationDeclaration2645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDeclaration2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_ruleOperationDeclaration2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationDefinition_in_entryRuleOperationDefinition2737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationDefinition2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOperationDefinition2793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperationDefinition2810 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleOperationDefinition2827 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition2849 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleOperationDefinition2862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperationDefinition2883 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_33_in_ruleOperationDefinition2899 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleOperationDefinition2912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperationDefinition2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter3025 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleParameter3042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleParameter3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntrypoint_in_entryRuleEntrypoint3101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntrypoint3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleEntrypoint3157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntrypoint3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitpoint_in_entryRuleExitpoint3215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitpoint3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleExitpoint3271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExitpoint3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN3330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3381 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleFQN3400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3415 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleLocalReaction_in_entryRuleLocalReaction3464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalReaction3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_ruleLocalReaction3520 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLocalReaction3552 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleReactionEffect_in_ruleLocalReaction3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionTrigger_in_entryRuleReactionTrigger3611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionTrigger3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSpec_in_ruleReactionTrigger3678 = new BitSet(new long[]{0x0000002100000002L});
    public static final BitSet FOLLOW_32_in_ruleReactionTrigger3691 = new BitSet(new long[]{0x0C003F0000000010L});
    public static final BitSet FOLLOW_ruleEventSpec_in_ruleReactionTrigger3712 = new BitSet(new long[]{0x0000002100000002L});
    public static final BitSet FOLLOW_37_in_ruleReactionTrigger3735 = new BitSet(new long[]{0x00620000800003F0L,0x0000000000001300L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger3757 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleReactionTrigger3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleReactionTrigger3791 = new BitSet(new long[]{0x00620000800003F0L,0x0000000000001300L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReactionTrigger3812 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleReactionTrigger3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReactionProperty_in_entryRuleReactionProperty3864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReactionProperty3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_ruleReactionProperty3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_ruleReactionProperty3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryPointSpec_in_entryRuleEntryPointSpec3983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryPointSpec3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEntryPointSpec4030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEntryPointSpec4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitPointSpec_in_entryRuleExitPointSpec4089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitPointSpec4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleExitPointSpec4147 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleExitPointSpec4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSpec_in_entryRuleEventSpec4195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventSpec4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_ruleEventSpec4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_ruleEventSpec4279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_ruleEventSpec4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegularEventSpec_in_entryRuleRegularEventSpec4341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegularEventSpec4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleRegularEventSpec4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventSpec_in_entryRuleTimeEventSpec4431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeEventSpec4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeEventType_in_ruleTimeEventSpec4487 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeEventSpec4504 = new BitSet(new long[]{0x0000000000000002L,0x00000000003C0000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeEventSpec4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinEventSpec_in_entryRuleBuiltinEventSpec4567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinEventSpec4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_ruleBuiltinEventSpec4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_ruleBuiltinEventSpec4651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCycleEvent_in_ruleBuiltinEventSpec4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_ruleBuiltinEventSpec4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultEvent_in_ruleBuiltinEventSpec4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryEvent_in_entryRuleEntryEvent4767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryEvent4777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleEntryEvent4823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitEvent_in_entryRuleExitEvent4859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitEvent4869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleExitEvent4915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnCycleEvent_in_entryRuleOnCycleEvent4951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnCycleEvent4961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOnCycleEvent5007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlwaysEvent_in_entryRuleAlwaysEvent5043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlwaysEvent5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAlwaysEvent5099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultEvent_in_entryRuleDefaultEvent5135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultEvent5145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDefaultEvent5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDefaultEvent5210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression5251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression5261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpression5307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression5341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression5351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression5398 = new BitSet(new long[]{0xF000000020000002L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleAssignmentExpression5428 = new BitSet(new long[]{0x00620000800003F0L,0x0000000000001300L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleAssignmentExpression5449 = new BitSet(new long[]{0xF000000020000002L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression5487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression5497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression5544 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleConditionalExpression5565 = new BitSet(new long[]{0x00620000800003F0L,0x0000000000001300L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression5586 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleConditionalExpression5598 = new BitSet(new long[]{0x00620000800003F0L,0x0000000000001300L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConditionalExpression5619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression5657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression5667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression5714 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleLogicalOrExpression5735 = new BitSet(new long[]{0x00620000800003F0L,0x0000000000001300L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression5756 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression5794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression5851 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleLogicalAndExpression5872 = new BitSet(new long[]{0x00620000800003F0L,0x0000000000001300L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_ruleLogicalAndExpression5893 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleLogicalNotExpression_in_entryRuleLogicalNotExpression5931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalNotExpression5941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression5988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleLogicalNotExpression6015 = new BitSet(new long[]{0x00600000800003F0L,0x0000000000001300L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleLogicalNotExpression6036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression6073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression6083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression6130 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleBitwiseXorExpression6151 = new BitSet(new long[]{0x00600000800003F0L,0x0000000000001300L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleBitwiseXorExpression6172 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression6210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression6220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression6267 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleBitwiseOrExpression6288 = new BitSet(new long[]{0x00600000800003F0L,0x0000000000001300L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression6309 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression6347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression6357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression6404 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleBitwiseAndExpression6425 = new BitSet(new long[]{0x00600000800003F0L,0x0000000000001300L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_ruleBitwiseAndExpression6446 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleLogicalRelationExpression_in_entryRuleLogicalRelationExpression6484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalRelationExpression6494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression6541 = new BitSet(new long[]{0x0000008000000002L,0x000000000003E000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleLogicalRelationExpression6571 = new BitSet(new long[]{0x00600000800003F0L,0x0000000000001300L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleLogicalRelationExpression6592 = new BitSet(new long[]{0x0000008000000002L,0x000000000003E000L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression6630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression6640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression6687 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression6717 = new BitSet(new long[]{0x00600000800003F0L,0x0000000000001300L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_ruleShiftExpression6738 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleNumericalAddSubtractExpression_in_entryRuleNumericalAddSubtractExpression6776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalAddSubtractExpression6786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression6833 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleNumericalAddSubtractExpression6863 = new BitSet(new long[]{0x00600000800003F0L,0x0000000000001300L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_ruleNumericalAddSubtractExpression6884 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleNumericalMultiplyDivideExpression_in_entryRuleNumericalMultiplyDivideExpression6922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalMultiplyDivideExpression6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression6979 = new BitSet(new long[]{0x0000000000080002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleNumericalMultiplyDivideExpression7009 = new BitSet(new long[]{0x00600000800003F0L,0x0000000000001300L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_ruleNumericalMultiplyDivideExpression7030 = new BitSet(new long[]{0x0000000000080002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleNumericalUnaryExpression_in_entryRuleNumericalUnaryExpression7068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericalUnaryExpression7078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression7125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleNumericalUnaryExpression7161 = new BitSet(new long[]{0x00600000800003F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNumericalUnaryExpression7182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression7219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression7229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_rulePrimaryExpression7276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression7303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_rulePrimaryExpression7330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_rulePrimaryExpression7357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePrimaryExpression7375 = new BitSet(new long[]{0x00620000800003F0L,0x0000000000001300L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression7397 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulePrimaryExpression7408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValueExpression_in_entryRulePrimitiveValueExpression7445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValueExpression7455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimitiveValueExpression7510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall7546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall7556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_ruleFeatureCall7603 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleFeatureCall7624 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureCall7644 = new BitSet(new long[]{0x0000001080000002L});
    public static final BitSet FOLLOW_31_in_ruleFeatureCall7678 = new BitSet(new long[]{0x00620002800003F0L,0x0000000000001300L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall7713 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleFeatureCall7726 = new BitSet(new long[]{0x00620000800003F0L,0x0000000000001300L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall7747 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_33_in_ruleFeatureCall7763 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleElementReferenceExpression_in_entryRuleElementReferenceExpression7803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementReferenceExpression7813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementReferenceExpression7867 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleElementReferenceExpression7901 = new BitSet(new long[]{0x00620002800003F0L,0x0000000000001300L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression7936 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleElementReferenceExpression7949 = new BitSet(new long[]{0x00620000800003F0L,0x0000000000001300L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleElementReferenceExpression7970 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_33_in_ruleElementReferenceExpression7986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventValueReferenceExpression_in_entryRuleEventValueReferenceExpression8024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventValueReferenceExpression8034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleEventValueReferenceExpression8080 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEventValueReferenceExpression8092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleEventValueReferenceExpression8113 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEventValueReferenceExpression8125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActiveStateReferenceExpression_in_entryRuleActiveStateReferenceExpression8161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActiveStateReferenceExpression8171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleActiveStateReferenceExpression8217 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleActiveStateReferenceExpression8229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActiveStateReferenceExpression8252 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleActiveStateReferenceExpression8264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral8300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral8310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral8357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral8384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_ruleLiteral8411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleLiteral8438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral8465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral8500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral8510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral8561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral8602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral8612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral8663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral8704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral8714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleRealLiteral8765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexLiteral_in_entryRuleHexLiteral8806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexLiteral8816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleHexLiteral8867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral8908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral8918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral8969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleDirection9024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleDirection9041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleDirection9058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleTimeEventType9103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTimeEventType9120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleAssignmentOperator9165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleAssignmentOperator9182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleAssignmentOperator9199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleAssignmentOperator9216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleAssignmentOperator9233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleAssignmentOperator9250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleAssignmentOperator9267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleAssignmentOperator9284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleAssignmentOperator9301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleAssignmentOperator9318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleAssignmentOperator9335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleShiftOperator9380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleShiftOperator9397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleAdditiveOperator9442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleAdditiveOperator9459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleMultiplicativeOperator9504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleMultiplicativeOperator9521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleMultiplicativeOperator9538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleUnaryOperator9583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleUnaryOperator9600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleUnaryOperator9617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleRelationalOperator9662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleRelationalOperator9679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleRelationalOperator9696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleRelationalOperator9713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleRelationalOperator9730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleRelationalOperator9747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleTimeUnit9792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleTimeUnit9809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleTimeUnit9826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleTimeUnit9843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred2_InternalKidsexp3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred3_InternalKidsexp7660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred4_InternalKidsexp7883 = new BitSet(new long[]{0x0000000000000002L});

}
