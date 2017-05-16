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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_HOSTCODE", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'region'", "':'", "'='", "';'", "'.'", "'scchart'", "'references'", "'bind'", "','", "'{'", "'}'", "'initial'", "'final'", "'state'", "'('", "')'", "'node'", "'returns'", "'ref'", "'immediate'", "'deferred'", "'with'", "'/'", "'to'", "'['", "']'", "'entry'", "'during'", "'exit'", "'weak'", "'suspend'", "'iterate'", "'expression'", "'const'", "'extern'", "'volatile'", "'input'", "'output'", "'static'", "'signal'", "'combine'", "'<'", "'()'", "'>'", "'!'", "'&'", "'@'", "'#'", "'-'", "'normal'", "'connector'", "'reference'", "'textual'", "'-->'", "'o->'", "'>->'", "'reset'", "'shallow history'", "'history'", "'+='", "'-='", "'*='", "'/='", "'++'", "'--'", "'=='", "'<='", "'>='", "'!='", "'pre'", "'|'", "'+'", "'*'", "'%'", "'val'", "'||'", "'&&'", "'pure'", "'bool'", "'unsigned'", "'int'", "'float'", "'string'", "'host'", "'none'", "'max'", "'min'"
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

                            if ( (LA2_5==17||(LA2_5>=19 && LA2_5<=20)||LA2_5==40||LA2_5==57||LA2_5==59||LA2_5==61||LA2_5==64||(LA2_5>=81 && LA2_5<=84)||(LA2_5>=86 && LA2_5<=89)||(LA2_5>=91 && LA2_5<=92)) ) {
                                alt2=1;
                            }
                            else if ( (LA2_5==30) ) {
                                alt2=2;
                            }


                            }
                            break;
                        case 34:
                            {
                            alt2=2;
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

                        if ( (LA8_3==17||LA8_3==19||LA8_3==40||LA8_3==57||LA8_3==59||LA8_3==61||LA8_3==64||(LA8_3>=81 && LA8_3<=84)||(LA8_3>=86 && LA8_3<=89)||(LA8_3>=91 && LA8_3<=92)) ) {
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

                    if ( (LA33_3==RULE_ID) ) {
                        alt33=2;
                    }
                    else if ( (LA33_3==34) ) {
                        alt33=1;
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

                if ( (LA36_0==RULE_COMMENT_ANNOTATION||(LA36_0>=49 && LA36_0<=55)||LA36_0==62||(LA36_0>=93 && LA36_0<=99)) ) {
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

                if ( (LA37_0==RULE_COMMENT_ANNOTATION||(LA37_0>=49 && LA37_0<=55)||LA37_0==62||(LA37_0>=93 && LA37_0<=99)) ) {
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
            case 42:
                {
                alt44=1;
                }
                break;
            case 35:
                {
                switch ( input.LA(2) ) {
                case 47:
                    {
                    alt44=5;
                    }
                    break;
                case 43:
                    {
                    alt44=2;
                    }
                    break;
                case 45:
                case 46:
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
            case 43:
                {
                alt44=2;
                }
                break;
            case 44:
                {
                alt44=3;
                }
                break;
            case 45:
            case 46:
                {
                alt44=4;
                }
                break;
            case 47:
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
    // InternalSct.g:1941:1: ruleBinding returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_indices_5_0= ruleExpression ) ) otherlv_6= ']' )* ) | ( (lv_value_7_0= ruleAnyValue ) ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_indices_5_0 = null;

        EObject lv_value_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:1944:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_indices_5_0= ruleExpression ) ) otherlv_6= ']' )* ) | ( (lv_value_7_0= ruleAnyValue ) ) ) ) )
            // InternalSct.g:1945:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_indices_5_0= ruleExpression ) ) otherlv_6= ']' )* ) | ( (lv_value_7_0= ruleAnyValue ) ) ) )
            {
            // InternalSct.g:1945:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_indices_5_0= ruleExpression ) ) otherlv_6= ']' )* ) | ( (lv_value_7_0= ruleAnyValue ) ) ) )
            // InternalSct.g:1945:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_indices_5_0= ruleExpression ) ) otherlv_6= ']' )* ) | ( (lv_value_7_0= ruleAnyValue ) ) )
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

            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBindingAccess().getToKeyword_2());
                  
            }
            // InternalSct.g:1983:1: ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_indices_5_0= ruleExpression ) ) otherlv_6= ']' )* ) | ( (lv_value_7_0= ruleAnyValue ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=RULE_STRING && LA57_0<=RULE_INT)||(LA57_0>=RULE_FLOAT && LA57_0<=RULE_BOOLEAN)) ) {
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
                    // InternalSct.g:1983:2: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_indices_5_0= ruleExpression ) ) otherlv_6= ']' )* )
                    {
                    // InternalSct.g:1983:2: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_indices_5_0= ruleExpression ) ) otherlv_6= ']' )* )
                    // InternalSct.g:1983:3: ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_indices_5_0= ruleExpression ) ) otherlv_6= ']' )*
                    {
                    // InternalSct.g:1983:3: ( (otherlv_3= RULE_ID ) )
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
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getBindingAccess().getActualValuedObjectCrossReference_3_0_0_0()); 
                      	
                    }

                    }


                    }

                    // InternalSct.g:1999:2: (otherlv_4= '[' ( (lv_indices_5_0= ruleExpression ) ) otherlv_6= ']' )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==40) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalSct.g:1999:4: otherlv_4= '[' ( (lv_indices_5_0= ruleExpression ) ) otherlv_6= ']'
                    	    {
                    	    otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getBindingAccess().getLeftSquareBracketKeyword_3_0_1_0());
                    	          
                    	    }
                    	    // InternalSct.g:2003:1: ( (lv_indices_5_0= ruleExpression ) )
                    	    // InternalSct.g:2004:1: (lv_indices_5_0= ruleExpression )
                    	    {
                    	    // InternalSct.g:2004:1: (lv_indices_5_0= ruleExpression )
                    	    // InternalSct.g:2005:3: lv_indices_5_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBindingAccess().getIndicesExpressionParserRuleCall_3_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_60);
                    	    lv_indices_5_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBindingRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"indices",
                    	              		lv_indices_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_6=(Token)match(input,41,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getBindingAccess().getRightSquareBracketKeyword_3_0_1_2());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:2026:6: ( (lv_value_7_0= ruleAnyValue ) )
                    {
                    // InternalSct.g:2026:6: ( (lv_value_7_0= ruleAnyValue ) )
                    // InternalSct.g:2027:1: (lv_value_7_0= ruleAnyValue )
                    {
                    // InternalSct.g:2027:1: (lv_value_7_0= ruleAnyValue )
                    // InternalSct.g:2028:3: lv_value_7_0= ruleAnyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingAccess().getValueAnyValueParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_7_0=ruleAnyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBindingRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_7_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.AnyValue");
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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleEntryAction"
    // InternalSct.g:2052:1: entryRuleEntryAction returns [EObject current=null] : iv_ruleEntryAction= ruleEntryAction EOF ;
    public final EObject entryRuleEntryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryAction = null;


        try {
            // InternalSct.g:2053:2: (iv_ruleEntryAction= ruleEntryAction EOF )
            // InternalSct.g:2054:2: iv_ruleEntryAction= ruleEntryAction EOF
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
    // InternalSct.g:2061:1: ruleEntryAction returns [EObject current=null] : ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? ) ;
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
            // InternalSct.g:2064:28: ( ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? ) )
            // InternalSct.g:2065:1: ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? )
            {
            // InternalSct.g:2065:1: ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? )
            // InternalSct.g:2065:2: () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )?
            {
            // InternalSct.g:2065:2: ()
            // InternalSct.g:2066:2: 
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

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntryActionAccess().getEntryKeyword_1());
                  
            }
            // InternalSct.g:2078:1: ( (lv_trigger_2_0= ruleBoolExpression ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_STRING && LA58_0<=RULE_BOOLEAN)||LA58_0==30||LA58_0==57||LA58_0==60||LA58_0==64||LA58_0==85||LA58_0==90) ) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_ID) ) {
                int LA58_2 = input.LA(2);

                if ( (LA58_2==EOF||LA58_2==RULE_ID||LA58_2==RULE_COMMENT_ANNOTATION||(LA58_2>=16 && LA58_2<=17)||LA58_2==19||(LA58_2>=26 && LA58_2<=29)||LA58_2==32||LA58_2==35||LA58_2==38||LA58_2==40||(LA58_2>=42 && LA58_2<=47)||(LA58_2>=49 && LA58_2<=55)||LA58_2==57||LA58_2==59||(LA58_2>=61 && LA58_2<=62)||(LA58_2>=64 && LA58_2<=68)||(LA58_2>=81 && LA58_2<=84)||(LA58_2>=86 && LA58_2<=89)||(LA58_2>=91 && LA58_2<=99)) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // InternalSct.g:2079:1: (lv_trigger_2_0= ruleBoolExpression )
                    {
                    // InternalSct.g:2079:1: (lv_trigger_2_0= ruleBoolExpression )
                    // InternalSct.g:2080:3: lv_trigger_2_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEntryActionAccess().getTriggerBoolExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_62);
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

            // InternalSct.g:2096:3: (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==38) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalSct.g:2096:5: otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    {
                    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEntryActionAccess().getSolidusKeyword_3_0());
                          
                    }
                    // InternalSct.g:2100:1: ( (lv_effects_4_0= ruleEffect ) )
                    // InternalSct.g:2101:1: (lv_effects_4_0= ruleEffect )
                    {
                    // InternalSct.g:2101:1: (lv_effects_4_0= ruleEffect )
                    // InternalSct.g:2102:3: lv_effects_4_0= ruleEffect
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

                    // InternalSct.g:2118:2: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        alt59 = dfa59.predict(input);
                        switch (alt59) {
                    	case 1 :
                    	    // InternalSct.g:2118:4: otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getEntryActionAccess().getSemicolonKeyword_3_2_0());
                    	          
                    	    }
                    	    // InternalSct.g:2122:1: ( (lv_effects_6_0= ruleEffect ) )
                    	    // InternalSct.g:2123:1: (lv_effects_6_0= ruleEffect )
                    	    {
                    	    // InternalSct.g:2123:1: (lv_effects_6_0= ruleEffect )
                    	    // InternalSct.g:2124:3: lv_effects_6_0= ruleEffect
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
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSct.g:2140:6: (otherlv_7= ';' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==19) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalSct.g:2140:8: otherlv_7= ';'
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
    // InternalSct.g:2152:1: entryRuleDuringAction returns [EObject current=null] : iv_ruleDuringAction= ruleDuringAction EOF ;
    public final EObject entryRuleDuringAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuringAction = null;


        try {
            // InternalSct.g:2153:2: (iv_ruleDuringAction= ruleDuringAction EOF )
            // InternalSct.g:2154:2: iv_ruleDuringAction= ruleDuringAction EOF
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
    // InternalSct.g:2161:1: ruleDuringAction returns [EObject current=null] : ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? ) ;
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
            // InternalSct.g:2164:28: ( ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? ) )
            // InternalSct.g:2165:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? )
            {
            // InternalSct.g:2165:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? )
            // InternalSct.g:2165:2: () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )?
            {
            // InternalSct.g:2165:2: ()
            // InternalSct.g:2166:2: 
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

            // InternalSct.g:2174:2: ( (lv_immediate_1_0= 'immediate' ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==35) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalSct.g:2175:1: (lv_immediate_1_0= 'immediate' )
                    {
                    // InternalSct.g:2175:1: (lv_immediate_1_0= 'immediate' )
                    // InternalSct.g:2176:3: lv_immediate_1_0= 'immediate'
                    {
                    lv_immediate_1_0=(Token)match(input,35,FollowSets000.FOLLOW_63); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDuringActionAccess().getDuringKeyword_2());
                  
            }
            // InternalSct.g:2193:1: ( (lv_trigger_3_0= ruleBoolExpression ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=RULE_STRING && LA63_0<=RULE_BOOLEAN)||LA63_0==30||LA63_0==57||LA63_0==60||LA63_0==64||LA63_0==85||LA63_0==90) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_ID) ) {
                int LA63_2 = input.LA(2);

                if ( (LA63_2==EOF||LA63_2==RULE_ID||LA63_2==RULE_COMMENT_ANNOTATION||(LA63_2>=16 && LA63_2<=17)||LA63_2==19||(LA63_2>=26 && LA63_2<=29)||LA63_2==32||LA63_2==35||LA63_2==38||LA63_2==40||(LA63_2>=42 && LA63_2<=47)||(LA63_2>=49 && LA63_2<=55)||LA63_2==57||LA63_2==59||(LA63_2>=61 && LA63_2<=62)||(LA63_2>=64 && LA63_2<=68)||(LA63_2>=81 && LA63_2<=84)||(LA63_2>=86 && LA63_2<=89)||(LA63_2>=91 && LA63_2<=99)) ) {
                    alt63=1;
                }
            }
            switch (alt63) {
                case 1 :
                    // InternalSct.g:2194:1: (lv_trigger_3_0= ruleBoolExpression )
                    {
                    // InternalSct.g:2194:1: (lv_trigger_3_0= ruleBoolExpression )
                    // InternalSct.g:2195:3: lv_trigger_3_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDuringActionAccess().getTriggerBoolExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_62);
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

            // InternalSct.g:2211:3: (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==38) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalSct.g:2211:5: otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    {
                    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDuringActionAccess().getSolidusKeyword_4_0());
                          
                    }
                    // InternalSct.g:2215:1: ( (lv_effects_5_0= ruleEffect ) )
                    // InternalSct.g:2216:1: (lv_effects_5_0= ruleEffect )
                    {
                    // InternalSct.g:2216:1: (lv_effects_5_0= ruleEffect )
                    // InternalSct.g:2217:3: lv_effects_5_0= ruleEffect
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

                    // InternalSct.g:2233:2: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        alt64 = dfa64.predict(input);
                        switch (alt64) {
                    	case 1 :
                    	    // InternalSct.g:2233:4: otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) )
                    	    {
                    	    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getDuringActionAccess().getSemicolonKeyword_4_2_0());
                    	          
                    	    }
                    	    // InternalSct.g:2237:1: ( (lv_effects_7_0= ruleEffect ) )
                    	    // InternalSct.g:2238:1: (lv_effects_7_0= ruleEffect )
                    	    {
                    	    // InternalSct.g:2238:1: (lv_effects_7_0= ruleEffect )
                    	    // InternalSct.g:2239:3: lv_effects_7_0= ruleEffect
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
                    	    break loop64;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSct.g:2255:6: (otherlv_8= ';' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==19) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalSct.g:2255:8: otherlv_8= ';'
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
    // InternalSct.g:2267:1: entryRuleExitAction returns [EObject current=null] : iv_ruleExitAction= ruleExitAction EOF ;
    public final EObject entryRuleExitAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitAction = null;


        try {
            // InternalSct.g:2268:2: (iv_ruleExitAction= ruleExitAction EOF )
            // InternalSct.g:2269:2: iv_ruleExitAction= ruleExitAction EOF
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
    // InternalSct.g:2276:1: ruleExitAction returns [EObject current=null] : ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? ) ;
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
            // InternalSct.g:2279:28: ( ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? ) )
            // InternalSct.g:2280:1: ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? )
            {
            // InternalSct.g:2280:1: ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? )
            // InternalSct.g:2280:2: () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )?
            {
            // InternalSct.g:2280:2: ()
            // InternalSct.g:2281:2: 
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

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitActionAccess().getExitKeyword_1());
                  
            }
            // InternalSct.g:2293:1: ( (lv_trigger_2_0= ruleBoolExpression ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=RULE_STRING && LA67_0<=RULE_BOOLEAN)||LA67_0==30||LA67_0==57||LA67_0==60||LA67_0==64||LA67_0==85||LA67_0==90) ) {
                alt67=1;
            }
            else if ( (LA67_0==RULE_ID) ) {
                int LA67_2 = input.LA(2);

                if ( (LA67_2==EOF||LA67_2==RULE_ID||LA67_2==RULE_COMMENT_ANNOTATION||(LA67_2>=16 && LA67_2<=17)||LA67_2==19||(LA67_2>=26 && LA67_2<=29)||LA67_2==32||LA67_2==35||LA67_2==38||LA67_2==40||(LA67_2>=42 && LA67_2<=47)||(LA67_2>=49 && LA67_2<=55)||LA67_2==57||LA67_2==59||(LA67_2>=61 && LA67_2<=62)||(LA67_2>=64 && LA67_2<=68)||(LA67_2>=81 && LA67_2<=84)||(LA67_2>=86 && LA67_2<=89)||(LA67_2>=91 && LA67_2<=99)) ) {
                    alt67=1;
                }
            }
            switch (alt67) {
                case 1 :
                    // InternalSct.g:2294:1: (lv_trigger_2_0= ruleBoolExpression )
                    {
                    // InternalSct.g:2294:1: (lv_trigger_2_0= ruleBoolExpression )
                    // InternalSct.g:2295:3: lv_trigger_2_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExitActionAccess().getTriggerBoolExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_62);
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

            // InternalSct.g:2311:3: (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==38) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalSct.g:2311:5: otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    {
                    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getExitActionAccess().getSolidusKeyword_3_0());
                          
                    }
                    // InternalSct.g:2315:1: ( (lv_effects_4_0= ruleEffect ) )
                    // InternalSct.g:2316:1: (lv_effects_4_0= ruleEffect )
                    {
                    // InternalSct.g:2316:1: (lv_effects_4_0= ruleEffect )
                    // InternalSct.g:2317:3: lv_effects_4_0= ruleEffect
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

                    // InternalSct.g:2333:2: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        alt68 = dfa68.predict(input);
                        switch (alt68) {
                    	case 1 :
                    	    // InternalSct.g:2333:4: otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getExitActionAccess().getSemicolonKeyword_3_2_0());
                    	          
                    	    }
                    	    // InternalSct.g:2337:1: ( (lv_effects_6_0= ruleEffect ) )
                    	    // InternalSct.g:2338:1: (lv_effects_6_0= ruleEffect )
                    	    {
                    	    // InternalSct.g:2338:1: (lv_effects_6_0= ruleEffect )
                    	    // InternalSct.g:2339:3: lv_effects_6_0= ruleEffect
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
                    	    break loop68;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSct.g:2355:6: (otherlv_7= ';' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==19) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalSct.g:2355:8: otherlv_7= ';'
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
    // InternalSct.g:2367:1: entryRuleSuspendAction returns [EObject current=null] : iv_ruleSuspendAction= ruleSuspendAction EOF ;
    public final EObject entryRuleSuspendAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspendAction = null;


        try {
            // InternalSct.g:2368:2: (iv_ruleSuspendAction= ruleSuspendAction EOF )
            // InternalSct.g:2369:2: iv_ruleSuspendAction= ruleSuspendAction EOF
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
    // InternalSct.g:2376:1: ruleSuspendAction returns [EObject current=null] : ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? (otherlv_5= ';' )? ) ;
    public final EObject ruleSuspendAction() throws RecognitionException {
        EObject current = null;

        Token lv_immediate_1_0=null;
        Token lv_weak_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_trigger_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:2379:28: ( ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? (otherlv_5= ';' )? ) )
            // InternalSct.g:2380:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? (otherlv_5= ';' )? )
            {
            // InternalSct.g:2380:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? (otherlv_5= ';' )? )
            // InternalSct.g:2380:2: () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? (otherlv_5= ';' )?
            {
            // InternalSct.g:2380:2: ()
            // InternalSct.g:2381:2: 
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

            // InternalSct.g:2389:2: ( (lv_immediate_1_0= 'immediate' ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==35) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalSct.g:2390:1: (lv_immediate_1_0= 'immediate' )
                    {
                    // InternalSct.g:2390:1: (lv_immediate_1_0= 'immediate' )
                    // InternalSct.g:2391:3: lv_immediate_1_0= 'immediate'
                    {
                    lv_immediate_1_0=(Token)match(input,35,FollowSets000.FOLLOW_64); if (state.failed) return current;
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

            // InternalSct.g:2404:3: ( (lv_weak_2_0= 'weak' ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==45) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalSct.g:2405:1: (lv_weak_2_0= 'weak' )
                    {
                    // InternalSct.g:2405:1: (lv_weak_2_0= 'weak' )
                    // InternalSct.g:2406:3: lv_weak_2_0= 'weak'
                    {
                    lv_weak_2_0=(Token)match(input,45,FollowSets000.FOLLOW_65); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,46,FollowSets000.FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSuspendActionAccess().getSuspendKeyword_3());
                  
            }
            // InternalSct.g:2423:1: ( (lv_trigger_4_0= ruleBoolExpression ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=RULE_STRING && LA73_0<=RULE_BOOLEAN)||LA73_0==30||LA73_0==57||LA73_0==60||LA73_0==64||LA73_0==85||LA73_0==90) ) {
                alt73=1;
            }
            else if ( (LA73_0==RULE_ID) ) {
                int LA73_2 = input.LA(2);

                if ( (LA73_2==EOF||LA73_2==RULE_ID||LA73_2==RULE_COMMENT_ANNOTATION||(LA73_2>=16 && LA73_2<=17)||LA73_2==19||(LA73_2>=26 && LA73_2<=29)||LA73_2==32||LA73_2==35||LA73_2==40||(LA73_2>=42 && LA73_2<=47)||(LA73_2>=49 && LA73_2<=55)||LA73_2==57||LA73_2==59||(LA73_2>=61 && LA73_2<=62)||(LA73_2>=64 && LA73_2<=68)||(LA73_2>=81 && LA73_2<=84)||(LA73_2>=86 && LA73_2<=89)||(LA73_2>=91 && LA73_2<=99)) ) {
                    alt73=1;
                }
            }
            switch (alt73) {
                case 1 :
                    // InternalSct.g:2424:1: (lv_trigger_4_0= ruleBoolExpression )
                    {
                    // InternalSct.g:2424:1: (lv_trigger_4_0= ruleBoolExpression )
                    // InternalSct.g:2425:3: lv_trigger_4_0= ruleBoolExpression
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

            // InternalSct.g:2441:3: (otherlv_5= ';' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==19) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalSct.g:2441:5: otherlv_5= ';'
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
    // InternalSct.g:2453:1: entryRuleIterateAction returns [EObject current=null] : iv_ruleIterateAction= ruleIterateAction EOF ;
    public final EObject entryRuleIterateAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterateAction = null;


        try {
            // InternalSct.g:2454:2: (iv_ruleIterateAction= ruleIterateAction EOF )
            // InternalSct.g:2455:2: iv_ruleIterateAction= ruleIterateAction EOF
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
    // InternalSct.g:2462:1: ruleIterateAction returns [EObject current=null] : ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'iterate' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? ) ;
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
            // InternalSct.g:2465:28: ( ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'iterate' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? ) )
            // InternalSct.g:2466:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'iterate' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? )
            {
            // InternalSct.g:2466:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'iterate' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? )
            // InternalSct.g:2466:2: () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'iterate' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )?
            {
            // InternalSct.g:2466:2: ()
            // InternalSct.g:2467:2: 
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

            // InternalSct.g:2475:2: ( (lv_immediate_1_0= 'immediate' ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==35) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalSct.g:2476:1: (lv_immediate_1_0= 'immediate' )
                    {
                    // InternalSct.g:2476:1: (lv_immediate_1_0= 'immediate' )
                    // InternalSct.g:2477:3: lv_immediate_1_0= 'immediate'
                    {
                    lv_immediate_1_0=(Token)match(input,35,FollowSets000.FOLLOW_67); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIterateActionAccess().getIterateKeyword_2());
                  
            }
            // InternalSct.g:2494:1: ( (lv_trigger_3_0= ruleBoolExpression ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=RULE_STRING && LA76_0<=RULE_BOOLEAN)||LA76_0==30||LA76_0==57||LA76_0==60||LA76_0==64||LA76_0==85||LA76_0==90) ) {
                alt76=1;
            }
            else if ( (LA76_0==RULE_ID) ) {
                int LA76_2 = input.LA(2);

                if ( (LA76_2==EOF||LA76_2==RULE_ID||LA76_2==RULE_COMMENT_ANNOTATION||(LA76_2>=16 && LA76_2<=17)||LA76_2==19||(LA76_2>=26 && LA76_2<=29)||LA76_2==32||LA76_2==35||LA76_2==38||LA76_2==40||(LA76_2>=42 && LA76_2<=47)||(LA76_2>=49 && LA76_2<=55)||LA76_2==57||LA76_2==59||(LA76_2>=61 && LA76_2<=62)||(LA76_2>=64 && LA76_2<=68)||(LA76_2>=81 && LA76_2<=84)||(LA76_2>=86 && LA76_2<=89)||(LA76_2>=91 && LA76_2<=99)) ) {
                    alt76=1;
                }
            }
            switch (alt76) {
                case 1 :
                    // InternalSct.g:2495:1: (lv_trigger_3_0= ruleBoolExpression )
                    {
                    // InternalSct.g:2495:1: (lv_trigger_3_0= ruleBoolExpression )
                    // InternalSct.g:2496:3: lv_trigger_3_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIterateActionAccess().getTriggerBoolExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_62);
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

            // InternalSct.g:2512:3: (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==38) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalSct.g:2512:5: otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    {
                    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getIterateActionAccess().getSolidusKeyword_4_0());
                          
                    }
                    // InternalSct.g:2516:1: ( (lv_effects_5_0= ruleEffect ) )
                    // InternalSct.g:2517:1: (lv_effects_5_0= ruleEffect )
                    {
                    // InternalSct.g:2517:1: (lv_effects_5_0= ruleEffect )
                    // InternalSct.g:2518:3: lv_effects_5_0= ruleEffect
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

                    // InternalSct.g:2534:2: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        alt77 = dfa77.predict(input);
                        switch (alt77) {
                    	case 1 :
                    	    // InternalSct.g:2534:4: otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) )
                    	    {
                    	    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getIterateActionAccess().getSemicolonKeyword_4_2_0());
                    	          
                    	    }
                    	    // InternalSct.g:2538:1: ( (lv_effects_7_0= ruleEffect ) )
                    	    // InternalSct.g:2539:1: (lv_effects_7_0= ruleEffect )
                    	    {
                    	    // InternalSct.g:2539:1: (lv_effects_7_0= ruleEffect )
                    	    // InternalSct.g:2540:3: lv_effects_7_0= ruleEffect
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
                    	    break loop77;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSct.g:2556:6: (otherlv_8= ';' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==19) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalSct.g:2556:8: otherlv_8= ';'
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
    // InternalSct.g:2570:1: entryRuleTestEntity returns [EObject current=null] : iv_ruleTestEntity= ruleTestEntity EOF ;
    public final EObject entryRuleTestEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestEntity = null;


        try {
            // InternalSct.g:2571:2: (iv_ruleTestEntity= ruleTestEntity EOF )
            // InternalSct.g:2572:2: iv_ruleTestEntity= ruleTestEntity EOF
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
    // InternalSct.g:2579:1: ruleTestEntity returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) ) ;
    public final EObject ruleTestEntity() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;

        EObject lv_effect_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:2582:28: ( ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) ) )
            // InternalSct.g:2583:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )
            {
            // InternalSct.g:2583:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )
            int alt80=2;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // InternalSct.g:2583:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
                    {
                    // InternalSct.g:2583:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
                    // InternalSct.g:2584:1: (lv_expression_0_0= ruleAnnotatedExpression )
                    {
                    // InternalSct.g:2584:1: (lv_expression_0_0= ruleAnnotatedExpression )
                    // InternalSct.g:2585:3: lv_expression_0_0= ruleAnnotatedExpression
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
                    // InternalSct.g:2602:6: ( (lv_effect_1_0= ruleEffect ) )
                    {
                    // InternalSct.g:2602:6: ( (lv_effect_1_0= ruleEffect ) )
                    // InternalSct.g:2603:1: (lv_effect_1_0= ruleEffect )
                    {
                    // InternalSct.g:2603:1: (lv_effect_1_0= ruleEffect )
                    // InternalSct.g:2604:3: lv_effect_1_0= ruleEffect
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
    // InternalSct.g:2628:1: entryRuleAnnotatedExpression returns [EObject current=null] : iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF ;
    public final EObject entryRuleAnnotatedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotatedExpression = null;


        try {
            // InternalSct.g:2629:2: (iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF )
            // InternalSct.g:2630:2: iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF
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
    // InternalSct.g:2637:1: ruleAnnotatedExpression returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAnnotatedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:2640:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalSct.g:2641:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalSct.g:2641:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalSct.g:2641:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalSct.g:2641:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==RULE_COMMENT_ANNOTATION||LA81_0==62) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalSct.g:2642:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:2642:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:2643:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotatedExpressionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_68);
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
            	    break loop81;
                }
            } while (true);

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAnnotatedExpressionAccess().getExpressionKeyword_1());
                  
            }
            // InternalSct.g:2663:1: ( (lv_expression_2_0= ruleExpression ) )
            // InternalSct.g:2664:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalSct.g:2664:1: (lv_expression_2_0= ruleExpression )
            // InternalSct.g:2665:3: lv_expression_2_0= ruleExpression
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
    // InternalSct.g:2689:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalSct.g:2690:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalSct.g:2691:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalSct.g:2698:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_extern_2_0= 'extern' ) )? ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_input_4_0= 'input' ) )? ( (lv_output_5_0= 'output' ) )? ( (lv_static_6_0= 'static' ) )? ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) ) ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';' ) ;
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
            // InternalSct.g:2701:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_extern_2_0= 'extern' ) )? ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_input_4_0= 'input' ) )? ( (lv_output_5_0= 'output' ) )? ( (lv_static_6_0= 'static' ) )? ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) ) ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';' ) )
            // InternalSct.g:2702:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_extern_2_0= 'extern' ) )? ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_input_4_0= 'input' ) )? ( (lv_output_5_0= 'output' ) )? ( (lv_static_6_0= 'static' ) )? ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) ) ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';' )
            {
            // InternalSct.g:2702:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_extern_2_0= 'extern' ) )? ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_input_4_0= 'input' ) )? ( (lv_output_5_0= 'output' ) )? ( (lv_static_6_0= 'static' ) )? ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) ) ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';' )
            // InternalSct.g:2702:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_extern_2_0= 'extern' ) )? ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_input_4_0= 'input' ) )? ( (lv_output_5_0= 'output' ) )? ( (lv_static_6_0= 'static' ) )? ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) ) ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';'
            {
            // InternalSct.g:2702:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==RULE_COMMENT_ANNOTATION||LA82_0==62) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalSct.g:2703:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:2703:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:2704:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_69);
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
            	    break loop82;
                }
            } while (true);

            // InternalSct.g:2720:3: ( (lv_const_1_0= 'const' ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==49) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalSct.g:2721:1: (lv_const_1_0= 'const' )
                    {
                    // InternalSct.g:2721:1: (lv_const_1_0= 'const' )
                    // InternalSct.g:2722:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,49,FollowSets000.FOLLOW_70); if (state.failed) return current;
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

            // InternalSct.g:2735:3: ( (lv_extern_2_0= 'extern' ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==50) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalSct.g:2736:1: (lv_extern_2_0= 'extern' )
                    {
                    // InternalSct.g:2736:1: (lv_extern_2_0= 'extern' )
                    // InternalSct.g:2737:3: lv_extern_2_0= 'extern'
                    {
                    lv_extern_2_0=(Token)match(input,50,FollowSets000.FOLLOW_71); if (state.failed) return current;
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

            // InternalSct.g:2750:3: ( (lv_volatile_3_0= 'volatile' ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==51) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalSct.g:2751:1: (lv_volatile_3_0= 'volatile' )
                    {
                    // InternalSct.g:2751:1: (lv_volatile_3_0= 'volatile' )
                    // InternalSct.g:2752:3: lv_volatile_3_0= 'volatile'
                    {
                    lv_volatile_3_0=(Token)match(input,51,FollowSets000.FOLLOW_72); if (state.failed) return current;
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

            // InternalSct.g:2765:3: ( (lv_input_4_0= 'input' ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==52) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalSct.g:2766:1: (lv_input_4_0= 'input' )
                    {
                    // InternalSct.g:2766:1: (lv_input_4_0= 'input' )
                    // InternalSct.g:2767:3: lv_input_4_0= 'input'
                    {
                    lv_input_4_0=(Token)match(input,52,FollowSets000.FOLLOW_73); if (state.failed) return current;
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

            // InternalSct.g:2780:3: ( (lv_output_5_0= 'output' ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==53) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalSct.g:2781:1: (lv_output_5_0= 'output' )
                    {
                    // InternalSct.g:2781:1: (lv_output_5_0= 'output' )
                    // InternalSct.g:2782:3: lv_output_5_0= 'output'
                    {
                    lv_output_5_0=(Token)match(input,53,FollowSets000.FOLLOW_74); if (state.failed) return current;
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

            // InternalSct.g:2795:3: ( (lv_static_6_0= 'static' ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==54) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalSct.g:2796:1: (lv_static_6_0= 'static' )
                    {
                    // InternalSct.g:2796:1: (lv_static_6_0= 'static' )
                    // InternalSct.g:2797:3: lv_static_6_0= 'static'
                    {
                    lv_static_6_0=(Token)match(input,54,FollowSets000.FOLLOW_75); if (state.failed) return current;
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

            // InternalSct.g:2810:3: ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==55) ) {
                int LA90_1 = input.LA(2);

                if ( (LA90_1==RULE_ID) ) {
                    alt90=2;
                }
                else if ( ((LA90_1>=93 && LA90_1<=99)) ) {
                    alt90=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA90_0>=93 && LA90_0<=99)) ) {
                alt90=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // InternalSct.g:2810:4: ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) )
                    {
                    // InternalSct.g:2810:4: ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) )
                    // InternalSct.g:2810:5: ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) )
                    {
                    // InternalSct.g:2810:5: ( (lv_signal_7_0= 'signal' ) )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==55) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalSct.g:2811:1: (lv_signal_7_0= 'signal' )
                            {
                            // InternalSct.g:2811:1: (lv_signal_7_0= 'signal' )
                            // InternalSct.g:2812:3: lv_signal_7_0= 'signal'
                            {
                            lv_signal_7_0=(Token)match(input,55,FollowSets000.FOLLOW_75); if (state.failed) return current;
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

                    // InternalSct.g:2825:3: ( (lv_type_8_0= ruleValueType ) )
                    // InternalSct.g:2826:1: (lv_type_8_0= ruleValueType )
                    {
                    // InternalSct.g:2826:1: (lv_type_8_0= ruleValueType )
                    // InternalSct.g:2827:3: lv_type_8_0= ruleValueType
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
                    // InternalSct.g:2844:6: ( (lv_signal_9_0= 'signal' ) )
                    {
                    // InternalSct.g:2844:6: ( (lv_signal_9_0= 'signal' ) )
                    // InternalSct.g:2845:1: (lv_signal_9_0= 'signal' )
                    {
                    // InternalSct.g:2845:1: (lv_signal_9_0= 'signal' )
                    // InternalSct.g:2846:3: lv_signal_9_0= 'signal'
                    {
                    lv_signal_9_0=(Token)match(input,55,FollowSets000.FOLLOW_13); if (state.failed) return current;
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

            // InternalSct.g:2859:3: ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            // InternalSct.g:2860:1: (lv_valuedObjects_10_0= ruleValuedObject )
            {
            // InternalSct.g:2860:1: (lv_valuedObjects_10_0= ruleValuedObject )
            // InternalSct.g:2861:3: lv_valuedObjects_10_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_76);
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

            // InternalSct.g:2877:2: (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==24) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalSct.g:2877:4: otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) )
            	    {
            	    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getDeclarationAccess().getCommaKeyword_9_0());
            	          
            	    }
            	    // InternalSct.g:2881:1: ( (lv_valuedObjects_12_0= ruleValuedObject ) )
            	    // InternalSct.g:2882:1: (lv_valuedObjects_12_0= ruleValuedObject )
            	    {
            	    // InternalSct.g:2882:1: (lv_valuedObjects_12_0= ruleValuedObject )
            	    // InternalSct.g:2883:3: lv_valuedObjects_12_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_9_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_76);
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
            	    break loop91;
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
    // InternalSct.g:2911:1: entryRuleValuedObject returns [EObject current=null] : iv_ruleValuedObject= ruleValuedObject EOF ;
    public final EObject entryRuleValuedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObject = null;


        try {
            // InternalSct.g:2912:2: (iv_ruleValuedObject= ruleValuedObject EOF )
            // InternalSct.g:2913:2: iv_ruleValuedObject= ruleValuedObject EOF
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
    // InternalSct.g:2920:1: ruleValuedObject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? ) ;
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
            // InternalSct.g:2923:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? ) )
            // InternalSct.g:2924:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? )
            {
            // InternalSct.g:2924:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? )
            // InternalSct.g:2924:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )?
            {
            // InternalSct.g:2924:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSct.g:2925:1: (lv_name_0_0= RULE_ID )
            {
            // InternalSct.g:2925:1: (lv_name_0_0= RULE_ID )
            // InternalSct.g:2926:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_77); if (state.failed) return current;
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

            // InternalSct.g:2942:2: (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==40) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalSct.g:2942:4: otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // InternalSct.g:2946:1: ( (lv_cardinalities_2_0= ruleExpression ) )
            	    // InternalSct.g:2947:1: (lv_cardinalities_2_0= ruleExpression )
            	    {
            	    // InternalSct.g:2947:1: (lv_cardinalities_2_0= ruleExpression )
            	    // InternalSct.g:2948:3: lv_cardinalities_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getCardinalitiesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_60);
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

            	    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_77); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);

            // InternalSct.g:2968:3: (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==18) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalSct.g:2968:5: otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // InternalSct.g:2972:1: ( (lv_initialValue_5_0= ruleExpression ) )
                    // InternalSct.g:2973:1: (lv_initialValue_5_0= ruleExpression )
                    {
                    // InternalSct.g:2973:1: (lv_initialValue_5_0= ruleExpression )
                    // InternalSct.g:2974:3: lv_initialValue_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getInitialValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_78);
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

            // InternalSct.g:2990:4: (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==56) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalSct.g:2990:6: otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) )
                    {
                    otherlv_6=(Token)match(input,56,FollowSets000.FOLLOW_79); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getValuedObjectAccess().getCombineKeyword_3_0());
                          
                    }
                    // InternalSct.g:2994:1: ( (lv_combineOperator_7_0= ruleCombineOperator ) )
                    // InternalSct.g:2995:1: (lv_combineOperator_7_0= ruleCombineOperator )
                    {
                    // InternalSct.g:2995:1: (lv_combineOperator_7_0= ruleCombineOperator )
                    // InternalSct.g:2996:3: lv_combineOperator_7_0= ruleCombineOperator
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
    // InternalSct.g:3020:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // InternalSct.g:3021:2: (iv_ruleEffect= ruleEffect EOF )
            // InternalSct.g:3022:2: iv_ruleEffect= ruleEffect EOF
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
    // InternalSct.g:3029:1: ruleEffect returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_PostfixEffect_1 = null;

        EObject this_Emission_2 = null;

        EObject this_HostcodeEffect_3 = null;

        EObject this_FunctionCallEffect_4 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3032:28: ( (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect ) )
            // InternalSct.g:3033:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect )
            {
            // InternalSct.g:3033:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect )
            int alt95=5;
            switch ( input.LA(1) ) {
            case RULE_COMMENT_ANNOTATION:
                {
                int LA95_1 = input.LA(2);

                if ( (synpred106_InternalSct()) ) {
                    alt95=1;
                }
                else if ( (synpred107_InternalSct()) ) {
                    alt95=2;
                }
                else if ( (synpred108_InternalSct()) ) {
                    alt95=3;
                }
                else if ( (synpred109_InternalSct()) ) {
                    alt95=4;
                }
                else if ( (true) ) {
                    alt95=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 1, input);

                    throw nvae;
                }
                }
                break;
            case 62:
                {
                int LA95_2 = input.LA(2);

                if ( (synpred106_InternalSct()) ) {
                    alt95=1;
                }
                else if ( (synpred107_InternalSct()) ) {
                    alt95=2;
                }
                else if ( (synpred108_InternalSct()) ) {
                    alt95=3;
                }
                else if ( (synpred109_InternalSct()) ) {
                    alt95=4;
                }
                else if ( (true) ) {
                    alt95=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA95_3 = input.LA(2);

                if ( (synpred106_InternalSct()) ) {
                    alt95=1;
                }
                else if ( (synpred107_InternalSct()) ) {
                    alt95=2;
                }
                else if ( (synpred108_InternalSct()) ) {
                    alt95=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HOSTCODE:
                {
                alt95=4;
                }
                break;
            case 57:
                {
                alt95=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalSct.g:3034:2: this_Assignment_0= ruleAssignment
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
                    // InternalSct.g:3047:2: this_PostfixEffect_1= rulePostfixEffect
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
                    // InternalSct.g:3060:2: this_Emission_2= ruleEmission
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
                    // InternalSct.g:3073:2: this_HostcodeEffect_3= ruleHostcodeEffect
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
                    // InternalSct.g:3086:2: this_FunctionCallEffect_4= ruleFunctionCallEffect
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
    // InternalSct.g:3105:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // InternalSct.g:3106:2: (iv_ruleEmission= ruleEmission EOF )
            // InternalSct.g:3107:2: iv_ruleEmission= ruleEmission EOF
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
    // InternalSct.g:3114:1: ruleEmission returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_newValue_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3117:28: ( ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? ) )
            // InternalSct.g:3118:1: ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? )
            {
            // InternalSct.g:3118:1: ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? )
            // InternalSct.g:3118:2: ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            {
            // InternalSct.g:3118:2: ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==RULE_COMMENT_ANNOTATION||LA96_0==62) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalSct.g:3119:1: (lv_annotations_0_0= ruleRestrictedAnnotation )
            	    {
            	    // InternalSct.g:3119:1: (lv_annotations_0_0= ruleRestrictedAnnotation )
            	    // InternalSct.g:3120:3: lv_annotations_0_0= ruleRestrictedAnnotation
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
            	    break loop96;
                }
            } while (true);

            // InternalSct.g:3136:3: ( (otherlv_1= RULE_ID ) )
            // InternalSct.g:3137:1: (otherlv_1= RULE_ID )
            {
            // InternalSct.g:3137:1: (otherlv_1= RULE_ID )
            // InternalSct.g:3138:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmissionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // InternalSct.g:3152:2: (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==30) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalSct.g:3152:4: otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // InternalSct.g:3156:1: ( (lv_newValue_3_0= ruleExpression ) )
                    // InternalSct.g:3157:1: (lv_newValue_3_0= ruleExpression )
                    {
                    // InternalSct.g:3157:1: (lv_newValue_3_0= ruleExpression )
                    // InternalSct.g:3158:3: lv_newValue_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_81);
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
    // InternalSct.g:3186:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalSct.g:3187:2: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalSct.g:3188:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalSct.g:3195:1: ruleAssignment returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) ) ;
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
            // InternalSct.g:3198:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) ) )
            // InternalSct.g:3199:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) )
            {
            // InternalSct.g:3199:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) )
            // InternalSct.g:3199:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) )
            {
            // InternalSct.g:3199:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==RULE_COMMENT_ANNOTATION||LA98_0==62) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalSct.g:3200:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:3200:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:3201:3: lv_annotations_0_0= ruleAnnotation
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
            	    break loop98;
                }
            } while (true);

            // InternalSct.g:3217:3: ( (otherlv_1= RULE_ID ) )
            // InternalSct.g:3218:1: (otherlv_1= RULE_ID )
            {
            // InternalSct.g:3218:1: (otherlv_1= RULE_ID )
            // InternalSct.g:3219:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // InternalSct.g:3233:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==40) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalSct.g:3233:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalSct.g:3237:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // InternalSct.g:3238:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // InternalSct.g:3238:1: (lv_indices_3_0= ruleExpression )
            	    // InternalSct.g:3239:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_60);
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

            	    otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_82); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);

            // InternalSct.g:3259:3: ( (lv_operator_5_0= ruleAssignOperator ) )
            // InternalSct.g:3260:1: (lv_operator_5_0= ruleAssignOperator )
            {
            // InternalSct.g:3260:1: (lv_operator_5_0= ruleAssignOperator )
            // InternalSct.g:3261:3: lv_operator_5_0= ruleAssignOperator
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

            // InternalSct.g:3277:2: ( (lv_expression_6_0= ruleExpression ) )
            // InternalSct.g:3278:1: (lv_expression_6_0= ruleExpression )
            {
            // InternalSct.g:3278:1: (lv_expression_6_0= ruleExpression )
            // InternalSct.g:3279:3: lv_expression_6_0= ruleExpression
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
    // InternalSct.g:3303:1: entryRulePostfixEffect returns [EObject current=null] : iv_rulePostfixEffect= rulePostfixEffect EOF ;
    public final EObject entryRulePostfixEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixEffect = null;


        try {
            // InternalSct.g:3304:2: (iv_rulePostfixEffect= rulePostfixEffect EOF )
            // InternalSct.g:3305:2: iv_rulePostfixEffect= rulePostfixEffect EOF
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
    // InternalSct.g:3312:1: rulePostfixEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) ) ;
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
            // InternalSct.g:3315:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) ) )
            // InternalSct.g:3316:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) )
            {
            // InternalSct.g:3316:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) )
            // InternalSct.g:3316:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) )
            {
            // InternalSct.g:3316:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==RULE_COMMENT_ANNOTATION||LA100_0==62) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalSct.g:3317:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:3317:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:3318:3: lv_annotations_0_0= ruleAnnotation
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
            	    break loop100;
                }
            } while (true);

            // InternalSct.g:3334:3: ( (otherlv_1= RULE_ID ) )
            // InternalSct.g:3335:1: (otherlv_1= RULE_ID )
            {
            // InternalSct.g:3335:1: (otherlv_1= RULE_ID )
            // InternalSct.g:3336:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPostfixEffectRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_83); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getPostfixEffectAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // InternalSct.g:3350:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==40) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // InternalSct.g:3350:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPostfixEffectAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalSct.g:3354:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // InternalSct.g:3355:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // InternalSct.g:3355:1: (lv_indices_3_0= ruleExpression )
            	    // InternalSct.g:3356:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_60);
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

            	    otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_83); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getPostfixEffectAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);

            // InternalSct.g:3376:3: ( (lv_operator_5_0= rulePostfixOperator ) )
            // InternalSct.g:3377:1: (lv_operator_5_0= rulePostfixOperator )
            {
            // InternalSct.g:3377:1: (lv_operator_5_0= rulePostfixOperator )
            // InternalSct.g:3378:3: lv_operator_5_0= rulePostfixOperator
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
    // InternalSct.g:3402:1: entryRuleHostcodeEffect returns [EObject current=null] : iv_ruleHostcodeEffect= ruleHostcodeEffect EOF ;
    public final EObject entryRuleHostcodeEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostcodeEffect = null;


        try {
            // InternalSct.g:3403:2: (iv_ruleHostcodeEffect= ruleHostcodeEffect EOF )
            // InternalSct.g:3404:2: iv_ruleHostcodeEffect= ruleHostcodeEffect EOF
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
    // InternalSct.g:3411:1: ruleHostcodeEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) ;
    public final EObject ruleHostcodeEffect() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3414:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) )
            // InternalSct.g:3415:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            {
            // InternalSct.g:3415:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            // InternalSct.g:3415:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) )
            {
            // InternalSct.g:3415:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==RULE_COMMENT_ANNOTATION||LA102_0==62) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // InternalSct.g:3416:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:3416:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:3417:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHostcodeEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_84);
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
            	    break loop102;
                }
            } while (true);

            // InternalSct.g:3433:3: ( (lv_text_1_0= RULE_HOSTCODE ) )
            // InternalSct.g:3434:1: (lv_text_1_0= RULE_HOSTCODE )
            {
            // InternalSct.g:3434:1: (lv_text_1_0= RULE_HOSTCODE )
            // InternalSct.g:3435:3: lv_text_1_0= RULE_HOSTCODE
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
    // InternalSct.g:3459:1: entryRuleFunctionCallEffect returns [EObject current=null] : iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF ;
    public final EObject entryRuleFunctionCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallEffect = null;


        try {
            // InternalSct.g:3460:2: (iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF )
            // InternalSct.g:3461:2: iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF
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
    // InternalSct.g:3468:1: ruleFunctionCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' ) ;
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
            // InternalSct.g:3471:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' ) )
            // InternalSct.g:3472:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' )
            {
            // InternalSct.g:3472:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' )
            // InternalSct.g:3472:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>'
            {
            // InternalSct.g:3472:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==RULE_COMMENT_ANNOTATION||LA103_0==62) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // InternalSct.g:3473:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:3473:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:3474:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_85);
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
            	    break loop103;
                }
            } while (true);

            otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionCallEffectAccess().getLessThanSignKeyword_1());
                  
            }
            // InternalSct.g:3494:1: ( (lv_functionName_2_0= ruleExtendedID ) )
            // InternalSct.g:3495:1: (lv_functionName_2_0= ruleExtendedID )
            {
            // InternalSct.g:3495:1: (lv_functionName_2_0= ruleExtendedID )
            // InternalSct.g:3496:3: lv_functionName_2_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getFunctionNameExtendedIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_86);
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

            // InternalSct.g:3512:2: ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )?
            int alt105=3;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==30) ) {
                alt105=1;
            }
            else if ( (LA105_0==58) ) {
                alt105=2;
            }
            switch (alt105) {
                case 1 :
                    // InternalSct.g:3512:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    {
                    // InternalSct.g:3512:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    // InternalSct.g:3512:5: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_87); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_3_0_0());
                          
                    }
                    // InternalSct.g:3516:1: ( (lv_parameters_4_0= ruleParameter ) )
                    // InternalSct.g:3517:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalSct.g:3517:1: (lv_parameters_4_0= ruleParameter )
                    // InternalSct.g:3518:3: lv_parameters_4_0= ruleParameter
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

                    // InternalSct.g:3534:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( (LA104_0==24) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // InternalSct.g:3534:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_87); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_3_0_2_0());
                    	          
                    	    }
                    	    // InternalSct.g:3538:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // InternalSct.g:3539:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // InternalSct.g:3539:1: (lv_parameters_6_0= ruleParameter )
                    	    // InternalSct.g:3540:3: lv_parameters_6_0= ruleParameter
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
                    	    break loop104;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_88); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_3_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:3561:7: otherlv_8= '()'
                    {
                    otherlv_8=(Token)match(input,58,FollowSets000.FOLLOW_88); if (state.failed) return current;
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
    // InternalSct.g:3577:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSct.g:3578:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalSct.g:3579:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalSct.g:3586:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3589:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // InternalSct.g:3590:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // InternalSct.g:3590:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt106=2;
            alt106 = dfa106.predict(input);
            switch (alt106) {
                case 1 :
                    // InternalSct.g:3591:2: this_BoolExpression_0= ruleBoolExpression
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
                    // InternalSct.g:3604:2: this_ValuedExpression_1= ruleValuedExpression
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
    // InternalSct.g:3623:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // InternalSct.g:3624:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // InternalSct.g:3625:2: iv_ruleBoolExpression= ruleBoolExpression EOF
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
    // InternalSct.g:3632:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3635:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // InternalSct.g:3637:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
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
    // InternalSct.g:3656:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalSct.g:3657:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalSct.g:3658:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
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
    // InternalSct.g:3665:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3668:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) )
            // InternalSct.g:3669:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            {
            // InternalSct.g:3669:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            // InternalSct.g:3670:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_89);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:3681:1: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==91) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalSct.g:3681:2: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    {
                    // InternalSct.g:3681:2: ()
                    // InternalSct.g:3682:2: 
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

                    // InternalSct.g:3690:2: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    int cnt107=0;
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==91) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // InternalSct.g:3690:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    {
                    	    // InternalSct.g:3690:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    	    // InternalSct.g:3691:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    {
                    	    // InternalSct.g:3691:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    // InternalSct.g:3692:3: lv_operator_2_0= ruleLogicalOrOperator
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

                    	    // InternalSct.g:3708:2: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    // InternalSct.g:3709:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    {
                    	    // InternalSct.g:3709:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    // InternalSct.g:3710:3: lv_subExpressions_3_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_89);
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // InternalSct.g:3734:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalSct.g:3735:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalSct.g:3736:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
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
    // InternalSct.g:3743:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3746:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) )
            // InternalSct.g:3747:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            {
            // InternalSct.g:3747:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            // InternalSct.g:3748:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_90);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:3759:1: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==92) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalSct.g:3759:2: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    {
                    // InternalSct.g:3759:2: ()
                    // InternalSct.g:3760:2: 
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

                    // InternalSct.g:3768:2: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    int cnt109=0;
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==92) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // InternalSct.g:3768:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    // InternalSct.g:3768:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    	    // InternalSct.g:3769:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    {
                    	    // InternalSct.g:3769:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    // InternalSct.g:3770:3: lv_operator_2_0= ruleLogicalAndOperator
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

                    	    // InternalSct.g:3786:2: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    // InternalSct.g:3787:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    {
                    	    // InternalSct.g:3787:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    // InternalSct.g:3788:3: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_90);
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // InternalSct.g:3812:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // InternalSct.g:3813:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // InternalSct.g:3814:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
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
    // InternalSct.g:3821:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3824:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) )
            // InternalSct.g:3825:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            {
            // InternalSct.g:3825:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            // InternalSct.g:3826:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_91);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:3837:1: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==86) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalSct.g:3837:2: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    {
                    // InternalSct.g:3837:2: ()
                    // InternalSct.g:3838:2: 
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

                    // InternalSct.g:3846:2: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    int cnt111=0;
                    loop111:
                    do {
                        int alt111=2;
                        int LA111_0 = input.LA(1);

                        if ( (LA111_0==86) ) {
                            alt111=1;
                        }


                        switch (alt111) {
                    	case 1 :
                    	    // InternalSct.g:3846:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    // InternalSct.g:3846:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    	    // InternalSct.g:3847:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    {
                    	    // InternalSct.g:3847:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    // InternalSct.g:3848:3: lv_operator_2_0= ruleBitwiseOrOperator
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

                    	    // InternalSct.g:3864:2: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    // InternalSct.g:3865:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    {
                    	    // InternalSct.g:3865:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    // InternalSct.g:3866:3: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_91);
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
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // InternalSct.g:3890:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // InternalSct.g:3891:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // InternalSct.g:3892:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
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
    // InternalSct.g:3899:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3902:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) )
            // InternalSct.g:3903:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            {
            // InternalSct.g:3903:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            // InternalSct.g:3904:2: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_92);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:3915:1: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==61) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalSct.g:3915:2: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    {
                    // InternalSct.g:3915:2: ()
                    // InternalSct.g:3916:2: 
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

                    // InternalSct.g:3924:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    int cnt113=0;
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==61) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // InternalSct.g:3924:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    {
                    	    // InternalSct.g:3924:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    	    // InternalSct.g:3925:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    {
                    	    // InternalSct.g:3925:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    // InternalSct.g:3926:3: lv_operator_2_0= ruleBitwiseAndOperator
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

                    	    // InternalSct.g:3942:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    // InternalSct.g:3943:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    {
                    	    // InternalSct.g:3943:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    // InternalSct.g:3944:3: lv_subExpressions_3_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_92);
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
                    	    if ( cnt113 >= 1 ) break loop113;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(113, input);
                                throw eee;
                        }
                        cnt113++;
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
    // InternalSct.g:3968:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // InternalSct.g:3969:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalSct.g:3970:2: iv_ruleCompareOperation= ruleCompareOperation EOF
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
    // InternalSct.g:3977:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3980:28: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // InternalSct.g:3981:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // InternalSct.g:3981:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // InternalSct.g:3982:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_93);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotOrValuedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:3993:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==57||LA115_0==59||(LA115_0>=81 && LA115_0<=84)) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalSct.g:3993:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // InternalSct.g:3993:2: ()
                    // InternalSct.g:3994:2: 
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

                    // InternalSct.g:4002:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // InternalSct.g:4003:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // InternalSct.g:4003:1: (lv_operator_2_0= ruleCompareOperator )
                    // InternalSct.g:4004:3: lv_operator_2_0= ruleCompareOperator
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

                    // InternalSct.g:4020:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // InternalSct.g:4021:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // InternalSct.g:4021:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // InternalSct.g:4022:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
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
    // InternalSct.g:4046:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // InternalSct.g:4047:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // InternalSct.g:4048:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
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
    // InternalSct.g:4055:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4058:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // InternalSct.g:4059:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // InternalSct.g:4059:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt116=2;
            alt116 = dfa116.predict(input);
            switch (alt116) {
                case 1 :
                    // InternalSct.g:4060:2: this_ValuedExpression_0= ruleValuedExpression
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
                    // InternalSct.g:4073:2: this_NotExpression_1= ruleNotExpression
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
    // InternalSct.g:4092:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalSct.g:4093:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalSct.g:4094:2: iv_ruleNotExpression= ruleNotExpression EOF
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
    // InternalSct.g:4101:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4104:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // InternalSct.g:4105:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // InternalSct.g:4105:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==60) ) {
                alt117=1;
            }
            else if ( (LA117_0==RULE_ID||LA117_0==RULE_HOSTCODE||LA117_0==RULE_BOOLEAN||LA117_0==30||LA117_0==57||LA117_0==85||LA117_0==90) ) {
                alt117=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }
            switch (alt117) {
                case 1 :
                    // InternalSct.g:4105:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // InternalSct.g:4105:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // InternalSct.g:4105:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // InternalSct.g:4105:3: ()
                    // InternalSct.g:4106:2: 
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

                    // InternalSct.g:4114:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // InternalSct.g:4115:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // InternalSct.g:4115:1: (lv_operator_1_0= ruleNotOperator )
                    // InternalSct.g:4116:3: lv_operator_1_0= ruleNotOperator
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

                    // InternalSct.g:4132:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // InternalSct.g:4133:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // InternalSct.g:4133:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // InternalSct.g:4134:3: lv_subExpressions_2_0= ruleNotExpression
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
                    // InternalSct.g:4152:2: this_AtomicExpression_3= ruleAtomicExpression
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
    // InternalSct.g:4171:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // InternalSct.g:4172:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // InternalSct.g:4173:2: iv_ruleValuedExpression= ruleValuedExpression EOF
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
    // InternalSct.g:4180:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4183:28: (this_AddExpression_0= ruleAddExpression )
            // InternalSct.g:4185:2: this_AddExpression_0= ruleAddExpression
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
    // InternalSct.g:4204:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalSct.g:4205:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalSct.g:4206:2: iv_ruleAddExpression= ruleAddExpression EOF
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
    // InternalSct.g:4213:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4216:28: ( (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? ) )
            // InternalSct.g:4217:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? )
            {
            // InternalSct.g:4217:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? )
            // InternalSct.g:4218:2: this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_94);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:4229:1: ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==87) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalSct.g:4229:2: () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+
                    {
                    // InternalSct.g:4229:2: ()
                    // InternalSct.g:4230:2: 
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

                    // InternalSct.g:4238:2: ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+
                    int cnt118=0;
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==87) ) {
                            alt118=1;
                        }


                        switch (alt118) {
                    	case 1 :
                    	    // InternalSct.g:4238:3: ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    	    {
                    	    // InternalSct.g:4238:3: ( (lv_operator_2_0= ruleAddOperator ) )
                    	    // InternalSct.g:4239:1: (lv_operator_2_0= ruleAddOperator )
                    	    {
                    	    // InternalSct.g:4239:1: (lv_operator_2_0= ruleAddOperator )
                    	    // InternalSct.g:4240:3: lv_operator_2_0= ruleAddOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_95);
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

                    	    // InternalSct.g:4256:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    	    // InternalSct.g:4257:1: (lv_subExpressions_3_0= ruleSubExpression )
                    	    {
                    	    // InternalSct.g:4257:1: (lv_subExpressions_3_0= ruleSubExpression )
                    	    // InternalSct.g:4258:3: lv_subExpressions_3_0= ruleSubExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_94);
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
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleSubExpression"
    // InternalSct.g:4282:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // InternalSct.g:4283:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // InternalSct.g:4284:2: iv_ruleSubExpression= ruleSubExpression EOF
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
    // InternalSct.g:4291:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4294:28: ( (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? ) )
            // InternalSct.g:4295:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? )
            {
            // InternalSct.g:4295:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? )
            // InternalSct.g:4296:2: this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_96);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:4307:1: ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==64) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalSct.g:4307:2: () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+
                    {
                    // InternalSct.g:4307:2: ()
                    // InternalSct.g:4308:2: 
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

                    // InternalSct.g:4316:2: ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+
                    int cnt120=0;
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==64) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // InternalSct.g:4316:3: ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    	    {
                    	    // InternalSct.g:4316:3: ( (lv_operator_2_0= ruleSubOperator ) )
                    	    // InternalSct.g:4317:1: (lv_operator_2_0= ruleSubOperator )
                    	    {
                    	    // InternalSct.g:4317:1: (lv_operator_2_0= ruleSubOperator )
                    	    // InternalSct.g:4318:3: lv_operator_2_0= ruleSubOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_95);
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

                    	    // InternalSct.g:4334:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    	    // InternalSct.g:4335:1: (lv_subExpressions_3_0= ruleMultExpression )
                    	    {
                    	    // InternalSct.g:4335:1: (lv_subExpressions_3_0= ruleMultExpression )
                    	    // InternalSct.g:4336:3: lv_subExpressions_3_0= ruleMultExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_96);
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
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleMultExpression"
    // InternalSct.g:4360:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // InternalSct.g:4361:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // InternalSct.g:4362:2: iv_ruleMultExpression= ruleMultExpression EOF
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
    // InternalSct.g:4369:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4372:28: ( (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? ) )
            // InternalSct.g:4373:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? )
            {
            // InternalSct.g:4373:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? )
            // InternalSct.g:4374:2: this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_97);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:4385:1: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==88) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalSct.g:4385:2: () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+
                    {
                    // InternalSct.g:4385:2: ()
                    // InternalSct.g:4386:2: 
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

                    // InternalSct.g:4394:2: ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+
                    int cnt122=0;
                    loop122:
                    do {
                        int alt122=2;
                        int LA122_0 = input.LA(1);

                        if ( (LA122_0==88) ) {
                            alt122=1;
                        }


                        switch (alt122) {
                    	case 1 :
                    	    // InternalSct.g:4394:3: ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    	    {
                    	    // InternalSct.g:4394:3: ( (lv_operator_2_0= ruleMultOperator ) )
                    	    // InternalSct.g:4395:1: (lv_operator_2_0= ruleMultOperator )
                    	    {
                    	    // InternalSct.g:4395:1: (lv_operator_2_0= ruleMultOperator )
                    	    // InternalSct.g:4396:3: lv_operator_2_0= ruleMultOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_95);
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

                    	    // InternalSct.g:4412:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    	    // InternalSct.g:4413:1: (lv_subExpressions_3_0= ruleDivExpression )
                    	    {
                    	    // InternalSct.g:4413:1: (lv_subExpressions_3_0= ruleDivExpression )
                    	    // InternalSct.g:4414:3: lv_subExpressions_3_0= ruleDivExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_97);
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
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // InternalSct.g:4438:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // InternalSct.g:4439:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // InternalSct.g:4440:2: iv_ruleDivExpression= ruleDivExpression EOF
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
    // InternalSct.g:4447:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4450:28: ( (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? ) )
            // InternalSct.g:4451:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? )
            {
            // InternalSct.g:4451:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? )
            // InternalSct.g:4452:2: this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_98);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:4463:1: ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==17) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalSct.g:4463:2: () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+
                    {
                    // InternalSct.g:4463:2: ()
                    // InternalSct.g:4464:2: 
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

                    // InternalSct.g:4472:2: ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+
                    int cnt124=0;
                    loop124:
                    do {
                        int alt124=2;
                        int LA124_0 = input.LA(1);

                        if ( (LA124_0==17) ) {
                            alt124=1;
                        }


                        switch (alt124) {
                    	case 1 :
                    	    // InternalSct.g:4472:3: ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    	    {
                    	    // InternalSct.g:4472:3: ( (lv_operator_2_0= ruleDivOperator ) )
                    	    // InternalSct.g:4473:1: (lv_operator_2_0= ruleDivOperator )
                    	    {
                    	    // InternalSct.g:4473:1: (lv_operator_2_0= ruleDivOperator )
                    	    // InternalSct.g:4474:3: lv_operator_2_0= ruleDivOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_95);
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

                    	    // InternalSct.g:4490:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    	    // InternalSct.g:4491:1: (lv_subExpressions_3_0= ruleModExpression )
                    	    {
                    	    // InternalSct.g:4491:1: (lv_subExpressions_3_0= ruleModExpression )
                    	    // InternalSct.g:4492:3: lv_subExpressions_3_0= ruleModExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_98);
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
    // $ANTLR end "ruleDivExpression"


    // $ANTLR start "entryRuleModExpression"
    // InternalSct.g:4516:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // InternalSct.g:4517:2: (iv_ruleModExpression= ruleModExpression EOF )
            // InternalSct.g:4518:2: iv_ruleModExpression= ruleModExpression EOF
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
    // InternalSct.g:4525:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4528:28: ( (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? ) )
            // InternalSct.g:4529:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? )
            {
            // InternalSct.g:4529:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? )
            // InternalSct.g:4530:2: this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_99);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:4541:1: ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==89) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalSct.g:4541:2: () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+
                    {
                    // InternalSct.g:4541:2: ()
                    // InternalSct.g:4542:2: 
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

                    // InternalSct.g:4550:2: ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+
                    int cnt126=0;
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==89) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // InternalSct.g:4550:3: ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    	    {
                    	    // InternalSct.g:4550:3: ( (lv_operator_2_0= ruleModOperator ) )
                    	    // InternalSct.g:4551:1: (lv_operator_2_0= ruleModOperator )
                    	    {
                    	    // InternalSct.g:4551:1: (lv_operator_2_0= ruleModOperator )
                    	    // InternalSct.g:4552:3: lv_operator_2_0= ruleModOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_95);
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

                    	    // InternalSct.g:4568:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    	    // InternalSct.g:4569:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    	    {
                    	    // InternalSct.g:4569:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    	    // InternalSct.g:4570:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_99);
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
                    	    if ( cnt126 >= 1 ) break loop126;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(126, input);
                                throw eee;
                        }
                        cnt126++;
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
    // InternalSct.g:4594:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // InternalSct.g:4595:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // InternalSct.g:4596:2: iv_ruleNegExpression= ruleNegExpression EOF
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
    // InternalSct.g:4603:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4606:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // InternalSct.g:4607:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // InternalSct.g:4607:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==64) ) {
                alt128=1;
            }
            else if ( ((LA128_0>=RULE_ID && LA128_0<=RULE_BOOLEAN)||LA128_0==30||LA128_0==57||LA128_0==85||LA128_0==90) ) {
                alt128=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }
            switch (alt128) {
                case 1 :
                    // InternalSct.g:4607:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // InternalSct.g:4607:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // InternalSct.g:4607:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // InternalSct.g:4607:3: ()
                    // InternalSct.g:4608:2: 
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

                    // InternalSct.g:4616:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // InternalSct.g:4617:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // InternalSct.g:4617:1: (lv_operator_1_0= ruleSubOperator )
                    // InternalSct.g:4618:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_95);
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

                    // InternalSct.g:4634:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // InternalSct.g:4635:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // InternalSct.g:4635:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // InternalSct.g:4636:3: lv_subExpressions_2_0= ruleNegExpression
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
                    // InternalSct.g:4654:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
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
    // InternalSct.g:4673:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalSct.g:4674:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalSct.g:4675:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
    // InternalSct.g:4682:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) ;
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
            // InternalSct.g:4685:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) )
            // InternalSct.g:4686:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            {
            // InternalSct.g:4686:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            int alt129=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt129=1;
                }
                break;
            case RULE_ID:
            case 85:
            case 90:
                {
                alt129=2;
                }
                break;
            case 30:
                {
                alt129=3;
                }
                break;
            case 57:
                {
                alt129=4;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt129=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }

            switch (alt129) {
                case 1 :
                    // InternalSct.g:4687:2: this_BoolValue_0= ruleBoolValue
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
                    // InternalSct.g:4700:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
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
                    // InternalSct.g:4712:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // InternalSct.g:4712:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // InternalSct.g:4712:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
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
                    pushFollow(FollowSets000.FOLLOW_81);
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
                    // InternalSct.g:4734:2: this_FunctionCall_5= ruleFunctionCall
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
                    // InternalSct.g:4747:2: this_TextExpression_6= ruleTextExpression
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
    // InternalSct.g:4766:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // InternalSct.g:4767:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // InternalSct.g:4768:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
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
    // InternalSct.g:4775:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) ;
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
            // InternalSct.g:4778:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) )
            // InternalSct.g:4779:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            {
            // InternalSct.g:4779:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            int alt130=5;
            alt130 = dfa130.predict(input);
            switch (alt130) {
                case 1 :
                    // InternalSct.g:4780:2: this_IntValue_0= ruleIntValue
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
                    // InternalSct.g:4793:2: this_FloatValue_1= ruleFloatValue
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
                    // InternalSct.g:4806:2: this_StringValue_2= ruleStringValue
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
                    // InternalSct.g:4818:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    {
                    // InternalSct.g:4818:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    // InternalSct.g:4818:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_95); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_81);
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
                    // InternalSct.g:4840:2: this_AtomicExpression_6= ruleAtomicExpression
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
    // InternalSct.g:4859:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // InternalSct.g:4860:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // InternalSct.g:4861:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
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
    // InternalSct.g:4868:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
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
            // InternalSct.g:4871:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // InternalSct.g:4872:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // InternalSct.g:4872:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==85||LA132_0==90) ) {
                alt132=1;
            }
            else if ( (LA132_0==RULE_ID) ) {
                alt132=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }
            switch (alt132) {
                case 1 :
                    // InternalSct.g:4872:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // InternalSct.g:4872:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // InternalSct.g:4872:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // InternalSct.g:4872:3: ()
                    // InternalSct.g:4873:2: 
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

                    // InternalSct.g:4881:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // InternalSct.g:4882:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // InternalSct.g:4882:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // InternalSct.g:4883:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // InternalSct.g:4883:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt131=2;
                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==85) ) {
                        alt131=1;
                    }
                    else if ( (LA131_0==90) ) {
                        alt131=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 131, 0, input);

                        throw nvae;
                    }
                    switch (alt131) {
                        case 1 :
                            // InternalSct.g:4884:3: lv_operator_1_1= rulePreOperator
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
                            // InternalSct.g:4899:8: lv_operator_1_2= ruleValOperator
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
                    // InternalSct.g:4921:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // InternalSct.g:4922:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // InternalSct.g:4922:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // InternalSct.g:4923:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_81);
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
                    // InternalSct.g:4945:2: this_ValuedObjectReference_5= ruleValuedObjectReference
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
    // InternalSct.g:4964:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // InternalSct.g:4965:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // InternalSct.g:4966:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
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
    // InternalSct.g:4973:1: ruleValuedObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_indices_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4976:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) )
            // InternalSct.g:4977:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            {
            // InternalSct.g:4977:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            // InternalSct.g:4977:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            {
            // InternalSct.g:4977:2: ( (otherlv_0= RULE_ID ) )
            // InternalSct.g:4978:1: (otherlv_0= RULE_ID )
            {
            // InternalSct.g:4978:1: (otherlv_0= RULE_ID )
            // InternalSct.g:4979:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalSct.g:4993:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==40) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // InternalSct.g:4993:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // InternalSct.g:4997:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // InternalSct.g:4998:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // InternalSct.g:4998:1: (lv_indices_2_0= ruleExpression )
            	    // InternalSct.g:4999:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_60);
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

            	    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop133;
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
    // InternalSct.g:5027:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalSct.g:5028:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalSct.g:5029:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalSct.g:5036:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) ;
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
            // InternalSct.g:5039:28: ( (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) )
            // InternalSct.g:5040:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            {
            // InternalSct.g:5040:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            // InternalSct.g:5040:3: otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>'
            {
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0());
                  
            }
            // InternalSct.g:5044:1: ( (lv_functionName_1_0= ruleExtendedID ) )
            // InternalSct.g:5045:1: (lv_functionName_1_0= ruleExtendedID )
            {
            // InternalSct.g:5045:1: (lv_functionName_1_0= ruleExtendedID )
            // InternalSct.g:5046:3: lv_functionName_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_86);
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

            // InternalSct.g:5062:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )?
            int alt135=3;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==30) ) {
                alt135=1;
            }
            else if ( (LA135_0==58) ) {
                alt135=2;
            }
            switch (alt135) {
                case 1 :
                    // InternalSct.g:5062:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // InternalSct.g:5062:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // InternalSct.g:5062:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_87); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // InternalSct.g:5066:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalSct.g:5067:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalSct.g:5067:1: (lv_parameters_3_0= ruleParameter )
                    // InternalSct.g:5068:3: lv_parameters_3_0= ruleParameter
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

                    // InternalSct.g:5084:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==24) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // InternalSct.g:5084:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_87); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // InternalSct.g:5088:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalSct.g:5089:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalSct.g:5089:1: (lv_parameters_5_0= ruleParameter )
                    	    // InternalSct.g:5090:3: lv_parameters_5_0= ruleParameter
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
                    	    break loop134;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_88); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:5111:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,58,FollowSets000.FOLLOW_88); if (state.failed) return current;
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
    // InternalSct.g:5127:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalSct.g:5128:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalSct.g:5129:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalSct.g:5136:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_pureOutput_0_0=null;
        Token lv_callByReference_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:5139:28: ( ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalSct.g:5140:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalSct.g:5140:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalSct.g:5140:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalSct.g:5140:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==60) ) {
                int LA137_1 = input.LA(2);

                if ( (LA137_1==61) ) {
                    alt137=1;
                }
            }
            else if ( (LA137_0==61) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalSct.g:5140:3: ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) )
                    {
                    // InternalSct.g:5140:3: ( (lv_pureOutput_0_0= '!' ) )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==60) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // InternalSct.g:5141:1: (lv_pureOutput_0_0= '!' )
                            {
                            // InternalSct.g:5141:1: (lv_pureOutput_0_0= '!' )
                            // InternalSct.g:5142:3: lv_pureOutput_0_0= '!'
                            {
                            lv_pureOutput_0_0=(Token)match(input,60,FollowSets000.FOLLOW_100); if (state.failed) return current;
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

                    // InternalSct.g:5155:3: ( (lv_callByReference_1_0= '&' ) )
                    // InternalSct.g:5156:1: (lv_callByReference_1_0= '&' )
                    {
                    // InternalSct.g:5156:1: (lv_callByReference_1_0= '&' )
                    // InternalSct.g:5157:3: lv_callByReference_1_0= '&'
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

            // InternalSct.g:5170:4: ( (lv_expression_2_0= ruleExpression ) )
            // InternalSct.g:5171:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalSct.g:5171:1: (lv_expression_2_0= ruleExpression )
            // InternalSct.g:5172:3: lv_expression_2_0= ruleExpression
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
    // InternalSct.g:5196:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // InternalSct.g:5197:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalSct.g:5198:2: iv_ruleTextExpression= ruleTextExpression EOF
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
    // InternalSct.g:5205:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct.g:5208:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // InternalSct.g:5209:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // InternalSct.g:5209:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // InternalSct.g:5210:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // InternalSct.g:5210:1: (lv_text_0_0= RULE_HOSTCODE )
            // InternalSct.g:5211:3: lv_text_0_0= RULE_HOSTCODE
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
    // InternalSct.g:5235:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalSct.g:5236:2: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalSct.g:5237:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalSct.g:5244:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct.g:5247:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalSct.g:5248:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalSct.g:5248:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalSct.g:5249:1: (lv_value_0_0= RULE_INT )
            {
            // InternalSct.g:5249:1: (lv_value_0_0= RULE_INT )
            // InternalSct.g:5250:3: lv_value_0_0= RULE_INT
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
    // InternalSct.g:5274:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalSct.g:5275:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalSct.g:5276:2: iv_ruleFloatValue= ruleFloatValue EOF
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
    // InternalSct.g:5283:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct.g:5286:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalSct.g:5287:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalSct.g:5287:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalSct.g:5288:1: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalSct.g:5288:1: (lv_value_0_0= RULE_FLOAT )
            // InternalSct.g:5289:3: lv_value_0_0= RULE_FLOAT
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
    // InternalSct.g:5313:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // InternalSct.g:5314:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalSct.g:5315:2: iv_ruleBoolValue= ruleBoolValue EOF
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
    // InternalSct.g:5322:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct.g:5325:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalSct.g:5326:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalSct.g:5326:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalSct.g:5327:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalSct.g:5327:1: (lv_value_0_0= RULE_BOOLEAN )
            // InternalSct.g:5328:3: lv_value_0_0= RULE_BOOLEAN
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
    // InternalSct.g:5352:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalSct.g:5353:2: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalSct.g:5354:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalSct.g:5361:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct.g:5364:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalSct.g:5365:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalSct.g:5365:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSct.g:5366:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalSct.g:5366:1: (lv_value_0_0= RULE_STRING )
            // InternalSct.g:5367:3: lv_value_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleAnyValue"
    // InternalSct.g:5393:1: entryRuleAnyValue returns [EObject current=null] : iv_ruleAnyValue= ruleAnyValue EOF ;
    public final EObject entryRuleAnyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyValue = null;


        try {
            // InternalSct.g:5394:2: (iv_ruleAnyValue= ruleAnyValue EOF )
            // InternalSct.g:5395:2: iv_ruleAnyValue= ruleAnyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnyValue=ruleAnyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnyValue; 
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
    // $ANTLR end "entryRuleAnyValue"


    // $ANTLR start "ruleAnyValue"
    // InternalSct.g:5402:1: ruleAnyValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue ) ;
    public final EObject ruleAnyValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_BoolValue_2 = null;

        EObject this_StringValue_3 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:5405:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue ) )
            // InternalSct.g:5406:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue )
            {
            // InternalSct.g:5406:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue )
            int alt138=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt138=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt138=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt138=3;
                }
                break;
            case RULE_STRING:
                {
                alt138=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;
            }

            switch (alt138) {
                case 1 :
                    // InternalSct.g:5407:2: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnyValueAccess().getIntValueParserRuleCall_0()); 
                          
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
                    // InternalSct.g:5420:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnyValueAccess().getFloatValueParserRuleCall_1()); 
                          
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
                    // InternalSct.g:5433:2: this_BoolValue_2= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnyValueAccess().getBoolValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BoolValue_2=ruleBoolValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolValue_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalSct.g:5446:2: this_StringValue_3= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnyValueAccess().getStringValueParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringValue_3=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringValue_3; 
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
    // $ANTLR end "ruleAnyValue"


    // $ANTLR start "entryRuleAnnotation"
    // InternalSct.g:5465:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalSct.g:5466:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalSct.g:5467:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalSct.g:5474:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) ;
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
            // InternalSct.g:5477:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) )
            // InternalSct.g:5478:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            {
            // InternalSct.g:5478:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            int alt139=7;
            alt139 = dfa139.predict(input);
            switch (alt139) {
                case 1 :
                    // InternalSct.g:5479:2: this_CommentAnnotation_0= ruleCommentAnnotation
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
                    // InternalSct.g:5492:2: this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation
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
                    // InternalSct.g:5505:2: this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation
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
                    // InternalSct.g:5518:2: this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation
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
                    // InternalSct.g:5531:2: this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation
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
                    // InternalSct.g:5544:2: this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation
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
                    // InternalSct.g:5557:2: this_TagAnnotation_6= ruleTagAnnotation
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
    // InternalSct.g:5578:1: entryRuleRestrictedAnnotation returns [EObject current=null] : iv_ruleRestrictedAnnotation= ruleRestrictedAnnotation EOF ;
    public final EObject entryRuleRestrictedAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedAnnotation = null;


        try {
            // InternalSct.g:5579:2: (iv_ruleRestrictedAnnotation= ruleRestrictedAnnotation EOF )
            // InternalSct.g:5580:2: iv_ruleRestrictedAnnotation= ruleRestrictedAnnotation EOF
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
    // InternalSct.g:5587:1: ruleRestrictedAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) ;
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
            // InternalSct.g:5590:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) )
            // InternalSct.g:5591:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            {
            // InternalSct.g:5591:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            int alt140=7;
            alt140 = dfa140.predict(input);
            switch (alt140) {
                case 1 :
                    // InternalSct.g:5592:2: this_CommentAnnotation_0= ruleCommentAnnotation
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
                    // InternalSct.g:5605:2: this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation
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
                    // InternalSct.g:5618:2: this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation
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
                    // InternalSct.g:5631:2: this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation
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
                    // InternalSct.g:5644:2: this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation
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
                    // InternalSct.g:5657:2: this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation
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
                    // InternalSct.g:5670:2: this_TagAnnotation_6= ruleTagAnnotation
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
    // InternalSct.g:5689:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // InternalSct.g:5690:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // InternalSct.g:5691:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
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
    // InternalSct.g:5698:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct.g:5701:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // InternalSct.g:5702:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // InternalSct.g:5702:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // InternalSct.g:5703:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // InternalSct.g:5703:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // InternalSct.g:5704:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
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
    // InternalSct.g:5728:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // InternalSct.g:5729:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // InternalSct.g:5730:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
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
    // InternalSct.g:5737:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:5740:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalSct.g:5741:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalSct.g:5741:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalSct.g:5741:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:5745:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:5746:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:5746:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:5747:3: lv_name_1_0= ruleExtendedID
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
    // InternalSct.g:5771:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // InternalSct.g:5772:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // InternalSct.g:5773:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
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
    // InternalSct.g:5780:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:5783:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* ) )
            // InternalSct.g:5784:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )
            {
            // InternalSct.g:5784:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )
            // InternalSct.g:5784:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:5788:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:5789:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:5789:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:5790:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_101);
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

            // InternalSct.g:5806:2: ( (lv_values_2_0= ruleEString ) )
            // InternalSct.g:5807:1: (lv_values_2_0= ruleEString )
            {
            // InternalSct.g:5807:1: (lv_values_2_0= ruleEString )
            // InternalSct.g:5808:3: lv_values_2_0= ruleEString
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

            // InternalSct.g:5824:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==24) ) {
                    alt141=1;
                }


                switch (alt141) {
            	case 1 :
            	    // InternalSct.g:5824:4: otherlv_3= ',' ( (lv_values_4_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_101); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalSct.g:5828:1: ( (lv_values_4_0= ruleEString ) )
            	    // InternalSct.g:5829:1: (lv_values_4_0= ruleEString )
            	    {
            	    // InternalSct.g:5829:1: (lv_values_4_0= ruleEString )
            	    // InternalSct.g:5830:3: lv_values_4_0= ruleEString
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
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // InternalSct.g:5854:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // InternalSct.g:5855:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // InternalSct.g:5856:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
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
    // InternalSct.g:5863:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) ;
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
            // InternalSct.g:5866:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) )
            // InternalSct.g:5867:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            {
            // InternalSct.g:5867:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            // InternalSct.g:5867:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:5871:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:5872:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:5872:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:5873:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_102);
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

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalSct.g:5893:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalSct.g:5894:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalSct.g:5894:1: (lv_type_3_0= ruleExtendedID )
            // InternalSct.g:5895:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_60);
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

            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalSct.g:5915:1: ( (lv_values_5_0= ruleEStringBoolean ) )
            // InternalSct.g:5916:1: (lv_values_5_0= ruleEStringBoolean )
            {
            // InternalSct.g:5916:1: (lv_values_5_0= ruleEStringBoolean )
            // InternalSct.g:5917:3: lv_values_5_0= ruleEStringBoolean
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

            // InternalSct.g:5933:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==24) ) {
                    alt142=1;
                }


                switch (alt142) {
            	case 1 :
            	    // InternalSct.g:5933:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_103); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalSct.g:5937:1: ( (lv_values_7_0= ruleEStringBoolean ) )
            	    // InternalSct.g:5938:1: (lv_values_7_0= ruleEStringBoolean )
            	    {
            	    // InternalSct.g:5938:1: (lv_values_7_0= ruleEStringBoolean )
            	    // InternalSct.g:5939:3: lv_values_7_0= ruleEStringBoolean
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
            	    break loop142;
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
    // InternalSct.g:5963:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            // InternalSct.g:5964:2: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // InternalSct.g:5965:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalSct.g:5972:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:5975:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // InternalSct.g:5976:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // InternalSct.g:5976:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // InternalSct.g:5976:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:5980:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:5981:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:5981:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:5982:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_104);
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

            // InternalSct.g:5998:2: ( (lv_values_2_0= RULE_STRING ) )
            // InternalSct.g:5999:1: (lv_values_2_0= RULE_STRING )
            {
            // InternalSct.g:5999:1: (lv_values_2_0= RULE_STRING )
            // InternalSct.g:6000:3: lv_values_2_0= RULE_STRING
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

            // InternalSct.g:6016:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop143:
            do {
                int alt143=2;
                int LA143_0 = input.LA(1);

                if ( (LA143_0==24) ) {
                    alt143=1;
                }


                switch (alt143) {
            	case 1 :
            	    // InternalSct.g:6016:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_104); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalSct.g:6020:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalSct.g:6021:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalSct.g:6021:1: (lv_values_4_0= RULE_STRING )
            	    // InternalSct.g:6022:3: lv_values_4_0= RULE_STRING
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
            	    break loop143;
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
    // InternalSct.g:6046:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            // InternalSct.g:6047:2: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalSct.g:6048:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalSct.g:6055:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
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
            // InternalSct.g:6058:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // InternalSct.g:6059:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // InternalSct.g:6059:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // InternalSct.g:6059:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:6063:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:6064:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:6064:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:6065:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_102);
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

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalSct.g:6085:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalSct.g:6086:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalSct.g:6086:1: (lv_type_3_0= ruleExtendedID )
            // InternalSct.g:6087:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_60);
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

            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalSct.g:6107:1: ( (lv_values_5_0= RULE_STRING ) )
            // InternalSct.g:6108:1: (lv_values_5_0= RULE_STRING )
            {
            // InternalSct.g:6108:1: (lv_values_5_0= RULE_STRING )
            // InternalSct.g:6109:3: lv_values_5_0= RULE_STRING
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

            // InternalSct.g:6125:2: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==24) ) {
                    alt144=1;
                }


                switch (alt144) {
            	case 1 :
            	    // InternalSct.g:6125:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_104); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalSct.g:6129:1: ( (lv_values_7_0= RULE_STRING ) )
            	    // InternalSct.g:6130:1: (lv_values_7_0= RULE_STRING )
            	    {
            	    // InternalSct.g:6130:1: (lv_values_7_0= RULE_STRING )
            	    // InternalSct.g:6131:3: lv_values_7_0= RULE_STRING
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
            	    break loop144;
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
    // InternalSct.g:6155:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            // InternalSct.g:6156:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // InternalSct.g:6157:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
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
    // InternalSct.g:6164:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:6167:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) )
            // InternalSct.g:6168:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            {
            // InternalSct.g:6168:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            // InternalSct.g:6168:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:6172:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:6173:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:6173:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:6174:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_105);
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

            // InternalSct.g:6190:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // InternalSct.g:6191:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // InternalSct.g:6191:1: (lv_value_2_0= RULE_BOOLEAN )
            // InternalSct.g:6192:3: lv_value_2_0= RULE_BOOLEAN
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
    // InternalSct.g:6216:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            // InternalSct.g:6217:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // InternalSct.g:6218:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
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
    // InternalSct.g:6225:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:6228:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) )
            // InternalSct.g:6229:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            {
            // InternalSct.g:6229:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            // InternalSct.g:6229:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) )
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:6233:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:6234:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:6234:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:6235:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_106);
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

            // InternalSct.g:6251:2: ( (lv_value_2_0= ruleInteger ) )
            // InternalSct.g:6252:1: (lv_value_2_0= ruleInteger )
            {
            // InternalSct.g:6252:1: (lv_value_2_0= ruleInteger )
            // InternalSct.g:6253:3: lv_value_2_0= ruleInteger
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
    // InternalSct.g:6277:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            // InternalSct.g:6278:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // InternalSct.g:6279:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
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
    // InternalSct.g:6286:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) ;
    public final EObject ruleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:6289:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) )
            // InternalSct.g:6290:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            {
            // InternalSct.g:6290:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            // InternalSct.g:6290:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) )
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:6294:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:6295:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:6295:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:6296:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_107);
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

            // InternalSct.g:6312:2: ( (lv_value_2_0= ruleFloateger ) )
            // InternalSct.g:6313:1: (lv_value_2_0= ruleFloateger )
            {
            // InternalSct.g:6313:1: (lv_value_2_0= ruleFloateger )
            // InternalSct.g:6314:3: lv_value_2_0= ruleFloateger
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
    // InternalSct.g:6338:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSct.g:6339:2: (iv_ruleEString= ruleEString EOF )
            // InternalSct.g:6340:2: iv_ruleEString= ruleEString EOF
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
    // InternalSct.g:6347:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:6350:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) )
            // InternalSct.g:6351:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            {
            // InternalSct.g:6351:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==RULE_STRING) ) {
                alt145=1;
            }
            else if ( (LA145_0==RULE_ID) ) {
                alt145=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;
            }
            switch (alt145) {
                case 1 :
                    // InternalSct.g:6351:6: this_STRING_0= RULE_STRING
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
                    // InternalSct.g:6360:5: this_ExtendedID_1= ruleExtendedID
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
    // InternalSct.g:6378:1: entryRuleEStringBoolean returns [String current=null] : iv_ruleEStringBoolean= ruleEStringBoolean EOF ;
    public final String entryRuleEStringBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringBoolean = null;


        try {
            // InternalSct.g:6379:2: (iv_ruleEStringBoolean= ruleEStringBoolean EOF )
            // InternalSct.g:6380:2: iv_ruleEStringBoolean= ruleEStringBoolean EOF
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
    // InternalSct.g:6387:1: ruleEStringBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleEStringBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:6390:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) )
            // InternalSct.g:6391:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            {
            // InternalSct.g:6391:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            int alt146=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt146=1;
                }
                break;
            case RULE_ID:
                {
                alt146=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt146=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;
            }

            switch (alt146) {
                case 1 :
                    // InternalSct.g:6391:6: this_STRING_0= RULE_STRING
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
                    // InternalSct.g:6400:5: this_ExtendedID_1= ruleExtendedID
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
                    // InternalSct.g:6411:10: this_BOOLEAN_2= RULE_BOOLEAN
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
    // InternalSct.g:6426:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // InternalSct.g:6427:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // InternalSct.g:6428:2: iv_ruleExtendedID= ruleExtendedID EOF
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
    // InternalSct.g:6435:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // InternalSct.g:6438:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) )
            // InternalSct.g:6439:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            {
            // InternalSct.g:6439:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            // InternalSct.g:6439:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalSct.g:6446:1: (kw= '.' this_ID_2= RULE_ID )*
            loop147:
            do {
                int alt147=2;
                int LA147_0 = input.LA(1);

                if ( (LA147_0==20) ) {
                    alt147=1;
                }


                switch (alt147) {
            	case 1 :
            	    // InternalSct.g:6447:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_108); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop147;
                }
            } while (true);

            // InternalSct.g:6459:3: (kw= '#' this_INT_4= RULE_INT )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==63) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalSct.g:6460:2: kw= '#' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,63,FollowSets000.FOLLOW_109); if (state.failed) return current;
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
    // InternalSct.g:6480:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalSct.g:6481:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalSct.g:6482:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalSct.g:6489:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalSct.g:6492:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSct.g:6493:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSct.g:6493:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSct.g:6493:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSct.g:6493:2: (kw= '-' )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==64) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalSct.g:6494:2: kw= '-'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_109); if (state.failed) return current;
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
    // InternalSct.g:6514:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // InternalSct.g:6515:2: (iv_ruleFloateger= ruleFloateger EOF )
            // InternalSct.g:6516:2: iv_ruleFloateger= ruleFloateger EOF
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
    // InternalSct.g:6523:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            // InternalSct.g:6526:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // InternalSct.g:6527:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // InternalSct.g:6527:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // InternalSct.g:6527:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // InternalSct.g:6527:2: (kw= '-' )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==64) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalSct.g:6528:2: kw= '-'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_110); if (state.failed) return current;
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
    // InternalSct.g:6548:1: ruleStateType returns [Enumerator current=null] : ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalSct.g:6550:28: ( ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) ) )
            // InternalSct.g:6551:1: ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) )
            {
            // InternalSct.g:6551:1: ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) )
            int alt151=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt151=1;
                }
                break;
            case 66:
                {
                alt151=2;
                }
                break;
            case 67:
                {
                alt151=3;
                }
                break;
            case 68:
                {
                alt151=4;
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
                    // InternalSct.g:6551:2: (enumLiteral_0= 'normal' )
                    {
                    // InternalSct.g:6551:2: (enumLiteral_0= 'normal' )
                    // InternalSct.g:6551:4: enumLiteral_0= 'normal'
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
                    // InternalSct.g:6557:6: (enumLiteral_1= 'connector' )
                    {
                    // InternalSct.g:6557:6: (enumLiteral_1= 'connector' )
                    // InternalSct.g:6557:8: enumLiteral_1= 'connector'
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
                    // InternalSct.g:6563:6: (enumLiteral_2= 'reference' )
                    {
                    // InternalSct.g:6563:6: (enumLiteral_2= 'reference' )
                    // InternalSct.g:6563:8: enumLiteral_2= 'reference'
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
                    // InternalSct.g:6569:6: (enumLiteral_3= 'textual' )
                    {
                    // InternalSct.g:6569:6: (enumLiteral_3= 'textual' )
                    // InternalSct.g:6569:8: enumLiteral_3= 'textual'
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
    // InternalSct.g:6579:1: ruleTransitionType returns [Enumerator current=null] : ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) ) ;
    public final Enumerator ruleTransitionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSct.g:6581:28: ( ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) ) )
            // InternalSct.g:6582:1: ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) )
            {
            // InternalSct.g:6582:1: ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) )
            int alt152=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt152=1;
                }
                break;
            case 70:
                {
                alt152=2;
                }
                break;
            case 71:
                {
                alt152=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 152, 0, input);

                throw nvae;
            }

            switch (alt152) {
                case 1 :
                    // InternalSct.g:6582:2: (enumLiteral_0= '-->' )
                    {
                    // InternalSct.g:6582:2: (enumLiteral_0= '-->' )
                    // InternalSct.g:6582:4: enumLiteral_0= '-->'
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
                    // InternalSct.g:6588:6: (enumLiteral_1= 'o->' )
                    {
                    // InternalSct.g:6588:6: (enumLiteral_1= 'o->' )
                    // InternalSct.g:6588:8: enumLiteral_1= 'o->'
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
                    // InternalSct.g:6594:6: (enumLiteral_2= '>->' )
                    {
                    // InternalSct.g:6594:6: (enumLiteral_2= '>->' )
                    // InternalSct.g:6594:8: enumLiteral_2= '>->'
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
    // InternalSct.g:6604:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= ':' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6606:28: ( (enumLiteral_0= ':' ) )
            // InternalSct.g:6607:1: (enumLiteral_0= ':' )
            {
            // InternalSct.g:6607:1: (enumLiteral_0= ':' )
            // InternalSct.g:6607:3: enumLiteral_0= ':'
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
    // InternalSct.g:6617:1: ruleHistoryType returns [Enumerator current=null] : ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) ) ;
    public final Enumerator ruleHistoryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSct.g:6619:28: ( ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) ) )
            // InternalSct.g:6620:1: ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) )
            {
            // InternalSct.g:6620:1: ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) )
            int alt153=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt153=1;
                }
                break;
            case 73:
                {
                alt153=2;
                }
                break;
            case 74:
                {
                alt153=3;
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
                    // InternalSct.g:6620:2: (enumLiteral_0= 'reset' )
                    {
                    // InternalSct.g:6620:2: (enumLiteral_0= 'reset' )
                    // InternalSct.g:6620:4: enumLiteral_0= 'reset'
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
                    // InternalSct.g:6626:6: (enumLiteral_1= 'shallow history' )
                    {
                    // InternalSct.g:6626:6: (enumLiteral_1= 'shallow history' )
                    // InternalSct.g:6626:8: enumLiteral_1= 'shallow history'
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
                    // InternalSct.g:6632:6: (enumLiteral_2= 'history' )
                    {
                    // InternalSct.g:6632:6: (enumLiteral_2= 'history' )
                    // InternalSct.g:6632:8: enumLiteral_2= 'history'
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
    // InternalSct.g:6642:1: ruleAssignOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) ) ;
    public final Enumerator ruleAssignOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // InternalSct.g:6644:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) ) )
            // InternalSct.g:6645:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) )
            {
            // InternalSct.g:6645:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) )
            int alt154=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt154=1;
                }
                break;
            case 75:
                {
                alt154=2;
                }
                break;
            case 76:
                {
                alt154=3;
                }
                break;
            case 77:
                {
                alt154=4;
                }
                break;
            case 78:
                {
                alt154=5;
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
                    // InternalSct.g:6645:2: (enumLiteral_0= '=' )
                    {
                    // InternalSct.g:6645:2: (enumLiteral_0= '=' )
                    // InternalSct.g:6645:4: enumLiteral_0= '='
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
                    // InternalSct.g:6651:6: (enumLiteral_1= '+=' )
                    {
                    // InternalSct.g:6651:6: (enumLiteral_1= '+=' )
                    // InternalSct.g:6651:8: enumLiteral_1= '+='
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
                    // InternalSct.g:6657:6: (enumLiteral_2= '-=' )
                    {
                    // InternalSct.g:6657:6: (enumLiteral_2= '-=' )
                    // InternalSct.g:6657:8: enumLiteral_2= '-='
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
                    // InternalSct.g:6663:6: (enumLiteral_3= '*=' )
                    {
                    // InternalSct.g:6663:6: (enumLiteral_3= '*=' )
                    // InternalSct.g:6663:8: enumLiteral_3= '*='
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
                    // InternalSct.g:6669:6: (enumLiteral_4= '/=' )
                    {
                    // InternalSct.g:6669:6: (enumLiteral_4= '/=' )
                    // InternalSct.g:6669:8: enumLiteral_4= '/='
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
    // InternalSct.g:6679:1: rulePostfixOperator returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator rulePostfixOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalSct.g:6681:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalSct.g:6682:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalSct.g:6682:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==79) ) {
                alt155=1;
            }
            else if ( (LA155_0==80) ) {
                alt155=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 155, 0, input);

                throw nvae;
            }
            switch (alt155) {
                case 1 :
                    // InternalSct.g:6682:2: (enumLiteral_0= '++' )
                    {
                    // InternalSct.g:6682:2: (enumLiteral_0= '++' )
                    // InternalSct.g:6682:4: enumLiteral_0= '++'
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
                    // InternalSct.g:6688:6: (enumLiteral_1= '--' )
                    {
                    // InternalSct.g:6688:6: (enumLiteral_1= '--' )
                    // InternalSct.g:6688:8: enumLiteral_1= '--'
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
    // InternalSct.g:6698:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
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
            // InternalSct.g:6700:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalSct.g:6701:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalSct.g:6701:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt156=6;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt156=1;
                }
                break;
            case 57:
                {
                alt156=2;
                }
                break;
            case 82:
                {
                alt156=3;
                }
                break;
            case 59:
                {
                alt156=4;
                }
                break;
            case 83:
                {
                alt156=5;
                }
                break;
            case 84:
                {
                alt156=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 156, 0, input);

                throw nvae;
            }

            switch (alt156) {
                case 1 :
                    // InternalSct.g:6701:2: (enumLiteral_0= '==' )
                    {
                    // InternalSct.g:6701:2: (enumLiteral_0= '==' )
                    // InternalSct.g:6701:4: enumLiteral_0= '=='
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
                    // InternalSct.g:6707:6: (enumLiteral_1= '<' )
                    {
                    // InternalSct.g:6707:6: (enumLiteral_1= '<' )
                    // InternalSct.g:6707:8: enumLiteral_1= '<'
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
                    // InternalSct.g:6713:6: (enumLiteral_2= '<=' )
                    {
                    // InternalSct.g:6713:6: (enumLiteral_2= '<=' )
                    // InternalSct.g:6713:8: enumLiteral_2= '<='
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
                    // InternalSct.g:6719:6: (enumLiteral_3= '>' )
                    {
                    // InternalSct.g:6719:6: (enumLiteral_3= '>' )
                    // InternalSct.g:6719:8: enumLiteral_3= '>'
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
                    // InternalSct.g:6725:6: (enumLiteral_4= '>=' )
                    {
                    // InternalSct.g:6725:6: (enumLiteral_4= '>=' )
                    // InternalSct.g:6725:8: enumLiteral_4= '>='
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
                    // InternalSct.g:6731:6: (enumLiteral_5= '!=' )
                    {
                    // InternalSct.g:6731:6: (enumLiteral_5= '!=' )
                    // InternalSct.g:6731:8: enumLiteral_5= '!='
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
    // InternalSct.g:6741:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6743:28: ( (enumLiteral_0= 'pre' ) )
            // InternalSct.g:6744:1: (enumLiteral_0= 'pre' )
            {
            // InternalSct.g:6744:1: (enumLiteral_0= 'pre' )
            // InternalSct.g:6744:3: enumLiteral_0= 'pre'
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
    // InternalSct.g:6754:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6756:28: ( (enumLiteral_0= '|' ) )
            // InternalSct.g:6757:1: (enumLiteral_0= '|' )
            {
            // InternalSct.g:6757:1: (enumLiteral_0= '|' )
            // InternalSct.g:6757:3: enumLiteral_0= '|'
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
    // InternalSct.g:6767:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6769:28: ( (enumLiteral_0= '&' ) )
            // InternalSct.g:6770:1: (enumLiteral_0= '&' )
            {
            // InternalSct.g:6770:1: (enumLiteral_0= '&' )
            // InternalSct.g:6770:3: enumLiteral_0= '&'
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
    // InternalSct.g:6780:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6782:28: ( (enumLiteral_0= '!' ) )
            // InternalSct.g:6783:1: (enumLiteral_0= '!' )
            {
            // InternalSct.g:6783:1: (enumLiteral_0= '!' )
            // InternalSct.g:6783:3: enumLiteral_0= '!'
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
    // InternalSct.g:6793:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6795:28: ( (enumLiteral_0= '+' ) )
            // InternalSct.g:6796:1: (enumLiteral_0= '+' )
            {
            // InternalSct.g:6796:1: (enumLiteral_0= '+' )
            // InternalSct.g:6796:3: enumLiteral_0= '+'
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
    // InternalSct.g:6806:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6808:28: ( (enumLiteral_0= '-' ) )
            // InternalSct.g:6809:1: (enumLiteral_0= '-' )
            {
            // InternalSct.g:6809:1: (enumLiteral_0= '-' )
            // InternalSct.g:6809:3: enumLiteral_0= '-'
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
    // InternalSct.g:6819:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6821:28: ( (enumLiteral_0= '*' ) )
            // InternalSct.g:6822:1: (enumLiteral_0= '*' )
            {
            // InternalSct.g:6822:1: (enumLiteral_0= '*' )
            // InternalSct.g:6822:3: enumLiteral_0= '*'
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
    // InternalSct.g:6832:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6834:28: ( (enumLiteral_0= '%' ) )
            // InternalSct.g:6835:1: (enumLiteral_0= '%' )
            {
            // InternalSct.g:6835:1: (enumLiteral_0= '%' )
            // InternalSct.g:6835:3: enumLiteral_0= '%'
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
    // InternalSct.g:6845:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6847:28: ( (enumLiteral_0= 'val' ) )
            // InternalSct.g:6848:1: (enumLiteral_0= 'val' )
            {
            // InternalSct.g:6848:1: (enumLiteral_0= 'val' )
            // InternalSct.g:6848:3: enumLiteral_0= 'val'
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
    // InternalSct.g:6858:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6860:28: ( (enumLiteral_0= '||' ) )
            // InternalSct.g:6861:1: (enumLiteral_0= '||' )
            {
            // InternalSct.g:6861:1: (enumLiteral_0= '||' )
            // InternalSct.g:6861:3: enumLiteral_0= '||'
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
    // InternalSct.g:6871:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6873:28: ( (enumLiteral_0= '&&' ) )
            // InternalSct.g:6874:1: (enumLiteral_0= '&&' )
            {
            // InternalSct.g:6874:1: (enumLiteral_0= '&&' )
            // InternalSct.g:6874:3: enumLiteral_0= '&&'
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
    // InternalSct.g:6888:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) ;
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
            // InternalSct.g:6890:28: ( ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) )
            // InternalSct.g:6891:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            {
            // InternalSct.g:6891:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            int alt157=7;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt157=1;
                }
                break;
            case 94:
                {
                alt157=2;
                }
                break;
            case 95:
                {
                alt157=3;
                }
                break;
            case 96:
                {
                alt157=4;
                }
                break;
            case 97:
                {
                alt157=5;
                }
                break;
            case 98:
                {
                alt157=6;
                }
                break;
            case 99:
                {
                alt157=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 157, 0, input);

                throw nvae;
            }

            switch (alt157) {
                case 1 :
                    // InternalSct.g:6891:2: (enumLiteral_0= 'pure' )
                    {
                    // InternalSct.g:6891:2: (enumLiteral_0= 'pure' )
                    // InternalSct.g:6891:4: enumLiteral_0= 'pure'
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
                    // InternalSct.g:6897:6: (enumLiteral_1= 'bool' )
                    {
                    // InternalSct.g:6897:6: (enumLiteral_1= 'bool' )
                    // InternalSct.g:6897:8: enumLiteral_1= 'bool'
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
                    // InternalSct.g:6903:6: (enumLiteral_2= 'unsigned' )
                    {
                    // InternalSct.g:6903:6: (enumLiteral_2= 'unsigned' )
                    // InternalSct.g:6903:8: enumLiteral_2= 'unsigned'
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
                    // InternalSct.g:6909:6: (enumLiteral_3= 'int' )
                    {
                    // InternalSct.g:6909:6: (enumLiteral_3= 'int' )
                    // InternalSct.g:6909:8: enumLiteral_3= 'int'
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
                    // InternalSct.g:6915:6: (enumLiteral_4= 'float' )
                    {
                    // InternalSct.g:6915:6: (enumLiteral_4= 'float' )
                    // InternalSct.g:6915:8: enumLiteral_4= 'float'
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
                    // InternalSct.g:6921:6: (enumLiteral_5= 'string' )
                    {
                    // InternalSct.g:6921:6: (enumLiteral_5= 'string' )
                    // InternalSct.g:6921:8: enumLiteral_5= 'string'
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
                    // InternalSct.g:6927:6: (enumLiteral_6= 'host' )
                    {
                    // InternalSct.g:6927:6: (enumLiteral_6= 'host' )
                    // InternalSct.g:6927:8: enumLiteral_6= 'host'
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
    // InternalSct.g:6939:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) ;
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
            // InternalSct.g:6941:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) )
            // InternalSct.g:6942:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            {
            // InternalSct.g:6942:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            int alt158=8;
            switch ( input.LA(1) ) {
            case 100:
                {
                alt158=1;
                }
                break;
            case 87:
                {
                alt158=2;
                }
                break;
            case 88:
                {
                alt158=3;
                }
                break;
            case 101:
                {
                alt158=4;
                }
                break;
            case 102:
                {
                alt158=5;
                }
                break;
            case 86:
                {
                alt158=6;
                }
                break;
            case 61:
                {
                alt158=7;
                }
                break;
            case 99:
                {
                alt158=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 158, 0, input);

                throw nvae;
            }

            switch (alt158) {
                case 1 :
                    // InternalSct.g:6942:2: (enumLiteral_0= 'none' )
                    {
                    // InternalSct.g:6942:2: (enumLiteral_0= 'none' )
                    // InternalSct.g:6942:4: enumLiteral_0= 'none'
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
                    // InternalSct.g:6948:6: (enumLiteral_1= '+' )
                    {
                    // InternalSct.g:6948:6: (enumLiteral_1= '+' )
                    // InternalSct.g:6948:8: enumLiteral_1= '+'
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
                    // InternalSct.g:6954:6: (enumLiteral_2= '*' )
                    {
                    // InternalSct.g:6954:6: (enumLiteral_2= '*' )
                    // InternalSct.g:6954:8: enumLiteral_2= '*'
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
                    // InternalSct.g:6960:6: (enumLiteral_3= 'max' )
                    {
                    // InternalSct.g:6960:6: (enumLiteral_3= 'max' )
                    // InternalSct.g:6960:8: enumLiteral_3= 'max'
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
                    // InternalSct.g:6966:6: (enumLiteral_4= 'min' )
                    {
                    // InternalSct.g:6966:6: (enumLiteral_4= 'min' )
                    // InternalSct.g:6966:8: enumLiteral_4= 'min'
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
                    // InternalSct.g:6972:6: (enumLiteral_5= '|' )
                    {
                    // InternalSct.g:6972:6: (enumLiteral_5= '|' )
                    // InternalSct.g:6972:8: enumLiteral_5= '|'
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
                    // InternalSct.g:6978:6: (enumLiteral_6= '&' )
                    {
                    // InternalSct.g:6978:6: (enumLiteral_6= '&' )
                    // InternalSct.g:6978:8: enumLiteral_6= '&'
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
                    // InternalSct.g:6984:6: (enumLiteral_7= 'host' )
                    {
                    // InternalSct.g:6984:6: (enumLiteral_7= 'host' )
                    // InternalSct.g:6984:8: enumLiteral_7= 'host'
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
        int alt162=2;
        alt162 = dfa162.predict(input);
        switch (alt162) {
            case 1 :
                // InternalSct.g:665:1: (lv_regions_13_0= ruleSingleControlflowRegion )
                {
                // InternalSct.g:665:1: (lv_regions_13_0= ruleSingleControlflowRegion )
                // InternalSct.g:666:3: lv_regions_13_0= ruleSingleControlflowRegion
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsSingleControlflowRegionParserRuleCall_4_1_2_0_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_111);
                lv_regions_13_0=ruleSingleControlflowRegion();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        // InternalSct.g:682:3: ( (lv_regions_14_0= ruleRegion ) )*
        loop163:
        do {
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==RULE_COMMENT_ANNOTATION||LA163_0==16||LA163_0==62) ) {
                alt163=1;
            }


            switch (alt163) {
        	case 1 :
        	    // InternalSct.g:683:1: (lv_regions_14_0= ruleRegion )
        	    {
        	    // InternalSct.g:683:1: (lv_regions_14_0= ruleRegion )
        	    // InternalSct.g:684:3: lv_regions_14_0= ruleRegion
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsRegionParserRuleCall_4_1_2_1_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_111);
        	    lv_regions_14_0=ruleRegion();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop163;
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
        loop178:
        do {
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==RULE_ID) ) {
                alt178=1;
            }


            switch (alt178) {
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

        	    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_112); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop178;
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

    // $ANTLR start synpred70_InternalSct
    public final void synpred70_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_effects_6_0 = null;


        // InternalSct.g:2118:4: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )
        // InternalSct.g:2118:4: otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) )
        {
        otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return ;
        // InternalSct.g:2122:1: ( (lv_effects_6_0= ruleEffect ) )
        // InternalSct.g:2123:1: (lv_effects_6_0= ruleEffect )
        {
        // InternalSct.g:2123:1: (lv_effects_6_0= ruleEffect )
        // InternalSct.g:2124:3: lv_effects_6_0= ruleEffect
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
    // $ANTLR end synpred70_InternalSct

    // $ANTLR start synpred75_InternalSct
    public final void synpred75_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        EObject lv_effects_7_0 = null;


        // InternalSct.g:2233:4: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )
        // InternalSct.g:2233:4: otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) )
        {
        otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return ;
        // InternalSct.g:2237:1: ( (lv_effects_7_0= ruleEffect ) )
        // InternalSct.g:2238:1: (lv_effects_7_0= ruleEffect )
        {
        // InternalSct.g:2238:1: (lv_effects_7_0= ruleEffect )
        // InternalSct.g:2239:3: lv_effects_7_0= ruleEffect
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
    // $ANTLR end synpred75_InternalSct

    // $ANTLR start synpred79_InternalSct
    public final void synpred79_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_effects_6_0 = null;


        // InternalSct.g:2333:4: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )
        // InternalSct.g:2333:4: otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) )
        {
        otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return ;
        // InternalSct.g:2337:1: ( (lv_effects_6_0= ruleEffect ) )
        // InternalSct.g:2338:1: (lv_effects_6_0= ruleEffect )
        {
        // InternalSct.g:2338:1: (lv_effects_6_0= ruleEffect )
        // InternalSct.g:2339:3: lv_effects_6_0= ruleEffect
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
    // $ANTLR end synpred79_InternalSct

    // $ANTLR start synpred88_InternalSct
    public final void synpred88_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        EObject lv_effects_7_0 = null;


        // InternalSct.g:2534:4: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )
        // InternalSct.g:2534:4: otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) )
        {
        otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return ;
        // InternalSct.g:2538:1: ( (lv_effects_7_0= ruleEffect ) )
        // InternalSct.g:2539:1: (lv_effects_7_0= ruleEffect )
        {
        // InternalSct.g:2539:1: (lv_effects_7_0= ruleEffect )
        // InternalSct.g:2540:3: lv_effects_7_0= ruleEffect
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
    // $ANTLR end synpred88_InternalSct

    // $ANTLR start synpred106_InternalSct
    public final void synpred106_InternalSct_fragment() throws RecognitionException {   
        EObject this_Assignment_0 = null;


        // InternalSct.g:3034:2: (this_Assignment_0= ruleAssignment )
        // InternalSct.g:3034:2: this_Assignment_0= ruleAssignment
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
    // $ANTLR end synpred106_InternalSct

    // $ANTLR start synpred107_InternalSct
    public final void synpred107_InternalSct_fragment() throws RecognitionException {   
        EObject this_PostfixEffect_1 = null;


        // InternalSct.g:3047:2: (this_PostfixEffect_1= rulePostfixEffect )
        // InternalSct.g:3047:2: this_PostfixEffect_1= rulePostfixEffect
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
    // $ANTLR end synpred107_InternalSct

    // $ANTLR start synpred108_InternalSct
    public final void synpred108_InternalSct_fragment() throws RecognitionException {   
        EObject this_Emission_2 = null;


        // InternalSct.g:3060:2: (this_Emission_2= ruleEmission )
        // InternalSct.g:3060:2: this_Emission_2= ruleEmission
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
    // $ANTLR end synpred108_InternalSct

    // $ANTLR start synpred109_InternalSct
    public final void synpred109_InternalSct_fragment() throws RecognitionException {   
        EObject this_HostcodeEffect_3 = null;


        // InternalSct.g:3073:2: (this_HostcodeEffect_3= ruleHostcodeEffect )
        // InternalSct.g:3073:2: this_HostcodeEffect_3= ruleHostcodeEffect
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
    // $ANTLR end synpred109_InternalSct

    // $ANTLR start synpred121_InternalSct
    public final void synpred121_InternalSct_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalSct.g:3591:2: (this_BoolExpression_0= ruleBoolExpression )
        // InternalSct.g:3591:2: this_BoolExpression_0= ruleBoolExpression
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
    // $ANTLR end synpred121_InternalSct

    // $ANTLR start synpred131_InternalSct
    public final void synpred131_InternalSct_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // InternalSct.g:4060:2: (this_ValuedExpression_0= ruleValuedExpression )
        // InternalSct.g:4060:2: this_ValuedExpression_0= ruleValuedExpression
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
    // $ANTLR end synpred131_InternalSct

    // $ANTLR start synpred151_InternalSct
    public final void synpred151_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ValuedExpression_4 = null;


        // InternalSct.g:4818:6: ( (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) )
        // InternalSct.g:4818:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        {
        // InternalSct.g:4818:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        // InternalSct.g:4818:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_95); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_81);
        this_ValuedExpression_4=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred151_InternalSct

    // Delegated rules

    public final boolean synpred70_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_InternalSct_fragment(); // can never throw exception
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
    public final boolean synpred109_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred109_InternalSct_fragment(); // can never throw exception
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
    public final boolean synpred108_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred108_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred121_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred121_InternalSct_fragment(); // can never throw exception
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
    public final boolean synpred131_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred131_InternalSct_fragment(); // can never throw exception
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
    public final boolean synpred75_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_InternalSct_fragment(); // can never throw exception
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
    public final boolean synpred151_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred151_InternalSct_fragment(); // can never throw exception
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
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA106 dfa106 = new DFA106(this);
    protected DFA116 dfa116 = new DFA116(this);
    protected DFA130 dfa130 = new DFA130(this);
    protected DFA139 dfa139 = new DFA139(this);
    protected DFA140 dfa140 = new DFA140(this);
    protected DFA162 dfa162 = new DFA162(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\13\uffff";
    static final String dfa_3s = "\1\4\1\uffff\11\0\1\uffff";
    static final String dfa_4s = "\1\104\1\uffff\11\0\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\11\uffff\1\1";
    static final String dfa_6s = "\2\uffff\1\6\1\10\1\0\1\2\1\4\1\1\1\7\1\5\1\3\1\uffff}>";
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
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_10 = input.LA(1);

                         
                        int index1_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_6 = input.LA(1);

                         
                        int index1_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index1_3);
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
    static final String dfa_9s = "\2\12\1\4\2\uffff\2\4\1\6\1\4\2\12\1\6\3\12\2\4\1\24\2\4\1\6\1\4\1\6\1\4\4\12\1\24\1\51\3\12\1\4\1\6\2\4\1\6\7\12\1\4\1\6\2\12";
    static final String dfa_10s = "\2\143\1\4\2\uffff\1\143\1\4\1\6\1\4\2\143\1\10\5\143\1\77\1\5\1\4\1\6\1\4\1\6\1\11\4\143\1\77\1\51\3\143\1\4\1\6\1\11\1\4\1\6\7\143\1\4\1\6\2\143";
    static final String dfa_11s = "\3\uffff\1\2\1\1\54\uffff";
    static final String dfa_12s = "\61\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\20\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\20\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\5",
            "",
            "",
            "\1\12\1\11\1\15\1\uffff\1\14\1\16\1\1\11\uffff\1\6\6\uffff\3\3\12\uffff\1\10\10\uffff\7\4\6\uffff\1\2\1\7\1\13\4\3\30\uffff\7\4",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\1\15\uffff\1\22\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\11\uffff\1\23\3\uffff\1\22\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\24\1\uffff\4\3\30\uffff\7\4",
            "\1\15\1\uffff\1\14",
            "\1\1\20\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\20\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\20\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\12\1\11\1\15\1\uffff\1\14\1\16\1\1\11\uffff\1\6\6\uffff\3\3\12\uffff\1\10\10\uffff\7\4\6\uffff\1\2\1\7\1\13\4\3\30\uffff\7\4",
            "\1\12\1\11\1\15\1\uffff\1\14\1\16\1\1\20\uffff\3\3\12\uffff\1\10\10\uffff\7\4\6\uffff\1\2\1\uffff\1\13\4\3\30\uffff\7\4",
            "\1\25\24\uffff\1\27\25\uffff\1\26",
            "\1\31\1\30",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\37\1\36\3\uffff\1\40",
            "\1\1\15\uffff\1\22\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\11\uffff\1\41\3\uffff\1\22\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\42\1\uffff\4\3\30\uffff\7\4",
            "\1\1\11\uffff\1\23\3\uffff\1\22\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\24\1\uffff\4\3\30\uffff\7\4",
            "\1\1\15\uffff\1\22\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\25\24\uffff\1\27\25\uffff\1\26",
            "\1\27",
            "\1\1\15\uffff\1\43\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\11\uffff\1\44\3\uffff\1\43\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\45\1\uffff\4\3\30\uffff\7\4",
            "\1\1\15\uffff\1\43\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\46",
            "\1\47",
            "\1\51\1\50\3\uffff\1\52",
            "\1\53",
            "\1\54",
            "\1\1\11\uffff\1\41\3\uffff\1\22\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\42\1\uffff\4\3\30\uffff\7\4",
            "\1\1\15\uffff\1\22\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\15\uffff\1\43\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\11\uffff\1\55\3\uffff\1\43\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\56\1\uffff\4\3\30\uffff\7\4",
            "\1\1\15\uffff\1\43\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\11\uffff\1\44\3\uffff\1\43\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\45\1\uffff\4\3\30\uffff\7\4",
            "\1\1\15\uffff\1\43\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\57",
            "\1\60",
            "\1\1\11\uffff\1\55\3\uffff\1\43\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\56\1\uffff\4\3\30\uffff\7\4",
            "\1\1\15\uffff\1\43\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4"
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
    static final String dfa_22s = "\2\12\1\4\3\uffff\2\4\1\6\1\12\1\4\2\12\1\6\2\12\2\4\1\24\2\4\1\6\1\4\1\6\1\4\4\12\1\24\1\51\3\12\1\4\1\6\2\4\1\6\7\12\1\4\1\6\2\12";
    static final String dfa_23s = "\2\143\1\4\3\uffff\1\143\1\4\1\6\1\143\1\4\2\143\1\10\4\143\1\77\1\5\1\4\1\6\1\4\1\6\1\11\4\143\1\77\1\51\3\143\1\4\1\6\1\11\1\4\1\6\7\143\1\4\1\6\2\143";
    static final String dfa_24s = "\3\uffff\1\3\1\1\1\2\54\uffff";
    static final String dfa_25s = "\62\uffff}>";
    static final String[] dfa_26s = {
            "\1\1\5\uffff\1\3\11\uffff\4\3\5\uffff\1\5\6\uffff\6\5\1\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\12\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\6",
            "",
            "",
            "",
            "\1\14\1\13\1\17\1\uffff\1\16\1\11\1\1\5\uffff\1\3\3\uffff\1\7\6\uffff\3\3\12\uffff\1\12\10\uffff\7\4\6\uffff\1\2\1\10\1\15\4\3\30\uffff\7\4",
            "\1\20",
            "\1\21",
            "\1\1\5\uffff\1\3\12\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\22",
            "\1\1\5\uffff\1\3\7\uffff\1\23\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\24\3\uffff\1\23\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\25\1\uffff\4\3\30\uffff\7\4",
            "\1\17\1\uffff\1\16",
            "\1\1\5\uffff\1\3\12\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\12\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\14\1\13\1\17\1\uffff\1\16\1\11\1\1\5\uffff\1\3\3\uffff\1\7\6\uffff\3\3\12\uffff\1\12\10\uffff\7\4\6\uffff\1\2\1\10\1\15\4\3\30\uffff\7\4",
            "\1\14\1\13\1\17\1\uffff\1\16\1\11\1\1\5\uffff\1\3\12\uffff\3\3\12\uffff\1\12\10\uffff\7\4\6\uffff\1\2\1\uffff\1\15\4\3\30\uffff\7\4",
            "\1\26\24\uffff\1\30\25\uffff\1\27",
            "\1\32\1\31",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\40\1\37\3\uffff\1\41",
            "\1\1\5\uffff\1\3\7\uffff\1\23\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\42\3\uffff\1\23\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\43\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\24\3\uffff\1\23\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\25\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\23\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\26\24\uffff\1\30\25\uffff\1\27",
            "\1\30",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\45\3\uffff\1\44\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\46\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\47",
            "\1\50",
            "\1\52\1\51\3\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\1\5\uffff\1\3\3\uffff\1\42\3\uffff\1\23\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\43\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\23\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\56\3\uffff\1\44\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\57\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\45\3\uffff\1\44\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\46\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\60",
            "\1\61",
            "\1\1\5\uffff\1\3\3\uffff\1\56\3\uffff\1\44\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\57\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4"
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
    static final String dfa_27s = "\2\104\1\4\2\uffff\1\104\1\4\1\6\1\4\2\104\1\10\5\104\1\77\1\5\1\4\1\6\1\4\1\6\1\11\4\104\1\77\1\51\3\104\1\4\1\6\1\11\1\4\1\6\7\104\1\4\1\6\2\104";
    static final String dfa_28s = "\3\uffff\1\1\1\2\54\uffff";
    static final String[] dfa_29s = {
            "\1\1\5\uffff\1\4\11\uffff\1\4\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\12\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\5",
            "",
            "",
            "\1\12\1\11\1\15\1\uffff\1\14\1\16\1\1\5\uffff\1\4\3\uffff\1\6\6\uffff\3\3\12\uffff\1\10\25\uffff\1\2\1\7\1\13\4\3",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\1\5\uffff\1\4\7\uffff\1\22\2\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\3\uffff\1\23\3\uffff\1\22\2\uffff\3\3\40\uffff\1\2\1\24\1\uffff\4\3",
            "\1\15\1\uffff\1\14",
            "\1\1\5\uffff\1\4\12\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\12\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\12\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\12\1\11\1\15\1\uffff\1\14\1\16\1\1\5\uffff\1\4\3\uffff\1\6\6\uffff\3\3\12\uffff\1\10\25\uffff\1\2\1\7\1\13\4\3",
            "\1\12\1\11\1\15\1\uffff\1\14\1\16\1\1\5\uffff\1\4\12\uffff\3\3\12\uffff\1\10\25\uffff\1\2\1\uffff\1\13\4\3",
            "\1\25\24\uffff\1\27\25\uffff\1\26",
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
            "\1\25\24\uffff\1\27\25\uffff\1\26",
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
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[][] dfa_29 = unpackEncodedStringArray(dfa_29s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_12;
            this.transition = dfa_29;
        }
        public String getDescription() {
            return "664:5: ( (lv_regions_13_0= ruleSingleControlflowRegion ) )?";
        }
    }
    static final String dfa_30s = "\1\4\1\12\1\4\3\uffff\2\4\1\6\1\12\1\6\1\12\1\4\3\12\2\4\1\24\2\4\1\6\1\4\1\6\1\4\4\12\1\24\1\51\3\12\1\4\1\6\2\4\1\6\7\12\1\4\1\6\2\12";
    static final String dfa_31s = "\2\143\1\4\3\uffff\1\143\1\4\1\6\1\143\1\10\1\143\1\4\5\143\1\77\1\5\1\4\1\6\1\4\1\6\1\11\4\143\1\77\1\51\3\143\1\4\1\6\1\11\1\4\1\6\7\143\1\4\1\6\2\143";
    static final String[] dfa_32s = {
            "\1\3\5\uffff\1\1\5\uffff\1\3\11\uffff\4\3\2\uffff\1\3\2\uffff\1\5\6\uffff\6\5\1\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\12\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\6",
            "",
            "",
            "",
            "\1\16\1\15\1\13\1\uffff\1\17\1\11\1\1\5\uffff\1\3\3\uffff\1\7\6\uffff\3\3\12\uffff\1\14\10\uffff\7\4\6\uffff\1\2\1\10\1\12\4\3\30\uffff\7\4",
            "\1\20",
            "\1\21",
            "\1\1\5\uffff\1\3\12\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\13\1\uffff\1\17",
            "\1\1\5\uffff\1\3\12\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\22",
            "\1\1\5\uffff\1\3\7\uffff\1\23\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\24\3\uffff\1\23\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\25\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\12\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\16\1\15\1\13\1\uffff\1\17\1\11\1\1\5\uffff\1\3\3\uffff\1\7\6\uffff\3\3\12\uffff\1\14\10\uffff\7\4\6\uffff\1\2\1\10\1\12\4\3\30\uffff\7\4",
            "\1\16\1\15\1\13\1\uffff\1\17\1\11\1\1\5\uffff\1\3\12\uffff\3\3\12\uffff\1\14\10\uffff\7\4\6\uffff\1\2\1\uffff\1\12\4\3\30\uffff\7\4",
            "\1\26\24\uffff\1\30\25\uffff\1\27",
            "\1\32\1\31",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\40\1\37\3\uffff\1\41",
            "\1\1\5\uffff\1\3\7\uffff\1\23\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\42\3\uffff\1\23\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\43\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\24\3\uffff\1\23\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\25\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\23\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\26\24\uffff\1\30\25\uffff\1\27",
            "\1\30",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\45\3\uffff\1\44\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\46\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\47",
            "\1\50",
            "\1\52\1\51\3\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\1\5\uffff\1\3\3\uffff\1\42\3\uffff\1\23\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\43\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\23\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\56\3\uffff\1\44\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\57\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\3\uffff\1\45\3\uffff\1\44\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\46\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\60",
            "\1\61",
            "\1\1\5\uffff\1\3\3\uffff\1\56\3\uffff\1\44\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\1\57\1\uffff\4\3\30\uffff\7\4",
            "\1\1\5\uffff\1\3\7\uffff\1\44\2\uffff\3\3\23\uffff\7\4\6\uffff\1\2\2\uffff\4\3\30\uffff\7\4"
    };
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_30;
            this.max = dfa_31;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "()* loopback of 964:1: ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )*";
        }
    }
    static final String dfa_33s = "\17\uffff";
    static final String dfa_34s = "\1\4\11\0\5\uffff";
    static final String dfa_35s = "\1\104\11\0\5\uffff";
    static final String dfa_36s = "\12\uffff\1\2\3\uffff\1\1";
    static final String dfa_37s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\5\uffff}>";
    static final String[] dfa_38s = {
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

    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_33;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
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
    static final String dfa_39s = "\1\4\2\uffff\2\0\7\uffff\1\0\2\uffff";
    static final String dfa_40s = "\1\104\2\uffff\2\0\7\uffff\1\0\2\uffff";
    static final String dfa_41s = "\1\uffff\1\2\14\uffff\1\1";
    static final String dfa_42s = "\3\uffff\1\0\1\1\7\uffff\1\2\2\uffff}>";
    static final String[] dfa_43s = {
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
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[][] dfa_43 = unpackEncodedStringArray(dfa_43s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_33;
            this.eof = dfa_33;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
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
    static final String dfa_44s = "\1\4\1\uffff\1\12\1\4\2\uffff\2\4\1\6\1\4\2\12\1\6\3\12\2\4\1\24\2\4\1\6\1\4\1\6\1\4\4\12\1\24\1\51\3\12\1\4\1\6\2\4\1\6\7\12\1\4\1\6\2\12";
    static final String dfa_45s = "\1\104\1\uffff\1\104\1\4\2\uffff\1\104\1\4\1\6\1\4\2\104\1\10\5\104\1\77\1\5\1\4\1\6\1\4\1\6\1\11\4\104\1\77\1\51\3\104\1\4\1\6\1\11\1\4\1\6\7\104\1\4\1\6\2\104";
    static final String dfa_46s = "\1\uffff\1\1\2\uffff\1\2\1\3\54\uffff";
    static final String[] dfa_47s = {
            "\1\1\5\uffff\1\2\5\uffff\1\5\11\uffff\1\5\3\4\2\uffff\1\1\35\uffff\1\3\2\uffff\4\4",
            "",
            "\1\2\5\uffff\1\5\12\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\6",
            "",
            "",
            "\1\13\1\12\1\16\1\uffff\1\15\1\17\1\2\5\uffff\1\5\3\uffff\1\7\6\uffff\3\4\12\uffff\1\11\25\uffff\1\3\1\10\1\14\4\4",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\2\5\uffff\1\5\7\uffff\1\23\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\3\uffff\1\24\3\uffff\1\23\2\uffff\3\4\40\uffff\1\3\1\25\1\uffff\4\4",
            "\1\16\1\uffff\1\15",
            "\1\2\5\uffff\1\5\12\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\12\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\12\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\13\1\12\1\16\1\uffff\1\15\1\17\1\2\5\uffff\1\5\3\uffff\1\7\6\uffff\3\4\12\uffff\1\11\25\uffff\1\3\1\10\1\14\4\4",
            "\1\13\1\12\1\16\1\uffff\1\15\1\17\1\2\5\uffff\1\5\12\uffff\3\4\12\uffff\1\11\25\uffff\1\3\1\uffff\1\14\4\4",
            "\1\26\24\uffff\1\30\25\uffff\1\27",
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
            "\1\26\24\uffff\1\30\25\uffff\1\27",
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
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[][] dfa_47 = unpackEncodedStringArray(dfa_47s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_44;
            this.max = dfa_45;
            this.accept = dfa_46;
            this.special = dfa_25;
            this.transition = dfa_47;
        }
        public String getDescription() {
            return "1037:5: ( ( (lv_regions_20_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_21_0= ruleSingleControlflowRegion ) ) )?";
        }
    }
    static final String dfa_48s = "\16\uffff";
    static final String dfa_49s = "\1\4\1\0\14\uffff";
    static final String dfa_50s = "\1\132\1\0\14\uffff";
    static final String dfa_51s = "\2\uffff\1\2\12\uffff\1\1";
    static final String dfa_52s = "\1\uffff\1\0\14\uffff}>";
    static final String[] dfa_53s = {
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

    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final char[] dfa_50 = DFA.unpackEncodedStringToUnsignedChars(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[][] dfa_53 = unpackEncodedStringArray(dfa_53s);

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_48;
            this.eof = dfa_48;
            this.min = dfa_49;
            this.max = dfa_50;
            this.accept = dfa_51;
            this.special = dfa_52;
            this.transition = dfa_53;
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
    static final String dfa_54s = "\46\uffff";
    static final String dfa_55s = "\1\2\45\uffff";
    static final String dfa_56s = "\1\4\1\0\44\uffff";
    static final String dfa_57s = "\1\143\1\0\44\uffff";
    static final String dfa_58s = "\2\uffff\1\2\42\uffff\1\1";
    static final String dfa_59s = "\1\uffff\1\0\44\uffff}>";
    static final String[] dfa_60s = {
            "\1\2\5\uffff\1\2\5\uffff\1\2\2\uffff\1\1\6\uffff\4\2\2\uffff\1\2\2\uffff\1\2\6\uffff\6\2\1\uffff\7\2\6\uffff\1\2\2\uffff\4\2\30\uffff\7\2",
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

    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final char[] dfa_56 = DFA.unpackEncodedStringToUnsignedChars(dfa_56s);
    static final char[] dfa_57 = DFA.unpackEncodedStringToUnsignedChars(dfa_57s);
    static final short[] dfa_58 = DFA.unpackEncodedString(dfa_58s);
    static final short[] dfa_59 = DFA.unpackEncodedString(dfa_59s);
    static final short[][] dfa_60 = unpackEncodedStringArray(dfa_60s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_54;
            this.eof = dfa_55;
            this.min = dfa_56;
            this.max = dfa_57;
            this.accept = dfa_58;
            this.special = dfa_59;
            this.transition = dfa_60;
        }
        public String getDescription() {
            return "()* loopback of 2118:2: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalSct()) ) {s = 37;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = dfa_54;
            this.eof = dfa_55;
            this.min = dfa_56;
            this.max = dfa_57;
            this.accept = dfa_58;
            this.special = dfa_59;
            this.transition = dfa_60;
        }
        public String getDescription() {
            return "()* loopback of 2233:2: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalSct()) ) {s = 37;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = dfa_54;
            this.eof = dfa_55;
            this.min = dfa_56;
            this.max = dfa_57;
            this.accept = dfa_58;
            this.special = dfa_59;
            this.transition = dfa_60;
        }
        public String getDescription() {
            return "()* loopback of 2333:2: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalSct()) ) {s = 37;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = dfa_54;
            this.eof = dfa_55;
            this.min = dfa_56;
            this.max = dfa_57;
            this.accept = dfa_58;
            this.special = dfa_59;
            this.transition = dfa_60;
        }
        public String getDescription() {
            return "()* loopback of 2534:2: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA77_1 = input.LA(1);

                         
                        int index77_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalSct()) ) {s = 37;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index77_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 77, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_61s = "\112\uffff";
    static final String dfa_62s = "\10\uffff\1\4\101\uffff";
    static final String dfa_63s = "\3\4\2\uffff\2\4\1\6\1\4\1\6\10\4\1\6\3\4\1\24\7\4\1\6\3\4\1\6\1\4\1\6\1\4\1\6\5\4\1\24\1\51\7\4\1\24\2\4\1\6\2\4\1\6\7\4\1\24\1\51\2\4\1\6\2\4";
    static final String dfa_64s = "\2\76\1\4\2\uffff\1\100\1\4\1\6\1\120\1\10\3\76\1\4\1\76\2\100\1\4\1\6\1\5\1\76\1\4\1\77\1\5\1\77\2\76\1\77\1\100\1\4\1\6\1\11\1\76\1\4\1\6\1\4\1\6\1\120\1\10\3\76\1\4\1\76\1\77\1\51\1\76\1\77\1\76\1\77\1\76\2\100\1\77\1\11\1\4\1\6\1\11\1\4\1\6\1\11\1\76\1\77\1\76\1\77\2\76\1\77\1\51\1\76\1\4\1\6\1\77\1\76";
    static final String dfa_65s = "\3\uffff\1\1\1\2\105\uffff";
    static final String dfa_66s = "\112\uffff}>";
    static final String[] dfa_67s = {
            "\1\4\2\uffff\1\4\2\uffff\1\1\45\uffff\1\3\10\uffff\1\4\4\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\1\45\uffff\1\3\10\uffff\1\4\4\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\10\1\16\1\13\1\4\1\12\1\14\1\1\11\uffff\1\6\23\uffff\1\15\7\uffff\1\3\10\uffff\1\4\4\uffff\1\2\1\7\1\11",
            "\1\17",
            "\1\20",
            "\1\4\2\uffff\1\4\2\uffff\1\24\7\uffff\1\4\1\uffff\1\21\3\uffff\1\23\5\uffff\1\4\11\uffff\1\4\7\uffff\1\3\10\uffff\1\4\4\uffff\1\25\1\22\13\uffff\6\4",
            "\1\13\1\uffff\1\12",
            "\1\4\2\uffff\1\4\2\uffff\1\1\45\uffff\1\3\10\uffff\1\4\4\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\1\45\uffff\1\3\10\uffff\1\4\4\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\1\45\uffff\1\3\10\uffff\1\4\4\uffff\1\2",
            "\1\26",
            "\1\4\2\uffff\1\4\2\uffff\1\1\15\uffff\1\27\27\uffff\1\3\10\uffff\1\4\4\uffff\1\2",
            "\1\10\1\16\1\13\1\4\1\12\1\14\1\1\11\uffff\1\6\23\uffff\1\15\7\uffff\1\3\10\uffff\1\4\4\uffff\1\2\1\7\1\11",
            "\1\10\1\16\1\13\1\4\1\12\1\14\1\1\35\uffff\1\15\7\uffff\1\3\10\uffff\1\4\4\uffff\1\2\1\uffff\1\11",
            "\1\30",
            "\1\31",
            "\1\33\1\32",
            "\1\4\2\uffff\1\4\2\uffff\1\24\45\uffff\1\3\10\uffff\1\4\4\uffff\1\25",
            "\1\34",
            "\1\35\24\uffff\1\37\25\uffff\1\36",
            "\1\33\1\40",
            "\1\4\2\uffff\1\4\2\uffff\1\24\11\uffff\1\21\3\uffff\1\23\27\uffff\1\3\10\uffff\1\4\4\uffff\1\25\1\22",
            "\1\4\2\uffff\1\4\2\uffff\1\24\15\uffff\1\23\27\uffff\1\3\10\uffff\1\4\4\uffff\1\25",
            "\1\4\2\uffff\1\4\2\uffff\1\24\15\uffff\1\23\27\uffff\1\3\10\uffff\1\4\4\uffff\1\25",
            "\1\4\2\uffff\1\4\2\uffff\1\24\11\uffff\1\41\3\uffff\1\23\27\uffff\1\3\10\uffff\1\4\4\uffff\1\25\1\42",
            "\1\45\1\53\1\50\1\4\1\47\1\51\1\24\11\uffff\1\43\23\uffff\1\52\7\uffff\1\3\10\uffff\1\4\4\uffff\1\25\1\44\1\46",
            "\1\54",
            "\1\55",
            "\1\57\1\56\3\uffff\1\60",
            "\1\4\2\uffff\1\4\2\uffff\1\1\15\uffff\1\27\27\uffff\1\3\10\uffff\1\4\4\uffff\1\2",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\4\2\uffff\1\4\2\uffff\1\24\7\uffff\1\4\1\uffff\1\21\3\uffff\1\23\17\uffff\1\4\7\uffff\1\3\10\uffff\1\4\4\uffff\1\25\1\22\13\uffff\6\4",
            "\1\50\1\uffff\1\47",
            "\1\4\2\uffff\1\4\2\uffff\1\24\45\uffff\1\3\10\uffff\1\4\4\uffff\1\25",
            "\1\4\2\uffff\1\4\2\uffff\1\24\45\uffff\1\3\10\uffff\1\4\4\uffff\1\25",
            "\1\4\2\uffff\1\4\2\uffff\1\24\45\uffff\1\3\10\uffff\1\4\4\uffff\1\25",
            "\1\65",
            "\1\4\2\uffff\1\4\2\uffff\1\24\15\uffff\1\23\27\uffff\1\3\10\uffff\1\4\4\uffff\1\25",
            "\1\35\24\uffff\1\37\25\uffff\1\36",
            "\1\37",
            "\1\4\2\uffff\1\4\2\uffff\1\1\15\uffff\1\66\27\uffff\1\3\10\uffff\1\4\4\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\24\11\uffff\1\67\3\uffff\1\71\27\uffff\1\3\10\uffff\1\4\4\uffff\1\25\1\70",
            "\1\4\2\uffff\1\4\2\uffff\1\24\15\uffff\1\71\27\uffff\1\3\10\uffff\1\4\4\uffff\1\25",
            "\1\4\2\uffff\1\4\2\uffff\1\24\11\uffff\1\41\3\uffff\1\23\27\uffff\1\3\10\uffff\1\4\4\uffff\1\25\1\42",
            "\1\4\2\uffff\1\4\2\uffff\1\24\15\uffff\1\23\27\uffff\1\3\10\uffff\1\4\4\uffff\1\25",
            "\1\45\1\53\1\50\1\4\1\47\1\51\1\24\11\uffff\1\43\23\uffff\1\52\7\uffff\1\3\10\uffff\1\4\4\uffff\1\25\1\44\1\46",
            "\1\45\1\53\1\50\1\4\1\47\1\51\1\24\35\uffff\1\52\7\uffff\1\3\10\uffff\1\4\4\uffff\1\25\1\uffff\1\46",
            "\1\72\24\uffff\1\74\25\uffff\1\73",
            "\1\76\1\75\3\uffff\1\77",
            "\1\100",
            "\1\101",
            "\1\76\1\102\3\uffff\1\77",
            "\1\103",
            "\1\104",
            "\1\57\1\105\3\uffff\1\60",
            "\1\4\2\uffff\1\4\2\uffff\1\1\15\uffff\1\66\27\uffff\1\3\10\uffff\1\4\4\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\24\11\uffff\1\106\3\uffff\1\71\27\uffff\1\3\10\uffff\1\4\4\uffff\1\25\1\107",
            "\1\4\2\uffff\1\4\2\uffff\1\24\15\uffff\1\71\27\uffff\1\3\10\uffff\1\4\4\uffff\1\25",
            "\1\4\2\uffff\1\4\2\uffff\1\24\11\uffff\1\67\3\uffff\1\71\27\uffff\1\3\10\uffff\1\4\4\uffff\1\25\1\70",
            "\1\4\2\uffff\1\4\2\uffff\1\24\15\uffff\1\71\27\uffff\1\3\10\uffff\1\4\4\uffff\1\25",
            "\1\4\2\uffff\1\4\2\uffff\1\24\15\uffff\1\71\27\uffff\1\3\10\uffff\1\4\4\uffff\1\25",
            "\1\72\24\uffff\1\74\25\uffff\1\73",
            "\1\74",
            "\1\4\2\uffff\1\4\2\uffff\1\24\15\uffff\1\71\27\uffff\1\3\10\uffff\1\4\4\uffff\1\25",
            "\1\110",
            "\1\111",
            "\1\4\2\uffff\1\4\2\uffff\1\24\11\uffff\1\106\3\uffff\1\71\27\uffff\1\3\10\uffff\1\4\4\uffff\1\25\1\107",
            "\1\4\2\uffff\1\4\2\uffff\1\24\15\uffff\1\71\27\uffff\1\3\10\uffff\1\4\4\uffff\1\25"
    };

    static final short[] dfa_61 = DFA.unpackEncodedString(dfa_61s);
    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final char[] dfa_63 = DFA.unpackEncodedStringToUnsignedChars(dfa_63s);
    static final char[] dfa_64 = DFA.unpackEncodedStringToUnsignedChars(dfa_64s);
    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final short[] dfa_66 = DFA.unpackEncodedString(dfa_66s);
    static final short[][] dfa_67 = unpackEncodedStringArray(dfa_67s);

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = dfa_61;
            this.eof = dfa_62;
            this.min = dfa_63;
            this.max = dfa_64;
            this.accept = dfa_65;
            this.special = dfa_66;
            this.transition = dfa_67;
        }
        public String getDescription() {
            return "2583:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )";
        }
    }
    static final String dfa_68s = "\1\4\13\0\2\uffff";
    static final String dfa_69s = "\1\132\13\0\2\uffff";
    static final String dfa_70s = "\14\uffff\1\1\1\2";
    static final String dfa_71s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_72s = {
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
    static final char[] dfa_68 = DFA.unpackEncodedStringToUnsignedChars(dfa_68s);
    static final char[] dfa_69 = DFA.unpackEncodedStringToUnsignedChars(dfa_69s);
    static final short[] dfa_70 = DFA.unpackEncodedString(dfa_70s);
    static final short[] dfa_71 = DFA.unpackEncodedString(dfa_71s);
    static final short[][] dfa_72 = unpackEncodedStringArray(dfa_72s);

    class DFA106 extends DFA {

        public DFA106(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 106;
            this.eot = dfa_48;
            this.eof = dfa_48;
            this.min = dfa_68;
            this.max = dfa_69;
            this.accept = dfa_70;
            this.special = dfa_71;
            this.transition = dfa_72;
        }
        public String getDescription() {
            return "3590:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA106_1 = input.LA(1);

                         
                        int index106_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index106_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA106_2 = input.LA(1);

                         
                        int index106_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index106_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA106_3 = input.LA(1);

                         
                        int index106_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index106_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA106_4 = input.LA(1);

                         
                        int index106_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index106_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA106_5 = input.LA(1);

                         
                        int index106_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index106_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA106_6 = input.LA(1);

                         
                        int index106_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index106_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA106_7 = input.LA(1);

                         
                        int index106_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index106_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA106_8 = input.LA(1);

                         
                        int index106_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index106_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA106_9 = input.LA(1);

                         
                        int index106_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index106_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA106_10 = input.LA(1);

                         
                        int index106_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index106_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA106_11 = input.LA(1);

                         
                        int index106_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index106_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 106, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_73s = "\15\uffff";
    static final String dfa_74s = "\1\4\4\uffff\7\0\1\uffff";
    static final String dfa_75s = "\1\132\4\uffff\7\0\1\uffff";
    static final String dfa_76s = "\1\uffff\1\1\12\uffff\1\2";
    static final String dfa_77s = "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] dfa_78s = {
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

    static final short[] dfa_73 = DFA.unpackEncodedString(dfa_73s);
    static final char[] dfa_74 = DFA.unpackEncodedStringToUnsignedChars(dfa_74s);
    static final char[] dfa_75 = DFA.unpackEncodedStringToUnsignedChars(dfa_75s);
    static final short[] dfa_76 = DFA.unpackEncodedString(dfa_76s);
    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final short[][] dfa_78 = unpackEncodedStringArray(dfa_78s);

    class DFA116 extends DFA {

        public DFA116(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 116;
            this.eot = dfa_73;
            this.eof = dfa_73;
            this.min = dfa_74;
            this.max = dfa_75;
            this.accept = dfa_76;
            this.special = dfa_77;
            this.transition = dfa_78;
        }
        public String getDescription() {
            return "4059:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA116_5 = input.LA(1);

                         
                        int index116_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred131_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index116_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA116_6 = input.LA(1);

                         
                        int index116_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred131_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index116_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA116_7 = input.LA(1);

                         
                        int index116_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred131_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index116_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA116_8 = input.LA(1);

                         
                        int index116_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred131_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index116_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA116_9 = input.LA(1);

                         
                        int index116_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred131_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index116_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA116_10 = input.LA(1);

                         
                        int index116_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred131_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index116_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA116_11 = input.LA(1);

                         
                        int index116_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred131_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index116_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 116, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_79s = "\1\4\3\uffff\1\0\7\uffff";
    static final String dfa_80s = "\1\132\3\uffff\1\0\7\uffff";
    static final String dfa_81s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\5\uffff\1\4";
    static final String dfa_82s = "\4\uffff\1\0\7\uffff}>";
    static final String[] dfa_83s = {
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
    static final char[] dfa_79 = DFA.unpackEncodedStringToUnsignedChars(dfa_79s);
    static final char[] dfa_80 = DFA.unpackEncodedStringToUnsignedChars(dfa_80s);
    static final short[] dfa_81 = DFA.unpackEncodedString(dfa_81s);
    static final short[] dfa_82 = DFA.unpackEncodedString(dfa_82s);
    static final short[][] dfa_83 = unpackEncodedStringArray(dfa_83s);

    class DFA130 extends DFA {

        public DFA130(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 130;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_79;
            this.max = dfa_80;
            this.accept = dfa_81;
            this.special = dfa_82;
            this.transition = dfa_83;
        }
        public String getDescription() {
            return "4779:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA130_4 = input.LA(1);

                         
                        int index130_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred151_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index130_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 130, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_84s = "\3\uffff\1\11\4\uffff\1\7\5\uffff\2\11";
    static final String dfa_85s = "\1\12\1\uffff\3\4\1\6\2\uffff\1\4\1\uffff\1\6\3\uffff\2\4";
    static final String dfa_86s = "\1\76\1\uffff\1\4\1\143\1\4\1\6\2\uffff\1\143\1\uffff\1\10\3\uffff\2\143";
    static final String dfa_87s = "\1\uffff\1\1\4\uffff\1\4\1\3\1\uffff\1\7\1\uffff\1\6\1\2\1\5\2\uffff";
    static final String dfa_88s = "\20\uffff}>";
    static final String[] dfa_89s = {
            "\1\1\63\uffff\1\2",
            "",
            "\1\3",
            "\1\10\1\7\1\15\1\11\1\13\1\14\1\11\5\uffff\1\11\3\uffff\1\4\1\11\5\uffff\3\11\12\uffff\1\6\7\uffff\10\11\1\uffff\1\11\4\uffff\1\11\1\5\1\12\7\11\25\uffff\7\11",
            "\1\16",
            "\1\17",
            "",
            "",
            "\1\7\2\uffff\1\7\2\uffff\1\7\5\uffff\1\7\1\uffff\1\11\1\uffff\2\7\2\uffff\1\7\2\uffff\3\7\11\uffff\2\11\7\uffff\10\7\1\uffff\1\7\4\uffff\2\7\1\uffff\7\7\3\uffff\6\11\14\uffff\7\7",
            "",
            "\1\15\1\uffff\1\13",
            "",
            "",
            "",
            "\1\10\1\7\1\15\1\11\1\13\1\14\1\11\5\uffff\1\11\3\uffff\1\4\1\11\5\uffff\3\11\12\uffff\1\6\7\uffff\10\11\1\uffff\1\11\4\uffff\1\11\1\5\1\12\7\11\25\uffff\7\11",
            "\1\10\1\7\1\15\1\11\1\13\1\14\1\11\5\uffff\1\11\4\uffff\1\11\5\uffff\3\11\12\uffff\1\6\7\uffff\10\11\1\uffff\1\11\4\uffff\1\11\1\uffff\1\12\7\11\25\uffff\7\11"
    };
    static final short[] dfa_84 = DFA.unpackEncodedString(dfa_84s);
    static final char[] dfa_85 = DFA.unpackEncodedStringToUnsignedChars(dfa_85s);
    static final char[] dfa_86 = DFA.unpackEncodedStringToUnsignedChars(dfa_86s);
    static final short[] dfa_87 = DFA.unpackEncodedString(dfa_87s);
    static final short[] dfa_88 = DFA.unpackEncodedString(dfa_88s);
    static final short[][] dfa_89 = unpackEncodedStringArray(dfa_89s);

    class DFA139 extends DFA {

        public DFA139(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 139;
            this.eot = dfa_14;
            this.eof = dfa_84;
            this.min = dfa_85;
            this.max = dfa_86;
            this.accept = dfa_87;
            this.special = dfa_88;
            this.transition = dfa_89;
        }
        public String getDescription() {
            return "5478:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )";
        }
    }
    static final String dfa_90s = "\3\uffff\1\13\11\uffff\2\13";
    static final String dfa_91s = "\1\12\1\uffff\3\4\2\6\6\uffff\2\4";
    static final String dfa_92s = "\1\76\1\uffff\1\4\1\100\1\4\1\6\1\10\6\uffff\2\100";
    static final String dfa_93s = "\1\uffff\1\1\5\uffff\1\5\1\4\1\3\1\2\1\7\1\6\2\uffff";
    static final String dfa_94s = "\17\uffff}>";
    static final String[] dfa_95s = {
            "\1\1\63\uffff\1\2",
            "",
            "\1\3",
            "\1\13\1\12\1\7\1\uffff\1\14\1\10\1\13\11\uffff\1\4\23\uffff\1\11\25\uffff\1\13\1\5\1\6",
            "\1\15",
            "\1\16",
            "\1\7\1\uffff\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\1\12\1\7\1\uffff\1\14\1\10\1\13\11\uffff\1\4\23\uffff\1\11\25\uffff\1\13\1\5\1\6",
            "\1\13\1\12\1\7\1\uffff\1\14\1\10\1\13\35\uffff\1\11\25\uffff\1\13\1\uffff\1\6"
    };
    static final short[] dfa_90 = DFA.unpackEncodedString(dfa_90s);
    static final char[] dfa_91 = DFA.unpackEncodedStringToUnsignedChars(dfa_91s);
    static final char[] dfa_92 = DFA.unpackEncodedStringToUnsignedChars(dfa_92s);
    static final short[] dfa_93 = DFA.unpackEncodedString(dfa_93s);
    static final short[] dfa_94 = DFA.unpackEncodedString(dfa_94s);
    static final short[][] dfa_95 = unpackEncodedStringArray(dfa_95s);

    class DFA140 extends DFA {

        public DFA140(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 140;
            this.eot = dfa_33;
            this.eof = dfa_90;
            this.min = dfa_91;
            this.max = dfa_92;
            this.accept = dfa_93;
            this.special = dfa_94;
            this.transition = dfa_95;
        }
        public String getDescription() {
            return "5591:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )";
        }
    }
    static final String dfa_96s = "\1\4\60\uffff";
    static final String dfa_97s = "\2\12\1\4\2\uffff\2\4\2\6\2\12\1\4\3\12\2\4\1\24\2\4\1\6\1\4\1\6\1\4\4\12\1\24\1\51\3\12\1\4\1\6\2\4\1\6\7\12\1\4\1\6\2\12";
    static final String dfa_98s = "\2\104\1\4\2\uffff\1\104\1\4\1\6\1\10\2\104\1\4\5\104\1\77\1\5\1\4\1\6\1\4\1\6\1\11\4\104\1\77\1\51\3\104\1\4\1\6\1\11\1\4\1\6\7\104\1\4\1\6\2\104";
    static final String[] dfa_99s = {
            "\1\1\5\uffff\1\4\12\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\12\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\5",
            "",
            "",
            "\1\15\1\14\1\11\1\uffff\1\16\1\12\1\1\5\uffff\1\4\3\uffff\1\6\6\uffff\3\3\12\uffff\1\13\25\uffff\1\2\1\7\1\10\4\3",
            "\1\17",
            "\1\20",
            "\1\11\1\uffff\1\16",
            "\1\1\5\uffff\1\4\12\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\12\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\21",
            "\1\1\5\uffff\1\4\7\uffff\1\22\2\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\1\5\uffff\1\4\3\uffff\1\23\3\uffff\1\22\2\uffff\3\3\40\uffff\1\2\1\24\1\uffff\4\3",
            "\1\1\5\uffff\1\4\12\uffff\3\3\40\uffff\1\2\2\uffff\4\3",
            "\1\15\1\14\1\11\1\uffff\1\16\1\12\1\1\5\uffff\1\4\3\uffff\1\6\6\uffff\3\3\12\uffff\1\13\25\uffff\1\2\1\7\1\10\4\3",
            "\1\15\1\14\1\11\1\uffff\1\16\1\12\1\1\5\uffff\1\4\12\uffff\3\3\12\uffff\1\13\25\uffff\1\2\1\uffff\1\10\4\3",
            "\1\25\24\uffff\1\27\25\uffff\1\26",
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
            "\1\25\24\uffff\1\27\25\uffff\1\26",
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
    static final short[] dfa_96 = DFA.unpackEncodedString(dfa_96s);
    static final char[] dfa_97 = DFA.unpackEncodedStringToUnsignedChars(dfa_97s);
    static final char[] dfa_98 = DFA.unpackEncodedStringToUnsignedChars(dfa_98s);
    static final short[][] dfa_99 = unpackEncodedStringArray(dfa_99s);

    class DFA162 extends DFA {

        public DFA162(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 162;
            this.eot = dfa_8;
            this.eof = dfa_96;
            this.min = dfa_97;
            this.max = dfa_98;
            this.accept = dfa_28;
            this.special = dfa_12;
            this.transition = dfa_99;
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
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x40FE000038000400L,0x0000000FE000001EL});
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
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x40FEFC083C010400L,0x0000000FE000001EL});
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
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x40FEFC093C010410L,0x0000000FE000001EL});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x400000013C010410L,0x000000000000001EL});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x4000000000080400L,0x00000000000000E0L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000081000010L,0x0000000004200000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000081000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x40FE000080000400L,0x0000000FE0000000L});
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
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000370L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x12000040400803F2L,0x0000000004200001L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000004000080002L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000600000000000L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x12000000400803F2L,0x0000000004200001L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x4001000000000400L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x40FE000000000400L,0x0000000FE0000000L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x00FC000000000000L,0x0000000FE0000000L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x00F8000000000000L,0x0000000FE0000000L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x00F0000000000000L,0x0000000FE0000000L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x00E0000000000000L,0x0000000FE0000000L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x00C0000000000000L,0x0000000FE0000000L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0080000000000000L,0x0000000FE0000000L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0100010000040002L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x2000000000000000L,0x0000007801C00000L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000010000040000L,0x0000000000007800L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000010000000000L,0x0000000000018000L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x4000000000000480L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x4200000000000400L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0C00000040000000L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x32000000400003F0L,0x0000000004200001L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x2000000000000002L});
        public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0A00000000000002L,0x00000000001E0000L});
        public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
        public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x02000000400003F0L,0x0000000004200001L});
        public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
        public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
        public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000230L});
        public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000001L});
        public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000001L});
        public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x8000000000100002L});
        public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x4000000000010402L});
        public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000012L});
    }


}