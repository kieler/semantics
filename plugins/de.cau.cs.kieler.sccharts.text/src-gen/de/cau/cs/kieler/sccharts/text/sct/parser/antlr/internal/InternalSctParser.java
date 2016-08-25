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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_HOSTCODE", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'region'", "':'", "'dataflow'", "'='", "';'", "'.'", "'scchart'", "'references'", "'bind'", "','", "'{'", "'}'", "'initial'", "'final'", "'state'", "'('", "')'", "'node'", "'returns'", "'ref'", "'immediate'", "'deferred'", "'with'", "'/'", "'to'", "'entry'", "'during'", "'exit'", "'weak'", "'suspend'", "'iterate'", "'expression'", "'const'", "'extern'", "'volatile'", "'input'", "'output'", "'static'", "'signal'", "'['", "']'", "'combine'", "'<'", "'()'", "'>'", "'!'", "'&'", "'@'", "'#'", "'-'", "'normal'", "'connector'", "'reference'", "'textual'", "'-->'", "'o->'", "'>->'", "'reset'", "'shallow history'", "'history'", "'+='", "'-='", "'*='", "'/='", "'++'", "'--'", "'=='", "'<='", "'>='", "'!='", "'pre'", "'|'", "'+'", "'*'", "'%'", "'val'", "'||'", "'&&'", "'pure'", "'bool'", "'unsigned'", "'int'", "'float'", "'string'", "'host'", "'none'", "'max'", "'min'"
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
    public static final int T__103=103;
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

                    if ( (LA2_2==19) ) {
                        switch ( input.LA(3) ) {
                        case RULE_STRING:
                        case RULE_INT:
                        case RULE_HOSTCODE:
                        case RULE_FLOAT:
                        case RULE_BOOLEAN:
                        case 31:
                        case 58:
                        case 61:
                        case 65:
                        case 86:
                        case 91:
                            {
                            alt2=1;
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA2_6 = input.LA(4);

                            if ( (LA2_6==31) ) {
                                alt2=2;
                            }
                            else if ( (LA2_6==17||(LA2_6>=20 && LA2_6<=21)||LA2_6==55||LA2_6==58||LA2_6==60||LA2_6==62||LA2_6==65||(LA2_6>=82 && LA2_6<=85)||(LA2_6>=87 && LA2_6<=90)||(LA2_6>=92 && LA2_6<=93)) ) {
                                alt2=1;
                            }


                            }
                            break;
                        case 35:
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
                else if ( (LA2_0==33) ) {
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

                if ( (LA3_0==RULE_COMMENT_ANNOTATION||LA3_0==63) ) {
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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
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
                              		"de.cau.cs.kieler.core.annotations.text.Annotations.STRING");
                      	    
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


    // $ANTLR start "entryRuleDataflowRegion"
    // InternalSct.g:350:1: entryRuleDataflowRegion returns [EObject current=null] : iv_ruleDataflowRegion= ruleDataflowRegion EOF ;
    public final EObject entryRuleDataflowRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataflowRegion = null;


        try {
            // InternalSct.g:351:2: (iv_ruleDataflowRegion= ruleDataflowRegion EOF )
            // InternalSct.g:352:2: iv_ruleDataflowRegion= ruleDataflowRegion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataflowRegionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDataflowRegion=ruleDataflowRegion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataflowRegion; 
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
    // $ANTLR end "entryRuleDataflowRegion"


    // $ANTLR start "ruleDataflowRegion"
    // InternalSct.g:359:1: ruleDataflowRegion returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'dataflow' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* ( ( (lv_equations_7_0= ruleEquation ) ) | ( (lv_nodes_8_0= ruleNode ) ) )* ) ;
    public final EObject ruleDataflowRegion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_declarations_6_0 = null;

        EObject lv_equations_7_0 = null;

        EObject lv_nodes_8_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:362:28: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'dataflow' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* ( ( (lv_equations_7_0= ruleEquation ) ) | ( (lv_nodes_8_0= ruleNode ) ) )* ) )
            // InternalSct.g:363:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'dataflow' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* ( ( (lv_equations_7_0= ruleEquation ) ) | ( (lv_nodes_8_0= ruleNode ) ) )* )
            {
            // InternalSct.g:363:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'dataflow' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* ( ( (lv_equations_7_0= ruleEquation ) ) | ( (lv_nodes_8_0= ruleNode ) ) )* )
            // InternalSct.g:363:2: () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'dataflow' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* ( ( (lv_equations_7_0= ruleEquation ) ) | ( (lv_nodes_8_0= ruleNode ) ) )*
            {
            // InternalSct.g:363:2: ()
            // InternalSct.g:364:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDataflowRegionAccess().getDataflowRegionAction_0(),
                          current);
                  
            }

            }

            // InternalSct.g:372:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMENT_ANNOTATION||LA8_0==63) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSct.g:373:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:373:1: (lv_annotations_1_0= ruleAnnotation )
            	    // InternalSct.g:374:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataflowRegionAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    lv_annotations_1_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDataflowRegionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_1_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDataflowRegionAccess().getDataflowKeyword_2());
                  
            }
            // InternalSct.g:394:1: ( (lv_id_3_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSct.g:395:1: (lv_id_3_0= RULE_ID )
                    {
                    // InternalSct.g:395:1: (lv_id_3_0= RULE_ID )
                    // InternalSct.g:396:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_3_0, grammarAccess.getDataflowRegionAccess().getIdIDTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataflowRegionRule());
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

            // InternalSct.g:412:3: ( (lv_label_4_0= RULE_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSct.g:413:1: (lv_label_4_0= RULE_STRING )
                    {
                    // InternalSct.g:413:1: (lv_label_4_0= RULE_STRING )
                    // InternalSct.g:414:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_4_0, grammarAccess.getDataflowRegionAccess().getLabelSTRINGTerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataflowRegionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"label",
                              		lv_label_4_0, 
                              		"de.cau.cs.kieler.core.annotations.text.Annotations.STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDataflowRegionAccess().getColonKeyword_5());
                  
            }
            // InternalSct.g:434:1: ( (lv_declarations_6_0= ruleDeclaration ) )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // InternalSct.g:435:1: (lv_declarations_6_0= ruleDeclaration )
            	    {
            	    // InternalSct.g:435:1: (lv_declarations_6_0= ruleDeclaration )
            	    // InternalSct.g:436:3: lv_declarations_6_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataflowRegionAccess().getDeclarationsDeclarationParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    lv_declarations_6_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDataflowRegionRule());
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
            	    break loop11;
                }
            } while (true);

            // InternalSct.g:452:3: ( ( (lv_equations_7_0= ruleEquation ) ) | ( (lv_nodes_8_0= ruleNode ) ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==19) ) {
                        switch ( input.LA(3) ) {
                        case 35:
                            {
                            alt12=2;
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA12_5 = input.LA(4);

                            if ( (LA12_5==31) ) {
                                alt12=2;
                            }
                            else if ( (LA12_5==17||(LA12_5>=20 && LA12_5<=21)||LA12_5==55||LA12_5==58||LA12_5==60||LA12_5==62||LA12_5==65||(LA12_5>=82 && LA12_5<=85)||(LA12_5>=87 && LA12_5<=90)||(LA12_5>=92 && LA12_5<=93)) ) {
                                alt12=1;
                            }


                            }
                            break;
                        case RULE_STRING:
                        case RULE_INT:
                        case RULE_HOSTCODE:
                        case RULE_FLOAT:
                        case RULE_BOOLEAN:
                        case 31:
                        case 58:
                        case 61:
                        case 65:
                        case 86:
                        case 91:
                            {
                            alt12=1;
                            }
                            break;

                        }

                    }
                    else if ( (LA12_2==RULE_STRING) ) {
                        alt12=2;
                    }


                }
                else if ( (LA12_0==33) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSct.g:452:4: ( (lv_equations_7_0= ruleEquation ) )
            	    {
            	    // InternalSct.g:452:4: ( (lv_equations_7_0= ruleEquation ) )
            	    // InternalSct.g:453:1: (lv_equations_7_0= ruleEquation )
            	    {
            	    // InternalSct.g:453:1: (lv_equations_7_0= ruleEquation )
            	    // InternalSct.g:454:3: lv_equations_7_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataflowRegionAccess().getEquationsEquationParserRuleCall_7_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_equations_7_0=ruleEquation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDataflowRegionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"equations",
            	              		lv_equations_7_0, 
            	              		"de.cau.cs.kieler.sccharts.text.sct.Sct.Equation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSct.g:471:6: ( (lv_nodes_8_0= ruleNode ) )
            	    {
            	    // InternalSct.g:471:6: ( (lv_nodes_8_0= ruleNode ) )
            	    // InternalSct.g:472:1: (lv_nodes_8_0= ruleNode )
            	    {
            	    // InternalSct.g:472:1: (lv_nodes_8_0= ruleNode )
            	    // InternalSct.g:473:3: lv_nodes_8_0= ruleNode
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataflowRegionAccess().getNodesNodeParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_nodes_8_0=ruleNode();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDataflowRegionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"nodes",
            	              		lv_nodes_8_0, 
            	              		"de.cau.cs.kieler.sccharts.text.sct.Sct.Node");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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
    // $ANTLR end "ruleDataflowRegion"


    // $ANTLR start "entryRuleEquation"
    // InternalSct.g:497:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // InternalSct.g:498:2: (iv_ruleEquation= ruleEquation EOF )
            // InternalSct.g:499:2: iv_ruleEquation= ruleEquation EOF
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
    // InternalSct.g:506:1: ruleEquation returns [EObject current=null] : ( () ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_expression_9_0= ruleValuedObjectReference ) ) otherlv_10= ';' ) ) ) ;
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
            // InternalSct.g:509:28: ( ( () ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_expression_9_0= ruleValuedObjectReference ) ) otherlv_10= ';' ) ) ) )
            // InternalSct.g:510:1: ( () ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_expression_9_0= ruleValuedObjectReference ) ) otherlv_10= ';' ) ) )
            {
            // InternalSct.g:510:1: ( () ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_expression_9_0= ruleValuedObjectReference ) ) otherlv_10= ';' ) ) )
            // InternalSct.g:510:2: () ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_expression_9_0= ruleValuedObjectReference ) ) otherlv_10= ';' ) )
            {
            // InternalSct.g:510:2: ()
            // InternalSct.g:511:2: 
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

            // InternalSct.g:519:2: ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_expression_9_0= ruleValuedObjectReference ) ) otherlv_10= ';' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==19) ) {
                    int LA13_2 = input.LA(3);

                    if ( ((LA13_2>=RULE_STRING && LA13_2<=RULE_BOOLEAN)||LA13_2==31||LA13_2==58||LA13_2==61||LA13_2==65||LA13_2==86||LA13_2==91) ) {
                        alt13=1;
                    }
                    else if ( (LA13_2==RULE_ID) ) {
                        int LA13_4 = input.LA(4);

                        if ( (LA13_4==17||LA13_4==20||LA13_4==55||LA13_4==58||LA13_4==60||LA13_4==62||LA13_4==65||(LA13_4>=82 && LA13_4<=85)||(LA13_4>=87 && LA13_4<=90)||(LA13_4>=92 && LA13_4<=93)) ) {
                            alt13=1;
                        }
                        else if ( (LA13_4==21) ) {
                            alt13=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSct.g:519:3: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' )
                    {
                    // InternalSct.g:519:3: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' )
                    // InternalSct.g:519:4: ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';'
                    {
                    // InternalSct.g:519:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSct.g:520:1: (otherlv_1= RULE_ID )
                    {
                    // InternalSct.g:520:1: (otherlv_1= RULE_ID )
                    // InternalSct.g:521:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEquationRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getEquationAccess().getValuedObjectValuedObjectCrossReference_1_0_0_0()); 
                      	
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEquationAccess().getEqualsSignKeyword_1_0_1());
                          
                    }
                    // InternalSct.g:539:1: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalSct.g:540:1: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalSct.g:540:1: (lv_expression_3_0= ruleExpression )
                    // InternalSct.g:541:3: lv_expression_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEquationAccess().getExpressionExpressionParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
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

                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEquationAccess().getSemicolonKeyword_1_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:562:6: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_expression_9_0= ruleValuedObjectReference ) ) otherlv_10= ';' )
                    {
                    // InternalSct.g:562:6: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_expression_9_0= ruleValuedObjectReference ) ) otherlv_10= ';' )
                    // InternalSct.g:562:7: ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_expression_9_0= ruleValuedObjectReference ) ) otherlv_10= ';'
                    {
                    // InternalSct.g:562:7: ( (otherlv_5= RULE_ID ) )
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
                      	            current = createModelElement(grammarAccess.getEquationRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getEquationAccess().getValuedObjectValuedObjectCrossReference_1_1_0_0()); 
                      	
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getEquationAccess().getEqualsSignKeyword_1_1_1());
                          
                    }
                    // InternalSct.g:582:1: ( (otherlv_7= RULE_ID ) )
                    // InternalSct.g:583:1: (otherlv_7= RULE_ID )
                    {
                    // InternalSct.g:583:1: (otherlv_7= RULE_ID )
                    // InternalSct.g:584:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEquationRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getEquationAccess().getNodeNodeCrossReference_1_1_2_0()); 
                      	
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getEquationAccess().getFullStopKeyword_1_1_3());
                          
                    }
                    // InternalSct.g:602:1: ( (lv_expression_9_0= ruleValuedObjectReference ) )
                    // InternalSct.g:603:1: (lv_expression_9_0= ruleValuedObjectReference )
                    {
                    // InternalSct.g:603:1: (lv_expression_9_0= ruleValuedObjectReference )
                    // InternalSct.g:604:3: lv_expression_9_0= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEquationAccess().getExpressionValuedObjectReferenceParserRuleCall_1_1_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
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

                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:632:1: entryRuleSCChart returns [EObject current=null] : iv_ruleSCChart= ruleSCChart EOF ;
    public final EObject entryRuleSCChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSCChart = null;


        try {
            // InternalSct.g:633:2: (iv_ruleSCChart= ruleSCChart EOF )
            // InternalSct.g:634:2: iv_ruleSCChart= ruleSCChart EOF
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
    // InternalSct.g:641:1: ruleSCChart returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'scchart' ( (lv_id_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? ( (otherlv_4= 'references' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'bind' ( (lv_bindings_7_0= ruleBinding ) ) (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )* )? ) | (otherlv_10= '{' ( ( (lv_declarations_11_0= ruleDeclaration ) ) | ( (lv_localActions_12_0= ruleLocalAction ) ) )* ( ( ( (lv_regions_13_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_14_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_15_0= ruleRegion ) )* )? otherlv_16= '}' ) )? ) ;
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
        Token otherlv_16=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_bindings_7_0 = null;

        EObject lv_bindings_9_0 = null;

        EObject lv_declarations_11_0 = null;

        EObject lv_localActions_12_0 = null;

        EObject lv_regions_13_0 = null;

        EObject lv_regions_14_0 = null;

        EObject lv_regions_15_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:644:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'scchart' ( (lv_id_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? ( (otherlv_4= 'references' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'bind' ( (lv_bindings_7_0= ruleBinding ) ) (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )* )? ) | (otherlv_10= '{' ( ( (lv_declarations_11_0= ruleDeclaration ) ) | ( (lv_localActions_12_0= ruleLocalAction ) ) )* ( ( ( (lv_regions_13_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_14_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_15_0= ruleRegion ) )* )? otherlv_16= '}' ) )? ) )
            // InternalSct.g:645:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'scchart' ( (lv_id_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? ( (otherlv_4= 'references' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'bind' ( (lv_bindings_7_0= ruleBinding ) ) (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )* )? ) | (otherlv_10= '{' ( ( (lv_declarations_11_0= ruleDeclaration ) ) | ( (lv_localActions_12_0= ruleLocalAction ) ) )* ( ( ( (lv_regions_13_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_14_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_15_0= ruleRegion ) )* )? otherlv_16= '}' ) )? )
            {
            // InternalSct.g:645:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'scchart' ( (lv_id_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? ( (otherlv_4= 'references' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'bind' ( (lv_bindings_7_0= ruleBinding ) ) (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )* )? ) | (otherlv_10= '{' ( ( (lv_declarations_11_0= ruleDeclaration ) ) | ( (lv_localActions_12_0= ruleLocalAction ) ) )* ( ( ( (lv_regions_13_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_14_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_15_0= ruleRegion ) )* )? otherlv_16= '}' ) )? )
            // InternalSct.g:645:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'scchart' ( (lv_id_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? ( (otherlv_4= 'references' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'bind' ( (lv_bindings_7_0= ruleBinding ) ) (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )* )? ) | (otherlv_10= '{' ( ( (lv_declarations_11_0= ruleDeclaration ) ) | ( (lv_localActions_12_0= ruleLocalAction ) ) )* ( ( ( (lv_regions_13_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_14_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_15_0= ruleRegion ) )* )? otherlv_16= '}' ) )?
            {
            // InternalSct.g:645:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMENT_ANNOTATION||LA14_0==63) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSct.g:646:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:646:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:647:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSCChartAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSCChartAccess().getScchartKeyword_1());
                  
            }
            // InternalSct.g:667:1: ( (lv_id_2_0= RULE_ID ) )
            // InternalSct.g:668:1: (lv_id_2_0= RULE_ID )
            {
            // InternalSct.g:668:1: (lv_id_2_0= RULE_ID )
            // InternalSct.g:669:3: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_19); if (state.failed) return current;
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

            // InternalSct.g:685:2: ( (lv_label_3_0= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSct.g:686:1: (lv_label_3_0= RULE_STRING )
                    {
                    // InternalSct.g:686:1: (lv_label_3_0= RULE_STRING )
                    // InternalSct.g:687:3: lv_label_3_0= RULE_STRING
                    {
                    lv_label_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_20); if (state.failed) return current;
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
                              		"de.cau.cs.kieler.core.annotations.text.Annotations.STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:703:3: ( (otherlv_4= 'references' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'bind' ( (lv_bindings_7_0= ruleBinding ) ) (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )* )? ) | (otherlv_10= '{' ( ( (lv_declarations_11_0= ruleDeclaration ) ) | ( (lv_localActions_12_0= ruleLocalAction ) ) )* ( ( ( (lv_regions_13_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_14_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_15_0= ruleRegion ) )* )? otherlv_16= '}' ) )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            else if ( (LA22_0==26) ) {
                alt22=2;
            }
            switch (alt22) {
                case 1 :
                    // InternalSct.g:703:4: (otherlv_4= 'references' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'bind' ( (lv_bindings_7_0= ruleBinding ) ) (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )* )? )
                    {
                    // InternalSct.g:703:4: (otherlv_4= 'references' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'bind' ( (lv_bindings_7_0= ruleBinding ) ) (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )* )? )
                    // InternalSct.g:703:6: otherlv_4= 'references' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'bind' ( (lv_bindings_7_0= ruleBinding ) ) (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )* )?
                    {
                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSCChartAccess().getReferencesKeyword_4_0_0());
                          
                    }
                    // InternalSct.g:707:1: ( (otherlv_5= RULE_ID ) )
                    // InternalSct.g:708:1: (otherlv_5= RULE_ID )
                    {
                    // InternalSct.g:708:1: (otherlv_5= RULE_ID )
                    // InternalSct.g:709:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSCChartRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getSCChartAccess().getReferencedScopeStateCrossReference_4_0_1_0()); 
                      	
                    }

                    }


                    }

                    // InternalSct.g:723:2: (otherlv_6= 'bind' ( (lv_bindings_7_0= ruleBinding ) ) (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==24) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalSct.g:723:4: otherlv_6= 'bind' ( (lv_bindings_7_0= ruleBinding ) ) (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )*
                            {
                            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getSCChartAccess().getBindKeyword_4_0_2_0());
                                  
                            }
                            // InternalSct.g:727:1: ( (lv_bindings_7_0= ruleBinding ) )
                            // InternalSct.g:728:1: (lv_bindings_7_0= ruleBinding )
                            {
                            // InternalSct.g:728:1: (lv_bindings_7_0= ruleBinding )
                            // InternalSct.g:729:3: lv_bindings_7_0= ruleBinding
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSCChartAccess().getBindingsBindingParserRuleCall_4_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_23);
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

                            // InternalSct.g:745:2: (otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==25) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // InternalSct.g:745:4: otherlv_8= ',' ( (lv_bindings_9_0= ruleBinding ) )
                            	    {
                            	    otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_22); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_8, grammarAccess.getSCChartAccess().getCommaKeyword_4_0_2_2_0());
                            	          
                            	    }
                            	    // InternalSct.g:749:1: ( (lv_bindings_9_0= ruleBinding ) )
                            	    // InternalSct.g:750:1: (lv_bindings_9_0= ruleBinding )
                            	    {
                            	    // InternalSct.g:750:1: (lv_bindings_9_0= ruleBinding )
                            	    // InternalSct.g:751:3: lv_bindings_9_0= ruleBinding
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getSCChartAccess().getBindingsBindingParserRuleCall_4_0_2_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_23);
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
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:768:6: (otherlv_10= '{' ( ( (lv_declarations_11_0= ruleDeclaration ) ) | ( (lv_localActions_12_0= ruleLocalAction ) ) )* ( ( ( (lv_regions_13_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_14_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_15_0= ruleRegion ) )* )? otherlv_16= '}' )
                    {
                    // InternalSct.g:768:6: (otherlv_10= '{' ( ( (lv_declarations_11_0= ruleDeclaration ) ) | ( (lv_localActions_12_0= ruleLocalAction ) ) )* ( ( ( (lv_regions_13_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_14_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_15_0= ruleRegion ) )* )? otherlv_16= '}' )
                    // InternalSct.g:768:8: otherlv_10= '{' ( ( (lv_declarations_11_0= ruleDeclaration ) ) | ( (lv_localActions_12_0= ruleLocalAction ) ) )* ( ( ( (lv_regions_13_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_14_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_15_0= ruleRegion ) )* )? otherlv_16= '}'
                    {
                    otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getSCChartAccess().getLeftCurlyBracketKeyword_4_1_0());
                          
                    }
                    // InternalSct.g:772:1: ( ( (lv_declarations_11_0= ruleDeclaration ) ) | ( (lv_localActions_12_0= ruleLocalAction ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        alt18 = dfa18.predict(input);
                        switch (alt18) {
                    	case 1 :
                    	    // InternalSct.g:772:2: ( (lv_declarations_11_0= ruleDeclaration ) )
                    	    {
                    	    // InternalSct.g:772:2: ( (lv_declarations_11_0= ruleDeclaration ) )
                    	    // InternalSct.g:773:1: (lv_declarations_11_0= ruleDeclaration )
                    	    {
                    	    // InternalSct.g:773:1: (lv_declarations_11_0= ruleDeclaration )
                    	    // InternalSct.g:774:3: lv_declarations_11_0= ruleDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSCChartAccess().getDeclarationsDeclarationParserRuleCall_4_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_24);
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
                    	    // InternalSct.g:791:6: ( (lv_localActions_12_0= ruleLocalAction ) )
                    	    {
                    	    // InternalSct.g:791:6: ( (lv_localActions_12_0= ruleLocalAction ) )
                    	    // InternalSct.g:792:1: (lv_localActions_12_0= ruleLocalAction )
                    	    {
                    	    // InternalSct.g:792:1: (lv_localActions_12_0= ruleLocalAction )
                    	    // InternalSct.g:793:3: lv_localActions_12_0= ruleLocalAction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSCChartAccess().getLocalActionsLocalActionParserRuleCall_4_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_24);
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
                    	    break loop18;
                        }
                    } while (true);

                    // InternalSct.g:809:4: ( ( ( (lv_regions_13_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_14_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_15_0= ruleRegion ) )* )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_ID||LA21_0==RULE_COMMENT_ANNOTATION||LA21_0==16||LA21_0==18||(LA21_0>=28 && LA21_0<=30)||LA21_0==33||LA21_0==63||(LA21_0>=66 && LA21_0<=69)) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==27) ) {
                        int LA21_2 = input.LA(2);

                        if ( (synpred26_InternalSct()) ) {
                            alt21=1;
                        }
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalSct.g:809:5: ( ( (lv_regions_13_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_14_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_15_0= ruleRegion ) )*
                            {
                            // InternalSct.g:809:5: ( ( (lv_regions_13_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_14_0= ruleSingleControlflowRegion ) ) )?
                            int alt19=3;
                            alt19 = dfa19.predict(input);
                            switch (alt19) {
                                case 1 :
                                    // InternalSct.g:809:6: ( (lv_regions_13_0= ruleSingleDataflowRegion ) )
                                    {
                                    // InternalSct.g:809:6: ( (lv_regions_13_0= ruleSingleDataflowRegion ) )
                                    // InternalSct.g:810:1: (lv_regions_13_0= ruleSingleDataflowRegion )
                                    {
                                    // InternalSct.g:810:1: (lv_regions_13_0= ruleSingleDataflowRegion )
                                    // InternalSct.g:811:3: lv_regions_13_0= ruleSingleDataflowRegion
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsSingleDataflowRegionParserRuleCall_4_1_2_0_0_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_25);
                                    lv_regions_13_0=ruleSingleDataflowRegion();

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
                                              		"de.cau.cs.kieler.sccharts.text.sct.Sct.SingleDataflowRegion");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalSct.g:828:6: ( (lv_regions_14_0= ruleSingleControlflowRegion ) )
                                    {
                                    // InternalSct.g:828:6: ( (lv_regions_14_0= ruleSingleControlflowRegion ) )
                                    // InternalSct.g:829:1: (lv_regions_14_0= ruleSingleControlflowRegion )
                                    {
                                    // InternalSct.g:829:1: (lv_regions_14_0= ruleSingleControlflowRegion )
                                    // InternalSct.g:830:3: lv_regions_14_0= ruleSingleControlflowRegion
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsSingleControlflowRegionParserRuleCall_4_1_2_0_1_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_25);
                                    lv_regions_14_0=ruleSingleControlflowRegion();

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
                                              		"de.cau.cs.kieler.sccharts.text.sct.Sct.SingleControlflowRegion");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalSct.g:846:4: ( (lv_regions_15_0= ruleRegion ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==RULE_COMMENT_ANNOTATION||LA20_0==16||LA20_0==18||LA20_0==63) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // InternalSct.g:847:1: (lv_regions_15_0= ruleRegion )
                            	    {
                            	    // InternalSct.g:847:1: (lv_regions_15_0= ruleRegion )
                            	    // InternalSct.g:848:3: lv_regions_15_0= ruleRegion
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsRegionParserRuleCall_4_1_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_25);
                            	    lv_regions_15_0=ruleRegion();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getSCChartRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"regions",
                            	              		lv_regions_15_0, 
                            	              		"de.cau.cs.kieler.sccharts.text.sct.Sct.Region");
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
                            break;

                    }

                    otherlv_16=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getSCChartAccess().getRightCurlyBracketKeyword_4_1_3());
                          
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
    // InternalSct.g:876:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // InternalSct.g:877:2: (iv_ruleRegion= ruleRegion EOF )
            // InternalSct.g:878:2: iv_ruleRegion= ruleRegion EOF
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
    // InternalSct.g:885:1: ruleRegion returns [EObject current=null] : (this_ControlflowRegion_0= ruleControlflowRegion | this_DataflowRegion_1= ruleDataflowRegion ) ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        EObject this_ControlflowRegion_0 = null;

        EObject this_DataflowRegion_1 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:888:28: ( (this_ControlflowRegion_0= ruleControlflowRegion | this_DataflowRegion_1= ruleDataflowRegion ) )
            // InternalSct.g:889:1: (this_ControlflowRegion_0= ruleControlflowRegion | this_DataflowRegion_1= ruleDataflowRegion )
            {
            // InternalSct.g:889:1: (this_ControlflowRegion_0= ruleControlflowRegion | this_DataflowRegion_1= ruleDataflowRegion )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalSct.g:890:2: this_ControlflowRegion_0= ruleControlflowRegion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRegionAccess().getControlflowRegionParserRuleCall_0()); 
                          
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
                    break;
                case 2 :
                    // InternalSct.g:903:2: this_DataflowRegion_1= ruleDataflowRegion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRegionAccess().getDataflowRegionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DataflowRegion_1=ruleDataflowRegion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DataflowRegion_1; 
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
    // $ANTLR end "ruleRegion"


    // $ANTLR start "entryRuleState"
    // InternalSct.g:922:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalSct.g:923:2: (iv_ruleState= ruleState EOF )
            // InternalSct.g:924:2: iv_ruleState= ruleState EOF
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
    // InternalSct.g:931:1: ruleState returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( ( (lv_regions_18_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_19_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_20_0= ruleRegion ) )* ) otherlv_21= '}' ) )? ( (lv_outgoingTransitions_22_0= ruleTransition ) )* otherlv_23= ';' ) ;
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
        Token otherlv_21=null;
        Token otherlv_23=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_5_0 = null;

        EObject lv_bindings_12_0 = null;

        EObject lv_bindings_14_0 = null;

        EObject lv_declarations_16_0 = null;

        EObject lv_localActions_17_0 = null;

        EObject lv_regions_18_0 = null;

        EObject lv_regions_19_0 = null;

        EObject lv_regions_20_0 = null;

        EObject lv_outgoingTransitions_22_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:934:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( ( (lv_regions_18_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_19_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_20_0= ruleRegion ) )* ) otherlv_21= '}' ) )? ( (lv_outgoingTransitions_22_0= ruleTransition ) )* otherlv_23= ';' ) )
            // InternalSct.g:935:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( ( (lv_regions_18_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_19_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_20_0= ruleRegion ) )* ) otherlv_21= '}' ) )? ( (lv_outgoingTransitions_22_0= ruleTransition ) )* otherlv_23= ';' )
            {
            // InternalSct.g:935:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( ( (lv_regions_18_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_19_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_20_0= ruleRegion ) )* ) otherlv_21= '}' ) )? ( (lv_outgoingTransitions_22_0= ruleTransition ) )* otherlv_23= ';' )
            // InternalSct.g:935:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( ( (lv_regions_18_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_19_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_20_0= ruleRegion ) )* ) otherlv_21= '}' ) )? ( (lv_outgoingTransitions_22_0= ruleTransition ) )* otherlv_23= ';'
            {
            // InternalSct.g:935:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_COMMENT_ANNOTATION||LA24_0==63) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSct.g:936:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:936:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:937:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // InternalSct.g:953:3: ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )?
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            else if ( (LA27_0==29) ) {
                alt27=2;
            }
            switch (alt27) {
                case 1 :
                    // InternalSct.g:953:4: ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? )
                    {
                    // InternalSct.g:953:4: ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? )
                    // InternalSct.g:953:5: ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )?
                    {
                    // InternalSct.g:953:5: ( (lv_initial_1_0= 'initial' ) )
                    // InternalSct.g:954:1: (lv_initial_1_0= 'initial' )
                    {
                    // InternalSct.g:954:1: (lv_initial_1_0= 'initial' )
                    // InternalSct.g:955:3: lv_initial_1_0= 'initial'
                    {
                    lv_initial_1_0=(Token)match(input,28,FollowSets000.FOLLOW_27); if (state.failed) return current;
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

                    // InternalSct.g:968:2: ( (lv_final_2_0= 'final' ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==29) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalSct.g:969:1: (lv_final_2_0= 'final' )
                            {
                            // InternalSct.g:969:1: (lv_final_2_0= 'final' )
                            // InternalSct.g:970:3: lv_final_2_0= 'final'
                            {
                            lv_final_2_0=(Token)match(input,29,FollowSets000.FOLLOW_28); if (state.failed) return current;
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
                    // InternalSct.g:984:6: ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? )
                    {
                    // InternalSct.g:984:6: ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? )
                    // InternalSct.g:984:7: ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )?
                    {
                    // InternalSct.g:984:7: ( (lv_final_3_0= 'final' ) )
                    // InternalSct.g:985:1: (lv_final_3_0= 'final' )
                    {
                    // InternalSct.g:985:1: (lv_final_3_0= 'final' )
                    // InternalSct.g:986:3: lv_final_3_0= 'final'
                    {
                    lv_final_3_0=(Token)match(input,29,FollowSets000.FOLLOW_29); if (state.failed) return current;
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

                    // InternalSct.g:999:2: ( (lv_initial_4_0= 'initial' ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==28) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalSct.g:1000:1: (lv_initial_4_0= 'initial' )
                            {
                            // InternalSct.g:1000:1: (lv_initial_4_0= 'initial' )
                            // InternalSct.g:1001:3: lv_initial_4_0= 'initial'
                            {
                            lv_initial_4_0=(Token)match(input,28,FollowSets000.FOLLOW_28); if (state.failed) return current;
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

            // InternalSct.g:1014:6: ( (lv_type_5_0= ruleStateType ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=66 && LA28_0<=69)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSct.g:1015:1: (lv_type_5_0= ruleStateType )
                    {
                    // InternalSct.g:1015:1: (lv_type_5_0= ruleStateType )
                    // InternalSct.g:1016:3: lv_type_5_0= ruleStateType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
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

            otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getStateAccess().getStateKeyword_3());
                  
            }
            // InternalSct.g:1036:1: ( (lv_id_7_0= RULE_ID ) )
            // InternalSct.g:1037:1: (lv_id_7_0= RULE_ID )
            {
            // InternalSct.g:1037:1: (lv_id_7_0= RULE_ID )
            // InternalSct.g:1038:3: lv_id_7_0= RULE_ID
            {
            lv_id_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_31); if (state.failed) return current;
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

            // InternalSct.g:1054:2: ( (lv_label_8_0= RULE_STRING ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSct.g:1055:1: (lv_label_8_0= RULE_STRING )
                    {
                    // InternalSct.g:1055:1: (lv_label_8_0= RULE_STRING )
                    // InternalSct.g:1056:3: lv_label_8_0= RULE_STRING
                    {
                    lv_label_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_32); if (state.failed) return current;
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
                              		"de.cau.cs.kieler.core.annotations.text.Annotations.STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:1072:3: ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( ( (lv_regions_18_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_19_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_20_0= ruleRegion ) )* ) otherlv_21= '}' ) )?
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==23) ) {
                alt35=1;
            }
            else if ( (LA35_0==26) ) {
                alt35=2;
            }
            switch (alt35) {
                case 1 :
                    // InternalSct.g:1072:4: (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? )
                    {
                    // InternalSct.g:1072:4: (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? )
                    // InternalSct.g:1072:6: otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )?
                    {
                    otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getStateAccess().getReferencesKeyword_6_0_0());
                          
                    }
                    // InternalSct.g:1076:1: ( (otherlv_10= RULE_ID ) )
                    // InternalSct.g:1077:1: (otherlv_10= RULE_ID )
                    {
                    // InternalSct.g:1077:1: (otherlv_10= RULE_ID )
                    // InternalSct.g:1078:3: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getStateRule());
                      	        }
                              
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_10, grammarAccess.getStateAccess().getReferencedScopeStateCrossReference_6_0_1_0()); 
                      	
                    }

                    }


                    }

                    // InternalSct.g:1092:2: (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==24) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalSct.g:1092:4: otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )*
                            {
                            otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getStateAccess().getBindKeyword_6_0_2_0());
                                  
                            }
                            // InternalSct.g:1096:1: ( (lv_bindings_12_0= ruleBinding ) )
                            // InternalSct.g:1097:1: (lv_bindings_12_0= ruleBinding )
                            {
                            // InternalSct.g:1097:1: (lv_bindings_12_0= ruleBinding )
                            // InternalSct.g:1098:3: lv_bindings_12_0= ruleBinding
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStateAccess().getBindingsBindingParserRuleCall_6_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_34);
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

                            // InternalSct.g:1114:2: (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==25) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // InternalSct.g:1114:4: otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) )
                            	    {
                            	    otherlv_13=(Token)match(input,25,FollowSets000.FOLLOW_22); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_13, grammarAccess.getStateAccess().getCommaKeyword_6_0_2_2_0());
                            	          
                            	    }
                            	    // InternalSct.g:1118:1: ( (lv_bindings_14_0= ruleBinding ) )
                            	    // InternalSct.g:1119:1: (lv_bindings_14_0= ruleBinding )
                            	    {
                            	    // InternalSct.g:1119:1: (lv_bindings_14_0= ruleBinding )
                            	    // InternalSct.g:1120:3: lv_bindings_14_0= ruleBinding
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getStateAccess().getBindingsBindingParserRuleCall_6_0_2_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_34);
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
                            	    break loop30;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:1137:6: (otherlv_15= '{' ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( ( (lv_regions_18_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_19_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_20_0= ruleRegion ) )* ) otherlv_21= '}' )
                    {
                    // InternalSct.g:1137:6: (otherlv_15= '{' ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( ( (lv_regions_18_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_19_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_20_0= ruleRegion ) )* ) otherlv_21= '}' )
                    // InternalSct.g:1137:8: otherlv_15= '{' ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( ( (lv_regions_18_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_19_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_20_0= ruleRegion ) )* ) otherlv_21= '}'
                    {
                    otherlv_15=(Token)match(input,26,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_6_1_0());
                          
                    }
                    // InternalSct.g:1141:1: ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )*
                    loop32:
                    do {
                        int alt32=3;
                        alt32 = dfa32.predict(input);
                        switch (alt32) {
                    	case 1 :
                    	    // InternalSct.g:1141:2: ( (lv_declarations_16_0= ruleDeclaration ) )
                    	    {
                    	    // InternalSct.g:1141:2: ( (lv_declarations_16_0= ruleDeclaration ) )
                    	    // InternalSct.g:1142:1: (lv_declarations_16_0= ruleDeclaration )
                    	    {
                    	    // InternalSct.g:1142:1: (lv_declarations_16_0= ruleDeclaration )
                    	    // InternalSct.g:1143:3: lv_declarations_16_0= ruleDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStateAccess().getDeclarationsDeclarationParserRuleCall_6_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_24);
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
                    	    // InternalSct.g:1160:6: ( (lv_localActions_17_0= ruleLocalAction ) )
                    	    {
                    	    // InternalSct.g:1160:6: ( (lv_localActions_17_0= ruleLocalAction ) )
                    	    // InternalSct.g:1161:1: (lv_localActions_17_0= ruleLocalAction )
                    	    {
                    	    // InternalSct.g:1161:1: (lv_localActions_17_0= ruleLocalAction )
                    	    // InternalSct.g:1162:3: lv_localActions_17_0= ruleLocalAction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStateAccess().getLocalActionsLocalActionParserRuleCall_6_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_24);
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
                    	    break loop32;
                        }
                    } while (true);

                    // InternalSct.g:1178:4: ( ( ( (lv_regions_18_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_19_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_20_0= ruleRegion ) )* )
                    // InternalSct.g:1178:5: ( ( (lv_regions_18_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_19_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_20_0= ruleRegion ) )*
                    {
                    // InternalSct.g:1178:5: ( ( (lv_regions_18_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_19_0= ruleSingleControlflowRegion ) ) )?
                    int alt33=3;
                    alt33 = dfa33.predict(input);
                    switch (alt33) {
                        case 1 :
                            // InternalSct.g:1178:6: ( (lv_regions_18_0= ruleSingleDataflowRegion ) )
                            {
                            // InternalSct.g:1178:6: ( (lv_regions_18_0= ruleSingleDataflowRegion ) )
                            // InternalSct.g:1179:1: (lv_regions_18_0= ruleSingleDataflowRegion )
                            {
                            // InternalSct.g:1179:1: (lv_regions_18_0= ruleSingleDataflowRegion )
                            // InternalSct.g:1180:3: lv_regions_18_0= ruleSingleDataflowRegion
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStateAccess().getRegionsSingleDataflowRegionParserRuleCall_6_1_2_0_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_25);
                            lv_regions_18_0=ruleSingleDataflowRegion();

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
                                      		"de.cau.cs.kieler.sccharts.text.sct.Sct.SingleDataflowRegion");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSct.g:1197:6: ( (lv_regions_19_0= ruleSingleControlflowRegion ) )
                            {
                            // InternalSct.g:1197:6: ( (lv_regions_19_0= ruleSingleControlflowRegion ) )
                            // InternalSct.g:1198:1: (lv_regions_19_0= ruleSingleControlflowRegion )
                            {
                            // InternalSct.g:1198:1: (lv_regions_19_0= ruleSingleControlflowRegion )
                            // InternalSct.g:1199:3: lv_regions_19_0= ruleSingleControlflowRegion
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStateAccess().getRegionsSingleControlflowRegionParserRuleCall_6_1_2_0_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_25);
                            lv_regions_19_0=ruleSingleControlflowRegion();

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
                                      		"de.cau.cs.kieler.sccharts.text.sct.Sct.SingleControlflowRegion");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalSct.g:1215:4: ( (lv_regions_20_0= ruleRegion ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_COMMENT_ANNOTATION||LA34_0==16||LA34_0==18||LA34_0==63) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalSct.g:1216:1: (lv_regions_20_0= ruleRegion )
                    	    {
                    	    // InternalSct.g:1216:1: (lv_regions_20_0= ruleRegion )
                    	    // InternalSct.g:1217:3: lv_regions_20_0= ruleRegion
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_6_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_25);
                    	    lv_regions_20_0=ruleRegion();

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
                    	              		"de.cau.cs.kieler.sccharts.text.sct.Sct.Region");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }

                    otherlv_21=(Token)match(input,27,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6_1_3());
                          
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:1237:4: ( (lv_outgoingTransitions_22_0= ruleTransition ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_COMMENT_ANNOTATION||LA36_0==63||(LA36_0>=70 && LA36_0<=72)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSct.g:1238:1: (lv_outgoingTransitions_22_0= ruleTransition )
            	    {
            	    // InternalSct.g:1238:1: (lv_outgoingTransitions_22_0= ruleTransition )
            	    // InternalSct.g:1239:3: lv_outgoingTransitions_22_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_35);
            	    lv_outgoingTransitions_22_0=ruleTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStateRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"outgoingTransitions",
            	              		lv_outgoingTransitions_22_0, 
            	              		"de.cau.cs.kieler.sccharts.text.sct.Sct.Transition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_23=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_23, grammarAccess.getStateAccess().getSemicolonKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // InternalSct.g:1267:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalSct.g:1268:2: (iv_ruleNode= ruleNode EOF )
            // InternalSct.g:1269:2: iv_ruleNode= ruleNode EOF
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
    // InternalSct.g:1276:1: ruleNode returns [EObject current=null] : (this_ReferenceNode_0= ruleReferenceNode | this_CallNode_1= ruleCallNode | this_DefineNode_2= ruleDefineNode ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_ReferenceNode_0 = null;

        EObject this_CallNode_1 = null;

        EObject this_DefineNode_2 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:1279:28: ( (this_ReferenceNode_0= ruleReferenceNode | this_CallNode_1= ruleCallNode | this_DefineNode_2= ruleDefineNode ) )
            // InternalSct.g:1280:1: (this_ReferenceNode_0= ruleReferenceNode | this_CallNode_1= ruleCallNode | this_DefineNode_2= ruleDefineNode )
            {
            // InternalSct.g:1280:1: (this_ReferenceNode_0= ruleReferenceNode | this_CallNode_1= ruleCallNode | this_DefineNode_2= ruleDefineNode )
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==19) ) {
                    int LA37_3 = input.LA(3);

                    if ( (LA37_3==RULE_ID) ) {
                        alt37=2;
                    }
                    else if ( (LA37_3==35) ) {
                        alt37=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA37_1==RULE_STRING) ) {
                    alt37=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA37_0==33) ) {
                alt37=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalSct.g:1281:2: this_ReferenceNode_0= ruleReferenceNode
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
                    // InternalSct.g:1294:2: this_CallNode_1= ruleCallNode
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
                    // InternalSct.g:1307:2: this_DefineNode_2= ruleDefineNode
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
    // InternalSct.g:1326:1: entryRuleCallNode returns [EObject current=null] : iv_ruleCallNode= ruleCallNode EOF ;
    public final EObject entryRuleCallNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallNode = null;


        try {
            // InternalSct.g:1327:2: (iv_ruleCallNode= ruleCallNode EOF )
            // InternalSct.g:1328:2: iv_ruleCallNode= ruleCallNode EOF
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
    // InternalSct.g:1335:1: ruleCallNode returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_parameters_5_0= ruleValuedObjectReference ) )? (otherlv_6= ',' ( (lv_parameters_7_0= ruleValuedObjectReference ) ) )* otherlv_8= ')' otherlv_9= ';' ) ;
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
            // InternalSct.g:1338:28: ( ( () ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_parameters_5_0= ruleValuedObjectReference ) )? (otherlv_6= ',' ( (lv_parameters_7_0= ruleValuedObjectReference ) ) )* otherlv_8= ')' otherlv_9= ';' ) )
            // InternalSct.g:1339:1: ( () ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_parameters_5_0= ruleValuedObjectReference ) )? (otherlv_6= ',' ( (lv_parameters_7_0= ruleValuedObjectReference ) ) )* otherlv_8= ')' otherlv_9= ';' )
            {
            // InternalSct.g:1339:1: ( () ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_parameters_5_0= ruleValuedObjectReference ) )? (otherlv_6= ',' ( (lv_parameters_7_0= ruleValuedObjectReference ) ) )* otherlv_8= ')' otherlv_9= ';' )
            // InternalSct.g:1339:2: () ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_parameters_5_0= ruleValuedObjectReference ) )? (otherlv_6= ',' ( (lv_parameters_7_0= ruleValuedObjectReference ) ) )* otherlv_8= ')' otherlv_9= ';'
            {
            // InternalSct.g:1339:2: ()
            // InternalSct.g:1340:2: 
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

            // InternalSct.g:1348:2: ( (lv_id_1_0= RULE_ID ) )
            // InternalSct.g:1349:1: (lv_id_1_0= RULE_ID )
            {
            // InternalSct.g:1349:1: (lv_id_1_0= RULE_ID )
            // InternalSct.g:1350:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCallNodeAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalSct.g:1370:1: ( (otherlv_3= RULE_ID ) )
            // InternalSct.g:1371:1: (otherlv_3= RULE_ID )
            {
            // InternalSct.g:1371:1: (otherlv_3= RULE_ID )
            // InternalSct.g:1372:3: otherlv_3= RULE_ID
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

            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCallNodeAccess().getLeftParenthesisKeyword_4());
                  
            }
            // InternalSct.g:1390:1: ( (lv_parameters_5_0= ruleValuedObjectReference ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSct.g:1391:1: (lv_parameters_5_0= ruleValuedObjectReference )
                    {
                    // InternalSct.g:1391:1: (lv_parameters_5_0= ruleValuedObjectReference )
                    // InternalSct.g:1392:3: lv_parameters_5_0= ruleValuedObjectReference
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

            // InternalSct.g:1408:3: (otherlv_6= ',' ( (lv_parameters_7_0= ruleValuedObjectReference ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==25) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalSct.g:1408:5: otherlv_6= ',' ( (lv_parameters_7_0= ruleValuedObjectReference ) )
            	    {
            	    otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getCallNodeAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalSct.g:1412:1: ( (lv_parameters_7_0= ruleValuedObjectReference ) )
            	    // InternalSct.g:1413:1: (lv_parameters_7_0= ruleValuedObjectReference )
            	    {
            	    // InternalSct.g:1413:1: (lv_parameters_7_0= ruleValuedObjectReference )
            	    // InternalSct.g:1414:3: lv_parameters_7_0= ruleValuedObjectReference
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
            	    break loop39;
                }
            } while (true);

            otherlv_8=(Token)match(input,32,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getCallNodeAccess().getRightParenthesisKeyword_7());
                  
            }
            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:1446:1: entryRuleDefineNode returns [EObject current=null] : iv_ruleDefineNode= ruleDefineNode EOF ;
    public final EObject entryRuleDefineNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineNode = null;


        try {
            // InternalSct.g:1447:2: (iv_ruleDefineNode= ruleDefineNode EOF )
            // InternalSct.g:1448:2: iv_ruleDefineNode= ruleDefineNode EOF
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
    // InternalSct.g:1455:1: ruleDefineNode returns [EObject current=null] : ( () otherlv_1= 'node' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_inputs_4_0= ruleDeclaration ) )* otherlv_5= ')' otherlv_6= 'returns' otherlv_7= '(' ( (lv_outputs_8_0= ruleDeclaration ) )* otherlv_9= ')' otherlv_10= '{' ( ( ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';' )* | ( (lv_states_15_0= ruleState ) )* ) otherlv_16= '}' ) ;
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
            // InternalSct.g:1458:28: ( ( () otherlv_1= 'node' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_inputs_4_0= ruleDeclaration ) )* otherlv_5= ')' otherlv_6= 'returns' otherlv_7= '(' ( (lv_outputs_8_0= ruleDeclaration ) )* otherlv_9= ')' otherlv_10= '{' ( ( ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';' )* | ( (lv_states_15_0= ruleState ) )* ) otherlv_16= '}' ) )
            // InternalSct.g:1459:1: ( () otherlv_1= 'node' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_inputs_4_0= ruleDeclaration ) )* otherlv_5= ')' otherlv_6= 'returns' otherlv_7= '(' ( (lv_outputs_8_0= ruleDeclaration ) )* otherlv_9= ')' otherlv_10= '{' ( ( ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';' )* | ( (lv_states_15_0= ruleState ) )* ) otherlv_16= '}' )
            {
            // InternalSct.g:1459:1: ( () otherlv_1= 'node' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_inputs_4_0= ruleDeclaration ) )* otherlv_5= ')' otherlv_6= 'returns' otherlv_7= '(' ( (lv_outputs_8_0= ruleDeclaration ) )* otherlv_9= ')' otherlv_10= '{' ( ( ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';' )* | ( (lv_states_15_0= ruleState ) )* ) otherlv_16= '}' )
            // InternalSct.g:1459:2: () otherlv_1= 'node' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_inputs_4_0= ruleDeclaration ) )* otherlv_5= ')' otherlv_6= 'returns' otherlv_7= '(' ( (lv_outputs_8_0= ruleDeclaration ) )* otherlv_9= ')' otherlv_10= '{' ( ( ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';' )* | ( (lv_states_15_0= ruleState ) )* ) otherlv_16= '}'
            {
            // InternalSct.g:1459:2: ()
            // InternalSct.g:1460:2: 
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

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDefineNodeAccess().getNodeKeyword_1());
                  
            }
            // InternalSct.g:1472:1: ( (lv_id_2_0= RULE_ID ) )
            // InternalSct.g:1473:1: (lv_id_2_0= RULE_ID )
            {
            // InternalSct.g:1473:1: (lv_id_2_0= RULE_ID )
            // InternalSct.g:1474:3: lv_id_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDefineNodeAccess().getLeftParenthesisKeyword_3());
                  
            }
            // InternalSct.g:1494:1: ( (lv_inputs_4_0= ruleDeclaration ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_COMMENT_ANNOTATION||(LA40_0>=48 && LA40_0<=54)||LA40_0==63||(LA40_0>=94 && LA40_0<=100)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalSct.g:1495:1: (lv_inputs_4_0= ruleDeclaration )
            	    {
            	    // InternalSct.g:1495:1: (lv_inputs_4_0= ruleDeclaration )
            	    // InternalSct.g:1496:3: lv_inputs_4_0= ruleDeclaration
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
            	    break loop40;
                }
            } while (true);

            otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDefineNodeAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,34,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getDefineNodeAccess().getReturnsKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getDefineNodeAccess().getLeftParenthesisKeyword_7());
                  
            }
            // InternalSct.g:1524:1: ( (lv_outputs_8_0= ruleDeclaration ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_COMMENT_ANNOTATION||(LA41_0>=48 && LA41_0<=54)||LA41_0==63||(LA41_0>=94 && LA41_0<=100)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalSct.g:1525:1: (lv_outputs_8_0= ruleDeclaration )
            	    {
            	    // InternalSct.g:1525:1: (lv_outputs_8_0= ruleDeclaration )
            	    // InternalSct.g:1526:3: lv_outputs_8_0= ruleDeclaration
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
            	    break loop41;
                }
            } while (true);

            otherlv_9=(Token)match(input,32,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getDefineNodeAccess().getRightParenthesisKeyword_9());
                  
            }
            otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getDefineNodeAccess().getLeftCurlyBracketKeyword_10());
                  
            }
            // InternalSct.g:1550:1: ( ( ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';' )* | ( (lv_states_15_0= ruleState ) )* )
            int alt44=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt44=1;
                }
                break;
            case 27:
                {
                int LA44_2 = input.LA(2);

                if ( (synpred53_InternalSct()) ) {
                    alt44=1;
                }
                else if ( (true) ) {
                    alt44=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_COMMENT_ANNOTATION:
            case 28:
            case 29:
            case 30:
            case 63:
            case 66:
            case 67:
            case 68:
            case 69:
                {
                alt44=2;
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
                    // InternalSct.g:1550:2: ( ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';' )*
                    {
                    // InternalSct.g:1550:2: ( ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';' )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==RULE_ID) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalSct.g:1550:3: ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';'
                    	    {
                    	    // InternalSct.g:1550:3: ( (otherlv_11= RULE_ID ) )
                    	    // InternalSct.g:1551:1: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalSct.g:1551:1: (otherlv_11= RULE_ID )
                    	    // InternalSct.g:1552:3: otherlv_11= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getDefineNodeRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_11, grammarAccess.getDefineNodeAccess().getValuedObjectsValuedObjectCrossReference_11_0_0_0()); 
                    	      	
                    	    }

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_12, grammarAccess.getDefineNodeAccess().getEqualsSignKeyword_11_0_1());
                    	          
                    	    }
                    	    // InternalSct.g:1570:1: ( (lv_expressions_13_0= ruleExpression ) )
                    	    // InternalSct.g:1571:1: (lv_expressions_13_0= ruleExpression )
                    	    {
                    	    // InternalSct.g:1571:1: (lv_expressions_13_0= ruleExpression )
                    	    // InternalSct.g:1572:3: lv_expressions_13_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDefineNodeAccess().getExpressionsExpressionParserRuleCall_11_0_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_14);
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

                    	    otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_14, grammarAccess.getDefineNodeAccess().getSemicolonKeyword_11_0_3());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalSct.g:1593:6: ( (lv_states_15_0= ruleState ) )*
                    {
                    // InternalSct.g:1593:6: ( (lv_states_15_0= ruleState ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==RULE_COMMENT_ANNOTATION||(LA43_0>=28 && LA43_0<=30)||LA43_0==63||(LA43_0>=66 && LA43_0<=69)) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalSct.g:1594:1: (lv_states_15_0= ruleState )
                    	    {
                    	    // InternalSct.g:1594:1: (lv_states_15_0= ruleState )
                    	    // InternalSct.g:1595:3: lv_states_15_0= ruleState
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
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_16=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:1623:1: entryRuleReferenceNode returns [EObject current=null] : iv_ruleReferenceNode= ruleReferenceNode EOF ;
    public final EObject entryRuleReferenceNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceNode = null;


        try {
            // InternalSct.g:1624:2: (iv_ruleReferenceNode= ruleReferenceNode EOF )
            // InternalSct.g:1625:2: iv_ruleReferenceNode= ruleReferenceNode EOF
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
    // InternalSct.g:1632:1: ruleReferenceNode returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? otherlv_3= '=' otherlv_4= 'ref' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameters_7_0= ruleValuedObjectReference ) )? (otherlv_8= ',' ( (lv_parameters_9_0= ruleValuedObjectReference ) ) )* otherlv_10= ')' otherlv_11= ';' ) ;
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
            // InternalSct.g:1635:28: ( ( () ( (lv_id_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? otherlv_3= '=' otherlv_4= 'ref' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameters_7_0= ruleValuedObjectReference ) )? (otherlv_8= ',' ( (lv_parameters_9_0= ruleValuedObjectReference ) ) )* otherlv_10= ')' otherlv_11= ';' ) )
            // InternalSct.g:1636:1: ( () ( (lv_id_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? otherlv_3= '=' otherlv_4= 'ref' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameters_7_0= ruleValuedObjectReference ) )? (otherlv_8= ',' ( (lv_parameters_9_0= ruleValuedObjectReference ) ) )* otherlv_10= ')' otherlv_11= ';' )
            {
            // InternalSct.g:1636:1: ( () ( (lv_id_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? otherlv_3= '=' otherlv_4= 'ref' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameters_7_0= ruleValuedObjectReference ) )? (otherlv_8= ',' ( (lv_parameters_9_0= ruleValuedObjectReference ) ) )* otherlv_10= ')' otherlv_11= ';' )
            // InternalSct.g:1636:2: () ( (lv_id_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? otherlv_3= '=' otherlv_4= 'ref' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_parameters_7_0= ruleValuedObjectReference ) )? (otherlv_8= ',' ( (lv_parameters_9_0= ruleValuedObjectReference ) ) )* otherlv_10= ')' otherlv_11= ';'
            {
            // InternalSct.g:1636:2: ()
            // InternalSct.g:1637:2: 
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

            // InternalSct.g:1645:2: ( (lv_id_1_0= RULE_ID ) )
            // InternalSct.g:1646:1: (lv_id_1_0= RULE_ID )
            {
            // InternalSct.g:1646:1: (lv_id_1_0= RULE_ID )
            // InternalSct.g:1647:3: lv_id_1_0= RULE_ID
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

            // InternalSct.g:1663:2: ( (lv_label_2_0= RULE_STRING ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_STRING) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSct.g:1664:1: (lv_label_2_0= RULE_STRING )
                    {
                    // InternalSct.g:1664:1: (lv_label_2_0= RULE_STRING )
                    // InternalSct.g:1665:3: lv_label_2_0= RULE_STRING
                    {
                    lv_label_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
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
                              		"de.cau.cs.kieler.core.annotations.text.Annotations.STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getReferenceNodeAccess().getEqualsSignKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getReferenceNodeAccess().getRefKeyword_4());
                  
            }
            // InternalSct.g:1689:1: ( (otherlv_5= RULE_ID ) )
            // InternalSct.g:1690:1: (otherlv_5= RULE_ID )
            {
            // InternalSct.g:1690:1: (otherlv_5= RULE_ID )
            // InternalSct.g:1691:3: otherlv_5= RULE_ID
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

            otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getReferenceNodeAccess().getLeftParenthesisKeyword_6());
                  
            }
            // InternalSct.g:1709:1: ( (lv_parameters_7_0= ruleValuedObjectReference ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSct.g:1710:1: (lv_parameters_7_0= ruleValuedObjectReference )
                    {
                    // InternalSct.g:1710:1: (lv_parameters_7_0= ruleValuedObjectReference )
                    // InternalSct.g:1711:3: lv_parameters_7_0= ruleValuedObjectReference
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

            // InternalSct.g:1727:3: (otherlv_8= ',' ( (lv_parameters_9_0= ruleValuedObjectReference ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==25) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalSct.g:1727:5: otherlv_8= ',' ( (lv_parameters_9_0= ruleValuedObjectReference ) )
            	    {
            	    otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getReferenceNodeAccess().getCommaKeyword_8_0());
            	          
            	    }
            	    // InternalSct.g:1731:1: ( (lv_parameters_9_0= ruleValuedObjectReference ) )
            	    // InternalSct.g:1732:1: (lv_parameters_9_0= ruleValuedObjectReference )
            	    {
            	    // InternalSct.g:1732:1: (lv_parameters_9_0= ruleValuedObjectReference )
            	    // InternalSct.g:1733:3: lv_parameters_9_0= ruleValuedObjectReference
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
            	    break loop47;
                }
            } while (true);

            otherlv_10=(Token)match(input,32,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getReferenceNodeAccess().getRightParenthesisKeyword_9());
                  
            }
            otherlv_11=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:1765:1: entryRuleLocalAction returns [EObject current=null] : iv_ruleLocalAction= ruleLocalAction EOF ;
    public final EObject entryRuleLocalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAction = null;


        try {
            // InternalSct.g:1766:2: (iv_ruleLocalAction= ruleLocalAction EOF )
            // InternalSct.g:1767:2: iv_ruleLocalAction= ruleLocalAction EOF
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
    // InternalSct.g:1774:1: ruleLocalAction returns [EObject current=null] : (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction | this_IterateAction_4= ruleIterateAction ) ;
    public final EObject ruleLocalAction() throws RecognitionException {
        EObject current = null;

        EObject this_EntryAction_0 = null;

        EObject this_DuringAction_1 = null;

        EObject this_ExitAction_2 = null;

        EObject this_SuspendAction_3 = null;

        EObject this_IterateAction_4 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:1777:28: ( (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction | this_IterateAction_4= ruleIterateAction ) )
            // InternalSct.g:1778:1: (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction | this_IterateAction_4= ruleIterateAction )
            {
            // InternalSct.g:1778:1: (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction | this_IterateAction_4= ruleIterateAction )
            int alt48=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt48=1;
                }
                break;
            case 36:
                {
                switch ( input.LA(2) ) {
                case 46:
                    {
                    alt48=5;
                    }
                    break;
                case 42:
                    {
                    alt48=2;
                    }
                    break;
                case 44:
                case 45:
                    {
                    alt48=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 2, input);

                    throw nvae;
                }

                }
                break;
            case 42:
                {
                alt48=2;
                }
                break;
            case 43:
                {
                alt48=3;
                }
                break;
            case 44:
            case 45:
                {
                alt48=4;
                }
                break;
            case 46:
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
                    // InternalSct.g:1779:2: this_EntryAction_0= ruleEntryAction
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
                    // InternalSct.g:1792:2: this_DuringAction_1= ruleDuringAction
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
                    // InternalSct.g:1805:2: this_ExitAction_2= ruleExitAction
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
                    // InternalSct.g:1818:2: this_SuspendAction_3= ruleSuspendAction
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
                    // InternalSct.g:1831:2: this_IterateAction_4= ruleIterateAction
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
    // InternalSct.g:1850:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalSct.g:1851:2: (iv_ruleTransition= ruleTransition EOF )
            // InternalSct.g:1852:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalSct.g:1859:1: ruleTransition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_immediate_3_0= 'immediate' ) )? ( (lv_deferred_4_0= 'deferred' ) )? ( (lv_history_5_0= ruleHistoryType ) )? ( (lv_label_6_0= RULE_STRING ) )? (otherlv_7= 'with' ( ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )? (otherlv_10= '/' ( (lv_effects_11_0= ruleEffect ) ) (otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) ) )* )? )? ) ;
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
            // InternalSct.g:1862:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_immediate_3_0= 'immediate' ) )? ( (lv_deferred_4_0= 'deferred' ) )? ( (lv_history_5_0= ruleHistoryType ) )? ( (lv_label_6_0= RULE_STRING ) )? (otherlv_7= 'with' ( ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )? (otherlv_10= '/' ( (lv_effects_11_0= ruleEffect ) ) (otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) ) )* )? )? ) )
            // InternalSct.g:1863:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_immediate_3_0= 'immediate' ) )? ( (lv_deferred_4_0= 'deferred' ) )? ( (lv_history_5_0= ruleHistoryType ) )? ( (lv_label_6_0= RULE_STRING ) )? (otherlv_7= 'with' ( ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )? (otherlv_10= '/' ( (lv_effects_11_0= ruleEffect ) ) (otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) ) )* )? )? )
            {
            // InternalSct.g:1863:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_immediate_3_0= 'immediate' ) )? ( (lv_deferred_4_0= 'deferred' ) )? ( (lv_history_5_0= ruleHistoryType ) )? ( (lv_label_6_0= RULE_STRING ) )? (otherlv_7= 'with' ( ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )? (otherlv_10= '/' ( (lv_effects_11_0= ruleEffect ) ) (otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) ) )* )? )? )
            // InternalSct.g:1863:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_immediate_3_0= 'immediate' ) )? ( (lv_deferred_4_0= 'deferred' ) )? ( (lv_history_5_0= ruleHistoryType ) )? ( (lv_label_6_0= RULE_STRING ) )? (otherlv_7= 'with' ( ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )? (otherlv_10= '/' ( (lv_effects_11_0= ruleEffect ) ) (otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) ) )* )? )?
            {
            // InternalSct.g:1863:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_COMMENT_ANNOTATION||LA49_0==63) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalSct.g:1864:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:1864:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:1865:3: lv_annotations_0_0= ruleAnnotation
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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // InternalSct.g:1881:3: ( (lv_type_1_0= ruleTransitionType ) )
            // InternalSct.g:1882:1: (lv_type_1_0= ruleTransitionType )
            {
            // InternalSct.g:1882:1: (lv_type_1_0= ruleTransitionType )
            // InternalSct.g:1883:3: lv_type_1_0= ruleTransitionType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionAccess().getTypeTransitionTypeEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_15);
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

            // InternalSct.g:1899:2: ( (otherlv_2= RULE_ID ) )
            // InternalSct.g:1900:1: (otherlv_2= RULE_ID )
            {
            // InternalSct.g:1900:1: (otherlv_2= RULE_ID )
            // InternalSct.g:1901:3: otherlv_2= RULE_ID
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

            // InternalSct.g:1915:2: ( (lv_immediate_3_0= 'immediate' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==36) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSct.g:1916:1: (lv_immediate_3_0= 'immediate' )
                    {
                    // InternalSct.g:1916:1: (lv_immediate_3_0= 'immediate' )
                    // InternalSct.g:1917:3: lv_immediate_3_0= 'immediate'
                    {
                    lv_immediate_3_0=(Token)match(input,36,FollowSets000.FOLLOW_49); if (state.failed) return current;
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

            // InternalSct.g:1930:3: ( (lv_deferred_4_0= 'deferred' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==37) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSct.g:1931:1: (lv_deferred_4_0= 'deferred' )
                    {
                    // InternalSct.g:1931:1: (lv_deferred_4_0= 'deferred' )
                    // InternalSct.g:1932:3: lv_deferred_4_0= 'deferred'
                    {
                    lv_deferred_4_0=(Token)match(input,37,FollowSets000.FOLLOW_50); if (state.failed) return current;
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

            // InternalSct.g:1945:3: ( (lv_history_5_0= ruleHistoryType ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=73 && LA52_0<=75)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSct.g:1946:1: (lv_history_5_0= ruleHistoryType )
                    {
                    // InternalSct.g:1946:1: (lv_history_5_0= ruleHistoryType )
                    // InternalSct.g:1947:3: lv_history_5_0= ruleHistoryType
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

            // InternalSct.g:1963:3: ( (lv_label_6_0= RULE_STRING ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_STRING) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalSct.g:1964:1: (lv_label_6_0= RULE_STRING )
                    {
                    // InternalSct.g:1964:1: (lv_label_6_0= RULE_STRING )
                    // InternalSct.g:1965:3: lv_label_6_0= RULE_STRING
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
                              		"de.cau.cs.kieler.core.annotations.text.Annotations.STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct.g:1981:3: (otherlv_7= 'with' ( ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )? (otherlv_10= '/' ( (lv_effects_11_0= ruleEffect ) ) (otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) ) )* )? )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==38) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalSct.g:1981:5: otherlv_7= 'with' ( ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )? (otherlv_10= '/' ( (lv_effects_11_0= ruleEffect ) ) (otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) ) )* )?
                    {
                    otherlv_7=(Token)match(input,38,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getWithKeyword_7_0());
                          
                    }
                    // InternalSct.g:1985:1: ( ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_BOOLEAN)||LA55_0==31||LA55_0==58||LA55_0==61||LA55_0==65||LA55_0==86||LA55_0==91) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalSct.g:1985:2: ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) )
                            {
                            // InternalSct.g:1985:2: ( (lv_delay_8_0= RULE_INT ) )?
                            int alt54=2;
                            alt54 = dfa54.predict(input);
                            switch (alt54) {
                                case 1 :
                                    // InternalSct.g:1986:1: (lv_delay_8_0= RULE_INT )
                                    {
                                    // InternalSct.g:1986:1: (lv_delay_8_0= RULE_INT )
                                    // InternalSct.g:1987:3: lv_delay_8_0= RULE_INT
                                    {
                                    lv_delay_8_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_13); if (state.failed) return current;
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
                                              		"de.cau.cs.kieler.core.annotations.text.Annotations.INT");
                                      	    
                                    }

                                    }


                                    }
                                    break;

                            }

                            // InternalSct.g:2003:3: ( (lv_trigger_9_0= ruleBoolExpression ) )
                            // InternalSct.g:2004:1: (lv_trigger_9_0= ruleBoolExpression )
                            {
                            // InternalSct.g:2004:1: (lv_trigger_9_0= ruleBoolExpression )
                            // InternalSct.g:2005:3: lv_trigger_9_0= ruleBoolExpression
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

                    // InternalSct.g:2021:4: (otherlv_10= '/' ( (lv_effects_11_0= ruleEffect ) ) (otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) ) )* )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==39) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalSct.g:2021:6: otherlv_10= '/' ( (lv_effects_11_0= ruleEffect ) ) (otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) ) )*
                            {
                            otherlv_10=(Token)match(input,39,FollowSets000.FOLLOW_55); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getSolidusKeyword_7_2_0());
                                  
                            }
                            // InternalSct.g:2025:1: ( (lv_effects_11_0= ruleEffect ) )
                            // InternalSct.g:2026:1: (lv_effects_11_0= ruleEffect )
                            {
                            // InternalSct.g:2026:1: (lv_effects_11_0= ruleEffect )
                            // InternalSct.g:2027:3: lv_effects_11_0= ruleEffect
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

                            // InternalSct.g:2043:2: (otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) ) )*
                            loop56:
                            do {
                                int alt56=2;
                                alt56 = dfa56.predict(input);
                                switch (alt56) {
                            	case 1 :
                            	    // InternalSct.g:2043:4: otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) )
                            	    {
                            	    otherlv_12=(Token)match(input,20,FollowSets000.FOLLOW_55); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_12, grammarAccess.getTransitionAccess().getSemicolonKeyword_7_2_2_0());
                            	          
                            	    }
                            	    // InternalSct.g:2047:1: ( (lv_effects_13_0= ruleEffect ) )
                            	    // InternalSct.g:2048:1: (lv_effects_13_0= ruleEffect )
                            	    {
                            	    // InternalSct.g:2048:1: (lv_effects_13_0= ruleEffect )
                            	    // InternalSct.g:2049:3: lv_effects_13_0= ruleEffect
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
                            	    break loop56;
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
    // InternalSct.g:2073:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalSct.g:2074:2: (iv_ruleBinding= ruleBinding EOF )
            // InternalSct.g:2075:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalSct.g:2082:1: ruleBinding returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:2085:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalSct.g:2086:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalSct.g:2086:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) )
            // InternalSct.g:2086:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) )
            {
            // InternalSct.g:2086:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_COMMENT_ANNOTATION||LA59_0==63) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalSct.g:2087:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:2087:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:2088:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBindingAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_22);
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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            // InternalSct.g:2104:3: ( (otherlv_1= RULE_ID ) )
            // InternalSct.g:2105:1: (otherlv_1= RULE_ID )
            {
            // InternalSct.g:2105:1: (otherlv_1= RULE_ID )
            // InternalSct.g:2106:3: otherlv_1= RULE_ID
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

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBindingAccess().getToKeyword_2());
                  
            }
            // InternalSct.g:2124:1: ( (otherlv_3= RULE_ID ) )
            // InternalSct.g:2125:1: (otherlv_3= RULE_ID )
            {
            // InternalSct.g:2125:1: (otherlv_3= RULE_ID )
            // InternalSct.g:2126:3: otherlv_3= RULE_ID
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
    // InternalSct.g:2148:1: entryRuleEntryAction returns [EObject current=null] : iv_ruleEntryAction= ruleEntryAction EOF ;
    public final EObject entryRuleEntryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryAction = null;


        try {
            // InternalSct.g:2149:2: (iv_ruleEntryAction= ruleEntryAction EOF )
            // InternalSct.g:2150:2: iv_ruleEntryAction= ruleEntryAction EOF
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
    // InternalSct.g:2157:1: ruleEntryAction returns [EObject current=null] : ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? ) ;
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
            // InternalSct.g:2160:28: ( ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? ) )
            // InternalSct.g:2161:1: ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? )
            {
            // InternalSct.g:2161:1: ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? )
            // InternalSct.g:2161:2: () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )?
            {
            // InternalSct.g:2161:2: ()
            // InternalSct.g:2162:2: 
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

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntryActionAccess().getEntryKeyword_1());
                  
            }
            // InternalSct.g:2174:1: ( (lv_trigger_2_0= ruleBoolExpression ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=RULE_STRING && LA60_0<=RULE_BOOLEAN)||LA60_0==31||LA60_0==58||LA60_0==61||LA60_0==65||LA60_0==86||LA60_0==91) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_ID) ) {
                int LA60_2 = input.LA(2);

                if ( (LA60_2==EOF||LA60_2==RULE_ID||LA60_2==RULE_COMMENT_ANNOTATION||(LA60_2>=16 && LA60_2<=18)||LA60_2==20||(LA60_2>=27 && LA60_2<=30)||LA60_2==33||LA60_2==36||LA60_2==39||(LA60_2>=41 && LA60_2<=46)||(LA60_2>=48 && LA60_2<=55)||LA60_2==58||LA60_2==60||(LA60_2>=62 && LA60_2<=63)||(LA60_2>=65 && LA60_2<=69)||(LA60_2>=82 && LA60_2<=85)||(LA60_2>=87 && LA60_2<=90)||(LA60_2>=92 && LA60_2<=100)) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // InternalSct.g:2175:1: (lv_trigger_2_0= ruleBoolExpression )
                    {
                    // InternalSct.g:2175:1: (lv_trigger_2_0= ruleBoolExpression )
                    // InternalSct.g:2176:3: lv_trigger_2_0= ruleBoolExpression
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

            // InternalSct.g:2192:3: (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==39) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalSct.g:2192:5: otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    {
                    otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEntryActionAccess().getSolidusKeyword_3_0());
                          
                    }
                    // InternalSct.g:2196:1: ( (lv_effects_4_0= ruleEffect ) )
                    // InternalSct.g:2197:1: (lv_effects_4_0= ruleEffect )
                    {
                    // InternalSct.g:2197:1: (lv_effects_4_0= ruleEffect )
                    // InternalSct.g:2198:3: lv_effects_4_0= ruleEffect
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

                    // InternalSct.g:2214:2: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        alt61 = dfa61.predict(input);
                        switch (alt61) {
                    	case 1 :
                    	    // InternalSct.g:2214:4: otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getEntryActionAccess().getSemicolonKeyword_3_2_0());
                    	          
                    	    }
                    	    // InternalSct.g:2218:1: ( (lv_effects_6_0= ruleEffect ) )
                    	    // InternalSct.g:2219:1: (lv_effects_6_0= ruleEffect )
                    	    {
                    	    // InternalSct.g:2219:1: (lv_effects_6_0= ruleEffect )
                    	    // InternalSct.g:2220:3: lv_effects_6_0= ruleEffect
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
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSct.g:2236:6: (otherlv_7= ';' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==20) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalSct.g:2236:8: otherlv_7= ';'
                    {
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:2248:1: entryRuleDuringAction returns [EObject current=null] : iv_ruleDuringAction= ruleDuringAction EOF ;
    public final EObject entryRuleDuringAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuringAction = null;


        try {
            // InternalSct.g:2249:2: (iv_ruleDuringAction= ruleDuringAction EOF )
            // InternalSct.g:2250:2: iv_ruleDuringAction= ruleDuringAction EOF
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
    // InternalSct.g:2257:1: ruleDuringAction returns [EObject current=null] : ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? ) ;
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
            // InternalSct.g:2260:28: ( ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? ) )
            // InternalSct.g:2261:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? )
            {
            // InternalSct.g:2261:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? )
            // InternalSct.g:2261:2: () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )?
            {
            // InternalSct.g:2261:2: ()
            // InternalSct.g:2262:2: 
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

            // InternalSct.g:2270:2: ( (lv_immediate_1_0= 'immediate' ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==36) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalSct.g:2271:1: (lv_immediate_1_0= 'immediate' )
                    {
                    // InternalSct.g:2271:1: (lv_immediate_1_0= 'immediate' )
                    // InternalSct.g:2272:3: lv_immediate_1_0= 'immediate'
                    {
                    lv_immediate_1_0=(Token)match(input,36,FollowSets000.FOLLOW_60); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDuringActionAccess().getDuringKeyword_2());
                  
            }
            // InternalSct.g:2289:1: ( (lv_trigger_3_0= ruleBoolExpression ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_STRING && LA65_0<=RULE_BOOLEAN)||LA65_0==31||LA65_0==58||LA65_0==61||LA65_0==65||LA65_0==86||LA65_0==91) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_ID) ) {
                int LA65_2 = input.LA(2);

                if ( (LA65_2==EOF||LA65_2==RULE_ID||LA65_2==RULE_COMMENT_ANNOTATION||(LA65_2>=16 && LA65_2<=18)||LA65_2==20||(LA65_2>=27 && LA65_2<=30)||LA65_2==33||LA65_2==36||LA65_2==39||(LA65_2>=41 && LA65_2<=46)||(LA65_2>=48 && LA65_2<=55)||LA65_2==58||LA65_2==60||(LA65_2>=62 && LA65_2<=63)||(LA65_2>=65 && LA65_2<=69)||(LA65_2>=82 && LA65_2<=85)||(LA65_2>=87 && LA65_2<=90)||(LA65_2>=92 && LA65_2<=100)) ) {
                    alt65=1;
                }
            }
            switch (alt65) {
                case 1 :
                    // InternalSct.g:2290:1: (lv_trigger_3_0= ruleBoolExpression )
                    {
                    // InternalSct.g:2290:1: (lv_trigger_3_0= ruleBoolExpression )
                    // InternalSct.g:2291:3: lv_trigger_3_0= ruleBoolExpression
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

            // InternalSct.g:2307:3: (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==39) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalSct.g:2307:5: otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    {
                    otherlv_4=(Token)match(input,39,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDuringActionAccess().getSolidusKeyword_4_0());
                          
                    }
                    // InternalSct.g:2311:1: ( (lv_effects_5_0= ruleEffect ) )
                    // InternalSct.g:2312:1: (lv_effects_5_0= ruleEffect )
                    {
                    // InternalSct.g:2312:1: (lv_effects_5_0= ruleEffect )
                    // InternalSct.g:2313:3: lv_effects_5_0= ruleEffect
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

                    // InternalSct.g:2329:2: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        alt66 = dfa66.predict(input);
                        switch (alt66) {
                    	case 1 :
                    	    // InternalSct.g:2329:4: otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getDuringActionAccess().getSemicolonKeyword_4_2_0());
                    	          
                    	    }
                    	    // InternalSct.g:2333:1: ( (lv_effects_7_0= ruleEffect ) )
                    	    // InternalSct.g:2334:1: (lv_effects_7_0= ruleEffect )
                    	    {
                    	    // InternalSct.g:2334:1: (lv_effects_7_0= ruleEffect )
                    	    // InternalSct.g:2335:3: lv_effects_7_0= ruleEffect
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
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSct.g:2351:6: (otherlv_8= ';' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==20) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalSct.g:2351:8: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:2363:1: entryRuleExitAction returns [EObject current=null] : iv_ruleExitAction= ruleExitAction EOF ;
    public final EObject entryRuleExitAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitAction = null;


        try {
            // InternalSct.g:2364:2: (iv_ruleExitAction= ruleExitAction EOF )
            // InternalSct.g:2365:2: iv_ruleExitAction= ruleExitAction EOF
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
    // InternalSct.g:2372:1: ruleExitAction returns [EObject current=null] : ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? ) ;
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
            // InternalSct.g:2375:28: ( ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? ) )
            // InternalSct.g:2376:1: ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? )
            {
            // InternalSct.g:2376:1: ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? )
            // InternalSct.g:2376:2: () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )?
            {
            // InternalSct.g:2376:2: ()
            // InternalSct.g:2377:2: 
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

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitActionAccess().getExitKeyword_1());
                  
            }
            // InternalSct.g:2389:1: ( (lv_trigger_2_0= ruleBoolExpression ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=RULE_STRING && LA69_0<=RULE_BOOLEAN)||LA69_0==31||LA69_0==58||LA69_0==61||LA69_0==65||LA69_0==86||LA69_0==91) ) {
                alt69=1;
            }
            else if ( (LA69_0==RULE_ID) ) {
                int LA69_2 = input.LA(2);

                if ( (LA69_2==EOF||LA69_2==RULE_ID||LA69_2==RULE_COMMENT_ANNOTATION||(LA69_2>=16 && LA69_2<=18)||LA69_2==20||(LA69_2>=27 && LA69_2<=30)||LA69_2==33||LA69_2==36||LA69_2==39||(LA69_2>=41 && LA69_2<=46)||(LA69_2>=48 && LA69_2<=55)||LA69_2==58||LA69_2==60||(LA69_2>=62 && LA69_2<=63)||(LA69_2>=65 && LA69_2<=69)||(LA69_2>=82 && LA69_2<=85)||(LA69_2>=87 && LA69_2<=90)||(LA69_2>=92 && LA69_2<=100)) ) {
                    alt69=1;
                }
            }
            switch (alt69) {
                case 1 :
                    // InternalSct.g:2390:1: (lv_trigger_2_0= ruleBoolExpression )
                    {
                    // InternalSct.g:2390:1: (lv_trigger_2_0= ruleBoolExpression )
                    // InternalSct.g:2391:3: lv_trigger_2_0= ruleBoolExpression
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

            // InternalSct.g:2407:3: (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==39) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalSct.g:2407:5: otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    {
                    otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getExitActionAccess().getSolidusKeyword_3_0());
                          
                    }
                    // InternalSct.g:2411:1: ( (lv_effects_4_0= ruleEffect ) )
                    // InternalSct.g:2412:1: (lv_effects_4_0= ruleEffect )
                    {
                    // InternalSct.g:2412:1: (lv_effects_4_0= ruleEffect )
                    // InternalSct.g:2413:3: lv_effects_4_0= ruleEffect
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

                    // InternalSct.g:2429:2: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        alt70 = dfa70.predict(input);
                        switch (alt70) {
                    	case 1 :
                    	    // InternalSct.g:2429:4: otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getExitActionAccess().getSemicolonKeyword_3_2_0());
                    	          
                    	    }
                    	    // InternalSct.g:2433:1: ( (lv_effects_6_0= ruleEffect ) )
                    	    // InternalSct.g:2434:1: (lv_effects_6_0= ruleEffect )
                    	    {
                    	    // InternalSct.g:2434:1: (lv_effects_6_0= ruleEffect )
                    	    // InternalSct.g:2435:3: lv_effects_6_0= ruleEffect
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
                    	    break loop70;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSct.g:2451:6: (otherlv_7= ';' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==20) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalSct.g:2451:8: otherlv_7= ';'
                    {
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:2463:1: entryRuleSuspendAction returns [EObject current=null] : iv_ruleSuspendAction= ruleSuspendAction EOF ;
    public final EObject entryRuleSuspendAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspendAction = null;


        try {
            // InternalSct.g:2464:2: (iv_ruleSuspendAction= ruleSuspendAction EOF )
            // InternalSct.g:2465:2: iv_ruleSuspendAction= ruleSuspendAction EOF
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
    // InternalSct.g:2472:1: ruleSuspendAction returns [EObject current=null] : ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? (otherlv_5= ';' )? ) ;
    public final EObject ruleSuspendAction() throws RecognitionException {
        EObject current = null;

        Token lv_immediate_1_0=null;
        Token lv_weak_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_trigger_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:2475:28: ( ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? (otherlv_5= ';' )? ) )
            // InternalSct.g:2476:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? (otherlv_5= ';' )? )
            {
            // InternalSct.g:2476:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? (otherlv_5= ';' )? )
            // InternalSct.g:2476:2: () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? (otherlv_5= ';' )?
            {
            // InternalSct.g:2476:2: ()
            // InternalSct.g:2477:2: 
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

            // InternalSct.g:2485:2: ( (lv_immediate_1_0= 'immediate' ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==36) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalSct.g:2486:1: (lv_immediate_1_0= 'immediate' )
                    {
                    // InternalSct.g:2486:1: (lv_immediate_1_0= 'immediate' )
                    // InternalSct.g:2487:3: lv_immediate_1_0= 'immediate'
                    {
                    lv_immediate_1_0=(Token)match(input,36,FollowSets000.FOLLOW_61); if (state.failed) return current;
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

            // InternalSct.g:2500:3: ( (lv_weak_2_0= 'weak' ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==44) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalSct.g:2501:1: (lv_weak_2_0= 'weak' )
                    {
                    // InternalSct.g:2501:1: (lv_weak_2_0= 'weak' )
                    // InternalSct.g:2502:3: lv_weak_2_0= 'weak'
                    {
                    lv_weak_2_0=(Token)match(input,44,FollowSets000.FOLLOW_62); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,45,FollowSets000.FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSuspendActionAccess().getSuspendKeyword_3());
                  
            }
            // InternalSct.g:2519:1: ( (lv_trigger_4_0= ruleBoolExpression ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=RULE_STRING && LA75_0<=RULE_BOOLEAN)||LA75_0==31||LA75_0==58||LA75_0==61||LA75_0==65||LA75_0==86||LA75_0==91) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_ID) ) {
                int LA75_2 = input.LA(2);

                if ( (LA75_2==EOF||LA75_2==RULE_ID||LA75_2==RULE_COMMENT_ANNOTATION||(LA75_2>=16 && LA75_2<=18)||LA75_2==20||(LA75_2>=27 && LA75_2<=30)||LA75_2==33||LA75_2==36||(LA75_2>=41 && LA75_2<=46)||(LA75_2>=48 && LA75_2<=55)||LA75_2==58||LA75_2==60||(LA75_2>=62 && LA75_2<=63)||(LA75_2>=65 && LA75_2<=69)||(LA75_2>=82 && LA75_2<=85)||(LA75_2>=87 && LA75_2<=90)||(LA75_2>=92 && LA75_2<=100)) ) {
                    alt75=1;
                }
            }
            switch (alt75) {
                case 1 :
                    // InternalSct.g:2520:1: (lv_trigger_4_0= ruleBoolExpression )
                    {
                    // InternalSct.g:2520:1: (lv_trigger_4_0= ruleBoolExpression )
                    // InternalSct.g:2521:3: lv_trigger_4_0= ruleBoolExpression
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

            // InternalSct.g:2537:3: (otherlv_5= ';' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==20) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalSct.g:2537:5: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:2549:1: entryRuleIterateAction returns [EObject current=null] : iv_ruleIterateAction= ruleIterateAction EOF ;
    public final EObject entryRuleIterateAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterateAction = null;


        try {
            // InternalSct.g:2550:2: (iv_ruleIterateAction= ruleIterateAction EOF )
            // InternalSct.g:2551:2: iv_ruleIterateAction= ruleIterateAction EOF
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
    // InternalSct.g:2558:1: ruleIterateAction returns [EObject current=null] : ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'iterate' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? ) ;
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
            // InternalSct.g:2561:28: ( ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'iterate' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? ) )
            // InternalSct.g:2562:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'iterate' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? )
            {
            // InternalSct.g:2562:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'iterate' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? )
            // InternalSct.g:2562:2: () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'iterate' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )?
            {
            // InternalSct.g:2562:2: ()
            // InternalSct.g:2563:2: 
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

            // InternalSct.g:2571:2: ( (lv_immediate_1_0= 'immediate' ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==36) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalSct.g:2572:1: (lv_immediate_1_0= 'immediate' )
                    {
                    // InternalSct.g:2572:1: (lv_immediate_1_0= 'immediate' )
                    // InternalSct.g:2573:3: lv_immediate_1_0= 'immediate'
                    {
                    lv_immediate_1_0=(Token)match(input,36,FollowSets000.FOLLOW_64); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIterateActionAccess().getIterateKeyword_2());
                  
            }
            // InternalSct.g:2590:1: ( (lv_trigger_3_0= ruleBoolExpression ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=RULE_STRING && LA78_0<=RULE_BOOLEAN)||LA78_0==31||LA78_0==58||LA78_0==61||LA78_0==65||LA78_0==86||LA78_0==91) ) {
                alt78=1;
            }
            else if ( (LA78_0==RULE_ID) ) {
                int LA78_2 = input.LA(2);

                if ( (LA78_2==EOF||LA78_2==RULE_ID||LA78_2==RULE_COMMENT_ANNOTATION||(LA78_2>=16 && LA78_2<=18)||LA78_2==20||(LA78_2>=27 && LA78_2<=30)||LA78_2==33||LA78_2==36||LA78_2==39||(LA78_2>=41 && LA78_2<=46)||(LA78_2>=48 && LA78_2<=55)||LA78_2==58||LA78_2==60||(LA78_2>=62 && LA78_2<=63)||(LA78_2>=65 && LA78_2<=69)||(LA78_2>=82 && LA78_2<=85)||(LA78_2>=87 && LA78_2<=90)||(LA78_2>=92 && LA78_2<=100)) ) {
                    alt78=1;
                }
            }
            switch (alt78) {
                case 1 :
                    // InternalSct.g:2591:1: (lv_trigger_3_0= ruleBoolExpression )
                    {
                    // InternalSct.g:2591:1: (lv_trigger_3_0= ruleBoolExpression )
                    // InternalSct.g:2592:3: lv_trigger_3_0= ruleBoolExpression
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

            // InternalSct.g:2608:3: (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==39) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalSct.g:2608:5: otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    {
                    otherlv_4=(Token)match(input,39,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getIterateActionAccess().getSolidusKeyword_4_0());
                          
                    }
                    // InternalSct.g:2612:1: ( (lv_effects_5_0= ruleEffect ) )
                    // InternalSct.g:2613:1: (lv_effects_5_0= ruleEffect )
                    {
                    // InternalSct.g:2613:1: (lv_effects_5_0= ruleEffect )
                    // InternalSct.g:2614:3: lv_effects_5_0= ruleEffect
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

                    // InternalSct.g:2630:2: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        alt79 = dfa79.predict(input);
                        switch (alt79) {
                    	case 1 :
                    	    // InternalSct.g:2630:4: otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getIterateActionAccess().getSemicolonKeyword_4_2_0());
                    	          
                    	    }
                    	    // InternalSct.g:2634:1: ( (lv_effects_7_0= ruleEffect ) )
                    	    // InternalSct.g:2635:1: (lv_effects_7_0= ruleEffect )
                    	    {
                    	    // InternalSct.g:2635:1: (lv_effects_7_0= ruleEffect )
                    	    // InternalSct.g:2636:3: lv_effects_7_0= ruleEffect
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
                    	    break loop79;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSct.g:2652:6: (otherlv_8= ';' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==20) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalSct.g:2652:8: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:2666:1: entryRuleTestEntity returns [EObject current=null] : iv_ruleTestEntity= ruleTestEntity EOF ;
    public final EObject entryRuleTestEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestEntity = null;


        try {
            // InternalSct.g:2667:2: (iv_ruleTestEntity= ruleTestEntity EOF )
            // InternalSct.g:2668:2: iv_ruleTestEntity= ruleTestEntity EOF
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
    // InternalSct.g:2675:1: ruleTestEntity returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) ) ;
    public final EObject ruleTestEntity() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;

        EObject lv_effect_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:2678:28: ( ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) ) )
            // InternalSct.g:2679:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )
            {
            // InternalSct.g:2679:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )
            int alt82=2;
            alt82 = dfa82.predict(input);
            switch (alt82) {
                case 1 :
                    // InternalSct.g:2679:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
                    {
                    // InternalSct.g:2679:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
                    // InternalSct.g:2680:1: (lv_expression_0_0= ruleAnnotatedExpression )
                    {
                    // InternalSct.g:2680:1: (lv_expression_0_0= ruleAnnotatedExpression )
                    // InternalSct.g:2681:3: lv_expression_0_0= ruleAnnotatedExpression
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
                    // InternalSct.g:2698:6: ( (lv_effect_1_0= ruleEffect ) )
                    {
                    // InternalSct.g:2698:6: ( (lv_effect_1_0= ruleEffect ) )
                    // InternalSct.g:2699:1: (lv_effect_1_0= ruleEffect )
                    {
                    // InternalSct.g:2699:1: (lv_effect_1_0= ruleEffect )
                    // InternalSct.g:2700:3: lv_effect_1_0= ruleEffect
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
    // InternalSct.g:2724:1: entryRuleAnnotatedExpression returns [EObject current=null] : iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF ;
    public final EObject entryRuleAnnotatedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotatedExpression = null;


        try {
            // InternalSct.g:2725:2: (iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF )
            // InternalSct.g:2726:2: iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF
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
    // InternalSct.g:2733:1: ruleAnnotatedExpression returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAnnotatedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:2736:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalSct.g:2737:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalSct.g:2737:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalSct.g:2737:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalSct.g:2737:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==RULE_COMMENT_ANNOTATION||LA83_0==63) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalSct.g:2738:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:2738:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:2739:3: lv_annotations_0_0= ruleAnnotation
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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAnnotatedExpressionAccess().getExpressionKeyword_1());
                  
            }
            // InternalSct.g:2759:1: ( (lv_expression_2_0= ruleExpression ) )
            // InternalSct.g:2760:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalSct.g:2760:1: (lv_expression_2_0= ruleExpression )
            // InternalSct.g:2761:3: lv_expression_2_0= ruleExpression
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
    // InternalSct.g:2785:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalSct.g:2786:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalSct.g:2787:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalSct.g:2794:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_extern_2_0= 'extern' ) )? ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_input_4_0= 'input' ) )? ( (lv_output_5_0= 'output' ) )? ( (lv_static_6_0= 'static' ) )? ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) ) ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';' ) ;
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
            // InternalSct.g:2797:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_extern_2_0= 'extern' ) )? ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_input_4_0= 'input' ) )? ( (lv_output_5_0= 'output' ) )? ( (lv_static_6_0= 'static' ) )? ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) ) ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';' ) )
            // InternalSct.g:2798:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_extern_2_0= 'extern' ) )? ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_input_4_0= 'input' ) )? ( (lv_output_5_0= 'output' ) )? ( (lv_static_6_0= 'static' ) )? ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) ) ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';' )
            {
            // InternalSct.g:2798:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_extern_2_0= 'extern' ) )? ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_input_4_0= 'input' ) )? ( (lv_output_5_0= 'output' ) )? ( (lv_static_6_0= 'static' ) )? ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) ) ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';' )
            // InternalSct.g:2798:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_extern_2_0= 'extern' ) )? ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_input_4_0= 'input' ) )? ( (lv_output_5_0= 'output' ) )? ( (lv_static_6_0= 'static' ) )? ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) ) ( (lv_valuedObjects_10_0= ruleValuedObject ) ) (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )* otherlv_13= ';'
            {
            // InternalSct.g:2798:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==RULE_COMMENT_ANNOTATION||LA84_0==63) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalSct.g:2799:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:2799:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:2800:3: lv_annotations_0_0= ruleAnnotation
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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            // InternalSct.g:2816:3: ( (lv_const_1_0= 'const' ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==48) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalSct.g:2817:1: (lv_const_1_0= 'const' )
                    {
                    // InternalSct.g:2817:1: (lv_const_1_0= 'const' )
                    // InternalSct.g:2818:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,48,FollowSets000.FOLLOW_67); if (state.failed) return current;
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

            // InternalSct.g:2831:3: ( (lv_extern_2_0= 'extern' ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==49) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalSct.g:2832:1: (lv_extern_2_0= 'extern' )
                    {
                    // InternalSct.g:2832:1: (lv_extern_2_0= 'extern' )
                    // InternalSct.g:2833:3: lv_extern_2_0= 'extern'
                    {
                    lv_extern_2_0=(Token)match(input,49,FollowSets000.FOLLOW_68); if (state.failed) return current;
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

            // InternalSct.g:2846:3: ( (lv_volatile_3_0= 'volatile' ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==50) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalSct.g:2847:1: (lv_volatile_3_0= 'volatile' )
                    {
                    // InternalSct.g:2847:1: (lv_volatile_3_0= 'volatile' )
                    // InternalSct.g:2848:3: lv_volatile_3_0= 'volatile'
                    {
                    lv_volatile_3_0=(Token)match(input,50,FollowSets000.FOLLOW_69); if (state.failed) return current;
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

            // InternalSct.g:2861:3: ( (lv_input_4_0= 'input' ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==51) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalSct.g:2862:1: (lv_input_4_0= 'input' )
                    {
                    // InternalSct.g:2862:1: (lv_input_4_0= 'input' )
                    // InternalSct.g:2863:3: lv_input_4_0= 'input'
                    {
                    lv_input_4_0=(Token)match(input,51,FollowSets000.FOLLOW_70); if (state.failed) return current;
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

            // InternalSct.g:2876:3: ( (lv_output_5_0= 'output' ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==52) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalSct.g:2877:1: (lv_output_5_0= 'output' )
                    {
                    // InternalSct.g:2877:1: (lv_output_5_0= 'output' )
                    // InternalSct.g:2878:3: lv_output_5_0= 'output'
                    {
                    lv_output_5_0=(Token)match(input,52,FollowSets000.FOLLOW_71); if (state.failed) return current;
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

            // InternalSct.g:2891:3: ( (lv_static_6_0= 'static' ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==53) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalSct.g:2892:1: (lv_static_6_0= 'static' )
                    {
                    // InternalSct.g:2892:1: (lv_static_6_0= 'static' )
                    // InternalSct.g:2893:3: lv_static_6_0= 'static'
                    {
                    lv_static_6_0=(Token)match(input,53,FollowSets000.FOLLOW_72); if (state.failed) return current;
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

            // InternalSct.g:2906:3: ( ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) ) | ( (lv_signal_9_0= 'signal' ) ) )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==54) ) {
                int LA92_1 = input.LA(2);

                if ( ((LA92_1>=94 && LA92_1<=100)) ) {
                    alt92=1;
                }
                else if ( (LA92_1==RULE_ID) ) {
                    alt92=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 92, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA92_0>=94 && LA92_0<=100)) ) {
                alt92=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // InternalSct.g:2906:4: ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) )
                    {
                    // InternalSct.g:2906:4: ( ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) ) )
                    // InternalSct.g:2906:5: ( (lv_signal_7_0= 'signal' ) )? ( (lv_type_8_0= ruleValueType ) )
                    {
                    // InternalSct.g:2906:5: ( (lv_signal_7_0= 'signal' ) )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==54) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // InternalSct.g:2907:1: (lv_signal_7_0= 'signal' )
                            {
                            // InternalSct.g:2907:1: (lv_signal_7_0= 'signal' )
                            // InternalSct.g:2908:3: lv_signal_7_0= 'signal'
                            {
                            lv_signal_7_0=(Token)match(input,54,FollowSets000.FOLLOW_72); if (state.failed) return current;
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

                    // InternalSct.g:2921:3: ( (lv_type_8_0= ruleValueType ) )
                    // InternalSct.g:2922:1: (lv_type_8_0= ruleValueType )
                    {
                    // InternalSct.g:2922:1: (lv_type_8_0= ruleValueType )
                    // InternalSct.g:2923:3: lv_type_8_0= ruleValueType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeValueTypeEnumRuleCall_7_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
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
                    // InternalSct.g:2940:6: ( (lv_signal_9_0= 'signal' ) )
                    {
                    // InternalSct.g:2940:6: ( (lv_signal_9_0= 'signal' ) )
                    // InternalSct.g:2941:1: (lv_signal_9_0= 'signal' )
                    {
                    // InternalSct.g:2941:1: (lv_signal_9_0= 'signal' )
                    // InternalSct.g:2942:3: lv_signal_9_0= 'signal'
                    {
                    lv_signal_9_0=(Token)match(input,54,FollowSets000.FOLLOW_15); if (state.failed) return current;
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

            // InternalSct.g:2955:3: ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            // InternalSct.g:2956:1: (lv_valuedObjects_10_0= ruleValuedObject )
            {
            // InternalSct.g:2956:1: (lv_valuedObjects_10_0= ruleValuedObject )
            // InternalSct.g:2957:3: lv_valuedObjects_10_0= ruleValuedObject
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

            // InternalSct.g:2973:2: (otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==25) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalSct.g:2973:4: otherlv_11= ',' ( (lv_valuedObjects_12_0= ruleValuedObject ) )
            	    {
            	    otherlv_11=(Token)match(input,25,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getDeclarationAccess().getCommaKeyword_9_0());
            	          
            	    }
            	    // InternalSct.g:2977:1: ( (lv_valuedObjects_12_0= ruleValuedObject ) )
            	    // InternalSct.g:2978:1: (lv_valuedObjects_12_0= ruleValuedObject )
            	    {
            	    // InternalSct.g:2978:1: (lv_valuedObjects_12_0= ruleValuedObject )
            	    // InternalSct.g:2979:3: lv_valuedObjects_12_0= ruleValuedObject
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
            	    break loop93;
                }
            } while (true);

            otherlv_13=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:3007:1: entryRuleValuedObject returns [EObject current=null] : iv_ruleValuedObject= ruleValuedObject EOF ;
    public final EObject entryRuleValuedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObject = null;


        try {
            // InternalSct.g:3008:2: (iv_ruleValuedObject= ruleValuedObject EOF )
            // InternalSct.g:3009:2: iv_ruleValuedObject= ruleValuedObject EOF
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
    // InternalSct.g:3016:1: ruleValuedObject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? ) ;
    public final EObject ruleValuedObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_cardinalities_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_initialValue_5_0 = null;

        Enumerator lv_combineOperator_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3019:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? ) )
            // InternalSct.g:3020:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? )
            {
            // InternalSct.g:3020:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? )
            // InternalSct.g:3020:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )?
            {
            // InternalSct.g:3020:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSct.g:3021:1: (lv_name_0_0= RULE_ID )
            {
            // InternalSct.g:3021:1: (lv_name_0_0= RULE_ID )
            // InternalSct.g:3022:3: lv_name_0_0= RULE_ID
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

            // InternalSct.g:3038:2: (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==55) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalSct.g:3038:4: otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_75); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // InternalSct.g:3042:1: ( (lv_cardinalities_2_0= RULE_INT ) )
            	    // InternalSct.g:3043:1: (lv_cardinalities_2_0= RULE_INT )
            	    {
            	    // InternalSct.g:3043:1: (lv_cardinalities_2_0= RULE_INT )
            	    // InternalSct.g:3044:3: lv_cardinalities_2_0= RULE_INT
            	    {
            	    lv_cardinalities_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_76); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_cardinalities_2_0, grammarAccess.getValuedObjectAccess().getCardinalitiesINTTerminalRuleCall_1_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getValuedObjectRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"cardinalities",
            	              		lv_cardinalities_2_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.INT");
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,56,FollowSets000.FOLLOW_74); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            // InternalSct.g:3064:3: (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==19) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalSct.g:3064:5: otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // InternalSct.g:3068:1: ( (lv_initialValue_5_0= ruleExpression ) )
                    // InternalSct.g:3069:1: (lv_initialValue_5_0= ruleExpression )
                    {
                    // InternalSct.g:3069:1: (lv_initialValue_5_0= ruleExpression )
                    // InternalSct.g:3070:3: lv_initialValue_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getInitialValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_77);
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

            // InternalSct.g:3086:4: (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==57) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalSct.g:3086:6: otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) )
                    {
                    otherlv_6=(Token)match(input,57,FollowSets000.FOLLOW_78); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getValuedObjectAccess().getCombineKeyword_3_0());
                          
                    }
                    // InternalSct.g:3090:1: ( (lv_combineOperator_7_0= ruleCombineOperator ) )
                    // InternalSct.g:3091:1: (lv_combineOperator_7_0= ruleCombineOperator )
                    {
                    // InternalSct.g:3091:1: (lv_combineOperator_7_0= ruleCombineOperator )
                    // InternalSct.g:3092:3: lv_combineOperator_7_0= ruleCombineOperator
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
    // InternalSct.g:3116:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // InternalSct.g:3117:2: (iv_ruleEffect= ruleEffect EOF )
            // InternalSct.g:3118:2: iv_ruleEffect= ruleEffect EOF
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
    // InternalSct.g:3125:1: ruleEffect returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_PostfixEffect_1 = null;

        EObject this_Emission_2 = null;

        EObject this_HostcodeEffect_3 = null;

        EObject this_FunctionCallEffect_4 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3128:28: ( (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect ) )
            // InternalSct.g:3129:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect )
            {
            // InternalSct.g:3129:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect )
            int alt97=5;
            switch ( input.LA(1) ) {
            case RULE_COMMENT_ANNOTATION:
                {
                int LA97_1 = input.LA(2);

                if ( (synpred110_InternalSct()) ) {
                    alt97=1;
                }
                else if ( (synpred111_InternalSct()) ) {
                    alt97=2;
                }
                else if ( (synpred112_InternalSct()) ) {
                    alt97=3;
                }
                else if ( (synpred113_InternalSct()) ) {
                    alt97=4;
                }
                else if ( (true) ) {
                    alt97=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 1, input);

                    throw nvae;
                }
                }
                break;
            case 63:
                {
                int LA97_2 = input.LA(2);

                if ( (synpred110_InternalSct()) ) {
                    alt97=1;
                }
                else if ( (synpred111_InternalSct()) ) {
                    alt97=2;
                }
                else if ( (synpred112_InternalSct()) ) {
                    alt97=3;
                }
                else if ( (synpred113_InternalSct()) ) {
                    alt97=4;
                }
                else if ( (true) ) {
                    alt97=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA97_3 = input.LA(2);

                if ( (synpred110_InternalSct()) ) {
                    alt97=1;
                }
                else if ( (synpred111_InternalSct()) ) {
                    alt97=2;
                }
                else if ( (synpred112_InternalSct()) ) {
                    alt97=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HOSTCODE:
                {
                alt97=4;
                }
                break;
            case 58:
                {
                alt97=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // InternalSct.g:3130:2: this_Assignment_0= ruleAssignment
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
                    // InternalSct.g:3143:2: this_PostfixEffect_1= rulePostfixEffect
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
                    // InternalSct.g:3156:2: this_Emission_2= ruleEmission
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
                    // InternalSct.g:3169:2: this_HostcodeEffect_3= ruleHostcodeEffect
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
                    // InternalSct.g:3182:2: this_FunctionCallEffect_4= ruleFunctionCallEffect
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
    // InternalSct.g:3201:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // InternalSct.g:3202:2: (iv_ruleEmission= ruleEmission EOF )
            // InternalSct.g:3203:2: iv_ruleEmission= ruleEmission EOF
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
    // InternalSct.g:3210:1: ruleEmission returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_newValue_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3213:28: ( ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? ) )
            // InternalSct.g:3214:1: ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? )
            {
            // InternalSct.g:3214:1: ( ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? )
            // InternalSct.g:3214:2: ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            {
            // InternalSct.g:3214:2: ( (lv_annotations_0_0= ruleRestrictedAnnotation ) )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==RULE_COMMENT_ANNOTATION||LA98_0==63) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalSct.g:3215:1: (lv_annotations_0_0= ruleRestrictedAnnotation )
            	    {
            	    // InternalSct.g:3215:1: (lv_annotations_0_0= ruleRestrictedAnnotation )
            	    // InternalSct.g:3216:3: lv_annotations_0_0= ruleRestrictedAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmissionAccess().getAnnotationsRestrictedAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_22);
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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.RestrictedAnnotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);

            // InternalSct.g:3232:3: ( (otherlv_1= RULE_ID ) )
            // InternalSct.g:3233:1: (otherlv_1= RULE_ID )
            {
            // InternalSct.g:3233:1: (otherlv_1= RULE_ID )
            // InternalSct.g:3234:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmissionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // InternalSct.g:3248:2: (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==31) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalSct.g:3248:4: otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // InternalSct.g:3252:1: ( (lv_newValue_3_0= ruleExpression ) )
                    // InternalSct.g:3253:1: (lv_newValue_3_0= ruleExpression )
                    {
                    // InternalSct.g:3253:1: (lv_newValue_3_0= ruleExpression )
                    // InternalSct.g:3254:3: lv_newValue_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_80);
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

                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:3282:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalSct.g:3283:2: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalSct.g:3284:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalSct.g:3291:1: ruleAssignment returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) ) ;
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
            // InternalSct.g:3294:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) ) )
            // InternalSct.g:3295:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) )
            {
            // InternalSct.g:3295:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) )
            // InternalSct.g:3295:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) )
            {
            // InternalSct.g:3295:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==RULE_COMMENT_ANNOTATION||LA100_0==63) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalSct.g:3296:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:3296:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:3297:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_22);
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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);

            // InternalSct.g:3313:3: ( (otherlv_1= RULE_ID ) )
            // InternalSct.g:3314:1: (otherlv_1= RULE_ID )
            {
            // InternalSct.g:3314:1: (otherlv_1= RULE_ID )
            // InternalSct.g:3315:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // InternalSct.g:3329:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==55) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // InternalSct.g:3329:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,55,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalSct.g:3333:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // InternalSct.g:3334:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // InternalSct.g:3334:1: (lv_indices_3_0= ruleExpression )
            	    // InternalSct.g:3335:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_76);
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

            	    otherlv_4=(Token)match(input,56,FollowSets000.FOLLOW_81); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);

            // InternalSct.g:3355:3: ( (lv_operator_5_0= ruleAssignOperator ) )
            // InternalSct.g:3356:1: (lv_operator_5_0= ruleAssignOperator )
            {
            // InternalSct.g:3356:1: (lv_operator_5_0= ruleAssignOperator )
            // InternalSct.g:3357:3: lv_operator_5_0= ruleAssignOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getOperatorAssignOperatorEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_13);
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

            // InternalSct.g:3373:2: ( (lv_expression_6_0= ruleExpression ) )
            // InternalSct.g:3374:1: (lv_expression_6_0= ruleExpression )
            {
            // InternalSct.g:3374:1: (lv_expression_6_0= ruleExpression )
            // InternalSct.g:3375:3: lv_expression_6_0= ruleExpression
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
    // InternalSct.g:3399:1: entryRulePostfixEffect returns [EObject current=null] : iv_rulePostfixEffect= rulePostfixEffect EOF ;
    public final EObject entryRulePostfixEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixEffect = null;


        try {
            // InternalSct.g:3400:2: (iv_rulePostfixEffect= rulePostfixEffect EOF )
            // InternalSct.g:3401:2: iv_rulePostfixEffect= rulePostfixEffect EOF
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
    // InternalSct.g:3408:1: rulePostfixEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) ) ;
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
            // InternalSct.g:3411:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) ) )
            // InternalSct.g:3412:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) )
            {
            // InternalSct.g:3412:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) )
            // InternalSct.g:3412:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) )
            {
            // InternalSct.g:3412:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==RULE_COMMENT_ANNOTATION||LA102_0==63) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // InternalSct.g:3413:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:3413:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:3414:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_22);
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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);

            // InternalSct.g:3430:3: ( (otherlv_1= RULE_ID ) )
            // InternalSct.g:3431:1: (otherlv_1= RULE_ID )
            {
            // InternalSct.g:3431:1: (otherlv_1= RULE_ID )
            // InternalSct.g:3432:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPostfixEffectRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getPostfixEffectAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // InternalSct.g:3446:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==55) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // InternalSct.g:3446:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,55,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPostfixEffectAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalSct.g:3450:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // InternalSct.g:3451:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // InternalSct.g:3451:1: (lv_indices_3_0= ruleExpression )
            	    // InternalSct.g:3452:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_76);
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

            	    otherlv_4=(Token)match(input,56,FollowSets000.FOLLOW_82); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getPostfixEffectAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);

            // InternalSct.g:3472:3: ( (lv_operator_5_0= rulePostfixOperator ) )
            // InternalSct.g:3473:1: (lv_operator_5_0= rulePostfixOperator )
            {
            // InternalSct.g:3473:1: (lv_operator_5_0= rulePostfixOperator )
            // InternalSct.g:3474:3: lv_operator_5_0= rulePostfixOperator
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
    // InternalSct.g:3498:1: entryRuleHostcodeEffect returns [EObject current=null] : iv_ruleHostcodeEffect= ruleHostcodeEffect EOF ;
    public final EObject entryRuleHostcodeEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostcodeEffect = null;


        try {
            // InternalSct.g:3499:2: (iv_ruleHostcodeEffect= ruleHostcodeEffect EOF )
            // InternalSct.g:3500:2: iv_ruleHostcodeEffect= ruleHostcodeEffect EOF
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
    // InternalSct.g:3507:1: ruleHostcodeEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) ;
    public final EObject ruleHostcodeEffect() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3510:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) )
            // InternalSct.g:3511:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            {
            // InternalSct.g:3511:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            // InternalSct.g:3511:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) )
            {
            // InternalSct.g:3511:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==RULE_COMMENT_ANNOTATION||LA104_0==63) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // InternalSct.g:3512:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:3512:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:3513:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHostcodeEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_83);
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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop104;
                }
            } while (true);

            // InternalSct.g:3529:3: ( (lv_text_1_0= RULE_HOSTCODE ) )
            // InternalSct.g:3530:1: (lv_text_1_0= RULE_HOSTCODE )
            {
            // InternalSct.g:3530:1: (lv_text_1_0= RULE_HOSTCODE )
            // InternalSct.g:3531:3: lv_text_1_0= RULE_HOSTCODE
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
    // InternalSct.g:3555:1: entryRuleFunctionCallEffect returns [EObject current=null] : iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF ;
    public final EObject entryRuleFunctionCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallEffect = null;


        try {
            // InternalSct.g:3556:2: (iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF )
            // InternalSct.g:3557:2: iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF
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
    // InternalSct.g:3564:1: ruleFunctionCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' ) ;
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
            // InternalSct.g:3567:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' ) )
            // InternalSct.g:3568:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' )
            {
            // InternalSct.g:3568:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' )
            // InternalSct.g:3568:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>'
            {
            // InternalSct.g:3568:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==RULE_COMMENT_ANNOTATION||LA105_0==63) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // InternalSct.g:3569:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct.g:3569:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct.g:3570:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_84);
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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);

            otherlv_1=(Token)match(input,58,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionCallEffectAccess().getLessThanSignKeyword_1());
                  
            }
            // InternalSct.g:3590:1: ( (lv_functionName_2_0= ruleExtendedID ) )
            // InternalSct.g:3591:1: (lv_functionName_2_0= ruleExtendedID )
            {
            // InternalSct.g:3591:1: (lv_functionName_2_0= ruleExtendedID )
            // InternalSct.g:3592:3: lv_functionName_2_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getFunctionNameExtendedIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_85);
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct.g:3608:2: ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )?
            int alt107=3;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==31) ) {
                alt107=1;
            }
            else if ( (LA107_0==59) ) {
                alt107=2;
            }
            switch (alt107) {
                case 1 :
                    // InternalSct.g:3608:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    {
                    // InternalSct.g:3608:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    // InternalSct.g:3608:5: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_86); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_3_0_0());
                          
                    }
                    // InternalSct.g:3612:1: ( (lv_parameters_4_0= ruleParameter ) )
                    // InternalSct.g:3613:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalSct.g:3613:1: (lv_parameters_4_0= ruleParameter )
                    // InternalSct.g:3614:3: lv_parameters_4_0= ruleParameter
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

                    // InternalSct.g:3630:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==25) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // InternalSct.g:3630:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_86); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_3_0_2_0());
                    	          
                    	    }
                    	    // InternalSct.g:3634:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // InternalSct.g:3635:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // InternalSct.g:3635:1: (lv_parameters_6_0= ruleParameter )
                    	    // InternalSct.g:3636:3: lv_parameters_6_0= ruleParameter
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
                    	    break loop106;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,32,FollowSets000.FOLLOW_87); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_3_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:3657:7: otherlv_8= '()'
                    {
                    otherlv_8=(Token)match(input,59,FollowSets000.FOLLOW_87); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_3_1());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:3673:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSct.g:3674:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalSct.g:3675:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalSct.g:3682:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3685:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // InternalSct.g:3686:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // InternalSct.g:3686:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt108=2;
            alt108 = dfa108.predict(input);
            switch (alt108) {
                case 1 :
                    // InternalSct.g:3687:2: this_BoolExpression_0= ruleBoolExpression
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
                    // InternalSct.g:3700:2: this_ValuedExpression_1= ruleValuedExpression
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
    // InternalSct.g:3719:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // InternalSct.g:3720:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // InternalSct.g:3721:2: iv_ruleBoolExpression= ruleBoolExpression EOF
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
    // InternalSct.g:3728:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3731:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // InternalSct.g:3733:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
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
    // InternalSct.g:3752:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalSct.g:3753:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalSct.g:3754:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
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
    // InternalSct.g:3761:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3764:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) )
            // InternalSct.g:3765:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            {
            // InternalSct.g:3765:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            // InternalSct.g:3766:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_88);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:3777:1: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==92) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalSct.g:3777:2: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    {
                    // InternalSct.g:3777:2: ()
                    // InternalSct.g:3778:2: 
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

                    // InternalSct.g:3786:2: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
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
                    	    // InternalSct.g:3786:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    {
                    	    // InternalSct.g:3786:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    	    // InternalSct.g:3787:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    {
                    	    // InternalSct.g:3787:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    // InternalSct.g:3788:3: lv_operator_2_0= ruleLogicalOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_13);
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

                    	    // InternalSct.g:3804:2: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    // InternalSct.g:3805:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    {
                    	    // InternalSct.g:3805:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    // InternalSct.g:3806:3: lv_subExpressions_3_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_88);
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // InternalSct.g:3830:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalSct.g:3831:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalSct.g:3832:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
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
    // InternalSct.g:3839:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3842:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) )
            // InternalSct.g:3843:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            {
            // InternalSct.g:3843:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            // InternalSct.g:3844:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_89);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:3855:1: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==93) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalSct.g:3855:2: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    {
                    // InternalSct.g:3855:2: ()
                    // InternalSct.g:3856:2: 
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

                    // InternalSct.g:3864:2: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    int cnt111=0;
                    loop111:
                    do {
                        int alt111=2;
                        int LA111_0 = input.LA(1);

                        if ( (LA111_0==93) ) {
                            alt111=1;
                        }


                        switch (alt111) {
                    	case 1 :
                    	    // InternalSct.g:3864:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    // InternalSct.g:3864:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    	    // InternalSct.g:3865:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    {
                    	    // InternalSct.g:3865:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    // InternalSct.g:3866:3: lv_operator_2_0= ruleLogicalAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_13);
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

                    	    // InternalSct.g:3882:2: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    // InternalSct.g:3883:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    {
                    	    // InternalSct.g:3883:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    // InternalSct.g:3884:3: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_89);
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // InternalSct.g:3908:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // InternalSct.g:3909:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // InternalSct.g:3910:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
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
    // InternalSct.g:3917:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3920:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) )
            // InternalSct.g:3921:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            {
            // InternalSct.g:3921:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            // InternalSct.g:3922:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_90);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:3933:1: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==87) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalSct.g:3933:2: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    {
                    // InternalSct.g:3933:2: ()
                    // InternalSct.g:3934:2: 
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

                    // InternalSct.g:3942:2: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    int cnt113=0;
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==87) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // InternalSct.g:3942:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    // InternalSct.g:3942:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    	    // InternalSct.g:3943:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    {
                    	    // InternalSct.g:3943:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    // InternalSct.g:3944:3: lv_operator_2_0= ruleBitwiseOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_13);
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

                    	    // InternalSct.g:3960:2: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    // InternalSct.g:3961:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    {
                    	    // InternalSct.g:3961:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    // InternalSct.g:3962:3: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_90);
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
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // InternalSct.g:3986:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // InternalSct.g:3987:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // InternalSct.g:3988:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
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
    // InternalSct.g:3995:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:3998:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) )
            // InternalSct.g:3999:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            {
            // InternalSct.g:3999:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            // InternalSct.g:4000:2: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_91);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:4011:1: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==62) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalSct.g:4011:2: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    {
                    // InternalSct.g:4011:2: ()
                    // InternalSct.g:4012:2: 
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

                    // InternalSct.g:4020:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    int cnt115=0;
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==62) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // InternalSct.g:4020:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    {
                    	    // InternalSct.g:4020:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    	    // InternalSct.g:4021:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    {
                    	    // InternalSct.g:4021:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    // InternalSct.g:4022:3: lv_operator_2_0= ruleBitwiseAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_13);
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

                    	    // InternalSct.g:4038:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    // InternalSct.g:4039:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    {
                    	    // InternalSct.g:4039:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    // InternalSct.g:4040:3: lv_subExpressions_3_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_91);
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
                    	    if ( cnt115 >= 1 ) break loop115;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(115, input);
                                throw eee;
                        }
                        cnt115++;
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
    // InternalSct.g:4064:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // InternalSct.g:4065:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalSct.g:4066:2: iv_ruleCompareOperation= ruleCompareOperation EOF
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
    // InternalSct.g:4073:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4076:28: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // InternalSct.g:4077:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // InternalSct.g:4077:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // InternalSct.g:4078:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_92);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotOrValuedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:4089:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==58||LA117_0==60||(LA117_0>=82 && LA117_0<=85)) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalSct.g:4089:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // InternalSct.g:4089:2: ()
                    // InternalSct.g:4090:2: 
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

                    // InternalSct.g:4098:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // InternalSct.g:4099:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // InternalSct.g:4099:1: (lv_operator_2_0= ruleCompareOperator )
                    // InternalSct.g:4100:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
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

                    // InternalSct.g:4116:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // InternalSct.g:4117:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // InternalSct.g:4117:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // InternalSct.g:4118:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
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
    // InternalSct.g:4142:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // InternalSct.g:4143:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // InternalSct.g:4144:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
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
    // InternalSct.g:4151:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4154:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // InternalSct.g:4155:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // InternalSct.g:4155:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt118=2;
            alt118 = dfa118.predict(input);
            switch (alt118) {
                case 1 :
                    // InternalSct.g:4156:2: this_ValuedExpression_0= ruleValuedExpression
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
                    // InternalSct.g:4169:2: this_NotExpression_1= ruleNotExpression
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
    // InternalSct.g:4188:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalSct.g:4189:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalSct.g:4190:2: iv_ruleNotExpression= ruleNotExpression EOF
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
    // InternalSct.g:4197:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4200:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // InternalSct.g:4201:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // InternalSct.g:4201:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==61) ) {
                alt119=1;
            }
            else if ( (LA119_0==RULE_ID||LA119_0==RULE_HOSTCODE||LA119_0==RULE_BOOLEAN||LA119_0==31||LA119_0==58||LA119_0==86||LA119_0==91) ) {
                alt119=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }
            switch (alt119) {
                case 1 :
                    // InternalSct.g:4201:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // InternalSct.g:4201:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // InternalSct.g:4201:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // InternalSct.g:4201:3: ()
                    // InternalSct.g:4202:2: 
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

                    // InternalSct.g:4210:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // InternalSct.g:4211:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // InternalSct.g:4211:1: (lv_operator_1_0= ruleNotOperator )
                    // InternalSct.g:4212:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
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

                    // InternalSct.g:4228:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // InternalSct.g:4229:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // InternalSct.g:4229:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // InternalSct.g:4230:3: lv_subExpressions_2_0= ruleNotExpression
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
                    // InternalSct.g:4248:2: this_AtomicExpression_3= ruleAtomicExpression
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
    // InternalSct.g:4267:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // InternalSct.g:4268:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // InternalSct.g:4269:2: iv_ruleValuedExpression= ruleValuedExpression EOF
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
    // InternalSct.g:4276:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4279:28: (this_AddExpression_0= ruleAddExpression )
            // InternalSct.g:4281:2: this_AddExpression_0= ruleAddExpression
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
    // InternalSct.g:4300:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalSct.g:4301:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalSct.g:4302:2: iv_ruleAddExpression= ruleAddExpression EOF
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
    // InternalSct.g:4309:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4312:28: ( (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? ) )
            // InternalSct.g:4313:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? )
            {
            // InternalSct.g:4313:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? )
            // InternalSct.g:4314:2: this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_93);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:4325:1: ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==88) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalSct.g:4325:2: () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+
                    {
                    // InternalSct.g:4325:2: ()
                    // InternalSct.g:4326:2: 
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

                    // InternalSct.g:4334:2: ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+
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
                    	    // InternalSct.g:4334:3: ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    	    {
                    	    // InternalSct.g:4334:3: ( (lv_operator_2_0= ruleAddOperator ) )
                    	    // InternalSct.g:4335:1: (lv_operator_2_0= ruleAddOperator )
                    	    {
                    	    // InternalSct.g:4335:1: (lv_operator_2_0= ruleAddOperator )
                    	    // InternalSct.g:4336:3: lv_operator_2_0= ruleAddOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_94);
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

                    	    // InternalSct.g:4352:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    	    // InternalSct.g:4353:1: (lv_subExpressions_3_0= ruleSubExpression )
                    	    {
                    	    // InternalSct.g:4353:1: (lv_subExpressions_3_0= ruleSubExpression )
                    	    // InternalSct.g:4354:3: lv_subExpressions_3_0= ruleSubExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_93);
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
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleSubExpression"
    // InternalSct.g:4378:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // InternalSct.g:4379:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // InternalSct.g:4380:2: iv_ruleSubExpression= ruleSubExpression EOF
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
    // InternalSct.g:4387:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4390:28: ( (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? ) )
            // InternalSct.g:4391:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? )
            {
            // InternalSct.g:4391:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? )
            // InternalSct.g:4392:2: this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_95);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:4403:1: ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==65) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalSct.g:4403:2: () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+
                    {
                    // InternalSct.g:4403:2: ()
                    // InternalSct.g:4404:2: 
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

                    // InternalSct.g:4412:2: ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+
                    int cnt122=0;
                    loop122:
                    do {
                        int alt122=2;
                        int LA122_0 = input.LA(1);

                        if ( (LA122_0==65) ) {
                            alt122=1;
                        }


                        switch (alt122) {
                    	case 1 :
                    	    // InternalSct.g:4412:3: ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    	    {
                    	    // InternalSct.g:4412:3: ( (lv_operator_2_0= ruleSubOperator ) )
                    	    // InternalSct.g:4413:1: (lv_operator_2_0= ruleSubOperator )
                    	    {
                    	    // InternalSct.g:4413:1: (lv_operator_2_0= ruleSubOperator )
                    	    // InternalSct.g:4414:3: lv_operator_2_0= ruleSubOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_94);
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

                    	    // InternalSct.g:4430:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    	    // InternalSct.g:4431:1: (lv_subExpressions_3_0= ruleMultExpression )
                    	    {
                    	    // InternalSct.g:4431:1: (lv_subExpressions_3_0= ruleMultExpression )
                    	    // InternalSct.g:4432:3: lv_subExpressions_3_0= ruleMultExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_95);
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
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleMultExpression"
    // InternalSct.g:4456:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // InternalSct.g:4457:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // InternalSct.g:4458:2: iv_ruleMultExpression= ruleMultExpression EOF
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
    // InternalSct.g:4465:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4468:28: ( (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? ) )
            // InternalSct.g:4469:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? )
            {
            // InternalSct.g:4469:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? )
            // InternalSct.g:4470:2: this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_96);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:4481:1: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==89) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalSct.g:4481:2: () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+
                    {
                    // InternalSct.g:4481:2: ()
                    // InternalSct.g:4482:2: 
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

                    // InternalSct.g:4490:2: ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+
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
                    	    // InternalSct.g:4490:3: ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    	    {
                    	    // InternalSct.g:4490:3: ( (lv_operator_2_0= ruleMultOperator ) )
                    	    // InternalSct.g:4491:1: (lv_operator_2_0= ruleMultOperator )
                    	    {
                    	    // InternalSct.g:4491:1: (lv_operator_2_0= ruleMultOperator )
                    	    // InternalSct.g:4492:3: lv_operator_2_0= ruleMultOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_94);
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

                    	    // InternalSct.g:4508:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    	    // InternalSct.g:4509:1: (lv_subExpressions_3_0= ruleDivExpression )
                    	    {
                    	    // InternalSct.g:4509:1: (lv_subExpressions_3_0= ruleDivExpression )
                    	    // InternalSct.g:4510:3: lv_subExpressions_3_0= ruleDivExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_96);
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
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // InternalSct.g:4534:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // InternalSct.g:4535:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // InternalSct.g:4536:2: iv_ruleDivExpression= ruleDivExpression EOF
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
    // InternalSct.g:4543:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4546:28: ( (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? ) )
            // InternalSct.g:4547:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? )
            {
            // InternalSct.g:4547:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? )
            // InternalSct.g:4548:2: this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_97);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:4559:1: ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==17) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalSct.g:4559:2: () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+
                    {
                    // InternalSct.g:4559:2: ()
                    // InternalSct.g:4560:2: 
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

                    // InternalSct.g:4568:2: ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+
                    int cnt126=0;
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==17) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // InternalSct.g:4568:3: ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    	    {
                    	    // InternalSct.g:4568:3: ( (lv_operator_2_0= ruleDivOperator ) )
                    	    // InternalSct.g:4569:1: (lv_operator_2_0= ruleDivOperator )
                    	    {
                    	    // InternalSct.g:4569:1: (lv_operator_2_0= ruleDivOperator )
                    	    // InternalSct.g:4570:3: lv_operator_2_0= ruleDivOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_94);
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

                    	    // InternalSct.g:4586:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    	    // InternalSct.g:4587:1: (lv_subExpressions_3_0= ruleModExpression )
                    	    {
                    	    // InternalSct.g:4587:1: (lv_subExpressions_3_0= ruleModExpression )
                    	    // InternalSct.g:4588:3: lv_subExpressions_3_0= ruleModExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_97);
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
    // $ANTLR end "ruleDivExpression"


    // $ANTLR start "entryRuleModExpression"
    // InternalSct.g:4612:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // InternalSct.g:4613:2: (iv_ruleModExpression= ruleModExpression EOF )
            // InternalSct.g:4614:2: iv_ruleModExpression= ruleModExpression EOF
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
    // InternalSct.g:4621:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4624:28: ( (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? ) )
            // InternalSct.g:4625:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? )
            {
            // InternalSct.g:4625:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? )
            // InternalSct.g:4626:2: this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_98);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct.g:4637:1: ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==90) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalSct.g:4637:2: () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+
                    {
                    // InternalSct.g:4637:2: ()
                    // InternalSct.g:4638:2: 
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

                    // InternalSct.g:4646:2: ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+
                    int cnt128=0;
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==90) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // InternalSct.g:4646:3: ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    	    {
                    	    // InternalSct.g:4646:3: ( (lv_operator_2_0= ruleModOperator ) )
                    	    // InternalSct.g:4647:1: (lv_operator_2_0= ruleModOperator )
                    	    {
                    	    // InternalSct.g:4647:1: (lv_operator_2_0= ruleModOperator )
                    	    // InternalSct.g:4648:3: lv_operator_2_0= ruleModOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_94);
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

                    	    // InternalSct.g:4664:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    	    // InternalSct.g:4665:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    	    {
                    	    // InternalSct.g:4665:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    	    // InternalSct.g:4666:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_98);
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
                    	    if ( cnt128 >= 1 ) break loop128;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(128, input);
                                throw eee;
                        }
                        cnt128++;
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
    // InternalSct.g:4690:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // InternalSct.g:4691:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // InternalSct.g:4692:2: iv_ruleNegExpression= ruleNegExpression EOF
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
    // InternalSct.g:4699:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:4702:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // InternalSct.g:4703:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // InternalSct.g:4703:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==65) ) {
                alt130=1;
            }
            else if ( ((LA130_0>=RULE_ID && LA130_0<=RULE_BOOLEAN)||LA130_0==31||LA130_0==58||LA130_0==86||LA130_0==91) ) {
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
                    // InternalSct.g:4703:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // InternalSct.g:4703:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // InternalSct.g:4703:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // InternalSct.g:4703:3: ()
                    // InternalSct.g:4704:2: 
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

                    // InternalSct.g:4712:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // InternalSct.g:4713:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // InternalSct.g:4713:1: (lv_operator_1_0= ruleSubOperator )
                    // InternalSct.g:4714:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_94);
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

                    // InternalSct.g:4730:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // InternalSct.g:4731:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // InternalSct.g:4731:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // InternalSct.g:4732:3: lv_subExpressions_2_0= ruleNegExpression
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
                    // InternalSct.g:4750:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
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
    // InternalSct.g:4769:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalSct.g:4770:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalSct.g:4771:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
    // InternalSct.g:4778:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) ;
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
            // InternalSct.g:4781:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) )
            // InternalSct.g:4782:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            {
            // InternalSct.g:4782:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            int alt131=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt131=1;
                }
                break;
            case RULE_ID:
            case 86:
            case 91:
                {
                alt131=2;
                }
                break;
            case 31:
                {
                alt131=3;
                }
                break;
            case 58:
                {
                alt131=4;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt131=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }

            switch (alt131) {
                case 1 :
                    // InternalSct.g:4783:2: this_BoolValue_0= ruleBoolValue
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
                    // InternalSct.g:4796:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
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
                    // InternalSct.g:4808:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // InternalSct.g:4808:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // InternalSct.g:4808:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_80);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSct.g:4830:2: this_FunctionCall_5= ruleFunctionCall
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
                    // InternalSct.g:4843:2: this_TextExpression_6= ruleTextExpression
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
    // InternalSct.g:4862:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // InternalSct.g:4863:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // InternalSct.g:4864:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
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
    // InternalSct.g:4871:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) ;
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
            // InternalSct.g:4874:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) )
            // InternalSct.g:4875:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            {
            // InternalSct.g:4875:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            int alt132=5;
            alt132 = dfa132.predict(input);
            switch (alt132) {
                case 1 :
                    // InternalSct.g:4876:2: this_IntValue_0= ruleIntValue
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
                    // InternalSct.g:4889:2: this_FloatValue_1= ruleFloatValue
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
                    // InternalSct.g:4902:2: this_StringValue_2= ruleStringValue
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
                    // InternalSct.g:4914:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    {
                    // InternalSct.g:4914:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    // InternalSct.g:4914:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_94); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_80);
                    this_ValuedExpression_4=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSct.g:4936:2: this_AtomicExpression_6= ruleAtomicExpression
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
    // InternalSct.g:4955:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // InternalSct.g:4956:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // InternalSct.g:4957:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
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
    // InternalSct.g:4964:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
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
            // InternalSct.g:4967:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // InternalSct.g:4968:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // InternalSct.g:4968:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==86||LA134_0==91) ) {
                alt134=1;
            }
            else if ( (LA134_0==RULE_ID) ) {
                alt134=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }
            switch (alt134) {
                case 1 :
                    // InternalSct.g:4968:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // InternalSct.g:4968:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // InternalSct.g:4968:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // InternalSct.g:4968:3: ()
                    // InternalSct.g:4969:2: 
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

                    // InternalSct.g:4977:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // InternalSct.g:4978:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // InternalSct.g:4978:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // InternalSct.g:4979:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // InternalSct.g:4979:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt133=2;
                    int LA133_0 = input.LA(1);

                    if ( (LA133_0==86) ) {
                        alt133=1;
                    }
                    else if ( (LA133_0==91) ) {
                        alt133=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 133, 0, input);

                        throw nvae;
                    }
                    switch (alt133) {
                        case 1 :
                            // InternalSct.g:4980:3: lv_operator_1_1= rulePreOperator
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
                            // InternalSct.g:4995:8: lv_operator_1_2= ruleValOperator
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

                    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // InternalSct.g:5017:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // InternalSct.g:5018:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // InternalSct.g:5018:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // InternalSct.g:5019:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_80);
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

                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:5041:2: this_ValuedObjectReference_5= ruleValuedObjectReference
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
    // InternalSct.g:5060:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // InternalSct.g:5061:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // InternalSct.g:5062:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
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
    // InternalSct.g:5069:1: ruleValuedObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_indices_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:5072:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) )
            // InternalSct.g:5073:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            {
            // InternalSct.g:5073:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            // InternalSct.g:5073:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            {
            // InternalSct.g:5073:2: ( (otherlv_0= RULE_ID ) )
            // InternalSct.g:5074:1: (otherlv_0= RULE_ID )
            {
            // InternalSct.g:5074:1: (otherlv_0= RULE_ID )
            // InternalSct.g:5075:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_99); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalSct.g:5089:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==55) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // InternalSct.g:5089:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // InternalSct.g:5093:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // InternalSct.g:5094:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // InternalSct.g:5094:1: (lv_indices_2_0= ruleExpression )
            	    // InternalSct.g:5095:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_76);
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

            	    otherlv_3=(Token)match(input,56,FollowSets000.FOLLOW_99); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop135;
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
    // InternalSct.g:5123:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalSct.g:5124:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalSct.g:5125:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalSct.g:5132:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) ;
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
            // InternalSct.g:5135:28: ( (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) )
            // InternalSct.g:5136:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            {
            // InternalSct.g:5136:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            // InternalSct.g:5136:3: otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>'
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0());
                  
            }
            // InternalSct.g:5140:1: ( (lv_functionName_1_0= ruleExtendedID ) )
            // InternalSct.g:5141:1: (lv_functionName_1_0= ruleExtendedID )
            {
            // InternalSct.g:5141:1: (lv_functionName_1_0= ruleExtendedID )
            // InternalSct.g:5142:3: lv_functionName_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_85);
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct.g:5158:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )?
            int alt137=3;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==31) ) {
                alt137=1;
            }
            else if ( (LA137_0==59) ) {
                alt137=2;
            }
            switch (alt137) {
                case 1 :
                    // InternalSct.g:5158:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // InternalSct.g:5158:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // InternalSct.g:5158:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_86); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // InternalSct.g:5162:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalSct.g:5163:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalSct.g:5163:1: (lv_parameters_3_0= ruleParameter )
                    // InternalSct.g:5164:3: lv_parameters_3_0= ruleParameter
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

                    // InternalSct.g:5180:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==25) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // InternalSct.g:5180:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_86); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // InternalSct.g:5184:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalSct.g:5185:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalSct.g:5185:1: (lv_parameters_5_0= ruleParameter )
                    	    // InternalSct.g:5186:3: lv_parameters_5_0= ruleParameter
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
                    	    break loop136;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,32,FollowSets000.FOLLOW_87); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:5207:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,59,FollowSets000.FOLLOW_87); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:5223:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalSct.g:5224:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalSct.g:5225:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalSct.g:5232:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_pureOutput_0_0=null;
        Token lv_callByReference_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:5235:28: ( ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalSct.g:5236:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalSct.g:5236:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalSct.g:5236:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalSct.g:5236:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==61) ) {
                int LA139_1 = input.LA(2);

                if ( (LA139_1==62) ) {
                    alt139=1;
                }
            }
            else if ( (LA139_0==62) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalSct.g:5236:3: ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) )
                    {
                    // InternalSct.g:5236:3: ( (lv_pureOutput_0_0= '!' ) )?
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==61) ) {
                        alt138=1;
                    }
                    switch (alt138) {
                        case 1 :
                            // InternalSct.g:5237:1: (lv_pureOutput_0_0= '!' )
                            {
                            // InternalSct.g:5237:1: (lv_pureOutput_0_0= '!' )
                            // InternalSct.g:5238:3: lv_pureOutput_0_0= '!'
                            {
                            lv_pureOutput_0_0=(Token)match(input,61,FollowSets000.FOLLOW_100); if (state.failed) return current;
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

                    // InternalSct.g:5251:3: ( (lv_callByReference_1_0= '&' ) )
                    // InternalSct.g:5252:1: (lv_callByReference_1_0= '&' )
                    {
                    // InternalSct.g:5252:1: (lv_callByReference_1_0= '&' )
                    // InternalSct.g:5253:3: lv_callByReference_1_0= '&'
                    {
                    lv_callByReference_1_0=(Token)match(input,62,FollowSets000.FOLLOW_13); if (state.failed) return current;
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

            // InternalSct.g:5266:4: ( (lv_expression_2_0= ruleExpression ) )
            // InternalSct.g:5267:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalSct.g:5267:1: (lv_expression_2_0= ruleExpression )
            // InternalSct.g:5268:3: lv_expression_2_0= ruleExpression
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
    // InternalSct.g:5292:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // InternalSct.g:5293:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalSct.g:5294:2: iv_ruleTextExpression= ruleTextExpression EOF
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
    // InternalSct.g:5301:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct.g:5304:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // InternalSct.g:5305:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // InternalSct.g:5305:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // InternalSct.g:5306:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // InternalSct.g:5306:1: (lv_text_0_0= RULE_HOSTCODE )
            // InternalSct.g:5307:3: lv_text_0_0= RULE_HOSTCODE
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
    // InternalSct.g:5331:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalSct.g:5332:2: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalSct.g:5333:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalSct.g:5340:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct.g:5343:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalSct.g:5344:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalSct.g:5344:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalSct.g:5345:1: (lv_value_0_0= RULE_INT )
            {
            // InternalSct.g:5345:1: (lv_value_0_0= RULE_INT )
            // InternalSct.g:5346:3: lv_value_0_0= RULE_INT
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.INT");
              	    
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
    // InternalSct.g:5370:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalSct.g:5371:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalSct.g:5372:2: iv_ruleFloatValue= ruleFloatValue EOF
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
    // InternalSct.g:5379:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct.g:5382:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalSct.g:5383:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalSct.g:5383:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalSct.g:5384:1: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalSct.g:5384:1: (lv_value_0_0= RULE_FLOAT )
            // InternalSct.g:5385:3: lv_value_0_0= RULE_FLOAT
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.FLOAT");
              	    
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
    // InternalSct.g:5409:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // InternalSct.g:5410:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalSct.g:5411:2: iv_ruleBoolValue= ruleBoolValue EOF
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
    // InternalSct.g:5418:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct.g:5421:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalSct.g:5422:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalSct.g:5422:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalSct.g:5423:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalSct.g:5423:1: (lv_value_0_0= RULE_BOOLEAN )
            // InternalSct.g:5424:3: lv_value_0_0= RULE_BOOLEAN
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.BOOLEAN");
              	    
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
    // InternalSct.g:5448:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalSct.g:5449:2: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalSct.g:5450:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalSct.g:5457:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct.g:5460:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalSct.g:5461:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalSct.g:5461:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSct.g:5462:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalSct.g:5462:1: (lv_value_0_0= RULE_STRING )
            // InternalSct.g:5463:3: lv_value_0_0= RULE_STRING
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.STRING");
              	    
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
    // InternalSct.g:5489:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalSct.g:5490:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalSct.g:5491:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalSct.g:5498:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) ;
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
            // InternalSct.g:5501:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) )
            // InternalSct.g:5502:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            {
            // InternalSct.g:5502:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            int alt140=7;
            alt140 = dfa140.predict(input);
            switch (alt140) {
                case 1 :
                    // InternalSct.g:5503:2: this_CommentAnnotation_0= ruleCommentAnnotation
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
                    // InternalSct.g:5516:2: this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation
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
                    // InternalSct.g:5529:2: this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation
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
                    // InternalSct.g:5542:2: this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation
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
                    // InternalSct.g:5555:2: this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation
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
                    // InternalSct.g:5568:2: this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation
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
                    // InternalSct.g:5581:2: this_TagAnnotation_6= ruleTagAnnotation
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
    // InternalSct.g:5602:1: entryRuleRestrictedAnnotation returns [EObject current=null] : iv_ruleRestrictedAnnotation= ruleRestrictedAnnotation EOF ;
    public final EObject entryRuleRestrictedAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedAnnotation = null;


        try {
            // InternalSct.g:5603:2: (iv_ruleRestrictedAnnotation= ruleRestrictedAnnotation EOF )
            // InternalSct.g:5604:2: iv_ruleRestrictedAnnotation= ruleRestrictedAnnotation EOF
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
    // InternalSct.g:5611:1: ruleRestrictedAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) ;
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
            // InternalSct.g:5614:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) )
            // InternalSct.g:5615:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            {
            // InternalSct.g:5615:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            int alt141=7;
            alt141 = dfa141.predict(input);
            switch (alt141) {
                case 1 :
                    // InternalSct.g:5616:2: this_CommentAnnotation_0= ruleCommentAnnotation
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
                    // InternalSct.g:5629:2: this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation
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
                    // InternalSct.g:5642:2: this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation
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
                    // InternalSct.g:5655:2: this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation
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
                    // InternalSct.g:5668:2: this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation
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
                    // InternalSct.g:5681:2: this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation
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
                    // InternalSct.g:5694:2: this_TagAnnotation_6= ruleTagAnnotation
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
    // InternalSct.g:5713:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // InternalSct.g:5714:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // InternalSct.g:5715:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
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
    // InternalSct.g:5722:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct.g:5725:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // InternalSct.g:5726:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // InternalSct.g:5726:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // InternalSct.g:5727:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // InternalSct.g:5727:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // InternalSct.g:5728:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.COMMENT_ANNOTATION");
              	    
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
    // InternalSct.g:5752:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // InternalSct.g:5753:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // InternalSct.g:5754:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
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
    // InternalSct.g:5761:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:5764:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalSct.g:5765:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalSct.g:5765:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalSct.g:5765:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:5769:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:5770:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:5770:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:5771:3: lv_name_1_0= ruleExtendedID
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
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
    // InternalSct.g:5795:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // InternalSct.g:5796:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // InternalSct.g:5797:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
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
    // InternalSct.g:5804:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:5807:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* ) )
            // InternalSct.g:5808:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )
            {
            // InternalSct.g:5808:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )
            // InternalSct.g:5808:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:5812:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:5813:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:5813:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:5814:3: lv_name_1_0= ruleExtendedID
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct.g:5830:2: ( (lv_values_2_0= ruleEString ) )
            // InternalSct.g:5831:1: (lv_values_2_0= ruleEString )
            {
            // InternalSct.g:5831:1: (lv_values_2_0= ruleEString )
            // InternalSct.g:5832:3: lv_values_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_23);
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct.g:5848:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==25) ) {
                    alt142=1;
                }


                switch (alt142) {
            	case 1 :
            	    // InternalSct.g:5848:4: otherlv_3= ',' ( (lv_values_4_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_101); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalSct.g:5852:1: ( (lv_values_4_0= ruleEString ) )
            	    // InternalSct.g:5853:1: (lv_values_4_0= ruleEString )
            	    {
            	    // InternalSct.g:5853:1: (lv_values_4_0= ruleEString )
            	    // InternalSct.g:5854:3: lv_values_4_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.EString");
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
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // InternalSct.g:5878:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // InternalSct.g:5879:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // InternalSct.g:5880:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
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
    // InternalSct.g:5887:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) ;
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
            // InternalSct.g:5890:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) )
            // InternalSct.g:5891:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            {
            // InternalSct.g:5891:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            // InternalSct.g:5891:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:5895:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:5896:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:5896:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:5897:3: lv_name_1_0= ruleExtendedID
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,55,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalSct.g:5917:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalSct.g:5918:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalSct.g:5918:1: (lv_type_3_0= ruleExtendedID )
            // InternalSct.g:5919:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_76);
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,56,FollowSets000.FOLLOW_103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalSct.g:5939:1: ( (lv_values_5_0= ruleEStringBoolean ) )
            // InternalSct.g:5940:1: (lv_values_5_0= ruleEStringBoolean )
            {
            // InternalSct.g:5940:1: (lv_values_5_0= ruleEStringBoolean )
            // InternalSct.g:5941:3: lv_values_5_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_23);
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.EStringBoolean");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct.g:5957:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            loop143:
            do {
                int alt143=2;
                int LA143_0 = input.LA(1);

                if ( (LA143_0==25) ) {
                    alt143=1;
                }


                switch (alt143) {
            	case 1 :
            	    // InternalSct.g:5957:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_103); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalSct.g:5961:1: ( (lv_values_7_0= ruleEStringBoolean ) )
            	    // InternalSct.g:5962:1: (lv_values_7_0= ruleEStringBoolean )
            	    {
            	    // InternalSct.g:5962:1: (lv_values_7_0= ruleEStringBoolean )
            	    // InternalSct.g:5963:3: lv_values_7_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.EStringBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
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
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // InternalSct.g:5987:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            // InternalSct.g:5988:2: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // InternalSct.g:5989:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalSct.g:5996:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:5999:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // InternalSct.g:6000:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // InternalSct.g:6000:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // InternalSct.g:6000:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:6004:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:6005:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:6005:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:6006:3: lv_name_1_0= ruleExtendedID
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct.g:6022:2: ( (lv_values_2_0= RULE_STRING ) )
            // InternalSct.g:6023:1: (lv_values_2_0= RULE_STRING )
            {
            // InternalSct.g:6023:1: (lv_values_2_0= RULE_STRING )
            // InternalSct.g:6024:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_23); if (state.failed) return current;
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.STRING");
              	    
            }

            }


            }

            // InternalSct.g:6040:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==25) ) {
                    alt144=1;
                }


                switch (alt144) {
            	case 1 :
            	    // InternalSct.g:6040:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_104); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalSct.g:6044:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalSct.g:6045:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalSct.g:6045:1: (lv_values_4_0= RULE_STRING )
            	    // InternalSct.g:6046:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_23); if (state.failed) return current;
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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.STRING");
            	      	    
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
    // $ANTLR end "ruleQuotedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedTypedKeyStringValueAnnotation"
    // InternalSct.g:6070:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            // InternalSct.g:6071:2: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalSct.g:6072:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalSct.g:6079:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
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
            // InternalSct.g:6082:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // InternalSct.g:6083:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // InternalSct.g:6083:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // InternalSct.g:6083:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:6087:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:6088:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:6088:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:6089:3: lv_name_1_0= ruleExtendedID
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,55,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalSct.g:6109:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalSct.g:6110:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalSct.g:6110:1: (lv_type_3_0= ruleExtendedID )
            // InternalSct.g:6111:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_76);
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,56,FollowSets000.FOLLOW_104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalSct.g:6131:1: ( (lv_values_5_0= RULE_STRING ) )
            // InternalSct.g:6132:1: (lv_values_5_0= RULE_STRING )
            {
            // InternalSct.g:6132:1: (lv_values_5_0= RULE_STRING )
            // InternalSct.g:6133:3: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_23); if (state.failed) return current;
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.STRING");
              	    
            }

            }


            }

            // InternalSct.g:6149:2: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop145:
            do {
                int alt145=2;
                int LA145_0 = input.LA(1);

                if ( (LA145_0==25) ) {
                    alt145=1;
                }


                switch (alt145) {
            	case 1 :
            	    // InternalSct.g:6149:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_104); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalSct.g:6153:1: ( (lv_values_7_0= RULE_STRING ) )
            	    // InternalSct.g:6154:1: (lv_values_7_0= RULE_STRING )
            	    {
            	    // InternalSct.g:6154:1: (lv_values_7_0= RULE_STRING )
            	    // InternalSct.g:6155:3: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_23); if (state.failed) return current;
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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.STRING");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop145;
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
    // InternalSct.g:6179:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            // InternalSct.g:6180:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // InternalSct.g:6181:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
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
    // InternalSct.g:6188:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:6191:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) )
            // InternalSct.g:6192:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            {
            // InternalSct.g:6192:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            // InternalSct.g:6192:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:6196:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:6197:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:6197:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:6198:3: lv_name_1_0= ruleExtendedID
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct.g:6214:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // InternalSct.g:6215:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // InternalSct.g:6215:1: (lv_value_2_0= RULE_BOOLEAN )
            // InternalSct.g:6216:3: lv_value_2_0= RULE_BOOLEAN
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.BOOLEAN");
              	    
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
    // InternalSct.g:6240:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            // InternalSct.g:6241:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // InternalSct.g:6242:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
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
    // InternalSct.g:6249:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:6252:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) )
            // InternalSct.g:6253:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            {
            // InternalSct.g:6253:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            // InternalSct.g:6253:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) )
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:6257:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:6258:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:6258:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:6259:3: lv_name_1_0= ruleExtendedID
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct.g:6275:2: ( (lv_value_2_0= ruleInteger ) )
            // InternalSct.g:6276:1: (lv_value_2_0= ruleInteger )
            {
            // InternalSct.g:6276:1: (lv_value_2_0= ruleInteger )
            // InternalSct.g:6277:3: lv_value_2_0= ruleInteger
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.Integer");
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
    // InternalSct.g:6301:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            // InternalSct.g:6302:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // InternalSct.g:6303:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
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
    // InternalSct.g:6310:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) ;
    public final EObject ruleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:6313:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) )
            // InternalSct.g:6314:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            {
            // InternalSct.g:6314:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            // InternalSct.g:6314:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) )
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct.g:6318:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct.g:6319:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct.g:6319:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct.g:6320:3: lv_name_1_0= ruleExtendedID
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct.g:6336:2: ( (lv_value_2_0= ruleFloateger ) )
            // InternalSct.g:6337:1: (lv_value_2_0= ruleFloateger )
            {
            // InternalSct.g:6337:1: (lv_value_2_0= ruleFloateger )
            // InternalSct.g:6338:3: lv_value_2_0= ruleFloateger
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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.Floateger");
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
    // InternalSct.g:6362:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSct.g:6363:2: (iv_ruleEString= ruleEString EOF )
            // InternalSct.g:6364:2: iv_ruleEString= ruleEString EOF
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
    // InternalSct.g:6371:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:6374:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) )
            // InternalSct.g:6375:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            {
            // InternalSct.g:6375:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==RULE_STRING) ) {
                alt146=1;
            }
            else if ( (LA146_0==RULE_ID) ) {
                alt146=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;
            }
            switch (alt146) {
                case 1 :
                    // InternalSct.g:6375:6: this_STRING_0= RULE_STRING
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
                    // InternalSct.g:6384:5: this_ExtendedID_1= ruleExtendedID
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
    // InternalSct.g:6402:1: entryRuleEStringBoolean returns [String current=null] : iv_ruleEStringBoolean= ruleEStringBoolean EOF ;
    public final String entryRuleEStringBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringBoolean = null;


        try {
            // InternalSct.g:6403:2: (iv_ruleEStringBoolean= ruleEStringBoolean EOF )
            // InternalSct.g:6404:2: iv_ruleEStringBoolean= ruleEStringBoolean EOF
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
    // InternalSct.g:6411:1: ruleEStringBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleEStringBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // InternalSct.g:6414:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) )
            // InternalSct.g:6415:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            {
            // InternalSct.g:6415:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            int alt147=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt147=1;
                }
                break;
            case RULE_ID:
                {
                alt147=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt147=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;
            }

            switch (alt147) {
                case 1 :
                    // InternalSct.g:6415:6: this_STRING_0= RULE_STRING
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
                    // InternalSct.g:6424:5: this_ExtendedID_1= ruleExtendedID
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
                    // InternalSct.g:6435:10: this_BOOLEAN_2= RULE_BOOLEAN
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
    // InternalSct.g:6450:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // InternalSct.g:6451:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // InternalSct.g:6452:2: iv_ruleExtendedID= ruleExtendedID EOF
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
    // InternalSct.g:6459:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // InternalSct.g:6462:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) )
            // InternalSct.g:6463:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            {
            // InternalSct.g:6463:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            // InternalSct.g:6463:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalSct.g:6470:1: (kw= '.' this_ID_2= RULE_ID )*
            loop148:
            do {
                int alt148=2;
                int LA148_0 = input.LA(1);

                if ( (LA148_0==21) ) {
                    alt148=1;
                }


                switch (alt148) {
            	case 1 :
            	    // InternalSct.g:6471:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,21,FollowSets000.FOLLOW_15); if (state.failed) return current;
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
            	    break loop148;
                }
            } while (true);

            // InternalSct.g:6483:3: (kw= '#' this_INT_4= RULE_INT )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==64) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalSct.g:6484:2: kw= '#' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_75); if (state.failed) return current;
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
    // InternalSct.g:6504:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalSct.g:6505:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalSct.g:6506:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalSct.g:6513:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalSct.g:6516:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSct.g:6517:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSct.g:6517:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSct.g:6517:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSct.g:6517:2: (kw= '-' )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==65) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalSct.g:6518:2: kw= '-'
                    {
                    kw=(Token)match(input,65,FollowSets000.FOLLOW_75); if (state.failed) return current;
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
    // InternalSct.g:6538:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // InternalSct.g:6539:2: (iv_ruleFloateger= ruleFloateger EOF )
            // InternalSct.g:6540:2: iv_ruleFloateger= ruleFloateger EOF
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
    // InternalSct.g:6547:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            // InternalSct.g:6550:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // InternalSct.g:6551:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // InternalSct.g:6551:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // InternalSct.g:6551:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // InternalSct.g:6551:2: (kw= '-' )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==65) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalSct.g:6552:2: kw= '-'
                    {
                    kw=(Token)match(input,65,FollowSets000.FOLLOW_109); if (state.failed) return current;
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
    // InternalSct.g:6572:1: ruleStateType returns [Enumerator current=null] : ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalSct.g:6574:28: ( ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) ) )
            // InternalSct.g:6575:1: ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) )
            {
            // InternalSct.g:6575:1: ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) )
            int alt152=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt152=1;
                }
                break;
            case 67:
                {
                alt152=2;
                }
                break;
            case 68:
                {
                alt152=3;
                }
                break;
            case 69:
                {
                alt152=4;
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
                    // InternalSct.g:6575:2: (enumLiteral_0= 'normal' )
                    {
                    // InternalSct.g:6575:2: (enumLiteral_0= 'normal' )
                    // InternalSct.g:6575:4: enumLiteral_0= 'normal'
                    {
                    enumLiteral_0=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:6581:6: (enumLiteral_1= 'connector' )
                    {
                    // InternalSct.g:6581:6: (enumLiteral_1= 'connector' )
                    // InternalSct.g:6581:8: enumLiteral_1= 'connector'
                    {
                    enumLiteral_1=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getCONNECTOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getStateTypeAccess().getCONNECTOREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSct.g:6587:6: (enumLiteral_2= 'reference' )
                    {
                    // InternalSct.g:6587:6: (enumLiteral_2= 'reference' )
                    // InternalSct.g:6587:8: enumLiteral_2= 'reference'
                    {
                    enumLiteral_2=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSct.g:6593:6: (enumLiteral_3= 'textual' )
                    {
                    // InternalSct.g:6593:6: (enumLiteral_3= 'textual' )
                    // InternalSct.g:6593:8: enumLiteral_3= 'textual'
                    {
                    enumLiteral_3=(Token)match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:6603:1: ruleTransitionType returns [Enumerator current=null] : ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) ) ;
    public final Enumerator ruleTransitionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSct.g:6605:28: ( ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) ) )
            // InternalSct.g:6606:1: ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) )
            {
            // InternalSct.g:6606:1: ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) )
            int alt153=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt153=1;
                }
                break;
            case 71:
                {
                alt153=2;
                }
                break;
            case 72:
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
                    // InternalSct.g:6606:2: (enumLiteral_0= '-->' )
                    {
                    // InternalSct.g:6606:2: (enumLiteral_0= '-->' )
                    // InternalSct.g:6606:4: enumLiteral_0= '-->'
                    {
                    enumLiteral_0=(Token)match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:6612:6: (enumLiteral_1= 'o->' )
                    {
                    // InternalSct.g:6612:6: (enumLiteral_1= 'o->' )
                    // InternalSct.g:6612:8: enumLiteral_1= 'o->'
                    {
                    enumLiteral_1=(Token)match(input,71,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSct.g:6618:6: (enumLiteral_2= '>->' )
                    {
                    // InternalSct.g:6618:6: (enumLiteral_2= '>->' )
                    // InternalSct.g:6618:8: enumLiteral_2= '>->'
                    {
                    enumLiteral_2=(Token)match(input,72,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:6628:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= ':' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6630:28: ( (enumLiteral_0= ':' ) )
            // InternalSct.g:6631:1: (enumLiteral_0= ':' )
            {
            // InternalSct.g:6631:1: (enumLiteral_0= ':' )
            // InternalSct.g:6631:3: enumLiteral_0= ':'
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
    // InternalSct.g:6641:1: ruleHistoryType returns [Enumerator current=null] : ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) ) ;
    public final Enumerator ruleHistoryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSct.g:6643:28: ( ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) ) )
            // InternalSct.g:6644:1: ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) )
            {
            // InternalSct.g:6644:1: ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) )
            int alt154=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt154=1;
                }
                break;
            case 74:
                {
                alt154=2;
                }
                break;
            case 75:
                {
                alt154=3;
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
                    // InternalSct.g:6644:2: (enumLiteral_0= 'reset' )
                    {
                    // InternalSct.g:6644:2: (enumLiteral_0= 'reset' )
                    // InternalSct.g:6644:4: enumLiteral_0= 'reset'
                    {
                    enumLiteral_0=(Token)match(input,73,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHistoryTypeAccess().getRESETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getHistoryTypeAccess().getRESETEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:6650:6: (enumLiteral_1= 'shallow history' )
                    {
                    // InternalSct.g:6650:6: (enumLiteral_1= 'shallow history' )
                    // InternalSct.g:6650:8: enumLiteral_1= 'shallow history'
                    {
                    enumLiteral_1=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHistoryTypeAccess().getSHALLOWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getHistoryTypeAccess().getSHALLOWEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSct.g:6656:6: (enumLiteral_2= 'history' )
                    {
                    // InternalSct.g:6656:6: (enumLiteral_2= 'history' )
                    // InternalSct.g:6656:8: enumLiteral_2= 'history'
                    {
                    enumLiteral_2=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:6666:1: ruleAssignOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) ) ;
    public final Enumerator ruleAssignOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // InternalSct.g:6668:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) ) )
            // InternalSct.g:6669:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) )
            {
            // InternalSct.g:6669:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) )
            int alt155=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt155=1;
                }
                break;
            case 76:
                {
                alt155=2;
                }
                break;
            case 77:
                {
                alt155=3;
                }
                break;
            case 78:
                {
                alt155=4;
                }
                break;
            case 79:
                {
                alt155=5;
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
                    // InternalSct.g:6669:2: (enumLiteral_0= '=' )
                    {
                    // InternalSct.g:6669:2: (enumLiteral_0= '=' )
                    // InternalSct.g:6669:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:6675:6: (enumLiteral_1= '+=' )
                    {
                    // InternalSct.g:6675:6: (enumLiteral_1= '+=' )
                    // InternalSct.g:6675:8: enumLiteral_1= '+='
                    {
                    enumLiteral_1=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSct.g:6681:6: (enumLiteral_2= '-=' )
                    {
                    // InternalSct.g:6681:6: (enumLiteral_2= '-=' )
                    // InternalSct.g:6681:8: enumLiteral_2= '-='
                    {
                    enumLiteral_2=(Token)match(input,77,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSct.g:6687:6: (enumLiteral_3= '*=' )
                    {
                    // InternalSct.g:6687:6: (enumLiteral_3= '*=' )
                    // InternalSct.g:6687:8: enumLiteral_3= '*='
                    {
                    enumLiteral_3=(Token)match(input,78,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSct.g:6693:6: (enumLiteral_4= '/=' )
                    {
                    // InternalSct.g:6693:6: (enumLiteral_4= '/=' )
                    // InternalSct.g:6693:8: enumLiteral_4= '/='
                    {
                    enumLiteral_4=(Token)match(input,79,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:6703:1: rulePostfixOperator returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator rulePostfixOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalSct.g:6705:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalSct.g:6706:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalSct.g:6706:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==80) ) {
                alt156=1;
            }
            else if ( (LA156_0==81) ) {
                alt156=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 156, 0, input);

                throw nvae;
            }
            switch (alt156) {
                case 1 :
                    // InternalSct.g:6706:2: (enumLiteral_0= '++' )
                    {
                    // InternalSct.g:6706:2: (enumLiteral_0= '++' )
                    // InternalSct.g:6706:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,80,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:6712:6: (enumLiteral_1= '--' )
                    {
                    // InternalSct.g:6712:6: (enumLiteral_1= '--' )
                    // InternalSct.g:6712:8: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,81,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:6722:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
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
            // InternalSct.g:6724:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalSct.g:6725:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalSct.g:6725:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt157=6;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt157=1;
                }
                break;
            case 58:
                {
                alt157=2;
                }
                break;
            case 83:
                {
                alt157=3;
                }
                break;
            case 60:
                {
                alt157=4;
                }
                break;
            case 84:
                {
                alt157=5;
                }
                break;
            case 85:
                {
                alt157=6;
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
                    // InternalSct.g:6725:2: (enumLiteral_0= '==' )
                    {
                    // InternalSct.g:6725:2: (enumLiteral_0= '==' )
                    // InternalSct.g:6725:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,82,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:6731:6: (enumLiteral_1= '<' )
                    {
                    // InternalSct.g:6731:6: (enumLiteral_1= '<' )
                    // InternalSct.g:6731:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSct.g:6737:6: (enumLiteral_2= '<=' )
                    {
                    // InternalSct.g:6737:6: (enumLiteral_2= '<=' )
                    // InternalSct.g:6737:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,83,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSct.g:6743:6: (enumLiteral_3= '>' )
                    {
                    // InternalSct.g:6743:6: (enumLiteral_3= '>' )
                    // InternalSct.g:6743:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSct.g:6749:6: (enumLiteral_4= '>=' )
                    {
                    // InternalSct.g:6749:6: (enumLiteral_4= '>=' )
                    // InternalSct.g:6749:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,84,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSct.g:6755:6: (enumLiteral_5= '!=' )
                    {
                    // InternalSct.g:6755:6: (enumLiteral_5= '!=' )
                    // InternalSct.g:6755:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,85,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:6765:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6767:28: ( (enumLiteral_0= 'pre' ) )
            // InternalSct.g:6768:1: (enumLiteral_0= 'pre' )
            {
            // InternalSct.g:6768:1: (enumLiteral_0= 'pre' )
            // InternalSct.g:6768:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,86,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:6778:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6780:28: ( (enumLiteral_0= '|' ) )
            // InternalSct.g:6781:1: (enumLiteral_0= '|' )
            {
            // InternalSct.g:6781:1: (enumLiteral_0= '|' )
            // InternalSct.g:6781:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,87,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:6791:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6793:28: ( (enumLiteral_0= '&' ) )
            // InternalSct.g:6794:1: (enumLiteral_0= '&' )
            {
            // InternalSct.g:6794:1: (enumLiteral_0= '&' )
            // InternalSct.g:6794:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:6804:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6806:28: ( (enumLiteral_0= '!' ) )
            // InternalSct.g:6807:1: (enumLiteral_0= '!' )
            {
            // InternalSct.g:6807:1: (enumLiteral_0= '!' )
            // InternalSct.g:6807:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:6817:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6819:28: ( (enumLiteral_0= '+' ) )
            // InternalSct.g:6820:1: (enumLiteral_0= '+' )
            {
            // InternalSct.g:6820:1: (enumLiteral_0= '+' )
            // InternalSct.g:6820:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,88,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:6830:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6832:28: ( (enumLiteral_0= '-' ) )
            // InternalSct.g:6833:1: (enumLiteral_0= '-' )
            {
            // InternalSct.g:6833:1: (enumLiteral_0= '-' )
            // InternalSct.g:6833:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:6843:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6845:28: ( (enumLiteral_0= '*' ) )
            // InternalSct.g:6846:1: (enumLiteral_0= '*' )
            {
            // InternalSct.g:6846:1: (enumLiteral_0= '*' )
            // InternalSct.g:6846:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,89,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:6856:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6858:28: ( (enumLiteral_0= '%' ) )
            // InternalSct.g:6859:1: (enumLiteral_0= '%' )
            {
            // InternalSct.g:6859:1: (enumLiteral_0= '%' )
            // InternalSct.g:6859:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,90,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:6869:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6871:28: ( (enumLiteral_0= 'val' ) )
            // InternalSct.g:6872:1: (enumLiteral_0= 'val' )
            {
            // InternalSct.g:6872:1: (enumLiteral_0= 'val' )
            // InternalSct.g:6872:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,91,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:6882:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6884:28: ( (enumLiteral_0= '||' ) )
            // InternalSct.g:6885:1: (enumLiteral_0= '||' )
            {
            // InternalSct.g:6885:1: (enumLiteral_0= '||' )
            // InternalSct.g:6885:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,92,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:6895:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct.g:6897:28: ( (enumLiteral_0= '&&' ) )
            // InternalSct.g:6898:1: (enumLiteral_0= '&&' )
            {
            // InternalSct.g:6898:1: (enumLiteral_0= '&&' )
            // InternalSct.g:6898:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,93,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:6912:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) ;
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
            // InternalSct.g:6914:28: ( ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) )
            // InternalSct.g:6915:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            {
            // InternalSct.g:6915:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            int alt158=7;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt158=1;
                }
                break;
            case 95:
                {
                alt158=2;
                }
                break;
            case 96:
                {
                alt158=3;
                }
                break;
            case 97:
                {
                alt158=4;
                }
                break;
            case 98:
                {
                alt158=5;
                }
                break;
            case 99:
                {
                alt158=6;
                }
                break;
            case 100:
                {
                alt158=7;
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
                    // InternalSct.g:6915:2: (enumLiteral_0= 'pure' )
                    {
                    // InternalSct.g:6915:2: (enumLiteral_0= 'pure' )
                    // InternalSct.g:6915:4: enumLiteral_0= 'pure'
                    {
                    enumLiteral_0=(Token)match(input,94,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:6921:6: (enumLiteral_1= 'bool' )
                    {
                    // InternalSct.g:6921:6: (enumLiteral_1= 'bool' )
                    // InternalSct.g:6921:8: enumLiteral_1= 'bool'
                    {
                    enumLiteral_1=(Token)match(input,95,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSct.g:6927:6: (enumLiteral_2= 'unsigned' )
                    {
                    // InternalSct.g:6927:6: (enumLiteral_2= 'unsigned' )
                    // InternalSct.g:6927:8: enumLiteral_2= 'unsigned'
                    {
                    enumLiteral_2=(Token)match(input,96,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSct.g:6933:6: (enumLiteral_3= 'int' )
                    {
                    // InternalSct.g:6933:6: (enumLiteral_3= 'int' )
                    // InternalSct.g:6933:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,97,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSct.g:6939:6: (enumLiteral_4= 'float' )
                    {
                    // InternalSct.g:6939:6: (enumLiteral_4= 'float' )
                    // InternalSct.g:6939:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,98,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSct.g:6945:6: (enumLiteral_5= 'string' )
                    {
                    // InternalSct.g:6945:6: (enumLiteral_5= 'string' )
                    // InternalSct.g:6945:8: enumLiteral_5= 'string'
                    {
                    enumLiteral_5=(Token)match(input,99,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSct.g:6951:6: (enumLiteral_6= 'host' )
                    {
                    // InternalSct.g:6951:6: (enumLiteral_6= 'host' )
                    // InternalSct.g:6951:8: enumLiteral_6= 'host'
                    {
                    enumLiteral_6=(Token)match(input,100,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct.g:6963:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) ;
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
            // InternalSct.g:6965:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) )
            // InternalSct.g:6966:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            {
            // InternalSct.g:6966:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            int alt159=8;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt159=1;
                }
                break;
            case 88:
                {
                alt159=2;
                }
                break;
            case 89:
                {
                alt159=3;
                }
                break;
            case 102:
                {
                alt159=4;
                }
                break;
            case 103:
                {
                alt159=5;
                }
                break;
            case 87:
                {
                alt159=6;
                }
                break;
            case 62:
                {
                alt159=7;
                }
                break;
            case 100:
                {
                alt159=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 159, 0, input);

                throw nvae;
            }

            switch (alt159) {
                case 1 :
                    // InternalSct.g:6966:2: (enumLiteral_0= 'none' )
                    {
                    // InternalSct.g:6966:2: (enumLiteral_0= 'none' )
                    // InternalSct.g:6966:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,101,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct.g:6972:6: (enumLiteral_1= '+' )
                    {
                    // InternalSct.g:6972:6: (enumLiteral_1= '+' )
                    // InternalSct.g:6972:8: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,88,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSct.g:6978:6: (enumLiteral_2= '*' )
                    {
                    // InternalSct.g:6978:6: (enumLiteral_2= '*' )
                    // InternalSct.g:6978:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,89,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSct.g:6984:6: (enumLiteral_3= 'max' )
                    {
                    // InternalSct.g:6984:6: (enumLiteral_3= 'max' )
                    // InternalSct.g:6984:8: enumLiteral_3= 'max'
                    {
                    enumLiteral_3=(Token)match(input,102,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSct.g:6990:6: (enumLiteral_4= 'min' )
                    {
                    // InternalSct.g:6990:6: (enumLiteral_4= 'min' )
                    // InternalSct.g:6990:8: enumLiteral_4= 'min'
                    {
                    enumLiteral_4=(Token)match(input,103,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSct.g:6996:6: (enumLiteral_5= '|' )
                    {
                    // InternalSct.g:6996:6: (enumLiteral_5= '|' )
                    // InternalSct.g:6996:8: enumLiteral_5= '|'
                    {
                    enumLiteral_5=(Token)match(input,87,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSct.g:7002:6: (enumLiteral_6= '&' )
                    {
                    // InternalSct.g:7002:6: (enumLiteral_6= '&' )
                    // InternalSct.g:7002:8: enumLiteral_6= '&'
                    {
                    enumLiteral_6=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalSct.g:7008:6: (enumLiteral_7= 'host' )
                    {
                    // InternalSct.g:7008:6: (enumLiteral_7= 'host' )
                    // InternalSct.g:7008:8: enumLiteral_7= 'host'
                    {
                    enumLiteral_7=(Token)match(input,100,FollowSets000.FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred26_InternalSct
    public final void synpred26_InternalSct_fragment() throws RecognitionException {   
        EObject lv_regions_13_0 = null;

        EObject lv_regions_14_0 = null;

        EObject lv_regions_15_0 = null;


        // InternalSct.g:809:5: ( ( ( (lv_regions_13_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_14_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_15_0= ruleRegion ) )* )
        // InternalSct.g:809:5: ( ( (lv_regions_13_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_14_0= ruleSingleControlflowRegion ) ) )? ( (lv_regions_15_0= ruleRegion ) )*
        {
        // InternalSct.g:809:5: ( ( (lv_regions_13_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_14_0= ruleSingleControlflowRegion ) ) )?
        int alt163=3;
        alt163 = dfa163.predict(input);
        switch (alt163) {
            case 1 :
                // InternalSct.g:809:6: ( (lv_regions_13_0= ruleSingleDataflowRegion ) )
                {
                // InternalSct.g:809:6: ( (lv_regions_13_0= ruleSingleDataflowRegion ) )
                // InternalSct.g:810:1: (lv_regions_13_0= ruleSingleDataflowRegion )
                {
                // InternalSct.g:810:1: (lv_regions_13_0= ruleSingleDataflowRegion )
                // InternalSct.g:811:3: lv_regions_13_0= ruleSingleDataflowRegion
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsSingleDataflowRegionParserRuleCall_4_1_2_0_0_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_110);
                lv_regions_13_0=ruleSingleDataflowRegion();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalSct.g:828:6: ( (lv_regions_14_0= ruleSingleControlflowRegion ) )
                {
                // InternalSct.g:828:6: ( (lv_regions_14_0= ruleSingleControlflowRegion ) )
                // InternalSct.g:829:1: (lv_regions_14_0= ruleSingleControlflowRegion )
                {
                // InternalSct.g:829:1: (lv_regions_14_0= ruleSingleControlflowRegion )
                // InternalSct.g:830:3: lv_regions_14_0= ruleSingleControlflowRegion
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsSingleControlflowRegionParserRuleCall_4_1_2_0_1_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_110);
                lv_regions_14_0=ruleSingleControlflowRegion();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalSct.g:846:4: ( (lv_regions_15_0= ruleRegion ) )*
        loop164:
        do {
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==RULE_COMMENT_ANNOTATION||LA164_0==16||LA164_0==18||LA164_0==63) ) {
                alt164=1;
            }


            switch (alt164) {
        	case 1 :
        	    // InternalSct.g:847:1: (lv_regions_15_0= ruleRegion )
        	    {
        	    // InternalSct.g:847:1: (lv_regions_15_0= ruleRegion )
        	    // InternalSct.g:848:3: lv_regions_15_0= ruleRegion
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsRegionParserRuleCall_4_1_2_1_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_110);
        	    lv_regions_15_0=ruleRegion();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop164;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred26_InternalSct

    // $ANTLR start synpred53_InternalSct
    public final void synpred53_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_expressions_13_0 = null;


        // InternalSct.g:1550:2: ( ( ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';' )* )
        // InternalSct.g:1550:2: ( ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';' )*
        {
        // InternalSct.g:1550:2: ( ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';' )*
        loop177:
        do {
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==RULE_ID) ) {
                alt177=1;
            }


            switch (alt177) {
        	case 1 :
        	    // InternalSct.g:1550:3: ( (otherlv_11= RULE_ID ) ) otherlv_12= '=' ( (lv_expressions_13_0= ruleExpression ) ) otherlv_14= ';'
        	    {
        	    // InternalSct.g:1550:3: ( (otherlv_11= RULE_ID ) )
        	    // InternalSct.g:1551:1: (otherlv_11= RULE_ID )
        	    {
        	    // InternalSct.g:1551:1: (otherlv_11= RULE_ID )
        	    // InternalSct.g:1552:3: otherlv_11= RULE_ID
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      		  /* */ 
        	      		
        	    }
        	    otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return ;

        	    }


        	    }

        	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_13); if (state.failed) return ;
        	    // InternalSct.g:1570:1: ( (lv_expressions_13_0= ruleExpression ) )
        	    // InternalSct.g:1571:1: (lv_expressions_13_0= ruleExpression )
        	    {
        	    // InternalSct.g:1571:1: (lv_expressions_13_0= ruleExpression )
        	    // InternalSct.g:1572:3: lv_expressions_13_0= ruleExpression
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getDefineNodeAccess().getExpressionsExpressionParserRuleCall_11_0_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_14);
        	    lv_expressions_13_0=ruleExpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }

        	    otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_111); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop177;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred53_InternalSct

    // $ANTLR start synpred67_InternalSct
    public final void synpred67_InternalSct_fragment() throws RecognitionException {   
        Token lv_delay_8_0=null;

        // InternalSct.g:1986:1: ( (lv_delay_8_0= RULE_INT ) )
        // InternalSct.g:1986:1: (lv_delay_8_0= RULE_INT )
        {
        // InternalSct.g:1986:1: (lv_delay_8_0= RULE_INT )
        // InternalSct.g:1987:3: lv_delay_8_0= RULE_INT
        {
        lv_delay_8_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred67_InternalSct

    // $ANTLR start synpred74_InternalSct
    public final void synpred74_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_effects_6_0 = null;


        // InternalSct.g:2214:4: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )
        // InternalSct.g:2214:4: otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) )
        {
        otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_55); if (state.failed) return ;
        // InternalSct.g:2218:1: ( (lv_effects_6_0= ruleEffect ) )
        // InternalSct.g:2219:1: (lv_effects_6_0= ruleEffect )
        {
        // InternalSct.g:2219:1: (lv_effects_6_0= ruleEffect )
        // InternalSct.g:2220:3: lv_effects_6_0= ruleEffect
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
    // $ANTLR end synpred74_InternalSct

    // $ANTLR start synpred79_InternalSct
    public final void synpred79_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        EObject lv_effects_7_0 = null;


        // InternalSct.g:2329:4: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )
        // InternalSct.g:2329:4: otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) )
        {
        otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_55); if (state.failed) return ;
        // InternalSct.g:2333:1: ( (lv_effects_7_0= ruleEffect ) )
        // InternalSct.g:2334:1: (lv_effects_7_0= ruleEffect )
        {
        // InternalSct.g:2334:1: (lv_effects_7_0= ruleEffect )
        // InternalSct.g:2335:3: lv_effects_7_0= ruleEffect
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
    // $ANTLR end synpred79_InternalSct

    // $ANTLR start synpred83_InternalSct
    public final void synpred83_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_effects_6_0 = null;


        // InternalSct.g:2429:4: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )
        // InternalSct.g:2429:4: otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) )
        {
        otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_55); if (state.failed) return ;
        // InternalSct.g:2433:1: ( (lv_effects_6_0= ruleEffect ) )
        // InternalSct.g:2434:1: (lv_effects_6_0= ruleEffect )
        {
        // InternalSct.g:2434:1: (lv_effects_6_0= ruleEffect )
        // InternalSct.g:2435:3: lv_effects_6_0= ruleEffect
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
    // $ANTLR end synpred83_InternalSct

    // $ANTLR start synpred92_InternalSct
    public final void synpred92_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        EObject lv_effects_7_0 = null;


        // InternalSct.g:2630:4: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )
        // InternalSct.g:2630:4: otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) )
        {
        otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_55); if (state.failed) return ;
        // InternalSct.g:2634:1: ( (lv_effects_7_0= ruleEffect ) )
        // InternalSct.g:2635:1: (lv_effects_7_0= ruleEffect )
        {
        // InternalSct.g:2635:1: (lv_effects_7_0= ruleEffect )
        // InternalSct.g:2636:3: lv_effects_7_0= ruleEffect
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
    // $ANTLR end synpred92_InternalSct

    // $ANTLR start synpred110_InternalSct
    public final void synpred110_InternalSct_fragment() throws RecognitionException {   
        EObject this_Assignment_0 = null;


        // InternalSct.g:3130:2: (this_Assignment_0= ruleAssignment )
        // InternalSct.g:3130:2: this_Assignment_0= ruleAssignment
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
    // $ANTLR end synpred110_InternalSct

    // $ANTLR start synpred111_InternalSct
    public final void synpred111_InternalSct_fragment() throws RecognitionException {   
        EObject this_PostfixEffect_1 = null;


        // InternalSct.g:3143:2: (this_PostfixEffect_1= rulePostfixEffect )
        // InternalSct.g:3143:2: this_PostfixEffect_1= rulePostfixEffect
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
    // $ANTLR end synpred111_InternalSct

    // $ANTLR start synpred112_InternalSct
    public final void synpred112_InternalSct_fragment() throws RecognitionException {   
        EObject this_Emission_2 = null;


        // InternalSct.g:3156:2: (this_Emission_2= ruleEmission )
        // InternalSct.g:3156:2: this_Emission_2= ruleEmission
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
    // $ANTLR end synpred112_InternalSct

    // $ANTLR start synpred113_InternalSct
    public final void synpred113_InternalSct_fragment() throws RecognitionException {   
        EObject this_HostcodeEffect_3 = null;


        // InternalSct.g:3169:2: (this_HostcodeEffect_3= ruleHostcodeEffect )
        // InternalSct.g:3169:2: this_HostcodeEffect_3= ruleHostcodeEffect
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
    // $ANTLR end synpred113_InternalSct

    // $ANTLR start synpred125_InternalSct
    public final void synpred125_InternalSct_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalSct.g:3687:2: (this_BoolExpression_0= ruleBoolExpression )
        // InternalSct.g:3687:2: this_BoolExpression_0= ruleBoolExpression
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
    // $ANTLR end synpred125_InternalSct

    // $ANTLR start synpred135_InternalSct
    public final void synpred135_InternalSct_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // InternalSct.g:4156:2: (this_ValuedExpression_0= ruleValuedExpression )
        // InternalSct.g:4156:2: this_ValuedExpression_0= ruleValuedExpression
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
    // $ANTLR end synpred135_InternalSct

    // $ANTLR start synpred155_InternalSct
    public final void synpred155_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ValuedExpression_4 = null;


        // InternalSct.g:4914:6: ( (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) )
        // InternalSct.g:4914:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        {
        // InternalSct.g:4914:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        // InternalSct.g:4914:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_94); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_80);
        this_ValuedExpression_4=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred155_InternalSct

    // Delegated rules

    public final boolean synpred92_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred92_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred111_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred111_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred110_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred110_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred112_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred112_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred155_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred155_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred113_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred113_InternalSct_fragment(); // can never throw exception
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
    public final boolean synpred53_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred125_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred135_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred135_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred83_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred83_InternalSct_fragment(); // can never throw exception
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
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA108 dfa108 = new DFA108(this);
    protected DFA118 dfa118 = new DFA118(this);
    protected DFA132 dfa132 = new DFA132(this);
    protected DFA140 dfa140 = new DFA140(this);
    protected DFA141 dfa141 = new DFA141(this);
    protected DFA163 dfa163 = new DFA163(this);
    static final String dfa_1s = "\61\uffff";
    static final String dfa_2s = "\1\1\60\uffff";
    static final String dfa_3s = "\1\12\1\uffff\1\12\1\4\1\uffff\2\4\1\6\2\12\1\4\1\6\3\12\4\4\1\6\1\25\4\12\1\4\1\6\2\4\1\6\1\25\1\70\5\12\2\4\1\6\5\12\1\4\1\6\2\12";
    static final String dfa_4s = "\1\105\1\uffff\1\105\1\4\1\uffff\1\105\1\4\1\6\2\105\1\4\1\10\5\105\1\5\1\4\1\6\1\100\4\105\1\4\1\6\1\11\1\4\1\6\1\100\1\70\5\105\1\11\1\4\1\6\5\105\1\4\1\6\2\105";
    static final String dfa_5s = "\1\uffff\1\2\2\uffff\1\1\54\uffff";
    static final String dfa_6s = "\61\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\5\uffff\1\1\1\uffff\1\1\10\uffff\1\1\3\4\40\uffff\1\3\2\uffff\4\4",
            "",
            "\1\2\5\uffff\1\1\1\uffff\1\1\11\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\5",
            "",
            "\1\11\1\10\1\15\1\uffff\1\14\1\16\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\6\6\uffff\3\4\30\uffff\1\12\7\uffff\1\3\1\7\1\13\4\4",
            "\1\17",
            "\1\20",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\21\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\22\3\uffff\1\21\2\uffff\3\4\40\uffff\1\3\1\23\1\uffff\4\4",
            "\1\24",
            "\1\15\1\uffff\1\14",
            "\1\2\5\uffff\1\1\1\uffff\1\1\11\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\11\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\11\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\11\1\10\1\15\1\uffff\1\14\1\16\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\6\6\uffff\3\4\30\uffff\1\12\7\uffff\1\3\1\7\1\13\4\4",
            "\1\11\1\10\1\15\1\uffff\1\14\1\16\1\2\5\uffff\1\1\1\uffff\1\1\11\uffff\3\4\30\uffff\1\12\7\uffff\1\3\1\uffff\1\13\4\4",
            "\1\26\1\25",
            "\1\27",
            "\1\30",
            "\1\31\42\uffff\1\33\7\uffff\1\32",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\21\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\34\3\uffff\1\21\2\uffff\3\4\40\uffff\1\3\1\35\1\uffff\4\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\22\3\uffff\1\21\2\uffff\3\4\40\uffff\1\3\1\23\1\uffff\4\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\21\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\36",
            "\1\37",
            "\1\41\1\40\3\uffff\1\42",
            "\1\43",
            "\1\44",
            "\1\31\42\uffff\1\33\7\uffff\1\32",
            "\1\33",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\45\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\46\3\uffff\1\45\2\uffff\3\4\40\uffff\1\3\1\47\1\uffff\4\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\45\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\34\3\uffff\1\21\2\uffff\3\4\40\uffff\1\3\1\35\1\uffff\4\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\21\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\51\1\50\3\uffff\1\52",
            "\1\53",
            "\1\54",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\45\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\55\3\uffff\1\45\2\uffff\3\4\40\uffff\1\3\1\56\1\uffff\4\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\45\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\46\3\uffff\1\45\2\uffff\3\4\40\uffff\1\3\1\47\1\uffff\4\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\45\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\57",
            "\1\60",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\55\3\uffff\1\45\2\uffff\3\4\40\uffff\1\3\1\56\1\uffff\4\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\45\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4"
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
    }
    static final String dfa_8s = "\2\12\1\4\2\uffff\2\4\1\6\1\4\2\12\1\6\3\12\2\4\1\25\2\4\1\6\1\4\1\6\1\4\4\12\1\25\1\70\3\12\1\4\1\6\2\4\1\6\7\12\1\4\1\6\2\12";
    static final String dfa_9s = "\2\144\1\4\2\uffff\1\144\1\4\1\6\1\4\2\144\1\10\5\144\1\100\1\5\1\4\1\6\1\4\1\6\1\11\4\144\1\100\1\70\3\144\1\4\1\6\1\11\1\4\1\6\7\144\1\4\1\6\2\144";
    static final String dfa_10s = "\3\uffff\1\2\1\1\54\uffff";
    static final String[] dfa_11s = {
            "\1\1\21\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\21\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\5",
            "",
            "",
            "\1\12\1\11\1\15\1\uffff\1\14\1\16\1\1\12\uffff\1\6\6\uffff\3\3\21\uffff\7\4\1\10\7\uffff\1\2\1\7\1\13\4\3\30\uffff\7\4",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\1\16\uffff\1\22\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\12\uffff\1\23\3\uffff\1\22\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\24\1\uffff\4\3\30\uffff\7\4",
            "\1\15\1\uffff\1\14",
            "\1\1\21\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\21\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\21\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\12\1\11\1\15\1\uffff\1\14\1\16\1\1\12\uffff\1\6\6\uffff\3\3\21\uffff\7\4\1\10\7\uffff\1\2\1\7\1\13\4\3\30\uffff\7\4",
            "\1\12\1\11\1\15\1\uffff\1\14\1\16\1\1\21\uffff\3\3\21\uffff\7\4\1\10\7\uffff\1\2\1\uffff\1\13\4\3\30\uffff\7\4",
            "\1\25\42\uffff\1\27\7\uffff\1\26",
            "\1\31\1\30",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\37\1\36\3\uffff\1\40",
            "\1\1\16\uffff\1\22\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\12\uffff\1\41\3\uffff\1\22\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\42\1\uffff\4\3\30\uffff\7\4",
            "\1\1\12\uffff\1\23\3\uffff\1\22\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\24\1\uffff\4\3\30\uffff\7\4",
            "\1\1\16\uffff\1\22\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\25\42\uffff\1\27\7\uffff\1\26",
            "\1\27",
            "\1\1\16\uffff\1\43\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\12\uffff\1\44\3\uffff\1\43\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\45\1\uffff\4\3\30\uffff\7\4",
            "\1\1\16\uffff\1\43\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\46",
            "\1\47",
            "\1\51\1\50\3\uffff\1\52",
            "\1\53",
            "\1\54",
            "\1\1\12\uffff\1\41\3\uffff\1\22\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\42\1\uffff\4\3\30\uffff\7\4",
            "\1\1\16\uffff\1\22\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\16\uffff\1\43\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\12\uffff\1\55\3\uffff\1\43\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\56\1\uffff\4\3\30\uffff\7\4",
            "\1\1\16\uffff\1\43\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\1\12\uffff\1\44\3\uffff\1\43\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\45\1\uffff\4\3\30\uffff\7\4",
            "\1\1\16\uffff\1\43\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4",
            "\1\57",
            "\1\60",
            "\1\1\12\uffff\1\55\3\uffff\1\43\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\1\56\1\uffff\4\3\30\uffff\7\4",
            "\1\1\16\uffff\1\43\2\uffff\3\3\21\uffff\7\4\10\uffff\1\2\2\uffff\4\3\30\uffff\7\4"
    };
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_6;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "()* loopback of 306:1: ( (lv_declarations_6_0= ruleDeclaration ) )*";
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 324:3: ( (lv_states_7_0= ruleState ) )+";
        }
    }
    static final String dfa_12s = "\1\4\1\uffff\1\12\1\4\1\uffff\2\4\1\6\2\12\1\4\1\6\3\12\4\4\1\6\1\25\4\12\1\4\1\6\2\4\1\6\1\25\1\70\5\12\2\4\1\6\5\12\1\4\1\6\2\12";
    static final String dfa_13s = "\1\144\1\uffff\1\144\1\4\1\uffff\1\144\1\4\1\6\2\144\1\4\1\10\5\144\1\5\1\4\1\6\1\100\4\144\1\4\1\6\1\11\1\4\1\6\1\100\1\70\5\144\1\11\1\4\1\6\5\144\1\4\1\6\2\144";
    static final String[] dfa_14s = {
            "\1\1\5\uffff\1\2\5\uffff\1\1\1\uffff\1\1\10\uffff\1\1\5\uffff\1\1\16\uffff\7\4\10\uffff\1\3\36\uffff\7\4",
            "",
            "\1\2\5\uffff\1\1\1\uffff\1\1\35\uffff\7\4\10\uffff\1\3\36\uffff\7\4",
            "\1\5",
            "",
            "\1\11\1\10\1\15\1\uffff\1\14\1\16\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\6\32\uffff\7\4\1\12\7\uffff\1\3\1\7\1\13\34\uffff\7\4",
            "\1\17",
            "\1\20",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\21\26\uffff\7\4\10\uffff\1\3\36\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\22\3\uffff\1\21\26\uffff\7\4\10\uffff\1\3\1\23\35\uffff\7\4",
            "\1\24",
            "\1\15\1\uffff\1\14",
            "\1\2\5\uffff\1\1\1\uffff\1\1\35\uffff\7\4\10\uffff\1\3\36\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\35\uffff\7\4\10\uffff\1\3\36\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\35\uffff\7\4\10\uffff\1\3\36\uffff\7\4",
            "\1\11\1\10\1\15\1\uffff\1\14\1\16\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\6\32\uffff\7\4\1\12\7\uffff\1\3\1\7\1\13\34\uffff\7\4",
            "\1\11\1\10\1\15\1\uffff\1\14\1\16\1\2\5\uffff\1\1\1\uffff\1\1\35\uffff\7\4\1\12\7\uffff\1\3\1\uffff\1\13\34\uffff\7\4",
            "\1\26\1\25",
            "\1\27",
            "\1\30",
            "\1\31\42\uffff\1\33\7\uffff\1\32",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\21\26\uffff\7\4\10\uffff\1\3\36\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\34\3\uffff\1\21\26\uffff\7\4\10\uffff\1\3\1\35\35\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\22\3\uffff\1\21\26\uffff\7\4\10\uffff\1\3\1\23\35\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\21\26\uffff\7\4\10\uffff\1\3\36\uffff\7\4",
            "\1\36",
            "\1\37",
            "\1\41\1\40\3\uffff\1\42",
            "\1\43",
            "\1\44",
            "\1\31\42\uffff\1\33\7\uffff\1\32",
            "\1\33",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\45\26\uffff\7\4\10\uffff\1\3\36\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\46\3\uffff\1\45\26\uffff\7\4\10\uffff\1\3\1\47\35\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\45\26\uffff\7\4\10\uffff\1\3\36\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\34\3\uffff\1\21\26\uffff\7\4\10\uffff\1\3\1\35\35\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\21\26\uffff\7\4\10\uffff\1\3\36\uffff\7\4",
            "\1\51\1\50\3\uffff\1\52",
            "\1\53",
            "\1\54",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\45\26\uffff\7\4\10\uffff\1\3\36\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\55\3\uffff\1\45\26\uffff\7\4\10\uffff\1\3\1\56\35\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\45\26\uffff\7\4\10\uffff\1\3\36\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\46\3\uffff\1\45\26\uffff\7\4\10\uffff\1\3\1\47\35\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\45\26\uffff\7\4\10\uffff\1\3\36\uffff\7\4",
            "\1\57",
            "\1\60",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\55\3\uffff\1\45\26\uffff\7\4\10\uffff\1\3\1\56\35\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\45\26\uffff\7\4\10\uffff\1\3\36\uffff\7\4"
    };
    static final char[] dfa_12 = DFA.unpackEncodedStringToUnsignedChars(dfa_12s);
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_12;
            this.max = dfa_13;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 434:1: ( (lv_declarations_6_0= ruleDeclaration ) )*";
        }
    }
    static final String dfa_15s = "\62\uffff";
    static final String dfa_16s = "\1\4\1\uffff\1\12\1\4\2\uffff\2\4\2\6\1\12\1\4\4\12\2\4\1\25\2\4\1\6\1\4\1\6\1\4\4\12\1\25\1\70\3\12\1\4\1\6\2\4\1\6\7\12\1\4\1\6\2\12";
    static final String dfa_17s = "\1\144\1\uffff\1\144\1\4\2\uffff\1\144\1\4\1\6\1\10\1\144\1\4\6\144\1\100\1\5\1\4\1\6\1\4\1\6\1\11\4\144\1\100\1\70\3\144\1\4\1\6\1\11\1\4\1\6\7\144\1\4\1\6\2\144";
    static final String dfa_18s = "\1\uffff\1\3\2\uffff\1\1\1\2\54\uffff";
    static final String dfa_19s = "\62\uffff}>";
    static final String[] dfa_20s = {
            "\1\1\5\uffff\1\2\5\uffff\1\1\1\uffff\1\1\10\uffff\4\1\2\uffff\1\1\2\uffff\1\5\4\uffff\6\5\1\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "",
            "\1\2\5\uffff\1\1\1\uffff\1\1\11\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\6",
            "",
            "",
            "\1\15\1\14\1\16\1\uffff\1\12\1\17\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\7\6\uffff\3\1\21\uffff\7\4\1\13\7\uffff\1\3\1\10\1\11\4\1\30\uffff\7\4",
            "\1\20",
            "\1\21",
            "\1\16\1\uffff\1\12",
            "\1\2\5\uffff\1\1\1\uffff\1\1\11\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\22",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\23\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\24\3\uffff\1\23\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\1\25\1\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\11\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\11\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\15\1\14\1\16\1\uffff\1\12\1\17\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\7\6\uffff\3\1\21\uffff\7\4\1\13\7\uffff\1\3\1\10\1\11\4\1\30\uffff\7\4",
            "\1\15\1\14\1\16\1\uffff\1\12\1\17\1\2\5\uffff\1\1\1\uffff\1\1\11\uffff\3\1\21\uffff\7\4\1\13\7\uffff\1\3\1\uffff\1\11\4\1\30\uffff\7\4",
            "\1\26\42\uffff\1\30\7\uffff\1\27",
            "\1\32\1\31",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\40\1\37\3\uffff\1\41",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\23\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\42\3\uffff\1\23\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\1\43\1\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\24\3\uffff\1\23\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\1\25\1\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\23\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\26\42\uffff\1\30\7\uffff\1\27",
            "\1\30",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\44\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\45\3\uffff\1\44\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\1\46\1\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\44\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\47",
            "\1\50",
            "\1\52\1\51\3\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\42\3\uffff\1\23\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\1\43\1\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\23\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\44\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\56\3\uffff\1\44\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\1\57\1\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\44\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\45\3\uffff\1\44\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\1\46\1\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\44\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\60",
            "\1\61",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\56\3\uffff\1\44\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\1\57\1\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\44\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4"
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()* loopback of 772:1: ( ( (lv_declarations_11_0= ruleDeclaration ) ) | ( (lv_localActions_12_0= ruleLocalAction ) ) )*";
        }
    }
    static final String dfa_21s = "\1\105\1\uffff\1\105\1\4\2\uffff\1\105\1\4\1\6\1\10\1\105\1\4\6\105\1\100\1\5\1\4\1\6\1\4\1\6\1\11\4\105\1\100\1\70\3\105\1\4\1\6\1\11\1\4\1\6\7\105\1\4\1\6\2\105";
    static final String dfa_22s = "\1\uffff\1\1\2\uffff\1\2\1\3\54\uffff";
    static final String[] dfa_23s = {
            "\1\1\5\uffff\1\2\5\uffff\1\5\1\uffff\1\5\10\uffff\1\5\3\4\2\uffff\1\1\35\uffff\1\3\2\uffff\4\4",
            "",
            "\1\2\5\uffff\1\5\1\uffff\1\5\11\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\6",
            "",
            "",
            "\1\15\1\14\1\16\1\uffff\1\12\1\17\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\7\6\uffff\3\4\30\uffff\1\13\7\uffff\1\3\1\10\1\11\4\4",
            "\1\20",
            "\1\21",
            "\1\16\1\uffff\1\12",
            "\1\2\5\uffff\1\5\1\uffff\1\5\11\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\22",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\23\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\24\3\uffff\1\23\2\uffff\3\4\40\uffff\1\3\1\25\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\11\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\11\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\15\1\14\1\16\1\uffff\1\12\1\17\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\7\6\uffff\3\4\30\uffff\1\13\7\uffff\1\3\1\10\1\11\4\4",
            "\1\15\1\14\1\16\1\uffff\1\12\1\17\1\2\5\uffff\1\5\1\uffff\1\5\11\uffff\3\4\30\uffff\1\13\7\uffff\1\3\1\uffff\1\11\4\4",
            "\1\26\42\uffff\1\30\7\uffff\1\27",
            "\1\32\1\31",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\40\1\37\3\uffff\1\41",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\23\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\42\3\uffff\1\23\2\uffff\3\4\40\uffff\1\3\1\43\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\24\3\uffff\1\23\2\uffff\3\4\40\uffff\1\3\1\25\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\23\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\26\42\uffff\1\30\7\uffff\1\27",
            "\1\30",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\45\3\uffff\1\44\2\uffff\3\4\40\uffff\1\3\1\46\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\47",
            "\1\50",
            "\1\52\1\51\3\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\42\3\uffff\1\23\2\uffff\3\4\40\uffff\1\3\1\43\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\23\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\56\3\uffff\1\44\2\uffff\3\4\40\uffff\1\3\1\57\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\45\3\uffff\1\44\2\uffff\3\4\40\uffff\1\3\1\46\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\60",
            "\1\61",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\56\3\uffff\1\44\2\uffff\3\4\40\uffff\1\3\1\57\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4"
    };
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[][] dfa_23 = unpackEncodedStringArray(dfa_23s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_19;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "809:5: ( ( (lv_regions_13_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_14_0= ruleSingleControlflowRegion ) ) )?";
        }
    }
    static final String dfa_24s = "\2\12\1\4\2\uffff\2\4\2\6\2\12\1\4\3\12\2\4\1\25\2\4\1\6\1\4\1\6\1\4\4\12\1\25\1\70\3\12\1\4\1\6\2\4\1\6\7\12\1\4\1\6\2\12";
    static final String dfa_25s = "\2\77\1\4\2\uffff\1\101\1\4\1\6\1\10\2\77\1\4\1\77\1\100\1\77\2\101\1\100\1\5\1\4\1\6\1\4\1\6\1\11\1\77\2\100\1\77\1\100\1\70\1\77\1\100\1\77\1\4\1\6\1\11\1\4\1\6\1\100\2\77\1\100\1\77\1\100\1\77\1\4\1\6\1\100\1\77";
    static final String dfa_26s = "\3\uffff\1\1\1\2\54\uffff";
    static final String[] dfa_27s = {
            "\1\1\5\uffff\1\3\1\uffff\1\4\54\uffff\1\2",
            "\1\1\5\uffff\1\3\1\uffff\1\4\54\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\15\1\14\1\11\1\uffff\1\16\1\12\1\1\5\uffff\1\3\1\uffff\1\4\2\uffff\1\6\41\uffff\1\13\7\uffff\1\2\1\7\1\10",
            "\1\17",
            "\1\20",
            "\1\11\1\uffff\1\16",
            "\1\1\5\uffff\1\3\1\uffff\1\4\54\uffff\1\2",
            "\1\1\5\uffff\1\3\1\uffff\1\4\54\uffff\1\2",
            "\1\21",
            "\1\1\5\uffff\1\3\1\uffff\1\4\6\uffff\1\22\45\uffff\1\2",
            "\1\1\5\uffff\1\3\1\uffff\1\4\2\uffff\1\23\3\uffff\1\22\45\uffff\1\2\1\24",
            "\1\1\5\uffff\1\3\1\uffff\1\4\54\uffff\1\2",
            "\1\15\1\14\1\11\1\uffff\1\16\1\12\1\1\5\uffff\1\3\1\uffff\1\4\2\uffff\1\6\41\uffff\1\13\7\uffff\1\2\1\7\1\10",
            "\1\15\1\14\1\11\1\uffff\1\16\1\12\1\1\5\uffff\1\3\1\uffff\1\4\44\uffff\1\13\7\uffff\1\2\1\uffff\1\10",
            "\1\25\42\uffff\1\27\7\uffff\1\26",
            "\1\31\1\30",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\37\1\36\3\uffff\1\40",
            "\1\1\5\uffff\1\3\1\uffff\1\4\6\uffff\1\22\45\uffff\1\2",
            "\1\1\5\uffff\1\3\1\uffff\1\4\2\uffff\1\41\3\uffff\1\22\45\uffff\1\2\1\42",
            "\1\1\5\uffff\1\3\1\uffff\1\4\2\uffff\1\23\3\uffff\1\22\45\uffff\1\2\1\24",
            "\1\1\5\uffff\1\3\1\uffff\1\4\6\uffff\1\22\45\uffff\1\2",
            "\1\25\42\uffff\1\27\7\uffff\1\26",
            "\1\27",
            "\1\1\5\uffff\1\3\1\uffff\1\4\6\uffff\1\43\45\uffff\1\2",
            "\1\1\5\uffff\1\3\1\uffff\1\4\2\uffff\1\44\3\uffff\1\43\45\uffff\1\2\1\45",
            "\1\1\5\uffff\1\3\1\uffff\1\4\6\uffff\1\43\45\uffff\1\2",
            "\1\46",
            "\1\47",
            "\1\51\1\50\3\uffff\1\52",
            "\1\53",
            "\1\54",
            "\1\1\5\uffff\1\3\1\uffff\1\4\2\uffff\1\41\3\uffff\1\22\45\uffff\1\2\1\42",
            "\1\1\5\uffff\1\3\1\uffff\1\4\6\uffff\1\22\45\uffff\1\2",
            "\1\1\5\uffff\1\3\1\uffff\1\4\6\uffff\1\43\45\uffff\1\2",
            "\1\1\5\uffff\1\3\1\uffff\1\4\2\uffff\1\55\3\uffff\1\43\45\uffff\1\2\1\56",
            "\1\1\5\uffff\1\3\1\uffff\1\4\6\uffff\1\43\45\uffff\1\2",
            "\1\1\5\uffff\1\3\1\uffff\1\4\2\uffff\1\44\3\uffff\1\43\45\uffff\1\2\1\45",
            "\1\1\5\uffff\1\3\1\uffff\1\4\6\uffff\1\43\45\uffff\1\2",
            "\1\57",
            "\1\60",
            "\1\1\5\uffff\1\3\1\uffff\1\4\2\uffff\1\55\3\uffff\1\43\45\uffff\1\2\1\56",
            "\1\1\5\uffff\1\3\1\uffff\1\4\6\uffff\1\43\45\uffff\1\2"
    };
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_6;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "889:1: (this_ControlflowRegion_0= ruleControlflowRegion | this_DataflowRegion_1= ruleDataflowRegion )";
        }
    }
    static final String dfa_28s = "\1\4\1\uffff\1\12\1\4\2\uffff\2\4\1\6\1\4\2\12\1\6\3\12\2\4\1\25\2\4\1\6\1\4\1\6\1\4\4\12\1\25\1\70\3\12\1\4\1\6\2\4\1\6\7\12\1\4\1\6\2\12";
    static final String dfa_29s = "\1\144\1\uffff\1\144\1\4\2\uffff\1\144\1\4\1\6\1\4\2\144\1\10\5\144\1\100\1\5\1\4\1\6\1\4\1\6\1\11\4\144\1\100\1\70\3\144\1\4\1\6\1\11\1\4\1\6\7\144\1\4\1\6\2\144";
    static final String[] dfa_30s = {
            "\1\1\5\uffff\1\2\5\uffff\1\1\1\uffff\1\1\10\uffff\4\1\2\uffff\1\1\2\uffff\1\5\4\uffff\6\5\1\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "",
            "\1\2\5\uffff\1\1\1\uffff\1\1\11\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\6",
            "",
            "",
            "\1\13\1\12\1\15\1\uffff\1\17\1\16\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\7\6\uffff\3\1\21\uffff\7\4\1\11\7\uffff\1\3\1\10\1\14\4\1\30\uffff\7\4",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\23\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\24\3\uffff\1\23\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\1\25\1\uffff\4\1\30\uffff\7\4",
            "\1\15\1\uffff\1\17",
            "\1\2\5\uffff\1\1\1\uffff\1\1\11\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\11\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\11\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\13\1\12\1\15\1\uffff\1\17\1\16\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\7\6\uffff\3\1\21\uffff\7\4\1\11\7\uffff\1\3\1\10\1\14\4\1\30\uffff\7\4",
            "\1\13\1\12\1\15\1\uffff\1\17\1\16\1\2\5\uffff\1\1\1\uffff\1\1\11\uffff\3\1\21\uffff\7\4\1\11\7\uffff\1\3\1\uffff\1\14\4\1\30\uffff\7\4",
            "\1\26\42\uffff\1\30\7\uffff\1\27",
            "\1\32\1\31",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\40\1\37\3\uffff\1\41",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\23\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\42\3\uffff\1\23\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\1\43\1\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\24\3\uffff\1\23\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\1\25\1\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\23\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\26\42\uffff\1\30\7\uffff\1\27",
            "\1\30",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\44\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\45\3\uffff\1\44\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\1\46\1\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\44\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\47",
            "\1\50",
            "\1\52\1\51\3\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\42\3\uffff\1\23\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\1\43\1\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\23\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\44\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\56\3\uffff\1\44\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\1\57\1\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\44\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\45\3\uffff\1\44\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\1\46\1\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\44\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4",
            "\1\60",
            "\1\61",
            "\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff\1\56\3\uffff\1\44\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\1\57\1\uffff\4\1\30\uffff\7\4",
            "\1\2\5\uffff\1\1\1\uffff\1\1\6\uffff\1\44\2\uffff\3\1\21\uffff\7\4\10\uffff\1\3\2\uffff\4\1\30\uffff\7\4"
    };
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "()* loopback of 1141:1: ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )*";
        }
    }
    static final String dfa_31s = "\1\105\1\uffff\1\105\1\4\2\uffff\1\105\1\4\1\6\1\4\2\105\1\10\5\105\1\100\1\5\1\4\1\6\1\4\1\6\1\11\4\105\1\100\1\70\3\105\1\4\1\6\1\11\1\4\1\6\7\105\1\4\1\6\2\105";
    static final String[] dfa_32s = {
            "\1\1\5\uffff\1\2\5\uffff\1\5\1\uffff\1\5\10\uffff\1\5\3\4\2\uffff\1\1\35\uffff\1\3\2\uffff\4\4",
            "",
            "\1\2\5\uffff\1\5\1\uffff\1\5\11\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\6",
            "",
            "",
            "\1\13\1\12\1\15\1\uffff\1\17\1\16\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\7\6\uffff\3\4\30\uffff\1\11\7\uffff\1\3\1\10\1\14\4\4",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\23\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\24\3\uffff\1\23\2\uffff\3\4\40\uffff\1\3\1\25\1\uffff\4\4",
            "\1\15\1\uffff\1\17",
            "\1\2\5\uffff\1\5\1\uffff\1\5\11\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\11\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\11\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\13\1\12\1\15\1\uffff\1\17\1\16\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\7\6\uffff\3\4\30\uffff\1\11\7\uffff\1\3\1\10\1\14\4\4",
            "\1\13\1\12\1\15\1\uffff\1\17\1\16\1\2\5\uffff\1\5\1\uffff\1\5\11\uffff\3\4\30\uffff\1\11\7\uffff\1\3\1\uffff\1\14\4\4",
            "\1\26\42\uffff\1\30\7\uffff\1\27",
            "\1\32\1\31",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\40\1\37\3\uffff\1\41",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\23\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\42\3\uffff\1\23\2\uffff\3\4\40\uffff\1\3\1\43\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\24\3\uffff\1\23\2\uffff\3\4\40\uffff\1\3\1\25\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\23\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\26\42\uffff\1\30\7\uffff\1\27",
            "\1\30",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\45\3\uffff\1\44\2\uffff\3\4\40\uffff\1\3\1\46\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\47",
            "\1\50",
            "\1\52\1\51\3\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\42\3\uffff\1\23\2\uffff\3\4\40\uffff\1\3\1\43\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\23\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\56\3\uffff\1\44\2\uffff\3\4\40\uffff\1\3\1\57\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\45\3\uffff\1\44\2\uffff\3\4\40\uffff\1\3\1\46\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\60",
            "\1\61",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\56\3\uffff\1\44\2\uffff\3\4\40\uffff\1\3\1\57\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4"
    };
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_28;
            this.max = dfa_31;
            this.accept = dfa_22;
            this.special = dfa_19;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "1178:5: ( ( (lv_regions_18_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_19_0= ruleSingleControlflowRegion ) ) )?";
        }
    }
    static final String dfa_33s = "\16\uffff";
    static final String dfa_34s = "\1\4\1\0\14\uffff";
    static final String dfa_35s = "\1\133\1\0\14\uffff";
    static final String dfa_36s = "\2\uffff\1\2\12\uffff\1\1";
    static final String dfa_37s = "\1\uffff\1\0\14\uffff}>";
    static final String[] dfa_38s = {
            "\2\2\1\1\3\2\25\uffff\1\2\32\uffff\1\2\2\uffff\1\2\3\uffff\1\2\24\uffff\1\2\4\uffff\1\2",
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

    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_33;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "1985:2: ( (lv_delay_8_0= RULE_INT ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_1 = input.LA(1);

                         
                        int index54_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_InternalSct()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index54_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_39s = "\171\uffff";
    static final String dfa_40s = "\2\2\10\uffff\1\5\156\uffff";
    static final String dfa_41s = "\1\12\1\4\1\uffff\2\4\1\uffff\2\4\1\6\2\4\1\6\10\4\1\6\3\4\1\25\7\4\1\6\2\4\1\6\3\4\1\6\2\4\1\6\4\4\1\25\1\70\12\4\1\6\1\25\2\4\1\6\2\4\1\6\2\4\1\6\11\4\1\6\11\4\1\25\1\4\1\6\1\25\1\70\4\4\1\6\1\4\1\6\5\4\1\6\2\4\1\25\1\70\7\4\1\6\2\4";
    static final String dfa_42s = "\1\110\1\105\1\uffff\1\105\1\4\1\uffff\1\105\1\4\1\6\1\105\1\121\1\10\2\105\1\4\3\105\1\5\1\4\1\6\1\5\1\110\1\4\1\100\5\105\1\110\1\4\1\6\1\11\1\4\1\6\1\105\2\4\1\6\1\110\1\121\1\10\2\110\1\4\1\110\1\100\1\70\6\105\2\110\1\5\1\4\1\6\1\100\1\11\1\4\1\6\1\11\1\4\1\6\1\105\1\121\1\10\2\105\1\4\1\105\4\110\1\4\1\6\1\11\10\105\1\100\1\4\1\6\1\100\1\70\3\110\1\4\1\6\1\4\1\6\1\11\2\110\1\11\1\4\1\6\2\105\1\100\1\70\1\105\5\110\1\4\1\6\2\110";
    static final String dfa_43s = "\2\uffff\1\2\2\uffff\1\1\163\uffff";
    static final String dfa_44s = "\171\uffff}>";
    static final String[] dfa_45s = {
            "\1\2\11\uffff\1\1\52\uffff\1\2\6\uffff\3\2",
            "\1\5\2\uffff\1\5\2\uffff\1\3\5\uffff\1\2\1\uffff\1\2\10\uffff\4\2\33\uffff\1\5\4\uffff\1\4\2\uffff\4\2",
            "",
            "\1\5\2\uffff\1\5\2\uffff\1\3\5\uffff\1\2\1\uffff\1\2\11\uffff\3\2\33\uffff\1\5\4\uffff\1\4\2\uffff\4\2",
            "\1\6",
            "",
            "\1\12\1\11\1\14\1\5\1\17\1\15\1\3\5\uffff\1\2\1\uffff\1\2\2\uffff\1\7\6\uffff\3\2\30\uffff\1\16\2\uffff\1\5\4\uffff\1\4\1\10\1\13\4\2",
            "\1\20",
            "\1\21",
            "\1\5\2\uffff\1\5\2\uffff\1\3\5\uffff\1\2\1\uffff\1\2\6\uffff\1\22\2\uffff\3\2\33\uffff\1\5\4\uffff\1\4\2\uffff\4\2",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\2\5\1\23\3\uffff\1\25\2\uffff\3\2\1\5\27\uffff\1\5\2\uffff\1\5\4\uffff\1\27\1\24\1\uffff\4\2\3\5\3\uffff\6\5",
            "\1\14\1\uffff\1\17",
            "\1\5\2\uffff\1\5\2\uffff\1\3\5\uffff\1\2\1\uffff\1\2\11\uffff\3\2\33\uffff\1\5\4\uffff\1\4\2\uffff\4\2",
            "\1\5\2\uffff\1\5\2\uffff\1\3\5\uffff\1\2\1\uffff\1\2\11\uffff\3\2\33\uffff\1\5\4\uffff\1\4\2\uffff\4\2",
            "\1\30",
            "\1\5\2\uffff\1\5\2\uffff\1\3\5\uffff\1\2\1\uffff\1\2\11\uffff\3\2\33\uffff\1\5\4\uffff\1\4\2\uffff\4\2",
            "\1\12\1\11\1\14\1\5\1\17\1\15\1\3\5\uffff\1\2\1\uffff\1\2\2\uffff\1\7\6\uffff\3\2\30\uffff\1\16\2\uffff\1\5\4\uffff\1\4\1\10\1\13\4\2",
            "\1\12\1\11\1\14\1\5\1\17\1\15\1\3\5\uffff\1\2\1\uffff\1\2\11\uffff\3\2\30\uffff\1\16\2\uffff\1\5\4\uffff\1\4\1\uffff\1\13\4\2",
            "\1\32\1\31",
            "\1\33",
            "\1\34",
            "\1\32\1\35",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\11\uffff\3\2\33\uffff\1\5\4\uffff\1\27\2\uffff\4\2\3\5",
            "\1\36",
            "\1\37\42\uffff\1\41\7\uffff\1\40",
            "\1\5\2\uffff\1\5\2\uffff\1\3\5\uffff\1\2\1\uffff\1\2\6\uffff\1\22\2\uffff\3\2\33\uffff\1\5\4\uffff\1\4\2\uffff\4\2",
            "\1\5\2\uffff\1\5\2\uffff\1\44\5\uffff\1\2\1\uffff\1\2\2\uffff\1\42\3\uffff\1\25\2\uffff\3\2\33\uffff\1\5\4\uffff\1\45\1\43\1\uffff\4\2",
            "\1\5\2\uffff\1\5\2\uffff\1\44\5\uffff\1\2\1\uffff\1\2\2\uffff\1\23\3\uffff\1\25\2\uffff\3\2\33\uffff\1\5\4\uffff\1\45\1\24\1\uffff\4\2",
            "\1\5\2\uffff\1\5\2\uffff\1\44\5\uffff\1\2\1\uffff\1\2\6\uffff\1\25\2\uffff\3\2\33\uffff\1\5\4\uffff\1\45\2\uffff\4\2",
            "\1\5\2\uffff\1\5\2\uffff\1\44\5\uffff\1\2\1\uffff\1\2\6\uffff\1\25\2\uffff\3\2\33\uffff\1\5\4\uffff\1\45\2\uffff\4\2",
            "\1\51\1\50\1\53\1\5\1\56\1\54\1\26\5\uffff\1\2\1\uffff\1\2\2\uffff\1\46\6\uffff\3\2\30\uffff\1\55\2\uffff\1\5\4\uffff\1\27\1\47\1\52\4\2\3\5",
            "\1\57",
            "\1\60",
            "\1\62\1\61\3\uffff\1\63",
            "\1\64",
            "\1\65",
            "\1\5\2\uffff\1\5\2\uffff\1\44\5\uffff\1\2\1\uffff\1\2\11\uffff\3\2\33\uffff\1\5\4\uffff\1\45\2\uffff\4\2",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\6\uffff\1\71\2\uffff\3\2\33\uffff\1\5\4\uffff\1\27\2\uffff\4\2\3\5",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\1\5\1\uffff\1\72\3\uffff\1\71\2\uffff\3\2\30\uffff\1\5\2\uffff\1\5\4\uffff\1\27\1\73\1\uffff\4\2\3\5\3\uffff\6\5",
            "\1\53\1\uffff\1\56",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\11\uffff\3\2\33\uffff\1\5\4\uffff\1\27\2\uffff\4\2\3\5",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\11\uffff\3\2\33\uffff\1\5\4\uffff\1\27\2\uffff\4\2\3\5",
            "\1\74",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\11\uffff\3\2\33\uffff\1\5\4\uffff\1\27\2\uffff\4\2\3\5",
            "\1\37\42\uffff\1\41\7\uffff\1\40",
            "\1\41",
            "\1\5\2\uffff\1\5\2\uffff\1\3\5\uffff\1\2\1\uffff\1\2\6\uffff\1\75\2\uffff\3\2\33\uffff\1\5\4\uffff\1\4\2\uffff\4\2",
            "\1\5\2\uffff\1\5\2\uffff\1\44\5\uffff\1\2\1\uffff\1\2\2\uffff\1\76\3\uffff\1\100\2\uffff\3\2\33\uffff\1\5\4\uffff\1\45\1\77\1\uffff\4\2",
            "\1\5\2\uffff\1\5\2\uffff\1\44\5\uffff\1\2\1\uffff\1\2\6\uffff\1\100\2\uffff\3\2\33\uffff\1\5\4\uffff\1\45\2\uffff\4\2",
            "\1\5\2\uffff\1\5\2\uffff\1\44\5\uffff\1\2\1\uffff\1\2\2\uffff\1\42\3\uffff\1\25\2\uffff\3\2\33\uffff\1\5\4\uffff\1\45\1\43\1\uffff\4\2",
            "\1\5\2\uffff\1\5\2\uffff\1\44\5\uffff\1\2\1\uffff\1\2\6\uffff\1\25\2\uffff\3\2\33\uffff\1\5\4\uffff\1\45\2\uffff\4\2",
            "\1\104\1\103\1\106\1\5\1\111\1\107\1\44\5\uffff\1\2\1\uffff\1\2\2\uffff\1\101\6\uffff\3\2\30\uffff\1\110\2\uffff\1\5\4\uffff\1\45\1\102\1\105\4\2",
            "\1\51\1\50\1\53\1\5\1\56\1\54\1\26\5\uffff\1\2\1\uffff\1\2\2\uffff\1\46\6\uffff\3\2\30\uffff\1\55\2\uffff\1\5\4\uffff\1\27\1\47\1\52\4\2\3\5",
            "\1\51\1\50\1\53\1\5\1\56\1\54\1\26\5\uffff\1\2\1\uffff\1\2\11\uffff\3\2\30\uffff\1\55\2\uffff\1\5\4\uffff\1\27\1\uffff\1\52\4\2\3\5",
            "\1\113\1\112",
            "\1\114",
            "\1\115",
            "\1\116\42\uffff\1\120\7\uffff\1\117",
            "\1\122\1\121\3\uffff\1\123",
            "\1\124",
            "\1\125",
            "\1\122\1\126\3\uffff\1\123",
            "\1\127",
            "\1\130",
            "\1\5\2\uffff\1\5\2\uffff\1\44\5\uffff\1\2\1\uffff\1\2\6\uffff\1\25\2\uffff\3\2\33\uffff\1\5\4\uffff\1\45\2\uffff\4\2",
            "\1\5\2\uffff\1\5\2\uffff\1\44\5\uffff\1\2\1\uffff\1\2\1\5\1\uffff\1\23\3\uffff\1\25\2\uffff\3\2\30\uffff\1\5\2\uffff\1\5\4\uffff\1\45\1\24\1\uffff\4\2\6\uffff\6\5",
            "\1\106\1\uffff\1\111",
            "\1\5\2\uffff\1\5\2\uffff\1\44\5\uffff\1\2\1\uffff\1\2\11\uffff\3\2\33\uffff\1\5\4\uffff\1\45\2\uffff\4\2",
            "\1\5\2\uffff\1\5\2\uffff\1\44\5\uffff\1\2\1\uffff\1\2\11\uffff\3\2\33\uffff\1\5\4\uffff\1\45\2\uffff\4\2",
            "\1\131",
            "\1\5\2\uffff\1\5\2\uffff\1\44\5\uffff\1\2\1\uffff\1\2\11\uffff\3\2\33\uffff\1\5\4\uffff\1\45\2\uffff\4\2",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\6\uffff\1\71\2\uffff\3\2\33\uffff\1\5\4\uffff\1\27\2\uffff\4\2\3\5",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\2\uffff\1\132\3\uffff\1\71\2\uffff\3\2\33\uffff\1\5\4\uffff\1\27\1\133\1\uffff\4\2\3\5",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\2\uffff\1\72\3\uffff\1\71\2\uffff\3\2\33\uffff\1\5\4\uffff\1\27\1\73\1\uffff\4\2\3\5",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\6\uffff\1\71\2\uffff\3\2\33\uffff\1\5\4\uffff\1\27\2\uffff\4\2\3\5",
            "\1\134",
            "\1\135",
            "\1\137\1\136\3\uffff\1\140",
            "\1\5\2\uffff\1\5\2\uffff\1\3\5\uffff\1\2\1\uffff\1\2\6\uffff\1\75\2\uffff\3\2\33\uffff\1\5\4\uffff\1\4\2\uffff\4\2",
            "\1\5\2\uffff\1\5\2\uffff\1\44\5\uffff\1\2\1\uffff\1\2\2\uffff\1\141\3\uffff\1\100\2\uffff\3\2\33\uffff\1\5\4\uffff\1\45\1\142\1\uffff\4\2",
            "\1\5\2\uffff\1\5\2\uffff\1\44\5\uffff\1\2\1\uffff\1\2\6\uffff\1\100\2\uffff\3\2\33\uffff\1\5\4\uffff\1\45\2\uffff\4\2",
            "\1\5\2\uffff\1\5\2\uffff\1\44\5\uffff\1\2\1\uffff\1\2\2\uffff\1\76\3\uffff\1\100\2\uffff\3\2\33\uffff\1\5\4\uffff\1\45\1\77\1\uffff\4\2",
            "\1\5\2\uffff\1\5\2\uffff\1\44\5\uffff\1\2\1\uffff\1\2\6\uffff\1\100\2\uffff\3\2\33\uffff\1\5\4\uffff\1\45\2\uffff\4\2",
            "\1\5\2\uffff\1\5\2\uffff\1\44\5\uffff\1\2\1\uffff\1\2\6\uffff\1\100\2\uffff\3\2\33\uffff\1\5\4\uffff\1\45\2\uffff\4\2",
            "\1\104\1\103\1\106\1\5\1\111\1\107\1\44\5\uffff\1\2\1\uffff\1\2\2\uffff\1\101\6\uffff\3\2\30\uffff\1\110\2\uffff\1\5\4\uffff\1\45\1\102\1\105\4\2",
            "\1\104\1\103\1\106\1\5\1\111\1\107\1\44\5\uffff\1\2\1\uffff\1\2\11\uffff\3\2\30\uffff\1\110\2\uffff\1\5\4\uffff\1\45\1\uffff\1\105\4\2",
            "\1\143\42\uffff\1\145\7\uffff\1\144",
            "\1\146",
            "\1\147",
            "\1\116\42\uffff\1\120\7\uffff\1\117",
            "\1\120",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\6\uffff\1\150\2\uffff\3\2\33\uffff\1\5\4\uffff\1\27\2\uffff\4\2\3\5",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\2\uffff\1\151\3\uffff\1\150\2\uffff\3\2\33\uffff\1\5\4\uffff\1\27\1\152\1\uffff\4\2\3\5",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\6\uffff\1\150\2\uffff\3\2\33\uffff\1\5\4\uffff\1\27\2\uffff\4\2\3\5",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\62\1\157\3\uffff\1\63",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\2\uffff\1\132\3\uffff\1\71\2\uffff\3\2\33\uffff\1\5\4\uffff\1\27\1\133\1\uffff\4\2\3\5",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\6\uffff\1\71\2\uffff\3\2\33\uffff\1\5\4\uffff\1\27\2\uffff\4\2\3\5",
            "\1\161\1\160\3\uffff\1\162",
            "\1\163",
            "\1\164",
            "\1\5\2\uffff\1\5\2\uffff\1\44\5\uffff\1\2\1\uffff\1\2\2\uffff\1\141\3\uffff\1\100\2\uffff\3\2\33\uffff\1\5\4\uffff\1\45\1\142\1\uffff\4\2",
            "\1\5\2\uffff\1\5\2\uffff\1\44\5\uffff\1\2\1\uffff\1\2\6\uffff\1\100\2\uffff\3\2\33\uffff\1\5\4\uffff\1\45\2\uffff\4\2",
            "\1\143\42\uffff\1\145\7\uffff\1\144",
            "\1\145",
            "\1\5\2\uffff\1\5\2\uffff\1\44\5\uffff\1\2\1\uffff\1\2\6\uffff\1\100\2\uffff\3\2\33\uffff\1\5\4\uffff\1\45\2\uffff\4\2",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\6\uffff\1\150\2\uffff\3\2\33\uffff\1\5\4\uffff\1\27\2\uffff\4\2\3\5",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\2\uffff\1\165\3\uffff\1\150\2\uffff\3\2\33\uffff\1\5\4\uffff\1\27\1\166\1\uffff\4\2\3\5",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\6\uffff\1\150\2\uffff\3\2\33\uffff\1\5\4\uffff\1\27\2\uffff\4\2\3\5",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\2\uffff\1\151\3\uffff\1\150\2\uffff\3\2\33\uffff\1\5\4\uffff\1\27\1\152\1\uffff\4\2\3\5",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\6\uffff\1\150\2\uffff\3\2\33\uffff\1\5\4\uffff\1\27\2\uffff\4\2\3\5",
            "\1\167",
            "\1\170",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\2\uffff\1\165\3\uffff\1\150\2\uffff\3\2\33\uffff\1\5\4\uffff\1\27\1\166\1\uffff\4\2\3\5",
            "\1\5\2\uffff\1\5\2\uffff\1\26\5\uffff\1\2\1\uffff\1\2\6\uffff\1\150\2\uffff\3\2\33\uffff\1\5\4\uffff\1\27\2\uffff\4\2\3\5"
    };

    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[][] dfa_45 = unpackEncodedStringArray(dfa_45s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_39;
            this.eof = dfa_40;
            this.min = dfa_41;
            this.max = dfa_42;
            this.accept = dfa_43;
            this.special = dfa_44;
            this.transition = dfa_45;
        }
        public String getDescription() {
            return "()* loopback of 2043:2: (otherlv_12= ';' ( (lv_effects_13_0= ruleEffect ) ) )*";
        }
    }
    static final String dfa_46s = "\47\uffff";
    static final String dfa_47s = "\1\2\46\uffff";
    static final String dfa_48s = "\1\4\1\0\45\uffff";
    static final String dfa_49s = "\1\144\1\0\45\uffff";
    static final String dfa_50s = "\2\uffff\1\2\43\uffff\1\1";
    static final String dfa_51s = "\1\uffff\1\0\45\uffff}>";
    static final String[] dfa_52s = {
            "\1\2\5\uffff\1\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\1\6\uffff\4\2\2\uffff\1\2\2\uffff\1\2\4\uffff\6\2\1\uffff\7\2\10\uffff\1\2\2\uffff\4\2\30\uffff\7\2",
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
            "",
            ""
    };

    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[][] dfa_52 = unpackEncodedStringArray(dfa_52s);

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_46;
            this.eof = dfa_47;
            this.min = dfa_48;
            this.max = dfa_49;
            this.accept = dfa_50;
            this.special = dfa_51;
            this.transition = dfa_52;
        }
        public String getDescription() {
            return "()* loopback of 2214:2: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_1 = input.LA(1);

                         
                        int index61_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalSct()) ) {s = 38;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index61_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = dfa_46;
            this.eof = dfa_47;
            this.min = dfa_48;
            this.max = dfa_49;
            this.accept = dfa_50;
            this.special = dfa_51;
            this.transition = dfa_52;
        }
        public String getDescription() {
            return "()* loopback of 2329:2: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*";
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
                        if ( (synpred79_InternalSct()) ) {s = 38;}

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

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = dfa_46;
            this.eof = dfa_47;
            this.min = dfa_48;
            this.max = dfa_49;
            this.accept = dfa_50;
            this.special = dfa_51;
            this.transition = dfa_52;
        }
        public String getDescription() {
            return "()* loopback of 2429:2: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred83_InternalSct()) ) {s = 38;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = dfa_46;
            this.eof = dfa_47;
            this.min = dfa_48;
            this.max = dfa_49;
            this.accept = dfa_50;
            this.special = dfa_51;
            this.transition = dfa_52;
        }
        public String getDescription() {
            return "()* loopback of 2630:2: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_1 = input.LA(1);

                         
                        int index79_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_InternalSct()) ) {s = 38;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index79_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 79, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_53s = "\112\uffff";
    static final String dfa_54s = "\11\uffff\1\4\100\uffff";
    static final String dfa_55s = "\3\4\2\uffff\2\4\1\6\2\4\1\6\10\4\1\6\3\4\1\25\7\4\1\6\2\4\1\6\1\4\1\6\1\4\1\6\5\4\1\25\1\70\7\4\1\25\2\4\1\6\2\4\1\6\7\4\1\25\1\70\2\4\1\6\2\4";
    static final String dfa_56s = "\2\77\1\4\2\uffff\1\101\1\4\1\6\1\77\1\121\1\10\3\77\1\4\2\101\1\5\1\4\1\6\1\5\1\77\1\4\1\100\1\77\2\100\2\77\1\101\1\4\1\6\1\11\1\4\1\6\1\4\1\6\1\121\1\10\3\77\1\4\1\77\1\100\1\70\1\77\1\100\1\77\1\100\1\77\2\101\1\100\1\11\1\4\1\6\1\11\1\4\1\6\1\11\1\77\1\100\1\77\1\100\2\77\1\100\1\70\1\77\1\4\1\6\1\100\1\77";
    static final String dfa_57s = "\3\uffff\1\1\1\2\105\uffff";
    static final String dfa_58s = "\112\uffff}>";
    static final String[] dfa_59s = {
            "\1\4\2\uffff\1\4\2\uffff\1\1\44\uffff\1\3\12\uffff\1\4\4\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\1\44\uffff\1\3\12\uffff\1\4\4\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\11\1\10\1\13\1\4\1\15\1\14\1\1\12\uffff\1\6\31\uffff\1\3\7\uffff\1\16\2\uffff\1\4\4\uffff\1\2\1\7\1\12",
            "\1\17",
            "\1\20",
            "\1\4\2\uffff\1\4\2\uffff\1\1\16\uffff\1\21\25\uffff\1\3\12\uffff\1\4\4\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\25\10\uffff\1\4\1\uffff\1\22\3\uffff\1\24\5\uffff\1\4\17\uffff\1\3\7\uffff\1\4\2\uffff\1\4\4\uffff\1\26\1\23\13\uffff\6\4",
            "\1\13\1\uffff\1\15",
            "\1\4\2\uffff\1\4\2\uffff\1\1\44\uffff\1\3\12\uffff\1\4\4\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\1\44\uffff\1\3\12\uffff\1\4\4\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\1\44\uffff\1\3\12\uffff\1\4\4\uffff\1\2",
            "\1\27",
            "\1\11\1\10\1\13\1\4\1\15\1\14\1\1\12\uffff\1\6\31\uffff\1\3\7\uffff\1\16\2\uffff\1\4\4\uffff\1\2\1\7\1\12",
            "\1\11\1\10\1\13\1\4\1\15\1\14\1\1\44\uffff\1\3\7\uffff\1\16\2\uffff\1\4\4\uffff\1\2\1\uffff\1\12",
            "\1\31\1\30",
            "\1\32",
            "\1\33",
            "\1\31\1\34",
            "\1\4\2\uffff\1\4\2\uffff\1\25\44\uffff\1\3\12\uffff\1\4\4\uffff\1\26",
            "\1\35",
            "\1\36\42\uffff\1\40\7\uffff\1\37",
            "\1\4\2\uffff\1\4\2\uffff\1\1\16\uffff\1\21\25\uffff\1\3\12\uffff\1\4\4\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\25\12\uffff\1\41\3\uffff\1\24\25\uffff\1\3\12\uffff\1\4\4\uffff\1\26\1\42",
            "\1\4\2\uffff\1\4\2\uffff\1\25\12\uffff\1\22\3\uffff\1\24\25\uffff\1\3\12\uffff\1\4\4\uffff\1\26\1\23",
            "\1\4\2\uffff\1\4\2\uffff\1\25\16\uffff\1\24\25\uffff\1\3\12\uffff\1\4\4\uffff\1\26",
            "\1\4\2\uffff\1\4\2\uffff\1\25\16\uffff\1\24\25\uffff\1\3\12\uffff\1\4\4\uffff\1\26",
            "\1\45\1\53\1\47\1\4\1\51\1\50\1\25\12\uffff\1\43\31\uffff\1\3\7\uffff\1\52\2\uffff\1\4\4\uffff\1\26\1\44\1\46",
            "\1\54",
            "\1\55",
            "\1\57\1\56\3\uffff\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\4\2\uffff\1\4\2\uffff\1\25\10\uffff\1\4\1\uffff\1\22\3\uffff\1\24\25\uffff\1\3\7\uffff\1\4\2\uffff\1\4\4\uffff\1\26\1\23\13\uffff\6\4",
            "\1\47\1\uffff\1\51",
            "\1\4\2\uffff\1\4\2\uffff\1\25\44\uffff\1\3\12\uffff\1\4\4\uffff\1\26",
            "\1\4\2\uffff\1\4\2\uffff\1\25\44\uffff\1\3\12\uffff\1\4\4\uffff\1\26",
            "\1\4\2\uffff\1\4\2\uffff\1\25\44\uffff\1\3\12\uffff\1\4\4\uffff\1\26",
            "\1\65",
            "\1\4\2\uffff\1\4\2\uffff\1\25\16\uffff\1\24\25\uffff\1\3\12\uffff\1\4\4\uffff\1\26",
            "\1\36\42\uffff\1\40\7\uffff\1\37",
            "\1\40",
            "\1\4\2\uffff\1\4\2\uffff\1\1\16\uffff\1\66\25\uffff\1\3\12\uffff\1\4\4\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\25\12\uffff\1\67\3\uffff\1\71\25\uffff\1\3\12\uffff\1\4\4\uffff\1\26\1\70",
            "\1\4\2\uffff\1\4\2\uffff\1\25\16\uffff\1\71\25\uffff\1\3\12\uffff\1\4\4\uffff\1\26",
            "\1\4\2\uffff\1\4\2\uffff\1\25\12\uffff\1\41\3\uffff\1\24\25\uffff\1\3\12\uffff\1\4\4\uffff\1\26\1\42",
            "\1\4\2\uffff\1\4\2\uffff\1\25\16\uffff\1\24\25\uffff\1\3\12\uffff\1\4\4\uffff\1\26",
            "\1\45\1\53\1\47\1\4\1\51\1\50\1\25\12\uffff\1\43\31\uffff\1\3\7\uffff\1\52\2\uffff\1\4\4\uffff\1\26\1\44\1\46",
            "\1\45\1\53\1\47\1\4\1\51\1\50\1\25\44\uffff\1\3\7\uffff\1\52\2\uffff\1\4\4\uffff\1\26\1\uffff\1\46",
            "\1\72\42\uffff\1\74\7\uffff\1\73",
            "\1\76\1\75\3\uffff\1\77",
            "\1\100",
            "\1\101",
            "\1\76\1\102\3\uffff\1\77",
            "\1\103",
            "\1\104",
            "\1\57\1\105\3\uffff\1\60",
            "\1\4\2\uffff\1\4\2\uffff\1\1\16\uffff\1\66\25\uffff\1\3\12\uffff\1\4\4\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\25\12\uffff\1\106\3\uffff\1\71\25\uffff\1\3\12\uffff\1\4\4\uffff\1\26\1\107",
            "\1\4\2\uffff\1\4\2\uffff\1\25\16\uffff\1\71\25\uffff\1\3\12\uffff\1\4\4\uffff\1\26",
            "\1\4\2\uffff\1\4\2\uffff\1\25\12\uffff\1\67\3\uffff\1\71\25\uffff\1\3\12\uffff\1\4\4\uffff\1\26\1\70",
            "\1\4\2\uffff\1\4\2\uffff\1\25\16\uffff\1\71\25\uffff\1\3\12\uffff\1\4\4\uffff\1\26",
            "\1\4\2\uffff\1\4\2\uffff\1\25\16\uffff\1\71\25\uffff\1\3\12\uffff\1\4\4\uffff\1\26",
            "\1\72\42\uffff\1\74\7\uffff\1\73",
            "\1\74",
            "\1\4\2\uffff\1\4\2\uffff\1\25\16\uffff\1\71\25\uffff\1\3\12\uffff\1\4\4\uffff\1\26",
            "\1\110",
            "\1\111",
            "\1\4\2\uffff\1\4\2\uffff\1\25\12\uffff\1\106\3\uffff\1\71\25\uffff\1\3\12\uffff\1\4\4\uffff\1\26\1\107",
            "\1\4\2\uffff\1\4\2\uffff\1\25\16\uffff\1\71\25\uffff\1\3\12\uffff\1\4\4\uffff\1\26"
    };

    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final char[] dfa_55 = DFA.unpackEncodedStringToUnsignedChars(dfa_55s);
    static final char[] dfa_56 = DFA.unpackEncodedStringToUnsignedChars(dfa_56s);
    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final short[] dfa_58 = DFA.unpackEncodedString(dfa_58s);
    static final short[][] dfa_59 = unpackEncodedStringArray(dfa_59s);

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = dfa_53;
            this.eof = dfa_54;
            this.min = dfa_55;
            this.max = dfa_56;
            this.accept = dfa_57;
            this.special = dfa_58;
            this.transition = dfa_59;
        }
        public String getDescription() {
            return "2679:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )";
        }
    }
    static final String dfa_60s = "\1\4\13\0\2\uffff";
    static final String dfa_61s = "\1\133\13\0\2\uffff";
    static final String dfa_62s = "\14\uffff\1\1\1\2";
    static final String dfa_63s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_64s = {
            "\1\11\1\4\1\2\1\13\1\3\1\6\25\uffff\1\5\32\uffff\1\12\2\uffff\1\14\3\uffff\1\1\24\uffff\1\7\4\uffff\1\10",
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
    static final char[] dfa_60 = DFA.unpackEncodedStringToUnsignedChars(dfa_60s);
    static final char[] dfa_61 = DFA.unpackEncodedStringToUnsignedChars(dfa_61s);
    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final short[][] dfa_64 = unpackEncodedStringArray(dfa_64s);

    class DFA108 extends DFA {

        public DFA108(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 108;
            this.eot = dfa_33;
            this.eof = dfa_33;
            this.min = dfa_60;
            this.max = dfa_61;
            this.accept = dfa_62;
            this.special = dfa_63;
            this.transition = dfa_64;
        }
        public String getDescription() {
            return "3686:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA108_1 = input.LA(1);

                         
                        int index108_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index108_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA108_2 = input.LA(1);

                         
                        int index108_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index108_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA108_3 = input.LA(1);

                         
                        int index108_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index108_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA108_4 = input.LA(1);

                         
                        int index108_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index108_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA108_5 = input.LA(1);

                         
                        int index108_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index108_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA108_6 = input.LA(1);

                         
                        int index108_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index108_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA108_7 = input.LA(1);

                         
                        int index108_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index108_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA108_8 = input.LA(1);

                         
                        int index108_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index108_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA108_9 = input.LA(1);

                         
                        int index108_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index108_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA108_10 = input.LA(1);

                         
                        int index108_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index108_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA108_11 = input.LA(1);

                         
                        int index108_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index108_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 108, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_65s = "\15\uffff";
    static final String dfa_66s = "\1\4\4\uffff\7\0\1\uffff";
    static final String dfa_67s = "\1\133\4\uffff\7\0\1\uffff";
    static final String dfa_68s = "\1\uffff\1\1\12\uffff\1\2";
    static final String dfa_69s = "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] dfa_70s = {
            "\1\11\2\1\1\13\1\1\1\6\25\uffff\1\5\32\uffff\1\12\2\uffff\1\14\3\uffff\1\1\24\uffff\1\7\4\uffff\1\10",
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

    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final char[] dfa_66 = DFA.unpackEncodedStringToUnsignedChars(dfa_66s);
    static final char[] dfa_67 = DFA.unpackEncodedStringToUnsignedChars(dfa_67s);
    static final short[] dfa_68 = DFA.unpackEncodedString(dfa_68s);
    static final short[] dfa_69 = DFA.unpackEncodedString(dfa_69s);
    static final short[][] dfa_70 = unpackEncodedStringArray(dfa_70s);

    class DFA118 extends DFA {

        public DFA118(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 118;
            this.eot = dfa_65;
            this.eof = dfa_65;
            this.min = dfa_66;
            this.max = dfa_67;
            this.accept = dfa_68;
            this.special = dfa_69;
            this.transition = dfa_70;
        }
        public String getDescription() {
            return "4155:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA118_5 = input.LA(1);

                         
                        int index118_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index118_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA118_6 = input.LA(1);

                         
                        int index118_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index118_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA118_7 = input.LA(1);

                         
                        int index118_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index118_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA118_8 = input.LA(1);

                         
                        int index118_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index118_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA118_9 = input.LA(1);

                         
                        int index118_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index118_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA118_10 = input.LA(1);

                         
                        int index118_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index118_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA118_11 = input.LA(1);

                         
                        int index118_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index118_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 118, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_71s = "\14\uffff";
    static final String dfa_72s = "\1\4\3\uffff\1\0\7\uffff";
    static final String dfa_73s = "\1\133\3\uffff\1\0\7\uffff";
    static final String dfa_74s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\5\uffff\1\4";
    static final String dfa_75s = "\4\uffff\1\0\7\uffff}>";
    static final String[] dfa_76s = {
            "\1\5\1\3\1\1\1\5\1\2\1\5\25\uffff\1\4\32\uffff\1\5\33\uffff\1\5\4\uffff\1\5",
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

    static final short[] dfa_71 = DFA.unpackEncodedString(dfa_71s);
    static final char[] dfa_72 = DFA.unpackEncodedStringToUnsignedChars(dfa_72s);
    static final char[] dfa_73 = DFA.unpackEncodedStringToUnsignedChars(dfa_73s);
    static final short[] dfa_74 = DFA.unpackEncodedString(dfa_74s);
    static final short[] dfa_75 = DFA.unpackEncodedString(dfa_75s);
    static final short[][] dfa_76 = unpackEncodedStringArray(dfa_76s);

    class DFA132 extends DFA {

        public DFA132(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 132;
            this.eot = dfa_71;
            this.eof = dfa_71;
            this.min = dfa_72;
            this.max = dfa_73;
            this.accept = dfa_74;
            this.special = dfa_75;
            this.transition = dfa_76;
        }
        public String getDescription() {
            return "4875:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA132_4 = input.LA(1);

                         
                        int index132_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred155_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index132_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 132, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_77s = "\20\uffff";
    static final String dfa_78s = "\3\uffff\1\14\7\uffff\1\12\2\uffff\2\14";
    static final String dfa_79s = "\1\12\1\uffff\3\4\1\6\1\uffff\1\6\3\uffff\1\4\2\uffff\2\4";
    static final String dfa_80s = "\1\77\1\uffff\1\4\1\144\1\4\1\6\1\uffff\1\10\3\uffff\1\144\2\uffff\2\144";
    static final String dfa_81s = "\1\uffff\1\1\4\uffff\1\2\1\uffff\1\5\1\4\1\3\1\uffff\1\7\1\6\2\uffff";
    static final String dfa_82s = "\20\uffff}>";
    static final String[] dfa_83s = {
            "\1\1\64\uffff\1\2",
            "",
            "\1\3",
            "\1\13\1\12\1\10\1\14\1\15\1\6\1\14\5\uffff\1\14\1\uffff\1\14\2\uffff\1\4\1\14\5\uffff\3\14\20\uffff\10\14\1\11\2\uffff\1\14\4\uffff\1\14\1\5\1\7\7\14\25\uffff\7\14",
            "\1\16",
            "\1\17",
            "",
            "\1\10\1\uffff\1\15",
            "",
            "",
            "",
            "\1\12\2\uffff\1\12\2\uffff\1\12\5\uffff\1\12\1\uffff\1\12\1\14\1\uffff\2\12\2\uffff\1\12\2\uffff\3\12\11\uffff\1\14\6\uffff\10\12\1\14\2\uffff\1\12\4\uffff\2\12\1\uffff\7\12\3\uffff\6\14\14\uffff\7\12",
            "",
            "",
            "\1\13\1\12\1\10\1\14\1\15\1\6\1\14\5\uffff\1\14\1\uffff\1\14\2\uffff\1\4\1\14\5\uffff\3\14\20\uffff\10\14\1\11\2\uffff\1\14\4\uffff\1\14\1\5\1\7\7\14\25\uffff\7\14",
            "\1\13\1\12\1\10\1\14\1\15\1\6\1\14\5\uffff\1\14\1\uffff\1\14\3\uffff\1\14\5\uffff\3\14\20\uffff\10\14\1\11\2\uffff\1\14\4\uffff\1\14\1\uffff\1\7\7\14\25\uffff\7\14"
    };

    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final short[] dfa_78 = DFA.unpackEncodedString(dfa_78s);
    static final char[] dfa_79 = DFA.unpackEncodedStringToUnsignedChars(dfa_79s);
    static final char[] dfa_80 = DFA.unpackEncodedStringToUnsignedChars(dfa_80s);
    static final short[] dfa_81 = DFA.unpackEncodedString(dfa_81s);
    static final short[] dfa_82 = DFA.unpackEncodedString(dfa_82s);
    static final short[][] dfa_83 = unpackEncodedStringArray(dfa_83s);

    class DFA140 extends DFA {

        public DFA140(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 140;
            this.eot = dfa_77;
            this.eof = dfa_78;
            this.min = dfa_79;
            this.max = dfa_80;
            this.accept = dfa_81;
            this.special = dfa_82;
            this.transition = dfa_83;
        }
        public String getDescription() {
            return "5502:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )";
        }
    }
    static final String dfa_84s = "\17\uffff";
    static final String dfa_85s = "\3\uffff\1\10\11\uffff\2\10";
    static final String dfa_86s = "\1\12\1\uffff\3\4\1\6\3\uffff\1\6\3\uffff\2\4";
    static final String dfa_87s = "\1\77\1\uffff\1\4\1\101\1\4\1\6\3\uffff\1\10\3\uffff\2\101";
    static final String dfa_88s = "\1\uffff\1\1\4\uffff\1\3\1\2\1\7\1\uffff\1\6\1\5\1\4\2\uffff";
    static final String dfa_89s = "\17\uffff}>";
    static final String[] dfa_90s = {
            "\1\1\64\uffff\1\2",
            "",
            "\1\3",
            "\1\10\1\7\1\13\1\uffff\1\12\1\14\1\10\12\uffff\1\4\41\uffff\1\6\7\uffff\1\10\1\5\1\11",
            "\1\15",
            "\1\16",
            "",
            "",
            "",
            "\1\13\1\uffff\1\12",
            "",
            "",
            "",
            "\1\10\1\7\1\13\1\uffff\1\12\1\14\1\10\12\uffff\1\4\41\uffff\1\6\7\uffff\1\10\1\5\1\11",
            "\1\10\1\7\1\13\1\uffff\1\12\1\14\1\10\54\uffff\1\6\7\uffff\1\10\1\uffff\1\11"
    };

    static final short[] dfa_84 = DFA.unpackEncodedString(dfa_84s);
    static final short[] dfa_85 = DFA.unpackEncodedString(dfa_85s);
    static final char[] dfa_86 = DFA.unpackEncodedStringToUnsignedChars(dfa_86s);
    static final char[] dfa_87 = DFA.unpackEncodedStringToUnsignedChars(dfa_87s);
    static final short[] dfa_88 = DFA.unpackEncodedString(dfa_88s);
    static final short[] dfa_89 = DFA.unpackEncodedString(dfa_89s);
    static final short[][] dfa_90 = unpackEncodedStringArray(dfa_90s);

    class DFA141 extends DFA {

        public DFA141(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 141;
            this.eot = dfa_84;
            this.eof = dfa_85;
            this.min = dfa_86;
            this.max = dfa_87;
            this.accept = dfa_88;
            this.special = dfa_89;
            this.transition = dfa_90;
        }
        public String getDescription() {
            return "5615:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_3= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )";
        }
    }
    static final String dfa_91s = "\1\5\61\uffff";
    static final String[] dfa_92s = {
            "\1\1\5\uffff\1\2\5\uffff\1\5\1\uffff\1\5\11\uffff\3\4\2\uffff\1\1\35\uffff\1\3\2\uffff\4\4",
            "",
            "\1\2\5\uffff\1\5\1\uffff\1\5\11\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\6",
            "",
            "",
            "\1\15\1\14\1\16\1\uffff\1\12\1\17\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\7\6\uffff\3\4\30\uffff\1\13\7\uffff\1\3\1\10\1\11\4\4",
            "\1\20",
            "\1\21",
            "\1\16\1\uffff\1\12",
            "\1\2\5\uffff\1\5\1\uffff\1\5\11\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\22",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\23\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\24\3\uffff\1\23\2\uffff\3\4\40\uffff\1\3\1\25\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\11\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\11\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\15\1\14\1\16\1\uffff\1\12\1\17\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\7\6\uffff\3\4\30\uffff\1\13\7\uffff\1\3\1\10\1\11\4\4",
            "\1\15\1\14\1\16\1\uffff\1\12\1\17\1\2\5\uffff\1\5\1\uffff\1\5\11\uffff\3\4\30\uffff\1\13\7\uffff\1\3\1\uffff\1\11\4\4",
            "\1\26\42\uffff\1\30\7\uffff\1\27",
            "\1\32\1\31",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\40\1\37\3\uffff\1\41",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\23\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\42\3\uffff\1\23\2\uffff\3\4\40\uffff\1\3\1\43\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\24\3\uffff\1\23\2\uffff\3\4\40\uffff\1\3\1\25\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\23\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\26\42\uffff\1\30\7\uffff\1\27",
            "\1\30",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\45\3\uffff\1\44\2\uffff\3\4\40\uffff\1\3\1\46\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\47",
            "\1\50",
            "\1\52\1\51\3\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\42\3\uffff\1\23\2\uffff\3\4\40\uffff\1\3\1\43\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\23\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\56\3\uffff\1\44\2\uffff\3\4\40\uffff\1\3\1\57\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\45\3\uffff\1\44\2\uffff\3\4\40\uffff\1\3\1\46\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4",
            "\1\60",
            "\1\61",
            "\1\2\5\uffff\1\5\1\uffff\1\5\2\uffff\1\56\3\uffff\1\44\2\uffff\3\4\40\uffff\1\3\1\57\1\uffff\4\4",
            "\1\2\5\uffff\1\5\1\uffff\1\5\6\uffff\1\44\2\uffff\3\4\40\uffff\1\3\2\uffff\4\4"
    };
    static final short[] dfa_91 = DFA.unpackEncodedString(dfa_91s);
    static final short[][] dfa_92 = unpackEncodedStringArray(dfa_92s);

    class DFA163 extends DFA {

        public DFA163(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 163;
            this.eot = dfa_15;
            this.eof = dfa_91;
            this.min = dfa_16;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_19;
            this.transition = dfa_92;
        }
        public String getDescription() {
            return "809:5: ( ( (lv_regions_13_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_14_0= ruleSingleControlflowRegion ) ) )?";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x8000000070000402L,0x000000000000003CL});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000200000012L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x8000000000010400L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020030L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020020L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x807F000070000400L,0x0000001FC000003CL});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x8000000000040400L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x807F000200000410L,0x0000001FC0000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x24000000800003F0L,0x0000000008400002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L,0x0000000008400000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x8000000000400400L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004800022L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004800002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x8000000000000410L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x807F7E1278050410L,0x0000001FC000003CL});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x8000000008050400L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x8000000070000400L,0x000000000000003CL});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000060000000L,0x000000000000003CL});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L,0x000000000000003CL});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000050000000L,0x000000000000003CL});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x8000000004900420L,0x00000000000001C0L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x8000000004900400L,0x00000000000001C0L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x8000000001100400L,0x00000000000001C0L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x8000000002100400L,0x00000000000001C0L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x8000000000100400L,0x00000000000001C0L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000102000010L,0x0000000008400000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000102000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x807F000100000400L,0x0000001FC0000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x8000000078000410L,0x000000000000003CL});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000008000010L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x8000000078000400L,0x000000000000003CL});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000080020L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x8000000000000400L,0x00000000000001C0L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000007000000022L,0x0000000000000E00L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000006000000022L,0x0000000000000E00L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000004000000022L,0x0000000000000E00L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000004000000022L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x24000080800003F2L,0x0000000008400002L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x8400000000000490L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x24000080801003F2L,0x0000000008400002L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000008000100002L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000300000000000L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x24000000801003F2L,0x0000000008400002L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x8000800000000400L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x807F000000000400L,0x0000001FC0000000L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x007E000000000000L,0x0000001FC0000000L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x007C000000000000L,0x0000001FC0000000L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0078000000000000L,0x0000001FC0000000L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0070000000000000L,0x0000001FC0000000L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0060000000000000L,0x0000001FC0000000L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0040000000000000L,0x0000001FC0000000L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000002100000L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0280000000080002L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0200000000000002L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x4000000000000000L,0x000000F003800000L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0080000000080000L,0x000000000000F000L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0080000000000000L,0x0000000000030000L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x8000000000000480L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x8400000000000400L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x1800000080000000L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x64000000800003F0L,0x0000000008400002L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x4000000000000002L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x1400000000000002L,0x00000000003C0000L});
        public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
        public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x04000000800003F0L,0x0000000008400002L});
        public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
        public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
        public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0080000000000002L});
        public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000230L});
        public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000002L});
        public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000002L});
        public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000200002L,0x0000000000000001L});
        public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x8000000000050402L});
        public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000012L});
    }


}