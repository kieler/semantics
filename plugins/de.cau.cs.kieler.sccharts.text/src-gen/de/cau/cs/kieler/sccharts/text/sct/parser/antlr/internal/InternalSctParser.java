package de.cau.cs.kieler.sccharts.text.sct.parser.antlr.internal; 

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
import de.cau.cs.kieler.sccharts.text.sct.services.SctGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSctParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_HOSTCODE", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'region'", "':'", "'='", "';'", "'.'", "'scchart'", "'references'", "'bind'", "','", "'{'", "'}'", "'initial'", "'final'", "'state'", "'('", "')'", "'node'", "'returns'", "'ref'", "'immediate'", "'deferred'", "'with'", "'/'", "'to'", "'entry'", "'during'", "'exit'", "'weak'", "'suspend'", "'iterate'", "'expression'", "'const'", "'extern'", "'volatile'", "'input'", "'output'", "'static'", "'signal'", "'['", "']'", "'combine'", "'<'", "'()'", "'>'", "'!'", "'&'", "'@'", "'#'", "'-'", "'normal'", "'connector'", "'reference'", "'textual'", "'-->'", "'o->'", "'>->'", "'reset'", "'shallow history'", "'history'", "'+='", "'-='", "'*='", "'/='", "'++'", "'--'", "'=='", "'<='", "'>='", "'!='", "'pre'", "'|'", "'+'", "'*'", "'%'", "'val'", "'||'", "'&&'", "'pure'", "'bool'", "'unsigned'", "'int'", "'float'", "'string'", "'host'", "'none'", "'max'", "'min'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=8;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_BOOLEAN=9;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int RULE_HOSTCODE=7;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_NUMBER=12;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalSctParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSctParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSctParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSct.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private SctGrammarAccess grammarAccess;
     	
        public InternalSctParser(TokenStream input, SctGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Root";	
       	}
       	
       	@Override
       	protected SctGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRoot"
    // InternalSct.g:74:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalSct.g:75:2: (iv_ruleRoot= ruleRoot EOF )
            // InternalSct.g:76:2: iv_ruleRoot= ruleRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRootRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoot; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSct.g:83:1: ruleRoot returns [EObject current=null] : this_SCChart_0= ruleSCChart ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject this_SCChart_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:86:28: (this_SCChart_0= ruleSCChart )
            // InternalSct.g:88:2: this_SCChart_0= ruleSCChart
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRootAccess().getSCChartParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_SCChart_0=ruleSCChart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SCChart_0; 
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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleSingleControlflowRegion"
    // InternalSct.g:107:1: entryRuleSingleControlflowRegion returns [EObject current=null] : iv_ruleSingleControlflowRegion= ruleSingleControlflowRegion EOF ;
    public final EObject entryRuleSingleControlflowRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleControlflowRegion = null;


        try {
            // InternalSct.g:108:2: (iv_ruleSingleControlflowRegion= ruleSingleControlflowRegion EOF )
            // InternalSct.g:109:2: iv_ruleSingleControlflowRegion= ruleSingleControlflowRegion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleControlflowRegionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSingleControlflowRegion=ruleSingleControlflowRegion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleControlflowRegion; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleControlflowRegion"


    // $ANTLR start "ruleSingleControlflowRegion"
    // InternalSct.g:116:1: ruleSingleControlflowRegion returns [EObject current=null] : ( () ( (lv_states_1_0= ruleState ) )+ ) ;
    public final EObject ruleSingleControlflowRegion() throws RecognitionException {
        EObject current = null;

        EObject lv_states_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:119:28: ( ( () ( (lv_states_1_0= ruleState ) )+ ) )
            // InternalSct.g:120:1: ( () ( (lv_states_1_0= ruleState ) )+ )
            {
            // InternalSct.g:120:1: ( () ( (lv_states_1_0= ruleState ) )+ )
            // InternalSct.g:120:2: () ( (lv_states_1_0= ruleState ) )+
            {
            // InternalSct.g:120:2: ()
            // InternalSct.g:121:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleControlflowRegionAccess().getControlflowRegionAction_0(),
                          current);
                  
            }

            }

            // InternalSct.g:129:2: ( (lv_states_1_0= ruleState ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalSct.g:130:1: (lv_states_1_0= ruleState )
            	    {
            	    // InternalSct.g:130:1: (lv_states_1_0= ruleState )
            	    // InternalSct.g:131:3: lv_states_1_0= ruleState
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSingleControlflowRegionAccess().getStatesStateParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_states_1_0=ruleState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSingleControlflowRegionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"states",
            	              		lv_states_1_0, 
            	              		"de.cau.cs.kieler.sccharts.text.sct.Sct.State");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // $ANTLR end "ruleSingleControlflowRegion"


    // $ANTLR start "entryRuleSingleDataflowRegion"
    // InternalSct.g:155:1: entryRuleSingleDataflowRegion returns [EObject current=null] : iv_ruleSingleDataflowRegion= ruleSingleDataflowRegion EOF ;
    public final EObject entryRuleSingleDataflowRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleDataflowRegion = null;


        try {
            // InternalSct.g:156:2: (iv_ruleSingleDataflowRegion= ruleSingleDataflowRegion EOF )
            // InternalSct.g:157:2: iv_ruleSingleDataflowRegion= ruleSingleDataflowRegion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleDataflowRegionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSingleDataflowRegion=ruleSingleDataflowRegion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleDataflowRegion; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleDataflowRegion"


    // $ANTLR start "ruleSingleDataflowRegion"
    // InternalSct.g:164:1: ruleSingleDataflowRegion returns [EObject current=null] : ( () ( ( (lv_equations_1_0= ruleEquation ) ) | ( (lv_nodes_2_0= ruleNode ) ) )+ ) ;
    public final EObject ruleSingleDataflowRegion() throws RecognitionException {
        EObject current = null;

        EObject lv_equations_1_0 = null;

        EObject lv_nodes_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:167:28: ( ( () ( ( (lv_equations_1_0= ruleEquation ) ) | ( (lv_nodes_2_0= ruleNode ) ) )+ ) )
            // InternalSct.g:168:1: ( () ( ( (lv_equations_1_0= ruleEquation ) ) | ( (lv_nodes_2_0= ruleNode ) ) )+ )
            {
            // InternalSct.g:168:1: ( () ( ( (lv_equations_1_0= ruleEquation ) ) | ( (lv_nodes_2_0= ruleNode ) ) )+ )
            // InternalSct.g:168:2: () ( ( (lv_equations_1_0= ruleEquation ) ) | ( (lv_nodes_2_0= ruleNode ) ) )+
            {
            // InternalSct.g:168:2: ()
            // InternalSct.g:169:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleDataflowRegionAccess().getDataflowRegionAction_0(),
                          current);
                  
            }

            }

            // InternalSct.g:177:2: ( ( (lv_equations_1_0= ruleEquation ) ) | ( (lv_nodes_2_0= ruleNode ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==18) ) {
                        switch ( input.LA(3) ) {
                        case RULE_ID:
                            {
                            int LA2_5 = input.LA(4);

                            if ( (LA2_5==17||(LA2_5>=19 && LA2_5<=20)||LA2_5==54||LA2_5==57||LA2_5==59||LA2_5==61||LA2_5==64||(LA2_5>=81 && LA2_5<=84)||(LA2_5>=86 && LA2_5<=89)||(LA2_5>=91 && LA2_5<=92)) ) {
                                alt2=1;
                            }
                            else if ( (LA2_5==30) ) {
                                alt2=2;
                            }


                            }
                            break;
                        case RULE_STRING:
                        case RULE_INT:
                        case RULE_HOSTCODE:
                        case RULE_FLOAT:
                        case RULE_BOOLEAN:
                        case 30:
                        case 57:
                        case 60:
                        case 64:
                        case 85:
                        case 90:
                            {
                            alt2=1;
                            }
                            break;
                        case 34:
                            {
                            alt2=2;
                            }
                            break;

                        }

                    }
                    else if ( (LA2_2==RULE_STRING) ) {
                        alt2=2;
                    }


                }
                else if ( (LA2_0==32) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSct.g:177:3: ( (lv_equations_1_0= ruleEquation ) )
            	    {
            	    // InternalSct.g:177:3: ( (lv_equations_1_0= ruleEquation ) )
            	    // InternalSct.g:178:1: (lv_equations_1_0= ruleEquation )
            	    {
            	    // InternalSct.g:178:1: (lv_equations_1_0= ruleEquation )
            	    // InternalSct.g:179:3: lv_equations_1_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSingleDataflowRegionAccess().getEquationsEquationParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_equations_1_0=ruleEquation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSingleDataflowRegionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"equations",
            	              		lv_equations_1_0, 
            	              		"de.cau.cs.kieler.sccharts.text.sct.Sct.Equation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSct.g:196:6: ( (lv_nodes_2_0= ruleNode ) )
            	    {
            	    // InternalSct.g:196:6: ( (lv_nodes_2_0= ruleNode ) )
            	    // InternalSct.g:197:1: (lv_nodes_2_0= ruleNode )
            	    {
            	    // InternalSct.g:197:1: (lv_nodes_2_0= ruleNode )
            	    // InternalSct.g:198:3: lv_nodes_2_0= ruleNode
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSingleDataflowRegionAccess().getNodesNodeParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_nodes_2_0=ruleNode();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSingleDataflowRegionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"nodes",
            	              		lv_nodes_2_0, 
            	              		"de.cau.cs.kieler.sccharts.text.sct.Sct.Node");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "ruleSingleDataflowRegion"


    // $ANTLR start "entryRuleControlflowRegion"
    // InternalSct.g:222:1: entryRuleControlflowRegion returns [EObject current=null] : iv_ruleControlflowRegion= ruleControlflowRegion EOF ;
    public final EObject entryRuleControlflowRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlflowRegion = null;


        try {
            // InternalSct.g:223:2: (iv_ruleControlflowRegion= ruleControlflowRegion EOF )
            // InternalSct.g:224:2: iv_ruleControlflowRegion= ruleControlflowRegion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getControlflowRegionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleControlflowRegion=ruleControlflowRegion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleControlflowRegion; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleControlflowRegion"


    // $ANTLR start "ruleControlflowRegion"
    // InternalSct.g:231:1: ruleControlflowRegion returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* ( (lv_states_7_0= ruleState ) )+ ) ;
    public final EObject ruleControlflowRegion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_declarations_6_0 = null;

        EObject lv_states_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:234:28: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* ( (lv_states_7_0= ruleState ) )+ ) )
            // InternalSct.g:235:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* ( (lv_states_7_0= ruleState ) )+ )
            {
            // InternalSct.g:235:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* ( (lv_states_7_0= ruleState ) )+ )
            // InternalSct.g:235:2: () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* ( (lv_states_7_0= ruleState ) )+
            {
            // InternalSct.g:235:2: ()
            // InternalSct.g:236:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getControlflowRegionAccess().getControlflowRegionAction_0(),
                          current);
                  
            }

            }

            // InternalSct.g:244:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_COMMENT_ANNOTATION||LA3_0==62) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSct.g:245:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:245:1: (lv_annotations_1_0= ruleAnnotation )
            	    // InternalSct.g:246:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getControlflowRegionAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_annotations_1_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getControlflowRegionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_1_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getControlflowRegionAccess().getRegionKeyword_2());
                  
            }
            // InternalSct.g:266:1: ( (lv_id_3_0= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSct.g:267:1: (lv_id_3_0= RULE_ID )
                    {
                    // InternalSct.g:267:1: (lv_id_3_0= RULE_ID )
                    // InternalSct.g:268:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_3_0, grammarAccess.getControlflowRegionAccess().getIdIDTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getControlflowRegionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"id",
                              		lv_id_3_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:284:3: ( (lv_label_4_0= RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSct.g:285:1: (lv_label_4_0= RULE_STRING )
                    {
                    // InternalSct.g:285:1: (lv_label_4_0= RULE_STRING )
                    // InternalSct.g:286:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_4_0, grammarAccess.getControlflowRegionAccess().getLabelSTRINGTerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getControlflowRegionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"label",
                              		lv_label_4_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getControlflowRegionAccess().getColonKeyword_5());
                  
            }
            // InternalSct.g:306:1: ( (lv_declarations_6_0= ruleDeclaration ) )*
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // InternalSct.g:307:1: (lv_declarations_6_0= ruleDeclaration )
            	    {
            	    // InternalSct.g:307:1: (lv_declarations_6_0= ruleDeclaration )
            	    // InternalSct.g:308:3: lv_declarations_6_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getControlflowRegionAccess().getDeclarationsDeclarationParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_declarations_6_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getControlflowRegionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_6_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalSct.g:324:3: ( (lv_states_7_0= ruleState ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // InternalSct.g:325:1: (lv_states_7_0= ruleState )
            	    {
            	    // InternalSct.g:325:1: (lv_states_7_0= ruleState )
            	    // InternalSct.g:326:3: lv_states_7_0= ruleState
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getControlflowRegionAccess().getStatesStateParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_states_7_0=ruleState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getControlflowRegionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"states",
            	              		lv_states_7_0, 
            	              		"de.cau.cs.kieler.sccharts.text.sct.Sct.State");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // $ANTLR end "ruleControlflowRegion"


    // $ANTLR start "entryRuleEquation"
    // InternalSct.g:352:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // InternalSct.g:353:2: (iv_ruleEquation= ruleEquation EOF )
            // InternalSct.g:354:2: iv_ruleEquation= ruleEquation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEquationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEquation=ruleEquation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquation"


    // $ANTLR start "ruleEquation"
    // InternalSct.g:361:1: ruleEquation returns [EObject current=null] : ( () ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_expression_9_0= ruleValuedObjectReference ) ) otherlv_10= ';' ) ) ) ;
    public final EObject ruleEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_expression_3_0 = null;

        EObject lv_expression_9_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:364:28: ( ( () ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_expression_9_0= ruleValuedObjectReference ) ) otherlv_10= ';' ) ) ) )
            // InternalSct.g:365:1: ( () ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_expression_9_0= ruleValuedObjectReference ) ) otherlv_10= ';' ) ) )
            {
            // InternalSct.g:365:1: ( () ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_expression_9_0= ruleValuedObjectReference ) ) otherlv_10= ';' ) ) )
            // InternalSct.g:365:2: () ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_expression_9_0= ruleValuedObjectReference ) ) otherlv_10= ';' ) )
            {
            // InternalSct.g:365:2: ()
            // InternalSct.g:366:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEquationAccess().getEquationAction_0(),
                          current);
                  
            }

            }

            // InternalSct.g:374:2: ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_expression_9_0= ruleValuedObjectReference ) ) otherlv_10= ';' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==18) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==RULE_ID) ) {
                        int LA8_3 = input.LA(4);

                        if ( (LA8_3==17||LA8_3==19||LA8_3==54||LA8_3==57||LA8_3==59||LA8_3==61||LA8_3==64||(LA8_3>=81 && LA8_3<=84)||(LA8_3>=86 && LA8_3<=89)||(LA8_3>=91 && LA8_3<=92)) ) {
                            alt8=1;
                        }
                        else if ( (LA8_3==20) ) {
                            alt8=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA8_2>=RULE_STRING && LA8_2<=RULE_BOOLEAN)||LA8_2==30||LA8_2==57||LA8_2==60||LA8_2==64||LA8_2==85||LA8_2==90) ) {
                        alt8=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSct.g:374:3: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' )
                    {
                    // InternalSct.g:374:3: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' )
                    // InternalSct.g:374:4: ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';'
                    {
                    // InternalSct.g:374:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSct.g:375:1: (otherlv_1= RULE_ID )
                    {
                    // InternalSct.g:375:1: (otherlv_1= RULE_ID )
                    // InternalSct.g:376:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEquationRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getEquationAccess().getValuedObjectValuedObjectCrossReference_1_0_0_0()); 
                      	
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEquationAccess().getEqualsSignKeyword_1_0_1());
                          
                    }
                    // InternalSct.g:394:1: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalSct.g:395:1: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalSct.g:395:1: (lv_expression_3_0= ruleExpression )
                    // InternalSct.g:396:3: lv_expression_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEquationAccess().getExpressionExpressionParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_expression_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEquationRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEquationAccess().getSemicolonKeyword_1_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:417:6: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_expression_9_0= ruleValuedObjectReference ) ) otherlv_10= ';' )
                    {
                    // InternalSct.g:417:6: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_expression_9_0= ruleValuedObjectReference ) ) otherlv_10= ';' )
                    // InternalSct.g:417:7: ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_expression_9_0= ruleValuedObjectReference ) ) otherlv_10= ';'
                    {
                    // InternalSct.g:417:7: ( (otherlv_5= RULE_ID ) )
                    // InternalSct.g:418:1: (otherlv_5= RULE_ID )
                    {
                    // InternalSct.g:418:1: (otherlv_5= RULE_ID )
                    // InternalSct.g:419:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEquationRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getEquationAccess().getValuedObjectValuedObjectCrossReference_1_1_0_0()); 
                      	
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEquationAccess().getEqualsSignKeyword_1_1_1());
                          
                    }
                    // InternalSct.g:437:1: ( (otherlv_7= RULE_ID ) )
                    // InternalSct.g:438:1: (otherlv_7= RULE_ID )
                    {
                    // InternalSct.g:438:1: (otherlv_7= RULE_ID )
                    // InternalSct.g:439:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEquationRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getEquationAccess().getNodeNodeCrossReference_1_1_2_0()); 
                      	
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEquationAccess().getFullStopKeyword_1_1_3());
                          
                    }
                    // InternalSct.g:457:1: ( (lv_expression_9_0= ruleValuedObjectReference ) )
                    // InternalSct.g:458:1: (lv_expression_9_0= ruleValuedObjectReference )
                    {
                    // InternalSct.g:458:1: (lv_expression_9_0= ruleValuedObjectReference )
                    // InternalSct.g:459:3: lv_expression_9_0= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEquationAccess().getExpressionValuedObjectReferenceParserRuleCall_1_1_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_expression_9_0=ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEquationRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_9_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getEquationAccess().getSemicolonKeyword_1_1_5());
                          
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
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleSCChart"
    // InternalSct.g:487:1: entryRuleSCChart returns [EObject current=null] : iv_ruleSCChart= ruleSCChart EOF ;
    public final EObject entryRuleSCChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSCChart = null;


        try {
            // InternalSct.g:488:2: (iv_ruleSCChart= ruleSCChart EOF )
            // InternalSct.g:489:2: iv_ruleSCChart= ruleSCChart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSCChartRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSCChart=ruleSCChart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSCChart; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSCChart"


    // $ANTLR start "ruleSCChart"
    // InternalSct.g:496:1: ruleSCChart returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'scchart' ( (lv_id_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? ( (otherlv_4= 'references' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'bind' ( (lv_bindings_7_0= ruleBinding ) ) (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )* )? ) | (otherlv_10= '{' ( ( (lv_declarations_11_0= ruleDeclaration ) ) | ( (lv_localActions_12_0= ruleLocalAction ) ) )* ( ( (lv_regions_13_0= ruleSingleControlflowRegion ) )? ( (lv_regions_14_0= ruleRegion ) )* )? otherlv_15= '}' ) )? ) ;
    public final EObject ruleSCChart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_15=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_bindings_7_0 = null;

        EObject lv_bindings_9_0 = null;

        EObject lv_declarations_11_0 = null;

        EObject lv_localActions_12_0 = null;

        EObject lv_regions_13_0 = null;

        EObject lv_regions_14_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:499:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'scchart' ( (lv_id_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? ( (otherlv_4= 'references' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'bind' ( (lv_bindings_7_0= ruleBinding ) ) (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )* )? ) | (otherlv_10= '{' ( ( (lv_declarations_11_0= ruleDeclaration ) ) | ( (lv_localActions_12_0= ruleLocalAction ) ) )* ( ( (lv_regions_13_0= ruleSingleControlflowRegion ) )? ( (lv_regions_14_0= ruleRegion ) )* )? otherlv_15= '}' ) )? ) )
            // InternalSct.g:500:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'scchart' ( (lv_id_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? ( (otherlv_4= 'references' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'bind' ( (lv_bindings_7_0= ruleBinding ) ) (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )* )? ) | (otherlv_10= '{' ( ( (lv_declarations_11_0= ruleDeclaration ) ) | ( (lv_localActions_12_0= ruleLocalAction ) ) )* ( ( (lv_regions_13_0= ruleSingleControlflowRegion ) )? ( (lv_regions_14_0= ruleRegion ) )* )? otherlv_15= '}' ) )? )
            {
            // InternalSct.g:500:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'scchart' ( (lv_id_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? ( (otherlv_4= 'references' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'bind' ( (lv_bindings_7_0= ruleBinding ) ) (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )* )? ) | (otherlv_10= '{' ( ( (lv_declarations_11_0= ruleDeclaration ) ) | ( (lv_localActions_12_0= ruleLocalAction ) ) )* ( ( (lv_regions_13_0= ruleSingleControlflowRegion ) )? ( (lv_regions_14_0= ruleRegion ) )* )? otherlv_15= '}' ) )? )
            // InternalSct.g:500:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'scchart' ( (lv_id_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? ( (otherlv_4= 'references' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'bind' ( (lv_bindings_7_0= ruleBinding ) ) (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )* )? ) | (otherlv_10= '{' ( ( (lv_declarations_11_0= ruleDeclaration ) ) | ( (lv_localActions_12_0= ruleLocalAction ) ) )* ( ( (lv_regions_13_0= ruleSingleControlflowRegion ) )? ( (lv_regions_14_0= ruleRegion ) )* )? otherlv_15= '}' ) )?
            {
            // InternalSct.g:500:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMMENT_ANNOTATION||LA9_0==62) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSct.g:501:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:501:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:502:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSCChartAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSCChartRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSCChartAccess().getScchartKeyword_1());
                  
            }
            // InternalSct.g:522:1: ( (lv_id_2_0= RULE_ID ) )
            // InternalSct.g:523:1: (lv_id_2_0= RULE_ID )
            {
            // InternalSct.g:523:1: (lv_id_2_0= RULE_ID )
            // InternalSct.g:524:3: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_2_0, grammarAccess.getSCChartAccess().getIdIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSCChartRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_2_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalSct.g:540:2: ( (lv_label_3_0= RULE_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSct.g:541:1: (lv_label_3_0= RULE_STRING )
                    {
                    // InternalSct.g:541:1: (lv_label_3_0= RULE_STRING )
                    // InternalSct.g:542:3: lv_label_3_0= RULE_STRING
                    {
                    lv_label_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_3_0, grammarAccess.getSCChartAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSCChartRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"label",
                              		lv_label_3_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:558:3: ( (otherlv_4= 'references' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'bind' ( (lv_bindings_7_0= ruleBinding ) ) (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )* )? ) | (otherlv_10= '{' ( ( (lv_declarations_11_0= ruleDeclaration ) ) | ( (lv_localActions_12_0= ruleLocalAction ) ) )* ( ( (lv_regions_13_0= ruleSingleControlflowRegion ) )? ( (lv_regions_14_0= ruleRegion ) )* )? otherlv_15= '}' ) )?
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            else if ( (LA17_0==25) ) {
                alt17=2;
            }
            switch (alt17) {
                case 1 :
                    // InternalSct.g:558:4: (otherlv_4= 'references' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'bind' ( (lv_bindings_7_0= ruleBinding ) ) (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )* )? )
                    {
                    // InternalSct.g:558:4: (otherlv_4= 'references' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'bind' ( (lv_bindings_7_0= ruleBinding ) ) (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )* )? )
                    // InternalSct.g:558:6: otherlv_4= 'references' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'bind' ( (lv_bindings_7_0= ruleBinding ) ) (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )* )?
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSCChartAccess().getReferencesKeyword_4_0_0());
                          
                    }
                    // InternalSct.g:562:1: ( (otherlv_5= RULE_ID ) )
                    // InternalSct.g:563:1: (otherlv_5= RULE_ID )
                    {
                    // InternalSct.g:563:1: (otherlv_5= RULE_ID )
                    // InternalSct.g:564:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSCChartRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getSCChartAccess().getReferencedScopeStateCrossReference_4_0_1_0()); 
                      	
                    }

                    }


                    }

                    // InternalSct.g:578:2: (otherlv_6= 'bind' ( (lv_bindings_7_0= ruleBinding ) ) (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )* )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==23) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalSct.g:578:4: otherlv_6= 'bind' ( (lv_bindings_7_0= ruleBinding ) ) (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )*
                            {
                            otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getSCChartAccess().getBindKeyword_4_0_2_0());
                                  
                            }
                            // InternalSct.g:582:1: ( (lv_bindings_7_0= ruleBinding ) )
                            // InternalSct.g:583:1: (lv_bindings_7_0= ruleBinding )
                            {
                            // InternalSct.g:583:1: (lv_bindings_7_0= ruleBinding )
                            // InternalSct.g:584:3: lv_bindings_7_0= ruleBinding
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSCChartAccess().getBindingsBindingParserRuleCall_4_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_21);
                            lv_bindings_7_0=ruleBinding();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSCChartRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"bindings",
                                      		lv_bindings_7_0, 
                                      		"de.cau.cs.kieler.sccharts.text.sct.Sct.Binding");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalSct.g:600:2: (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )*
                            loop11:
                            do {
                                int alt11=2;
                                int LA11_0 = input.LA(1);

                                if ( (LA11_0==24) ) {
                                    alt11=1;
                                }


                                switch (alt11) {
                            	case 1 :
                            	    // InternalSct.g:600:4: otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) )
                            	    {
                            	    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_20); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_8, grammarAccess.getSCChartAccess().getCommaKeyword_4_0_2_2_0());
                            	          
                            	    }
                            	    // InternalSct.g:604:1: ( (lv_bindings_9_0= ruleBinding ) )
                            	    // InternalSct.g:605:1: (lv_bindings_9_0= ruleBinding )
                            	    {
                            	    // InternalSct.g:605:1: (lv_bindings_9_0= ruleBinding )
                            	    // InternalSct.g:606:3: lv_bindings_9_0= ruleBinding
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getSCChartAccess().getBindingsBindingParserRuleCall_4_0_2_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_21);
                            	    lv_bindings_9_0=ruleBinding();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getSCChartRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"bindings",
                            	              		lv_bindings_9_0, 
                            	              		"de.cau.cs.kieler.sccharts.text.sct.Sct.Binding");
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


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:623:6: (otherlv_10= '{' ( ( (lv_declarations_11_0= ruleDeclaration ) ) | ( (lv_localActions_12_0= ruleLocalAction ) ) )* ( ( (lv_regions_13_0= ruleSingleControlflowRegion ) )? ( (lv_regions_14_0= ruleRegion ) )* )? otherlv_15= '}' )
                    {
                    // InternalSct.g:623:6: (otherlv_10= '{' ( ( (lv_declarations_11_0= ruleDeclaration ) ) | ( (lv_localActions_12_0= ruleLocalAction ) ) )* ( ( (lv_regions_13_0= ruleSingleControlflowRegion ) )? ( (lv_regions_14_0= ruleRegion ) )* )? otherlv_15= '}' )
                    // InternalSct.g:623:8: otherlv_10= '{' ( ( (lv_declarations_11_0= ruleDeclaration ) ) | ( (lv_localActions_12_0= ruleLocalAction ) ) )* ( ( (lv_regions_13_0= ruleSingleControlflowRegion ) )? ( (lv_regions_14_0= ruleRegion ) )* )? otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getSCChartAccess().getLeftCurlyBracketKeyword_4_1_0());
                          
                    }
                    // InternalSct.g:627:1: ( ( (lv_declarations_11_0= ruleDeclaration ) ) | ( (lv_localActions_12_0= ruleLocalAction ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        alt13 = dfa13.predict(input);
                        switch (alt13) {
                    	case 1 :
                    	    // InternalSct.g:627:2: ( (lv_declarations_11_0= ruleDeclaration ) )
                    	    {
                    	    // InternalSct.g:627:2: ( (lv_declarations_11_0= ruleDeclaration ) )
                    	    // InternalSct.g:628:1: (lv_declarations_11_0= ruleDeclaration )
                    	    {
                    	    // InternalSct.g:628:1: (lv_declarations_11_0= ruleDeclaration )
                    	    // InternalSct.g:629:3: lv_declarations_11_0= ruleDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSCChartAccess().getDeclarationsDeclarationParserRuleCall_4_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_22);
                    	    lv_declarations_11_0=ruleDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSCChartRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declarations",
                    	              		lv_declarations_11_0, 
                    	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Declaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSct.g:646:6: ( (lv_localActions_12_0= ruleLocalAction ) )
                    	    {
                    	    // InternalSct.g:646:6: ( (lv_localActions_12_0= ruleLocalAction ) )
                    	    // InternalSct.g:647:1: (lv_localActions_12_0= ruleLocalAction )
                    	    {
                    	    // InternalSct.g:647:1: (lv_localActions_12_0= ruleLocalAction )
                    	    // InternalSct.g:648:3: lv_localActions_12_0= ruleLocalAction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSCChartAccess().getLocalActionsLocalActionParserRuleCall_4_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_22);
                    	    lv_localActions_12_0=ruleLocalAction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSCChartRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"localActions",
                    	              		lv_localActions_12_0, 
                    	              		"de.cau.cs.kieler.sccharts.text.sct.Sct.LocalAction");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // InternalSct.g:664:4: ( ( (lv_regions_13_0= ruleSingleControlflowRegion ) )? ( (lv_regions_14_0= ruleRegion ) )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_COMMENT_ANNOTATION||LA16_0==16||(LA16_0>=27 && LA16_0<=29)||LA16_0==62||(LA16_0>=65 && LA16_0<=68)) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==26) ) {
                        int LA16_2 = input.LA(2);

                        if ( (synpred19_InternalSct()) ) {
                            alt16=1;
                        }
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalSct.g:664:5: ( (lv_regions_13_0= ruleSingleControlflowRegion ) )? ( (lv_regions_14_0= ruleRegion ) )*
                            {
                            // InternalSct.g:664:5: ( (lv_regions_13_0= ruleSingleControlflowRegion ) )?
                            int alt14=2;
                            alt14 = dfa14.predict(input);
                            switch (alt14) {
                                case 1 :
                                    // InternalSct.g:665:1: (lv_regions_13_0= ruleSingleControlflowRegion )
                                    {
                                    // InternalSct.g:665:1: (lv_regions_13_0= ruleSingleControlflowRegion )
                                    // InternalSct.g:666:3: lv_regions_13_0= ruleSingleControlflowRegion
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsSingleControlflowRegionParserRuleCall_4_1_2_0_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_23);
                                    lv_regions_13_0=ruleSingleControlflowRegion();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getSCChartRule());
                                      	        }
                                             		add(
                                             			current, 
                                             			"regions",
                                              		lv_regions_13_0, 
                                              		"de.cau.cs.kieler.sccharts.text.sct.Sct.SingleControlflowRegion");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }
                                    break;

                            }

                            // InternalSct.g:682:3: ( (lv_regions_14_0= ruleRegion ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==RULE_COMMENT_ANNOTATION||LA15_0==16||LA15_0==62) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // InternalSct.g:683:1: (lv_regions_14_0= ruleRegion )
                            	    {
                            	    // InternalSct.g:683:1: (lv_regions_14_0= ruleRegion )
                            	    // InternalSct.g:684:3: lv_regions_14_0= ruleRegion
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsRegionParserRuleCall_4_1_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_23);
                            	    lv_regions_14_0=ruleRegion();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getSCChartRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"regions",
                            	              		lv_regions_14_0, 
                            	              		"de.cau.cs.kieler.sccharts.text.sct.Sct.Region");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
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

                    otherlv_15=(Token)match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getSCChartAccess().getRightCurlyBracketKeyword_4_1_3());
                          
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
    // $ANTLR end "ruleSCChart"


    // $ANTLR start "entryRuleRegion"
    // InternalSct.g:712:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // InternalSct.g:713:2: (iv_ruleRegion= ruleRegion EOF )
            // InternalSct.g:714:2: iv_ruleRegion= ruleRegion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRegion=ruleRegion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegion; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegion"


    // $ANTLR start "ruleRegion"
    // InternalSct.g:721:1: ruleRegion returns [EObject current=null] : this_ControlflowRegion_0= ruleControlflowRegion ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        EObject this_ControlflowRegion_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:724:28: (this_ControlflowRegion_0= ruleControlflowRegion )
            // InternalSct.g:726:2: this_ControlflowRegion_0= ruleControlflowRegion
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRegionAccess().getControlflowRegionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_ControlflowRegion_0=ruleControlflowRegion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ControlflowRegion_0; 
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
    // $ANTLR end "ruleRegion"


    // $ANTLR start "entryRuleState"
    // InternalSct.g:745:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalSct.g:746:2: (iv_ruleState= ruleState EOF )
            // InternalSct.g:747:2: iv_ruleState= ruleState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalSct.g:754:1: ruleState returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleControlflowRegion ) )? ( (lv_regions_19_0= ruleRegion ) )* ) ( ( ( (lv_regions_20_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_21_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_22_0= ruleRegion ) )* ) otherlv_23= '}' ) )? ( (lv_outgoingTransitions_24_0= ruleTransition ) )* otherlv_25= ';' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_initial_1_0=null;
        Token lv_final_2_0=null;
        Token lv_final_3_0=null;
        Token lv_initial_4_0=null;
        Token otherlv_6=null;
        Token lv_id_7_0=null;
        Token lv_label_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_5_0 = null;

        EObject lv_bindings_12_0 = null;

        EObject lv_bindings_14_0 = null;

        EObject lv_declarations_16_0 = null;

        EObject lv_localActions_17_0 = null;

        EObject lv_regions_18_0 = null;

        EObject lv_regions_19_0 = null;

        EObject lv_regions_20_0 = null;

        EObject lv_regions_21_0 = null;

        EObject lv_regions_22_0 = null;

        EObject lv_outgoingTransitions_24_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:757:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleControlflowRegion ) )? ( (lv_regions_19_0= ruleRegion ) )* ) ( ( ( (lv_regions_20_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_21_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_22_0= ruleRegion ) )* ) otherlv_23= '}' ) )? ( (lv_outgoingTransitions_24_0= ruleTransition ) )* otherlv_25= ';' ) )
            // InternalSct.g:758:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleControlflowRegion ) )? ( (lv_regions_19_0= ruleRegion ) )* ) ( ( ( (lv_regions_20_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_21_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_22_0= ruleRegion ) )* ) otherlv_23= '}' ) )? ( (lv_outgoingTransitions_24_0= ruleTransition ) )* otherlv_25= ';' )
            {
            // InternalSct.g:758:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleControlflowRegion ) )? ( (lv_regions_19_0= ruleRegion ) )* ) ( ( ( (lv_regions_20_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_21_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_22_0= ruleRegion ) )* ) otherlv_23= '}' ) )? ( (lv_outgoingTransitions_24_0= ruleTransition ) )* otherlv_25= ';' )
            // InternalSct.g:758:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleControlflowRegion ) )? ( (lv_regions_19_0= ruleRegion ) )* ) ( ( ( (lv_regions_20_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_21_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_22_0= ruleRegion ) )* ) otherlv_23= '}' ) )? ( (lv_outgoingTransitions_24_0= ruleTransition ) )* otherlv_25= ';'
            {
            // InternalSct.g:758:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_COMMENT_ANNOTATION||LA18_0==62) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSct.g:759:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:759:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:760:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStateRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalSct.g:776:3: ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            else if ( (LA21_0==28) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // InternalSct.g:776:4: ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? )
                    {
                    // InternalSct.g:776:4: ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? )
                    // InternalSct.g:776:5: ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )?
                    {
                    // InternalSct.g:776:5: ( (lv_initial_1_0= 'initial' ) )
                    // InternalSct.g:777:1: (lv_initial_1_0= 'initial' )
                    {
                    // InternalSct.g:777:1: (lv_initial_1_0= 'initial' )
                    // InternalSct.g:778:3: lv_initial_1_0= 'initial'
                    {
                    lv_initial_1_0=(Token)match(input,27,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_initial_1_0, grammarAccess.getStateAccess().getInitialInitialKeyword_1_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStateRule());
                      	        }
                             		setWithLastConsumed(current, "initial", true, "initial");
                      	    
                    }

                    }


                    }

                    // InternalSct.g:791:2: ( (lv_final_2_0= 'final' ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==28) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalSct.g:792:1: (lv_final_2_0= 'final' )
                            {
                            // InternalSct.g:792:1: (lv_final_2_0= 'final' )
                            // InternalSct.g:793:3: lv_final_2_0= 'final'
                            {
                            lv_final_2_0=(Token)match(input,28,FollowSets000.FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_final_2_0, grammarAccess.getStateAccess().getFinalFinalKeyword_1_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStateRule());
                              	        }
                                     		setWithLastConsumed(current, "final", true, "final");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:807:6: ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? )
                    {
                    // InternalSct.g:807:6: ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? )
                    // InternalSct.g:807:7: ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )?
                    {
                    // InternalSct.g:807:7: ( (lv_final_3_0= 'final' ) )
                    // InternalSct.g:808:1: (lv_final_3_0= 'final' )
                    {
                    // InternalSct.g:808:1: (lv_final_3_0= 'final' )
                    // InternalSct.g:809:3: lv_final_3_0= 'final'
                    {
                    lv_final_3_0=(Token)match(input,28,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_final_3_0, grammarAccess.getStateAccess().getFinalFinalKeyword_1_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStateRule());
                      	        }
                             		setWithLastConsumed(current, "final", true, "final");
                      	    
                    }

                    }


                    }

                    // InternalSct.g:822:2: ( (lv_initial_4_0= 'initial' ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==27) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalSct.g:823:1: (lv_initial_4_0= 'initial' )
                            {
                            // InternalSct.g:823:1: (lv_initial_4_0= 'initial' )
                            // InternalSct.g:824:3: lv_initial_4_0= 'initial'
                            {
                            lv_initial_4_0=(Token)match(input,27,FollowSets000.FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_initial_4_0, grammarAccess.getStateAccess().getInitialInitialKeyword_1_1_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStateRule());
                              	        }
                                     		setWithLastConsumed(current, "initial", true, "initial");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalSct.g:837:6: ( (lv_type_5_0= ruleStateType ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=65 && LA22_0<=68)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSct.g:838:1: (lv_type_5_0= ruleStateType )
                    {
                    // InternalSct.g:838:1: (lv_type_5_0= ruleStateType )
                    // InternalSct.g:839:3: lv_type_5_0= ruleStateType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
                    lv_type_5_0=ruleStateType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStateRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_5_0, 
                              		"de.cau.cs.kieler.sccharts.text.sct.Sct.StateType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getStateAccess().getStateKeyword_3());
                  
            }
            // InternalSct.g:859:1: ( (lv_id_7_0= RULE_ID ) )
            // InternalSct.g:860:1: (lv_id_7_0= RULE_ID )
            {
            // InternalSct.g:860:1: (lv_id_7_0= RULE_ID )
            // InternalSct.g:861:3: lv_id_7_0= RULE_ID
            {
            lv_id_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_7_0, grammarAccess.getStateAccess().getIdIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStateRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_7_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalSct.g:877:2: ( (lv_label_8_0= RULE_STRING ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSct.g:878:1: (lv_label_8_0= RULE_STRING )
                    {
                    // InternalSct.g:878:1: (lv_label_8_0= RULE_STRING )
                    // InternalSct.g:879:3: lv_label_8_0= RULE_STRING
                    {
                    lv_label_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_8_0, grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_5_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStateRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"label",
                              		lv_label_8_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:895:3: ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleControlflowRegion ) )? ( (lv_regions_19_0= ruleRegion ) )* ) ( ( ( (lv_regions_20_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_21_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_22_0= ruleRegion ) )* ) otherlv_23= '}' ) )?
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==22) ) {
                alt31=1;
            }
            else if ( (LA31_0==25) ) {
                alt31=2;
            }
            switch (alt31) {
                case 1 :
                    // InternalSct.g:895:4: (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? )
                    {
                    // InternalSct.g:895:4: (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? )
                    // InternalSct.g:895:6: otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )?
                    {
                    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getStateAccess().getReferencesKeyword_6_0_0());
                          
                    }
                    // InternalSct.g:899:1: ( (otherlv_10= RULE_ID ) )
                    // InternalSct.g:900:1: (otherlv_10= RULE_ID )
                    {
                    // InternalSct.g:900:1: (otherlv_10= RULE_ID )
                    // InternalSct.g:901:3: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getStateRule());
                      	        }
                              
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_10, grammarAccess.getStateAccess().getReferencedScopeStateCrossReference_6_0_1_0()); 
                      	
                    }

                    }


                    }

                    // InternalSct.g:915:2: (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==23) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalSct.g:915:4: otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )*
                            {
                            otherlv_11=(Token)match(input,23,FollowSets000.FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getStateAccess().getBindKeyword_6_0_2_0());
                                  
                            }
                            // InternalSct.g:919:1: ( (lv_bindings_12_0= ruleBinding ) )
                            // InternalSct.g:920:1: (lv_bindings_12_0= ruleBinding )
                            {
                            // InternalSct.g:920:1: (lv_bindings_12_0= ruleBinding )
                            // InternalSct.g:921:3: lv_bindings_12_0= ruleBinding
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStateAccess().getBindingsBindingParserRuleCall_6_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_32);
                            lv_bindings_12_0=ruleBinding();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStateRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"bindings",
                                      		lv_bindings_12_0, 
                                      		"de.cau.cs.kieler.sccharts.text.sct.Sct.Binding");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalSct.g:937:2: (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==24) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // InternalSct.g:937:4: otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) )
                            	    {
                            	    otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_20); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_13, grammarAccess.getStateAccess().getCommaKeyword_6_0_2_2_0());
                            	          
                            	    }
                            	    // InternalSct.g:941:1: ( (lv_bindings_14_0= ruleBinding ) )
                            	    // InternalSct.g:942:1: (lv_bindings_14_0= ruleBinding )
                            	    {
                            	    // InternalSct.g:942:1: (lv_bindings_14_0= ruleBinding )
                            	    // InternalSct.g:943:3: lv_bindings_14_0= ruleBinding
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getStateAccess().getBindingsBindingParserRuleCall_6_0_2_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_32);
                            	    lv_bindings_14_0=ruleBinding();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getStateRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"bindings",
                            	              		lv_bindings_14_0, 
                            	              		"de.cau.cs.kieler.sccharts.text.sct.Sct.Binding");
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


                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:960:6: (otherlv_15= '{' ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleControlflowRegion ) )? ( (lv_regions_19_0= ruleRegion ) )* ) ( ( ( (lv_regions_20_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_21_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_22_0= ruleRegion ) )* ) otherlv_23= '}' )
                    {
                    // InternalSct.g:960:6: (otherlv_15= '{' ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleControlflowRegion ) )? ( (lv_regions_19_0= ruleRegion ) )* ) ( ( ( (lv_regions_20_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_21_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_22_0= ruleRegion ) )* ) otherlv_23= '}' )
                    // InternalSct.g:960:8: otherlv_15= '{' ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleControlflowRegion ) )? ( (lv_regions_19_0= ruleRegion ) )* ) ( ( ( (lv_regions_20_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_21_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_22_0= ruleRegion ) )* ) otherlv_23= '}'
                    {
                    otherlv_15=(Token)match(input,25,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_6_1_0());
                          
                    }
                    // InternalSct.g:964:1: ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )*
                    loop26:
                    do {
                        int alt26=3;
                        alt26 = dfa26.predict(input);
                        switch (alt26) {
                    	case 1 :
                    	    // InternalSct.g:964:2: ( (lv_declarations_16_0= ruleDeclaration ) )
                    	    {
                    	    // InternalSct.g:964:2: ( (lv_declarations_16_0= ruleDeclaration ) )
                    	    // InternalSct.g:965:1: (lv_declarations_16_0= ruleDeclaration )
                    	    {
                    	    // InternalSct.g:965:1: (lv_declarations_16_0= ruleDeclaration )
                    	    // InternalSct.g:966:3: lv_declarations_16_0= ruleDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStateAccess().getDeclarationsDeclarationParserRuleCall_6_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_33);
                    	    lv_declarations_16_0=ruleDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declarations",
                    	              		lv_declarations_16_0, 
                    	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Declaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSct.g:983:6: ( (lv_localActions_17_0= ruleLocalAction ) )
                    	    {
                    	    // InternalSct.g:983:6: ( (lv_localActions_17_0= ruleLocalAction ) )
                    	    // InternalSct.g:984:1: (lv_localActions_17_0= ruleLocalAction )
                    	    {
                    	    // InternalSct.g:984:1: (lv_localActions_17_0= ruleLocalAction )
                    	    // InternalSct.g:985:3: lv_localActions_17_0= ruleLocalAction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStateAccess().getLocalActionsLocalActionParserRuleCall_6_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_33);
                    	    lv_localActions_17_0=ruleLocalAction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"localActions",
                    	              		lv_localActions_17_0, 
                    	              		"de.cau.cs.kieler.sccharts.text.sct.Sct.LocalAction");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    // InternalSct.g:1001:4: ( ( (lv_regions_18_0= ruleSingleControlflowRegion ) )? ( (lv_regions_19_0= ruleRegion ) )* )
                    // InternalSct.g:1001:5: ( (lv_regions_18_0= ruleSingleControlflowRegion ) )? ( (lv_regions_19_0= ruleRegion ) )*
                    {
                    // InternalSct.g:1001:5: ( (lv_regions_18_0= ruleSingleControlflowRegion ) )?
                    int alt27=2;
                    alt27 = dfa27.predict(input);
                    switch (alt27) {
                        case 1 :
                            // InternalSct.g:1002:1: (lv_regions_18_0= ruleSingleControlflowRegion )
                            {
                            // InternalSct.g:1002:1: (lv_regions_18_0= ruleSingleControlflowRegion )
                            // InternalSct.g:1003:3: lv_regions_18_0= ruleSingleControlflowRegion
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStateAccess().getRegionsSingleControlflowRegionParserRuleCall_6_1_2_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_34);
                            lv_regions_18_0=ruleSingleControlflowRegion();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStateRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"regions",
                                      		lv_regions_18_0, 
                                      		"de.cau.cs.kieler.sccharts.text.sct.Sct.SingleControlflowRegion");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // InternalSct.g:1019:3: ( (lv_regions_19_0= ruleRegion ) )*
                    loop28:
                    do {
                        int alt28=2;
                        alt28 = dfa28.predict(input);
                        switch (alt28) {
                    	case 1 :
                    	    // InternalSct.g:1020:1: (lv_regions_19_0= ruleRegion )
                    	    {
                    	    // InternalSct.g:1020:1: (lv_regions_19_0= ruleRegion )
                    	    // InternalSct.g:1021:3: lv_regions_19_0= ruleRegion
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_6_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_34);
                    	    lv_regions_19_0=ruleRegion();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"regions",
                    	              		lv_regions_19_0, 
                    	              		"de.cau.cs.kieler.sccharts.text.sct.Sct.Region");
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

                    // InternalSct.g:1037:4: ( ( ( (lv_regions_20_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_21_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_22_0= ruleRegion ) )* )
                    // InternalSct.g:1037:5: ( ( (lv_regions_20_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_21_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_22_0= ruleRegion ) )*
                    {
                    // InternalSct.g:1037:5: ( ( (lv_regions_20_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_21_0= ruleSingleControlflowRegion ) ) )?
                    int alt29=3;
                    alt29 = dfa29.predict(input);
                    switch (alt29) {
                        case 1 :
                            // InternalSct.g:1037:6: ( (lv_regions_20_0= ruleSingleDataflowRegion ) )
                            {
                            // InternalSct.g:1037:6: ( (lv_regions_20_0= ruleSingleDataflowRegion ) )
                            // InternalSct.g:1038:1: (lv_regions_20_0= ruleSingleDataflowRegion )
                            {
                            // InternalSct.g:1038:1: (lv_regions_20_0= ruleSingleDataflowRegion )
                            // InternalSct.g:1039:3: lv_regions_20_0= ruleSingleDataflowRegion
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStateAccess().getRegionsSingleDataflowRegionParserRuleCall_6_1_3_0_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_23);
                            lv_regions_20_0=ruleSingleDataflowRegion();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStateRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"regions",
                                      		lv_regions_20_0, 
                                      		"de.cau.cs.kieler.sccharts.text.sct.Sct.SingleDataflowRegion");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSct.g:1056:6: ( (lv_regions_21_0= ruleSingleControlflowRegion ) )
                            {
                            // InternalSct.g:1056:6: ( (lv_regions_21_0= ruleSingleControlflowRegion ) )
                            // InternalSct.g:1057:1: (lv_regions_21_0= ruleSingleControlflowRegion )
                            {
                            // InternalSct.g:1057:1: (lv_regions_21_0= ruleSingleControlflowRegion )
                            // InternalSct.g:1058:3: lv_regions_21_0= ruleSingleControlflowRegion
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStateAccess().getRegionsSingleControlflowRegionParserRuleCall_6_1_3_0_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_23);
                            lv_regions_21_0=ruleSingleControlflowRegion();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStateRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"regions",
                                      		lv_regions_21_0, 
                                      		"de.cau.cs.kieler.sccharts.text.sct.Sct.SingleControlflowRegion");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalSct.g:1074:4: ( (lv_regions_22_0= ruleRegion ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_COMMENT_ANNOTATION||LA30_0==16||LA30_0==62) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalSct.g:1075:1: (lv_regions_22_0= ruleRegion )
                    	    {
                    	    // InternalSct.g:1075:1: (lv_regions_22_0= ruleRegion )
                    	    // InternalSct.g:1076:3: lv_regions_22_0= ruleRegion
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_6_1_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_23);
                    	    lv_regions_22_0=ruleRegion();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"regions",
                    	              		lv_regions_22_0, 
                    	              		"de.cau.cs.kieler.sccharts.text.sct.Sct.Region");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }

                    otherlv_23=(Token)match(input,26,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6_1_4());
                          
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:1096:4: ( (lv_outgoingTransitions_24_0= ruleTransition ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_COMMENT_ANNOTATION||LA32_0==62||(LA32_0>=69 && LA32_0<=71)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSct.g:1097:1: (lv_outgoingTransitions_24_0= ruleTransition )
            	    {
            	    // InternalSct.g:1097:1: (lv_outgoingTransitions_24_0= ruleTransition )
            	    // InternalSct.g:1098:3: lv_outgoingTransitions_24_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_35);
            	    lv_outgoingTransitions_24_0=ruleTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStateRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"outgoingTransitions",
            	              		lv_outgoingTransitions_24_0, 
            	              		"de.cau.cs.kieler.sccharts.text.sct.Sct.Transition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_25=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_25, grammarAccess.getStateAccess().getSemicolonKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleNode"
    // InternalSct.g:1126:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalSct.g:1127:2: (iv_ruleNode= ruleNode EOF )
            // InternalSct.g:1128:2: iv_ruleNode= ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNode; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalSct.g:1135:1: ruleNode returns [EObject current=null] : (this_ReferenceNode_0= ruleReferenceNode | this_CallNode_1= ruleCallNode | this_DefineNode_2= ruleDefineNode ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_ReferenceNode_0 = null;

        EObject this_CallNode_1 = null;

        EObject this_DefineNode_2 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:1138:28: ( (this_ReferenceNode_0= ruleReferenceNode | this_CallNode_1= ruleCallNode | this_DefineNode_2= ruleDefineNode ) )
            // InternalSct.g:1139:1: (this_ReferenceNode_0= ruleReferenceNode | this_CallNode_1= ruleCallNode | this_DefineNode_2= ruleDefineNode )
            {
            // InternalSct.g:1139:1: (this_ReferenceNode_0= ruleReferenceNode | this_CallNode_1= ruleCallNode | this_DefineNode_2= ruleDefineNode )
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==18) ) {
                    int LA33_3 = input.LA(3);

                    if ( (LA33_3==34) ) {
                        alt33=1;
                    }
                    else if ( (LA33_3==RULE_ID) ) {
                        alt33=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA33_1==RULE_STRING) ) {
                    alt33=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA33_0==32) ) {
                alt33=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalSct.g:1140:2: this_ReferenceNode_0= ruleReferenceNode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAccess().getReferenceNodeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ReferenceNode_0=ruleReferenceNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceNode_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSct.g:1153:2: this_CallNode_1= ruleCallNode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAccess().getCallNodeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CallNode_1=ruleCallNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CallNode_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSct.g:1166:2: this_DefineNode_2= ruleDefineNode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAccess().getDefineNodeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DefineNode_2=ruleDefineNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DefineNode_2; 
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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleCallNode"
    // InternalSct.g:1185:1: entryRuleCallNode returns [EObject current=null] : iv_ruleCallNode= ruleCallNode EOF ;
    public final EObject entryRuleCallNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallNode = null;


        try {
            // InternalSct.g:1186:2: (iv_ruleCallNode= ruleCallNode EOF )
            // InternalSct.g:1187:2: iv_ruleCallNode= ruleCallNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallNodeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCallNode=ruleCallNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCallNode; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCallNode"


    // $ANTLR start "ruleCallNode"
    // InternalSct.g:1194:1: ruleCallNode returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_parameters_5_0= ruleValuedObjectReference ) )? (otherlv_6= ',' ( (lv_parameters_7_0= ruleValuedObjectReference ) ) )* otherlv_8= ')' otherlv_9= ';' ) ;
    public final EObject ruleCallNode() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:1197:28: ( ( () ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_parameters_5_0= ruleValuedObjectReference ) )? (otherlv_6= ',' ( (lv_parameters_7_0= ruleValuedObjectReference ) ) )* otherlv_8= ')' otherlv_9= ';' ) )
            // InternalSct.g:1198:1: ( () ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_parameters_5_0= ruleValuedObjectReference ) )? (otherlv_6= ',' ( (lv_parameters_7_0= ruleValuedObjectReference ) ) )* otherlv_8= ')' otherlv_9= ';' )
            {
            // InternalSct.g:1198:1: ( () ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_parameters_5_0= ruleValuedObjectReference ) )? (otherlv_6= ',' ( (lv_parameters_7_0= ruleValuedObjectReference ) ) )* otherlv_8= ')' otherlv_9= ';' )
            // InternalSct.g:1198:2: () ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_parameters_5_0= ruleValuedObjectReference ) )? (otherlv_6= ',' ( (lv_parameters_7_0= ruleValuedObjectReference ) ) )* otherlv_8= ')' otherlv_9= ';'
            {
            // InternalSct.g:1198:2: ()
            // InternalSct.g:1199:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCallNodeAccess().getCallNodeAction_0(),
                          current);
                  
            }

            }

            // InternalSct.g:1207:2: ( (lv_id_1_0= RULE_ID ) )
            // InternalSct.g:1208:1: (lv_id_1_0= RULE_ID )
            {
            // InternalSct.g:1208:1: (lv_id_1_0= RULE_ID )
            // InternalSct.g:1209:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_1_0, grammarAccess.getCallNodeAccess().getIdIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCallNodeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCallNodeAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalSct.g:1229:1: ( (otherlv_3= RULE_ID ) )
            // InternalSct.g:1230:1: (otherlv_3= RULE_ID )
            {
            // InternalSct.g:1230:1: (otherlv_3= RULE_ID )
            // InternalSct.g:1231:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCallNodeRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getCallNodeAccess().getCallReferenceDefineNodeCrossReference_3_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCallNodeAccess().getLeftParenthesisKeyword_4());
                  
            }
            // InternalSct.g:1249:1: ( (lv_parameters_5_0= ruleValuedObjectReference ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSct.g:1250:1: (lv_parameters_5_0= ruleValuedObjectReference )
                    {
                    // InternalSct.g:1250:1: (lv_parameters_5_0= ruleValuedObjectReference )
                    // InternalSct.g:1251:3: lv_parameters_5_0= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCallNodeAccess().getParametersValuedObjectReferenceParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
                    lv_parameters_5_0=ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCallNodeRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_5_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:1267:3: (otherlv_6= ',' ( (lv_parameters_7_0= ruleValuedObjectReference ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==24) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSct.g:1267:5: otherlv_6= ',' ( (lv_parameters_7_0= ruleValuedObjectReference ) )
            	    {
            	    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getCallNodeAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalSct.g:1271:1: ( (lv_parameters_7_0= ruleValuedObjectReference ) )
            	    // InternalSct.g:1272:1: (lv_parameters_7_0= ruleValuedObjectReference )
            	    {
            	    // InternalSct.g:1272:1: (lv_parameters_7_0= ruleValuedObjectReference )
            	    // InternalSct.g:1273:3: lv_parameters_7_0= ruleValuedObjectReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCallNodeAccess().getParametersValuedObjectReferenceParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_38);
            	    lv_parameters_7_0=ruleValuedObjectReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCallNodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameters",
            	              		lv_parameters_7_0, 
            	              		"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
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

            otherlv_8=(Token)match(input,31,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getCallNodeAccess().getRightParenthesisKeyword_7());
                  
            }
            otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getCallNodeAccess().getSemicolonKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCallNode"


    // $ANTLR start "entryRuleDefineNode"
    // InternalSct.g:1305:1: entryRuleDefineNode returns [EObject current=null] : iv_ruleDefineNode= ruleDefineNode EOF ;
    public final EObject entryRuleDefineNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineNode = null;


        try {
            // InternalSct.g:1306:2: (iv_ruleDefineNode= ruleDefineNode EOF )
            // InternalSct.g:1307:2: iv_ruleDefineNode= ruleDefineNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefineNodeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDefineNode=ruleDefineNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefineNode; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefineNode"


    // $ANTLR start "ruleDefineNode"
    // InternalSct.g:1314:1: ruleDefineNode returns [EObject current=null] : ( () otherlv_1= 'node' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_inputs_4_0= ruleDeclaration ) )* otherlv_5= ')' otherlv_6= 'returns' otherlv_7= '(' ( (lv_outputs_8_0= ruleDeclaration ) )* otherlv_9= ')' otherlv_10= '{' ( ( ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';' )* | ( (lv_states_15_0= ruleState ) )* ) otherlv_16= '}' ) ;
    public final EObject ruleDefineNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_inputs_4_0 = null;

        EObject lv_outputs_8_0 = null;

        EObject lv_expressions_13_0 = null;

        EObject lv_states_15_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:1317:28: ( ( () otherlv_1= 'node' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_inputs_4_0= ruleDeclaration ) )* otherlv_5= ')' otherlv_6= 'returns' otherlv_7= '(' ( (lv_outputs_8_0= ruleDeclaration ) )* otherlv_9= ')' otherlv_10= '{' ( ( ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';' )* | ( (lv_states_15_0= ruleState ) )* ) otherlv_16= '}' ) )
            // InternalSct.g:1318:1: ( () otherlv_1= 'node' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_inputs_4_0= ruleDeclaration ) )* otherlv_5= ')' otherlv_6= 'returns' otherlv_7= '(' ( (lv_outputs_8_0= ruleDeclaration ) )* otherlv_9= ')' otherlv_10= '{' ( ( ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';' )* | ( (lv_states_15_0= ruleState ) )* ) otherlv_16= '}' )
            {
            // InternalSct.g:1318:1: ( () otherlv_1= 'node' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_inputs_4_0= ruleDeclaration ) )* otherlv_5= ')' otherlv_6= 'returns' otherlv_7= '(' ( (lv_outputs_8_0= ruleDeclaration ) )* otherlv_9= ')' otherlv_10= '{' ( ( ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';' )* | ( (lv_states_15_0= ruleState ) )* ) otherlv_16= '}' )
            // InternalSct.g:1318:2: () otherlv_1= 'node' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_inputs_4_0= ruleDeclaration ) )* otherlv_5= ')' otherlv_6= 'returns' otherlv_7= '(' ( (lv_outputs_8_0= ruleDeclaration ) )* otherlv_9= ')' otherlv_10= '{' ( ( ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';' )* | ( (lv_states_15_0= ruleState ) )* ) otherlv_16= '}'
            {
            // InternalSct.g:1318:2: ()
            // InternalSct.g:1319:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefineNodeAccess().getDefineNodeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDefineNodeAccess().getNodeKeyword_1());
                  
            }
            // InternalSct.g:1331:1: ( (lv_id_2_0= RULE_ID ) )
            // InternalSct.g:1332:1: (lv_id_2_0= RULE_ID )
            {
            // InternalSct.g:1332:1: (lv_id_2_0= RULE_ID )
            // InternalSct.g:1333:3: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_2_0, grammarAccess.getDefineNodeAccess().getIdIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDefineNodeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_2_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDefineNodeAccess().getLeftParenthesisKeyword_3());
                  
            }
            // InternalSct.g:1353:1: ( (lv_inputs_4_0= ruleDeclaration ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_COMMENT_ANNOTATION||(LA36_0>=47 && LA36_0<=53)||LA36_0==62||(LA36_0>=93 && LA36_0<=99)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSct.g:1354:1: (lv_inputs_4_0= ruleDeclaration )
            	    {
            	    // InternalSct.g:1354:1: (lv_inputs_4_0= ruleDeclaration )
            	    // InternalSct.g:1355:3: lv_inputs_4_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDefineNodeAccess().getInputsDeclarationParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_39);
            	    lv_inputs_4_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDefineNodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"inputs",
            	              		lv_inputs_4_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDefineNodeAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,33,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getDefineNodeAccess().getReturnsKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getDefineNodeAccess().getLeftParenthesisKeyword_7());
                  
            }
            // InternalSct.g:1383:1: ( (lv_outputs_8_0= ruleDeclaration ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_COMMENT_ANNOTATION||(LA37_0>=47 && LA37_0<=53)||LA37_0==62||(LA37_0>=93 && LA37_0<=99)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSct.g:1384:1: (lv_outputs_8_0= ruleDeclaration )
            	    {
            	    // InternalSct.g:1384:1: (lv_outputs_8_0= ruleDeclaration )
            	    // InternalSct.g:1385:3: lv_outputs_8_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDefineNodeAccess().getOutputsDeclarationParserRuleCall_8_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_39);
            	    lv_outputs_8_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDefineNodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"outputs",
            	              		lv_outputs_8_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_9=(Token)match(input,31,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getDefineNodeAccess().getRightParenthesisKeyword_9());
                  
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getDefineNodeAccess().getLeftCurlyBracketKeyword_10());
                  
            }
            // InternalSct.g:1409:1: ( ( ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';' )* | ( (lv_states_15_0= ruleState ) )* )
            int alt40=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt40=1;
                }
                break;
            case 26:
                {
                int LA40_2 = input.LA(2);

                if ( (synpred47_InternalSct()) ) {
                    alt40=1;
                }
                else if ( (true) ) {
                    alt40=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_COMMENT_ANNOTATION:
            case 27:
            case 28:
            case 29:
            case 62:
            case 65:
            case 66:
            case 67:
            case 68:
                {
                alt40=2;
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
                    // InternalSct.g:1409:2: ( ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';' )*
                    {
                    // InternalSct.g:1409:2: ( ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';' )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_ID) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalSct.g:1409:3: ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';'
                    	    {
                    	    // InternalSct.g:1409:3: ( (otherlv_11= RULE_ID ) )
                    	    // InternalSct.g:1410:1: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalSct.g:1410:1: (otherlv_11= RULE_ID )
                    	    // InternalSct.g:1411:3: otherlv_11= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getDefineNodeRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_11, grammarAccess.getDefineNodeAccess().getValuedObjectsValuedObjectCrossReference_11_0_0_0()); 
                    	      	
                    	    }

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_12, grammarAccess.getDefineNodeAccess().getEqualsSignKeyword_11_0_1());
                    	          
                    	    }
                    	    // InternalSct.g:1429:1: ( (lv_expressions_13_0= ruleExpression ) )
                    	    // InternalSct.g:1430:1: (lv_expressions_13_0= ruleExpression )
                    	    {
                    	    // InternalSct.g:1430:1: (lv_expressions_13_0= ruleExpression )
                    	    // InternalSct.g:1431:3: lv_expressions_13_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDefineNodeAccess().getExpressionsExpressionParserRuleCall_11_0_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_12);
                    	    lv_expressions_13_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDefineNodeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"expressions",
                    	              		lv_expressions_13_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_14, grammarAccess.getDefineNodeAccess().getSemicolonKeyword_11_0_3());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalSct.g:1452:6: ( (lv_states_15_0= ruleState ) )*
                    {
                    // InternalSct.g:1452:6: ( (lv_states_15_0= ruleState ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_COMMENT_ANNOTATION||(LA39_0>=27 && LA39_0<=29)||LA39_0==62||(LA39_0>=65 && LA39_0<=68)) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalSct.g:1453:1: (lv_states_15_0= ruleState )
                    	    {
                    	    // InternalSct.g:1453:1: (lv_states_15_0= ruleState )
                    	    // InternalSct.g:1454:3: lv_states_15_0= ruleState
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDefineNodeAccess().getStatesStateParserRuleCall_11_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_44);
                    	    lv_states_15_0=ruleState();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDefineNodeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"states",
                    	              		lv_states_15_0, 
                    	              		"de.cau.cs.kieler.sccharts.text.sct.Sct.State");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_16=(Token)match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getDefineNodeAccess().getRightCurlyBracketKeyword_12());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefineNode"


    // $ANTLR start "entryRuleReferenceNode"
    // InternalSct.g:1482:1: entryRuleReferenceNode returns [EObject current=null] : iv_ruleReferenceNode= ruleReferenceNode EOF ;
    public final EObject entryRuleReferenceNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceNode = null;


        try {
            // InternalSct.g:1483:2: (iv_ruleReferenceNode= ruleReferenceNode EOF )
            // InternalSct.g:1484:2: iv_ruleReferenceNode= ruleReferenceNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceNodeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReferenceNode=ruleReferenceNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceNode; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceNode"


    // $ANTLR start "ruleReferenceNode"
    // InternalSct.g:1491:1: ruleReferenceNode returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? otherlv_3= '=' otherlv_4= 'ref' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameters_7_0= ruleValuedObjectReference ) )? (otherlv_8= ',' ( (lv_parameters_9_0= ruleValuedObjectReference ) ) )* otherlv_10= ')' otherlv_11= ';' ) ;
    public final EObject ruleReferenceNode() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_9_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:1494:28: ( ( () ( (lv_id_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? otherlv_3= '=' otherlv_4= 'ref' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameters_7_0= ruleValuedObjectReference ) )? (otherlv_8= ',' ( (lv_parameters_9_0= ruleValuedObjectReference ) ) )* otherlv_10= ')' otherlv_11= ';' ) )
            // InternalSct.g:1495:1: ( () ( (lv_id_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? otherlv_3= '=' otherlv_4= 'ref' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameters_7_0= ruleValuedObjectReference ) )? (otherlv_8= ',' ( (lv_parameters_9_0= ruleValuedObjectReference ) ) )* otherlv_10= ')' otherlv_11= ';' )
            {
            // InternalSct.g:1495:1: ( () ( (lv_id_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? otherlv_3= '=' otherlv_4= 'ref' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameters_7_0= ruleValuedObjectReference ) )? (otherlv_8= ',' ( (lv_parameters_9_0= ruleValuedObjectReference ) ) )* otherlv_10= ')' otherlv_11= ';' )
            // InternalSct.g:1495:2: () ( (lv_id_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? otherlv_3= '=' otherlv_4= 'ref' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameters_7_0= ruleValuedObjectReference ) )? (otherlv_8= ',' ( (lv_parameters_9_0= ruleValuedObjectReference ) ) )* otherlv_10= ')' otherlv_11= ';'
            {
            // InternalSct.g:1495:2: ()
            // InternalSct.g:1496:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReferenceNodeAccess().getReferenceNodeAction_0(),
                          current);
                  
            }

            }

            // InternalSct.g:1504:2: ( (lv_id_1_0= RULE_ID ) )
            // InternalSct.g:1505:1: (lv_id_1_0= RULE_ID )
            {
            // InternalSct.g:1505:1: (lv_id_1_0= RULE_ID )
            // InternalSct.g:1506:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_1_0, grammarAccess.getReferenceNodeAccess().getIdIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceNodeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalSct.g:1522:2: ( (lv_label_2_0= RULE_STRING ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_STRING) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSct.g:1523:1: (lv_label_2_0= RULE_STRING )
                    {
                    // InternalSct.g:1523:1: (lv_label_2_0= RULE_STRING )
                    // InternalSct.g:1524:3: lv_label_2_0= RULE_STRING
                    {
                    lv_label_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_2_0, grammarAccess.getReferenceNodeAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReferenceNodeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"label",
                              		lv_label_2_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getReferenceNodeAccess().getEqualsSignKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getReferenceNodeAccess().getRefKeyword_4());
                  
            }
            // InternalSct.g:1548:1: ( (otherlv_5= RULE_ID ) )
            // InternalSct.g:1549:1: (otherlv_5= RULE_ID )
            {
            // InternalSct.g:1549:1: (otherlv_5= RULE_ID )
            // InternalSct.g:1550:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceNodeRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getReferenceNodeAccess().getReferencedScopeStateCrossReference_5_0()); 
              	
            }

            }


            }

            otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getReferenceNodeAccess().getLeftParenthesisKeyword_6());
                  
            }
            // InternalSct.g:1568:1: ( (lv_parameters_7_0= ruleValuedObjectReference ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSct.g:1569:1: (lv_parameters_7_0= ruleValuedObjectReference )
                    {
                    // InternalSct.g:1569:1: (lv_parameters_7_0= ruleValuedObjectReference )
                    // InternalSct.g:1570:3: lv_parameters_7_0= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceNodeAccess().getParametersValuedObjectReferenceParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
                    lv_parameters_7_0=ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReferenceNodeRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_7_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:1586:3: (otherlv_8= ',' ( (lv_parameters_9_0= ruleValuedObjectReference ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==24) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalSct.g:1586:5: otherlv_8= ',' ( (lv_parameters_9_0= ruleValuedObjectReference ) )
            	    {
            	    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getReferenceNodeAccess().getCommaKeyword_8_0());
            	          
            	    }
            	    // InternalSct.g:1590:1: ( (lv_parameters_9_0= ruleValuedObjectReference ) )
            	    // InternalSct.g:1591:1: (lv_parameters_9_0= ruleValuedObjectReference )
            	    {
            	    // InternalSct.g:1591:1: (lv_parameters_9_0= ruleValuedObjectReference )
            	    // InternalSct.g:1592:3: lv_parameters_9_0= ruleValuedObjectReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceNodeAccess().getParametersValuedObjectReferenceParserRuleCall_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_38);
            	    lv_parameters_9_0=ruleValuedObjectReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceNodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameters",
            	              		lv_parameters_9_0, 
            	              		"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
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

            otherlv_10=(Token)match(input,31,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getReferenceNodeAccess().getRightParenthesisKeyword_9());
                  
            }
            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getReferenceNodeAccess().getSemicolonKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferenceNode"


    // $ANTLR start "entryRuleLocalAction"
    // InternalSct.g:1624:1: entryRuleLocalAction returns [EObject current=null] : iv_ruleLocalAction= ruleLocalAction EOF ;
    public final EObject entryRuleLocalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAction = null;


        try {
            // InternalSct.g:1625:2: (iv_ruleLocalAction= ruleLocalAction EOF )
            // InternalSct.g:1626:2: iv_ruleLocalAction= ruleLocalAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLocalAction=ruleLocalAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalAction"


    // $ANTLR start "ruleLocalAction"
    // InternalSct.g:1633:1: ruleLocalAction returns [EObject current=null] : (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction | this_IterateAction_4= ruleIterateAction ) ;
    public final EObject ruleLocalAction() throws RecognitionException {
        EObject current = null;

        EObject this_EntryAction_0 = null;

        EObject this_DuringAction_1 = null;

        EObject this_ExitAction_2 = null;

        EObject this_SuspendAction_3 = null;

        EObject this_IterateAction_4 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:1636:28: ( (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction | this_IterateAction_4= ruleIterateAction ) )
            // InternalSct.g:1637:1: (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction | this_IterateAction_4= ruleIterateAction )
            {
            // InternalSct.g:1637:1: (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction | this_IterateAction_4= ruleIterateAction )
            int alt44=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt44=1;
                }
                break;
            case 35:
                {
                switch ( input.LA(2) ) {
                case 45:
                    {
                    alt44=5;
                    }
                    break;
                case 41:
                    {
                    alt44=2;
                    }
                    break;
                case 43:
                case 44:
                    {
                    alt44=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 2, input);

                    throw nvae;
                }

                }
                break;
            case 41:
                {
                alt44=2;
                }
                break;
            case 42:
                {
                alt44=3;
                }
                break;
            case 43:
            case 44:
                {
                alt44=4;
                }
                break;
            case 45:
                {
                alt44=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalSct.g:1638:2: this_EntryAction_0= ruleEntryAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalActionAccess().getEntryActionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EntryAction_0=ruleEntryAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EntryAction_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSct.g:1651:2: this_DuringAction_1= ruleDuringAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalActionAccess().getDuringActionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DuringAction_1=ruleDuringAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DuringAction_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSct.g:1664:2: this_ExitAction_2= ruleExitAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalActionAccess().getExitActionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExitAction_2=ruleExitAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExitAction_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalSct.g:1677:2: this_SuspendAction_3= ruleSuspendAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalActionAccess().getSuspendActionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SuspendAction_3=ruleSuspendAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SuspendAction_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalSct.g:1690:2: this_IterateAction_4= ruleIterateAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalActionAccess().getIterateActionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IterateAction_4=ruleIterateAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IterateAction_4; 
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
    // $ANTLR end "ruleLocalAction"


    // $ANTLR start "entryRuleTransition"
    // InternalSct.g:1709:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalSct.g:1710:2: (iv_ruleTransition= ruleTransition EOF )
            // InternalSct.g:1711:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSct.g:1718:1: ruleTransition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_immediate_3_0= 'immediate' ) )? ( (lv_deferred_4_0= 'deferred' ) )? ( (lv_history_5_0= ruleHistoryType ) )? ( (lv_label_6_0= RULE_STRING ) )? (otherlv_7= 'with' ( ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )? (otherlv_10= '/' ( (lv_effects_11_0= ruleEffect ) ) (otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) ) )* )? )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_immediate_3_0=null;
        Token lv_deferred_4_0=null;
        Token lv_label_6_0=null;
        Token otherlv_7=null;
        Token lv_delay_8_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_1_0 = null;

        Enumerator lv_history_5_0 = null;

        EObject lv_trigger_9_0 = null;

        EObject lv_effects_11_0 = null;

        EObject lv_effects_13_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:1721:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_immediate_3_0= 'immediate' ) )? ( (lv_deferred_4_0= 'deferred' ) )? ( (lv_history_5_0= ruleHistoryType ) )? ( (lv_label_6_0= RULE_STRING ) )? (otherlv_7= 'with' ( ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )? (otherlv_10= '/' ( (lv_effects_11_0= ruleEffect ) ) (otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) ) )* )? )? ) )
            // InternalSct.g:1722:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_immediate_3_0= 'immediate' ) )? ( (lv_deferred_4_0= 'deferred' ) )? ( (lv_history_5_0= ruleHistoryType ) )? ( (lv_label_6_0= RULE_STRING ) )? (otherlv_7= 'with' ( ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )? (otherlv_10= '/' ( (lv_effects_11_0= ruleEffect ) ) (otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) ) )* )? )? )
            {
            // InternalSct.g:1722:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_immediate_3_0= 'immediate' ) )? ( (lv_deferred_4_0= 'deferred' ) )? ( (lv_history_5_0= ruleHistoryType ) )? ( (lv_label_6_0= RULE_STRING ) )? (otherlv_7= 'with' ( ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )? (otherlv_10= '/' ( (lv_effects_11_0= ruleEffect ) ) (otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) ) )* )? )? )
            // InternalSct.g:1722:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_immediate_3_0= 'immediate' ) )? ( (lv_deferred_4_0= 'deferred' ) )? ( (lv_history_5_0= ruleHistoryType ) )? ( (lv_label_6_0= RULE_STRING ) )? (otherlv_7= 'with' ( ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )? (otherlv_10= '/' ( (lv_effects_11_0= ruleEffect ) ) (otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) ) )* )? )?
            {
            // InternalSct.g:1722:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_COMMENT_ANNOTATION||LA45_0==62) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalSct.g:1723:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:1723:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:1724:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTransitionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_47);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // InternalSct.g:1740:3: ( (lv_type_1_0= ruleTransitionType ) )
            // InternalSct.g:1741:1: (lv_type_1_0= ruleTransitionType )
            {
            // InternalSct.g:1741:1: (lv_type_1_0= ruleTransitionType )
            // InternalSct.g:1742:3: lv_type_1_0= ruleTransitionType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionAccess().getTypeTransitionTypeEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_13);
            lv_type_1_0=ruleTransitionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransitionRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"de.cau.cs.kieler.sccharts.text.sct.Sct.TransitionType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct.g:1758:2: ( (otherlv_2= RULE_ID ) )
            // InternalSct.g:1759:1: (otherlv_2= RULE_ID )
            {
            // InternalSct.g:1759:1: (otherlv_2= RULE_ID )
            // InternalSct.g:1760:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTransitionRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getTargetStateStateCrossReference_2_0()); 
              	
            }

            }


            }

            // InternalSct.g:1774:2: ( (lv_immediate_3_0= 'immediate' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==35) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSct.g:1775:1: (lv_immediate_3_0= 'immediate' )
                    {
                    // InternalSct.g:1775:1: (lv_immediate_3_0= 'immediate' )
                    // InternalSct.g:1776:3: lv_immediate_3_0= 'immediate'
                    {
                    lv_immediate_3_0=(Token)match(input,35,FollowSets000.FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_immediate_3_0, grammarAccess.getTransitionAccess().getImmediateImmediateKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTransitionRule());
                      	        }
                             		setWithLastConsumed(current, "immediate", true, "immediate");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:1789:3: ( (lv_deferred_4_0= 'deferred' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==36) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSct.g:1790:1: (lv_deferred_4_0= 'deferred' )
                    {
                    // InternalSct.g:1790:1: (lv_deferred_4_0= 'deferred' )
                    // InternalSct.g:1791:3: lv_deferred_4_0= 'deferred'
                    {
                    lv_deferred_4_0=(Token)match(input,36,FollowSets000.FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_deferred_4_0, grammarAccess.getTransitionAccess().getDeferredDeferredKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTransitionRule());
                      	        }
                             		setWithLastConsumed(current, "deferred", true, "deferred");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:1804:3: ( (lv_history_5_0= ruleHistoryType ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=72 && LA48_0<=74)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSct.g:1805:1: (lv_history_5_0= ruleHistoryType )
                    {
                    // InternalSct.g:1805:1: (lv_history_5_0= ruleHistoryType )
                    // InternalSct.g:1806:3: lv_history_5_0= ruleHistoryType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionAccess().getHistoryHistoryTypeEnumRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_51);
                    lv_history_5_0=ruleHistoryType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                      	        }
                             		set(
                             			current, 
                             			"history",
                              		lv_history_5_0, 
                              		"de.cau.cs.kieler.sccharts.text.actions.Actions.HistoryType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:1822:3: ( (lv_label_6_0= RULE_STRING ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_STRING) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSct.g:1823:1: (lv_label_6_0= RULE_STRING )
                    {
                    // InternalSct.g:1823:1: (lv_label_6_0= RULE_STRING )
                    // InternalSct.g:1824:3: lv_label_6_0= RULE_STRING
                    {
                    lv_label_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_6_0, grammarAccess.getTransitionAccess().getLabelSTRINGTerminalRuleCall_6_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTransitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"label",
                              		lv_label_6_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:1840:3: (otherlv_7= 'with' ( ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )? (otherlv_10= '/' ( (lv_effects_11_0= ruleEffect ) ) (otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) ) )* )? )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==37) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalSct.g:1840:5: otherlv_7= 'with' ( ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )? (otherlv_10= '/' ( (lv_effects_11_0= ruleEffect ) ) (otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) ) )* )?
                    {
                    otherlv_7=(Token)match(input,37,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getWithKeyword_7_0());
                          
                    }
                    // InternalSct.g:1844:1: ( ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_BOOLEAN)||LA51_0==30||LA51_0==57||LA51_0==60||LA51_0==64||LA51_0==85||LA51_0==90) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalSct.g:1844:2: ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) )
                            {
                            // InternalSct.g:1844:2: ( (lv_delay_8_0= RULE_INT ) )?
                            int alt50=2;
                            alt50 = dfa50.predict(input);
                            switch (alt50) {
                                case 1 :
                                    // InternalSct.g:1845:1: (lv_delay_8_0= RULE_INT )
                                    {
                                    // InternalSct.g:1845:1: (lv_delay_8_0= RULE_INT )
                                    // InternalSct.g:1846:3: lv_delay_8_0= RULE_INT
                                    {
                                    lv_delay_8_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_11); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_delay_8_0, grammarAccess.getTransitionAccess().getDelayINTTerminalRuleCall_7_1_0_0()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getTransitionRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"delay",
                                              		lv_delay_8_0, 
                                              		"de.cau.cs.kieler.annotations.Annotations.INT");
                                      	    
                                    }

                                    }


                                    }
                                    break;

                            }

                            // InternalSct.g:1862:3: ( (lv_trigger_9_0= ruleBoolExpression ) )
                            // InternalSct.g:1863:1: (lv_trigger_9_0= ruleBoolExpression )
                            {
                            // InternalSct.g:1863:1: (lv_trigger_9_0= ruleBoolExpression )
                            // InternalSct.g:1864:3: lv_trigger_9_0= ruleBoolExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTransitionAccess().getTriggerBoolExpressionParserRuleCall_7_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_54);
                            lv_trigger_9_0=ruleBoolExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"trigger",
                                      		lv_trigger_9_0, 
                                      		"de.cau.cs.kieler.kexpressions.KExpressions.BoolExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalSct.g:1880:4: (otherlv_10= '/' ( (lv_effects_11_0= ruleEffect ) ) (otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) ) )* )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==38) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalSct.g:1880:6: otherlv_10= '/' ( (lv_effects_11_0= ruleEffect ) ) (otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) ) )*
                            {
                            otherlv_10=(Token)match(input,38,FollowSets000.FOLLOW_55); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getSolidusKeyword_7_2_0());
                                  
                            }
                            // InternalSct.g:1884:1: ( (lv_effects_11_0= ruleEffect ) )
                            // InternalSct.g:1885:1: (lv_effects_11_0= ruleEffect )
                            {
                            // InternalSct.g:1885:1: (lv_effects_11_0= ruleEffect )
                            // InternalSct.g:1886:3: lv_effects_11_0= ruleEffect
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_7_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_56);
                            lv_effects_11_0=ruleEffect();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"effects",
                                      		lv_effects_11_0, 
                                      		"de.cau.cs.kieler.kexpressions.keffects.KEffects.Effect");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalSct.g:1902:2: (otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) ) )*
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( (LA52_0==19) ) {
                                    int LA52_1 = input.LA(2);

                                    if ( (synpred63_InternalSct()) ) {
                                        alt52=1;
                                    }


                                }


                                switch (alt52) {
                            	case 1 :
                            	    // InternalSct.g:1902:4: otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) )
                            	    {
                            	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_12, grammarAccess.getTransitionAccess().getSemicolonKeyword_7_2_2_0());
                            	          
                            	    }
                            	    // InternalSct.g:1906:1: ( (lv_effects_13_0= ruleEffect ) )
                            	    // InternalSct.g:1907:1: (lv_effects_13_0= ruleEffect )
                            	    {
                            	    // InternalSct.g:1907:1: (lv_effects_13_0= ruleEffect )
                            	    // InternalSct.g:1908:3: lv_effects_13_0= ruleEffect
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_7_2_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_56);
                            	    lv_effects_13_0=ruleEffect();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"effects",
                            	              		lv_effects_13_0, 
                            	              		"de.cau.cs.kieler.kexpressions.keffects.KEffects.Effect");
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


    // $ANTLR start "entryRuleBinding"
    // InternalSct.g:1932:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalSct.g:1933:2: (iv_ruleBinding= ruleBinding EOF )
            // InternalSct.g:1934:2: iv_ruleBinding= ruleBinding EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinding; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalSct.g:1941:1: ruleBinding returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:1944:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalSct.g:1945:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalSct.g:1945:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) )
            // InternalSct.g:1945:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) )
            {
            // InternalSct.g:1945:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_COMMENT_ANNOTATION||LA55_0==62) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalSct.g:1946:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:1946:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:1947:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBindingAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBindingRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            // InternalSct.g:1963:3: ( (otherlv_1= RULE_ID ) )
            // InternalSct.g:1964:1: (otherlv_1= RULE_ID )
            {
            // InternalSct.g:1964:1: (otherlv_1= RULE_ID )
            // InternalSct.g:1965:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBindingRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getFormalValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBindingAccess().getToKeyword_2());
                  
            }
            // InternalSct.g:1983:1: ( (otherlv_3= RULE_ID ) )
            // InternalSct.g:1984:1: (otherlv_3= RULE_ID )
            {
            // InternalSct.g:1984:1: (otherlv_3= RULE_ID )
            // InternalSct.g:1985:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBindingRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getBindingAccess().getActualValuedObjectCrossReference_3_0()); 
              	
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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleEntryAction"
    // InternalSct.g:2007:1: entryRuleEntryAction returns [EObject current=null] : iv_ruleEntryAction= ruleEntryAction EOF ;
    public final EObject entryRuleEntryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryAction = null;


        try {
            // InternalSct.g:2008:2: (iv_ruleEntryAction= ruleEntryAction EOF )
            // InternalSct.g:2009:2: iv_ruleEntryAction= ruleEntryAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEntryAction=ruleEntryAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSct.g:2016:1: ruleEntryAction returns [EObject current=null] : ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? ) ;
    public final EObject ruleEntryAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_trigger_2_0 = null;

        EObject lv_effects_4_0 = null;

        EObject lv_effects_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:2019:28: ( ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? ) )
            // InternalSct.g:2020:1: ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? )
            {
            // InternalSct.g:2020:1: ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? )
            // InternalSct.g:2020:2: () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )?
            {
            // InternalSct.g:2020:2: ()
            // InternalSct.g:2021:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntryActionAccess().getEntryActionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntryActionAccess().getEntryKeyword_1());
                  
            }
            // InternalSct.g:2033:1: ( (lv_trigger_2_0= ruleBoolExpression ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_STRING && LA56_0<=RULE_BOOLEAN)||LA56_0==30||LA56_0==57||LA56_0==60||LA56_0==64||LA56_0==85||LA56_0==90) ) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_ID) ) {
                int LA56_2 = input.LA(2);

                if ( (LA56_2==EOF||LA56_2==RULE_ID||LA56_2==RULE_COMMENT_ANNOTATION||(LA56_2>=16 && LA56_2<=17)||LA56_2==19||(LA56_2>=26 && LA56_2<=29)||LA56_2==32||LA56_2==35||LA56_2==38||(LA56_2>=40 && LA56_2<=45)||(LA56_2>=47 && LA56_2<=54)||LA56_2==57||LA56_2==59||(LA56_2>=61 && LA56_2<=62)||(LA56_2>=64 && LA56_2<=68)||(LA56_2>=81 && LA56_2<=84)||(LA56_2>=86 && LA56_2<=89)||(LA56_2>=91 && LA56_2<=99)) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // InternalSct.g:2034:1: (lv_trigger_2_0= ruleBoolExpression )
                    {
                    // InternalSct.g:2034:1: (lv_trigger_2_0= ruleBoolExpression )
                    // InternalSct.g:2035:3: lv_trigger_2_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEntryActionAccess().getTriggerBoolExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_59);
                    lv_trigger_2_0=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEntryActionRule());
                      	        }
                             		set(
                             			current, 
                             			"trigger",
                              		lv_trigger_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BoolExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:2051:3: (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==38) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalSct.g:2051:5: otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    {
                    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEntryActionAccess().getSolidusKeyword_3_0());
                          
                    }
                    // InternalSct.g:2055:1: ( (lv_effects_4_0= ruleEffect ) )
                    // InternalSct.g:2056:1: (lv_effects_4_0= ruleEffect )
                    {
                    // InternalSct.g:2056:1: (lv_effects_4_0= ruleEffect )
                    // InternalSct.g:2057:3: lv_effects_4_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEntryActionAccess().getEffectsEffectParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
                    lv_effects_4_0=ruleEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEntryActionRule());
                      	        }
                             		add(
                             			current, 
                             			"effects",
                              		lv_effects_4_0, 
                              		"de.cau.cs.kieler.kexpressions.keffects.KEffects.Effect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSct.g:2073:2: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        alt57 = dfa57.predict(input);
                        switch (alt57) {
                    	case 1 :
                    	    // InternalSct.g:2073:4: otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getEntryActionAccess().getSemicolonKeyword_3_2_0());
                    	          
                    	    }
                    	    // InternalSct.g:2077:1: ( (lv_effects_6_0= ruleEffect ) )
                    	    // InternalSct.g:2078:1: (lv_effects_6_0= ruleEffect )
                    	    {
                    	    // InternalSct.g:2078:1: (lv_effects_6_0= ruleEffect )
                    	    // InternalSct.g:2079:3: lv_effects_6_0= ruleEffect
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEntryActionAccess().getEffectsEffectParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_56);
                    	    lv_effects_6_0=ruleEffect();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEntryActionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"effects",
                    	              		lv_effects_6_0, 
                    	              		"de.cau.cs.kieler.kexpressions.keffects.KEffects.Effect");
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

            // InternalSct.g:2095:6: (otherlv_7= ';' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==19) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalSct.g:2095:8: otherlv_7= ';'
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEntryActionAccess().getSemicolonKeyword_4());
                          
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
    // $ANTLR end "ruleEntryAction"


    // $ANTLR start "entryRuleDuringAction"
    // InternalSct.g:2107:1: entryRuleDuringAction returns [EObject current=null] : iv_ruleDuringAction= ruleDuringAction EOF ;
    public final EObject entryRuleDuringAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuringAction = null;


        try {
            // InternalSct.g:2108:2: (iv_ruleDuringAction= ruleDuringAction EOF )
            // InternalSct.g:2109:2: iv_ruleDuringAction= ruleDuringAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDuringActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDuringAction=ruleDuringAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDuringAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDuringAction"


    // $ANTLR start "ruleDuringAction"
    // InternalSct.g:2116:1: ruleDuringAction returns [EObject current=null] : ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? ) ;
    public final EObject ruleDuringAction() throws RecognitionException {
        EObject current = null;

        Token lv_immediate_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_trigger_3_0 = null;

        EObject lv_effects_5_0 = null;

        EObject lv_effects_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:2119:28: ( ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? ) )
            // InternalSct.g:2120:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? )
            {
            // InternalSct.g:2120:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? )
            // InternalSct.g:2120:2: () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )?
            {
            // InternalSct.g:2120:2: ()
            // InternalSct.g:2121:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDuringActionAccess().getDuringActionAction_0(),
                          current);
                  
            }

            }

            // InternalSct.g:2129:2: ( (lv_immediate_1_0= 'immediate' ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==35) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalSct.g:2130:1: (lv_immediate_1_0= 'immediate' )
                    {
                    // InternalSct.g:2130:1: (lv_immediate_1_0= 'immediate' )
                    // InternalSct.g:2131:3: lv_immediate_1_0= 'immediate'
                    {
                    lv_immediate_1_0=(Token)match(input,35,FollowSets000.FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_immediate_1_0, grammarAccess.getDuringActionAccess().getImmediateImmediateKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDuringActionRule());
                      	        }
                             		setWithLastConsumed(current, "immediate", true, "immediate");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,41,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDuringActionAccess().getDuringKeyword_2());
                  
            }
            // InternalSct.g:2148:1: ( (lv_trigger_3_0= ruleBoolExpression ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_STRING && LA61_0<=RULE_BOOLEAN)||LA61_0==30||LA61_0==57||LA61_0==60||LA61_0==64||LA61_0==85||LA61_0==90) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_ID) ) {
                int LA61_2 = input.LA(2);

                if ( (LA61_2==EOF||LA61_2==RULE_ID||LA61_2==RULE_COMMENT_ANNOTATION||(LA61_2>=16 && LA61_2<=17)||LA61_2==19||(LA61_2>=26 && LA61_2<=29)||LA61_2==32||LA61_2==35||LA61_2==38||(LA61_2>=40 && LA61_2<=45)||(LA61_2>=47 && LA61_2<=54)||LA61_2==57||LA61_2==59||(LA61_2>=61 && LA61_2<=62)||(LA61_2>=64 && LA61_2<=68)||(LA61_2>=81 && LA61_2<=84)||(LA61_2>=86 && LA61_2<=89)||(LA61_2>=91 && LA61_2<=99)) ) {
                    alt61=1;
                }
            }
            switch (alt61) {
                case 1 :
                    // InternalSct.g:2149:1: (lv_trigger_3_0= ruleBoolExpression )
                    {
                    // InternalSct.g:2149:1: (lv_trigger_3_0= ruleBoolExpression )
                    // InternalSct.g:2150:3: lv_trigger_3_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDuringActionAccess().getTriggerBoolExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_59);
                    lv_trigger_3_0=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDuringActionRule());
                      	        }
                             		set(
                             			current, 
                             			"trigger",
                              		lv_trigger_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BoolExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:2166:3: (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==38) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalSct.g:2166:5: otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    {
                    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDuringActionAccess().getSolidusKeyword_4_0());
                          
                    }
                    // InternalSct.g:2170:1: ( (lv_effects_5_0= ruleEffect ) )
                    // InternalSct.g:2171:1: (lv_effects_5_0= ruleEffect )
                    {
                    // InternalSct.g:2171:1: (lv_effects_5_0= ruleEffect )
                    // InternalSct.g:2172:3: lv_effects_5_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDuringActionAccess().getEffectsEffectParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
                    lv_effects_5_0=ruleEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDuringActionRule());
                      	        }
                             		add(
                             			current, 
                             			"effects",
                              		lv_effects_5_0, 
                              		"de.cau.cs.kieler.kexpressions.keffects.KEffects.Effect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSct.g:2188:2: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        alt62 = dfa62.predict(input);
                        switch (alt62) {
                    	case 1 :
                    	    // InternalSct.g:2188:4: otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) )
                    	    {
                    	    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getDuringActionAccess().getSemicolonKeyword_4_2_0());
                    	          
                    	    }
                    	    // InternalSct.g:2192:1: ( (lv_effects_7_0= ruleEffect ) )
                    	    // InternalSct.g:2193:1: (lv_effects_7_0= ruleEffect )
                    	    {
                    	    // InternalSct.g:2193:1: (lv_effects_7_0= ruleEffect )
                    	    // InternalSct.g:2194:3: lv_effects_7_0= ruleEffect
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDuringActionAccess().getEffectsEffectParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_56);
                    	    lv_effects_7_0=ruleEffect();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDuringActionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"effects",
                    	              		lv_effects_7_0, 
                    	              		"de.cau.cs.kieler.kexpressions.keffects.KEffects.Effect");
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

            // InternalSct.g:2210:6: (otherlv_8= ';' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==19) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalSct.g:2210:8: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getDuringActionAccess().getSemicolonKeyword_5());
                          
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
    // $ANTLR end "ruleDuringAction"


    // $ANTLR start "entryRuleExitAction"
    // InternalSct.g:2222:1: entryRuleExitAction returns [EObject current=null] : iv_ruleExitAction= ruleExitAction EOF ;
    public final EObject entryRuleExitAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitAction = null;


        try {
            // InternalSct.g:2223:2: (iv_ruleExitAction= ruleExitAction EOF )
            // InternalSct.g:2224:2: iv_ruleExitAction= ruleExitAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExitAction=ruleExitAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSct.g:2231:1: ruleExitAction returns [EObject current=null] : ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? ) ;
    public final EObject ruleExitAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_trigger_2_0 = null;

        EObject lv_effects_4_0 = null;

        EObject lv_effects_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:2234:28: ( ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? ) )
            // InternalSct.g:2235:1: ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? )
            {
            // InternalSct.g:2235:1: ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? )
            // InternalSct.g:2235:2: () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )?
            {
            // InternalSct.g:2235:2: ()
            // InternalSct.g:2236:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitActionAccess().getExitActionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitActionAccess().getExitKeyword_1());
                  
            }
            // InternalSct.g:2248:1: ( (lv_trigger_2_0= ruleBoolExpression ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_STRING && LA65_0<=RULE_BOOLEAN)||LA65_0==30||LA65_0==57||LA65_0==60||LA65_0==64||LA65_0==85||LA65_0==90) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_ID) ) {
                int LA65_2 = input.LA(2);

                if ( (LA65_2==EOF||LA65_2==RULE_ID||LA65_2==RULE_COMMENT_ANNOTATION||(LA65_2>=16 && LA65_2<=17)||LA65_2==19||(LA65_2>=26 && LA65_2<=29)||LA65_2==32||LA65_2==35||LA65_2==38||(LA65_2>=40 && LA65_2<=45)||(LA65_2>=47 && LA65_2<=54)||LA65_2==57||LA65_2==59||(LA65_2>=61 && LA65_2<=62)||(LA65_2>=64 && LA65_2<=68)||(LA65_2>=81 && LA65_2<=84)||(LA65_2>=86 && LA65_2<=89)||(LA65_2>=91 && LA65_2<=99)) ) {
                    alt65=1;
                }
            }
            switch (alt65) {
                case 1 :
                    // InternalSct.g:2249:1: (lv_trigger_2_0= ruleBoolExpression )
                    {
                    // InternalSct.g:2249:1: (lv_trigger_2_0= ruleBoolExpression )
                    // InternalSct.g:2250:3: lv_trigger_2_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExitActionAccess().getTriggerBoolExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_59);
                    lv_trigger_2_0=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExitActionRule());
                      	        }
                             		set(
                             			current, 
                             			"trigger",
                              		lv_trigger_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BoolExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:2266:3: (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==38) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalSct.g:2266:5: otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    {
                    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getExitActionAccess().getSolidusKeyword_3_0());
                          
                    }
                    // InternalSct.g:2270:1: ( (lv_effects_4_0= ruleEffect ) )
                    // InternalSct.g:2271:1: (lv_effects_4_0= ruleEffect )
                    {
                    // InternalSct.g:2271:1: (lv_effects_4_0= ruleEffect )
                    // InternalSct.g:2272:3: lv_effects_4_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExitActionAccess().getEffectsEffectParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
                    lv_effects_4_0=ruleEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExitActionRule());
                      	        }
                             		add(
                             			current, 
                             			"effects",
                              		lv_effects_4_0, 
                              		"de.cau.cs.kieler.kexpressions.keffects.KEffects.Effect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSct.g:2288:2: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        alt66 = dfa66.predict(input);
                        switch (alt66) {
                    	case 1 :
                    	    // InternalSct.g:2288:4: otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getExitActionAccess().getSemicolonKeyword_3_2_0());
                    	          
                    	    }
                    	    // InternalSct.g:2292:1: ( (lv_effects_6_0= ruleEffect ) )
                    	    // InternalSct.g:2293:1: (lv_effects_6_0= ruleEffect )
                    	    {
                    	    // InternalSct.g:2293:1: (lv_effects_6_0= ruleEffect )
                    	    // InternalSct.g:2294:3: lv_effects_6_0= ruleEffect
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExitActionAccess().getEffectsEffectParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_56);
                    	    lv_effects_6_0=ruleEffect();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getExitActionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"effects",
                    	              		lv_effects_6_0, 
                    	              		"de.cau.cs.kieler.kexpressions.keffects.KEffects.Effect");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSct.g:2310:6: (otherlv_7= ';' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==19) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalSct.g:2310:8: otherlv_7= ';'
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getExitActionAccess().getSemicolonKeyword_4());
                          
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
    // $ANTLR end "ruleExitAction"


    // $ANTLR start "entryRuleSuspendAction"
    // InternalSct.g:2322:1: entryRuleSuspendAction returns [EObject current=null] : iv_ruleSuspendAction= ruleSuspendAction EOF ;
    public final EObject entryRuleSuspendAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspendAction = null;


        try {
            // InternalSct.g:2323:2: (iv_ruleSuspendAction= ruleSuspendAction EOF )
            // InternalSct.g:2324:2: iv_ruleSuspendAction= ruleSuspendAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuspendActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSuspendAction=ruleSuspendAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuspendAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuspendAction"


    // $ANTLR start "ruleSuspendAction"
    // InternalSct.g:2331:1: ruleSuspendAction returns [EObject current=null] : ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? (otherlv_5= ';' )? ) ;
    public final EObject ruleSuspendAction() throws RecognitionException {
        EObject current = null;

        Token lv_immediate_1_0=null;
        Token lv_weak_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_trigger_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:2334:28: ( ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? (otherlv_5= ';' )? ) )
            // InternalSct.g:2335:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? (otherlv_5= ';' )? )
            {
            // InternalSct.g:2335:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? (otherlv_5= ';' )? )
            // InternalSct.g:2335:2: () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? (otherlv_5= ';' )?
            {
            // InternalSct.g:2335:2: ()
            // InternalSct.g:2336:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSuspendActionAccess().getSuspendActionAction_0(),
                          current);
                  
            }

            }

            // InternalSct.g:2344:2: ( (lv_immediate_1_0= 'immediate' ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==35) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalSct.g:2345:1: (lv_immediate_1_0= 'immediate' )
                    {
                    // InternalSct.g:2345:1: (lv_immediate_1_0= 'immediate' )
                    // InternalSct.g:2346:3: lv_immediate_1_0= 'immediate'
                    {
                    lv_immediate_1_0=(Token)match(input,35,FollowSets000.FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_immediate_1_0, grammarAccess.getSuspendActionAccess().getImmediateImmediateKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSuspendActionRule());
                      	        }
                             		setWithLastConsumed(current, "immediate", true, "immediate");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:2359:3: ( (lv_weak_2_0= 'weak' ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==43) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalSct.g:2360:1: (lv_weak_2_0= 'weak' )
                    {
                    // InternalSct.g:2360:1: (lv_weak_2_0= 'weak' )
                    // InternalSct.g:2361:3: lv_weak_2_0= 'weak'
                    {
                    lv_weak_2_0=(Token)match(input,43,FollowSets000.FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_weak_2_0, grammarAccess.getSuspendActionAccess().getWeakWeakKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSuspendActionRule());
                      	        }
                             		setWithLastConsumed(current, "weak", true, "weak");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,44,FollowSets000.FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSuspendActionAccess().getSuspendKeyword_3());
                  
            }
            // InternalSct.g:2378:1: ( (lv_trigger_4_0= ruleBoolExpression ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=RULE_STRING && LA71_0<=RULE_BOOLEAN)||LA71_0==30||LA71_0==57||LA71_0==60||LA71_0==64||LA71_0==85||LA71_0==90) ) {
                alt71=1;
            }
            else if ( (LA71_0==RULE_ID) ) {
                int LA71_2 = input.LA(2);

                if ( (LA71_2==EOF||LA71_2==RULE_ID||LA71_2==RULE_COMMENT_ANNOTATION||(LA71_2>=16 && LA71_2<=17)||LA71_2==19||(LA71_2>=26 && LA71_2<=29)||LA71_2==32||LA71_2==35||(LA71_2>=40 && LA71_2<=45)||(LA71_2>=47 && LA71_2<=54)||LA71_2==57||LA71_2==59||(LA71_2>=61 && LA71_2<=62)||(LA71_2>=64 && LA71_2<=68)||(LA71_2>=81 && LA71_2<=84)||(LA71_2>=86 && LA71_2<=89)||(LA71_2>=91 && LA71_2<=99)) ) {
                    alt71=1;
                }
            }
            switch (alt71) {
                case 1 :
                    // InternalSct.g:2379:1: (lv_trigger_4_0= ruleBoolExpression )
                    {
                    // InternalSct.g:2379:1: (lv_trigger_4_0= ruleBoolExpression )
                    // InternalSct.g:2380:3: lv_trigger_4_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSuspendActionAccess().getTriggerBoolExpressionParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
                    lv_trigger_4_0=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSuspendActionRule());
                      	        }
                             		set(
                             			current, 
                             			"trigger",
                              		lv_trigger_4_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BoolExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:2396:3: (otherlv_5= ';' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==19) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalSct.g:2396:5: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSuspendActionAccess().getSemicolonKeyword_5());
                          
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
    // $ANTLR end "ruleSuspendAction"


    // $ANTLR start "entryRuleIterateAction"
    // InternalSct.g:2408:1: entryRuleIterateAction returns [EObject current=null] : iv_ruleIterateAction= ruleIterateAction EOF ;
    public final EObject entryRuleIterateAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterateAction = null;


        try {
            // InternalSct.g:2409:2: (iv_ruleIterateAction= ruleIterateAction EOF )
            // InternalSct.g:2410:2: iv_ruleIterateAction= ruleIterateAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIterateActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIterateAction=ruleIterateAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIterateAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIterateAction"


    // $ANTLR start "ruleIterateAction"
    // InternalSct.g:2417:1: ruleIterateAction returns [EObject current=null] : ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'iterate' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? ) ;
    public final EObject ruleIterateAction() throws RecognitionException {
        EObject current = null;

        Token lv_immediate_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_trigger_3_0 = null;

        EObject lv_effects_5_0 = null;

        EObject lv_effects_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:2420:28: ( ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'iterate' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? ) )
            // InternalSct.g:2421:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'iterate' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? )
            {
            // InternalSct.g:2421:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'iterate' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? )
            // InternalSct.g:2421:2: () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'iterate' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )?
            {
            // InternalSct.g:2421:2: ()
            // InternalSct.g:2422:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIterateActionAccess().getIterateActionAction_0(),
                          current);
                  
            }

            }

            // InternalSct.g:2430:2: ( (lv_immediate_1_0= 'immediate' ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==35) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalSct.g:2431:1: (lv_immediate_1_0= 'immediate' )
                    {
                    // InternalSct.g:2431:1: (lv_immediate_1_0= 'immediate' )
                    // InternalSct.g:2432:3: lv_immediate_1_0= 'immediate'
                    {
                    lv_immediate_1_0=(Token)match(input,35,FollowSets000.FOLLOW_64); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_immediate_1_0, grammarAccess.getIterateActionAccess().getImmediateImmediateKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIterateActionRule());
                      	        }
                             		setWithLastConsumed(current, "immediate", true, "immediate");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIterateActionAccess().getIterateKeyword_2());
                  
            }
            // InternalSct.g:2449:1: ( (lv_trigger_3_0= ruleBoolExpression ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=RULE_STRING && LA74_0<=RULE_BOOLEAN)||LA74_0==30||LA74_0==57||LA74_0==60||LA74_0==64||LA74_0==85||LA74_0==90) ) {
                alt74=1;
            }
            else if ( (LA74_0==RULE_ID) ) {
                int LA74_2 = input.LA(2);

                if ( (LA74_2==EOF||LA74_2==RULE_ID||LA74_2==RULE_COMMENT_ANNOTATION||(LA74_2>=16 && LA74_2<=17)||LA74_2==19||(LA74_2>=26 && LA74_2<=29)||LA74_2==32||LA74_2==35||LA74_2==38||(LA74_2>=40 && LA74_2<=45)||(LA74_2>=47 && LA74_2<=54)||LA74_2==57||LA74_2==59||(LA74_2>=61 && LA74_2<=62)||(LA74_2>=64 && LA74_2<=68)||(LA74_2>=81 && LA74_2<=84)||(LA74_2>=86 && LA74_2<=89)||(LA74_2>=91 && LA74_2<=99)) ) {
                    alt74=1;
                }
            }
            switch (alt74) {
                case 1 :
                    // InternalSct.g:2450:1: (lv_trigger_3_0= ruleBoolExpression )
                    {
                    // InternalSct.g:2450:1: (lv_trigger_3_0= ruleBoolExpression )
                    // InternalSct.g:2451:3: lv_trigger_3_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIterateActionAccess().getTriggerBoolExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_59);
                    lv_trigger_3_0=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIterateActionRule());
                      	        }
                             		set(
                             			current, 
                             			"trigger",
                              		lv_trigger_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.BoolExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:2467:3: (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==38) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalSct.g:2467:5: otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    {
                    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getIterateActionAccess().getSolidusKeyword_4_0());
                          
                    }
                    // InternalSct.g:2471:1: ( (lv_effects_5_0= ruleEffect ) )
                    // InternalSct.g:2472:1: (lv_effects_5_0= ruleEffect )
                    {
                    // InternalSct.g:2472:1: (lv_effects_5_0= ruleEffect )
                    // InternalSct.g:2473:3: lv_effects_5_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIterateActionAccess().getEffectsEffectParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
                    lv_effects_5_0=ruleEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIterateActionRule());
                      	        }
                             		add(
                             			current, 
                             			"effects",
                              		lv_effects_5_0, 
                              		"de.cau.cs.kieler.kexpressions.keffects.KEffects.Effect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSct.g:2489:2: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        alt75 = dfa75.predict(input);
                        switch (alt75) {
                    	case 1 :
                    	    // InternalSct.g:2489:4: otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) )
                    	    {
                    	    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getIterateActionAccess().getSemicolonKeyword_4_2_0());
                    	          
                    	    }
                    	    // InternalSct.g:2493:1: ( (lv_effects_7_0= ruleEffect ) )
                    	    // InternalSct.g:2494:1: (lv_effects_7_0= ruleEffect )
                    	    {
                    	    // InternalSct.g:2494:1: (lv_effects_7_0= ruleEffect )
                    	    // InternalSct.g:2495:3: lv_effects_7_0= ruleEffect
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIterateActionAccess().getEffectsEffectParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_56);
                    	    lv_effects_7_0=ruleEffect();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getIterateActionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"effects",
                    	              		lv_effects_7_0, 
                    	              		"de.cau.cs.kieler.kexpressions.keffects.KEffects.Effect");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSct.g:2511:6: (otherlv_8= ';' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==19) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalSct.g:2511:8: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getIterateActionAccess().getSemicolonKeyword_5());
                          
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
    // $ANTLR end "ruleIterateAction"


    // $ANTLR start "entryRuleTestEntity"
    // InternalSct.g:2525:1: entryRuleTestEntity returns [EObject current=null] : iv_ruleTestEntity= ruleTestEntity EOF ;
    public final EObject entryRuleTestEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestEntity = null;


        try {
            // InternalSct.g:2526:2: (iv_ruleTestEntity= ruleTestEntity EOF )
            // InternalSct.g:2527:2: iv_ruleTestEntity= ruleTestEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTestEntityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTestEntity=ruleTestEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTestEntity; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestEntity"


    // $ANTLR start "ruleTestEntity"
    // InternalSct.g:2534:1: ruleTestEntity returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) ) ;
    public final EObject ruleTestEntity() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;

        EObject lv_effect_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:2537:28: ( ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) ) )
            // InternalSct.g:2538:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )
            {
            // InternalSct.g:2538:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )
            int alt78=2;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // InternalSct.g:2538:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
                    {
                    // InternalSct.g:2538:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
                    // InternalSct.g:2539:1: (lv_expression_0_0= ruleAnnotatedExpression )
                    {
                    // InternalSct.g:2539:1: (lv_expression_0_0= ruleAnnotatedExpression )
                    // InternalSct.g:2540:3: lv_expression_0_0= ruleAnnotatedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTestEntityAccess().getExpressionAnnotatedExpressionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_expression_0_0=ruleAnnotatedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTestEntityRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_0_0, 
                              		"de.cau.cs.kieler.kexpressions.kext.KExt.AnnotatedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:2557:6: ( (lv_effect_1_0= ruleEffect ) )
                    {
                    // InternalSct.g:2557:6: ( (lv_effect_1_0= ruleEffect ) )
                    // InternalSct.g:2558:1: (lv_effect_1_0= ruleEffect )
                    {
                    // InternalSct.g:2558:1: (lv_effect_1_0= ruleEffect )
                    // InternalSct.g:2559:3: lv_effect_1_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTestEntityAccess().getEffectEffectParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_effect_1_0=ruleEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTestEntityRule());
                      	        }
                             		set(
                             			current, 
                             			"effect",
                              		lv_effect_1_0, 
                              		"de.cau.cs.kieler.kexpressions.keffects.KEffects.Effect");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleTestEntity"


    // $ANTLR start "entryRuleAnnotatedExpression"
    // InternalSct.g:2583:1: entryRuleAnnotatedExpression returns [EObject current=null] : iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF ;
    public final EObject entryRuleAnnotatedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotatedExpression = null;


        try {
            // InternalSct.g:2584:2: (iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF )
            // InternalSct.g:2585:2: iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotatedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnnotatedExpression=ruleAnnotatedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotatedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotatedExpression"


    // $ANTLR start "ruleAnnotatedExpression"
    // InternalSct.g:2592:1: ruleAnnotatedExpression returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAnnotatedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:2595:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalSct.g:2596:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalSct.g:2596:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalSct.g:2596:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalSct.g:2596:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==RULE_COMMENT_ANNOTATION||LA79_0==62) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalSct.g:2597:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:2597:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:2598:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotatedExpressionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_65);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAnnotatedExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAnnotatedExpressionAccess().getExpressionKeyword_1());
                  
            }
            // InternalSct.g:2618:1: ( (lv_expression_2_0= ruleExpression ) )
            // InternalSct.g:2619:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalSct.g:2619:1: (lv_expression_2_0= ruleExpression )
            // InternalSct.g:2620:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotatedExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotatedExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
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
    // $ANTLR end "ruleAnnotatedExpression"


    // $ANTLR start "entryRuleDeclaration"
    // InternalSct.g:2644:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalSct.g:2645:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalSct.g:2646:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSct.g:2653:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_extern_2_0= 'extern' ) )? ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_input_4_0= 'input' ) )? ( (lv_output_5_0= 'output' ) )? ( (lv_static_6_0= 'static' ) )? ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) ) ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_const_1_0=null;
        Token lv_extern_2_0=null;
        Token lv_volatile_3_0=null;
        Token lv_input_4_0=null;
        Token lv_output_5_0=null;
        Token lv_static_6_0=null;
        Token lv_signal_7_0=null;
        Token lv_signal_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_8_0 = null;

        EObject lv_valuedObjects_10_0 = null;

        EObject lv_valuedObjects_12_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:2656:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_extern_2_0= 'extern' ) )? ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_input_4_0= 'input' ) )? ( (lv_output_5_0= 'output' ) )? ( (lv_static_6_0= 'static' ) )? ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) ) ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';' ) )
            // InternalSct.g:2657:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_extern_2_0= 'extern' ) )? ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_input_4_0= 'input' ) )? ( (lv_output_5_0= 'output' ) )? ( (lv_static_6_0= 'static' ) )? ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) ) ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';' )
            {
            // InternalSct.g:2657:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_extern_2_0= 'extern' ) )? ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_input_4_0= 'input' ) )? ( (lv_output_5_0= 'output' ) )? ( (lv_static_6_0= 'static' ) )? ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) ) ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';' )
            // InternalSct.g:2657:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_extern_2_0= 'extern' ) )? ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_input_4_0= 'input' ) )? ( (lv_output_5_0= 'output' ) )? ( (lv_static_6_0= 'static' ) )? ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) ) ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';'
            {
            // InternalSct.g:2657:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==RULE_COMMENT_ANNOTATION||LA80_0==62) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalSct.g:2658:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:2658:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:2659:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_66);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);

            // InternalSct.g:2675:3: ( (lv_const_1_0= 'const' ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==47) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalSct.g:2676:1: (lv_const_1_0= 'const' )
                    {
                    // InternalSct.g:2676:1: (lv_const_1_0= 'const' )
                    // InternalSct.g:2677:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,47,FollowSets000.FOLLOW_67); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_const_1_0, grammarAccess.getDeclarationAccess().getConstConstKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "const", true, "const");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:2690:3: ( (lv_extern_2_0= 'extern' ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==48) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalSct.g:2691:1: (lv_extern_2_0= 'extern' )
                    {
                    // InternalSct.g:2691:1: (lv_extern_2_0= 'extern' )
                    // InternalSct.g:2692:3: lv_extern_2_0= 'extern'
                    {
                    lv_extern_2_0=(Token)match(input,48,FollowSets000.FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_extern_2_0, grammarAccess.getDeclarationAccess().getExternExternKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "extern", true, "extern");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:2705:3: ( (lv_volatile_3_0= 'volatile' ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==49) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalSct.g:2706:1: (lv_volatile_3_0= 'volatile' )
                    {
                    // InternalSct.g:2706:1: (lv_volatile_3_0= 'volatile' )
                    // InternalSct.g:2707:3: lv_volatile_3_0= 'volatile'
                    {
                    lv_volatile_3_0=(Token)match(input,49,FollowSets000.FOLLOW_69); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_volatile_3_0, grammarAccess.getDeclarationAccess().getVolatileVolatileKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "volatile", true, "volatile");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:2720:3: ( (lv_input_4_0= 'input' ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==50) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalSct.g:2721:1: (lv_input_4_0= 'input' )
                    {
                    // InternalSct.g:2721:1: (lv_input_4_0= 'input' )
                    // InternalSct.g:2722:3: lv_input_4_0= 'input'
                    {
                    lv_input_4_0=(Token)match(input,50,FollowSets000.FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_input_4_0, grammarAccess.getDeclarationAccess().getInputInputKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "input", true, "input");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:2735:3: ( (lv_output_5_0= 'output' ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==51) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalSct.g:2736:1: (lv_output_5_0= 'output' )
                    {
                    // InternalSct.g:2736:1: (lv_output_5_0= 'output' )
                    // InternalSct.g:2737:3: lv_output_5_0= 'output'
                    {
                    lv_output_5_0=(Token)match(input,51,FollowSets000.FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_output_5_0, grammarAccess.getDeclarationAccess().getOutputOutputKeyword_5_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "output", true, "output");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:2750:3: ( (lv_static_6_0= 'static' ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==52) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalSct.g:2751:1: (lv_static_6_0= 'static' )
                    {
                    // InternalSct.g:2751:1: (lv_static_6_0= 'static' )
                    // InternalSct.g:2752:3: lv_static_6_0= 'static'
                    {
                    lv_static_6_0=(Token)match(input,52,FollowSets000.FOLLOW_72); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_6_0, grammarAccess.getDeclarationAccess().getStaticStaticKeyword_6_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:2765:3: ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==53) ) {
                int LA88_1 = input.LA(2);

                if ( ((LA88_1>=93 && LA88_1<=99)) ) {
                    alt88=1;
                }
                else if ( (LA88_1==RULE_ID) ) {
                    alt88=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA88_0>=93 && LA88_0<=99)) ) {
                alt88=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalSct.g:2765:4: ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) )
                    {
                    // InternalSct.g:2765:4: ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) )
                    // InternalSct.g:2765:5: ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) )
                    {
                    // InternalSct.g:2765:5: ( (lv_signal_7_0= 'signal' ) )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==53) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalSct.g:2766:1: (lv_signal_7_0= 'signal' )
                            {
                            // InternalSct.g:2766:1: (lv_signal_7_0= 'signal' )
                            // InternalSct.g:2767:3: lv_signal_7_0= 'signal'
                            {
                            lv_signal_7_0=(Token)match(input,53,FollowSets000.FOLLOW_72); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_signal_7_0, grammarAccess.getDeclarationAccess().getSignalSignalKeyword_7_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getDeclarationRule());
                              	        }
                                     		setWithLastConsumed(current, "signal", true, "signal");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // InternalSct.g:2780:3: ( (lv_type_8_0= ruleValueType ) )
                    // InternalSct.g:2781:1: (lv_type_8_0= ruleValueType )
                    {
                    // InternalSct.g:2781:1: (lv_type_8_0= ruleValueType )
                    // InternalSct.g:2782:3: lv_type_8_0= ruleValueType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeValueTypeEnumRuleCall_7_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_type_8_0=ruleValueType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_8_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ValueType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:2799:6: ( (lv_signal_9_0= 'signal' ) )
                    {
                    // InternalSct.g:2799:6: ( (lv_signal_9_0= 'signal' ) )
                    // InternalSct.g:2800:1: (lv_signal_9_0= 'signal' )
                    {
                    // InternalSct.g:2800:1: (lv_signal_9_0= 'signal' )
                    // InternalSct.g:2801:3: lv_signal_9_0= 'signal'
                    {
                    lv_signal_9_0=(Token)match(input,53,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_signal_9_0, grammarAccess.getDeclarationAccess().getSignalSignalKeyword_7_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "signal", true, "signal");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSct.g:2814:3: ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            // InternalSct.g:2815:1: (lv_valuedObjects_10_0= ruleValuedObject )
            {
            // InternalSct.g:2815:1: (lv_valuedObjects_10_0= ruleValuedObject )
            // InternalSct.g:2816:3: lv_valuedObjects_10_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_73);
            lv_valuedObjects_10_0=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"valuedObjects",
                      		lv_valuedObjects_10_0, 
                      		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct.g:2832:2: (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==24) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalSct.g:2832:4: otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) )
            	    {
            	    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getDeclarationAccess().getCommaKeyword_9_0());
            	          
            	    }
            	    // InternalSct.g:2836:1: ( (lv_valuedObjects_12_0= ruleValuedObject ) )
            	    // InternalSct.g:2837:1: (lv_valuedObjects_12_0= ruleValuedObject )
            	    {
            	    // InternalSct.g:2837:1: (lv_valuedObjects_12_0= ruleValuedObject )
            	    // InternalSct.g:2838:3: lv_valuedObjects_12_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_9_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_73);
            	    lv_valuedObjects_12_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_12_0, 
            	              		"de.cau.cs.kieler.kexpressions.kext.KExt.ValuedObject");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getDeclarationAccess().getSemicolonKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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


    // $ANTLR start "entryRuleValuedObject"
    // InternalSct.g:2866:1: entryRuleValuedObject returns [EObject current=null] : iv_ruleValuedObject= ruleValuedObject EOF ;
    public final EObject entryRuleValuedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObject = null;


        try {
            // InternalSct.g:2867:2: (iv_ruleValuedObject= ruleValuedObject EOF )
            // InternalSct.g:2868:2: iv_ruleValuedObject= ruleValuedObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValuedObject=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObject; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObject"


    // $ANTLR start "ruleValuedObject"
    // InternalSct.g:2875:1: ruleValuedObject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? ) ;
    public final EObject ruleValuedObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_cardinalities_2_0 = null;

        EObject lv_initialValue_5_0 = null;

        Enumerator lv_combineOperator_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:2878:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? ) )
            // InternalSct.g:2879:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? )
            {
            // InternalSct.g:2879:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? )
            // InternalSct.g:2879:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )?
            {
            // InternalSct.g:2879:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSct.g:2880:1: (lv_name_0_0= RULE_ID )
            {
            // InternalSct.g:2880:1: (lv_name_0_0= RULE_ID )
            // InternalSct.g:2881:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getValuedObjectAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalSct.g:2897:2: (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==54) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalSct.g:2897:4: otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,54,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // InternalSct.g:2901:1: ( (lv_cardinalities_2_0= ruleExpression ) )
            	    // InternalSct.g:2902:1: (lv_cardinalities_2_0= ruleExpression )
            	    {
            	    // InternalSct.g:2902:1: (lv_cardinalities_2_0= ruleExpression )
            	    // InternalSct.g:2903:3: lv_cardinalities_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getCardinalitiesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_75);
            	    lv_cardinalities_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cardinalities",
            	              		lv_cardinalities_2_0, 
            	              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,55,FollowSets000.FOLLOW_74); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);

            // InternalSct.g:2923:3: (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==18) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalSct.g:2923:5: otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // InternalSct.g:2927:1: ( (lv_initialValue_5_0= ruleExpression ) )
                    // InternalSct.g:2928:1: (lv_initialValue_5_0= ruleExpression )
                    {
                    // InternalSct.g:2928:1: (lv_initialValue_5_0= ruleExpression )
                    // InternalSct.g:2929:3: lv_initialValue_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getInitialValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_76);
                    lv_initialValue_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
                      	        }
                             		set(
                             			current, 
                             			"initialValue",
                              		lv_initialValue_5_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSct.g:2945:4: (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==56) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalSct.g:2945:6: otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) )
                    {
                    otherlv_6=(Token)match(input,56,FollowSets000.FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getValuedObjectAccess().getCombineKeyword_3_0());
                          
                    }
                    // InternalSct.g:2949:1: ( (lv_combineOperator_7_0= ruleCombineOperator ) )
                    // InternalSct.g:2950:1: (lv_combineOperator_7_0= ruleCombineOperator )
                    {
                    // InternalSct.g:2950:1: (lv_combineOperator_7_0= ruleCombineOperator )
                    // InternalSct.g:2951:3: lv_combineOperator_7_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getCombineOperatorCombineOperatorEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_combineOperator_7_0=ruleCombineOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
                      	        }
                             		set(
                             			current, 
                             			"combineOperator",
                              		lv_combineOperator_7_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.CombineOperator");
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
    // $ANTLR end "ruleValuedObject"


    // $ANTLR start "entryRuleEffect"
    // InternalSct.g:2975:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // InternalSct.g:2976:2: (iv_ruleEffect= ruleEffect EOF )
            // InternalSct.g:2977:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEffect=ruleEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSct.g:2984:1: ruleEffect returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_PostfixEffect_1 = null;

        EObject this_Emission_2 = null;

        EObject this_HostcodeEffect_3 = null;

        EObject this_FunctionCallEffect_4 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:2987:28: ( (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect ) )
            // InternalSct.g:2988:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect )
            {
            // InternalSct.g:2988:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect )
            int alt93=5;
            switch ( input.LA(1) ) {
            case RULE_COMMENT_ANNOTATION:
                {
                int LA93_1 = input.LA(2);

                if ( (synpred104_InternalSct()) ) {
                    alt93=1;
                }
                else if ( (synpred105_InternalSct()) ) {
                    alt93=2;
                }
                else if ( (synpred106_InternalSct()) ) {
                    alt93=3;
                }
                else if ( (synpred107_InternalSct()) ) {
                    alt93=4;
                }
                else if ( (true) ) {
                    alt93=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 1, input);

                    throw nvae;
                }
                }
                break;
            case 62:
                {
                int LA93_2 = input.LA(2);

                if ( (synpred104_InternalSct()) ) {
                    alt93=1;
                }
                else if ( (synpred105_InternalSct()) ) {
                    alt93=2;
                }
                else if ( (synpred106_InternalSct()) ) {
                    alt93=3;
                }
                else if ( (synpred107_InternalSct()) ) {
                    alt93=4;
                }
                else if ( (true) ) {
                    alt93=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA93_3 = input.LA(2);

                if ( (synpred104_InternalSct()) ) {
                    alt93=1;
                }
                else if ( (synpred105_InternalSct()) ) {
                    alt93=2;
                }
                else if ( (synpred106_InternalSct()) ) {
                    alt93=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HOSTCODE:
                {
                alt93=4;
                }
                break;
            case 57:
                {
                alt93=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // InternalSct.g:2989:2: this_Assignment_0= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Assignment_0=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Assignment_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSct.g:3002:2: this_PostfixEffect_1= rulePostfixEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getPostfixEffectParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PostfixEffect_1=rulePostfixEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PostfixEffect_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSct.g:3015:2: this_Emission_2= ruleEmission
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Emission_2=ruleEmission();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Emission_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalSct.g:3028:2: this_HostcodeEffect_3= ruleHostcodeEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getHostcodeEffectParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_HostcodeEffect_3=ruleHostcodeEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_HostcodeEffect_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalSct.g:3041:2: this_FunctionCallEffect_4= ruleFunctionCallEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getFunctionCallEffectParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FunctionCallEffect_4=ruleFunctionCallEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCallEffect_4; 
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
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleEmission"
    // InternalSct.g:3060:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // InternalSct.g:3061:2: (iv_ruleEmission= ruleEmission EOF )
            // InternalSct.g:3062:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmissionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEmission=ruleEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmission"


    // $ANTLR start "ruleEmission"
    // InternalSct.g:3069:1: ruleEmission returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_newValue_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3072:28: ( ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? ) )
            // InternalSct.g:3073:1: ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? )
            {
            // InternalSct.g:3073:1: ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? )
            // InternalSct.g:3073:2: ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            {
            // InternalSct.g:3073:2: ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==RULE_COMMENT_ANNOTATION||LA94_0==62) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalSct.g:3074:1: (lv_annotations_0_0= ruleRestrictedAnnotation )
            	    {
            	    // InternalSct.g:3074:1: (lv_annotations_0_0= ruleRestrictedAnnotation )
            	    // InternalSct.g:3075:3: lv_annotations_0_0= ruleRestrictedAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmissionAccess().getAnnotationsRestrictedAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_annotations_0_0=ruleRestrictedAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEmissionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.RestrictedAnnotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            // InternalSct.g:3091:3: ( (otherlv_1= RULE_ID ) )
            // InternalSct.g:3092:1: (otherlv_1= RULE_ID )
            {
            // InternalSct.g:3092:1: (otherlv_1= RULE_ID )
            // InternalSct.g:3093:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmissionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // InternalSct.g:3107:2: (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==30) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalSct.g:3107:4: otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // InternalSct.g:3111:1: ( (lv_newValue_3_0= ruleExpression ) )
                    // InternalSct.g:3112:1: (lv_newValue_3_0= ruleExpression )
                    {
                    // InternalSct.g:3112:1: (lv_newValue_3_0= ruleExpression )
                    // InternalSct.g:3113:3: lv_newValue_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_79);
                    lv_newValue_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEmissionRule());
                      	        }
                             		set(
                             			current, 
                             			"newValue",
                              		lv_newValue_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEmissionAccess().getRightParenthesisKeyword_2_2());
                          
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
    // $ANTLR end "ruleEmission"


    // $ANTLR start "entryRuleAssignment"
    // InternalSct.g:3141:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalSct.g:3142:2: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalSct.g:3143:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalSct.g:3150:1: ruleAssignment returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_indices_3_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3153:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) ) )
            // InternalSct.g:3154:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) )
            {
            // InternalSct.g:3154:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) )
            // InternalSct.g:3154:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) )
            {
            // InternalSct.g:3154:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==RULE_COMMENT_ANNOTATION||LA96_0==62) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalSct.g:3155:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:3155:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:3156:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);

            // InternalSct.g:3172:3: ( (otherlv_1= RULE_ID ) )
            // InternalSct.g:3173:1: (otherlv_1= RULE_ID )
            {
            // InternalSct.g:3173:1: (otherlv_1= RULE_ID )
            // InternalSct.g:3174:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // InternalSct.g:3188:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==54) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalSct.g:3188:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,54,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalSct.g:3192:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // InternalSct.g:3193:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // InternalSct.g:3193:1: (lv_indices_3_0= ruleExpression )
            	    // InternalSct.g:3194:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_75);
            	    lv_indices_3_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"indices",
            	              		lv_indices_3_0, 
            	              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,55,FollowSets000.FOLLOW_80); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);

            // InternalSct.g:3214:3: ( (lv_operator_5_0= ruleAssignOperator ) )
            // InternalSct.g:3215:1: (lv_operator_5_0= ruleAssignOperator )
            {
            // InternalSct.g:3215:1: (lv_operator_5_0= ruleAssignOperator )
            // InternalSct.g:3216:3: lv_operator_5_0= ruleAssignOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getOperatorAssignOperatorEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_11);
            lv_operator_5_0=ruleAssignOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_5_0, 
                      		"de.cau.cs.kieler.kexpressions.keffects.KEffects.AssignOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct.g:3232:2: ( (lv_expression_6_0= ruleExpression ) )
            // InternalSct.g:3233:1: (lv_expression_6_0= ruleExpression )
            {
            // InternalSct.g:3233:1: (lv_expression_6_0= ruleExpression )
            // InternalSct.g:3234:3: lv_expression_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRulePostfixEffect"
    // InternalSct.g:3258:1: entryRulePostfixEffect returns [EObject current=null] : iv_rulePostfixEffect= rulePostfixEffect EOF ;
    public final EObject entryRulePostfixEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixEffect = null;


        try {
            // InternalSct.g:3259:2: (iv_rulePostfixEffect= rulePostfixEffect EOF )
            // InternalSct.g:3260:2: iv_rulePostfixEffect= rulePostfixEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePostfixEffect=rulePostfixEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostfixEffect"


    // $ANTLR start "rulePostfixEffect"
    // InternalSct.g:3267:1: rulePostfixEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) ) ;
    public final EObject rulePostfixEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_indices_3_0 = null;

        Enumerator lv_operator_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3270:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) ) )
            // InternalSct.g:3271:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) )
            {
            // InternalSct.g:3271:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) )
            // InternalSct.g:3271:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) )
            {
            // InternalSct.g:3271:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==RULE_COMMENT_ANNOTATION||LA98_0==62) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalSct.g:3272:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:3272:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:3273:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPostfixEffectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);

            // InternalSct.g:3289:3: ( (otherlv_1= RULE_ID ) )
            // InternalSct.g:3290:1: (otherlv_1= RULE_ID )
            {
            // InternalSct.g:3290:1: (otherlv_1= RULE_ID )
            // InternalSct.g:3291:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPostfixEffectRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getPostfixEffectAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // InternalSct.g:3305:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==54) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalSct.g:3305:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,54,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPostfixEffectAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalSct.g:3309:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // InternalSct.g:3310:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // InternalSct.g:3310:1: (lv_indices_3_0= ruleExpression )
            	    // InternalSct.g:3311:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_75);
            	    lv_indices_3_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPostfixEffectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"indices",
            	              		lv_indices_3_0, 
            	              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,55,FollowSets000.FOLLOW_81); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getPostfixEffectAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);

            // InternalSct.g:3331:3: ( (lv_operator_5_0= rulePostfixOperator ) )
            // InternalSct.g:3332:1: (lv_operator_5_0= rulePostfixOperator )
            {
            // InternalSct.g:3332:1: (lv_operator_5_0= rulePostfixOperator )
            // InternalSct.g:3333:3: lv_operator_5_0= rulePostfixOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getOperatorPostfixOperatorEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_operator_5_0=rulePostfixOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPostfixEffectRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_5_0, 
                      		"de.cau.cs.kieler.kexpressions.keffects.KEffects.PostfixOperator");
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
    // $ANTLR end "rulePostfixEffect"


    // $ANTLR start "entryRuleHostcodeEffect"
    // InternalSct.g:3357:1: entryRuleHostcodeEffect returns [EObject current=null] : iv_ruleHostcodeEffect= ruleHostcodeEffect EOF ;
    public final EObject entryRuleHostcodeEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostcodeEffect = null;


        try {
            // InternalSct.g:3358:2: (iv_ruleHostcodeEffect= ruleHostcodeEffect EOF )
            // InternalSct.g:3359:2: iv_ruleHostcodeEffect= ruleHostcodeEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHostcodeEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHostcodeEffect=ruleHostcodeEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHostcodeEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHostcodeEffect"


    // $ANTLR start "ruleHostcodeEffect"
    // InternalSct.g:3366:1: ruleHostcodeEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) ;
    public final EObject ruleHostcodeEffect() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3369:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) )
            // InternalSct.g:3370:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            {
            // InternalSct.g:3370:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            // InternalSct.g:3370:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) )
            {
            // InternalSct.g:3370:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==RULE_COMMENT_ANNOTATION||LA100_0==62) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalSct.g:3371:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:3371:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:3372:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHostcodeEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_82);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getHostcodeEffectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);

            // InternalSct.g:3388:3: ( (lv_text_1_0= RULE_HOSTCODE ) )
            // InternalSct.g:3389:1: (lv_text_1_0= RULE_HOSTCODE )
            {
            // InternalSct.g:3389:1: (lv_text_1_0= RULE_HOSTCODE )
            // InternalSct.g:3390:3: lv_text_1_0= RULE_HOSTCODE
            {
            lv_text_1_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_text_1_0, grammarAccess.getHostcodeEffectAccess().getTextHOSTCODETerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getHostcodeEffectRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"text",
                      		lv_text_1_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.HOSTCODE");
              	    
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
    // $ANTLR end "ruleHostcodeEffect"


    // $ANTLR start "entryRuleFunctionCallEffect"
    // InternalSct.g:3414:1: entryRuleFunctionCallEffect returns [EObject current=null] : iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF ;
    public final EObject entryRuleFunctionCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallEffect = null;


        try {
            // InternalSct.g:3415:2: (iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF )
            // InternalSct.g:3416:2: iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFunctionCallEffect=ruleFunctionCallEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCallEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCallEffect"


    // $ANTLR start "ruleFunctionCallEffect"
    // InternalSct.g:3423:1: ruleFunctionCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' ) ;
    public final EObject ruleFunctionCallEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_functionName_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3426:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' ) )
            // InternalSct.g:3427:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' )
            {
            // InternalSct.g:3427:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' )
            // InternalSct.g:3427:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>'
            {
            // InternalSct.g:3427:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==RULE_COMMENT_ANNOTATION||LA101_0==62) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // InternalSct.g:3428:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:3428:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:3429:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_83);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);

            otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionCallEffectAccess().getLessThanSignKeyword_1());
                  
            }
            // InternalSct.g:3449:1: ( (lv_functionName_2_0= ruleExtendedID ) )
            // InternalSct.g:3450:1: (lv_functionName_2_0= ruleExtendedID )
            {
            // InternalSct.g:3450:1: (lv_functionName_2_0= ruleExtendedID )
            // InternalSct.g:3451:3: lv_functionName_2_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getFunctionNameExtendedIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_84);
            lv_functionName_2_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
              	        }
                     		set(
                     			current, 
                     			"functionName",
                      		lv_functionName_2_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct.g:3467:2: ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )?
            int alt103=3;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==30) ) {
                alt103=1;
            }
            else if ( (LA103_0==58) ) {
                alt103=2;
            }
            switch (alt103) {
                case 1 :
                    // InternalSct.g:3467:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    {
                    // InternalSct.g:3467:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    // InternalSct.g:3467:5: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_85); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_3_0_0());
                          
                    }
                    // InternalSct.g:3471:1: ( (lv_parameters_4_0= ruleParameter ) )
                    // InternalSct.g:3472:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalSct.g:3472:1: (lv_parameters_4_0= ruleParameter )
                    // InternalSct.g:3473:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
                    lv_parameters_4_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_4_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSct.g:3489:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==24) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // InternalSct.g:3489:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_85); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_3_0_2_0());
                    	          
                    	    }
                    	    // InternalSct.g:3493:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // InternalSct.g:3494:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // InternalSct.g:3494:1: (lv_parameters_6_0= ruleParameter )
                    	    // InternalSct.g:3495:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_3_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_38);
                    	    lv_parameters_6_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionCallEffectRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_6_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop102;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_86); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_3_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:3516:7: otherlv_8= '()'
                    {
                    otherlv_8=(Token)match(input,58,FollowSets000.FOLLOW_86); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_3_1());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getFunctionCallEffectAccess().getGreaterThanSignKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCallEffect"


    // $ANTLR start "entryRuleExpression"
    // InternalSct.g:3532:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSct.g:3533:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalSct.g:3534:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSct.g:3541:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3544:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // InternalSct.g:3545:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // InternalSct.g:3545:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt104=2;
            alt104 = dfa104.predict(input);
            switch (alt104) {
                case 1 :
                    // InternalSct.g:3546:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BoolExpression_0=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSct.g:3559:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValuedExpression_1=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_1; 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBoolExpression"
    // InternalSct.g:3578:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // InternalSct.g:3579:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // InternalSct.g:3580:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolExpression"


    // $ANTLR start "ruleBoolExpression"
    // InternalSct.g:3587:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3590:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // InternalSct.g:3592:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBoolExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
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
    // $ANTLR end "ruleBoolExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // InternalSct.g:3611:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalSct.g:3612:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalSct.g:3613:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSct.g:3620:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3623:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) )
            // InternalSct.g:3624:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            {
            // InternalSct.g:3624:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            // InternalSct.g:3625:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_87);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:3636:1: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==91) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalSct.g:3636:2: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    {
                    // InternalSct.g:3636:2: ()
                    // InternalSct.g:3637:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getLogicalOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSct.g:3645:2: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    int cnt105=0;
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==91) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // InternalSct.g:3645:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    {
                    	    // InternalSct.g:3645:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    	    // InternalSct.g:3646:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    {
                    	    // InternalSct.g:3646:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    // InternalSct.g:3647:3: lv_operator_2_0= ruleLogicalOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_11);
                    	    lv_operator_2_0=ruleLogicalOrOperator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"operator",
                    	              		lv_operator_2_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.LogicalOrOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalSct.g:3663:2: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    // InternalSct.g:3664:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    {
                    	    // InternalSct.g:3664:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    // InternalSct.g:3665:3: lv_subExpressions_3_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_87);
                    	    lv_subExpressions_3_0=ruleLogicalAndExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_3_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.LogicalAndExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt105 >= 1 ) break loop105;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(105, input);
                                throw eee;
                        }
                        cnt105++;
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // InternalSct.g:3689:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalSct.g:3690:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalSct.g:3691:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSct.g:3698:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3701:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) )
            // InternalSct.g:3702:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            {
            // InternalSct.g:3702:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            // InternalSct.g:3703:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_88);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:3714:1: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==92) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalSct.g:3714:2: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    {
                    // InternalSct.g:3714:2: ()
                    // InternalSct.g:3715:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getLogicalAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSct.g:3723:2: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    int cnt107=0;
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==92) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // InternalSct.g:3723:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    // InternalSct.g:3723:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    	    // InternalSct.g:3724:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    {
                    	    // InternalSct.g:3724:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    // InternalSct.g:3725:3: lv_operator_2_0= ruleLogicalAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_11);
                    	    lv_operator_2_0=ruleLogicalAndOperator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"operator",
                    	              		lv_operator_2_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.LogicalAndOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalSct.g:3741:2: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    // InternalSct.g:3742:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    {
                    	    // InternalSct.g:3742:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    // InternalSct.g:3743:3: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_88);
                    	    lv_subExpressions_3_0=ruleBitwiseOrExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_3_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseOrExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt107 >= 1 ) break loop107;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(107, input);
                                throw eee;
                        }
                        cnt107++;
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // InternalSct.g:3767:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // InternalSct.g:3768:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // InternalSct.g:3769:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSct.g:3776:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3779:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) )
            // InternalSct.g:3780:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            {
            // InternalSct.g:3780:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            // InternalSct.g:3781:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_89);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:3792:1: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==86) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalSct.g:3792:2: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    {
                    // InternalSct.g:3792:2: ()
                    // InternalSct.g:3793:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getBitwiseOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSct.g:3801:2: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    int cnt109=0;
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==86) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // InternalSct.g:3801:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    // InternalSct.g:3801:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    	    // InternalSct.g:3802:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    {
                    	    // InternalSct.g:3802:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    // InternalSct.g:3803:3: lv_operator_2_0= ruleBitwiseOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_11);
                    	    lv_operator_2_0=ruleBitwiseOrOperator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBitwiseOrExpressionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"operator",
                    	              		lv_operator_2_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseOrOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalSct.g:3819:2: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    // InternalSct.g:3820:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    {
                    	    // InternalSct.g:3820:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    // InternalSct.g:3821:3: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_89);
                    	    lv_subExpressions_3_0=ruleBitwiseAndExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBitwiseOrExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_3_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseAndExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt109 >= 1 ) break loop109;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(109, input);
                                throw eee;
                        }
                        cnt109++;
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
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // InternalSct.g:3845:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // InternalSct.g:3846:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // InternalSct.g:3847:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSct.g:3854:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3857:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) )
            // InternalSct.g:3858:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            {
            // InternalSct.g:3858:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            // InternalSct.g:3859:2: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_90);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:3870:1: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==61) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalSct.g:3870:2: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    {
                    // InternalSct.g:3870:2: ()
                    // InternalSct.g:3871:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getBitwiseAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSct.g:3879:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    int cnt111=0;
                    loop111:
                    do {
                        int alt111=2;
                        int LA111_0 = input.LA(1);

                        if ( (LA111_0==61) ) {
                            alt111=1;
                        }


                        switch (alt111) {
                    	case 1 :
                    	    // InternalSct.g:3879:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    {
                    	    // InternalSct.g:3879:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    	    // InternalSct.g:3880:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    {
                    	    // InternalSct.g:3880:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    // InternalSct.g:3881:3: lv_operator_2_0= ruleBitwiseAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_11);
                    	    lv_operator_2_0=ruleBitwiseAndOperator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBitwiseAndExpressionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"operator",
                    	              		lv_operator_2_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseAndOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalSct.g:3897:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    // InternalSct.g:3898:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    {
                    	    // InternalSct.g:3898:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    // InternalSct.g:3899:3: lv_subExpressions_3_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_90);
                    	    lv_subExpressions_3_0=ruleCompareOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBitwiseAndExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_3_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.CompareOperation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt111 >= 1 ) break loop111;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(111, input);
                                throw eee;
                        }
                        cnt111++;
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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // InternalSct.g:3923:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // InternalSct.g:3924:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalSct.g:3925:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareOperation"


    // $ANTLR start "ruleCompareOperation"
    // InternalSct.g:3932:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3935:28: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // InternalSct.g:3936:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // InternalSct.g:3936:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // InternalSct.g:3937:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_91);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotOrValuedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:3948:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==57||LA113_0==59||(LA113_0>=81 && LA113_0<=84)) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalSct.g:3948:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // InternalSct.g:3948:2: ()
                    // InternalSct.g:3949:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSct.g:3957:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // InternalSct.g:3958:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // InternalSct.g:3958:1: (lv_operator_2_0= ruleCompareOperator )
                    // InternalSct.g:3959:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_2_0=ruleCompareOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompareOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.CompareOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSct.g:3975:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // InternalSct.g:3976:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // InternalSct.g:3976:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // InternalSct.g:3977:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subExpressions_3_0=ruleNotOrValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompareOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.NotOrValuedExpression");
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
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleNotOrValuedExpression"
    // InternalSct.g:4001:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // InternalSct.g:4002:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // InternalSct.g:4003:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotOrValuedExpression"


    // $ANTLR start "ruleNotOrValuedExpression"
    // InternalSct.g:4010:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4013:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // InternalSct.g:4014:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // InternalSct.g:4014:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt114=2;
            alt114 = dfa114.predict(input);
            switch (alt114) {
                case 1 :
                    // InternalSct.g:4015:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValuedExpression_0=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSct.g:4028:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NotExpression_1=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NotExpression_1; 
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
    // $ANTLR end "ruleNotOrValuedExpression"


    // $ANTLR start "entryRuleNotExpression"
    // InternalSct.g:4047:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalSct.g:4048:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalSct.g:4049:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalSct.g:4056:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4059:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // InternalSct.g:4060:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // InternalSct.g:4060:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==60) ) {
                alt115=1;
            }
            else if ( (LA115_0==RULE_ID||LA115_0==RULE_HOSTCODE||LA115_0==RULE_BOOLEAN||LA115_0==30||LA115_0==57||LA115_0==85||LA115_0==90) ) {
                alt115=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }
            switch (alt115) {
                case 1 :
                    // InternalSct.g:4060:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // InternalSct.g:4060:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // InternalSct.g:4060:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // InternalSct.g:4060:3: ()
                    // InternalSct.g:4061:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSct.g:4069:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // InternalSct.g:4070:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // InternalSct.g:4070:1: (lv_operator_1_0= ruleNotOperator )
                    // InternalSct.g:4071:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_1_0=ruleNotOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNotExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_1_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.NotOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSct.g:4087:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // InternalSct.g:4088:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // InternalSct.g:4088:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // InternalSct.g:4089:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subExpressions_2_0=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNotExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.NotExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:4107:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicExpression_3=ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicExpression_3; 
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
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleValuedExpression"
    // InternalSct.g:4126:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // InternalSct.g:4127:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // InternalSct.g:4128:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValuedExpression=ruleValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedExpression"


    // $ANTLR start "ruleValuedExpression"
    // InternalSct.g:4135:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4138:28: (this_AddExpression_0= ruleAddExpression )
            // InternalSct.g:4140:2: this_AddExpression_0= ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AddExpression_0; 
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
    // $ANTLR end "ruleValuedExpression"


    // $ANTLR start "entryRuleAddExpression"
    // InternalSct.g:4159:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalSct.g:4160:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalSct.g:4161:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // InternalSct.g:4168:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4171:28: ( (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? ) )
            // InternalSct.g:4172:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? )
            {
            // InternalSct.g:4172:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? )
            // InternalSct.g:4173:2: this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_92);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:4184:1: ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==87) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalSct.g:4184:2: () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+
                    {
                    // InternalSct.g:4184:2: ()
                    // InternalSct.g:4185:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSct.g:4193:2: ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+
                    int cnt116=0;
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==87) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // InternalSct.g:4193:3: ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    	    {
                    	    // InternalSct.g:4193:3: ( (lv_operator_2_0= ruleAddOperator ) )
                    	    // InternalSct.g:4194:1: (lv_operator_2_0= ruleAddOperator )
                    	    {
                    	    // InternalSct.g:4194:1: (lv_operator_2_0= ruleAddOperator )
                    	    // InternalSct.g:4195:3: lv_operator_2_0= ruleAddOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_93);
                    	    lv_operator_2_0=ruleAddOperator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAddExpressionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"operator",
                    	              		lv_operator_2_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.AddOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalSct.g:4211:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    	    // InternalSct.g:4212:1: (lv_subExpressions_3_0= ruleSubExpression )
                    	    {
                    	    // InternalSct.g:4212:1: (lv_subExpressions_3_0= ruleSubExpression )
                    	    // InternalSct.g:4213:3: lv_subExpressions_3_0= ruleSubExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_92);
                    	    lv_subExpressions_3_0=ruleSubExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAddExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_3_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.SubExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt116 >= 1 ) break loop116;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(116, input);
                                throw eee;
                        }
                        cnt116++;
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
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleSubExpression"
    // InternalSct.g:4237:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // InternalSct.g:4238:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // InternalSct.g:4239:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubExpression"


    // $ANTLR start "ruleSubExpression"
    // InternalSct.g:4246:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4249:28: ( (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? ) )
            // InternalSct.g:4250:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? )
            {
            // InternalSct.g:4250:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? )
            // InternalSct.g:4251:2: this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_94);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:4262:1: ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==64) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalSct.g:4262:2: () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+
                    {
                    // InternalSct.g:4262:2: ()
                    // InternalSct.g:4263:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSct.g:4271:2: ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+
                    int cnt118=0;
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==64) ) {
                            alt118=1;
                        }


                        switch (alt118) {
                    	case 1 :
                    	    // InternalSct.g:4271:3: ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    	    {
                    	    // InternalSct.g:4271:3: ( (lv_operator_2_0= ruleSubOperator ) )
                    	    // InternalSct.g:4272:1: (lv_operator_2_0= ruleSubOperator )
                    	    {
                    	    // InternalSct.g:4272:1: (lv_operator_2_0= ruleSubOperator )
                    	    // InternalSct.g:4273:3: lv_operator_2_0= ruleSubOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_93);
                    	    lv_operator_2_0=ruleSubOperator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSubExpressionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"operator",
                    	              		lv_operator_2_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.SubOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalSct.g:4289:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    	    // InternalSct.g:4290:1: (lv_subExpressions_3_0= ruleMultExpression )
                    	    {
                    	    // InternalSct.g:4290:1: (lv_subExpressions_3_0= ruleMultExpression )
                    	    // InternalSct.g:4291:3: lv_subExpressions_3_0= ruleMultExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_94);
                    	    lv_subExpressions_3_0=ruleMultExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSubExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_3_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.MultExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt118 >= 1 ) break loop118;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(118, input);
                                throw eee;
                        }
                        cnt118++;
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
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleMultExpression"
    // InternalSct.g:4315:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // InternalSct.g:4316:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // InternalSct.g:4317:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // InternalSct.g:4324:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4327:28: ( (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? ) )
            // InternalSct.g:4328:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? )
            {
            // InternalSct.g:4328:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? )
            // InternalSct.g:4329:2: this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_95);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:4340:1: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==88) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalSct.g:4340:2: () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+
                    {
                    // InternalSct.g:4340:2: ()
                    // InternalSct.g:4341:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSct.g:4349:2: ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+
                    int cnt120=0;
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==88) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // InternalSct.g:4349:3: ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    	    {
                    	    // InternalSct.g:4349:3: ( (lv_operator_2_0= ruleMultOperator ) )
                    	    // InternalSct.g:4350:1: (lv_operator_2_0= ruleMultOperator )
                    	    {
                    	    // InternalSct.g:4350:1: (lv_operator_2_0= ruleMultOperator )
                    	    // InternalSct.g:4351:3: lv_operator_2_0= ruleMultOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_93);
                    	    lv_operator_2_0=ruleMultOperator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMultExpressionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"operator",
                    	              		lv_operator_2_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.MultOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalSct.g:4367:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    	    // InternalSct.g:4368:1: (lv_subExpressions_3_0= ruleDivExpression )
                    	    {
                    	    // InternalSct.g:4368:1: (lv_subExpressions_3_0= ruleDivExpression )
                    	    // InternalSct.g:4369:3: lv_subExpressions_3_0= ruleDivExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_95);
                    	    lv_subExpressions_3_0=ruleDivExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMultExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_3_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.DivExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt120 >= 1 ) break loop120;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(120, input);
                                throw eee;
                        }
                        cnt120++;
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
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // InternalSct.g:4393:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // InternalSct.g:4394:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // InternalSct.g:4395:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDivExpression=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivExpression"


    // $ANTLR start "ruleDivExpression"
    // InternalSct.g:4402:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4405:28: ( (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? ) )
            // InternalSct.g:4406:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? )
            {
            // InternalSct.g:4406:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? )
            // InternalSct.g:4407:2: this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_96);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:4418:1: ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==17) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalSct.g:4418:2: () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+
                    {
                    // InternalSct.g:4418:2: ()
                    // InternalSct.g:4419:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSct.g:4427:2: ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+
                    int cnt122=0;
                    loop122:
                    do {
                        int alt122=2;
                        int LA122_0 = input.LA(1);

                        if ( (LA122_0==17) ) {
                            alt122=1;
                        }


                        switch (alt122) {
                    	case 1 :
                    	    // InternalSct.g:4427:3: ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    	    {
                    	    // InternalSct.g:4427:3: ( (lv_operator_2_0= ruleDivOperator ) )
                    	    // InternalSct.g:4428:1: (lv_operator_2_0= ruleDivOperator )
                    	    {
                    	    // InternalSct.g:4428:1: (lv_operator_2_0= ruleDivOperator )
                    	    // InternalSct.g:4429:3: lv_operator_2_0= ruleDivOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_93);
                    	    lv_operator_2_0=ruleDivOperator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDivExpressionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"operator",
                    	              		lv_operator_2_0, 
                    	              		"de.cau.cs.kieler.sccharts.text.actions.Actions.DivOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalSct.g:4445:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    	    // InternalSct.g:4446:1: (lv_subExpressions_3_0= ruleModExpression )
                    	    {
                    	    // InternalSct.g:4446:1: (lv_subExpressions_3_0= ruleModExpression )
                    	    // InternalSct.g:4447:3: lv_subExpressions_3_0= ruleModExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_96);
                    	    lv_subExpressions_3_0=ruleModExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDivExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_3_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.ModExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt122 >= 1 ) break loop122;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(122, input);
                                throw eee;
                        }
                        cnt122++;
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
    // $ANTLR end "ruleDivExpression"


    // $ANTLR start "entryRuleModExpression"
    // InternalSct.g:4471:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // InternalSct.g:4472:2: (iv_ruleModExpression= ruleModExpression EOF )
            // InternalSct.g:4473:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModExpression=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModExpression"


    // $ANTLR start "ruleModExpression"
    // InternalSct.g:4480:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4483:28: ( (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? ) )
            // InternalSct.g:4484:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? )
            {
            // InternalSct.g:4484:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? )
            // InternalSct.g:4485:2: this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_97);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:4496:1: ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==89) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalSct.g:4496:2: () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+
                    {
                    // InternalSct.g:4496:2: ()
                    // InternalSct.g:4497:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalSct.g:4505:2: ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+
                    int cnt124=0;
                    loop124:
                    do {
                        int alt124=2;
                        int LA124_0 = input.LA(1);

                        if ( (LA124_0==89) ) {
                            alt124=1;
                        }


                        switch (alt124) {
                    	case 1 :
                    	    // InternalSct.g:4505:3: ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    	    {
                    	    // InternalSct.g:4505:3: ( (lv_operator_2_0= ruleModOperator ) )
                    	    // InternalSct.g:4506:1: (lv_operator_2_0= ruleModOperator )
                    	    {
                    	    // InternalSct.g:4506:1: (lv_operator_2_0= ruleModOperator )
                    	    // InternalSct.g:4507:3: lv_operator_2_0= ruleModOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_93);
                    	    lv_operator_2_0=ruleModOperator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getModExpressionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"operator",
                    	              		lv_operator_2_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.ModOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalSct.g:4523:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    	    // InternalSct.g:4524:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    	    {
                    	    // InternalSct.g:4524:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    	    // InternalSct.g:4525:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_97);
                    	    lv_subExpressions_3_0=ruleAtomicValuedExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getModExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_3_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.AtomicValuedExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt124 >= 1 ) break loop124;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(124, input);
                                throw eee;
                        }
                        cnt124++;
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
    // $ANTLR end "ruleModExpression"


    // $ANTLR start "entryRuleNegExpression"
    // InternalSct.g:4549:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // InternalSct.g:4550:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // InternalSct.g:4551:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegExpression"


    // $ANTLR start "ruleNegExpression"
    // InternalSct.g:4558:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4561:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // InternalSct.g:4562:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // InternalSct.g:4562:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==64) ) {
                alt126=1;
            }
            else if ( ((LA126_0>=RULE_ID && LA126_0<=RULE_BOOLEAN)||LA126_0==30||LA126_0==57||LA126_0==85||LA126_0==90) ) {
                alt126=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // InternalSct.g:4562:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // InternalSct.g:4562:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // InternalSct.g:4562:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // InternalSct.g:4562:3: ()
                    // InternalSct.g:4563:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSct.g:4571:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // InternalSct.g:4572:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // InternalSct.g:4572:1: (lv_operator_1_0= ruleSubOperator )
                    // InternalSct.g:4573:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_93);
                    lv_operator_1_0=ruleSubOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNegExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_1_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.SubOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSct.g:4589:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // InternalSct.g:4590:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // InternalSct.g:4590:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // InternalSct.g:4591:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subExpressions_2_0=ruleNegExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNegExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_2_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.NegExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:4609:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicValuedExpression_3=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicValuedExpression_3; 
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
    // $ANTLR end "ruleNegExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalSct.g:4628:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalSct.g:4629:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalSct.g:4630:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // InternalSct.g:4637:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_BoolValue_0 = null;

        EObject this_ValuedObjectTestExpression_1 = null;

        EObject this_BoolExpression_3 = null;

        EObject this_FunctionCall_5 = null;

        EObject this_TextExpression_6 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4640:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) )
            // InternalSct.g:4641:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            {
            // InternalSct.g:4641:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            int alt127=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt127=1;
                }
                break;
            case RULE_ID:
            case 85:
            case 90:
                {
                alt127=2;
                }
                break;
            case 30:
                {
                alt127=3;
                }
                break;
            case 57:
                {
                alt127=4;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt127=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }

            switch (alt127) {
                case 1 :
                    // InternalSct.g:4642:2: this_BoolValue_0= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BoolValue_0=ruleBoolValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSct.g:4655:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValuedObjectTestExpression_1=ruleValuedObjectTestExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedObjectTestExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSct.g:4667:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // InternalSct.g:4667:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // InternalSct.g:4667:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_79);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSct.g:4689:2: this_FunctionCall_5= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FunctionCall_5=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCall_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalSct.g:4702:2: this_TextExpression_6= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TextExpression_6=ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TextExpression_6; 
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
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleAtomicValuedExpression"
    // InternalSct.g:4721:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // InternalSct.g:4722:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // InternalSct.g:4723:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicValuedExpression"


    // $ANTLR start "ruleAtomicValuedExpression"
    // InternalSct.g:4730:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_ValuedExpression_4 = null;

        EObject this_AtomicExpression_6 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4733:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) )
            // InternalSct.g:4734:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            {
            // InternalSct.g:4734:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            int alt128=5;
            alt128 = dfa128.predict(input);
            switch (alt128) {
                case 1 :
                    // InternalSct.g:4735:2: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSct.g:4748:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FloatValue_1=ruleFloatValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FloatValue_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSct.g:4761:2: this_StringValue_2= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getStringValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringValue_2=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringValue_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalSct.g:4773:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    {
                    // InternalSct.g:4773:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    // InternalSct.g:4773:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_93); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_79);
                    this_ValuedExpression_4=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSct.g:4795:2: this_AtomicExpression_6= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicExpression_6=ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicExpression_6; 
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
    // $ANTLR end "ruleAtomicValuedExpression"


    // $ANTLR start "entryRuleValuedObjectTestExpression"
    // InternalSct.g:4814:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // InternalSct.g:4815:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // InternalSct.g:4816:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObjectTestExpression"


    // $ANTLR start "ruleValuedObjectTestExpression"
    // InternalSct.g:4823:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
    public final EObject ruleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_operator_1_1 = null;

        Enumerator lv_operator_1_2 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject this_ValuedObjectReference_5 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4826:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // InternalSct.g:4827:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // InternalSct.g:4827:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==85||LA130_0==90) ) {
                alt130=1;
            }
            else if ( (LA130_0==RULE_ID) ) {
                alt130=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }
            switch (alt130) {
                case 1 :
                    // InternalSct.g:4827:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // InternalSct.g:4827:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // InternalSct.g:4827:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // InternalSct.g:4827:3: ()
                    // InternalSct.g:4828:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalSct.g:4836:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // InternalSct.g:4837:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // InternalSct.g:4837:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // InternalSct.g:4838:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // InternalSct.g:4838:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt129=2;
                    int LA129_0 = input.LA(1);

                    if ( (LA129_0==85) ) {
                        alt129=1;
                    }
                    else if ( (LA129_0==90) ) {
                        alt129=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 129, 0, input);

                        throw nvae;
                    }
                    switch (alt129) {
                        case 1 :
                            // InternalSct.g:4839:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_36);
                            lv_operator_1_1=rulePreOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getValuedObjectTestExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"operator",
                                      		lv_operator_1_1, 
                                      		"de.cau.cs.kieler.kexpressions.KExpressions.PreOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalSct.g:4854:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_36);
                            lv_operator_1_2=ruleValOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getValuedObjectTestExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"operator",
                                      		lv_operator_1_2, 
                                      		"de.cau.cs.kieler.kexpressions.KExpressions.ValOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // InternalSct.g:4876:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // InternalSct.g:4877:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // InternalSct.g:4877:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // InternalSct.g:4878:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_79);
                    lv_subExpressions_3_0=ruleValuedObjectTestExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectTestExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectTestExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:4900:2: this_ValuedObjectReference_5= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValuedObjectReference_5=ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedObjectReference_5; 
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
    // $ANTLR end "ruleValuedObjectTestExpression"


    // $ANTLR start "entryRuleValuedObjectReference"
    // InternalSct.g:4919:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // InternalSct.g:4920:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // InternalSct.g:4921:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValuedObjectReference"


    // $ANTLR start "ruleValuedObjectReference"
    // InternalSct.g:4928:1: ruleValuedObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_indices_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4931:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) )
            // InternalSct.g:4932:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            {
            // InternalSct.g:4932:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            // InternalSct.g:4932:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            {
            // InternalSct.g:4932:2: ( (otherlv_0= RULE_ID ) )
            // InternalSct.g:4933:1: (otherlv_0= RULE_ID )
            {
            // InternalSct.g:4933:1: (otherlv_0= RULE_ID )
            // InternalSct.g:4934:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_98); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalSct.g:4948:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==54) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // InternalSct.g:4948:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,54,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // InternalSct.g:4952:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // InternalSct.g:4953:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // InternalSct.g:4953:1: (lv_indices_2_0= ruleExpression )
            	    // InternalSct.g:4954:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_75);
            	    lv_indices_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getValuedObjectReferenceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"indices",
            	              		lv_indices_2_0, 
            	              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,55,FollowSets000.FOLLOW_98); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop131;
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
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalSct.g:4982:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalSct.g:4983:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalSct.g:4984:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalSct.g:4991:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_functionName_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4994:28: ( (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) )
            // InternalSct.g:4995:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            {
            // InternalSct.g:4995:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            // InternalSct.g:4995:3: otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>'
            {
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0());
                  
            }
            // InternalSct.g:4999:1: ( (lv_functionName_1_0= ruleExtendedID ) )
            // InternalSct.g:5000:1: (lv_functionName_1_0= ruleExtendedID )
            {
            // InternalSct.g:5000:1: (lv_functionName_1_0= ruleExtendedID )
            // InternalSct.g:5001:3: lv_functionName_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_84);
            lv_functionName_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
              	        }
                     		set(
                     			current, 
                     			"functionName",
                      		lv_functionName_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct.g:5017:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )?
            int alt133=3;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==30) ) {
                alt133=1;
            }
            else if ( (LA133_0==58) ) {
                alt133=2;
            }
            switch (alt133) {
                case 1 :
                    // InternalSct.g:5017:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // InternalSct.g:5017:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // InternalSct.g:5017:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_85); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // InternalSct.g:5021:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalSct.g:5022:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalSct.g:5022:1: (lv_parameters_3_0= ruleParameter )
                    // InternalSct.g:5023:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSct.g:5039:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop132:
                    do {
                        int alt132=2;
                        int LA132_0 = input.LA(1);

                        if ( (LA132_0==24) ) {
                            alt132=1;
                        }


                        switch (alt132) {
                    	case 1 :
                    	    // InternalSct.g:5039:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_85); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // InternalSct.g:5043:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalSct.g:5044:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalSct.g:5044:1: (lv_parameters_5_0= ruleParameter )
                    	    // InternalSct.g:5045:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_38);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop132;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_86); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:5066:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,58,FollowSets000.FOLLOW_86); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getFunctionCallAccess().getGreaterThanSignKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleParameter"
    // InternalSct.g:5082:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalSct.g:5083:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalSct.g:5084:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSct.g:5091:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_pureOutput_0_0=null;
        Token lv_callByReference_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:5094:28: ( ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalSct.g:5095:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalSct.g:5095:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalSct.g:5095:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalSct.g:5095:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==60) ) {
                int LA135_1 = input.LA(2);

                if ( (LA135_1==61) ) {
                    alt135=1;
                }
            }
            else if ( (LA135_0==61) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalSct.g:5095:3: ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) )
                    {
                    // InternalSct.g:5095:3: ( (lv_pureOutput_0_0= '!' ) )?
                    int alt134=2;
                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==60) ) {
                        alt134=1;
                    }
                    switch (alt134) {
                        case 1 :
                            // InternalSct.g:5096:1: (lv_pureOutput_0_0= '!' )
                            {
                            // InternalSct.g:5096:1: (lv_pureOutput_0_0= '!' )
                            // InternalSct.g:5097:3: lv_pureOutput_0_0= '!'
                            {
                            lv_pureOutput_0_0=(Token)match(input,60,FollowSets000.FOLLOW_99); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_pureOutput_0_0, grammarAccess.getParameterAccess().getPureOutputExclamationMarkKeyword_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getParameterRule());
                              	        }
                                     		setWithLastConsumed(current, "pureOutput", true, "!");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // InternalSct.g:5110:3: ( (lv_callByReference_1_0= '&' ) )
                    // InternalSct.g:5111:1: (lv_callByReference_1_0= '&' )
                    {
                    // InternalSct.g:5111:1: (lv_callByReference_1_0= '&' )
                    // InternalSct.g:5112:3: lv_callByReference_1_0= '&'
                    {
                    lv_callByReference_1_0=(Token)match(input,61,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_callByReference_1_0, grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterRule());
                      	        }
                             		setWithLastConsumed(current, "callByReference", true, "&");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSct.g:5125:4: ( (lv_expression_2_0= ruleExpression ) )
            // InternalSct.g:5126:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalSct.g:5126:1: (lv_expression_2_0= ruleExpression )
            // InternalSct.g:5127:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
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


    // $ANTLR start "entryRuleTextExpression"
    // InternalSct.g:5151:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // InternalSct.g:5152:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalSct.g:5153:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // InternalSct.g:5160:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct.g:5163:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // InternalSct.g:5164:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // InternalSct.g:5164:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // InternalSct.g:5165:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // InternalSct.g:5165:1: (lv_text_0_0= RULE_HOSTCODE )
            // InternalSct.g:5166:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_text_0_0, grammarAccess.getTextExpressionAccess().getTextHOSTCODETerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTextExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"text",
                      		lv_text_0_0, 
                      		"de.cau.cs.kieler.kexpressions.KExpressions.HOSTCODE");
              	    
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
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleIntValue"
    // InternalSct.g:5190:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalSct.g:5191:2: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalSct.g:5192:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalSct.g:5199:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct.g:5202:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalSct.g:5203:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalSct.g:5203:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalSct.g:5204:1: (lv_value_0_0= RULE_INT )
            {
            // InternalSct.g:5204:1: (lv_value_0_0= RULE_INT )
            // InternalSct.g:5205:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.INT");
              	    
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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleFloatValue"
    // InternalSct.g:5229:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalSct.g:5230:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalSct.g:5231:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // InternalSct.g:5238:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct.g:5241:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalSct.g:5242:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalSct.g:5242:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalSct.g:5243:1: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalSct.g:5243:1: (lv_value_0_0= RULE_FLOAT )
            // InternalSct.g:5244:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFloatValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.FLOAT");
              	    
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
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleBoolValue"
    // InternalSct.g:5268:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // InternalSct.g:5269:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalSct.g:5270:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // InternalSct.g:5277:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct.g:5280:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalSct.g:5281:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalSct.g:5281:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalSct.g:5282:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalSct.g:5282:1: (lv_value_0_0= RULE_BOOLEAN )
            // InternalSct.g:5283:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getBoolValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBoolValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.BOOLEAN");
              	    
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
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalSct.g:5307:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalSct.g:5308:2: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalSct.g:5309:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalSct.g:5316:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct.g:5319:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalSct.g:5320:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalSct.g:5320:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSct.g:5321:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalSct.g:5321:1: (lv_value_0_0= RULE_STRING )
            // InternalSct.g:5322:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.STRING");
              	    
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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleAnnotation"
    // InternalSct.g:5348:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalSct.g:5349:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalSct.g:5350:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalSct.g:5357:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyBooleanValueAnnotation_1 = null;

        EObject this_KeyStringValueAnnotation_2 = null;

        EObject this_TypedKeyStringValueAnnotation_3 = null;

        EObject this_KeyIntValueAnnotation_4 = null;

        EObject this_KeyFloatValueAnnotation_5 = null;

        EObject this_TagAnnotation_6 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:5360:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) )
            // InternalSct.g:5361:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            {
            // InternalSct.g:5361:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            int alt136=7;
            alt136 = dfa136.predict(input);
            switch (alt136) {
                case 1 :
                    // InternalSct.g:5362:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CommentAnnotation_0=ruleCommentAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CommentAnnotation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSct.g:5375:2: this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_KeyBooleanValueAnnotation_1=ruleKeyBooleanValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyBooleanValueAnnotation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSct.g:5388:2: this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_KeyStringValueAnnotation_2=ruleKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyStringValueAnnotation_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalSct.g:5401:2: this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypedKeyStringValueAnnotation_3=ruleTypedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypedKeyStringValueAnnotation_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalSct.g:5414:2: this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_KeyIntValueAnnotation_4=ruleKeyIntValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyIntValueAnnotation_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalSct.g:5427:2: this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_KeyFloatValueAnnotation_5=ruleKeyFloatValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyFloatValueAnnotation_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalSct.g:5440:2: this_TagAnnotation_6= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TagAnnotation_6=ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TagAnnotation_6; 
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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleRestrictedAnnotation"
    // InternalSct.g:5461:1: entryRuleRestrictedAnnotation returns [EObject current=null] : iv_ruleRestrictedAnnotation= ruleRestrictedAnnotation EOF ;
    public final EObject entryRuleRestrictedAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedAnnotation = null;


        try {
            // InternalSct.g:5462:2: (iv_ruleRestrictedAnnotation= ruleRestrictedAnnotation EOF )
            // InternalSct.g:5463:2: iv_ruleRestrictedAnnotation= ruleRestrictedAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRestrictedAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRestrictedAnnotation=ruleRestrictedAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRestrictedAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestrictedAnnotation"


    // $ANTLR start "ruleRestrictedAnnotation"
    // InternalSct.g:5470:1: ruleRestrictedAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) ;
    public final EObject ruleRestrictedAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_QuotedKeyStringValueAnnotation_1 = null;

        EObject this_QuotedTypedKeyStringValueAnnotation_2 = null;

        EObject this_KeyBooleanValueAnnotation_3 = null;

        EObject this_KeyIntValueAnnotation_4 = null;

        EObject this_KeyFloatValueAnnotation_5 = null;

        EObject this_TagAnnotation_6 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:5473:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) )
            // InternalSct.g:5474:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            {
            // InternalSct.g:5474:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            int alt137=7;
            alt137 = dfa137.predict(input);
            switch (alt137) {
                case 1 :
                    // InternalSct.g:5475:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CommentAnnotation_0=ruleCommentAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CommentAnnotation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSct.g:5488:2: this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getQuotedKeyStringValueAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_QuotedKeyStringValueAnnotation_1=ruleQuotedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_QuotedKeyStringValueAnnotation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSct.g:5501:2: this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getQuotedTypedKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_QuotedTypedKeyStringValueAnnotation_2=ruleQuotedTypedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_QuotedTypedKeyStringValueAnnotation_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalSct.g:5514:2: this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_KeyBooleanValueAnnotation_3=ruleKeyBooleanValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyBooleanValueAnnotation_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalSct.g:5527:2: this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_KeyIntValueAnnotation_4=ruleKeyIntValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyIntValueAnnotation_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalSct.g:5540:2: this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_KeyFloatValueAnnotation_5=ruleKeyFloatValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyFloatValueAnnotation_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalSct.g:5553:2: this_TagAnnotation_6= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedAnnotationAccess().getTagAnnotationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TagAnnotation_6=ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TagAnnotation_6; 
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
    // $ANTLR end "ruleRestrictedAnnotation"


    // $ANTLR start "entryRuleCommentAnnotation"
    // InternalSct.g:5572:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // InternalSct.g:5573:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // InternalSct.g:5574:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentAnnotation"


    // $ANTLR start "ruleCommentAnnotation"
    // InternalSct.g:5581:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct.g:5584:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // InternalSct.g:5585:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // InternalSct.g:5585:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // InternalSct.g:5586:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // InternalSct.g:5586:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // InternalSct.g:5587:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_values_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_values_0_0, grammarAccess.getCommentAnnotationAccess().getValuesCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCommentAnnotationRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"values",
                      		lv_values_0_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.COMMENT_ANNOTATION");
              	    
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
    // $ANTLR end "ruleCommentAnnotation"


    // $ANTLR start "entryRuleTagAnnotation"
    // InternalSct.g:5611:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // InternalSct.g:5612:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // InternalSct.g:5613:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTagAnnotation"


    // $ANTLR start "ruleTagAnnotation"
    // InternalSct.g:5620:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:5623:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalSct.g:5624:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalSct.g:5624:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalSct.g:5624:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:5628:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:5629:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:5629:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:5630:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTagAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
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
    // $ANTLR end "ruleTagAnnotation"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // InternalSct.g:5654:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // InternalSct.g:5655:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // InternalSct.g:5656:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyStringValueAnnotation"


    // $ANTLR start "ruleKeyStringValueAnnotation"
    // InternalSct.g:5663:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:5666:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* ) )
            // InternalSct.g:5667:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )
            {
            // InternalSct.g:5667:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )
            // InternalSct.g:5667:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:5671:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:5672:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:5672:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:5673:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_100);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct.g:5689:2: ( (lv_values_2_0= ruleEString ) )
            // InternalSct.g:5690:1: (lv_values_2_0= ruleEString )
            {
            // InternalSct.g:5690:1: (lv_values_2_0= ruleEString )
            // InternalSct.g:5691:3: lv_values_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_21);
            lv_values_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct.g:5707:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
            loop138:
            do {
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( (LA138_0==24) ) {
                    alt138=1;
                }


                switch (alt138) {
            	case 1 :
            	    // InternalSct.g:5707:4: otherlv_3= ',' ( (lv_values_4_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_100); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalSct.g:5711:1: ( (lv_values_4_0= ruleEString ) )
            	    // InternalSct.g:5712:1: (lv_values_4_0= ruleEString )
            	    {
            	    // InternalSct.g:5712:1: (lv_values_4_0= ruleEString )
            	    // InternalSct.g:5713:3: lv_values_4_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_values_4_0=ruleEString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.EString");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop138;
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
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // InternalSct.g:5737:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // InternalSct.g:5738:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // InternalSct.g:5739:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleTypedKeyStringValueAnnotation"
    // InternalSct.g:5746:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_values_5_0 = null;

        AntlrDatatypeRuleToken lv_values_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:5749:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) )
            // InternalSct.g:5750:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            {
            // InternalSct.g:5750:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            // InternalSct.g:5750:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:5754:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:5755:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:5755:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:5756:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_101);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,54,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalSct.g:5776:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalSct.g:5777:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalSct.g:5777:1: (lv_type_3_0= ruleExtendedID )
            // InternalSct.g:5778:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_75);
            lv_type_3_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,55,FollowSets000.FOLLOW_102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalSct.g:5798:1: ( (lv_values_5_0= ruleEStringBoolean ) )
            // InternalSct.g:5799:1: (lv_values_5_0= ruleEStringBoolean )
            {
            // InternalSct.g:5799:1: (lv_values_5_0= ruleEStringBoolean )
            // InternalSct.g:5800:3: lv_values_5_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_21);
            lv_values_5_0=ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_5_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct.g:5816:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            loop139:
            do {
                int alt139=2;
                int LA139_0 = input.LA(1);

                if ( (LA139_0==24) ) {
                    alt139=1;
                }


                switch (alt139) {
            	case 1 :
            	    // InternalSct.g:5816:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_102); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalSct.g:5820:1: ( (lv_values_7_0= ruleEStringBoolean ) )
            	    // InternalSct.g:5821:1: (lv_values_7_0= ruleEStringBoolean )
            	    {
            	    // InternalSct.g:5821:1: (lv_values_7_0= ruleEStringBoolean )
            	    // InternalSct.g:5822:3: lv_values_7_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_values_7_0=ruleEStringBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_7_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop139;
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
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // InternalSct.g:5846:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            // InternalSct.g:5847:2: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // InternalSct.g:5848:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQuotedKeyStringValueAnnotation=ruleQuotedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedKeyStringValueAnnotation"


    // $ANTLR start "ruleQuotedKeyStringValueAnnotation"
    // InternalSct.g:5855:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:5858:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // InternalSct.g:5859:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // InternalSct.g:5859:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // InternalSct.g:5859:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:5863:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:5864:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:5864:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:5865:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_103);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQuotedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct.g:5881:2: ( (lv_values_2_0= RULE_STRING ) )
            // InternalSct.g:5882:1: (lv_values_2_0= RULE_STRING )
            {
            // InternalSct.g:5882:1: (lv_values_2_0= RULE_STRING )
            // InternalSct.g:5883:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_values_2_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getQuotedKeyStringValueAnnotationRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.STRING");
              	    
            }

            }


            }

            // InternalSct.g:5899:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop140:
            do {
                int alt140=2;
                int LA140_0 = input.LA(1);

                if ( (LA140_0==24) ) {
                    alt140=1;
                }


                switch (alt140) {
            	case 1 :
            	    // InternalSct.g:5899:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_103); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalSct.g:5903:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalSct.g:5904:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalSct.g:5904:1: (lv_values_4_0= RULE_STRING )
            	    // InternalSct.g:5905:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_values_4_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getQuotedKeyStringValueAnnotationRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop140;
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
    // $ANTLR end "ruleQuotedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedTypedKeyStringValueAnnotation"
    // InternalSct.g:5929:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            // InternalSct.g:5930:2: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalSct.g:5931:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQuotedTypedKeyStringValueAnnotation=ruleQuotedTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleQuotedTypedKeyStringValueAnnotation"
    // InternalSct.g:5938:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;
        Token lv_values_7_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:5941:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // InternalSct.g:5942:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // InternalSct.g:5942:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // InternalSct.g:5942:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:5946:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:5947:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:5947:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:5948:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_101);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,54,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalSct.g:5968:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalSct.g:5969:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalSct.g:5969:1: (lv_type_3_0= ruleExtendedID )
            // InternalSct.g:5970:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_75);
            lv_type_3_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,55,FollowSets000.FOLLOW_103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalSct.g:5990:1: ( (lv_values_5_0= RULE_STRING ) )
            // InternalSct.g:5991:1: (lv_values_5_0= RULE_STRING )
            {
            // InternalSct.g:5991:1: (lv_values_5_0= RULE_STRING )
            // InternalSct.g:5992:3: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_values_5_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"values",
                      		lv_values_5_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.STRING");
              	    
            }

            }


            }

            // InternalSct.g:6008:2: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==24) ) {
                    alt141=1;
                }


                switch (alt141) {
            	case 1 :
            	    // InternalSct.g:6008:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_103); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalSct.g:6012:1: ( (lv_values_7_0= RULE_STRING ) )
            	    // InternalSct.g:6013:1: (lv_values_7_0= RULE_STRING )
            	    {
            	    // InternalSct.g:6013:1: (lv_values_7_0= RULE_STRING )
            	    // InternalSct.g:6014:3: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_values_7_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_6_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"values",
            	              		lv_values_7_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop141;
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
    // $ANTLR end "ruleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // InternalSct.g:6038:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            // InternalSct.g:6039:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // InternalSct.g:6040:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyBooleanValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyBooleanValueAnnotation"


    // $ANTLR start "ruleKeyBooleanValueAnnotation"
    // InternalSct.g:6047:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:6050:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) )
            // InternalSct.g:6051:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            {
            // InternalSct.g:6051:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            // InternalSct.g:6051:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:6055:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:6056:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:6056:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:6057:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_104);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyBooleanValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct.g:6073:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // InternalSct.g:6074:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // InternalSct.g:6074:1: (lv_value_2_0= RULE_BOOLEAN )
            // InternalSct.g:6075:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKeyBooleanValueAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.BOOLEAN");
              	    
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
    // $ANTLR end "ruleKeyBooleanValueAnnotation"


    // $ANTLR start "entryRuleKeyIntValueAnnotation"
    // InternalSct.g:6099:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            // InternalSct.g:6100:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // InternalSct.g:6101:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyIntValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyIntValueAnnotation"


    // $ANTLR start "ruleKeyIntValueAnnotation"
    // InternalSct.g:6108:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:6111:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) )
            // InternalSct.g:6112:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            {
            // InternalSct.g:6112:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            // InternalSct.g:6112:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) )
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:6116:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:6117:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:6117:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:6118:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_105);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyIntValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct.g:6134:2: ( (lv_value_2_0= ruleInteger ) )
            // InternalSct.g:6135:1: (lv_value_2_0= ruleInteger )
            {
            // InternalSct.g:6135:1: (lv_value_2_0= ruleInteger )
            // InternalSct.g:6136:3: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getValueIntegerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyIntValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.Integer");
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
    // $ANTLR end "ruleKeyIntValueAnnotation"


    // $ANTLR start "entryRuleKeyFloatValueAnnotation"
    // InternalSct.g:6160:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            // InternalSct.g:6161:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // InternalSct.g:6162:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyFloatValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyFloatValueAnnotation"


    // $ANTLR start "ruleKeyFloatValueAnnotation"
    // InternalSct.g:6169:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) ;
    public final EObject ruleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:6172:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) )
            // InternalSct.g:6173:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            {
            // InternalSct.g:6173:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            // InternalSct.g:6173:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) )
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:6177:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:6178:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:6178:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:6179:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_106);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyFloatValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct.g:6195:2: ( (lv_value_2_0= ruleFloateger ) )
            // InternalSct.g:6196:1: (lv_value_2_0= ruleFloateger )
            {
            // InternalSct.g:6196:1: (lv_value_2_0= ruleFloateger )
            // InternalSct.g:6197:3: lv_value_2_0= ruleFloateger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloategerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleFloateger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyFloatValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.Floateger");
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
    // $ANTLR end "ruleKeyFloatValueAnnotation"


    // $ANTLR start "entryRuleEString"
    // InternalSct.g:6221:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSct.g:6222:2: (iv_ruleEString= ruleEString EOF )
            // InternalSct.g:6223:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSct.g:6230:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:6233:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) )
            // InternalSct.g:6234:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            {
            // InternalSct.g:6234:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==RULE_STRING) ) {
                alt142=1;
            }
            else if ( (LA142_0==RULE_ID) ) {
                alt142=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }
            switch (alt142) {
                case 1 :
                    // InternalSct.g:6234:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSct.g:6243:5: this_ExtendedID_1= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAccess().getExtendedIDParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExtendedID_1=ruleExtendedID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExtendedID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEStringBoolean"
    // InternalSct.g:6261:1: entryRuleEStringBoolean returns [String current=null] : iv_ruleEStringBoolean= ruleEStringBoolean EOF ;
    public final String entryRuleEStringBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringBoolean = null;


        try {
            // InternalSct.g:6262:2: (iv_ruleEStringBoolean= ruleEStringBoolean EOF )
            // InternalSct.g:6263:2: iv_ruleEStringBoolean= ruleEStringBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEStringBoolean=ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEStringBoolean.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEStringBoolean"


    // $ANTLR start "ruleEStringBoolean"
    // InternalSct.g:6270:1: ruleEStringBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleEStringBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:6273:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) )
            // InternalSct.g:6274:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            {
            // InternalSct.g:6274:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            int alt143=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt143=1;
                }
                break;
            case RULE_ID:
                {
                alt143=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt143=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }

            switch (alt143) {
                case 1 :
                    // InternalSct.g:6274:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringBooleanAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSct.g:6283:5: this_ExtendedID_1= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringBooleanAccess().getExtendedIDParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExtendedID_1=ruleExtendedID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExtendedID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSct.g:6294:10: this_BOOLEAN_2= RULE_BOOLEAN
                    {
                    this_BOOLEAN_2=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_2, grammarAccess.getEStringBooleanAccess().getBOOLEANTerminalRuleCall_2()); 
                          
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
    // $ANTLR end "ruleEStringBoolean"


    // $ANTLR start "entryRuleExtendedID"
    // InternalSct.g:6309:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // InternalSct.g:6310:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // InternalSct.g:6311:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendedID"


    // $ANTLR start "ruleExtendedID"
    // InternalSct.g:6318:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // InternalSct.g:6321:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) )
            // InternalSct.g:6322:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            {
            // InternalSct.g:6322:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            // InternalSct.g:6322:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_107); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalSct.g:6329:1: (kw= '.' this_ID_2= RULE_ID )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==20) ) {
                    alt144=1;
                }


                switch (alt144) {
            	case 1 :
            	    // InternalSct.g:6330:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_107); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop144;
                }
            } while (true);

            // InternalSct.g:6342:3: (kw= '#' this_INT_4= RULE_INT )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==63) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalSct.g:6343:2: kw= '#' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,63,FollowSets000.FOLLOW_108); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
                          
                    }
                    this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_4, grammarAccess.getExtendedIDAccess().getINTTerminalRuleCall_2_1()); 
                          
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
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "entryRuleInteger"
    // InternalSct.g:6363:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalSct.g:6364:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalSct.g:6365:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalSct.g:6372:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalSct.g:6375:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSct.g:6376:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSct.g:6376:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSct.g:6376:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSct.g:6376:2: (kw= '-' )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==64) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalSct.g:6377:2: kw= '-'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_108); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleFloateger"
    // InternalSct.g:6397:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // InternalSct.g:6398:2: (iv_ruleFloateger= ruleFloateger EOF )
            // InternalSct.g:6399:2: iv_ruleFloateger= ruleFloateger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloategerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFloateger=ruleFloateger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloateger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloateger"


    // $ANTLR start "ruleFloateger"
    // InternalSct.g:6406:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            // InternalSct.g:6409:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // InternalSct.g:6410:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // InternalSct.g:6410:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // InternalSct.g:6410:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // InternalSct.g:6410:2: (kw= '-' )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==64) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalSct.g:6411:2: kw= '-'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_109); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_FLOAT_1=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_FLOAT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_FLOAT_1, grammarAccess.getFloategerAccess().getFLOATTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloateger"


    // $ANTLR start "ruleStateType"
    // InternalSct.g:6431:1: ruleStateType returns [Enumerator current=null] : ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalSct.g:6433:28: ( ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) ) )
            // InternalSct.g:6434:1: ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) )
            {
            // InternalSct.g:6434:1: ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) )
            int alt148=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt148=1;
                }
                break;
            case 66:
                {
                alt148=2;
                }
                break;
            case 67:
                {
                alt148=3;
                }
                break;
            case 68:
                {
                alt148=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 148, 0, input);

                throw nvae;
            }

            switch (alt148) {
                case 1 :
                    // InternalSct.g:6434:2: (enumLiteral_0= 'normal' )
                    {
                    // InternalSct.g:6434:2: (enumLiteral_0= 'normal' )
                    // InternalSct.g:6434:4: enumLiteral_0= 'normal'
                    {
                    enumLiteral_0=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:6440:6: (enumLiteral_1= 'connector' )
                    {
                    // InternalSct.g:6440:6: (enumLiteral_1= 'connector' )
                    // InternalSct.g:6440:8: enumLiteral_1= 'connector'
                    {
                    enumLiteral_1=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getCONNECTOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getStateTypeAccess().getCONNECTOREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSct.g:6446:6: (enumLiteral_2= 'reference' )
                    {
                    // InternalSct.g:6446:6: (enumLiteral_2= 'reference' )
                    // InternalSct.g:6446:8: enumLiteral_2= 'reference'
                    {
                    enumLiteral_2=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSct.g:6452:6: (enumLiteral_3= 'textual' )
                    {
                    // InternalSct.g:6452:6: (enumLiteral_3= 'textual' )
                    // InternalSct.g:6452:8: enumLiteral_3= 'textual'
                    {
                    enumLiteral_3=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getTEXTUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getStateTypeAccess().getTEXTUALEnumLiteralDeclaration_3()); 
                          
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
    // $ANTLR end "ruleStateType"


    // $ANTLR start "ruleTransitionType"
    // InternalSct.g:6462:1: ruleTransitionType returns [Enumerator current=null] : ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) ) ;
    public final Enumerator ruleTransitionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSct.g:6464:28: ( ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) ) )
            // InternalSct.g:6465:1: ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) )
            {
            // InternalSct.g:6465:1: ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) )
            int alt149=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt149=1;
                }
                break;
            case 70:
                {
                alt149=2;
                }
                break;
            case 71:
                {
                alt149=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;
            }

            switch (alt149) {
                case 1 :
                    // InternalSct.g:6465:2: (enumLiteral_0= '-->' )
                    {
                    // InternalSct.g:6465:2: (enumLiteral_0= '-->' )
                    // InternalSct.g:6465:4: enumLiteral_0= '-->'
                    {
                    enumLiteral_0=(Token)match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:6471:6: (enumLiteral_1= 'o->' )
                    {
                    // InternalSct.g:6471:6: (enumLiteral_1= 'o->' )
                    // InternalSct.g:6471:8: enumLiteral_1= 'o->'
                    {
                    enumLiteral_1=(Token)match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSct.g:6477:6: (enumLiteral_2= '>->' )
                    {
                    // InternalSct.g:6477:6: (enumLiteral_2= '>->' )
                    // InternalSct.g:6477:8: enumLiteral_2= '>->'
                    {
                    enumLiteral_2=(Token)match(input,71,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getTERMINATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTransitionTypeAccess().getTERMINATIONEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleTransitionType"


    // $ANTLR start "ruleDivOperator"
    // InternalSct.g:6487:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= ':' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6489:28: ( (enumLiteral_0= ':' ) )
            // InternalSct.g:6490:1: (enumLiteral_0= ':' )
            {
            // InternalSct.g:6490:1: (enumLiteral_0= ':' )
            // InternalSct.g:6490:3: enumLiteral_0= ':'
            {
            enumLiteral_0=(Token)match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivOperator"


    // $ANTLR start "ruleHistoryType"
    // InternalSct.g:6500:1: ruleHistoryType returns [Enumerator current=null] : ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) ) ;
    public final Enumerator ruleHistoryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSct.g:6502:28: ( ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) ) )
            // InternalSct.g:6503:1: ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) )
            {
            // InternalSct.g:6503:1: ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) )
            int alt150=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt150=1;
                }
                break;
            case 73:
                {
                alt150=2;
                }
                break;
            case 74:
                {
                alt150=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 150, 0, input);

                throw nvae;
            }

            switch (alt150) {
                case 1 :
                    // InternalSct.g:6503:2: (enumLiteral_0= 'reset' )
                    {
                    // InternalSct.g:6503:2: (enumLiteral_0= 'reset' )
                    // InternalSct.g:6503:4: enumLiteral_0= 'reset'
                    {
                    enumLiteral_0=(Token)match(input,72,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHistoryTypeAccess().getRESETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getHistoryTypeAccess().getRESETEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:6509:6: (enumLiteral_1= 'shallow history' )
                    {
                    // InternalSct.g:6509:6: (enumLiteral_1= 'shallow history' )
                    // InternalSct.g:6509:8: enumLiteral_1= 'shallow history'
                    {
                    enumLiteral_1=(Token)match(input,73,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHistoryTypeAccess().getSHALLOWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getHistoryTypeAccess().getSHALLOWEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSct.g:6515:6: (enumLiteral_2= 'history' )
                    {
                    // InternalSct.g:6515:6: (enumLiteral_2= 'history' )
                    // InternalSct.g:6515:8: enumLiteral_2= 'history'
                    {
                    enumLiteral_2=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHistoryTypeAccess().getDEEPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getHistoryTypeAccess().getDEEPEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleHistoryType"


    // $ANTLR start "ruleAssignOperator"
    // InternalSct.g:6525:1: ruleAssignOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) ) ;
    public final Enumerator ruleAssignOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // InternalSct.g:6527:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) ) )
            // InternalSct.g:6528:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) )
            {
            // InternalSct.g:6528:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) )
            int alt151=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt151=1;
                }
                break;
            case 75:
                {
                alt151=2;
                }
                break;
            case 76:
                {
                alt151=3;
                }
                break;
            case 77:
                {
                alt151=4;
                }
                break;
            case 78:
                {
                alt151=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 151, 0, input);

                throw nvae;
            }

            switch (alt151) {
                case 1 :
                    // InternalSct.g:6528:2: (enumLiteral_0= '=' )
                    {
                    // InternalSct.g:6528:2: (enumLiteral_0= '=' )
                    // InternalSct.g:6528:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:6534:6: (enumLiteral_1= '+=' )
                    {
                    // InternalSct.g:6534:6: (enumLiteral_1= '+=' )
                    // InternalSct.g:6534:8: enumLiteral_1= '+='
                    {
                    enumLiteral_1=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSct.g:6540:6: (enumLiteral_2= '-=' )
                    {
                    // InternalSct.g:6540:6: (enumLiteral_2= '-=' )
                    // InternalSct.g:6540:8: enumLiteral_2= '-='
                    {
                    enumLiteral_2=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSct.g:6546:6: (enumLiteral_3= '*=' )
                    {
                    // InternalSct.g:6546:6: (enumLiteral_3= '*=' )
                    // InternalSct.g:6546:8: enumLiteral_3= '*='
                    {
                    enumLiteral_3=(Token)match(input,77,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSct.g:6552:6: (enumLiteral_4= '/=' )
                    {
                    // InternalSct.g:6552:6: (enumLiteral_4= '/=' )
                    // InternalSct.g:6552:8: enumLiteral_4= '/='
                    {
                    enumLiteral_4=(Token)match(input,78,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4()); 
                          
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
    // $ANTLR end "ruleAssignOperator"


    // $ANTLR start "rulePostfixOperator"
    // InternalSct.g:6562:1: rulePostfixOperator returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator rulePostfixOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalSct.g:6564:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalSct.g:6565:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalSct.g:6565:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==79) ) {
                alt152=1;
            }
            else if ( (LA152_0==80) ) {
                alt152=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 152, 0, input);

                throw nvae;
            }
            switch (alt152) {
                case 1 :
                    // InternalSct.g:6565:2: (enumLiteral_0= '++' )
                    {
                    // InternalSct.g:6565:2: (enumLiteral_0= '++' )
                    // InternalSct.g:6565:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,79,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:6571:6: (enumLiteral_1= '--' )
                    {
                    // InternalSct.g:6571:6: (enumLiteral_1= '--' )
                    // InternalSct.g:6571:8: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,80,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPostfixOperatorAccess().getPOSTFIXSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getPostfixOperatorAccess().getPOSTFIXSUBEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "rulePostfixOperator"


    // $ANTLR start "ruleCompareOperator"
    // InternalSct.g:6581:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // InternalSct.g:6583:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalSct.g:6584:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalSct.g:6584:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt153=6;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt153=1;
                }
                break;
            case 57:
                {
                alt153=2;
                }
                break;
            case 82:
                {
                alt153=3;
                }
                break;
            case 59:
                {
                alt153=4;
                }
                break;
            case 83:
                {
                alt153=5;
                }
                break;
            case 84:
                {
                alt153=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 153, 0, input);

                throw nvae;
            }

            switch (alt153) {
                case 1 :
                    // InternalSct.g:6584:2: (enumLiteral_0= '==' )
                    {
                    // InternalSct.g:6584:2: (enumLiteral_0= '==' )
                    // InternalSct.g:6584:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,81,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:6590:6: (enumLiteral_1= '<' )
                    {
                    // InternalSct.g:6590:6: (enumLiteral_1= '<' )
                    // InternalSct.g:6590:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSct.g:6596:6: (enumLiteral_2= '<=' )
                    {
                    // InternalSct.g:6596:6: (enumLiteral_2= '<=' )
                    // InternalSct.g:6596:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,82,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSct.g:6602:6: (enumLiteral_3= '>' )
                    {
                    // InternalSct.g:6602:6: (enumLiteral_3= '>' )
                    // InternalSct.g:6602:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSct.g:6608:6: (enumLiteral_4= '>=' )
                    {
                    // InternalSct.g:6608:6: (enumLiteral_4= '>=' )
                    // InternalSct.g:6608:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,83,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSct.g:6614:6: (enumLiteral_5= '!=' )
                    {
                    // InternalSct.g:6614:6: (enumLiteral_5= '!=' )
                    // InternalSct.g:6614:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,84,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                          
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
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "rulePreOperator"
    // InternalSct.g:6624:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6626:28: ( (enumLiteral_0= 'pre' ) )
            // InternalSct.g:6627:1: (enumLiteral_0= 'pre' )
            {
            // InternalSct.g:6627:1: (enumLiteral_0= 'pre' )
            // InternalSct.g:6627:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,85,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreOperator"


    // $ANTLR start "ruleBitwiseOrOperator"
    // InternalSct.g:6637:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6639:28: ( (enumLiteral_0= '|' ) )
            // InternalSct.g:6640:1: (enumLiteral_0= '|' )
            {
            // InternalSct.g:6640:1: (enumLiteral_0= '|' )
            // InternalSct.g:6640:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,86,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getBitwiseOrOperatorAccess().getBITWISE_OREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getBitwiseOrOperatorAccess().getBITWISE_OREnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseOrOperator"


    // $ANTLR start "ruleBitwiseAndOperator"
    // InternalSct.g:6650:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6652:28: ( (enumLiteral_0= '&' ) )
            // InternalSct.g:6653:1: (enumLiteral_0= '&' )
            {
            // InternalSct.g:6653:1: (enumLiteral_0= '&' )
            // InternalSct.g:6653:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getBitwiseAndOperatorAccess().getBITWISE_ANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getBitwiseAndOperatorAccess().getBITWISE_ANDEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseAndOperator"


    // $ANTLR start "ruleNotOperator"
    // InternalSct.g:6663:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6665:28: ( (enumLiteral_0= '!' ) )
            // InternalSct.g:6666:1: (enumLiteral_0= '!' )
            {
            // InternalSct.g:6666:1: (enumLiteral_0= '!' )
            // InternalSct.g:6666:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "ruleAddOperator"
    // InternalSct.g:6676:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6678:28: ( (enumLiteral_0= '+' ) )
            // InternalSct.g:6679:1: (enumLiteral_0= '+' )
            {
            // InternalSct.g:6679:1: (enumLiteral_0= '+' )
            // InternalSct.g:6679:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,87,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddOperator"


    // $ANTLR start "ruleSubOperator"
    // InternalSct.g:6689:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6691:28: ( (enumLiteral_0= '-' ) )
            // InternalSct.g:6692:1: (enumLiteral_0= '-' )
            {
            // InternalSct.g:6692:1: (enumLiteral_0= '-' )
            // InternalSct.g:6692:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubOperator"


    // $ANTLR start "ruleMultOperator"
    // InternalSct.g:6702:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6704:28: ( (enumLiteral_0= '*' ) )
            // InternalSct.g:6705:1: (enumLiteral_0= '*' )
            {
            // InternalSct.g:6705:1: (enumLiteral_0= '*' )
            // InternalSct.g:6705:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,88,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultOperator"


    // $ANTLR start "ruleModOperator"
    // InternalSct.g:6715:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6717:28: ( (enumLiteral_0= '%' ) )
            // InternalSct.g:6718:1: (enumLiteral_0= '%' )
            {
            // InternalSct.g:6718:1: (enumLiteral_0= '%' )
            // InternalSct.g:6718:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,89,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModOperator"


    // $ANTLR start "ruleValOperator"
    // InternalSct.g:6728:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6730:28: ( (enumLiteral_0= 'val' ) )
            // InternalSct.g:6731:1: (enumLiteral_0= 'val' )
            {
            // InternalSct.g:6731:1: (enumLiteral_0= 'val' )
            // InternalSct.g:6731:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,90,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValOperator"


    // $ANTLR start "ruleLogicalOrOperator"
    // InternalSct.g:6741:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6743:28: ( (enumLiteral_0= '||' ) )
            // InternalSct.g:6744:1: (enumLiteral_0= '||' )
            {
            // InternalSct.g:6744:1: (enumLiteral_0= '||' )
            // InternalSct.g:6744:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,91,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getLogicalOrOperatorAccess().getLOGICAL_OREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getLogicalOrOperatorAccess().getLOGICAL_OREnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrOperator"


    // $ANTLR start "ruleLogicalAndOperator"
    // InternalSct.g:6754:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6756:28: ( (enumLiteral_0= '&&' ) )
            // InternalSct.g:6757:1: (enumLiteral_0= '&&' )
            {
            // InternalSct.g:6757:1: (enumLiteral_0= '&&' )
            // InternalSct.g:6757:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,92,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getLogicalAndOperatorAccess().getLOGICAL_ANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getLogicalAndOperatorAccess().getLOGICAL_ANDEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndOperator"


    // $ANTLR start "ruleValueType"
    // InternalSct.g:6771:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            // InternalSct.g:6773:28: ( ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) )
            // InternalSct.g:6774:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            {
            // InternalSct.g:6774:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            int alt154=7;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt154=1;
                }
                break;
            case 94:
                {
                alt154=2;
                }
                break;
            case 95:
                {
                alt154=3;
                }
                break;
            case 96:
                {
                alt154=4;
                }
                break;
            case 97:
                {
                alt154=5;
                }
                break;
            case 98:
                {
                alt154=6;
                }
                break;
            case 99:
                {
                alt154=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 154, 0, input);

                throw nvae;
            }

            switch (alt154) {
                case 1 :
                    // InternalSct.g:6774:2: (enumLiteral_0= 'pure' )
                    {
                    // InternalSct.g:6774:2: (enumLiteral_0= 'pure' )
                    // InternalSct.g:6774:4: enumLiteral_0= 'pure'
                    {
                    enumLiteral_0=(Token)match(input,93,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:6780:6: (enumLiteral_1= 'bool' )
                    {
                    // InternalSct.g:6780:6: (enumLiteral_1= 'bool' )
                    // InternalSct.g:6780:8: enumLiteral_1= 'bool'
                    {
                    enumLiteral_1=(Token)match(input,94,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSct.g:6786:6: (enumLiteral_2= 'unsigned' )
                    {
                    // InternalSct.g:6786:6: (enumLiteral_2= 'unsigned' )
                    // InternalSct.g:6786:8: enumLiteral_2= 'unsigned'
                    {
                    enumLiteral_2=(Token)match(input,95,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSct.g:6792:6: (enumLiteral_3= 'int' )
                    {
                    // InternalSct.g:6792:6: (enumLiteral_3= 'int' )
                    // InternalSct.g:6792:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,96,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSct.g:6798:6: (enumLiteral_4= 'float' )
                    {
                    // InternalSct.g:6798:6: (enumLiteral_4= 'float' )
                    // InternalSct.g:6798:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,97,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSct.g:6804:6: (enumLiteral_5= 'string' )
                    {
                    // InternalSct.g:6804:6: (enumLiteral_5= 'string' )
                    // InternalSct.g:6804:8: enumLiteral_5= 'string'
                    {
                    enumLiteral_5=(Token)match(input,98,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSct.g:6810:6: (enumLiteral_6= 'host' )
                    {
                    // InternalSct.g:6810:6: (enumLiteral_6= 'host' )
                    // InternalSct.g:6810:8: enumLiteral_6= 'host'
                    {
                    enumLiteral_6=(Token)match(input,99,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_6()); 
                          
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
    // $ANTLR end "ruleValueType"


    // $ANTLR start "ruleCombineOperator"
    // InternalSct.g:6822:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) ;
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
            // InternalSct.g:6824:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) )
            // InternalSct.g:6825:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            {
            // InternalSct.g:6825:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            int alt155=8;
            switch ( input.LA(1) ) {
            case 100:
                {
                alt155=1;
                }
                break;
            case 87:
                {
                alt155=2;
                }
                break;
            case 88:
                {
                alt155=3;
                }
                break;
            case 101:
                {
                alt155=4;
                }
                break;
            case 102:
                {
                alt155=5;
                }
                break;
            case 86:
                {
                alt155=6;
                }
                break;
            case 61:
                {
                alt155=7;
                }
                break;
            case 99:
                {
                alt155=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 155, 0, input);

                throw nvae;
            }

            switch (alt155) {
                case 1 :
                    // InternalSct.g:6825:2: (enumLiteral_0= 'none' )
                    {
                    // InternalSct.g:6825:2: (enumLiteral_0= 'none' )
                    // InternalSct.g:6825:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,100,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:6831:6: (enumLiteral_1= '+' )
                    {
                    // InternalSct.g:6831:6: (enumLiteral_1= '+' )
                    // InternalSct.g:6831:8: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,87,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSct.g:6837:6: (enumLiteral_2= '*' )
                    {
                    // InternalSct.g:6837:6: (enumLiteral_2= '*' )
                    // InternalSct.g:6837:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,88,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSct.g:6843:6: (enumLiteral_3= 'max' )
                    {
                    // InternalSct.g:6843:6: (enumLiteral_3= 'max' )
                    // InternalSct.g:6843:8: enumLiteral_3= 'max'
                    {
                    enumLiteral_3=(Token)match(input,101,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSct.g:6849:6: (enumLiteral_4= 'min' )
                    {
                    // InternalSct.g:6849:6: (enumLiteral_4= 'min' )
                    // InternalSct.g:6849:8: enumLiteral_4= 'min'
                    {
                    enumLiteral_4=(Token)match(input,102,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSct.g:6855:6: (enumLiteral_5= '|' )
                    {
                    // InternalSct.g:6855:6: (enumLiteral_5= '|' )
                    // InternalSct.g:6855:8: enumLiteral_5= '|'
                    {
                    enumLiteral_5=(Token)match(input,86,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSct.g:6861:6: (enumLiteral_6= '&' )
                    {
                    // InternalSct.g:6861:6: (enumLiteral_6= '&' )
                    // InternalSct.g:6861:8: enumLiteral_6= '&'
                    {
                    enumLiteral_6=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalSct.g:6867:6: (enumLiteral_7= 'host' )
                    {
                    // InternalSct.g:6867:6: (enumLiteral_7= 'host' )
                    // InternalSct.g:6867:8: enumLiteral_7= 'host'
                    {
                    enumLiteral_7=(Token)match(input,99,FollowSets000.FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalSct
    public final void synpred1_InternalSct_fragment() throws RecognitionException {   
        EObject lv_states_1_0 = null;


        // InternalSct.g:130:1: ( (lv_states_1_0= ruleState ) )
        // InternalSct.g:130:1: (lv_states_1_0= ruleState )
        {
        // InternalSct.g:130:1: (lv_states_1_0= ruleState )
        // InternalSct.g:131:3: lv_states_1_0= ruleState
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSingleControlflowRegionAccess().getStatesStateParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_states_1_0=ruleState();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalSct

    // $ANTLR start synpred8_InternalSct
    public final void synpred8_InternalSct_fragment() throws RecognitionException {   
        EObject lv_states_7_0 = null;


        // InternalSct.g:325:1: ( (lv_states_7_0= ruleState ) )
        // InternalSct.g:325:1: (lv_states_7_0= ruleState )
        {
        // InternalSct.g:325:1: (lv_states_7_0= ruleState )
        // InternalSct.g:326:3: lv_states_7_0= ruleState
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getControlflowRegionAccess().getStatesStateParserRuleCall_7_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_states_7_0=ruleState();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalSct

    // $ANTLR start synpred19_InternalSct
    public final void synpred19_InternalSct_fragment() throws RecognitionException {   
        EObject lv_regions_13_0 = null;

        EObject lv_regions_14_0 = null;


        // InternalSct.g:664:5: ( ( (lv_regions_13_0= ruleSingleControlflowRegion ) )? ( (lv_regions_14_0= ruleRegion ) )* )
        // InternalSct.g:664:5: ( (lv_regions_13_0= ruleSingleControlflowRegion ) )? ( (lv_regions_14_0= ruleRegion ) )*
        {
        // InternalSct.g:664:5: ( (lv_regions_13_0= ruleSingleControlflowRegion ) )?
        int alt159=2;
        alt159 = dfa159.predict(input);
        switch (alt159) {
            case 1 :
                // InternalSct.g:665:1: (lv_regions_13_0= ruleSingleControlflowRegion )
                {
                // InternalSct.g:665:1: (lv_regions_13_0= ruleSingleControlflowRegion )
                // InternalSct.g:666:3: lv_regions_13_0= ruleSingleControlflowRegion
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsSingleControlflowRegionParserRuleCall_4_1_2_0_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_110);
                lv_regions_13_0=ruleSingleControlflowRegion();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        // InternalSct.g:682:3: ( (lv_regions_14_0= ruleRegion ) )*
        loop160:
        do {
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==RULE_COMMENT_ANNOTATION||LA160_0==16||LA160_0==62) ) {
                alt160=1;
            }


            switch (alt160) {
        	case 1 :
        	    // InternalSct.g:683:1: (lv_regions_14_0= ruleRegion )
        	    {
        	    // InternalSct.g:683:1: (lv_regions_14_0= ruleRegion )
        	    // InternalSct.g:684:3: lv_regions_14_0= ruleRegion
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsRegionParserRuleCall_4_1_2_1_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_110);
        	    lv_regions_14_0=ruleRegion();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop160;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred19_InternalSct

    // $ANTLR start synpred33_InternalSct
    public final void synpred33_InternalSct_fragment() throws RecognitionException {   
        EObject lv_regions_18_0 = null;


        // InternalSct.g:1002:1: ( (lv_regions_18_0= ruleSingleControlflowRegion ) )
        // InternalSct.g:1002:1: (lv_regions_18_0= ruleSingleControlflowRegion )
        {
        // InternalSct.g:1002:1: (lv_regions_18_0= ruleSingleControlflowRegion )
        // InternalSct.g:1003:3: lv_regions_18_0= ruleSingleControlflowRegion
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStateAccess().getRegionsSingleControlflowRegionParserRuleCall_6_1_2_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_regions_18_0=ruleSingleControlflowRegion();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalSct

    // $ANTLR start synpred34_InternalSct
    public final void synpred34_InternalSct_fragment() throws RecognitionException {   
        EObject lv_regions_19_0 = null;


        // InternalSct.g:1020:1: ( (lv_regions_19_0= ruleRegion ) )
        // InternalSct.g:1020:1: (lv_regions_19_0= ruleRegion )
        {
        // InternalSct.g:1020:1: (lv_regions_19_0= ruleRegion )
        // InternalSct.g:1021:3: lv_regions_19_0= ruleRegion
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_6_1_2_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_regions_19_0=ruleRegion();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred34_InternalSct

    // $ANTLR start synpred47_InternalSct
    public final void synpred47_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_expressions_13_0 = null;


        // InternalSct.g:1409:2: ( ( ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';' )* )
        // InternalSct.g:1409:2: ( ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';' )*
        {
        // InternalSct.g:1409:2: ( ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';' )*
        loop175:
        do {
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==RULE_ID) ) {
                alt175=1;
            }


            switch (alt175) {
        	case 1 :
        	    // InternalSct.g:1409:3: ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';'
        	    {
        	    // InternalSct.g:1409:3: ( (otherlv_11= RULE_ID ) )
        	    // InternalSct.g:1410:1: (otherlv_11= RULE_ID )
        	    {
        	    // InternalSct.g:1410:1: (otherlv_11= RULE_ID )
        	    // InternalSct.g:1411:3: otherlv_11= RULE_ID
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      		  /* */ 
        	      		
        	    }
        	    otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return ;

        	    }


        	    }

        	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return ;
        	    // InternalSct.g:1429:1: ( (lv_expressions_13_0= ruleExpression ) )
        	    // InternalSct.g:1430:1: (lv_expressions_13_0= ruleExpression )
        	    {
        	    // InternalSct.g:1430:1: (lv_expressions_13_0= ruleExpression )
        	    // InternalSct.g:1431:3: lv_expressions_13_0= ruleExpression
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getDefineNodeAccess().getExpressionsExpressionParserRuleCall_11_0_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_12);
        	    lv_expressions_13_0=ruleExpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }

        	    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_111); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop175;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred47_InternalSct

    // $ANTLR start synpred61_InternalSct
    public final void synpred61_InternalSct_fragment() throws RecognitionException {   
        Token lv_delay_8_0=null;

        // InternalSct.g:1845:1: ( (lv_delay_8_0= RULE_INT ) )
        // InternalSct.g:1845:1: (lv_delay_8_0= RULE_INT )
        {
        // InternalSct.g:1845:1: (lv_delay_8_0= RULE_INT )
        // InternalSct.g:1846:3: lv_delay_8_0= RULE_INT
        {
        lv_delay_8_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred61_InternalSct

    // $ANTLR start synpred63_InternalSct
    public final void synpred63_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        EObject lv_effects_13_0 = null;


        // InternalSct.g:1902:4: (otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) ) )
        // InternalSct.g:1902:4: otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) )
        {
        otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return ;
        // InternalSct.g:1906:1: ( (lv_effects_13_0= ruleEffect ) )
        // InternalSct.g:1907:1: (lv_effects_13_0= ruleEffect )
        {
        // InternalSct.g:1907:1: (lv_effects_13_0= ruleEffect )
        // InternalSct.g:1908:3: lv_effects_13_0= ruleEffect
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_7_2_2_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_effects_13_0=ruleEffect();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred63_InternalSct

    // $ANTLR start synpred68_InternalSct
    public final void synpred68_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_effects_6_0 = null;


        // InternalSct.g:2073:4: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )
        // InternalSct.g:2073:4: otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) )
        {
        otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return ;
        // InternalSct.g:2077:1: ( (lv_effects_6_0= ruleEffect ) )
        // InternalSct.g:2078:1: (lv_effects_6_0= ruleEffect )
        {
        // InternalSct.g:2078:1: (lv_effects_6_0= ruleEffect )
        // InternalSct.g:2079:3: lv_effects_6_0= ruleEffect
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getEntryActionAccess().getEffectsEffectParserRuleCall_3_2_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_effects_6_0=ruleEffect();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred68_InternalSct

    // $ANTLR start synpred73_InternalSct
    public final void synpred73_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        EObject lv_effects_7_0 = null;


        // InternalSct.g:2188:4: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )
        // InternalSct.g:2188:4: otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) )
        {
        otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return ;
        // InternalSct.g:2192:1: ( (lv_effects_7_0= ruleEffect ) )
        // InternalSct.g:2193:1: (lv_effects_7_0= ruleEffect )
        {
        // InternalSct.g:2193:1: (lv_effects_7_0= ruleEffect )
        // InternalSct.g:2194:3: lv_effects_7_0= ruleEffect
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getDuringActionAccess().getEffectsEffectParserRuleCall_4_2_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_effects_7_0=ruleEffect();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred73_InternalSct

    // $ANTLR start synpred77_InternalSct
    public final void synpred77_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_effects_6_0 = null;


        // InternalSct.g:2288:4: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )
        // InternalSct.g:2288:4: otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) )
        {
        otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return ;
        // InternalSct.g:2292:1: ( (lv_effects_6_0= ruleEffect ) )
        // InternalSct.g:2293:1: (lv_effects_6_0= ruleEffect )
        {
        // InternalSct.g:2293:1: (lv_effects_6_0= ruleEffect )
        // InternalSct.g:2294:3: lv_effects_6_0= ruleEffect
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExitActionAccess().getEffectsEffectParserRuleCall_3_2_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_effects_6_0=ruleEffect();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred77_InternalSct

    // $ANTLR start synpred86_InternalSct
    public final void synpred86_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        EObject lv_effects_7_0 = null;


        // InternalSct.g:2489:4: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )
        // InternalSct.g:2489:4: otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) )
        {
        otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return ;
        // InternalSct.g:2493:1: ( (lv_effects_7_0= ruleEffect ) )
        // InternalSct.g:2494:1: (lv_effects_7_0= ruleEffect )
        {
        // InternalSct.g:2494:1: (lv_effects_7_0= ruleEffect )
        // InternalSct.g:2495:3: lv_effects_7_0= ruleEffect
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getIterateActionAccess().getEffectsEffectParserRuleCall_4_2_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_effects_7_0=ruleEffect();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred86_InternalSct

    // $ANTLR start synpred104_InternalSct
    public final void synpred104_InternalSct_fragment() throws RecognitionException {   
        EObject this_Assignment_0 = null;


        // InternalSct.g:2989:2: (this_Assignment_0= ruleAssignment )
        // InternalSct.g:2989:2: this_Assignment_0= ruleAssignment
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_Assignment_0=ruleAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred104_InternalSct

    // $ANTLR start synpred105_InternalSct
    public final void synpred105_InternalSct_fragment() throws RecognitionException {   
        EObject this_PostfixEffect_1 = null;


        // InternalSct.g:3002:2: (this_PostfixEffect_1= rulePostfixEffect )
        // InternalSct.g:3002:2: this_PostfixEffect_1= rulePostfixEffect
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_PostfixEffect_1=rulePostfixEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred105_InternalSct

    // $ANTLR start synpred106_InternalSct
    public final void synpred106_InternalSct_fragment() throws RecognitionException {   
        EObject this_Emission_2 = null;


        // InternalSct.g:3015:2: (this_Emission_2= ruleEmission )
        // InternalSct.g:3015:2: this_Emission_2= ruleEmission
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_Emission_2=ruleEmission();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred106_InternalSct

    // $ANTLR start synpred107_InternalSct
    public final void synpred107_InternalSct_fragment() throws RecognitionException {   
        EObject this_HostcodeEffect_3 = null;


        // InternalSct.g:3028:2: (this_HostcodeEffect_3= ruleHostcodeEffect )
        // InternalSct.g:3028:2: this_HostcodeEffect_3= ruleHostcodeEffect
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_HostcodeEffect_3=ruleHostcodeEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred107_InternalSct

    // $ANTLR start synpred119_InternalSct
    public final void synpred119_InternalSct_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalSct.g:3546:2: (this_BoolExpression_0= ruleBoolExpression )
        // InternalSct.g:3546:2: this_BoolExpression_0= ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred119_InternalSct

    // $ANTLR start synpred129_InternalSct
    public final void synpred129_InternalSct_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // InternalSct.g:4015:2: (this_ValuedExpression_0= ruleValuedExpression )
        // InternalSct.g:4015:2: this_ValuedExpression_0= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ValuedExpression_0=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred129_InternalSct

    // $ANTLR start synpred149_InternalSct
    public final void synpred149_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ValuedExpression_4 = null;


        // InternalSct.g:4773:6: ( (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) )
        // InternalSct.g:4773:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        {
        // InternalSct.g:4773:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        // InternalSct.g:4773:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_93); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_79);
        this_ValuedExpression_4=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred149_InternalSct

    // Delegated rules

    public final boolean synpred119_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred119_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred129_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred129_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred107_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred107_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred106_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred106_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred149_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred149_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred77_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred86_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred105_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred105_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred104_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred104_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA104 dfa104 = new DFA104(this);
    protected DFA114 dfa114 = new DFA114(this);
    protected DFA128 dfa128 = new DFA128(this);
    protected DFA136 dfa136 = new DFA136(this);
    protected DFA137 dfa137 = new DFA137(this);
    protected DFA159 dfa159 = new DFA159(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\13\uffff";
    static final String dfa_3s = "\1\4\1\uffff\11\0\1\uffff";
    static final String dfa_4s = "\1\104\1\uffff\11\0\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\11\uffff\1\1";
    static final String dfa_6s = "\2\uffff\1\4\1\6\1\0\1\3\1\5\1\2\1\10\1\7\1\1\1\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\5\uffff\1\2\5\uffff\1\1\11\uffff\1\1\1\4\1\5\1\12\2\uffff\1\1\35\uffff\1\3\2\uffff\1\6\1\7\1\10\1\11",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 129:2: ( (lv_states_1_0= ruleState ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_10 = input.LA(1);

                         
                        int index1_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_6 = input.LA(1);

                         
                        int index1_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\61\uffff";
    static final String dfa_9s = "\2\12\1\4\2\uffff\2\4\1\6\1\4\1\6\5\12\2\4\1\24\2\4\1\6\1\4\1\6\1\4\4\12\1\24\1\67\3\12\1\4\1\6\2\4\1\6\7\12\1\4\1\6\2\12";
    static final String dfa_10s = "\2\143\1\4\2\uffff\1\143\1\4\1\6\1\4\1\10\7\143\1\77\1\5\1\4\1\6\1\4\1\6\1\11\4\143\1\77\1\67\3\143\1\4\1\6\1\11\1\4\1\6\7\143\1\4\1\6\2\143";
    static final String dfa_11s = "\3\uffff\1\2\1\1\54\uffff";
    static final String dfa_12s = "\61\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\20\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\20\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\5",
            "",
            "",
            "\1\14\1\13\1\12\1\uffff\1\15\1\16\1\1\11\uffff\1\6\6\uffff\3\3\21\uffff\7\4\1\10\7\uffff\1\2\1\7\1\11\4\3\30\uffff\7\4",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\12\1\uffff\1\15",
            "\1\1\20\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\15\uffff\1\22\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\11\uffff\1\23\3\uffff\1\22\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\24\1\uffff\4\3\30\uffff\7\4",
            "\1\1\20\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\20\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\14\1\13\1\12\1\uffff\1\15\1\16\1\1\11\uffff\1\6\6\uffff\3\3\21\uffff\7\4\1\10\7\uffff\1\2\1\7\1\11\4\3\30\uffff\7\4",
            "\1\14\1\13\1\12\1\uffff\1\15\1\16\1\1\20\uffff\3\3\21\uffff\7\4\1\10\7\uffff\1\2\1\uffff\1\11\4\3\30\uffff\7\4",
            "\1\25\42\uffff\1\27\7\uffff\1\26",
            "\1\31\1\30",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\37\1\36\3\uffff\1\40",
            "\1\1\15\uffff\1\22\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\11\uffff\1\41\3\uffff\1\22\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\42\1\uffff\4\3\30\uffff\7\4",
            "\1\1\11\uffff\1\23\3\uffff\1\22\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\24\1\uffff\4\3\30\uffff\7\4",
            "\1\1\15\uffff\1\22\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\25\42\uffff\1\27\7\uffff\1\26",
            "\1\27",
            "\1\1\15\uffff\1\43\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\11\uffff\1\44\3\uffff\1\43\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\45\1\uffff\4\3\30\uffff\7\4",
            "\1\1\15\uffff\1\43\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\46",
            "\1\47",
            "\1\51\1\50\3\uffff\1\52",
            "\1\53",
            "\1\54",
            "\1\1\11\uffff\1\41\3\uffff\1\22\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\42\1\uffff\4\3\30\uffff\7\4",
            "\1\1\15\uffff\1\22\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\15\uffff\1\43\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\11\uffff\1\55\3\uffff\1\43\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\56\1\uffff\4\3\30\uffff\7\4",
            "\1\1\15\uffff\1\43\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\11\uffff\1\44\3\uffff\1\43\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\45\1\uffff\4\3\30\uffff\7\4",
            "\1\1\15\uffff\1\43\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\57",
            "\1\60",
            "\1\1\11\uffff\1\55\3\uffff\1\43\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\56\1\uffff\4\3\30\uffff\7\4",
            "\1\1\15\uffff\1\43\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 306:1: ( (lv_declarations_6_0= ruleDeclaration ) )*";
        }
    }
    static final String dfa_14s = "\20\uffff";
    static final String dfa_15s = "\1\1\17\uffff";
    static final String dfa_16s = "\1\4\2\uffff\2\0\3\uffff\7\0\1\uffff";
    static final String dfa_17s = "\1\104\2\uffff\2\0\3\uffff\7\0\1\uffff";
    static final String dfa_18s = "\1\uffff\1\2\15\uffff\1\1";
    static final String dfa_19s = "\3\uffff\1\0\1\1\3\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff}>";
    static final String[] dfa_20s = {
            "\1\1\5\uffff\1\3\5\uffff\1\1\11\uffff\1\1\1\10\1\11\1\16\2\uffff\1\1\35\uffff\1\4\2\uffff\1\12\1\13\1\14\1\15",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()+ loopback of 324:3: ( (lv_states_7_0= ruleState ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_3 = input.LA(1);

                         
                        int index7_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSct()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_4 = input.LA(1);

                         
                        int index7_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSct()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_8 = input.LA(1);

                         
                        int index7_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSct()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_9 = input.LA(1);

                         
                        int index7_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSct()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_10 = input.LA(1);

                         
                        int index7_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSct()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA7_11 = input.LA(1);

                         
                        int index7_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSct()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_11);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA7_12 = input.LA(1);

                         
                        int index7_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSct()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_12);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA7_13 = input.LA(1);

                         
                        int index7_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSct()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_13);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA7_14 = input.LA(1);

                         
                        int index7_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalSct()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index7_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_21s = "\62\uffff";
    static final String dfa_22s = "\2\12\1\4\3\uffff\2\4\2\6\1\12\1\4\4\12\2\4\1\24\2\4\1\6\1\4\1\6\1\4\4\12\1\24\1\67\3\12\1\4\1\6\2\4\1\6\7\12\1\4\1\6\2\12";
    static final String dfa_23s = "\2\143\1\4\3\uffff\1\143\1\4\1\6\1\10\1\143\1\4\6\143\1\77\1\5\1\4\1\6\1\4\1\6\1\11\4\143\1\77\1\67\3\143\1\4\1\6\1\11\1\4\1\6\7\143\1\4\1\6\2\143";
    static final String dfa_24s = "\3\uffff\1\3\1\1\1\2\54\uffff";
    static final String dfa_25s = "\62\uffff}>";
    static final String[] dfa_26s = {
            "\1\1\5\uffff\1\3\11\uffff\4\3\5\uffff\1\5\4\uffff\6\5\1\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\12\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\6",
            "",
            "",
            "",
            "\1\16\1\15\1\12\1\uffff\1\17\1\14\1\1\5\uffff\1\3\3\uffff\1\7\6\uffff\3\3\21\uffff\7\4\1\13\7\uffff\1\2\1\10\1\11\4\3\30\uffff\7\4",
            "\1\20",
            "\1\21",
            "\1\12\1\uffff\1\17",
            "\1\1\5\uffff\1\3\12\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\22",
            "\1\1\5\uffff\1\3\12\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\23\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\24\3\uffff\1\23\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\25\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\12\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\16\1\15\1\12\1\uffff\1\17\1\14\1\1\5\uffff\1\3\3\uffff\1\7\6\uffff\3\3\21\uffff\7\4\1\13\7\uffff\1\2\1\10\1\11\4\3\30\uffff\7\4",
            "\1\16\1\15\1\12\1\uffff\1\17\1\14\1\1\5\uffff\1\3\12\uffff\3\3\21\uffff\7\4\1\13\7\uffff\1\2\1\uffff\1\11\4\3\30\uffff\7\4",
            "\1\26\42\uffff\1\30\7\uffff\1\27",
            "\1\32\1\31",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\40\1\37\3\uffff\1\41",
            "\1\1\5\uffff\1\3\7\uffff\1\23\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\42\3\uffff\1\23\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\43\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\24\3\uffff\1\23\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\25\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\23\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\26\42\uffff\1\30\7\uffff\1\27",
            "\1\30",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\45\3\uffff\1\44\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\46\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\47",
            "\1\50",
            "\1\52\1\51\3\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\1\5\uffff\1\3\3\uffff\1\42\3\uffff\1\23\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\43\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\23\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\56\3\uffff\1\44\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\57\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\45\3\uffff\1\44\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\46\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\60",
            "\1\61",
            "\1\1\5\uffff\1\3\3\uffff\1\56\3\uffff\1\44\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\57\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4"
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "()* loopback of 627:1: ( ( (lv_declarations_11_0= ruleDeclaration ) ) | ( (lv_localActions_12_0= ruleLocalAction ) ) )*";
        }
    }
    static final String dfa_27s = "\2\12\1\4\2\uffff\2\4\1\6\1\4\2\12\1\6\3\12\2\4\1\24\2\4\1\6\1\4\1\6\1\4\4\12\1\24\1\67\3\12\1\4\1\6\2\4\1\6\7\12\1\4\1\6\2\12";
    static final String dfa_28s = "\2\104\1\4\2\uffff\1\104\1\4\1\6\1\4\2\104\1\10\5\104\1\77\1\5\1\4\1\6\1\4\1\6\1\11\4\104\1\77\1\67\3\104\1\4\1\6\1\11\1\4\1\6\7\104\1\4\1\6\2\104";
    static final String dfa_29s = "\3\uffff\1\1\1\2\54\uffff";
    static final String[] dfa_30s = {
            "\1\1\5\uffff\1\4\11\uffff\1\4\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\12\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\5",
            "",
            "",
            "\1\12\1\11\1\15\1\uffff\1\14\1\16\1\1\5\uffff\1\4\3\uffff\1\6\6\uffff\3\3\30\uffff\1\10\7\uffff\1\2\1\7\1\13\4\3",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\1\5\uffff\1\4\7\uffff\1\22\2\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\3\uffff\1\23\3\uffff\1\22\2\uffff\3\3\40\uffff\1\2\1\24\1\uffff\4\3",
            "\1\15\1\uffff\1\14",
            "\1\1\5\uffff\1\4\12\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\12\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\12\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\12\1\11\1\15\1\uffff\1\14\1\16\1\1\5\uffff\1\4\3\uffff\1\6\6\uffff\3\3\30\uffff\1\10\7\uffff\1\2\1\7\1\13\4\3",
            "\1\12\1\11\1\15\1\uffff\1\14\1\16\1\1\5\uffff\1\4\12\uffff\3\3\30\uffff\1\10\7\uffff\1\2\1\uffff\1\13\4\3",
            "\1\25\42\uffff\1\27\7\uffff\1\26",
            "\1\31\1\30",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\37\1\36\3\uffff\1\40",
            "\1\1\5\uffff\1\4\7\uffff\1\22\2\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\3\uffff\1\41\3\uffff\1\22\2\uffff\3\3\40\uffff\1\2\1\42\1\uffff\4\3",
            "\1\1\5\uffff\1\4\3\uffff\1\23\3\uffff\1\22\2\uffff\3\3\40\uffff\1\2\1\24\1\uffff\4\3",
            "\1\1\5\uffff\1\4\7\uffff\1\22\2\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\25\42\uffff\1\27\7\uffff\1\26",
            "\1\27",
            "\1\1\5\uffff\1\4\7\uffff\1\43\2\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\3\uffff\1\44\3\uffff\1\43\2\uffff\3\3\40\uffff\1\2\1\45\1\uffff\4\3",
            "\1\1\5\uffff\1\4\7\uffff\1\43\2\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\46",
            "\1\47",
            "\1\51\1\50\3\uffff\1\52",
            "\1\53",
            "\1\54",
            "\1\1\5\uffff\1\4\3\uffff\1\41\3\uffff\1\22\2\uffff\3\3\40\uffff\1\2\1\42\1\uffff\4\3",
            "\1\1\5\uffff\1\4\7\uffff\1\22\2\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\7\uffff\1\43\2\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\3\uffff\1\55\3\uffff\1\43\2\uffff\3\3\40\uffff\1\2\1\56\1\uffff\4\3",
            "\1\1\5\uffff\1\4\7\uffff\1\43\2\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\3\uffff\1\44\3\uffff\1\43\2\uffff\3\3\40\uffff\1\2\1\45\1\uffff\4\3",
            "\1\1\5\uffff\1\4\7\uffff\1\43\2\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\57",
            "\1\60",
            "\1\1\5\uffff\1\4\3\uffff\1\55\3\uffff\1\43\2\uffff\3\3\40\uffff\1\2\1\56\1\uffff\4\3",
            "\1\1\5\uffff\1\4\7\uffff\1\43\2\uffff\3\3\40\uffff\1\2\2\uffff\4\3"
    };
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_12;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "664:5: ( (lv_regions_13_0= ruleSingleControlflowRegion ) )?";
        }
    }
    static final String dfa_31s = "\1\4\1\12\1\4\3\uffff\2\4\1\6\1\4\2\12\1\6\3\12\2\4\1\24\2\4\1\6\1\4\1\6\1\4\4\12\1\24\1\67\3\12\1\4\1\6\2\4\1\6\7\12\1\4\1\6\2\12";
    static final String dfa_32s = "\2\143\1\4\3\uffff\1\143\1\4\1\6\1\4\2\143\1\10\5\143\1\77\1\5\1\4\1\6\1\4\1\6\1\11\4\143\1\77\1\67\3\143\1\4\1\6\1\11\1\4\1\6\7\143\1\4\1\6\2\143";
    static final String[] dfa_33s = {
            "\1\3\5\uffff\1\1\5\uffff\1\3\11\uffff\4\3\2\uffff\1\3\2\uffff\1\5\4\uffff\6\5\1\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\12\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\6",
            "",
            "",
            "",
            "\1\13\1\12\1\15\1\uffff\1\17\1\16\1\1\5\uffff\1\3\3\uffff\1\7\6\uffff\3\3\21\uffff\7\4\1\11\7\uffff\1\2\1\10\1\14\4\3\30\uffff\7\4",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\1\5\uffff\1\3\7\uffff\1\23\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\24\3\uffff\1\23\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\25\1\uffff\4\3\30\uffff\7\4",
            "\1\15\1\uffff\1\17",
            "\1\1\5\uffff\1\3\12\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\12\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\12\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\13\1\12\1\15\1\uffff\1\17\1\16\1\1\5\uffff\1\3\3\uffff\1\7\6\uffff\3\3\21\uffff\7\4\1\11\7\uffff\1\2\1\10\1\14\4\3\30\uffff\7\4",
            "\1\13\1\12\1\15\1\uffff\1\17\1\16\1\1\5\uffff\1\3\12\uffff\3\3\21\uffff\7\4\1\11\7\uffff\1\2\1\uffff\1\14\4\3\30\uffff\7\4",
            "\1\26\42\uffff\1\30\7\uffff\1\27",
            "\1\32\1\31",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\40\1\37\3\uffff\1\41",
            "\1\1\5\uffff\1\3\7\uffff\1\23\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\42\3\uffff\1\23\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\43\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\24\3\uffff\1\23\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\25\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\23\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\26\42\uffff\1\30\7\uffff\1\27",
            "\1\30",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\45\3\uffff\1\44\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\46\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\47",
            "\1\50",
            "\1\52\1\51\3\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\1\5\uffff\1\3\3\uffff\1\42\3\uffff\1\23\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\43\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\23\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\56\3\uffff\1\44\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\57\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\45\3\uffff\1\44\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\46\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\60",
            "\1\61",
            "\1\1\5\uffff\1\3\3\uffff\1\56\3\uffff\1\44\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\57\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4"
    };
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "()* loopback of 964:1: ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )*";
        }
    }
    static final String dfa_34s = "\17\uffff";
    static final String dfa_35s = "\1\4\11\0\5\uffff";
    static final String dfa_36s = "\1\104\11\0\5\uffff";
    static final String dfa_37s = "\12\uffff\1\2\3\uffff\1\1";
    static final String dfa_38s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\5\uffff}>";
    static final String[] dfa_39s = {
            "\1\12\5\uffff\1\1\5\uffff\1\12\11\uffff\1\12\1\3\1\4\1\11\2\uffff\1\12\35\uffff\1\2\2\uffff\1\5\1\6\1\7\1\10",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[][] dfa_39 = unpackEncodedStringArray(dfa_39s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_34;
            this.eof = dfa_34;
            this.min = dfa_35;
            this.max = dfa_36;
            this.accept = dfa_37;
            this.special = dfa_38;
            this.transition = dfa_39;
        }
        public String getDescription() {
            return "1001:5: ( (lv_regions_18_0= ruleSingleControlflowRegion ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSct()) ) {s = 14;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_2 = input.LA(1);

                         
                        int index27_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSct()) ) {s = 14;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index27_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_3 = input.LA(1);

                         
                        int index27_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSct()) ) {s = 14;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index27_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA27_4 = input.LA(1);

                         
                        int index27_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSct()) ) {s = 14;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index27_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA27_5 = input.LA(1);

                         
                        int index27_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSct()) ) {s = 14;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index27_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA27_6 = input.LA(1);

                         
                        int index27_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSct()) ) {s = 14;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index27_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA27_7 = input.LA(1);

                         
                        int index27_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSct()) ) {s = 14;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index27_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA27_8 = input.LA(1);

                         
                        int index27_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSct()) ) {s = 14;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index27_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA27_9 = input.LA(1);

                         
                        int index27_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSct()) ) {s = 14;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index27_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_40s = "\1\4\2\uffff\2\0\7\uffff\1\0\2\uffff";
    static final String dfa_41s = "\1\104\2\uffff\2\0\7\uffff\1\0\2\uffff";
    static final String dfa_42s = "\1\uffff\1\2\14\uffff\1\1";
    static final String dfa_43s = "\3\uffff\1\0\1\1\7\uffff\1\2\2\uffff}>";
    static final String[] dfa_44s = {
            "\1\1\5\uffff\1\3\5\uffff\1\14\11\uffff\4\1\2\uffff\1\1\35\uffff\1\4\2\uffff\4\1",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            ""
    };
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[][] dfa_44 = unpackEncodedStringArray(dfa_44s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_34;
            this.eof = dfa_34;
            this.min = dfa_40;
            this.max = dfa_41;
            this.accept = dfa_42;
            this.special = dfa_43;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "()* loopback of 1019:3: ( (lv_regions_19_0= ruleRegion ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_3 = input.LA(1);

                         
                        int index28_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSct()) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index28_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_4 = input.LA(1);

                         
                        int index28_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSct()) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index28_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_12 = input.LA(1);

                         
                        int index28_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalSct()) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index28_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_45s = "\1\4\1\uffff\1\12\1\4\2\uffff\2\4\1\6\1\4\2\12\1\6\3\12\2\4\1\24\2\4\1\6\1\4\1\6\1\4\4\12\1\24\1\67\3\12\1\4\1\6\2\4\1\6\7\12\1\4\1\6\2\12";
    static final String dfa_46s = "\1\104\1\uffff\1\104\1\4\2\uffff\1\104\1\4\1\6\1\4\2\104\1\10\5\104\1\77\1\5\1\4\1\6\1\4\1\6\1\11\4\104\1\77\1\67\3\104\1\4\1\6\1\11\1\4\1\6\7\104\1\4\1\6\2\104";
    static final String dfa_47s = "\1\uffff\1\1\2\uffff\1\2\1\3\54\uffff";
    static final String[] dfa_48s = {
            "\1\1\5\uffff\1\2\5\uffff\1\5\11\uffff\1\5\3\4\2\uffff\1\1\35\uffff\1\3\2\uffff\4\4",
            "",
            "\1\2\5\uffff\1\5\12\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\6",
            "",
            "",
            "\1\13\1\12\1\16\1\uffff\1\15\1\17\1\2\5\uffff\1\5\3\uffff\1\7\6\uffff\3\4\30\uffff\1\11\7\uffff\1\3\1\10\1\14\4\4",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\2\5\uffff\1\5\7\uffff\1\23\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\3\uffff\1\24\3\uffff\1\23\2\uffff\3\4\40\uffff\1\3\1\25\1\uffff\4\4",
            "\1\16\1\uffff\1\15",
            "\1\2\5\uffff\1\5\12\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\12\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\12\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\13\1\12\1\16\1\uffff\1\15\1\17\1\2\5\uffff\1\5\3\uffff\1\7\6\uffff\3\4\30\uffff\1\11\7\uffff\1\3\1\10\1\14\4\4",
            "\1\13\1\12\1\16\1\uffff\1\15\1\17\1\2\5\uffff\1\5\12\uffff\3\4\30\uffff\1\11\7\uffff\1\3\1\uffff\1\14\4\4",
            "\1\26\42\uffff\1\30\7\uffff\1\27",
            "\1\32\1\31",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\40\1\37\3\uffff\1\41",
            "\1\2\5\uffff\1\5\7\uffff\1\23\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\3\uffff\1\42\3\uffff\1\23\2\uffff\3\4\40\uffff\1\3\1\43\1\uffff\4\4",
            "\1\2\5\uffff\1\5\3\uffff\1\24\3\uffff\1\23\2\uffff\3\4\40\uffff\1\3\1\25\1\uffff\4\4",
            "\1\2\5\uffff\1\5\7\uffff\1\23\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\26\42\uffff\1\30\7\uffff\1\27",
            "\1\30",
            "\1\2\5\uffff\1\5\7\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\3\uffff\1\45\3\uffff\1\44\2\uffff\3\4\40\uffff\1\3\1\46\1\uffff\4\4",
            "\1\2\5\uffff\1\5\7\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\47",
            "\1\50",
            "\1\52\1\51\3\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\2\5\uffff\1\5\3\uffff\1\42\3\uffff\1\23\2\uffff\3\4\40\uffff\1\3\1\43\1\uffff\4\4",
            "\1\2\5\uffff\1\5\7\uffff\1\23\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\7\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\3\uffff\1\56\3\uffff\1\44\2\uffff\3\4\40\uffff\1\3\1\57\1\uffff\4\4",
            "\1\2\5\uffff\1\5\7\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\3\uffff\1\45\3\uffff\1\44\2\uffff\3\4\40\uffff\1\3\1\46\1\uffff\4\4",
            "\1\2\5\uffff\1\5\7\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\60",
            "\1\61",
            "\1\2\5\uffff\1\5\3\uffff\1\56\3\uffff\1\44\2\uffff\3\4\40\uffff\1\3\1\57\1\uffff\4\4",
            "\1\2\5\uffff\1\5\7\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4"
    };
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[][] dfa_48 = unpackEncodedStringArray(dfa_48s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_25;
            this.transition = dfa_48;
        }
        public String getDescription() {
            return "1037:5: ( ( (lv_regions_20_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_21_0= ruleSingleControlflowRegion ) ) )?";
        }
    }
    static final String dfa_49s = "\16\uffff";
    static final String dfa_50s = "\1\4\1\0\14\uffff";
    static final String dfa_51s = "\1\132\1\0\14\uffff";
    static final String dfa_52s = "\2\uffff\1\2\12\uffff\1\1";
    static final String dfa_53s = "\1\uffff\1\0\14\uffff}>";
    static final String[] dfa_54s = {
            "\2\2\1\1\3\2\24\uffff\1\2\32\uffff\1\2\2\uffff\1\2\3\uffff\1\2\24\uffff\1\2\4\uffff\1\2",
            "\1\uffff",
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

    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final char[] dfa_50 = DFA.unpackEncodedStringToUnsignedChars(dfa_50s);
    static final char[] dfa_51 = DFA.unpackEncodedStringToUnsignedChars(dfa_51s);
    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final short[][] dfa_54 = unpackEncodedStringArray(dfa_54s);

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_49;
            this.eof = dfa_49;
            this.min = dfa_50;
            this.max = dfa_51;
            this.accept = dfa_52;
            this.special = dfa_53;
            this.transition = dfa_54;
        }
        public String getDescription() {
            return "1844:2: ( (lv_delay_8_0= RULE_INT ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_1 = input.LA(1);

                         
                        int index50_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalSct()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index50_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_55s = "\46\uffff";
    static final String dfa_56s = "\1\2\45\uffff";
    static final String dfa_57s = "\1\4\1\0\44\uffff";
    static final String dfa_58s = "\1\143\1\0\44\uffff";
    static final String dfa_59s = "\2\uffff\1\2\42\uffff\1\1";
    static final String dfa_60s = "\1\uffff\1\0\44\uffff}>";
    static final String[] dfa_61s = {
            "\1\2\5\uffff\1\2\5\uffff\1\2\2\uffff\1\1\6\uffff\4\2\2\uffff\1\2\2\uffff\1\2\4\uffff\6\2\1\uffff\7\2\10\uffff\1\2\2\uffff\4\2\30\uffff\7\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final char[] dfa_57 = DFA.unpackEncodedStringToUnsignedChars(dfa_57s);
    static final char[] dfa_58 = DFA.unpackEncodedStringToUnsignedChars(dfa_58s);
    static final short[] dfa_59 = DFA.unpackEncodedString(dfa_59s);
    static final short[] dfa_60 = DFA.unpackEncodedString(dfa_60s);
    static final short[][] dfa_61 = unpackEncodedStringArray(dfa_61s);

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = dfa_55;
            this.eof = dfa_56;
            this.min = dfa_57;
            this.max = dfa_58;
            this.accept = dfa_59;
            this.special = dfa_60;
            this.transition = dfa_61;
        }
        public String getDescription() {
            return "()* loopback of 2073:2: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_1 = input.LA(1);

                         
                        int index57_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalSct()) ) {s = 37;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index57_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = dfa_55;
            this.eof = dfa_56;
            this.min = dfa_57;
            this.max = dfa_58;
            this.accept = dfa_59;
            this.special = dfa_60;
            this.transition = dfa_61;
        }
        public String getDescription() {
            return "()* loopback of 2188:2: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_1 = input.LA(1);

                         
                        int index62_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalSct()) ) {s = 37;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = dfa_55;
            this.eof = dfa_56;
            this.min = dfa_57;
            this.max = dfa_58;
            this.accept = dfa_59;
            this.special = dfa_60;
            this.transition = dfa_61;
        }
        public String getDescription() {
            return "()* loopback of 2288:2: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalSct()) ) {s = 37;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = dfa_55;
            this.eof = dfa_56;
            this.min = dfa_57;
            this.max = dfa_58;
            this.accept = dfa_59;
            this.special = dfa_60;
            this.transition = dfa_61;
        }
        public String getDescription() {
            return "()* loopback of 2489:2: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA75_1 = input.LA(1);

                         
                        int index75_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalSct()) ) {s = 37;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index75_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 75, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_62s = "\112\uffff";
    static final String dfa_63s = "\15\uffff\1\4\74\uffff";
    static final String dfa_64s = "\3\4\2\uffff\2\4\1\6\1\4\1\6\7\4\1\24\2\4\1\6\4\4\1\6\7\4\1\24\1\67\4\4\1\6\1\4\2\6\10\4\1\6\5\4\1\24\7\4\1\6\2\4\1\6\1\24\1\67\3\4";
    static final String dfa_65s = "\2\76\1\4\2\uffff\1\100\1\4\1\6\1\76\1\10\1\76\1\4\1\76\1\120\1\76\2\100\1\77\1\5\1\4\1\6\1\5\1\76\2\4\1\6\1\11\1\76\2\77\2\76\1\100\1\77\1\67\1\76\1\77\1\76\1\4\1\6\1\4\1\6\1\10\2\76\1\4\1\76\1\120\1\76\1\11\1\4\1\6\1\11\1\77\1\76\2\100\1\77\1\76\1\77\1\76\1\77\2\76\1\4\1\6\1\11\1\4\1\6\1\77\1\67\1\76\1\77\1\76";
    static final String dfa_66s = "\3\uffff\1\1\1\2\105\uffff";
    static final String dfa_67s = "\112\uffff}>";
    static final String[] dfa_68s = {
            "\1\4\2\uffff\1\4\2\uffff\1\1\43\uffff\1\3\12\uffff\1\4\4\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\1\43\uffff\1\3\12\uffff\1\4\4\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\15\1\14\1\16\1\4\1\12\1\10\1\1\11\uffff\1\6\31\uffff\1\3\7\uffff\1\13\2\uffff\1\4\4\uffff\1\2\1\7\1\11",
            "\1\17",
            "\1\20",
            "\1\4\2\uffff\1\4\2\uffff\1\1\43\uffff\1\3\12\uffff\1\4\4\uffff\1\2",
            "\1\16\1\uffff\1\12",
            "\1\4\2\uffff\1\4\2\uffff\1\1\43\uffff\1\3\12\uffff\1\4\4\uffff\1\2",
            "\1\21",
            "\1\4\2\uffff\1\4\2\uffff\1\1\15\uffff\1\22\25\uffff\1\3\12\uffff\1\4\4\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\26\7\uffff\1\4\1\uffff\1\23\3\uffff\1\25\5\uffff\1\4\17\uffff\1\3\7\uffff\1\4\2\uffff\1\4\4\uffff\1\27\1\24\13\uffff\6\4",
            "\1\4\2\uffff\1\4\2\uffff\1\1\43\uffff\1\3\12\uffff\1\4\4\uffff\1\2",
            "\1\15\1\14\1\16\1\4\1\12\1\10\1\1\11\uffff\1\6\31\uffff\1\3\7\uffff\1\13\2\uffff\1\4\4\uffff\1\2\1\7\1\11",
            "\1\15\1\14\1\16\1\4\1\12\1\10\1\1\43\uffff\1\3\7\uffff\1\13\2\uffff\1\4\4\uffff\1\2\1\uffff\1\11",
            "\1\30\42\uffff\1\32\7\uffff\1\31",
            "\1\34\1\33",
            "\1\35",
            "\1\36",
            "\1\34\1\37",
            "\1\4\2\uffff\1\4\2\uffff\1\26\43\uffff\1\3\12\uffff\1\4\4\uffff\1\27",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\44\1\43\3\uffff\1\45",
            "\1\4\2\uffff\1\4\2\uffff\1\1\15\uffff\1\22\25\uffff\1\3\12\uffff\1\4\4\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\26\11\uffff\1\46\3\uffff\1\25\25\uffff\1\3\12\uffff\1\4\4\uffff\1\27\1\47",
            "\1\4\2\uffff\1\4\2\uffff\1\26\11\uffff\1\23\3\uffff\1\25\25\uffff\1\3\12\uffff\1\4\4\uffff\1\27\1\24",
            "\1\4\2\uffff\1\4\2\uffff\1\26\15\uffff\1\25\25\uffff\1\3\12\uffff\1\4\4\uffff\1\27",
            "\1\4\2\uffff\1\4\2\uffff\1\26\15\uffff\1\25\25\uffff\1\3\12\uffff\1\4\4\uffff\1\27",
            "\1\57\1\56\1\60\1\4\1\53\1\54\1\26\11\uffff\1\50\31\uffff\1\3\7\uffff\1\55\2\uffff\1\4\4\uffff\1\27\1\51\1\52",
            "\1\30\42\uffff\1\32\7\uffff\1\31",
            "\1\32",
            "\1\4\2\uffff\1\4\2\uffff\1\1\15\uffff\1\61\25\uffff\1\3\12\uffff\1\4\4\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\26\11\uffff\1\62\3\uffff\1\64\25\uffff\1\3\12\uffff\1\4\4\uffff\1\27\1\63",
            "\1\4\2\uffff\1\4\2\uffff\1\26\15\uffff\1\64\25\uffff\1\3\12\uffff\1\4\4\uffff\1\27",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\60\1\uffff\1\53",
            "\1\4\2\uffff\1\4\2\uffff\1\26\43\uffff\1\3\12\uffff\1\4\4\uffff\1\27",
            "\1\4\2\uffff\1\4\2\uffff\1\26\43\uffff\1\3\12\uffff\1\4\4\uffff\1\27",
            "\1\71",
            "\1\4\2\uffff\1\4\2\uffff\1\26\15\uffff\1\25\25\uffff\1\3\12\uffff\1\4\4\uffff\1\27",
            "\1\4\2\uffff\1\4\2\uffff\1\26\7\uffff\1\4\1\uffff\1\23\3\uffff\1\25\25\uffff\1\3\7\uffff\1\4\2\uffff\1\4\4\uffff\1\27\1\24\13\uffff\6\4",
            "\1\4\2\uffff\1\4\2\uffff\1\26\43\uffff\1\3\12\uffff\1\4\4\uffff\1\27",
            "\1\73\1\72\3\uffff\1\74",
            "\1\75",
            "\1\76",
            "\1\73\1\77\3\uffff\1\74",
            "\1\4\2\uffff\1\4\2\uffff\1\26\11\uffff\1\46\3\uffff\1\25\25\uffff\1\3\12\uffff\1\4\4\uffff\1\27\1\47",
            "\1\4\2\uffff\1\4\2\uffff\1\26\15\uffff\1\25\25\uffff\1\3\12\uffff\1\4\4\uffff\1\27",
            "\1\57\1\56\1\60\1\4\1\53\1\54\1\26\11\uffff\1\50\31\uffff\1\3\7\uffff\1\55\2\uffff\1\4\4\uffff\1\27\1\51\1\52",
            "\1\57\1\56\1\60\1\4\1\53\1\54\1\26\43\uffff\1\3\7\uffff\1\55\2\uffff\1\4\4\uffff\1\27\1\uffff\1\52",
            "\1\100\42\uffff\1\102\7\uffff\1\101",
            "\1\4\2\uffff\1\4\2\uffff\1\1\15\uffff\1\61\25\uffff\1\3\12\uffff\1\4\4\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\26\11\uffff\1\103\3\uffff\1\64\25\uffff\1\3\12\uffff\1\4\4\uffff\1\27\1\104",
            "\1\4\2\uffff\1\4\2\uffff\1\26\15\uffff\1\64\25\uffff\1\3\12\uffff\1\4\4\uffff\1\27",
            "\1\4\2\uffff\1\4\2\uffff\1\26\11\uffff\1\62\3\uffff\1\64\25\uffff\1\3\12\uffff\1\4\4\uffff\1\27\1\63",
            "\1\4\2\uffff\1\4\2\uffff\1\26\15\uffff\1\64\25\uffff\1\3\12\uffff\1\4\4\uffff\1\27",
            "\1\4\2\uffff\1\4\2\uffff\1\26\15\uffff\1\64\25\uffff\1\3\12\uffff\1\4\4\uffff\1\27",
            "\1\105",
            "\1\106",
            "\1\44\1\107\3\uffff\1\45",
            "\1\110",
            "\1\111",
            "\1\100\42\uffff\1\102\7\uffff\1\101",
            "\1\102",
            "\1\4\2\uffff\1\4\2\uffff\1\26\15\uffff\1\64\25\uffff\1\3\12\uffff\1\4\4\uffff\1\27",
            "\1\4\2\uffff\1\4\2\uffff\1\26\11\uffff\1\103\3\uffff\1\64\25\uffff\1\3\12\uffff\1\4\4\uffff\1\27\1\104",
            "\1\4\2\uffff\1\4\2\uffff\1\26\15\uffff\1\64\25\uffff\1\3\12\uffff\1\4\4\uffff\1\27"
    };

    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final char[] dfa_64 = DFA.unpackEncodedStringToUnsignedChars(dfa_64s);
    static final char[] dfa_65 = DFA.unpackEncodedStringToUnsignedChars(dfa_65s);
    static final short[] dfa_66 = DFA.unpackEncodedString(dfa_66s);
    static final short[] dfa_67 = DFA.unpackEncodedString(dfa_67s);
    static final short[][] dfa_68 = unpackEncodedStringArray(dfa_68s);

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = dfa_62;
            this.eof = dfa_63;
            this.min = dfa_64;
            this.max = dfa_65;
            this.accept = dfa_66;
            this.special = dfa_67;
            this.transition = dfa_68;
        }
        public String getDescription() {
            return "2538:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )";
        }
    }
    static final String dfa_69s = "\1\4\13\0\2\uffff";
    static final String dfa_70s = "\1\132\13\0\2\uffff";
    static final String dfa_71s = "\14\uffff\1\1\1\2";
    static final String dfa_72s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_73s = {
            "\1\11\1\4\1\2\1\13\1\3\1\6\24\uffff\1\5\32\uffff\1\12\2\uffff\1\14\3\uffff\1\1\24\uffff\1\7\4\uffff\1\10",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };
    static final char[] dfa_69 = DFA.unpackEncodedStringToUnsignedChars(dfa_69s);
    static final char[] dfa_70 = DFA.unpackEncodedStringToUnsignedChars(dfa_70s);
    static final short[] dfa_71 = DFA.unpackEncodedString(dfa_71s);
    static final short[] dfa_72 = DFA.unpackEncodedString(dfa_72s);
    static final short[][] dfa_73 = unpackEncodedStringArray(dfa_73s);

    class DFA104 extends DFA {

        public DFA104(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 104;
            this.eot = dfa_49;
            this.eof = dfa_49;
            this.min = dfa_69;
            this.max = dfa_70;
            this.accept = dfa_71;
            this.special = dfa_72;
            this.transition = dfa_73;
        }
        public String getDescription() {
            return "3545:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA104_1 = input.LA(1);

                         
                        int index104_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index104_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA104_2 = input.LA(1);

                         
                        int index104_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index104_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA104_3 = input.LA(1);

                         
                        int index104_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index104_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA104_4 = input.LA(1);

                         
                        int index104_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index104_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA104_5 = input.LA(1);

                         
                        int index104_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index104_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA104_6 = input.LA(1);

                         
                        int index104_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index104_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA104_7 = input.LA(1);

                         
                        int index104_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index104_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA104_8 = input.LA(1);

                         
                        int index104_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index104_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA104_9 = input.LA(1);

                         
                        int index104_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index104_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA104_10 = input.LA(1);

                         
                        int index104_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index104_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA104_11 = input.LA(1);

                         
                        int index104_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index104_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 104, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_74s = "\15\uffff";
    static final String dfa_75s = "\1\4\4\uffff\7\0\1\uffff";
    static final String dfa_76s = "\1\132\4\uffff\7\0\1\uffff";
    static final String dfa_77s = "\1\uffff\1\1\12\uffff\1\2";
    static final String dfa_78s = "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] dfa_79s = {
            "\1\11\2\1\1\13\1\1\1\6\24\uffff\1\5\32\uffff\1\12\2\uffff\1\14\3\uffff\1\1\24\uffff\1\7\4\uffff\1\10",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_74 = DFA.unpackEncodedString(dfa_74s);
    static final char[] dfa_75 = DFA.unpackEncodedStringToUnsignedChars(dfa_75s);
    static final char[] dfa_76 = DFA.unpackEncodedStringToUnsignedChars(dfa_76s);
    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final short[] dfa_78 = DFA.unpackEncodedString(dfa_78s);
    static final short[][] dfa_79 = unpackEncodedStringArray(dfa_79s);

    class DFA114 extends DFA {

        public DFA114(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 114;
            this.eot = dfa_74;
            this.eof = dfa_74;
            this.min = dfa_75;
            this.max = dfa_76;
            this.accept = dfa_77;
            this.special = dfa_78;
            this.transition = dfa_79;
        }
        public String getDescription() {
            return "4014:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA114_5 = input.LA(1);

                         
                        int index114_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred129_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index114_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA114_6 = input.LA(1);

                         
                        int index114_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred129_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index114_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA114_7 = input.LA(1);

                         
                        int index114_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred129_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index114_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA114_8 = input.LA(1);

                         
                        int index114_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred129_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index114_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA114_9 = input.LA(1);

                         
                        int index114_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred129_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index114_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA114_10 = input.LA(1);

                         
                        int index114_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred129_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index114_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA114_11 = input.LA(1);

                         
                        int index114_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred129_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index114_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 114, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_80s = "\1\4\3\uffff\1\0\7\uffff";
    static final String dfa_81s = "\1\132\3\uffff\1\0\7\uffff";
    static final String dfa_82s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\5\uffff\1\4";
    static final String dfa_83s = "\4\uffff\1\0\7\uffff}>";
    static final String[] dfa_84s = {
            "\1\5\1\3\1\1\1\5\1\2\1\5\24\uffff\1\4\32\uffff\1\5\33\uffff\1\5\4\uffff\1\5",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_80 = DFA.unpackEncodedStringToUnsignedChars(dfa_80s);
    static final char[] dfa_81 = DFA.unpackEncodedStringToUnsignedChars(dfa_81s);
    static final short[] dfa_82 = DFA.unpackEncodedString(dfa_82s);
    static final short[] dfa_83 = DFA.unpackEncodedString(dfa_83s);
    static final short[][] dfa_84 = unpackEncodedStringArray(dfa_84s);

    class DFA128 extends DFA {

        public DFA128(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 128;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_80;
            this.max = dfa_81;
            this.accept = dfa_82;
            this.special = dfa_83;
            this.transition = dfa_84;
        }
        public String getDescription() {
            return "4734:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA128_4 = input.LA(1);

                         
                        int index128_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred149_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index128_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 128, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_85s = "\3\uffff\1\13\6\uffff\1\11\3\uffff\2\13";
    static final String dfa_86s = "\1\12\1\uffff\3\4\2\6\3\uffff\1\4\3\uffff\2\4";
    static final String dfa_87s = "\1\76\1\uffff\1\4\1\143\1\4\1\6\1\10\3\uffff\1\143\3\uffff\2\143";
    static final String dfa_88s = "\1\uffff\1\1\5\uffff\1\5\1\4\1\3\1\uffff\1\7\1\6\1\2\2\uffff";
    static final String dfa_89s = "\20\uffff}>";
    static final String[] dfa_90s = {
            "\1\1\63\uffff\1\2",
            "",
            "\1\3",
            "\1\12\1\11\1\7\1\13\1\14\1\15\1\13\5\uffff\1\13\3\uffff\1\4\1\13\5\uffff\3\13\20\uffff\10\13\1\10\2\uffff\1\13\4\uffff\1\13\1\5\1\6\7\13\25\uffff\7\13",
            "\1\16",
            "\1\17",
            "\1\7\1\uffff\1\14",
            "",
            "",
            "",
            "\1\11\2\uffff\1\11\2\uffff\1\11\5\uffff\1\11\1\uffff\1\13\1\uffff\2\11\2\uffff\1\11\2\uffff\3\11\11\uffff\1\13\6\uffff\10\11\1\13\2\uffff\1\11\4\uffff\2\11\1\uffff\7\11\3\uffff\6\13\14\uffff\7\11",
            "",
            "",
            "",
            "\1\12\1\11\1\7\1\13\1\14\1\15\1\13\5\uffff\1\13\3\uffff\1\4\1\13\5\uffff\3\13\20\uffff\10\13\1\10\2\uffff\1\13\4\uffff\1\13\1\5\1\6\7\13\25\uffff\7\13",
            "\1\12\1\11\1\7\1\13\1\14\1\15\1\13\5\uffff\1\13\4\uffff\1\13\5\uffff\3\13\20\uffff\10\13\1\10\2\uffff\1\13\4\uffff\1\13\1\uffff\1\6\7\13\25\uffff\7\13"
    };
    static final short[] dfa_85 = DFA.unpackEncodedString(dfa_85s);
    static final char[] dfa_86 = DFA.unpackEncodedStringToUnsignedChars(dfa_86s);
    static final char[] dfa_87 = DFA.unpackEncodedStringToUnsignedChars(dfa_87s);
    static final short[] dfa_88 = DFA.unpackEncodedString(dfa_88s);
    static final short[] dfa_89 = DFA.unpackEncodedString(dfa_89s);
    static final short[][] dfa_90 = unpackEncodedStringArray(dfa_90s);

    class DFA136 extends DFA {

        public DFA136(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 136;
            this.eot = dfa_14;
            this.eof = dfa_85;
            this.min = dfa_86;
            this.max = dfa_87;
            this.accept = dfa_88;
            this.special = dfa_89;
            this.transition = dfa_90;
        }
        public String getDescription() {
            return "5361:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )";
        }
    }
    static final String dfa_91s = "\3\uffff\1\7\11\uffff\2\7";
    static final String dfa_92s = "\1\12\1\uffff\3\4\1\6\2\uffff\1\6\4\uffff\2\4";
    static final String dfa_93s = "\1\76\1\uffff\1\4\1\100\1\4\1\6\2\uffff\1\10\4\uffff\2\100";
    static final String dfa_94s = "\1\uffff\1\1\4\uffff\1\2\1\7\1\uffff\1\6\1\5\1\4\1\3\2\uffff";
    static final String dfa_95s = "\17\uffff}>";
    static final String[] dfa_96s = {
            "\1\1\63\uffff\1\2",
            "",
            "\1\3",
            "\1\7\1\6\1\12\1\uffff\1\11\1\13\1\7\11\uffff\1\4\41\uffff\1\14\7\uffff\1\7\1\5\1\10",
            "\1\15",
            "\1\16",
            "",
            "",
            "\1\12\1\uffff\1\11",
            "",
            "",
            "",
            "",
            "\1\7\1\6\1\12\1\uffff\1\11\1\13\1\7\11\uffff\1\4\41\uffff\1\14\7\uffff\1\7\1\5\1\10",
            "\1\7\1\6\1\12\1\uffff\1\11\1\13\1\7\53\uffff\1\14\7\uffff\1\7\1\uffff\1\10"
    };
    static final short[] dfa_91 = DFA.unpackEncodedString(dfa_91s);
    static final char[] dfa_92 = DFA.unpackEncodedStringToUnsignedChars(dfa_92s);
    static final char[] dfa_93 = DFA.unpackEncodedStringToUnsignedChars(dfa_93s);
    static final short[] dfa_94 = DFA.unpackEncodedString(dfa_94s);
    static final short[] dfa_95 = DFA.unpackEncodedString(dfa_95s);
    static final short[][] dfa_96 = unpackEncodedStringArray(dfa_96s);

    class DFA137 extends DFA {

        public DFA137(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 137;
            this.eot = dfa_34;
            this.eof = dfa_91;
            this.min = dfa_92;
            this.max = dfa_93;
            this.accept = dfa_94;
            this.special = dfa_95;
            this.transition = dfa_96;
        }
        public String getDescription() {
            return "5474:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )";
        }
    }
    static final String dfa_97s = "\1\4\60\uffff";
    static final String dfa_98s = "\2\12\1\4\2\uffff\2\4\2\6\2\12\1\4\3\12\2\4\1\24\2\4\1\6\1\4\1\6\1\4\4\12\1\24\1\67\3\12\1\4\1\6\2\4\1\6\7\12\1\4\1\6\2\12";
    static final String dfa_99s = "\2\104\1\4\2\uffff\1\104\1\4\1\6\1\10\2\104\1\4\5\104\1\77\1\5\1\4\1\6\1\4\1\6\1\11\4\104\1\77\1\67\3\104\1\4\1\6\1\11\1\4\1\6\7\104\1\4\1\6\2\104";
    static final String[] dfa_100s = {
            "\1\1\5\uffff\1\4\12\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\12\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\5",
            "",
            "",
            "\1\15\1\14\1\11\1\uffff\1\16\1\12\1\1\5\uffff\1\4\3\uffff\1\6\6\uffff\3\3\30\uffff\1\13\7\uffff\1\2\1\7\1\10\4\3",
            "\1\17",
            "\1\20",
            "\1\11\1\uffff\1\16",
            "\1\1\5\uffff\1\4\12\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\12\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\21",
            "\1\1\5\uffff\1\4\7\uffff\1\22\2\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\3\uffff\1\23\3\uffff\1\22\2\uffff\3\3\40\uffff\1\2\1\24\1\uffff\4\3",
            "\1\1\5\uffff\1\4\12\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\15\1\14\1\11\1\uffff\1\16\1\12\1\1\5\uffff\1\4\3\uffff\1\6\6\uffff\3\3\30\uffff\1\13\7\uffff\1\2\1\7\1\10\4\3",
            "\1\15\1\14\1\11\1\uffff\1\16\1\12\1\1\5\uffff\1\4\12\uffff\3\3\30\uffff\1\13\7\uffff\1\2\1\uffff\1\10\4\3",
            "\1\25\42\uffff\1\27\7\uffff\1\26",
            "\1\31\1\30",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\37\1\36\3\uffff\1\40",
            "\1\1\5\uffff\1\4\7\uffff\1\22\2\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\3\uffff\1\41\3\uffff\1\22\2\uffff\3\3\40\uffff\1\2\1\42\1\uffff\4\3",
            "\1\1\5\uffff\1\4\3\uffff\1\23\3\uffff\1\22\2\uffff\3\3\40\uffff\1\2\1\24\1\uffff\4\3",
            "\1\1\5\uffff\1\4\7\uffff\1\22\2\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\25\42\uffff\1\27\7\uffff\1\26",
            "\1\27",
            "\1\1\5\uffff\1\4\7\uffff\1\43\2\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\3\uffff\1\44\3\uffff\1\43\2\uffff\3\3\40\uffff\1\2\1\45\1\uffff\4\3",
            "\1\1\5\uffff\1\4\7\uffff\1\43\2\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\46",
            "\1\47",
            "\1\51\1\50\3\uffff\1\52",
            "\1\53",
            "\1\54",
            "\1\1\5\uffff\1\4\3\uffff\1\41\3\uffff\1\22\2\uffff\3\3\40\uffff\1\2\1\42\1\uffff\4\3",
            "\1\1\5\uffff\1\4\7\uffff\1\22\2\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\7\uffff\1\43\2\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\3\uffff\1\55\3\uffff\1\43\2\uffff\3\3\40\uffff\1\2\1\56\1\uffff\4\3",
            "\1\1\5\uffff\1\4\7\uffff\1\43\2\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\3\uffff\1\44\3\uffff\1\43\2\uffff\3\3\40\uffff\1\2\1\45\1\uffff\4\3",
            "\1\1\5\uffff\1\4\7\uffff\1\43\2\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\57",
            "\1\60",
            "\1\1\5\uffff\1\4\3\uffff\1\55\3\uffff\1\43\2\uffff\3\3\40\uffff\1\2\1\56\1\uffff\4\3",
            "\1\1\5\uffff\1\4\7\uffff\1\43\2\uffff\3\3\40\uffff\1\2\2\uffff\4\3"
    };
    static final short[] dfa_97 = DFA.unpackEncodedString(dfa_97s);
    static final char[] dfa_98 = DFA.unpackEncodedStringToUnsignedChars(dfa_98s);
    static final char[] dfa_99 = DFA.unpackEncodedStringToUnsignedChars(dfa_99s);
    static final short[][] dfa_100 = unpackEncodedStringArray(dfa_100s);

    class DFA159 extends DFA {

        public DFA159(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 159;
            this.eot = dfa_8;
            this.eof = dfa_97;
            this.min = dfa_98;
            this.max = dfa_99;
            this.accept = dfa_29;
            this.special = dfa_12;
            this.transition = dfa_100;
        }
        public String getDescription() {
            return "664:5: ( (lv_regions_13_0= ruleSingleControlflowRegion ) )?";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x4000000038000402L,0x000000000000001EL});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000012L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x4000000000010400L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020030L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020020L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x403F800038000400L,0x0000000FE000001EL});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x12000000400003F0L,0x0000000004200001L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L,0x0000000004200000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x4000000000200400L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002400022L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002400002L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x4000000000000410L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x403FBF083C010400L,0x0000000FE000001EL});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x4000000004010400L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x4000000038000400L,0x000000000000001EL});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000030000000L,0x000000000000001EL});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L,0x000000000000001EL});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000028000000L,0x000000000000001EL});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x4000000002480420L,0x00000000000000E0L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x4000000002480400L,0x00000000000000E0L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x4000000000880400L,0x00000000000000E0L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x4000000001080400L,0x00000000000000E0L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x403FBF093C010410L,0x0000000FE000001EL});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x400000013C010410L,0x000000000000001EL});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x4000000000080400L,0x00000000000000E0L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000081000010L,0x0000000004200000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000081000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x403F800080000400L,0x0000000FE0000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x400000003C000410L,0x000000000000001EL});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000004000010L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x400000003C000400L,0x000000000000001EL});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000040020L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x4000000000000400L,0x00000000000000E0L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000003800000022L,0x0000000000000700L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000003000000022L,0x0000000000000700L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000002000000022L,0x0000000000000700L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000002000000022L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x12000040400003F2L,0x0000000004200001L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x4200000000000490L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x12000040400803F2L,0x0000000004200001L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000004000080002L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000180000000000L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x12000000400803F2L,0x0000000004200001L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x4000400000000400L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x403F800000000400L,0x0000000FE0000000L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x003F000000000000L,0x0000000FE0000000L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x003E000000000000L,0x0000000FE0000000L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x003C000000000000L,0x0000000FE0000000L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0038000000000000L,0x0000000FE0000000L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0030000000000000L,0x0000000FE0000000L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0020000000000000L,0x0000000FE0000000L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0140000000040002L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x2000000000000000L,0x0000007801C00000L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0040000000040000L,0x0000000000007800L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0040000000000000L,0x0000000000018000L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x4000000000000480L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x4200000000000400L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0C00000040000000L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x32000000400003F0L,0x0000000004200001L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x2000000000000002L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0A00000000000002L,0x00000000001E0000L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
        public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x02000000400003F0L,0x0000000004200001L});
        public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
        public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
        public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0040000000000002L});
        public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000230L});
        public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000001L});
        public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000001L});
        public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x8000000000100002L});
        public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x4000000000010402L});
        public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000012L});
    }


}