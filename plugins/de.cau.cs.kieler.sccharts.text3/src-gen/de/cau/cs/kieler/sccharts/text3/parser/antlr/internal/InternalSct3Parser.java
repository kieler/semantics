package de.cau.cs.kieler.sccharts.text3.parser.antlr.internal; 

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
import de.cau.cs.kieler.sccharts.text3.services.Sct3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSct3Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_HOSTCODE", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'scchart'", "'{'", "'}'", "'initial'", "'final'", "'connector'", "'state'", "'immediate'", "'deferred'", "'if'", "'then'", "';'", "'entry'", "'during'", "'exit'", "'weak'", "'suspend'", "'iterate'", "'init'", "'region'", "':'", "'dataflow'", "'='", "'('", "')'", "'scope'", "'expression'", "'const'", "'input'", "'output'", "'static'", "'signal'", "','", "'&'", "'['", "']'", "'combine'", "'<'", "'()'", "'>'", "'.'", "'!'", "'@'", "'#'", "'-'", "'--'", "'-- abort'", "'-- join'", "'reset'", "'shallow history'", "'history'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'++'", "'=='", "'<='", "'>='", "'!='", "'pre'", "'|'", "'+'", "'*'", "'%'", "'/'", "'val'", "'||'", "'&&'", "'pure'", "'bool'", "'unsigned'", "'int'", "'float'", "'string'", "'host'", "'none'", "'max'", "'min'"
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
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int RULE_BOOLEAN=9;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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


        public InternalSct3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSct3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSct3Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalSct3.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private Sct3GrammarAccess grammarAccess;
     	
        public InternalSct3Parser(TokenStream input, Sct3GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SCCharts";	
       	}
       	
       	@Override
       	protected Sct3GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSCCharts"
    // InternalSct3.g:74:1: entryRuleSCCharts returns [EObject current=null] : iv_ruleSCCharts= ruleSCCharts EOF ;
    public final EObject entryRuleSCCharts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSCCharts = null;


        try {
            // InternalSct3.g:75:2: (iv_ruleSCCharts= ruleSCCharts EOF )
            // InternalSct3.g:76:2: iv_ruleSCCharts= ruleSCCharts EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSCChartsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSCCharts=ruleSCCharts();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSCCharts; 
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
    // $ANTLR end "entryRuleSCCharts"


    // $ANTLR start "ruleSCCharts"
    // InternalSct3.g:83:1: ruleSCCharts returns [EObject current=null] : ( (lv_rootStates_0_0= ruleRootState ) )* ;
    public final EObject ruleSCCharts() throws RecognitionException {
        EObject current = null;

        EObject lv_rootStates_0_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:86:28: ( ( (lv_rootStates_0_0= ruleRootState ) )* )
            // InternalSct3.g:87:1: ( (lv_rootStates_0_0= ruleRootState ) )*
            {
            // InternalSct3.g:87:1: ( (lv_rootStates_0_0= ruleRootState ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_COMMENT_ANNOTATION||LA1_0==16||LA1_0==58) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSct3.g:88:1: (lv_rootStates_0_0= ruleRootState )
            	    {
            	    // InternalSct3.g:88:1: (lv_rootStates_0_0= ruleRootState )
            	    // InternalSct3.g:89:3: lv_rootStates_0_0= ruleRootState
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSCChartsAccess().getRootStatesRootStateParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_rootStates_0_0=ruleRootState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSCChartsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"rootStates",
            	              		lv_rootStates_0_0, 
            	              		"de.cau.cs.kieler.sccharts.text3.Sct3.RootState");
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
    // $ANTLR end "ruleSCCharts"


    // $ANTLR start "entryRuleRootState"
    // InternalSct3.g:113:1: entryRuleRootState returns [EObject current=null] : iv_ruleRootState= ruleRootState EOF ;
    public final EObject entryRuleRootState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootState = null;


        try {
            // InternalSct3.g:114:2: (iv_ruleRootState= ruleRootState EOF )
            // InternalSct3.g:115:2: iv_ruleRootState= ruleRootState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRootStateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRootState=ruleRootState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRootState; 
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
    // $ANTLR end "entryRuleRootState"


    // $ANTLR start "ruleRootState"
    // InternalSct3.g:122:1: ruleRootState returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'scchart' ( (lv_id_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_declarations_5_0= ruleDeclarationWOSemicolon ) )* ( (lv_localActions_6_0= ruleLocalAction ) )* ( ( (lv_regions_7_0= ruleSingleControlflowRegion ) ) | ( (lv_regions_8_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_9_0= ruleRegion ) )* ) otherlv_10= '}' ) ;
    public final EObject ruleRootState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token otherlv_10=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_declarations_5_0 = null;

        EObject lv_localActions_6_0 = null;

        EObject lv_regions_7_0 = null;

        EObject lv_regions_8_0 = null;

        EObject lv_regions_9_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:125:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'scchart' ( (lv_id_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_declarations_5_0= ruleDeclarationWOSemicolon ) )* ( (lv_localActions_6_0= ruleLocalAction ) )* ( ( (lv_regions_7_0= ruleSingleControlflowRegion ) ) | ( (lv_regions_8_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_9_0= ruleRegion ) )* ) otherlv_10= '}' ) )
            // InternalSct3.g:126:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'scchart' ( (lv_id_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_declarations_5_0= ruleDeclarationWOSemicolon ) )* ( (lv_localActions_6_0= ruleLocalAction ) )* ( ( (lv_regions_7_0= ruleSingleControlflowRegion ) ) | ( (lv_regions_8_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_9_0= ruleRegion ) )* ) otherlv_10= '}' )
            {
            // InternalSct3.g:126:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'scchart' ( (lv_id_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_declarations_5_0= ruleDeclarationWOSemicolon ) )* ( (lv_localActions_6_0= ruleLocalAction ) )* ( ( (lv_regions_7_0= ruleSingleControlflowRegion ) ) | ( (lv_regions_8_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_9_0= ruleRegion ) )* ) otherlv_10= '}' )
            // InternalSct3.g:126:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'scchart' ( (lv_id_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? otherlv_4= '{' ( (lv_declarations_5_0= ruleDeclarationWOSemicolon ) )* ( (lv_localActions_6_0= ruleLocalAction ) )* ( ( (lv_regions_7_0= ruleSingleControlflowRegion ) ) | ( (lv_regions_8_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_9_0= ruleRegion ) )* ) otherlv_10= '}'
            {
            // InternalSct3.g:126:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMENT_ANNOTATION||LA2_0==58) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSct3.g:127:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct3.g:127:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct3.g:128:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRootStateAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRootStateRule());
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
            	    break loop2;
                }
            } while (true);

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRootStateAccess().getScchartKeyword_1());
                  
            }
            // InternalSct3.g:148:1: ( (lv_id_2_0= RULE_ID ) )
            // InternalSct3.g:149:1: (lv_id_2_0= RULE_ID )
            {
            // InternalSct3.g:149:1: (lv_id_2_0= RULE_ID )
            // InternalSct3.g:150:3: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_2_0, grammarAccess.getRootStateAccess().getIdIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRootStateRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_2_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalSct3.g:166:2: ( (lv_label_3_0= RULE_STRING ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSct3.g:167:1: (lv_label_3_0= RULE_STRING )
                    {
                    // InternalSct3.g:167:1: (lv_label_3_0= RULE_STRING )
                    // InternalSct3.g:168:3: lv_label_3_0= RULE_STRING
                    {
                    lv_label_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_3_0, grammarAccess.getRootStateAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRootStateRule());
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

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRootStateAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // InternalSct3.g:188:1: ( (lv_declarations_5_0= ruleDeclarationWOSemicolon ) )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalSct3.g:189:1: (lv_declarations_5_0= ruleDeclarationWOSemicolon )
            	    {
            	    // InternalSct3.g:189:1: (lv_declarations_5_0= ruleDeclarationWOSemicolon )
            	    // InternalSct3.g:190:3: lv_declarations_5_0= ruleDeclarationWOSemicolon
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRootStateAccess().getDeclarationsDeclarationWOSemicolonParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_declarations_5_0=ruleDeclarationWOSemicolon();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRootStateRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_5_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.DeclarationWOSemicolon");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalSct3.g:206:3: ( (lv_localActions_6_0= ruleLocalAction ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    int LA5_2 = input.LA(2);

                    if ( (synpred5_InternalSct3()) ) {
                        alt5=1;
                    }


                }
                else if ( (LA5_0==23||(LA5_0>=28 && LA5_0<=34)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSct3.g:207:1: (lv_localActions_6_0= ruleLocalAction )
            	    {
            	    // InternalSct3.g:207:1: (lv_localActions_6_0= ruleLocalAction )
            	    // InternalSct3.g:208:3: lv_localActions_6_0= ruleLocalAction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRootStateAccess().getLocalActionsLocalActionParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_localActions_6_0=ruleLocalAction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRootStateRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"localActions",
            	              		lv_localActions_6_0, 
            	              		"de.cau.cs.kieler.sccharts.text3.Sct3.LocalAction");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalSct3.g:224:3: ( ( (lv_regions_7_0= ruleSingleControlflowRegion ) ) | ( (lv_regions_8_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_9_0= ruleRegion ) )* )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalSct3.g:224:4: ( (lv_regions_7_0= ruleSingleControlflowRegion ) )
                    {
                    // InternalSct3.g:224:4: ( (lv_regions_7_0= ruleSingleControlflowRegion ) )
                    // InternalSct3.g:225:1: (lv_regions_7_0= ruleSingleControlflowRegion )
                    {
                    // InternalSct3.g:225:1: (lv_regions_7_0= ruleSingleControlflowRegion )
                    // InternalSct3.g:226:3: lv_regions_7_0= ruleSingleControlflowRegion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRootStateAccess().getRegionsSingleControlflowRegionParserRuleCall_7_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_10);
                    lv_regions_7_0=ruleSingleControlflowRegion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRootStateRule());
                      	        }
                             		add(
                             			current, 
                             			"regions",
                              		lv_regions_7_0, 
                              		"de.cau.cs.kieler.sccharts.text3.Sct3.SingleControlflowRegion");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSct3.g:243:6: ( (lv_regions_8_0= ruleSingleDataflowRegion ) )
                    {
                    // InternalSct3.g:243:6: ( (lv_regions_8_0= ruleSingleDataflowRegion ) )
                    // InternalSct3.g:244:1: (lv_regions_8_0= ruleSingleDataflowRegion )
                    {
                    // InternalSct3.g:244:1: (lv_regions_8_0= ruleSingleDataflowRegion )
                    // InternalSct3.g:245:3: lv_regions_8_0= ruleSingleDataflowRegion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRootStateAccess().getRegionsSingleDataflowRegionParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_10);
                    lv_regions_8_0=ruleSingleDataflowRegion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRootStateRule());
                      	        }
                             		add(
                             			current, 
                             			"regions",
                              		lv_regions_8_0, 
                              		"de.cau.cs.kieler.sccharts.text3.Sct3.SingleDataflowRegion");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSct3.g:262:6: ( (lv_regions_9_0= ruleRegion ) )*
                    {
                    // InternalSct3.g:262:6: ( (lv_regions_9_0= ruleRegion ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_COMMENT_ANNOTATION||LA6_0==35||LA6_0==37||LA6_0==58) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSct3.g:263:1: (lv_regions_9_0= ruleRegion )
                    	    {
                    	    // InternalSct3.g:263:1: (lv_regions_9_0= ruleRegion )
                    	    // InternalSct3.g:264:3: lv_regions_9_0= ruleRegion
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRootStateAccess().getRegionsRegionParserRuleCall_7_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_11);
                    	    lv_regions_9_0=ruleRegion();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRootStateRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"regions",
                    	              		lv_regions_9_0, 
                    	              		"de.cau.cs.kieler.sccharts.text3.Sct3.Region");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getRootStateAccess().getRightCurlyBracketKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRootState"


    // $ANTLR start "entryRuleState"
    // InternalSct3.g:292:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalSct3.g:293:2: (iv_ruleState= ruleState EOF )
            // InternalSct3.g:294:2: iv_ruleState= ruleState EOF
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
    // InternalSct3.g:301:1: ruleState returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_initial_1_0= 'initial' ) )? ( (lv_final_2_0= 'final' ) )? ( (lv_connector_3_0= 'connector' ) )? otherlv_4= 'state' ( (lv_id_5_0= RULE_ID ) ) ( (lv_label_6_0= RULE_STRING ) )? (otherlv_7= '{' ( (lv_declarations_8_0= ruleDeclarationWOSemicolon ) )* ( (lv_localActions_9_0= ruleLocalAction ) )* ( ( (lv_regions_10_0= ruleSingleControlflowRegion ) ) | ( (lv_regions_11_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_12_0= ruleRegion ) )* ) otherlv_13= '}' )? ( (lv_outgoingTransitions_14_0= ruleTransition ) )* ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_initial_1_0=null;
        Token lv_final_2_0=null;
        Token lv_connector_3_0=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        Token lv_label_6_0=null;
        Token otherlv_7=null;
        Token otherlv_13=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_declarations_8_0 = null;

        EObject lv_localActions_9_0 = null;

        EObject lv_regions_10_0 = null;

        EObject lv_regions_11_0 = null;

        EObject lv_regions_12_0 = null;

        EObject lv_outgoingTransitions_14_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:304:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_initial_1_0= 'initial' ) )? ( (lv_final_2_0= 'final' ) )? ( (lv_connector_3_0= 'connector' ) )? otherlv_4= 'state' ( (lv_id_5_0= RULE_ID ) ) ( (lv_label_6_0= RULE_STRING ) )? (otherlv_7= '{' ( (lv_declarations_8_0= ruleDeclarationWOSemicolon ) )* ( (lv_localActions_9_0= ruleLocalAction ) )* ( ( (lv_regions_10_0= ruleSingleControlflowRegion ) ) | ( (lv_regions_11_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_12_0= ruleRegion ) )* ) otherlv_13= '}' )? ( (lv_outgoingTransitions_14_0= ruleTransition ) )* ) )
            // InternalSct3.g:305:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_initial_1_0= 'initial' ) )? ( (lv_final_2_0= 'final' ) )? ( (lv_connector_3_0= 'connector' ) )? otherlv_4= 'state' ( (lv_id_5_0= RULE_ID ) ) ( (lv_label_6_0= RULE_STRING ) )? (otherlv_7= '{' ( (lv_declarations_8_0= ruleDeclarationWOSemicolon ) )* ( (lv_localActions_9_0= ruleLocalAction ) )* ( ( (lv_regions_10_0= ruleSingleControlflowRegion ) ) | ( (lv_regions_11_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_12_0= ruleRegion ) )* ) otherlv_13= '}' )? ( (lv_outgoingTransitions_14_0= ruleTransition ) )* )
            {
            // InternalSct3.g:305:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_initial_1_0= 'initial' ) )? ( (lv_final_2_0= 'final' ) )? ( (lv_connector_3_0= 'connector' ) )? otherlv_4= 'state' ( (lv_id_5_0= RULE_ID ) ) ( (lv_label_6_0= RULE_STRING ) )? (otherlv_7= '{' ( (lv_declarations_8_0= ruleDeclarationWOSemicolon ) )* ( (lv_localActions_9_0= ruleLocalAction ) )* ( ( (lv_regions_10_0= ruleSingleControlflowRegion ) ) | ( (lv_regions_11_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_12_0= ruleRegion ) )* ) otherlv_13= '}' )? ( (lv_outgoingTransitions_14_0= ruleTransition ) )* )
            // InternalSct3.g:305:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_initial_1_0= 'initial' ) )? ( (lv_final_2_0= 'final' ) )? ( (lv_connector_3_0= 'connector' ) )? otherlv_4= 'state' ( (lv_id_5_0= RULE_ID ) ) ( (lv_label_6_0= RULE_STRING ) )? (otherlv_7= '{' ( (lv_declarations_8_0= ruleDeclarationWOSemicolon ) )* ( (lv_localActions_9_0= ruleLocalAction ) )* ( ( (lv_regions_10_0= ruleSingleControlflowRegion ) ) | ( (lv_regions_11_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_12_0= ruleRegion ) )* ) otherlv_13= '}' )? ( (lv_outgoingTransitions_14_0= ruleTransition ) )*
            {
            // InternalSct3.g:305:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMENT_ANNOTATION||LA8_0==58) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSct3.g:306:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct3.g:306:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct3.g:307:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_12);
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
            	    break loop8;
                }
            } while (true);

            // InternalSct3.g:323:3: ( (lv_initial_1_0= 'initial' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSct3.g:324:1: (lv_initial_1_0= 'initial' )
                    {
                    // InternalSct3.g:324:1: (lv_initial_1_0= 'initial' )
                    // InternalSct3.g:325:3: lv_initial_1_0= 'initial'
                    {
                    lv_initial_1_0=(Token)match(input,19,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_initial_1_0, grammarAccess.getStateAccess().getInitialInitialKeyword_1_0());
                          
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

            // InternalSct3.g:338:3: ( (lv_final_2_0= 'final' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSct3.g:339:1: (lv_final_2_0= 'final' )
                    {
                    // InternalSct3.g:339:1: (lv_final_2_0= 'final' )
                    // InternalSct3.g:340:3: lv_final_2_0= 'final'
                    {
                    lv_final_2_0=(Token)match(input,20,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_final_2_0, grammarAccess.getStateAccess().getFinalFinalKeyword_2_0());
                          
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

            // InternalSct3.g:353:3: ( (lv_connector_3_0= 'connector' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSct3.g:354:1: (lv_connector_3_0= 'connector' )
                    {
                    // InternalSct3.g:354:1: (lv_connector_3_0= 'connector' )
                    // InternalSct3.g:355:3: lv_connector_3_0= 'connector'
                    {
                    lv_connector_3_0=(Token)match(input,21,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_connector_3_0, grammarAccess.getStateAccess().getConnectorConnectorKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStateRule());
                      	        }
                             		setWithLastConsumed(current, "connector", true, "connector");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getStateKeyword_4());
                  
            }
            // InternalSct3.g:372:1: ( (lv_id_5_0= RULE_ID ) )
            // InternalSct3.g:373:1: (lv_id_5_0= RULE_ID )
            {
            // InternalSct3.g:373:1: (lv_id_5_0= RULE_ID )
            // InternalSct3.g:374:3: lv_id_5_0= RULE_ID
            {
            lv_id_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_5_0, grammarAccess.getStateAccess().getIdIDTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStateRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_5_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalSct3.g:390:2: ( (lv_label_6_0= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSct3.g:391:1: (lv_label_6_0= RULE_STRING )
                    {
                    // InternalSct3.g:391:1: (lv_label_6_0= RULE_STRING )
                    // InternalSct3.g:392:3: lv_label_6_0= RULE_STRING
                    {
                    lv_label_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_6_0, grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_6_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStateRule());
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

            // InternalSct3.g:408:3: (otherlv_7= '{' ( (lv_declarations_8_0= ruleDeclarationWOSemicolon ) )* ( (lv_localActions_9_0= ruleLocalAction ) )* ( ( (lv_regions_10_0= ruleSingleControlflowRegion ) ) | ( (lv_regions_11_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_12_0= ruleRegion ) )* ) otherlv_13= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSct3.g:408:5: otherlv_7= '{' ( (lv_declarations_8_0= ruleDeclarationWOSemicolon ) )* ( (lv_localActions_9_0= ruleLocalAction ) )* ( ( (lv_regions_10_0= ruleSingleControlflowRegion ) ) | ( (lv_regions_11_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_12_0= ruleRegion ) )* ) otherlv_13= '}'
                    {
                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_7_0());
                          
                    }
                    // InternalSct3.g:412:1: ( (lv_declarations_8_0= ruleDeclarationWOSemicolon ) )*
                    loop13:
                    do {
                        int alt13=2;
                        alt13 = dfa13.predict(input);
                        switch (alt13) {
                    	case 1 :
                    	    // InternalSct3.g:413:1: (lv_declarations_8_0= ruleDeclarationWOSemicolon )
                    	    {
                    	    // InternalSct3.g:413:1: (lv_declarations_8_0= ruleDeclarationWOSemicolon )
                    	    // InternalSct3.g:414:3: lv_declarations_8_0= ruleDeclarationWOSemicolon
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStateAccess().getDeclarationsDeclarationWOSemicolonParserRuleCall_7_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_8);
                    	    lv_declarations_8_0=ruleDeclarationWOSemicolon();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declarations",
                    	              		lv_declarations_8_0, 
                    	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.DeclarationWOSemicolon");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // InternalSct3.g:430:3: ( (lv_localActions_9_0= ruleLocalAction ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==20) ) {
                            int LA14_2 = input.LA(2);

                            if ( (synpred15_InternalSct3()) ) {
                                alt14=1;
                            }


                        }
                        else if ( (LA14_0==23||(LA14_0>=28 && LA14_0<=34)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSct3.g:431:1: (lv_localActions_9_0= ruleLocalAction )
                    	    {
                    	    // InternalSct3.g:431:1: (lv_localActions_9_0= ruleLocalAction )
                    	    // InternalSct3.g:432:3: lv_localActions_9_0= ruleLocalAction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStateAccess().getLocalActionsLocalActionParserRuleCall_7_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_9);
                    	    lv_localActions_9_0=ruleLocalAction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"localActions",
                    	              		lv_localActions_9_0, 
                    	              		"de.cau.cs.kieler.sccharts.text3.Sct3.LocalAction");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // InternalSct3.g:448:3: ( ( (lv_regions_10_0= ruleSingleControlflowRegion ) ) | ( (lv_regions_11_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_12_0= ruleRegion ) )* )
                    int alt16=3;
                    alt16 = dfa16.predict(input);
                    switch (alt16) {
                        case 1 :
                            // InternalSct3.g:448:4: ( (lv_regions_10_0= ruleSingleControlflowRegion ) )
                            {
                            // InternalSct3.g:448:4: ( (lv_regions_10_0= ruleSingleControlflowRegion ) )
                            // InternalSct3.g:449:1: (lv_regions_10_0= ruleSingleControlflowRegion )
                            {
                            // InternalSct3.g:449:1: (lv_regions_10_0= ruleSingleControlflowRegion )
                            // InternalSct3.g:450:3: lv_regions_10_0= ruleSingleControlflowRegion
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStateAccess().getRegionsSingleControlflowRegionParserRuleCall_7_3_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_10);
                            lv_regions_10_0=ruleSingleControlflowRegion();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStateRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"regions",
                                      		lv_regions_10_0, 
                                      		"de.cau.cs.kieler.sccharts.text3.Sct3.SingleControlflowRegion");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSct3.g:467:6: ( (lv_regions_11_0= ruleSingleDataflowRegion ) )
                            {
                            // InternalSct3.g:467:6: ( (lv_regions_11_0= ruleSingleDataflowRegion ) )
                            // InternalSct3.g:468:1: (lv_regions_11_0= ruleSingleDataflowRegion )
                            {
                            // InternalSct3.g:468:1: (lv_regions_11_0= ruleSingleDataflowRegion )
                            // InternalSct3.g:469:3: lv_regions_11_0= ruleSingleDataflowRegion
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStateAccess().getRegionsSingleDataflowRegionParserRuleCall_7_3_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_10);
                            lv_regions_11_0=ruleSingleDataflowRegion();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStateRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"regions",
                                      		lv_regions_11_0, 
                                      		"de.cau.cs.kieler.sccharts.text3.Sct3.SingleDataflowRegion");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalSct3.g:486:6: ( (lv_regions_12_0= ruleRegion ) )*
                            {
                            // InternalSct3.g:486:6: ( (lv_regions_12_0= ruleRegion ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==RULE_COMMENT_ANNOTATION||LA15_0==35||LA15_0==37||LA15_0==58) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // InternalSct3.g:487:1: (lv_regions_12_0= ruleRegion )
                            	    {
                            	    // InternalSct3.g:487:1: (lv_regions_12_0= ruleRegion )
                            	    // InternalSct3.g:488:3: lv_regions_12_0= ruleRegion
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_7_3_2_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_11);
                            	    lv_regions_12_0=ruleRegion();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getStateRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"regions",
                            	              		lv_regions_12_0, 
                            	              		"de.cau.cs.kieler.sccharts.text3.Sct3.Region");
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

                    otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_7_4());
                          
                    }

                    }
                    break;

            }

            // InternalSct3.g:508:3: ( (lv_outgoingTransitions_14_0= ruleTransition ) )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // InternalSct3.g:509:1: (lv_outgoingTransitions_14_0= ruleTransition )
            	    {
            	    // InternalSct3.g:509:1: (lv_outgoingTransitions_14_0= ruleTransition )
            	    // InternalSct3.g:510:3: lv_outgoingTransitions_14_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_8_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_outgoingTransitions_14_0=ruleTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStateRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"outgoingTransitions",
            	              		lv_outgoingTransitions_14_0, 
            	              		"de.cau.cs.kieler.sccharts.text3.Sct3.Transition");
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalSct3.g:534:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalSct3.g:535:2: (iv_ruleTransition= ruleTransition EOF )
            // InternalSct3.g:536:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalSct3.g:543:1: ruleTransition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleRestrictedTypeAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_immediate_3_0= 'immediate' ) )? ( (lv_deferred_4_0= 'deferred' ) )? ( (lv_history_5_0= ruleHistoryType ) )? ( ( (otherlv_6= 'if' ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) ) )? (otherlv_9= 'then' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | (otherlv_13= 'if' ( (lv_label_14_0= RULE_STRING ) ) ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_immediate_3_0=null;
        Token lv_deferred_4_0=null;
        Token otherlv_6=null;
        Token lv_delay_7_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_label_14_0=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_1_0 = null;

        Enumerator lv_history_5_0 = null;

        EObject lv_trigger_8_0 = null;

        EObject lv_effects_10_0 = null;

        EObject lv_effects_12_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:546:28: ( ( ( (lv_annotations_0_0= ruleRestrictedTypeAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_immediate_3_0= 'immediate' ) )? ( (lv_deferred_4_0= 'deferred' ) )? ( (lv_history_5_0= ruleHistoryType ) )? ( ( (otherlv_6= 'if' ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) ) )? (otherlv_9= 'then' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | (otherlv_13= 'if' ( (lv_label_14_0= RULE_STRING ) ) ) )? ) )
            // InternalSct3.g:547:1: ( ( (lv_annotations_0_0= ruleRestrictedTypeAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_immediate_3_0= 'immediate' ) )? ( (lv_deferred_4_0= 'deferred' ) )? ( (lv_history_5_0= ruleHistoryType ) )? ( ( (otherlv_6= 'if' ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) ) )? (otherlv_9= 'then' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | (otherlv_13= 'if' ( (lv_label_14_0= RULE_STRING ) ) ) )? )
            {
            // InternalSct3.g:547:1: ( ( (lv_annotations_0_0= ruleRestrictedTypeAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_immediate_3_0= 'immediate' ) )? ( (lv_deferred_4_0= 'deferred' ) )? ( (lv_history_5_0= ruleHistoryType ) )? ( ( (otherlv_6= 'if' ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) ) )? (otherlv_9= 'then' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | (otherlv_13= 'if' ( (lv_label_14_0= RULE_STRING ) ) ) )? )
            // InternalSct3.g:547:2: ( (lv_annotations_0_0= ruleRestrictedTypeAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_immediate_3_0= 'immediate' ) )? ( (lv_deferred_4_0= 'deferred' ) )? ( (lv_history_5_0= ruleHistoryType ) )? ( ( (otherlv_6= 'if' ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) ) )? (otherlv_9= 'then' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | (otherlv_13= 'if' ( (lv_label_14_0= RULE_STRING ) ) ) )?
            {
            // InternalSct3.g:547:2: ( (lv_annotations_0_0= ruleRestrictedTypeAnnotation ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_COMMENT_ANNOTATION||LA19_0==58) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSct3.g:548:1: (lv_annotations_0_0= ruleRestrictedTypeAnnotation )
            	    {
            	    // InternalSct3.g:548:1: (lv_annotations_0_0= ruleRestrictedTypeAnnotation )
            	    // InternalSct3.g:549:3: lv_annotations_0_0= ruleRestrictedTypeAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTransitionAccess().getAnnotationsRestrictedTypeAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    lv_annotations_0_0=ruleRestrictedTypeAnnotation();

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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.RestrictedTypeAnnotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalSct3.g:565:3: ( (lv_type_1_0= ruleTransitionType ) )
            // InternalSct3.g:566:1: (lv_type_1_0= ruleTransitionType )
            {
            // InternalSct3.g:566:1: (lv_type_1_0= ruleTransitionType )
            // InternalSct3.g:567:3: lv_type_1_0= ruleTransitionType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionAccess().getTypeTransitionTypeEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_5);
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
                      		"de.cau.cs.kieler.sccharts.text3.Sct3.TransitionType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct3.g:583:2: ( (otherlv_2= RULE_ID ) )
            // InternalSct3.g:584:1: (otherlv_2= RULE_ID )
            {
            // InternalSct3.g:584:1: (otherlv_2= RULE_ID )
            // InternalSct3.g:585:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTransitionRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getTargetStateStateCrossReference_2_0()); 
              	
            }

            }


            }

            // InternalSct3.g:599:2: ( (lv_immediate_3_0= 'immediate' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSct3.g:600:1: (lv_immediate_3_0= 'immediate' )
                    {
                    // InternalSct3.g:600:1: (lv_immediate_3_0= 'immediate' )
                    // InternalSct3.g:601:3: lv_immediate_3_0= 'immediate'
                    {
                    lv_immediate_3_0=(Token)match(input,23,FollowSets000.FOLLOW_21); if (state.failed) return current;
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

            // InternalSct3.g:614:3: ( (lv_deferred_4_0= 'deferred' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSct3.g:615:1: (lv_deferred_4_0= 'deferred' )
                    {
                    // InternalSct3.g:615:1: (lv_deferred_4_0= 'deferred' )
                    // InternalSct3.g:616:3: lv_deferred_4_0= 'deferred'
                    {
                    lv_deferred_4_0=(Token)match(input,24,FollowSets000.FOLLOW_22); if (state.failed) return current;
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

            // InternalSct3.g:629:3: ( (lv_history_5_0= ruleHistoryType ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=64 && LA22_0<=66)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSct3.g:630:1: (lv_history_5_0= ruleHistoryType )
                    {
                    // InternalSct3.g:630:1: (lv_history_5_0= ruleHistoryType )
                    // InternalSct3.g:631:3: lv_history_5_0= ruleHistoryType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionAccess().getHistoryHistoryTypeEnumRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_23);
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
                              		"de.cau.cs.kieler.sccharts.text3.Sct3.HistoryType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct3.g:647:3: ( ( (otherlv_6= 'if' ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) ) )? (otherlv_9= 'then' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | (otherlv_13= 'if' ( (lv_label_14_0= RULE_STRING ) ) ) )?
            int alt27=3;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalSct3.g:647:4: ( (otherlv_6= 'if' ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) ) )? (otherlv_9= 'then' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? )
                    {
                    // InternalSct3.g:647:4: ( (otherlv_6= 'if' ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) ) )? (otherlv_9= 'then' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? )
                    // InternalSct3.g:647:5: (otherlv_6= 'if' ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) ) )? (otherlv_9= 'then' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )?
                    {
                    // InternalSct3.g:647:5: (otherlv_6= 'if' ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==25) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalSct3.g:647:7: otherlv_6= 'if' ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )
                            {
                            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getIfKeyword_6_0_0_0());
                                  
                            }
                            // InternalSct3.g:651:1: ( (lv_delay_7_0= RULE_INT ) )?
                            int alt23=2;
                            alt23 = dfa23.predict(input);
                            switch (alt23) {
                                case 1 :
                                    // InternalSct3.g:652:1: (lv_delay_7_0= RULE_INT )
                                    {
                                    // InternalSct3.g:652:1: (lv_delay_7_0= RULE_INT )
                                    // InternalSct3.g:653:3: lv_delay_7_0= RULE_INT
                                    {
                                    lv_delay_7_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_24); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_delay_7_0, grammarAccess.getTransitionAccess().getDelayINTTerminalRuleCall_6_0_0_1_0()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getTransitionRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"delay",
                                              		lv_delay_7_0, 
                                              		"de.cau.cs.kieler.core.annotations.text.Annotations.INT");
                                      	    
                                    }

                                    }


                                    }
                                    break;

                            }

                            // InternalSct3.g:669:3: ( (lv_trigger_8_0= ruleBoolExpression ) )
                            // InternalSct3.g:670:1: (lv_trigger_8_0= ruleBoolExpression )
                            {
                            // InternalSct3.g:670:1: (lv_trigger_8_0= ruleBoolExpression )
                            // InternalSct3.g:671:3: lv_trigger_8_0= ruleBoolExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTransitionAccess().getTriggerBoolExpressionParserRuleCall_6_0_0_2_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_25);
                            lv_trigger_8_0=ruleBoolExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"trigger",
                                      		lv_trigger_8_0, 
                                      		"de.cau.cs.kieler.core.kexpressions.KExpressions.BoolExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalSct3.g:687:4: (otherlv_9= 'then' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==26) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalSct3.g:687:6: otherlv_9= 'then' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )*
                            {
                            otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getThenKeyword_6_0_1_0());
                                  
                            }
                            // InternalSct3.g:691:1: ( (lv_effects_10_0= ruleEffect ) )
                            // InternalSct3.g:692:1: (lv_effects_10_0= ruleEffect )
                            {
                            // InternalSct3.g:692:1: (lv_effects_10_0= ruleEffect )
                            // InternalSct3.g:693:3: lv_effects_10_0= ruleEffect
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_6_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_27);
                            lv_effects_10_0=ruleEffect();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"effects",
                                      		lv_effects_10_0, 
                                      		"de.cau.cs.kieler.core.kexpressions.keffects.KEffects.Effect");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalSct3.g:709:2: (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==27) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // InternalSct3.g:709:4: otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) )
                            	    {
                            	    otherlv_11=(Token)match(input,27,FollowSets000.FOLLOW_26); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getSemicolonKeyword_6_0_1_2_0());
                            	          
                            	    }
                            	    // InternalSct3.g:713:1: ( (lv_effects_12_0= ruleEffect ) )
                            	    // InternalSct3.g:714:1: (lv_effects_12_0= ruleEffect )
                            	    {
                            	    // InternalSct3.g:714:1: (lv_effects_12_0= ruleEffect )
                            	    // InternalSct3.g:715:3: lv_effects_12_0= ruleEffect
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_6_0_1_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_27);
                            	    lv_effects_12_0=ruleEffect();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"effects",
                            	              		lv_effects_12_0, 
                            	              		"de.cau.cs.kieler.core.kexpressions.keffects.KEffects.Effect");
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


                    }


                    }
                    break;
                case 2 :
                    // InternalSct3.g:732:6: (otherlv_13= 'if' ( (lv_label_14_0= RULE_STRING ) ) )
                    {
                    // InternalSct3.g:732:6: (otherlv_13= 'if' ( (lv_label_14_0= RULE_STRING ) ) )
                    // InternalSct3.g:732:8: otherlv_13= 'if' ( (lv_label_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,25,FollowSets000.FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getTransitionAccess().getIfKeyword_6_1_0());
                          
                    }
                    // InternalSct3.g:736:1: ( (lv_label_14_0= RULE_STRING ) )
                    // InternalSct3.g:737:1: (lv_label_14_0= RULE_STRING )
                    {
                    // InternalSct3.g:737:1: (lv_label_14_0= RULE_STRING )
                    // InternalSct3.g:738:3: lv_label_14_0= RULE_STRING
                    {
                    lv_label_14_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_14_0, grammarAccess.getTransitionAccess().getLabelSTRINGTerminalRuleCall_6_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTransitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"label",
                              		lv_label_14_0, 
                              		"de.cau.cs.kieler.core.annotations.text.Annotations.STRING");
                      	    
                    }

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


    // $ANTLR start "entryRuleLocalAction"
    // InternalSct3.g:762:1: entryRuleLocalAction returns [EObject current=null] : iv_ruleLocalAction= ruleLocalAction EOF ;
    public final EObject entryRuleLocalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAction = null;


        try {
            // InternalSct3.g:763:2: (iv_ruleLocalAction= ruleLocalAction EOF )
            // InternalSct3.g:764:2: iv_ruleLocalAction= ruleLocalAction EOF
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
    // InternalSct3.g:771:1: ruleLocalAction returns [EObject current=null] : (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction | this_IterateAction_4= ruleIterateAction | this_InitAction_5= ruleInitAction | this_FinalAction_6= ruleFinalAction ) ;
    public final EObject ruleLocalAction() throws RecognitionException {
        EObject current = null;

        EObject this_EntryAction_0 = null;

        EObject this_DuringAction_1 = null;

        EObject this_ExitAction_2 = null;

        EObject this_SuspendAction_3 = null;

        EObject this_IterateAction_4 = null;

        EObject this_InitAction_5 = null;

        EObject this_FinalAction_6 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:774:28: ( (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction | this_IterateAction_4= ruleIterateAction | this_InitAction_5= ruleInitAction | this_FinalAction_6= ruleFinalAction ) )
            // InternalSct3.g:775:1: (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction | this_IterateAction_4= ruleIterateAction | this_InitAction_5= ruleInitAction | this_FinalAction_6= ruleFinalAction )
            {
            // InternalSct3.g:775:1: (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction | this_IterateAction_4= ruleIterateAction | this_InitAction_5= ruleInitAction | this_FinalAction_6= ruleFinalAction )
            int alt28=7;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt28=1;
                }
                break;
            case 23:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    alt28=2;
                    }
                    break;
                case 33:
                    {
                    alt28=5;
                    }
                    break;
                case 31:
                case 32:
                    {
                    alt28=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;
                }

                }
                break;
            case 29:
                {
                alt28=2;
                }
                break;
            case 30:
                {
                alt28=3;
                }
                break;
            case 31:
            case 32:
                {
                alt28=4;
                }
                break;
            case 33:
                {
                alt28=5;
                }
                break;
            case 34:
                {
                alt28=6;
                }
                break;
            case 20:
                {
                alt28=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalSct3.g:776:2: this_EntryAction_0= ruleEntryAction
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
                    // InternalSct3.g:789:2: this_DuringAction_1= ruleDuringAction
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
                    // InternalSct3.g:802:2: this_ExitAction_2= ruleExitAction
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
                    // InternalSct3.g:815:2: this_SuspendAction_3= ruleSuspendAction
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
                    // InternalSct3.g:828:2: this_IterateAction_4= ruleIterateAction
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
                case 6 :
                    // InternalSct3.g:841:2: this_InitAction_5= ruleInitAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalActionAccess().getInitActionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_InitAction_5=ruleInitAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InitAction_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalSct3.g:854:2: this_FinalAction_6= ruleFinalAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalActionAccess().getFinalActionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FinalAction_6=ruleFinalAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FinalAction_6; 
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


    // $ANTLR start "entryRuleEntryAction"
    // InternalSct3.g:873:1: entryRuleEntryAction returns [EObject current=null] : iv_ruleEntryAction= ruleEntryAction EOF ;
    public final EObject entryRuleEntryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryAction = null;


        try {
            // InternalSct3.g:874:2: (iv_ruleEntryAction= ruleEntryAction EOF )
            // InternalSct3.g:875:2: iv_ruleEntryAction= ruleEntryAction EOF
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
    // InternalSct3.g:882:1: ruleEntryAction returns [EObject current=null] : ( () otherlv_1= 'entry' (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )? (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? ) ;
    public final EObject ruleEntryAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_trigger_3_0 = null;

        EObject lv_effects_5_0 = null;

        EObject lv_effects_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:885:28: ( ( () otherlv_1= 'entry' (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )? (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? ) )
            // InternalSct3.g:886:1: ( () otherlv_1= 'entry' (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )? (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? )
            {
            // InternalSct3.g:886:1: ( () otherlv_1= 'entry' (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )? (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? )
            // InternalSct3.g:886:2: () otherlv_1= 'entry' (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )? (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )?
            {
            // InternalSct3.g:886:2: ()
            // InternalSct3.g:887:2: 
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

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntryActionAccess().getEntryKeyword_1());
                  
            }
            // InternalSct3.g:899:1: (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==25) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSct3.g:899:3: otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) )
                    {
                    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEntryActionAccess().getIfKeyword_2_0());
                          
                    }
                    // InternalSct3.g:903:1: ( (lv_trigger_3_0= ruleBoolExpression ) )
                    // InternalSct3.g:904:1: (lv_trigger_3_0= ruleBoolExpression )
                    {
                    // InternalSct3.g:904:1: (lv_trigger_3_0= ruleBoolExpression )
                    // InternalSct3.g:905:3: lv_trigger_3_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEntryActionAccess().getTriggerBoolExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
                    lv_trigger_3_0=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEntryActionRule());
                      	        }
                             		set(
                             			current, 
                             			"trigger",
                              		lv_trigger_3_0, 
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.BoolExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSct3.g:921:4: (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==26) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSct3.g:921:6: otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    {
                    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getEntryActionAccess().getThenKeyword_3_0());
                          
                    }
                    // InternalSct3.g:925:1: ( (lv_effects_5_0= ruleEffect ) )
                    // InternalSct3.g:926:1: (lv_effects_5_0= ruleEffect )
                    {
                    // InternalSct3.g:926:1: (lv_effects_5_0= ruleEffect )
                    // InternalSct3.g:927:3: lv_effects_5_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEntryActionAccess().getEffectsEffectParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_effects_5_0=ruleEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEntryActionRule());
                      	        }
                             		add(
                             			current, 
                             			"effects",
                              		lv_effects_5_0, 
                              		"de.cau.cs.kieler.core.kexpressions.keffects.KEffects.Effect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSct3.g:943:2: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==27) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalSct3.g:943:4: otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) )
                    	    {
                    	    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getEntryActionAccess().getSemicolonKeyword_3_2_0());
                    	          
                    	    }
                    	    // InternalSct3.g:947:1: ( (lv_effects_7_0= ruleEffect ) )
                    	    // InternalSct3.g:948:1: (lv_effects_7_0= ruleEffect )
                    	    {
                    	    // InternalSct3.g:948:1: (lv_effects_7_0= ruleEffect )
                    	    // InternalSct3.g:949:3: lv_effects_7_0= ruleEffect
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEntryActionAccess().getEffectsEffectParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_27);
                    	    lv_effects_7_0=ruleEffect();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEntryActionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"effects",
                    	              		lv_effects_7_0, 
                    	              		"de.cau.cs.kieler.core.kexpressions.keffects.KEffects.Effect");
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

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // InternalSct3.g:973:1: entryRuleDuringAction returns [EObject current=null] : iv_ruleDuringAction= ruleDuringAction EOF ;
    public final EObject entryRuleDuringAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuringAction = null;


        try {
            // InternalSct3.g:974:2: (iv_ruleDuringAction= ruleDuringAction EOF )
            // InternalSct3.g:975:2: iv_ruleDuringAction= ruleDuringAction EOF
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
    // InternalSct3.g:982:1: ruleDuringAction returns [EObject current=null] : ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' (otherlv_3= 'if' ( (lv_trigger_4_0= ruleBoolExpression ) ) )? (otherlv_5= 'then' ( (lv_effects_6_0= ruleEffect ) ) (otherlv_7= ';' ( (lv_effects_8_0= ruleEffect ) ) )* )? ) ;
    public final EObject ruleDuringAction() throws RecognitionException {
        EObject current = null;

        Token lv_immediate_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_trigger_4_0 = null;

        EObject lv_effects_6_0 = null;

        EObject lv_effects_8_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:985:28: ( ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' (otherlv_3= 'if' ( (lv_trigger_4_0= ruleBoolExpression ) ) )? (otherlv_5= 'then' ( (lv_effects_6_0= ruleEffect ) ) (otherlv_7= ';' ( (lv_effects_8_0= ruleEffect ) ) )* )? ) )
            // InternalSct3.g:986:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' (otherlv_3= 'if' ( (lv_trigger_4_0= ruleBoolExpression ) ) )? (otherlv_5= 'then' ( (lv_effects_6_0= ruleEffect ) ) (otherlv_7= ';' ( (lv_effects_8_0= ruleEffect ) ) )* )? )
            {
            // InternalSct3.g:986:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' (otherlv_3= 'if' ( (lv_trigger_4_0= ruleBoolExpression ) ) )? (otherlv_5= 'then' ( (lv_effects_6_0= ruleEffect ) ) (otherlv_7= ';' ( (lv_effects_8_0= ruleEffect ) ) )* )? )
            // InternalSct3.g:986:2: () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' (otherlv_3= 'if' ( (lv_trigger_4_0= ruleBoolExpression ) ) )? (otherlv_5= 'then' ( (lv_effects_6_0= ruleEffect ) ) (otherlv_7= ';' ( (lv_effects_8_0= ruleEffect ) ) )* )?
            {
            // InternalSct3.g:986:2: ()
            // InternalSct3.g:987:2: 
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

            // InternalSct3.g:995:2: ( (lv_immediate_1_0= 'immediate' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==23) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSct3.g:996:1: (lv_immediate_1_0= 'immediate' )
                    {
                    // InternalSct3.g:996:1: (lv_immediate_1_0= 'immediate' )
                    // InternalSct3.g:997:3: lv_immediate_1_0= 'immediate'
                    {
                    lv_immediate_1_0=(Token)match(input,23,FollowSets000.FOLLOW_29); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDuringActionAccess().getDuringKeyword_2());
                  
            }
            // InternalSct3.g:1014:1: (otherlv_3= 'if' ( (lv_trigger_4_0= ruleBoolExpression ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==25) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSct3.g:1014:3: otherlv_3= 'if' ( (lv_trigger_4_0= ruleBoolExpression ) )
                    {
                    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDuringActionAccess().getIfKeyword_3_0());
                          
                    }
                    // InternalSct3.g:1018:1: ( (lv_trigger_4_0= ruleBoolExpression ) )
                    // InternalSct3.g:1019:1: (lv_trigger_4_0= ruleBoolExpression )
                    {
                    // InternalSct3.g:1019:1: (lv_trigger_4_0= ruleBoolExpression )
                    // InternalSct3.g:1020:3: lv_trigger_4_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDuringActionAccess().getTriggerBoolExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
                    lv_trigger_4_0=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDuringActionRule());
                      	        }
                             		set(
                             			current, 
                             			"trigger",
                              		lv_trigger_4_0, 
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.BoolExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSct3.g:1036:4: (otherlv_5= 'then' ( (lv_effects_6_0= ruleEffect ) ) (otherlv_7= ';' ( (lv_effects_8_0= ruleEffect ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==26) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSct3.g:1036:6: otherlv_5= 'then' ( (lv_effects_6_0= ruleEffect ) ) (otherlv_7= ';' ( (lv_effects_8_0= ruleEffect ) ) )*
                    {
                    otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getDuringActionAccess().getThenKeyword_4_0());
                          
                    }
                    // InternalSct3.g:1040:1: ( (lv_effects_6_0= ruleEffect ) )
                    // InternalSct3.g:1041:1: (lv_effects_6_0= ruleEffect )
                    {
                    // InternalSct3.g:1041:1: (lv_effects_6_0= ruleEffect )
                    // InternalSct3.g:1042:3: lv_effects_6_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDuringActionAccess().getEffectsEffectParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_effects_6_0=ruleEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDuringActionRule());
                      	        }
                             		add(
                             			current, 
                             			"effects",
                              		lv_effects_6_0, 
                              		"de.cau.cs.kieler.core.kexpressions.keffects.KEffects.Effect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSct3.g:1058:2: (otherlv_7= ';' ( (lv_effects_8_0= ruleEffect ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==27) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalSct3.g:1058:4: otherlv_7= ';' ( (lv_effects_8_0= ruleEffect ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getDuringActionAccess().getSemicolonKeyword_4_2_0());
                    	          
                    	    }
                    	    // InternalSct3.g:1062:1: ( (lv_effects_8_0= ruleEffect ) )
                    	    // InternalSct3.g:1063:1: (lv_effects_8_0= ruleEffect )
                    	    {
                    	    // InternalSct3.g:1063:1: (lv_effects_8_0= ruleEffect )
                    	    // InternalSct3.g:1064:3: lv_effects_8_0= ruleEffect
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDuringActionAccess().getEffectsEffectParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_27);
                    	    lv_effects_8_0=ruleEffect();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDuringActionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"effects",
                    	              		lv_effects_8_0, 
                    	              		"de.cau.cs.kieler.core.kexpressions.keffects.KEffects.Effect");
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
    // InternalSct3.g:1088:1: entryRuleExitAction returns [EObject current=null] : iv_ruleExitAction= ruleExitAction EOF ;
    public final EObject entryRuleExitAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitAction = null;


        try {
            // InternalSct3.g:1089:2: (iv_ruleExitAction= ruleExitAction EOF )
            // InternalSct3.g:1090:2: iv_ruleExitAction= ruleExitAction EOF
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
    // InternalSct3.g:1097:1: ruleExitAction returns [EObject current=null] : ( () otherlv_1= 'exit' (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )? (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? ) ;
    public final EObject ruleExitAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_trigger_3_0 = null;

        EObject lv_effects_5_0 = null;

        EObject lv_effects_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:1100:28: ( ( () otherlv_1= 'exit' (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )? (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? ) )
            // InternalSct3.g:1101:1: ( () otherlv_1= 'exit' (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )? (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? )
            {
            // InternalSct3.g:1101:1: ( () otherlv_1= 'exit' (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )? (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? )
            // InternalSct3.g:1101:2: () otherlv_1= 'exit' (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )? (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )?
            {
            // InternalSct3.g:1101:2: ()
            // InternalSct3.g:1102:2: 
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

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitActionAccess().getExitKeyword_1());
                  
            }
            // InternalSct3.g:1114:1: (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==25) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSct3.g:1114:3: otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) )
                    {
                    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExitActionAccess().getIfKeyword_2_0());
                          
                    }
                    // InternalSct3.g:1118:1: ( (lv_trigger_3_0= ruleBoolExpression ) )
                    // InternalSct3.g:1119:1: (lv_trigger_3_0= ruleBoolExpression )
                    {
                    // InternalSct3.g:1119:1: (lv_trigger_3_0= ruleBoolExpression )
                    // InternalSct3.g:1120:3: lv_trigger_3_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExitActionAccess().getTriggerBoolExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
                    lv_trigger_3_0=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExitActionRule());
                      	        }
                             		set(
                             			current, 
                             			"trigger",
                              		lv_trigger_3_0, 
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.BoolExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSct3.g:1136:4: (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==26) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSct3.g:1136:6: otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    {
                    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getExitActionAccess().getThenKeyword_3_0());
                          
                    }
                    // InternalSct3.g:1140:1: ( (lv_effects_5_0= ruleEffect ) )
                    // InternalSct3.g:1141:1: (lv_effects_5_0= ruleEffect )
                    {
                    // InternalSct3.g:1141:1: (lv_effects_5_0= ruleEffect )
                    // InternalSct3.g:1142:3: lv_effects_5_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExitActionAccess().getEffectsEffectParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_effects_5_0=ruleEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExitActionRule());
                      	        }
                             		add(
                             			current, 
                             			"effects",
                              		lv_effects_5_0, 
                              		"de.cau.cs.kieler.core.kexpressions.keffects.KEffects.Effect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSct3.g:1158:2: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==27) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalSct3.g:1158:4: otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) )
                    	    {
                    	    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getExitActionAccess().getSemicolonKeyword_3_2_0());
                    	          
                    	    }
                    	    // InternalSct3.g:1162:1: ( (lv_effects_7_0= ruleEffect ) )
                    	    // InternalSct3.g:1163:1: (lv_effects_7_0= ruleEffect )
                    	    {
                    	    // InternalSct3.g:1163:1: (lv_effects_7_0= ruleEffect )
                    	    // InternalSct3.g:1164:3: lv_effects_7_0= ruleEffect
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExitActionAccess().getEffectsEffectParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_27);
                    	    lv_effects_7_0=ruleEffect();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getExitActionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"effects",
                    	              		lv_effects_7_0, 
                    	              		"de.cau.cs.kieler.core.kexpressions.keffects.KEffects.Effect");
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
    // InternalSct3.g:1188:1: entryRuleSuspendAction returns [EObject current=null] : iv_ruleSuspendAction= ruleSuspendAction EOF ;
    public final EObject entryRuleSuspendAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspendAction = null;


        try {
            // InternalSct3.g:1189:2: (iv_ruleSuspendAction= ruleSuspendAction EOF )
            // InternalSct3.g:1190:2: iv_ruleSuspendAction= ruleSuspendAction EOF
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
    // InternalSct3.g:1197:1: ruleSuspendAction returns [EObject current=null] : ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' (otherlv_4= 'if' ( (lv_trigger_5_0= ruleBoolExpression ) ) )? ) ;
    public final EObject ruleSuspendAction() throws RecognitionException {
        EObject current = null;

        Token lv_immediate_1_0=null;
        Token lv_weak_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_trigger_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:1200:28: ( ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' (otherlv_4= 'if' ( (lv_trigger_5_0= ruleBoolExpression ) ) )? ) )
            // InternalSct3.g:1201:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' (otherlv_4= 'if' ( (lv_trigger_5_0= ruleBoolExpression ) ) )? )
            {
            // InternalSct3.g:1201:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' (otherlv_4= 'if' ( (lv_trigger_5_0= ruleBoolExpression ) ) )? )
            // InternalSct3.g:1201:2: () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' (otherlv_4= 'if' ( (lv_trigger_5_0= ruleBoolExpression ) ) )?
            {
            // InternalSct3.g:1201:2: ()
            // InternalSct3.g:1202:2: 
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

            // InternalSct3.g:1210:2: ( (lv_immediate_1_0= 'immediate' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==23) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSct3.g:1211:1: (lv_immediate_1_0= 'immediate' )
                    {
                    // InternalSct3.g:1211:1: (lv_immediate_1_0= 'immediate' )
                    // InternalSct3.g:1212:3: lv_immediate_1_0= 'immediate'
                    {
                    lv_immediate_1_0=(Token)match(input,23,FollowSets000.FOLLOW_30); if (state.failed) return current;
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

            // InternalSct3.g:1225:3: ( (lv_weak_2_0= 'weak' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==31) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSct3.g:1226:1: (lv_weak_2_0= 'weak' )
                    {
                    // InternalSct3.g:1226:1: (lv_weak_2_0= 'weak' )
                    // InternalSct3.g:1227:3: lv_weak_2_0= 'weak'
                    {
                    lv_weak_2_0=(Token)match(input,31,FollowSets000.FOLLOW_31); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSuspendActionAccess().getSuspendKeyword_3());
                  
            }
            // InternalSct3.g:1244:1: (otherlv_4= 'if' ( (lv_trigger_5_0= ruleBoolExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==25) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSct3.g:1244:3: otherlv_4= 'if' ( (lv_trigger_5_0= ruleBoolExpression ) )
                    {
                    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSuspendActionAccess().getIfKeyword_4_0());
                          
                    }
                    // InternalSct3.g:1248:1: ( (lv_trigger_5_0= ruleBoolExpression ) )
                    // InternalSct3.g:1249:1: (lv_trigger_5_0= ruleBoolExpression )
                    {
                    // InternalSct3.g:1249:1: (lv_trigger_5_0= ruleBoolExpression )
                    // InternalSct3.g:1250:3: lv_trigger_5_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSuspendActionAccess().getTriggerBoolExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_trigger_5_0=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSuspendActionRule());
                      	        }
                             		set(
                             			current, 
                             			"trigger",
                              		lv_trigger_5_0, 
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.BoolExpression");
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
    // $ANTLR end "ruleSuspendAction"


    // $ANTLR start "entryRuleIterateAction"
    // InternalSct3.g:1274:1: entryRuleIterateAction returns [EObject current=null] : iv_ruleIterateAction= ruleIterateAction EOF ;
    public final EObject entryRuleIterateAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterateAction = null;


        try {
            // InternalSct3.g:1275:2: (iv_ruleIterateAction= ruleIterateAction EOF )
            // InternalSct3.g:1276:2: iv_ruleIterateAction= ruleIterateAction EOF
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
    // InternalSct3.g:1283:1: ruleIterateAction returns [EObject current=null] : ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'iterate' (otherlv_3= 'if' ( (lv_trigger_4_0= ruleBoolExpression ) ) )? (otherlv_5= 'then' ( (lv_effects_6_0= ruleEffect ) ) (otherlv_7= ';' ( (lv_effects_8_0= ruleEffect ) ) )* )? ) ;
    public final EObject ruleIterateAction() throws RecognitionException {
        EObject current = null;

        Token lv_immediate_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_trigger_4_0 = null;

        EObject lv_effects_6_0 = null;

        EObject lv_effects_8_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:1286:28: ( ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'iterate' (otherlv_3= 'if' ( (lv_trigger_4_0= ruleBoolExpression ) ) )? (otherlv_5= 'then' ( (lv_effects_6_0= ruleEffect ) ) (otherlv_7= ';' ( (lv_effects_8_0= ruleEffect ) ) )* )? ) )
            // InternalSct3.g:1287:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'iterate' (otherlv_3= 'if' ( (lv_trigger_4_0= ruleBoolExpression ) ) )? (otherlv_5= 'then' ( (lv_effects_6_0= ruleEffect ) ) (otherlv_7= ';' ( (lv_effects_8_0= ruleEffect ) ) )* )? )
            {
            // InternalSct3.g:1287:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'iterate' (otherlv_3= 'if' ( (lv_trigger_4_0= ruleBoolExpression ) ) )? (otherlv_5= 'then' ( (lv_effects_6_0= ruleEffect ) ) (otherlv_7= ';' ( (lv_effects_8_0= ruleEffect ) ) )* )? )
            // InternalSct3.g:1287:2: () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'iterate' (otherlv_3= 'if' ( (lv_trigger_4_0= ruleBoolExpression ) ) )? (otherlv_5= 'then' ( (lv_effects_6_0= ruleEffect ) ) (otherlv_7= ';' ( (lv_effects_8_0= ruleEffect ) ) )* )?
            {
            // InternalSct3.g:1287:2: ()
            // InternalSct3.g:1288:2: 
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

            // InternalSct3.g:1296:2: ( (lv_immediate_1_0= 'immediate' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==23) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSct3.g:1297:1: (lv_immediate_1_0= 'immediate' )
                    {
                    // InternalSct3.g:1297:1: (lv_immediate_1_0= 'immediate' )
                    // InternalSct3.g:1298:3: lv_immediate_1_0= 'immediate'
                    {
                    lv_immediate_1_0=(Token)match(input,23,FollowSets000.FOLLOW_33); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIterateActionAccess().getIterateKeyword_2());
                  
            }
            // InternalSct3.g:1315:1: (otherlv_3= 'if' ( (lv_trigger_4_0= ruleBoolExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==25) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSct3.g:1315:3: otherlv_3= 'if' ( (lv_trigger_4_0= ruleBoolExpression ) )
                    {
                    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getIterateActionAccess().getIfKeyword_3_0());
                          
                    }
                    // InternalSct3.g:1319:1: ( (lv_trigger_4_0= ruleBoolExpression ) )
                    // InternalSct3.g:1320:1: (lv_trigger_4_0= ruleBoolExpression )
                    {
                    // InternalSct3.g:1320:1: (lv_trigger_4_0= ruleBoolExpression )
                    // InternalSct3.g:1321:3: lv_trigger_4_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIterateActionAccess().getTriggerBoolExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
                    lv_trigger_4_0=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIterateActionRule());
                      	        }
                             		set(
                             			current, 
                             			"trigger",
                              		lv_trigger_4_0, 
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.BoolExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSct3.g:1337:4: (otherlv_5= 'then' ( (lv_effects_6_0= ruleEffect ) ) (otherlv_7= ';' ( (lv_effects_8_0= ruleEffect ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==26) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSct3.g:1337:6: otherlv_5= 'then' ( (lv_effects_6_0= ruleEffect ) ) (otherlv_7= ';' ( (lv_effects_8_0= ruleEffect ) ) )*
                    {
                    otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIterateActionAccess().getThenKeyword_4_0());
                          
                    }
                    // InternalSct3.g:1341:1: ( (lv_effects_6_0= ruleEffect ) )
                    // InternalSct3.g:1342:1: (lv_effects_6_0= ruleEffect )
                    {
                    // InternalSct3.g:1342:1: (lv_effects_6_0= ruleEffect )
                    // InternalSct3.g:1343:3: lv_effects_6_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIterateActionAccess().getEffectsEffectParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_effects_6_0=ruleEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIterateActionRule());
                      	        }
                             		add(
                             			current, 
                             			"effects",
                              		lv_effects_6_0, 
                              		"de.cau.cs.kieler.core.kexpressions.keffects.KEffects.Effect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSct3.g:1359:2: (otherlv_7= ';' ( (lv_effects_8_0= ruleEffect ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==27) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalSct3.g:1359:4: otherlv_7= ';' ( (lv_effects_8_0= ruleEffect ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getIterateActionAccess().getSemicolonKeyword_4_2_0());
                    	          
                    	    }
                    	    // InternalSct3.g:1363:1: ( (lv_effects_8_0= ruleEffect ) )
                    	    // InternalSct3.g:1364:1: (lv_effects_8_0= ruleEffect )
                    	    {
                    	    // InternalSct3.g:1364:1: (lv_effects_8_0= ruleEffect )
                    	    // InternalSct3.g:1365:3: lv_effects_8_0= ruleEffect
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIterateActionAccess().getEffectsEffectParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_27);
                    	    lv_effects_8_0=ruleEffect();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getIterateActionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"effects",
                    	              		lv_effects_8_0, 
                    	              		"de.cau.cs.kieler.core.kexpressions.keffects.KEffects.Effect");
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


    // $ANTLR start "entryRuleInitAction"
    // InternalSct3.g:1389:1: entryRuleInitAction returns [EObject current=null] : iv_ruleInitAction= ruleInitAction EOF ;
    public final EObject entryRuleInitAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitAction = null;


        try {
            // InternalSct3.g:1390:2: (iv_ruleInitAction= ruleInitAction EOF )
            // InternalSct3.g:1391:2: iv_ruleInitAction= ruleInitAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInitAction=ruleInitAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitAction; 
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
    // $ANTLR end "entryRuleInitAction"


    // $ANTLR start "ruleInitAction"
    // InternalSct3.g:1398:1: ruleInitAction returns [EObject current=null] : ( () otherlv_1= 'init' (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )? (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? ) ;
    public final EObject ruleInitAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_trigger_3_0 = null;

        EObject lv_effects_5_0 = null;

        EObject lv_effects_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:1401:28: ( ( () otherlv_1= 'init' (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )? (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? ) )
            // InternalSct3.g:1402:1: ( () otherlv_1= 'init' (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )? (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? )
            {
            // InternalSct3.g:1402:1: ( () otherlv_1= 'init' (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )? (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? )
            // InternalSct3.g:1402:2: () otherlv_1= 'init' (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )? (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )?
            {
            // InternalSct3.g:1402:2: ()
            // InternalSct3.g:1403:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInitActionAccess().getInitActionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInitActionAccess().getInitKeyword_1());
                  
            }
            // InternalSct3.g:1415:1: (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==25) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSct3.g:1415:3: otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) )
                    {
                    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getInitActionAccess().getIfKeyword_2_0());
                          
                    }
                    // InternalSct3.g:1419:1: ( (lv_trigger_3_0= ruleBoolExpression ) )
                    // InternalSct3.g:1420:1: (lv_trigger_3_0= ruleBoolExpression )
                    {
                    // InternalSct3.g:1420:1: (lv_trigger_3_0= ruleBoolExpression )
                    // InternalSct3.g:1421:3: lv_trigger_3_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInitActionAccess().getTriggerBoolExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
                    lv_trigger_3_0=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInitActionRule());
                      	        }
                             		set(
                             			current, 
                             			"trigger",
                              		lv_trigger_3_0, 
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.BoolExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSct3.g:1437:4: (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==26) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSct3.g:1437:6: otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    {
                    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getInitActionAccess().getThenKeyword_3_0());
                          
                    }
                    // InternalSct3.g:1441:1: ( (lv_effects_5_0= ruleEffect ) )
                    // InternalSct3.g:1442:1: (lv_effects_5_0= ruleEffect )
                    {
                    // InternalSct3.g:1442:1: (lv_effects_5_0= ruleEffect )
                    // InternalSct3.g:1443:3: lv_effects_5_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInitActionAccess().getEffectsEffectParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_effects_5_0=ruleEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInitActionRule());
                      	        }
                             		add(
                             			current, 
                             			"effects",
                              		lv_effects_5_0, 
                              		"de.cau.cs.kieler.core.kexpressions.keffects.KEffects.Effect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSct3.g:1459:2: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==27) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalSct3.g:1459:4: otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) )
                    	    {
                    	    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getInitActionAccess().getSemicolonKeyword_3_2_0());
                    	          
                    	    }
                    	    // InternalSct3.g:1463:1: ( (lv_effects_7_0= ruleEffect ) )
                    	    // InternalSct3.g:1464:1: (lv_effects_7_0= ruleEffect )
                    	    {
                    	    // InternalSct3.g:1464:1: (lv_effects_7_0= ruleEffect )
                    	    // InternalSct3.g:1465:3: lv_effects_7_0= ruleEffect
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInitActionAccess().getEffectsEffectParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_27);
                    	    lv_effects_7_0=ruleEffect();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInitActionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"effects",
                    	              		lv_effects_7_0, 
                    	              		"de.cau.cs.kieler.core.kexpressions.keffects.KEffects.Effect");
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


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitAction"


    // $ANTLR start "entryRuleFinalAction"
    // InternalSct3.g:1489:1: entryRuleFinalAction returns [EObject current=null] : iv_ruleFinalAction= ruleFinalAction EOF ;
    public final EObject entryRuleFinalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalAction = null;


        try {
            // InternalSct3.g:1490:2: (iv_ruleFinalAction= ruleFinalAction EOF )
            // InternalSct3.g:1491:2: iv_ruleFinalAction= ruleFinalAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFinalActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFinalAction=ruleFinalAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFinalAction; 
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
    // $ANTLR end "entryRuleFinalAction"


    // $ANTLR start "ruleFinalAction"
    // InternalSct3.g:1498:1: ruleFinalAction returns [EObject current=null] : ( () otherlv_1= 'final' (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )? (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? ) ;
    public final EObject ruleFinalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_trigger_3_0 = null;

        EObject lv_effects_5_0 = null;

        EObject lv_effects_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:1501:28: ( ( () otherlv_1= 'final' (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )? (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? ) )
            // InternalSct3.g:1502:1: ( () otherlv_1= 'final' (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )? (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? )
            {
            // InternalSct3.g:1502:1: ( () otherlv_1= 'final' (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )? (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? )
            // InternalSct3.g:1502:2: () otherlv_1= 'final' (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )? (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )?
            {
            // InternalSct3.g:1502:2: ()
            // InternalSct3.g:1503:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFinalActionAccess().getFinalActionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFinalActionAccess().getFinalKeyword_1());
                  
            }
            // InternalSct3.g:1515:1: (otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==25) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSct3.g:1515:3: otherlv_2= 'if' ( (lv_trigger_3_0= ruleBoolExpression ) )
                    {
                    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFinalActionAccess().getIfKeyword_2_0());
                          
                    }
                    // InternalSct3.g:1519:1: ( (lv_trigger_3_0= ruleBoolExpression ) )
                    // InternalSct3.g:1520:1: (lv_trigger_3_0= ruleBoolExpression )
                    {
                    // InternalSct3.g:1520:1: (lv_trigger_3_0= ruleBoolExpression )
                    // InternalSct3.g:1521:3: lv_trigger_3_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFinalActionAccess().getTriggerBoolExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
                    lv_trigger_3_0=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFinalActionRule());
                      	        }
                             		set(
                             			current, 
                             			"trigger",
                              		lv_trigger_3_0, 
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.BoolExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSct3.g:1537:4: (otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==26) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSct3.g:1537:6: otherlv_4= 'then' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    {
                    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getFinalActionAccess().getThenKeyword_3_0());
                          
                    }
                    // InternalSct3.g:1541:1: ( (lv_effects_5_0= ruleEffect ) )
                    // InternalSct3.g:1542:1: (lv_effects_5_0= ruleEffect )
                    {
                    // InternalSct3.g:1542:1: (lv_effects_5_0= ruleEffect )
                    // InternalSct3.g:1543:3: lv_effects_5_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFinalActionAccess().getEffectsEffectParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_effects_5_0=ruleEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFinalActionRule());
                      	        }
                             		add(
                             			current, 
                             			"effects",
                              		lv_effects_5_0, 
                              		"de.cau.cs.kieler.core.kexpressions.keffects.KEffects.Effect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSct3.g:1559:2: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==27) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalSct3.g:1559:4: otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) )
                    	    {
                    	    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getFinalActionAccess().getSemicolonKeyword_3_2_0());
                    	          
                    	    }
                    	    // InternalSct3.g:1563:1: ( (lv_effects_7_0= ruleEffect ) )
                    	    // InternalSct3.g:1564:1: (lv_effects_7_0= ruleEffect )
                    	    {
                    	    // InternalSct3.g:1564:1: (lv_effects_7_0= ruleEffect )
                    	    // InternalSct3.g:1565:3: lv_effects_7_0= ruleEffect
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFinalActionAccess().getEffectsEffectParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_27);
                    	    lv_effects_7_0=ruleEffect();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFinalActionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"effects",
                    	              		lv_effects_7_0, 
                    	              		"de.cau.cs.kieler.core.kexpressions.keffects.KEffects.Effect");
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
    // $ANTLR end "ruleFinalAction"


    // $ANTLR start "entryRuleRegion"
    // InternalSct3.g:1589:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // InternalSct3.g:1590:2: (iv_ruleRegion= ruleRegion EOF )
            // InternalSct3.g:1591:2: iv_ruleRegion= ruleRegion EOF
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
    // InternalSct3.g:1598:1: ruleRegion returns [EObject current=null] : (this_ControlflowRegion_0= ruleControlflowRegion | this_DataflowRegion_1= ruleDataflowRegion ) ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        EObject this_ControlflowRegion_0 = null;

        EObject this_DataflowRegion_1 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:1601:28: ( (this_ControlflowRegion_0= ruleControlflowRegion | this_DataflowRegion_1= ruleDataflowRegion ) )
            // InternalSct3.g:1602:1: (this_ControlflowRegion_0= ruleControlflowRegion | this_DataflowRegion_1= ruleDataflowRegion )
            {
            // InternalSct3.g:1602:1: (this_ControlflowRegion_0= ruleControlflowRegion | this_DataflowRegion_1= ruleDataflowRegion )
            int alt52=2;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // InternalSct3.g:1603:2: this_ControlflowRegion_0= ruleControlflowRegion
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
                    // InternalSct3.g:1616:2: this_DataflowRegion_1= ruleDataflowRegion
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


    // $ANTLR start "entryRuleSingleControlflowRegion"
    // InternalSct3.g:1635:1: entryRuleSingleControlflowRegion returns [EObject current=null] : iv_ruleSingleControlflowRegion= ruleSingleControlflowRegion EOF ;
    public final EObject entryRuleSingleControlflowRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleControlflowRegion = null;


        try {
            // InternalSct3.g:1636:2: (iv_ruleSingleControlflowRegion= ruleSingleControlflowRegion EOF )
            // InternalSct3.g:1637:2: iv_ruleSingleControlflowRegion= ruleSingleControlflowRegion EOF
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
    // InternalSct3.g:1644:1: ruleSingleControlflowRegion returns [EObject current=null] : ( () ( (lv_states_1_0= ruleState ) )+ ) ;
    public final EObject ruleSingleControlflowRegion() throws RecognitionException {
        EObject current = null;

        EObject lv_states_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:1647:28: ( ( () ( (lv_states_1_0= ruleState ) )+ ) )
            // InternalSct3.g:1648:1: ( () ( (lv_states_1_0= ruleState ) )+ )
            {
            // InternalSct3.g:1648:1: ( () ( (lv_states_1_0= ruleState ) )+ )
            // InternalSct3.g:1648:2: () ( (lv_states_1_0= ruleState ) )+
            {
            // InternalSct3.g:1648:2: ()
            // InternalSct3.g:1649:2: 
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

            // InternalSct3.g:1657:2: ( (lv_states_1_0= ruleState ) )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_COMMENT_ANNOTATION||(LA53_0>=19 && LA53_0<=22)||LA53_0==58) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalSct3.g:1658:1: (lv_states_1_0= ruleState )
            	    {
            	    // InternalSct3.g:1658:1: (lv_states_1_0= ruleState )
            	    // InternalSct3.g:1659:3: lv_states_1_0= ruleState
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSingleControlflowRegionAccess().getStatesStateParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_34);
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
            	              		"de.cau.cs.kieler.sccharts.text3.Sct3.State");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
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
    // InternalSct3.g:1683:1: entryRuleSingleDataflowRegion returns [EObject current=null] : iv_ruleSingleDataflowRegion= ruleSingleDataflowRegion EOF ;
    public final EObject entryRuleSingleDataflowRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleDataflowRegion = null;


        try {
            // InternalSct3.g:1684:2: (iv_ruleSingleDataflowRegion= ruleSingleDataflowRegion EOF )
            // InternalSct3.g:1685:2: iv_ruleSingleDataflowRegion= ruleSingleDataflowRegion EOF
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
    // InternalSct3.g:1692:1: ruleSingleDataflowRegion returns [EObject current=null] : ( () ( (lv_equations_1_0= ruleEquation ) )+ ) ;
    public final EObject ruleSingleDataflowRegion() throws RecognitionException {
        EObject current = null;

        EObject lv_equations_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:1695:28: ( ( () ( (lv_equations_1_0= ruleEquation ) )+ ) )
            // InternalSct3.g:1696:1: ( () ( (lv_equations_1_0= ruleEquation ) )+ )
            {
            // InternalSct3.g:1696:1: ( () ( (lv_equations_1_0= ruleEquation ) )+ )
            // InternalSct3.g:1696:2: () ( (lv_equations_1_0= ruleEquation ) )+
            {
            // InternalSct3.g:1696:2: ()
            // InternalSct3.g:1697:2: 
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

            // InternalSct3.g:1705:2: ( (lv_equations_1_0= ruleEquation ) )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_ID) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalSct3.g:1706:1: (lv_equations_1_0= ruleEquation )
            	    {
            	    // InternalSct3.g:1706:1: (lv_equations_1_0= ruleEquation )
            	    // InternalSct3.g:1707:3: lv_equations_1_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSingleDataflowRegionAccess().getEquationsEquationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_35);
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
            	              		"de.cau.cs.kieler.sccharts.text3.Sct3.Equation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
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
    // InternalSct3.g:1731:1: entryRuleControlflowRegion returns [EObject current=null] : iv_ruleControlflowRegion= ruleControlflowRegion EOF ;
    public final EObject entryRuleControlflowRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlflowRegion = null;


        try {
            // InternalSct3.g:1732:2: (iv_ruleControlflowRegion= ruleControlflowRegion EOF )
            // InternalSct3.g:1733:2: iv_ruleControlflowRegion= ruleControlflowRegion EOF
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
    // InternalSct3.g:1740:1: ruleControlflowRegion returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclarationWOSemicolon ) )* ( (lv_states_7_0= ruleState ) )+ ) ;
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
            // InternalSct3.g:1743:28: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclarationWOSemicolon ) )* ( (lv_states_7_0= ruleState ) )+ ) )
            // InternalSct3.g:1744:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclarationWOSemicolon ) )* ( (lv_states_7_0= ruleState ) )+ )
            {
            // InternalSct3.g:1744:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclarationWOSemicolon ) )* ( (lv_states_7_0= ruleState ) )+ )
            // InternalSct3.g:1744:2: () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclarationWOSemicolon ) )* ( (lv_states_7_0= ruleState ) )+
            {
            // InternalSct3.g:1744:2: ()
            // InternalSct3.g:1745:2: 
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

            // InternalSct3.g:1753:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_COMMENT_ANNOTATION||LA55_0==58) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalSct3.g:1754:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // InternalSct3.g:1754:1: (lv_annotations_1_0= ruleAnnotation )
            	    // InternalSct3.g:1755:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getControlflowRegionAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_36);
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
            	    break loop55;
                }
            } while (true);

            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getControlflowRegionAccess().getRegionKeyword_2());
                  
            }
            // InternalSct3.g:1775:1: ( (lv_id_3_0= RULE_ID ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalSct3.g:1776:1: (lv_id_3_0= RULE_ID )
                    {
                    // InternalSct3.g:1776:1: (lv_id_3_0= RULE_ID )
                    // InternalSct3.g:1777:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_38); if (state.failed) return current;
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

            // InternalSct3.g:1793:3: ( (lv_label_4_0= RULE_STRING ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_STRING) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalSct3.g:1794:1: (lv_label_4_0= RULE_STRING )
                    {
                    // InternalSct3.g:1794:1: (lv_label_4_0= RULE_STRING )
                    // InternalSct3.g:1795:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_39); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getControlflowRegionAccess().getColonKeyword_5());
                  
            }
            // InternalSct3.g:1815:1: ( (lv_declarations_6_0= ruleDeclarationWOSemicolon ) )*
            loop58:
            do {
                int alt58=2;
                alt58 = dfa58.predict(input);
                switch (alt58) {
            	case 1 :
            	    // InternalSct3.g:1816:1: (lv_declarations_6_0= ruleDeclarationWOSemicolon )
            	    {
            	    // InternalSct3.g:1816:1: (lv_declarations_6_0= ruleDeclarationWOSemicolon )
            	    // InternalSct3.g:1817:3: lv_declarations_6_0= ruleDeclarationWOSemicolon
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getControlflowRegionAccess().getDeclarationsDeclarationWOSemicolonParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_40);
            	    lv_declarations_6_0=ruleDeclarationWOSemicolon();

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
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.DeclarationWOSemicolon");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            // InternalSct3.g:1833:3: ( (lv_states_7_0= ruleState ) )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                alt59 = dfa59.predict(input);
                switch (alt59) {
            	case 1 :
            	    // InternalSct3.g:1834:1: (lv_states_7_0= ruleState )
            	    {
            	    // InternalSct3.g:1834:1: (lv_states_7_0= ruleState )
            	    // InternalSct3.g:1835:3: lv_states_7_0= ruleState
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getControlflowRegionAccess().getStatesStateParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_34);
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
            	              		"de.cau.cs.kieler.sccharts.text3.Sct3.State");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
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
    // InternalSct3.g:1859:1: entryRuleDataflowRegion returns [EObject current=null] : iv_ruleDataflowRegion= ruleDataflowRegion EOF ;
    public final EObject entryRuleDataflowRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataflowRegion = null;


        try {
            // InternalSct3.g:1860:2: (iv_ruleDataflowRegion= ruleDataflowRegion EOF )
            // InternalSct3.g:1861:2: iv_ruleDataflowRegion= ruleDataflowRegion EOF
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
    // InternalSct3.g:1868:1: ruleDataflowRegion returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'dataflow' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclarationWOSemicolon ) )* ( (lv_equations_7_0= ruleEquation ) )+ ) ;
    public final EObject ruleDataflowRegion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_declarations_6_0 = null;

        EObject lv_equations_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:1871:28: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'dataflow' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclarationWOSemicolon ) )* ( (lv_equations_7_0= ruleEquation ) )+ ) )
            // InternalSct3.g:1872:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'dataflow' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclarationWOSemicolon ) )* ( (lv_equations_7_0= ruleEquation ) )+ )
            {
            // InternalSct3.g:1872:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'dataflow' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclarationWOSemicolon ) )* ( (lv_equations_7_0= ruleEquation ) )+ )
            // InternalSct3.g:1872:2: () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'dataflow' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclarationWOSemicolon ) )* ( (lv_equations_7_0= ruleEquation ) )+
            {
            // InternalSct3.g:1872:2: ()
            // InternalSct3.g:1873:2: 
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

            // InternalSct3.g:1881:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_COMMENT_ANNOTATION||LA60_0==58) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalSct3.g:1882:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // InternalSct3.g:1882:1: (lv_annotations_1_0= ruleAnnotation )
            	    // InternalSct3.g:1883:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataflowRegionAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_41);
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
            	    break loop60;
                }
            } while (true);

            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDataflowRegionAccess().getDataflowKeyword_2());
                  
            }
            // InternalSct3.g:1903:1: ( (lv_id_3_0= RULE_ID ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalSct3.g:1904:1: (lv_id_3_0= RULE_ID )
                    {
                    // InternalSct3.g:1904:1: (lv_id_3_0= RULE_ID )
                    // InternalSct3.g:1905:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_38); if (state.failed) return current;
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

            // InternalSct3.g:1921:3: ( (lv_label_4_0= RULE_STRING ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_STRING) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalSct3.g:1922:1: (lv_label_4_0= RULE_STRING )
                    {
                    // InternalSct3.g:1922:1: (lv_label_4_0= RULE_STRING )
                    // InternalSct3.g:1923:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_39); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDataflowRegionAccess().getColonKeyword_5());
                  
            }
            // InternalSct3.g:1943:1: ( (lv_declarations_6_0= ruleDeclarationWOSemicolon ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_COMMENT_ANNOTATION||(LA63_0>=43 && LA63_0<=47)||LA63_0==49||LA63_0==58||(LA63_0>=89 && LA63_0<=95)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalSct3.g:1944:1: (lv_declarations_6_0= ruleDeclarationWOSemicolon )
            	    {
            	    // InternalSct3.g:1944:1: (lv_declarations_6_0= ruleDeclarationWOSemicolon )
            	    // InternalSct3.g:1945:3: lv_declarations_6_0= ruleDeclarationWOSemicolon
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataflowRegionAccess().getDeclarationsDeclarationWOSemicolonParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_42);
            	    lv_declarations_6_0=ruleDeclarationWOSemicolon();

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
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.DeclarationWOSemicolon");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            // InternalSct3.g:1961:3: ( (lv_equations_7_0= ruleEquation ) )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_ID) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalSct3.g:1962:1: (lv_equations_7_0= ruleEquation )
            	    {
            	    // InternalSct3.g:1962:1: (lv_equations_7_0= ruleEquation )
            	    // InternalSct3.g:1963:3: lv_equations_7_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDataflowRegionAccess().getEquationsEquationParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_35);
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
            	              		"de.cau.cs.kieler.sccharts.text3.Sct3.Equation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt64 >= 1 ) break loop64;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
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
    // InternalSct3.g:1989:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // InternalSct3.g:1990:2: (iv_ruleEquation= ruleEquation EOF )
            // InternalSct3.g:1991:2: iv_ruleEquation= ruleEquation EOF
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
    // InternalSct3.g:1998:1: ruleEquation returns [EObject current=null] : ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' ) ) ;
    public final EObject ruleEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:2001:28: ( ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' ) ) )
            // InternalSct3.g:2002:1: ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' ) )
            {
            // InternalSct3.g:2002:1: ( () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' ) )
            // InternalSct3.g:2002:2: () ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' )
            {
            // InternalSct3.g:2002:2: ()
            // InternalSct3.g:2003:2: 
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

            // InternalSct3.g:2011:2: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';' )
            // InternalSct3.g:2011:3: ( (otherlv_1= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ';'
            {
            // InternalSct3.g:2011:3: ( (otherlv_1= RULE_ID ) )
            // InternalSct3.g:2012:1: (otherlv_1= RULE_ID )
            {
            // InternalSct3.g:2012:1: (otherlv_1= RULE_ID )
            // InternalSct3.g:2013:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEquationRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getEquationAccess().getValuedObjectValuedObjectCrossReference_1_0_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEquationAccess().getEqualsSignKeyword_1_1());
                  
            }
            // InternalSct3.g:2031:1: ( (lv_expression_3_0= ruleExpression ) )
            // InternalSct3.g:2032:1: (lv_expression_3_0= ruleExpression )
            {
            // InternalSct3.g:2032:1: (lv_expression_3_0= ruleExpression )
            // InternalSct3.g:2033:3: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEquationAccess().getExpressionExpressionParserRuleCall_1_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_44);
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
                      		"de.cau.cs.kieler.core.kexpressions.KExpressions.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEquationAccess().getSemicolonKeyword_1_3());
                  
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
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalSct3.g:2063:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalSct3.g:2064:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalSct3.g:2065:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
    // InternalSct3.g:2072:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) ;
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
            // InternalSct3.g:2075:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) )
            // InternalSct3.g:2076:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            {
            // InternalSct3.g:2076:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            int alt65=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt65=1;
                }
                break;
            case RULE_ID:
            case 80:
            case 86:
                {
                alt65=2;
                }
                break;
            case 39:
                {
                alt65=3;
                }
                break;
            case 53:
                {
                alt65=4;
                }
                break;
            case RULE_HOSTCODE:
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
                    // InternalSct3.g:2077:2: this_BoolValue_0= ruleBoolValue
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
                    // InternalSct3.g:2090:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
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
                    // InternalSct3.g:2102:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // InternalSct3.g:2102:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // InternalSct3.g:2102:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_45);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSct3.g:2124:2: this_FunctionCall_5= ruleFunctionCall
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
                    // InternalSct3.g:2137:2: this_TextExpression_6= ruleTextExpression
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


    // $ANTLR start "entryRuleRootScope"
    // InternalSct3.g:2158:1: entryRuleRootScope returns [EObject current=null] : iv_ruleRootScope= ruleRootScope EOF ;
    public final EObject entryRuleRootScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootScope = null;


        try {
            // InternalSct3.g:2159:2: (iv_ruleRootScope= ruleRootScope EOF )
            // InternalSct3.g:2160:2: iv_ruleRootScope= ruleRootScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRootScopeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRootScope=ruleRootScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRootScope; 
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
    // $ANTLR end "entryRuleRootScope"


    // $ANTLR start "ruleRootScope"
    // InternalSct3.g:2167:1: ruleRootScope returns [EObject current=null] : ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* ) ;
    public final EObject ruleRootScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_declarations_1_0 = null;

        EObject lv_entities_2_0 = null;

        EObject lv_scopes_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:2170:28: ( ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* ) )
            // InternalSct3.g:2171:1: ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* )
            {
            // InternalSct3.g:2171:1: ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )* )
            // InternalSct3.g:2171:2: () ( (lv_declarations_1_0= ruleDeclaration ) )* ( (lv_entities_2_0= ruleTestEntity ) )* (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )*
            {
            // InternalSct3.g:2171:2: ()
            // InternalSct3.g:2172:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRootScopeAccess().getKEXTScopeAction_0(),
                          current);
                  
            }

            }

            // InternalSct3.g:2180:2: ( (lv_declarations_1_0= ruleDeclaration ) )*
            loop66:
            do {
                int alt66=2;
                alt66 = dfa66.predict(input);
                switch (alt66) {
            	case 1 :
            	    // InternalSct3.g:2181:1: (lv_declarations_1_0= ruleDeclaration )
            	    {
            	    // InternalSct3.g:2181:1: (lv_declarations_1_0= ruleDeclaration )
            	    // InternalSct3.g:2182:3: lv_declarations_1_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRootScopeAccess().getDeclarationsDeclarationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_46);
            	    lv_declarations_1_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRootScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_1_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            // InternalSct3.g:2198:3: ( (lv_entities_2_0= ruleTestEntity ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==RULE_ID||LA67_0==RULE_HOSTCODE||LA67_0==RULE_COMMENT_ANNOTATION||LA67_0==42||LA67_0==53||LA67_0==58) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalSct3.g:2199:1: (lv_entities_2_0= ruleTestEntity )
            	    {
            	    // InternalSct3.g:2199:1: (lv_entities_2_0= ruleTestEntity )
            	    // InternalSct3.g:2200:3: lv_entities_2_0= ruleTestEntity
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRootScopeAccess().getEntitiesTestEntityParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_47);
            	    lv_entities_2_0=ruleTestEntity();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRootScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"entities",
            	              		lv_entities_2_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.TestEntity");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            // InternalSct3.g:2216:3: (otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==41) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalSct3.g:2216:5: otherlv_3= 'scope' ( (lv_scopes_4_0= ruleScope ) )
            	    {
            	    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getRootScopeAccess().getScopeKeyword_3_0());
            	          
            	    }
            	    // InternalSct3.g:2220:1: ( (lv_scopes_4_0= ruleScope ) )
            	    // InternalSct3.g:2221:1: (lv_scopes_4_0= ruleScope )
            	    {
            	    // InternalSct3.g:2221:1: (lv_scopes_4_0= ruleScope )
            	    // InternalSct3.g:2222:3: lv_scopes_4_0= ruleScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRootScopeAccess().getScopesScopeParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_49);
            	    lv_scopes_4_0=ruleScope();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRootScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"scopes",
            	              		lv_scopes_4_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.Scope");
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRootScope"


    // $ANTLR start "entryRuleScope"
    // InternalSct3.g:2246:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalSct3.g:2247:2: (iv_ruleScope= ruleScope EOF )
            // InternalSct3.g:2248:2: iv_ruleScope= ruleScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScopeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScope=ruleScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScope; 
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
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalSct3.g:2255:1: ruleScope returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_declarations_3_0 = null;

        EObject lv_entities_4_0 = null;

        EObject lv_scopes_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:2258:28: ( ( () ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' ) )
            // InternalSct3.g:2259:1: ( () ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' )
            {
            // InternalSct3.g:2259:1: ( () ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}' )
            // InternalSct3.g:2259:2: () ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) )* ( (lv_entities_4_0= ruleTestEntity ) )* (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )* otherlv_7= '}'
            {
            // InternalSct3.g:2259:2: ()
            // InternalSct3.g:2260:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getScopeAccess().getKEXTScopeAction_0(),
                          current);
                  
            }

            }

            // InternalSct3.g:2268:2: ( (lv_id_1_0= RULE_ID ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalSct3.g:2269:1: (lv_id_1_0= RULE_ID )
                    {
                    // InternalSct3.g:2269:1: (lv_id_1_0= RULE_ID )
                    // InternalSct3.g:2270:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_1_0, grammarAccess.getScopeAccess().getIdIDTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScopeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"id",
                              		lv_id_1_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getScopeAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalSct3.g:2290:1: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop70:
            do {
                int alt70=2;
                alt70 = dfa70.predict(input);
                switch (alt70) {
            	case 1 :
            	    // InternalSct3.g:2291:1: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // InternalSct3.g:2291:1: (lv_declarations_3_0= ruleDeclaration )
            	    // InternalSct3.g:2292:3: lv_declarations_3_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScopeAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_50);
            	    lv_declarations_3_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_3_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            // InternalSct3.g:2308:3: ( (lv_entities_4_0= ruleTestEntity ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==RULE_ID||LA71_0==RULE_HOSTCODE||LA71_0==RULE_COMMENT_ANNOTATION||LA71_0==42||LA71_0==53||LA71_0==58) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalSct3.g:2309:1: (lv_entities_4_0= ruleTestEntity )
            	    {
            	    // InternalSct3.g:2309:1: (lv_entities_4_0= ruleTestEntity )
            	    // InternalSct3.g:2310:3: lv_entities_4_0= ruleTestEntity
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScopeAccess().getEntitiesTestEntityParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_51);
            	    lv_entities_4_0=ruleTestEntity();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"entities",
            	              		lv_entities_4_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.TestEntity");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            // InternalSct3.g:2326:3: (otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==41) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalSct3.g:2326:5: otherlv_5= 'scope' ( (lv_scopes_6_0= ruleScope ) )
            	    {
            	    otherlv_5=(Token)match(input,41,FollowSets000.FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getScopeAccess().getScopeKeyword_5_0());
            	          
            	    }
            	    // InternalSct3.g:2330:1: ( (lv_scopes_6_0= ruleScope ) )
            	    // InternalSct3.g:2331:1: (lv_scopes_6_0= ruleScope )
            	    {
            	    // InternalSct3.g:2331:1: (lv_scopes_6_0= ruleScope )
            	    // InternalSct3.g:2332:3: lv_scopes_6_0= ruleScope
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScopeAccess().getScopesScopeParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_52);
            	    lv_scopes_6_0=ruleScope();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScopeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"scopes",
            	              		lv_scopes_6_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.Scope");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getScopeAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRuleTestEntity"
    // InternalSct3.g:2360:1: entryRuleTestEntity returns [EObject current=null] : iv_ruleTestEntity= ruleTestEntity EOF ;
    public final EObject entryRuleTestEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestEntity = null;


        try {
            // InternalSct3.g:2361:2: (iv_ruleTestEntity= ruleTestEntity EOF )
            // InternalSct3.g:2362:2: iv_ruleTestEntity= ruleTestEntity EOF
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
    // InternalSct3.g:2369:1: ruleTestEntity returns [EObject current=null] : ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) ) ;
    public final EObject ruleTestEntity() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;

        EObject lv_effect_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:2372:28: ( ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) ) )
            // InternalSct3.g:2373:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )
            {
            // InternalSct3.g:2373:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // InternalSct3.g:2373:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
                    {
                    // InternalSct3.g:2373:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
                    // InternalSct3.g:2374:1: (lv_expression_0_0= ruleAnnotatedExpression )
                    {
                    // InternalSct3.g:2374:1: (lv_expression_0_0= ruleAnnotatedExpression )
                    // InternalSct3.g:2375:3: lv_expression_0_0= ruleAnnotatedExpression
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
                              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.AnnotatedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSct3.g:2392:6: ( (lv_effect_1_0= ruleEffect ) )
                    {
                    // InternalSct3.g:2392:6: ( (lv_effect_1_0= ruleEffect ) )
                    // InternalSct3.g:2393:1: (lv_effect_1_0= ruleEffect )
                    {
                    // InternalSct3.g:2393:1: (lv_effect_1_0= ruleEffect )
                    // InternalSct3.g:2394:3: lv_effect_1_0= ruleEffect
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
                              		"de.cau.cs.kieler.core.kexpressions.keffects.KEffects.Effect");
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
    // InternalSct3.g:2418:1: entryRuleAnnotatedExpression returns [EObject current=null] : iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF ;
    public final EObject entryRuleAnnotatedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotatedExpression = null;


        try {
            // InternalSct3.g:2419:2: (iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF )
            // InternalSct3.g:2420:2: iv_ruleAnnotatedExpression= ruleAnnotatedExpression EOF
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
    // InternalSct3.g:2427:1: ruleAnnotatedExpression returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAnnotatedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:2430:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalSct3.g:2431:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalSct3.g:2431:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalSct3.g:2431:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'expression' ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalSct3.g:2431:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==RULE_COMMENT_ANNOTATION||LA74_0==58) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalSct3.g:2432:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct3.g:2432:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct3.g:2433:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotatedExpressionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_53);
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
            	    break loop74;
                }
            } while (true);

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAnnotatedExpressionAccess().getExpressionKeyword_1());
                  
            }
            // InternalSct3.g:2453:1: ( (lv_expression_2_0= ruleExpression ) )
            // InternalSct3.g:2454:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalSct3.g:2454:1: (lv_expression_2_0= ruleExpression )
            // InternalSct3.g:2455:3: lv_expression_2_0= ruleExpression
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
                      		"de.cau.cs.kieler.core.kexpressions.KExpressions.Expression");
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
    // InternalSct3.g:2479:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalSct3.g:2480:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalSct3.g:2481:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalSct3.g:2488:1: ruleDeclaration returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;

        EObject this_ReferenceDeclaration_1 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:2491:28: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration ) )
            // InternalSct3.g:2492:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration )
            {
            // InternalSct3.g:2492:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration )
            int alt75=2;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // InternalSct3.g:2493:2: this_VariableDeclaration_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_VariableDeclaration_0=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSct3.g:2506:2: this_ReferenceDeclaration_1= ruleReferenceDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getReferenceDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ReferenceDeclaration_1=ruleReferenceDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceDeclaration_1; 
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


    // $ANTLR start "entryRuleDeclarationWOSemicolon"
    // InternalSct3.g:2525:1: entryRuleDeclarationWOSemicolon returns [EObject current=null] : iv_ruleDeclarationWOSemicolon= ruleDeclarationWOSemicolon EOF ;
    public final EObject entryRuleDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarationWOSemicolon = null;


        try {
            // InternalSct3.g:2526:2: (iv_ruleDeclarationWOSemicolon= ruleDeclarationWOSemicolon EOF )
            // InternalSct3.g:2527:2: iv_ruleDeclarationWOSemicolon= ruleDeclarationWOSemicolon EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationWOSemicolonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDeclarationWOSemicolon=ruleDeclarationWOSemicolon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarationWOSemicolon; 
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
    // $ANTLR end "entryRuleDeclarationWOSemicolon"


    // $ANTLR start "ruleDeclarationWOSemicolon"
    // InternalSct3.g:2534:1: ruleDeclarationWOSemicolon returns [EObject current=null] : (this_VariableDeclarationWOSemicolon_0= ruleVariableDeclarationWOSemicolon | this_ReferenceDeclarationWOSemicolon_1= ruleReferenceDeclarationWOSemicolon ) ;
    public final EObject ruleDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclarationWOSemicolon_0 = null;

        EObject this_ReferenceDeclarationWOSemicolon_1 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:2537:28: ( (this_VariableDeclarationWOSemicolon_0= ruleVariableDeclarationWOSemicolon | this_ReferenceDeclarationWOSemicolon_1= ruleReferenceDeclarationWOSemicolon ) )
            // InternalSct3.g:2538:1: (this_VariableDeclarationWOSemicolon_0= ruleVariableDeclarationWOSemicolon | this_ReferenceDeclarationWOSemicolon_1= ruleReferenceDeclarationWOSemicolon )
            {
            // InternalSct3.g:2538:1: (this_VariableDeclarationWOSemicolon_0= ruleVariableDeclarationWOSemicolon | this_ReferenceDeclarationWOSemicolon_1= ruleReferenceDeclarationWOSemicolon )
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // InternalSct3.g:2539:2: this_VariableDeclarationWOSemicolon_0= ruleVariableDeclarationWOSemicolon
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationWOSemicolonAccess().getVariableDeclarationWOSemicolonParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_VariableDeclarationWOSemicolon_0=ruleVariableDeclarationWOSemicolon();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDeclarationWOSemicolon_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSct3.g:2552:2: this_ReferenceDeclarationWOSemicolon_1= ruleReferenceDeclarationWOSemicolon
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationWOSemicolonAccess().getReferenceDeclarationWOSemicolonParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ReferenceDeclarationWOSemicolon_1=ruleReferenceDeclarationWOSemicolon();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceDeclarationWOSemicolon_1; 
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
    // $ANTLR end "ruleDeclarationWOSemicolon"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalSct3.g:2571:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalSct3.g:2572:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalSct3.g:2573:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalSct3.g:2580:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_const_1_0=null;
        Token lv_input_2_0=null;
        Token lv_output_3_0=null;
        Token lv_static_4_0=null;
        Token lv_signal_5_0=null;
        Token lv_signal_7_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_6_0 = null;

        EObject lv_valuedObjects_8_0 = null;

        EObject lv_valuedObjects_10_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:2583:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' ) )
            // InternalSct3.g:2584:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' )
            {
            // InternalSct3.g:2584:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';' )
            // InternalSct3.g:2584:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* otherlv_11= ';'
            {
            // InternalSct3.g:2584:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==RULE_COMMENT_ANNOTATION||LA77_0==58) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalSct3.g:2585:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct3.g:2585:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct3.g:2586:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_54);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
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
            	    break loop77;
                }
            } while (true);

            // InternalSct3.g:2602:3: ( (lv_const_1_0= 'const' ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==43) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalSct3.g:2603:1: (lv_const_1_0= 'const' )
                    {
                    // InternalSct3.g:2603:1: (lv_const_1_0= 'const' )
                    // InternalSct3.g:2604:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,43,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_const_1_0, grammarAccess.getVariableDeclarationAccess().getConstConstKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "const", true, "const");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct3.g:2617:3: ( (lv_input_2_0= 'input' ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==44) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalSct3.g:2618:1: (lv_input_2_0= 'input' )
                    {
                    // InternalSct3.g:2618:1: (lv_input_2_0= 'input' )
                    // InternalSct3.g:2619:3: lv_input_2_0= 'input'
                    {
                    lv_input_2_0=(Token)match(input,44,FollowSets000.FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_input_2_0, grammarAccess.getVariableDeclarationAccess().getInputInputKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "input", true, "input");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct3.g:2632:3: ( (lv_output_3_0= 'output' ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==45) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalSct3.g:2633:1: (lv_output_3_0= 'output' )
                    {
                    // InternalSct3.g:2633:1: (lv_output_3_0= 'output' )
                    // InternalSct3.g:2634:3: lv_output_3_0= 'output'
                    {
                    lv_output_3_0=(Token)match(input,45,FollowSets000.FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_output_3_0, grammarAccess.getVariableDeclarationAccess().getOutputOutputKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "output", true, "output");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct3.g:2647:3: ( (lv_static_4_0= 'static' ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==46) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalSct3.g:2648:1: (lv_static_4_0= 'static' )
                    {
                    // InternalSct3.g:2648:1: (lv_static_4_0= 'static' )
                    // InternalSct3.g:2649:3: lv_static_4_0= 'static'
                    {
                    lv_static_4_0=(Token)match(input,46,FollowSets000.FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_4_0, grammarAccess.getVariableDeclarationAccess().getStaticStaticKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct3.g:2662:3: ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==47) ) {
                int LA83_1 = input.LA(2);

                if ( ((LA83_1>=89 && LA83_1<=95)) ) {
                    alt83=1;
                }
                else if ( (LA83_1==RULE_ID||LA83_1==RULE_COMMENT_ANNOTATION||LA83_1==58) ) {
                    alt83=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA83_0>=89 && LA83_0<=95)) ) {
                alt83=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalSct3.g:2662:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    {
                    // InternalSct3.g:2662:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    // InternalSct3.g:2662:5: ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) )
                    {
                    // InternalSct3.g:2662:5: ( (lv_signal_5_0= 'signal' ) )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==47) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // InternalSct3.g:2663:1: (lv_signal_5_0= 'signal' )
                            {
                            // InternalSct3.g:2663:1: (lv_signal_5_0= 'signal' )
                            // InternalSct3.g:2664:3: lv_signal_5_0= 'signal'
                            {
                            lv_signal_5_0=(Token)match(input,47,FollowSets000.FOLLOW_58); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_signal_5_0, grammarAccess.getVariableDeclarationAccess().getSignalSignalKeyword_5_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                              	        }
                                     		setWithLastConsumed(current, "signal", true, "signal");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // InternalSct3.g:2677:3: ( (lv_type_6_0= ruleValueType ) )
                    // InternalSct3.g:2678:1: (lv_type_6_0= ruleValueType )
                    {
                    // InternalSct3.g:2678:1: (lv_type_6_0= ruleValueType )
                    // InternalSct3.g:2679:3: lv_type_6_0= ruleValueType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeValueTypeEnumRuleCall_5_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_59);
                    lv_type_6_0=ruleValueType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_6_0, 
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.ValueType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSct3.g:2696:6: ( (lv_signal_7_0= 'signal' ) )
                    {
                    // InternalSct3.g:2696:6: ( (lv_signal_7_0= 'signal' ) )
                    // InternalSct3.g:2697:1: (lv_signal_7_0= 'signal' )
                    {
                    // InternalSct3.g:2697:1: (lv_signal_7_0= 'signal' )
                    // InternalSct3.g:2698:3: lv_signal_7_0= 'signal'
                    {
                    lv_signal_7_0=(Token)match(input,47,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_signal_7_0, grammarAccess.getVariableDeclarationAccess().getSignalSignalKeyword_5_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "signal", true, "signal");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSct3.g:2711:3: ( (lv_valuedObjects_8_0= ruleValuedObject ) )
            // InternalSct3.g:2712:1: (lv_valuedObjects_8_0= ruleValuedObject )
            {
            // InternalSct3.g:2712:1: (lv_valuedObjects_8_0= ruleValuedObject )
            // InternalSct3.g:2713:3: lv_valuedObjects_8_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_60);
            lv_valuedObjects_8_0=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"valuedObjects",
                      		lv_valuedObjects_8_0, 
                      		"de.cau.cs.kieler.core.kexpressions.text.KEXT.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct3.g:2729:2: (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==48) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalSct3.g:2729:4: otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    {
            	    otherlv_9=(Token)match(input,48,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getVariableDeclarationAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // InternalSct3.g:2733:1: ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    // InternalSct3.g:2734:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    {
            	    // InternalSct3.g:2734:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    // InternalSct3.g:2735:3: lv_valuedObjects_10_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_60);
            	    lv_valuedObjects_10_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_10_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.ValuedObject");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            otherlv_11=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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


    // $ANTLR start "entryRuleVariableDeclarationWOSemicolon"
    // InternalSct3.g:2763:1: entryRuleVariableDeclarationWOSemicolon returns [EObject current=null] : iv_ruleVariableDeclarationWOSemicolon= ruleVariableDeclarationWOSemicolon EOF ;
    public final EObject entryRuleVariableDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarationWOSemicolon = null;


        try {
            // InternalSct3.g:2764:2: (iv_ruleVariableDeclarationWOSemicolon= ruleVariableDeclarationWOSemicolon EOF )
            // InternalSct3.g:2765:2: iv_ruleVariableDeclarationWOSemicolon= ruleVariableDeclarationWOSemicolon EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariableDeclarationWOSemicolon=ruleVariableDeclarationWOSemicolon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclarationWOSemicolon; 
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
    // $ANTLR end "entryRuleVariableDeclarationWOSemicolon"


    // $ANTLR start "ruleVariableDeclarationWOSemicolon"
    // InternalSct3.g:2772:1: ruleVariableDeclarationWOSemicolon returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* ) ;
    public final EObject ruleVariableDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        Token lv_const_1_0=null;
        Token lv_input_2_0=null;
        Token lv_output_3_0=null;
        Token lv_static_4_0=null;
        Token lv_signal_5_0=null;
        Token lv_signal_7_0=null;
        Token otherlv_9=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_6_0 = null;

        EObject lv_valuedObjects_8_0 = null;

        EObject lv_valuedObjects_10_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:2775:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* ) )
            // InternalSct3.g:2776:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* )
            {
            // InternalSct3.g:2776:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )* )
            // InternalSct3.g:2776:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) ) ( (lv_valuedObjects_8_0= ruleValuedObject ) ) (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )*
            {
            // InternalSct3.g:2776:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==RULE_COMMENT_ANNOTATION||LA85_0==58) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalSct3.g:2777:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct3.g:2777:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct3.g:2778:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_54);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationWOSemicolonRule());
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
            	    break loop85;
                }
            } while (true);

            // InternalSct3.g:2794:3: ( (lv_const_1_0= 'const' ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==43) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalSct3.g:2795:1: (lv_const_1_0= 'const' )
                    {
                    // InternalSct3.g:2795:1: (lv_const_1_0= 'const' )
                    // InternalSct3.g:2796:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,43,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_const_1_0, grammarAccess.getVariableDeclarationWOSemicolonAccess().getConstConstKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationWOSemicolonRule());
                      	        }
                             		setWithLastConsumed(current, "const", true, "const");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct3.g:2809:3: ( (lv_input_2_0= 'input' ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==44) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalSct3.g:2810:1: (lv_input_2_0= 'input' )
                    {
                    // InternalSct3.g:2810:1: (lv_input_2_0= 'input' )
                    // InternalSct3.g:2811:3: lv_input_2_0= 'input'
                    {
                    lv_input_2_0=(Token)match(input,44,FollowSets000.FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_input_2_0, grammarAccess.getVariableDeclarationWOSemicolonAccess().getInputInputKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationWOSemicolonRule());
                      	        }
                             		setWithLastConsumed(current, "input", true, "input");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct3.g:2824:3: ( (lv_output_3_0= 'output' ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==45) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalSct3.g:2825:1: (lv_output_3_0= 'output' )
                    {
                    // InternalSct3.g:2825:1: (lv_output_3_0= 'output' )
                    // InternalSct3.g:2826:3: lv_output_3_0= 'output'
                    {
                    lv_output_3_0=(Token)match(input,45,FollowSets000.FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_output_3_0, grammarAccess.getVariableDeclarationWOSemicolonAccess().getOutputOutputKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationWOSemicolonRule());
                      	        }
                             		setWithLastConsumed(current, "output", true, "output");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct3.g:2839:3: ( (lv_static_4_0= 'static' ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==46) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalSct3.g:2840:1: (lv_static_4_0= 'static' )
                    {
                    // InternalSct3.g:2840:1: (lv_static_4_0= 'static' )
                    // InternalSct3.g:2841:3: lv_static_4_0= 'static'
                    {
                    lv_static_4_0=(Token)match(input,46,FollowSets000.FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_4_0, grammarAccess.getVariableDeclarationWOSemicolonAccess().getStaticStaticKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationWOSemicolonRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalSct3.g:2854:3: ( ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ) | ( (lv_signal_7_0= 'signal' ) ) )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==47) ) {
                int LA91_1 = input.LA(2);

                if ( (LA91_1==RULE_ID||LA91_1==RULE_COMMENT_ANNOTATION||LA91_1==58) ) {
                    alt91=2;
                }
                else if ( ((LA91_1>=89 && LA91_1<=95)) ) {
                    alt91=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 91, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA91_0>=89 && LA91_0<=95)) ) {
                alt91=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // InternalSct3.g:2854:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    {
                    // InternalSct3.g:2854:4: ( ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) )
                    // InternalSct3.g:2854:5: ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) )
                    {
                    // InternalSct3.g:2854:5: ( (lv_signal_5_0= 'signal' ) )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==47) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // InternalSct3.g:2855:1: (lv_signal_5_0= 'signal' )
                            {
                            // InternalSct3.g:2855:1: (lv_signal_5_0= 'signal' )
                            // InternalSct3.g:2856:3: lv_signal_5_0= 'signal'
                            {
                            lv_signal_5_0=(Token)match(input,47,FollowSets000.FOLLOW_58); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_signal_5_0, grammarAccess.getVariableDeclarationWOSemicolonAccess().getSignalSignalKeyword_5_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getVariableDeclarationWOSemicolonRule());
                              	        }
                                     		setWithLastConsumed(current, "signal", true, "signal");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // InternalSct3.g:2869:3: ( (lv_type_6_0= ruleValueType ) )
                    // InternalSct3.g:2870:1: (lv_type_6_0= ruleValueType )
                    {
                    // InternalSct3.g:2870:1: (lv_type_6_0= ruleValueType )
                    // InternalSct3.g:2871:3: lv_type_6_0= ruleValueType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getTypeValueTypeEnumRuleCall_5_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_59);
                    lv_type_6_0=ruleValueType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationWOSemicolonRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_6_0, 
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.ValueType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSct3.g:2888:6: ( (lv_signal_7_0= 'signal' ) )
                    {
                    // InternalSct3.g:2888:6: ( (lv_signal_7_0= 'signal' ) )
                    // InternalSct3.g:2889:1: (lv_signal_7_0= 'signal' )
                    {
                    // InternalSct3.g:2889:1: (lv_signal_7_0= 'signal' )
                    // InternalSct3.g:2890:3: lv_signal_7_0= 'signal'
                    {
                    lv_signal_7_0=(Token)match(input,47,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_signal_7_0, grammarAccess.getVariableDeclarationWOSemicolonAccess().getSignalSignalKeyword_5_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationWOSemicolonRule());
                      	        }
                             		setWithLastConsumed(current, "signal", true, "signal");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSct3.g:2903:3: ( (lv_valuedObjects_8_0= ruleValuedObject ) )
            // InternalSct3.g:2904:1: (lv_valuedObjects_8_0= ruleValuedObject )
            {
            // InternalSct3.g:2904:1: (lv_valuedObjects_8_0= ruleValuedObject )
            // InternalSct3.g:2905:3: lv_valuedObjects_8_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_61);
            lv_valuedObjects_8_0=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDeclarationWOSemicolonRule());
              	        }
                     		add(
                     			current, 
                     			"valuedObjects",
                      		lv_valuedObjects_8_0, 
                      		"de.cau.cs.kieler.core.kexpressions.text.KEXT.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct3.g:2921:2: (otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==48) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalSct3.g:2921:4: otherlv_9= ',' ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    {
            	    otherlv_9=(Token)match(input,48,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getVariableDeclarationWOSemicolonAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // InternalSct3.g:2925:1: ( (lv_valuedObjects_10_0= ruleValuedObject ) )
            	    // InternalSct3.g:2926:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    {
            	    // InternalSct3.g:2926:1: (lv_valuedObjects_10_0= ruleValuedObject )
            	    // InternalSct3.g:2927:3: lv_valuedObjects_10_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_61);
            	    lv_valuedObjects_10_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationWOSemicolonRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_10_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.ValuedObject");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop92;
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
    // $ANTLR end "ruleVariableDeclarationWOSemicolon"


    // $ANTLR start "entryRuleNamespaceID"
    // InternalSct3.g:2951:1: entryRuleNamespaceID returns [String current=null] : iv_ruleNamespaceID= ruleNamespaceID EOF ;
    public final String entryRuleNamespaceID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespaceID = null;


        try {
            // InternalSct3.g:2952:2: (iv_ruleNamespaceID= ruleNamespaceID EOF )
            // InternalSct3.g:2953:2: iv_ruleNamespaceID= ruleNamespaceID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamespaceIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNamespaceID=ruleNamespaceID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamespaceID.getText(); 
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
    // $ANTLR end "entryRuleNamespaceID"


    // $ANTLR start "ruleNamespaceID"
    // InternalSct3.g:2960:1: ruleNamespaceID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleNamespaceID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalSct3.g:2963:28: ( (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* ) )
            // InternalSct3.g:2964:1: (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* )
            {
            // InternalSct3.g:2964:1: (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* )
            // InternalSct3.g:2964:6: this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getNamespaceIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalSct3.g:2971:1: (kw= ':' this_ID_2= RULE_ID )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==36) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalSct3.g:2972:2: kw= ':' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,36,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getNamespaceIDAccess().getColonKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_62); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getNamespaceIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop93;
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
    // $ANTLR end "ruleNamespaceID"


    // $ANTLR start "entryRuleReferenceDeclaration"
    // InternalSct3.g:2992:1: entryRuleReferenceDeclaration returns [EObject current=null] : iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF ;
    public final EObject entryRuleReferenceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceDeclaration = null;


        try {
            // InternalSct3.g:2993:2: (iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF )
            // InternalSct3.g:2994:2: iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReferenceDeclaration=ruleReferenceDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceDeclaration; 
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
    // $ANTLR end "entryRuleReferenceDeclaration"


    // $ANTLR start "ruleReferenceDeclaration"
    // InternalSct3.g:3001:1: ruleReferenceDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '&' ( ( ruleNamespaceID ) ) ( (lv_valuedObjects_3_0= ruleValuedObject ) ) (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleReferenceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_valuedObjects_3_0 = null;

        EObject lv_valuedObjects_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:3004:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '&' ( ( ruleNamespaceID ) ) ( (lv_valuedObjects_3_0= ruleValuedObject ) ) (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )* otherlv_6= ';' ) )
            // InternalSct3.g:3005:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '&' ( ( ruleNamespaceID ) ) ( (lv_valuedObjects_3_0= ruleValuedObject ) ) (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )* otherlv_6= ';' )
            {
            // InternalSct3.g:3005:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '&' ( ( ruleNamespaceID ) ) ( (lv_valuedObjects_3_0= ruleValuedObject ) ) (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )* otherlv_6= ';' )
            // InternalSct3.g:3005:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '&' ( ( ruleNamespaceID ) ) ( (lv_valuedObjects_3_0= ruleValuedObject ) ) (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )* otherlv_6= ';'
            {
            // InternalSct3.g:3005:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==RULE_COMMENT_ANNOTATION||LA94_0==58) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalSct3.g:3006:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct3.g:3006:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct3.g:3007:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_63);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationRule());
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
            	    break loop94;
                }
            } while (true);

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReferenceDeclarationAccess().getAmpersandKeyword_1());
                  
            }
            // InternalSct3.g:3027:1: ( ( ruleNamespaceID ) )
            // InternalSct3.g:3028:1: ( ruleNamespaceID )
            {
            // InternalSct3.g:3028:1: ( ruleNamespaceID )
            // InternalSct3.g:3029:3: ruleNamespaceID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceDeclarationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getReferenceIdentifiableCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_59);
            ruleNamespaceID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct3.g:3045:2: ( (lv_valuedObjects_3_0= ruleValuedObject ) )
            // InternalSct3.g:3046:1: (lv_valuedObjects_3_0= ruleValuedObject )
            {
            // InternalSct3.g:3046:1: (lv_valuedObjects_3_0= ruleValuedObject )
            // InternalSct3.g:3047:3: lv_valuedObjects_3_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_60);
            lv_valuedObjects_3_0=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"valuedObjects",
                      		lv_valuedObjects_3_0, 
                      		"de.cau.cs.kieler.core.kexpressions.text.KEXT.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct3.g:3063:2: (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==48) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // InternalSct3.g:3063:4: otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) )
            	    {
            	    otherlv_4=(Token)match(input,48,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getReferenceDeclarationAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // InternalSct3.g:3067:1: ( (lv_valuedObjects_5_0= ruleValuedObject ) )
            	    // InternalSct3.g:3068:1: (lv_valuedObjects_5_0= ruleValuedObject )
            	    {
            	    // InternalSct3.g:3068:1: (lv_valuedObjects_5_0= ruleValuedObject )
            	    // InternalSct3.g:3069:3: lv_valuedObjects_5_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_60);
            	    lv_valuedObjects_5_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_5_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.ValuedObject");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);

            otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getReferenceDeclarationAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferenceDeclaration"


    // $ANTLR start "entryRuleReferenceDeclarationWOSemicolon"
    // InternalSct3.g:3097:1: entryRuleReferenceDeclarationWOSemicolon returns [EObject current=null] : iv_ruleReferenceDeclarationWOSemicolon= ruleReferenceDeclarationWOSemicolon EOF ;
    public final EObject entryRuleReferenceDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceDeclarationWOSemicolon = null;


        try {
            // InternalSct3.g:3098:2: (iv_ruleReferenceDeclarationWOSemicolon= ruleReferenceDeclarationWOSemicolon EOF )
            // InternalSct3.g:3099:2: iv_ruleReferenceDeclarationWOSemicolon= ruleReferenceDeclarationWOSemicolon EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReferenceDeclarationWOSemicolon=ruleReferenceDeclarationWOSemicolon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceDeclarationWOSemicolon; 
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
    // $ANTLR end "entryRuleReferenceDeclarationWOSemicolon"


    // $ANTLR start "ruleReferenceDeclarationWOSemicolon"
    // InternalSct3.g:3106:1: ruleReferenceDeclarationWOSemicolon returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '&' ( ( ruleNamespaceID ) ) ( (lv_valuedObjects_3_0= ruleValuedObject ) ) (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )* ) ;
    public final EObject ruleReferenceDeclarationWOSemicolon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_valuedObjects_3_0 = null;

        EObject lv_valuedObjects_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:3109:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '&' ( ( ruleNamespaceID ) ) ( (lv_valuedObjects_3_0= ruleValuedObject ) ) (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )* ) )
            // InternalSct3.g:3110:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '&' ( ( ruleNamespaceID ) ) ( (lv_valuedObjects_3_0= ruleValuedObject ) ) (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )* )
            {
            // InternalSct3.g:3110:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '&' ( ( ruleNamespaceID ) ) ( (lv_valuedObjects_3_0= ruleValuedObject ) ) (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )* )
            // InternalSct3.g:3110:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '&' ( ( ruleNamespaceID ) ) ( (lv_valuedObjects_3_0= ruleValuedObject ) ) (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )*
            {
            // InternalSct3.g:3110:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==RULE_COMMENT_ANNOTATION||LA96_0==58) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalSct3.g:3111:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct3.g:3111:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct3.g:3112:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_63);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationWOSemicolonRule());
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
            	    break loop96;
                }
            } while (true);

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReferenceDeclarationWOSemicolonAccess().getAmpersandKeyword_1());
                  
            }
            // InternalSct3.g:3132:1: ( ( ruleNamespaceID ) )
            // InternalSct3.g:3133:1: ( ruleNamespaceID )
            {
            // InternalSct3.g:3133:1: ( ruleNamespaceID )
            // InternalSct3.g:3134:3: ruleNamespaceID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceDeclarationWOSemicolonRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getReferenceIdentifiableCrossReference_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_59);
            ruleNamespaceID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct3.g:3150:2: ( (lv_valuedObjects_3_0= ruleValuedObject ) )
            // InternalSct3.g:3151:1: (lv_valuedObjects_3_0= ruleValuedObject )
            {
            // InternalSct3.g:3151:1: (lv_valuedObjects_3_0= ruleValuedObject )
            // InternalSct3.g:3152:3: lv_valuedObjects_3_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_61);
            lv_valuedObjects_3_0=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationWOSemicolonRule());
              	        }
                     		add(
                     			current, 
                     			"valuedObjects",
                      		lv_valuedObjects_3_0, 
                      		"de.cau.cs.kieler.core.kexpressions.text.KEXT.ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct3.g:3168:2: (otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==48) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalSct3.g:3168:4: otherlv_4= ',' ( (lv_valuedObjects_5_0= ruleValuedObject ) )
            	    {
            	    otherlv_4=(Token)match(input,48,FollowSets000.FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getReferenceDeclarationWOSemicolonAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // InternalSct3.g:3172:1: ( (lv_valuedObjects_5_0= ruleValuedObject ) )
            	    // InternalSct3.g:3173:1: (lv_valuedObjects_5_0= ruleValuedObject )
            	    {
            	    // InternalSct3.g:3173:1: (lv_valuedObjects_5_0= ruleValuedObject )
            	    // InternalSct3.g:3174:3: lv_valuedObjects_5_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceDeclarationWOSemicolonAccess().getValuedObjectsValuedObjectParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_61);
            	    lv_valuedObjects_5_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceDeclarationWOSemicolonRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_5_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.text.KEXT.ValuedObject");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop97;
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
    // $ANTLR end "ruleReferenceDeclarationWOSemicolon"


    // $ANTLR start "entryRuleValuedObject"
    // InternalSct3.g:3198:1: entryRuleValuedObject returns [EObject current=null] : iv_ruleValuedObject= ruleValuedObject EOF ;
    public final EObject entryRuleValuedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObject = null;


        try {
            // InternalSct3.g:3199:2: (iv_ruleValuedObject= ruleValuedObject EOF )
            // InternalSct3.g:3200:2: iv_ruleValuedObject= ruleValuedObject EOF
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
    // InternalSct3.g:3207:1: ruleValuedObject returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= RULE_INT ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? ) ;
    public final EObject ruleValuedObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_cardinalities_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_initialValue_6_0 = null;

        Enumerator lv_combineOperator_8_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:3210:28: ( ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= RULE_INT ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? ) )
            // InternalSct3.g:3211:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= RULE_INT ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? )
            {
            // InternalSct3.g:3211:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= RULE_INT ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )? )
            // InternalSct3.g:3211:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_cardinalities_3_0= RULE_INT ) ) otherlv_4= ']' )* (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )? (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )?
            {
            // InternalSct3.g:3211:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==RULE_COMMENT_ANNOTATION||LA98_0==58) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalSct3.g:3212:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    {
            	    // InternalSct3.g:3212:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    // InternalSct3.g:3213:3: lv_annotations_0_0= ruleQuotedStringAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getAnnotationsQuotedStringAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_59);
            	    lv_annotations_0_0=ruleQuotedStringAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_0_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.QuotedStringAnnotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);

            // InternalSct3.g:3229:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSct3.g:3230:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSct3.g:3230:1: (lv_name_1_0= RULE_ID )
            // InternalSct3.g:3231:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getValuedObjectAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalSct3.g:3247:2: (otherlv_2= '[' ( (lv_cardinalities_3_0= RULE_INT ) ) otherlv_4= ']' )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==50) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalSct3.g:3247:4: otherlv_2= '[' ( (lv_cardinalities_3_0= RULE_INT ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_65); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalSct3.g:3251:1: ( (lv_cardinalities_3_0= RULE_INT ) )
            	    // InternalSct3.g:3252:1: (lv_cardinalities_3_0= RULE_INT )
            	    {
            	    // InternalSct3.g:3252:1: (lv_cardinalities_3_0= RULE_INT )
            	    // InternalSct3.g:3253:3: lv_cardinalities_3_0= RULE_INT
            	    {
            	    lv_cardinalities_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_66); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_cardinalities_3_0, grammarAccess.getValuedObjectAccess().getCardinalitiesINTTerminalRuleCall_2_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getValuedObjectRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"cardinalities",
            	              		lv_cardinalities_3_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.INT");
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_64); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);

            // InternalSct3.g:3273:3: (otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==38) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalSct3.g:3273:5: otherlv_5= '=' ( (lv_initialValue_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,38,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getValuedObjectAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // InternalSct3.g:3277:1: ( (lv_initialValue_6_0= ruleExpression ) )
                    // InternalSct3.g:3278:1: (lv_initialValue_6_0= ruleExpression )
                    {
                    // InternalSct3.g:3278:1: (lv_initialValue_6_0= ruleExpression )
                    // InternalSct3.g:3279:3: lv_initialValue_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getInitialValueExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_67);
                    lv_initialValue_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
                      	        }
                             		set(
                             			current, 
                             			"initialValue",
                              		lv_initialValue_6_0, 
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSct3.g:3295:4: (otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==52) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalSct3.g:3295:6: otherlv_7= 'combine' ( (lv_combineOperator_8_0= ruleCombineOperator ) )
                    {
                    otherlv_7=(Token)match(input,52,FollowSets000.FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getValuedObjectAccess().getCombineKeyword_4_0());
                          
                    }
                    // InternalSct3.g:3299:1: ( (lv_combineOperator_8_0= ruleCombineOperator ) )
                    // InternalSct3.g:3300:1: (lv_combineOperator_8_0= ruleCombineOperator )
                    {
                    // InternalSct3.g:3300:1: (lv_combineOperator_8_0= ruleCombineOperator )
                    // InternalSct3.g:3301:3: lv_combineOperator_8_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getCombineOperatorCombineOperatorEnumRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_combineOperator_8_0=ruleCombineOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
                      	        }
                             		set(
                             			current, 
                             			"combineOperator",
                              		lv_combineOperator_8_0, 
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.CombineOperator");
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
    // InternalSct3.g:3325:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // InternalSct3.g:3326:2: (iv_ruleEffect= ruleEffect EOF )
            // InternalSct3.g:3327:2: iv_ruleEffect= ruleEffect EOF
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
    // InternalSct3.g:3334:1: ruleEffect returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_PostfixEffect_1 = null;

        EObject this_Emission_2 = null;

        EObject this_HostcodeEffect_3 = null;

        EObject this_FunctionCallEffect_4 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:3337:28: ( (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect ) )
            // InternalSct3.g:3338:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect )
            {
            // InternalSct3.g:3338:1: (this_Assignment_0= ruleAssignment | this_PostfixEffect_1= rulePostfixEffect | this_Emission_2= ruleEmission | this_HostcodeEffect_3= ruleHostcodeEffect | this_FunctionCallEffect_4= ruleFunctionCallEffect )
            int alt102=5;
            switch ( input.LA(1) ) {
            case RULE_COMMENT_ANNOTATION:
                {
                int LA102_1 = input.LA(2);

                if ( (synpred113_InternalSct3()) ) {
                    alt102=1;
                }
                else if ( (synpred114_InternalSct3()) ) {
                    alt102=2;
                }
                else if ( (synpred115_InternalSct3()) ) {
                    alt102=3;
                }
                else if ( (synpred116_InternalSct3()) ) {
                    alt102=4;
                }
                else if ( (true) ) {
                    alt102=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 1, input);

                    throw nvae;
                }
                }
                break;
            case 58:
                {
                int LA102_2 = input.LA(2);

                if ( (synpred113_InternalSct3()) ) {
                    alt102=1;
                }
                else if ( (synpred114_InternalSct3()) ) {
                    alt102=2;
                }
                else if ( (synpred115_InternalSct3()) ) {
                    alt102=3;
                }
                else if ( (synpred116_InternalSct3()) ) {
                    alt102=4;
                }
                else if ( (true) ) {
                    alt102=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA102_3 = input.LA(2);

                if ( (synpred113_InternalSct3()) ) {
                    alt102=1;
                }
                else if ( (synpred114_InternalSct3()) ) {
                    alt102=2;
                }
                else if ( (synpred115_InternalSct3()) ) {
                    alt102=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HOSTCODE:
                {
                alt102=4;
                }
                break;
            case 53:
                {
                alt102=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // InternalSct3.g:3339:2: this_Assignment_0= ruleAssignment
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
                    // InternalSct3.g:3352:2: this_PostfixEffect_1= rulePostfixEffect
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
                    // InternalSct3.g:3365:2: this_Emission_2= ruleEmission
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
                    // InternalSct3.g:3378:2: this_HostcodeEffect_3= ruleHostcodeEffect
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
                    // InternalSct3.g:3391:2: this_FunctionCallEffect_4= ruleFunctionCallEffect
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
    // InternalSct3.g:3410:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // InternalSct3.g:3411:2: (iv_ruleEmission= ruleEmission EOF )
            // InternalSct3.g:3412:2: iv_ruleEmission= ruleEmission EOF
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
    // InternalSct3.g:3419:1: ruleEmission returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_newValue_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:3422:28: ( ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? ) )
            // InternalSct3.g:3423:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? )
            {
            // InternalSct3.g:3423:1: ( ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )? )
            // InternalSct3.g:3423:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            {
            // InternalSct3.g:3423:2: ( (lv_annotations_0_0= ruleQuotedStringAnnotation ) )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==RULE_COMMENT_ANNOTATION||LA103_0==58) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // InternalSct3.g:3424:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    {
            	    // InternalSct3.g:3424:1: (lv_annotations_0_0= ruleQuotedStringAnnotation )
            	    // InternalSct3.g:3425:3: lv_annotations_0_0= ruleQuotedStringAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmissionAccess().getAnnotationsQuotedStringAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_59);
            	    lv_annotations_0_0=ruleQuotedStringAnnotation();

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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.QuotedStringAnnotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);

            // InternalSct3.g:3441:3: ( (otherlv_1= RULE_ID ) )
            // InternalSct3.g:3442:1: (otherlv_1= RULE_ID )
            {
            // InternalSct3.g:3442:1: (otherlv_1= RULE_ID )
            // InternalSct3.g:3443:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmissionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // InternalSct3.g:3457:2: (otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')' )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==39) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalSct3.g:3457:4: otherlv_2= '(' ( (lv_newValue_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // InternalSct3.g:3461:1: ( (lv_newValue_3_0= ruleExpression ) )
                    // InternalSct3.g:3462:1: (lv_newValue_3_0= ruleExpression )
                    {
                    // InternalSct3.g:3462:1: (lv_newValue_3_0= ruleExpression )
                    // InternalSct3.g:3463:3: lv_newValue_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_45);
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
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct3.g:3491:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalSct3.g:3492:2: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalSct3.g:3493:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalSct3.g:3500:1: ruleAssignment returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) ) ;
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
            // InternalSct3.g:3503:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) ) )
            // InternalSct3.g:3504:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) )
            {
            // InternalSct3.g:3504:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) ) )
            // InternalSct3.g:3504:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= ruleAssignOperator ) ) ( (lv_expression_6_0= ruleExpression ) )
            {
            // InternalSct3.g:3504:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==RULE_COMMENT_ANNOTATION||LA105_0==58) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // InternalSct3.g:3505:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct3.g:3505:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct3.g:3506:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_59);
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
            	    break loop105;
                }
            } while (true);

            // InternalSct3.g:3522:3: ( (otherlv_1= RULE_ID ) )
            // InternalSct3.g:3523:1: (otherlv_1= RULE_ID )
            {
            // InternalSct3.g:3523:1: (otherlv_1= RULE_ID )
            // InternalSct3.g:3524:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // InternalSct3.g:3538:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==50) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // InternalSct3.g:3538:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalSct3.g:3542:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // InternalSct3.g:3543:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // InternalSct3.g:3543:1: (lv_indices_3_0= ruleExpression )
            	    // InternalSct3.g:3544:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_66);
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
            	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_70); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);

            // InternalSct3.g:3564:3: ( (lv_operator_5_0= ruleAssignOperator ) )
            // InternalSct3.g:3565:1: (lv_operator_5_0= ruleAssignOperator )
            {
            // InternalSct3.g:3565:1: (lv_operator_5_0= ruleAssignOperator )
            // InternalSct3.g:3566:3: lv_operator_5_0= ruleAssignOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getOperatorAssignOperatorEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_24);
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
                      		"de.cau.cs.kieler.core.kexpressions.keffects.KEffects.AssignOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct3.g:3582:2: ( (lv_expression_6_0= ruleExpression ) )
            // InternalSct3.g:3583:1: (lv_expression_6_0= ruleExpression )
            {
            // InternalSct3.g:3583:1: (lv_expression_6_0= ruleExpression )
            // InternalSct3.g:3584:3: lv_expression_6_0= ruleExpression
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
                      		"de.cau.cs.kieler.core.kexpressions.KExpressions.Expression");
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
    // InternalSct3.g:3608:1: entryRulePostfixEffect returns [EObject current=null] : iv_rulePostfixEffect= rulePostfixEffect EOF ;
    public final EObject entryRulePostfixEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixEffect = null;


        try {
            // InternalSct3.g:3609:2: (iv_rulePostfixEffect= rulePostfixEffect EOF )
            // InternalSct3.g:3610:2: iv_rulePostfixEffect= rulePostfixEffect EOF
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
    // InternalSct3.g:3617:1: rulePostfixEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) ) ;
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
            // InternalSct3.g:3620:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) ) )
            // InternalSct3.g:3621:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) )
            {
            // InternalSct3.g:3621:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) ) )
            // InternalSct3.g:3621:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )* ( (lv_operator_5_0= rulePostfixOperator ) )
            {
            // InternalSct3.g:3621:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==RULE_COMMENT_ANNOTATION||LA107_0==58) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // InternalSct3.g:3622:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct3.g:3622:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct3.g:3623:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_59);
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
            	    break loop107;
                }
            } while (true);

            // InternalSct3.g:3639:3: ( (otherlv_1= RULE_ID ) )
            // InternalSct3.g:3640:1: (otherlv_1= RULE_ID )
            {
            // InternalSct3.g:3640:1: (otherlv_1= RULE_ID )
            // InternalSct3.g:3641:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPostfixEffectRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getPostfixEffectAccess().getValuedObjectValuedObjectCrossReference_1_0()); 
              	
            }

            }


            }

            // InternalSct3.g:3655:2: (otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==50) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // InternalSct3.g:3655:4: otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPostfixEffectAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalSct3.g:3659:1: ( (lv_indices_3_0= ruleExpression ) )
            	    // InternalSct3.g:3660:1: (lv_indices_3_0= ruleExpression )
            	    {
            	    // InternalSct3.g:3660:1: (lv_indices_3_0= ruleExpression )
            	    // InternalSct3.g:3661:3: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPostfixEffectAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_66);
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
            	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_71); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getPostfixEffectAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop108;
                }
            } while (true);

            // InternalSct3.g:3681:3: ( (lv_operator_5_0= rulePostfixOperator ) )
            // InternalSct3.g:3682:1: (lv_operator_5_0= rulePostfixOperator )
            {
            // InternalSct3.g:3682:1: (lv_operator_5_0= rulePostfixOperator )
            // InternalSct3.g:3683:3: lv_operator_5_0= rulePostfixOperator
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
                      		"de.cau.cs.kieler.core.kexpressions.keffects.KEffects.PostfixOperator");
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
    // InternalSct3.g:3707:1: entryRuleHostcodeEffect returns [EObject current=null] : iv_ruleHostcodeEffect= ruleHostcodeEffect EOF ;
    public final EObject entryRuleHostcodeEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostcodeEffect = null;


        try {
            // InternalSct3.g:3708:2: (iv_ruleHostcodeEffect= ruleHostcodeEffect EOF )
            // InternalSct3.g:3709:2: iv_ruleHostcodeEffect= ruleHostcodeEffect EOF
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
    // InternalSct3.g:3716:1: ruleHostcodeEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) ;
    public final EObject ruleHostcodeEffect() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:3719:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) )
            // InternalSct3.g:3720:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            {
            // InternalSct3.g:3720:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            // InternalSct3.g:3720:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) )
            {
            // InternalSct3.g:3720:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==RULE_COMMENT_ANNOTATION||LA109_0==58) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // InternalSct3.g:3721:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct3.g:3721:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct3.g:3722:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHostcodeEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_72);
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
            	    break loop109;
                }
            } while (true);

            // InternalSct3.g:3738:3: ( (lv_text_1_0= RULE_HOSTCODE ) )
            // InternalSct3.g:3739:1: (lv_text_1_0= RULE_HOSTCODE )
            {
            // InternalSct3.g:3739:1: (lv_text_1_0= RULE_HOSTCODE )
            // InternalSct3.g:3740:3: lv_text_1_0= RULE_HOSTCODE
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
                      		"de.cau.cs.kieler.core.kexpressions.KExpressions.HOSTCODE");
              	    
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
    // InternalSct3.g:3764:1: entryRuleFunctionCallEffect returns [EObject current=null] : iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF ;
    public final EObject entryRuleFunctionCallEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCallEffect = null;


        try {
            // InternalSct3.g:3765:2: (iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF )
            // InternalSct3.g:3766:2: iv_ruleFunctionCallEffect= ruleFunctionCallEffect EOF
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
    // InternalSct3.g:3773:1: ruleFunctionCallEffect returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' ) ;
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
            // InternalSct3.g:3776:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' ) )
            // InternalSct3.g:3777:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' )
            {
            // InternalSct3.g:3777:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>' )
            // InternalSct3.g:3777:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= '<' ( (lv_functionName_2_0= ruleExtendedID ) ) ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )? otherlv_9= '>'
            {
            // InternalSct3.g:3777:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==RULE_COMMENT_ANNOTATION||LA110_0==58) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // InternalSct3.g:3778:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalSct3.g:3778:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalSct3.g:3779:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_73);
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
            	    break loop110;
                }
            } while (true);

            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionCallEffectAccess().getLessThanSignKeyword_1());
                  
            }
            // InternalSct3.g:3799:1: ( (lv_functionName_2_0= ruleExtendedID ) )
            // InternalSct3.g:3800:1: (lv_functionName_2_0= ruleExtendedID )
            {
            // InternalSct3.g:3800:1: (lv_functionName_2_0= ruleExtendedID )
            // InternalSct3.g:3801:3: lv_functionName_2_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getFunctionNameExtendedIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_74);
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

            // InternalSct3.g:3817:2: ( (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' ) | otherlv_8= '()' )?
            int alt112=3;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==39) ) {
                alt112=1;
            }
            else if ( (LA112_0==54) ) {
                alt112=2;
            }
            switch (alt112) {
                case 1 :
                    // InternalSct3.g:3817:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    {
                    // InternalSct3.g:3817:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )
                    // InternalSct3.g:3817:5: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_75); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisKeyword_3_0_0());
                          
                    }
                    // InternalSct3.g:3821:1: ( (lv_parameters_4_0= ruleParameter ) )
                    // InternalSct3.g:3822:1: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalSct3.g:3822:1: (lv_parameters_4_0= ruleParameter )
                    // InternalSct3.g:3823:3: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_76);
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
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSct3.g:3839:2: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop111:
                    do {
                        int alt111=2;
                        int LA111_0 = input.LA(1);

                        if ( (LA111_0==48) ) {
                            alt111=1;
                        }


                        switch (alt111) {
                    	case 1 :
                    	    // InternalSct3.g:3839:4: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,48,FollowSets000.FOLLOW_75); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getFunctionCallEffectAccess().getCommaKeyword_3_0_2_0());
                    	          
                    	    }
                    	    // InternalSct3.g:3843:1: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // InternalSct3.g:3844:1: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // InternalSct3.g:3844:1: (lv_parameters_6_0= ruleParameter )
                    	    // InternalSct3.g:3845:3: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallEffectAccess().getParametersParameterParserRuleCall_3_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_76);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop111;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,40,FollowSets000.FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallEffectAccess().getRightParenthesisKeyword_3_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct3.g:3866:7: otherlv_8= '()'
                    {
                    otherlv_8=(Token)match(input,54,FollowSets000.FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getFunctionCallEffectAccess().getLeftParenthesisRightParenthesisKeyword_3_1());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct3.g:3884:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSct3.g:3885:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalSct3.g:3886:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalSct3.g:3893:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:3896:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // InternalSct3.g:3897:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // InternalSct3.g:3897:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt113=2;
            alt113 = dfa113.predict(input);
            switch (alt113) {
                case 1 :
                    // InternalSct3.g:3898:2: this_BoolExpression_0= ruleBoolExpression
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
                    // InternalSct3.g:3911:2: this_ValuedExpression_1= ruleValuedExpression
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
    // InternalSct3.g:3930:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // InternalSct3.g:3931:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // InternalSct3.g:3932:2: iv_ruleBoolExpression= ruleBoolExpression EOF
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
    // InternalSct3.g:3939:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:3942:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // InternalSct3.g:3944:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
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
    // InternalSct3.g:3963:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalSct3.g:3964:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalSct3.g:3965:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
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
    // InternalSct3.g:3972:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:3975:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) )
            // InternalSct3.g:3976:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            {
            // InternalSct3.g:3976:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            // InternalSct3.g:3977:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_78);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct3.g:3988:1: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==87) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalSct3.g:3988:2: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    {
                    // InternalSct3.g:3988:2: ()
                    // InternalSct3.g:3989:2: 
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

                    // InternalSct3.g:3997:2: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    int cnt114=0;
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==87) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // InternalSct3.g:3997:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    {
                    	    // InternalSct3.g:3997:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    	    // InternalSct3.g:3998:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    {
                    	    // InternalSct3.g:3998:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    // InternalSct3.g:3999:3: lv_operator_2_0= ruleLogicalOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_24);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.LogicalOrOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalSct3.g:4015:2: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    // InternalSct3.g:4016:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    {
                    	    // InternalSct3.g:4016:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    // InternalSct3.g:4017:3: lv_subExpressions_3_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_78);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.LogicalAndExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt114 >= 1 ) break loop114;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(114, input);
                                throw eee;
                        }
                        cnt114++;
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
    // InternalSct3.g:4041:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalSct3.g:4042:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalSct3.g:4043:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
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
    // InternalSct3.g:4050:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:4053:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) )
            // InternalSct3.g:4054:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            {
            // InternalSct3.g:4054:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            // InternalSct3.g:4055:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_79);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct3.g:4066:1: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==88) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalSct3.g:4066:2: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    {
                    // InternalSct3.g:4066:2: ()
                    // InternalSct3.g:4067:2: 
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

                    // InternalSct3.g:4075:2: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    int cnt116=0;
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==88) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // InternalSct3.g:4075:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    // InternalSct3.g:4075:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    	    // InternalSct3.g:4076:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    {
                    	    // InternalSct3.g:4076:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    // InternalSct3.g:4077:3: lv_operator_2_0= ruleLogicalAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_24);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.LogicalAndOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalSct3.g:4093:2: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    // InternalSct3.g:4094:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    {
                    	    // InternalSct3.g:4094:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    // InternalSct3.g:4095:3: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_79);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.BitwiseOrExpression");
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // InternalSct3.g:4119:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // InternalSct3.g:4120:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // InternalSct3.g:4121:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
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
    // InternalSct3.g:4128:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:4131:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) )
            // InternalSct3.g:4132:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            {
            // InternalSct3.g:4132:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            // InternalSct3.g:4133:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_80);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct3.g:4144:1: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==81) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalSct3.g:4144:2: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    {
                    // InternalSct3.g:4144:2: ()
                    // InternalSct3.g:4145:2: 
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

                    // InternalSct3.g:4153:2: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    int cnt118=0;
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==81) ) {
                            alt118=1;
                        }


                        switch (alt118) {
                    	case 1 :
                    	    // InternalSct3.g:4153:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    // InternalSct3.g:4153:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    	    // InternalSct3.g:4154:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    {
                    	    // InternalSct3.g:4154:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    // InternalSct3.g:4155:3: lv_operator_2_0= ruleBitwiseOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_24);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.BitwiseOrOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalSct3.g:4171:2: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    // InternalSct3.g:4172:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    {
                    	    // InternalSct3.g:4172:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    // InternalSct3.g:4173:3: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_80);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.BitwiseAndExpression");
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
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // InternalSct3.g:4197:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // InternalSct3.g:4198:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // InternalSct3.g:4199:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
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
    // InternalSct3.g:4206:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:4209:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) )
            // InternalSct3.g:4210:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            {
            // InternalSct3.g:4210:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            // InternalSct3.g:4211:2: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_81);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct3.g:4222:1: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            int alt121=2;
            alt121 = dfa121.predict(input);
            switch (alt121) {
                case 1 :
                    // InternalSct3.g:4222:2: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    {
                    // InternalSct3.g:4222:2: ()
                    // InternalSct3.g:4223:2: 
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

                    // InternalSct3.g:4231:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    int cnt120=0;
                    loop120:
                    do {
                        int alt120=2;
                        alt120 = dfa120.predict(input);
                        switch (alt120) {
                    	case 1 :
                    	    // InternalSct3.g:4231:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    {
                    	    // InternalSct3.g:4231:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    	    // InternalSct3.g:4232:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    {
                    	    // InternalSct3.g:4232:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    // InternalSct3.g:4233:3: lv_operator_2_0= ruleBitwiseAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_24);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.BitwiseAndOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalSct3.g:4249:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    // InternalSct3.g:4250:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    {
                    	    // InternalSct3.g:4250:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    // InternalSct3.g:4251:3: lv_subExpressions_3_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_81);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.CompareOperation");
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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // InternalSct3.g:4275:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // InternalSct3.g:4276:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalSct3.g:4277:2: iv_ruleCompareOperation= ruleCompareOperation EOF
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
    // InternalSct3.g:4284:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:4287:28: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // InternalSct3.g:4288:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // InternalSct3.g:4288:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // InternalSct3.g:4289:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_82);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotOrValuedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct3.g:4300:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt122=2;
            alt122 = dfa122.predict(input);
            switch (alt122) {
                case 1 :
                    // InternalSct3.g:4300:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // InternalSct3.g:4300:2: ()
                    // InternalSct3.g:4301:2: 
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

                    // InternalSct3.g:4309:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // InternalSct3.g:4310:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // InternalSct3.g:4310:1: (lv_operator_2_0= ruleCompareOperator )
                    // InternalSct3.g:4311:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
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
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.CompareOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSct3.g:4327:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // InternalSct3.g:4328:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // InternalSct3.g:4328:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // InternalSct3.g:4329:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
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
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.NotOrValuedExpression");
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
    // InternalSct3.g:4353:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // InternalSct3.g:4354:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // InternalSct3.g:4355:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
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
    // InternalSct3.g:4362:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:4365:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // InternalSct3.g:4366:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // InternalSct3.g:4366:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt123=2;
            alt123 = dfa123.predict(input);
            switch (alt123) {
                case 1 :
                    // InternalSct3.g:4367:2: this_ValuedExpression_0= ruleValuedExpression
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
                    // InternalSct3.g:4380:2: this_NotExpression_1= ruleNotExpression
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
    // InternalSct3.g:4399:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalSct3.g:4400:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalSct3.g:4401:2: iv_ruleNotExpression= ruleNotExpression EOF
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
    // InternalSct3.g:4408:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:4411:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // InternalSct3.g:4412:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // InternalSct3.g:4412:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==57) ) {
                alt124=1;
            }
            else if ( (LA124_0==RULE_ID||LA124_0==RULE_HOSTCODE||LA124_0==RULE_BOOLEAN||LA124_0==39||LA124_0==53||LA124_0==80||LA124_0==86) ) {
                alt124=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // InternalSct3.g:4412:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // InternalSct3.g:4412:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // InternalSct3.g:4412:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // InternalSct3.g:4412:3: ()
                    // InternalSct3.g:4413:2: 
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

                    // InternalSct3.g:4421:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // InternalSct3.g:4422:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // InternalSct3.g:4422:1: (lv_operator_1_0= ruleNotOperator )
                    // InternalSct3.g:4423:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
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
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.NotOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSct3.g:4439:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // InternalSct3.g:4440:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // InternalSct3.g:4440:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // InternalSct3.g:4441:3: lv_subExpressions_2_0= ruleNotExpression
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
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.NotExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSct3.g:4459:2: this_AtomicExpression_3= ruleAtomicExpression
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
    // InternalSct3.g:4478:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // InternalSct3.g:4479:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // InternalSct3.g:4480:2: iv_ruleValuedExpression= ruleValuedExpression EOF
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
    // InternalSct3.g:4487:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:4490:28: (this_AddExpression_0= ruleAddExpression )
            // InternalSct3.g:4492:2: this_AddExpression_0= ruleAddExpression
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
    // InternalSct3.g:4511:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalSct3.g:4512:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalSct3.g:4513:2: iv_ruleAddExpression= ruleAddExpression EOF
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
    // InternalSct3.g:4520:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:4523:28: ( (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? ) )
            // InternalSct3.g:4524:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? )
            {
            // InternalSct3.g:4524:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )? )
            // InternalSct3.g:4525:2: this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_83);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct3.g:4536:1: ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+ )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==82) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalSct3.g:4536:2: () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+
                    {
                    // InternalSct3.g:4536:2: ()
                    // InternalSct3.g:4537:2: 
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

                    // InternalSct3.g:4545:2: ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )+
                    int cnt125=0;
                    loop125:
                    do {
                        int alt125=2;
                        int LA125_0 = input.LA(1);

                        if ( (LA125_0==82) ) {
                            alt125=1;
                        }


                        switch (alt125) {
                    	case 1 :
                    	    // InternalSct3.g:4545:3: ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    	    {
                    	    // InternalSct3.g:4545:3: ( (lv_operator_2_0= ruleAddOperator ) )
                    	    // InternalSct3.g:4546:1: (lv_operator_2_0= ruleAddOperator )
                    	    {
                    	    // InternalSct3.g:4546:1: (lv_operator_2_0= ruleAddOperator )
                    	    // InternalSct3.g:4547:3: lv_operator_2_0= ruleAddOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_84);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.AddOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalSct3.g:4563:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    	    // InternalSct3.g:4564:1: (lv_subExpressions_3_0= ruleSubExpression )
                    	    {
                    	    // InternalSct3.g:4564:1: (lv_subExpressions_3_0= ruleSubExpression )
                    	    // InternalSct3.g:4565:3: lv_subExpressions_3_0= ruleSubExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_83);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.SubExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt125 >= 1 ) break loop125;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(125, input);
                                throw eee;
                        }
                        cnt125++;
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
    // InternalSct3.g:4589:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // InternalSct3.g:4590:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // InternalSct3.g:4591:2: iv_ruleSubExpression= ruleSubExpression EOF
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
    // InternalSct3.g:4598:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:4601:28: ( (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? ) )
            // InternalSct3.g:4602:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? )
            {
            // InternalSct3.g:4602:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )? )
            // InternalSct3.g:4603:2: this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_85);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct3.g:4614:1: ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+ )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==60) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalSct3.g:4614:2: () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+
                    {
                    // InternalSct3.g:4614:2: ()
                    // InternalSct3.g:4615:2: 
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

                    // InternalSct3.g:4623:2: ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )+
                    int cnt127=0;
                    loop127:
                    do {
                        int alt127=2;
                        int LA127_0 = input.LA(1);

                        if ( (LA127_0==60) ) {
                            alt127=1;
                        }


                        switch (alt127) {
                    	case 1 :
                    	    // InternalSct3.g:4623:3: ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    	    {
                    	    // InternalSct3.g:4623:3: ( (lv_operator_2_0= ruleSubOperator ) )
                    	    // InternalSct3.g:4624:1: (lv_operator_2_0= ruleSubOperator )
                    	    {
                    	    // InternalSct3.g:4624:1: (lv_operator_2_0= ruleSubOperator )
                    	    // InternalSct3.g:4625:3: lv_operator_2_0= ruleSubOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_84);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.SubOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalSct3.g:4641:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    	    // InternalSct3.g:4642:1: (lv_subExpressions_3_0= ruleMultExpression )
                    	    {
                    	    // InternalSct3.g:4642:1: (lv_subExpressions_3_0= ruleMultExpression )
                    	    // InternalSct3.g:4643:3: lv_subExpressions_3_0= ruleMultExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_85);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.MultExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt127 >= 1 ) break loop127;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(127, input);
                                throw eee;
                        }
                        cnt127++;
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
    // InternalSct3.g:4667:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // InternalSct3.g:4668:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // InternalSct3.g:4669:2: iv_ruleMultExpression= ruleMultExpression EOF
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
    // InternalSct3.g:4676:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:4679:28: ( (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? ) )
            // InternalSct3.g:4680:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? )
            {
            // InternalSct3.g:4680:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )? )
            // InternalSct3.g:4681:2: this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_86);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct3.g:4692:1: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+ )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==83) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalSct3.g:4692:2: () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+
                    {
                    // InternalSct3.g:4692:2: ()
                    // InternalSct3.g:4693:2: 
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

                    // InternalSct3.g:4701:2: ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )+
                    int cnt129=0;
                    loop129:
                    do {
                        int alt129=2;
                        int LA129_0 = input.LA(1);

                        if ( (LA129_0==83) ) {
                            alt129=1;
                        }


                        switch (alt129) {
                    	case 1 :
                    	    // InternalSct3.g:4701:3: ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    	    {
                    	    // InternalSct3.g:4701:3: ( (lv_operator_2_0= ruleMultOperator ) )
                    	    // InternalSct3.g:4702:1: (lv_operator_2_0= ruleMultOperator )
                    	    {
                    	    // InternalSct3.g:4702:1: (lv_operator_2_0= ruleMultOperator )
                    	    // InternalSct3.g:4703:3: lv_operator_2_0= ruleMultOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_84);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.MultOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalSct3.g:4719:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    	    // InternalSct3.g:4720:1: (lv_subExpressions_3_0= ruleDivExpression )
                    	    {
                    	    // InternalSct3.g:4720:1: (lv_subExpressions_3_0= ruleDivExpression )
                    	    // InternalSct3.g:4721:3: lv_subExpressions_3_0= ruleDivExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_86);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.DivExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt129 >= 1 ) break loop129;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(129, input);
                                throw eee;
                        }
                        cnt129++;
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
    // InternalSct3.g:4745:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // InternalSct3.g:4746:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // InternalSct3.g:4747:2: iv_ruleDivExpression= ruleDivExpression EOF
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
    // InternalSct3.g:4754:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:4757:28: ( (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? ) )
            // InternalSct3.g:4758:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? )
            {
            // InternalSct3.g:4758:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )? )
            // InternalSct3.g:4759:2: this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_87);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct3.g:4770:1: ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+ )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==85) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalSct3.g:4770:2: () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+
                    {
                    // InternalSct3.g:4770:2: ()
                    // InternalSct3.g:4771:2: 
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

                    // InternalSct3.g:4779:2: ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )+
                    int cnt131=0;
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==85) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // InternalSct3.g:4779:3: ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    	    {
                    	    // InternalSct3.g:4779:3: ( (lv_operator_2_0= ruleDivOperator ) )
                    	    // InternalSct3.g:4780:1: (lv_operator_2_0= ruleDivOperator )
                    	    {
                    	    // InternalSct3.g:4780:1: (lv_operator_2_0= ruleDivOperator )
                    	    // InternalSct3.g:4781:3: lv_operator_2_0= ruleDivOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_84);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.DivOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalSct3.g:4797:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    	    // InternalSct3.g:4798:1: (lv_subExpressions_3_0= ruleModExpression )
                    	    {
                    	    // InternalSct3.g:4798:1: (lv_subExpressions_3_0= ruleModExpression )
                    	    // InternalSct3.g:4799:3: lv_subExpressions_3_0= ruleModExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_87);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.ModExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt131 >= 1 ) break loop131;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(131, input);
                                throw eee;
                        }
                        cnt131++;
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
    // InternalSct3.g:4823:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // InternalSct3.g:4824:2: (iv_ruleModExpression= ruleModExpression EOF )
            // InternalSct3.g:4825:2: iv_ruleModExpression= ruleModExpression EOF
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
    // InternalSct3.g:4832:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:4835:28: ( (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? ) )
            // InternalSct3.g:4836:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? )
            {
            // InternalSct3.g:4836:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )? )
            // InternalSct3.g:4837:2: this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_88);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalSct3.g:4848:1: ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+ )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==84) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalSct3.g:4848:2: () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+
                    {
                    // InternalSct3.g:4848:2: ()
                    // InternalSct3.g:4849:2: 
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

                    // InternalSct3.g:4857:2: ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )+
                    int cnt133=0;
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==84) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // InternalSct3.g:4857:3: ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    	    {
                    	    // InternalSct3.g:4857:3: ( (lv_operator_2_0= ruleModOperator ) )
                    	    // InternalSct3.g:4858:1: (lv_operator_2_0= ruleModOperator )
                    	    {
                    	    // InternalSct3.g:4858:1: (lv_operator_2_0= ruleModOperator )
                    	    // InternalSct3.g:4859:3: lv_operator_2_0= ruleModOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_84);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.ModOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // InternalSct3.g:4875:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    	    // InternalSct3.g:4876:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    	    {
                    	    // InternalSct3.g:4876:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    	    // InternalSct3.g:4877:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_88);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.AtomicValuedExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt133 >= 1 ) break loop133;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(133, input);
                                throw eee;
                        }
                        cnt133++;
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
    // InternalSct3.g:4901:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // InternalSct3.g:4902:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // InternalSct3.g:4903:2: iv_ruleNegExpression= ruleNegExpression EOF
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
    // InternalSct3.g:4910:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:4913:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // InternalSct3.g:4914:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // InternalSct3.g:4914:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==60) ) {
                alt135=1;
            }
            else if ( ((LA135_0>=RULE_ID && LA135_0<=RULE_BOOLEAN)||LA135_0==39||LA135_0==53||LA135_0==80||LA135_0==86) ) {
                alt135=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;
            }
            switch (alt135) {
                case 1 :
                    // InternalSct3.g:4914:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // InternalSct3.g:4914:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // InternalSct3.g:4914:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // InternalSct3.g:4914:3: ()
                    // InternalSct3.g:4915:2: 
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

                    // InternalSct3.g:4923:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // InternalSct3.g:4924:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // InternalSct3.g:4924:1: (lv_operator_1_0= ruleSubOperator )
                    // InternalSct3.g:4925:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_84);
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
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.SubOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSct3.g:4941:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // InternalSct3.g:4942:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // InternalSct3.g:4942:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // InternalSct3.g:4943:3: lv_subExpressions_2_0= ruleNegExpression
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
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.NegExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSct3.g:4961:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
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


    // $ANTLR start "entryRuleAtomicValuedExpression"
    // InternalSct3.g:4980:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // InternalSct3.g:4981:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // InternalSct3.g:4982:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
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
    // InternalSct3.g:4989:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) ;
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
            // InternalSct3.g:4992:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) )
            // InternalSct3.g:4993:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            {
            // InternalSct3.g:4993:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            int alt136=5;
            alt136 = dfa136.predict(input);
            switch (alt136) {
                case 1 :
                    // InternalSct3.g:4994:2: this_IntValue_0= ruleIntValue
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
                    // InternalSct3.g:5007:2: this_FloatValue_1= ruleFloatValue
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
                    // InternalSct3.g:5020:2: this_StringValue_2= ruleStringValue
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
                    // InternalSct3.g:5032:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    {
                    // InternalSct3.g:5032:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    // InternalSct3.g:5032:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_84); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_45);
                    this_ValuedExpression_4=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSct3.g:5054:2: this_AtomicExpression_6= ruleAtomicExpression
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
    // InternalSct3.g:5073:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // InternalSct3.g:5074:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // InternalSct3.g:5075:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
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
    // InternalSct3.g:5082:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
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
            // InternalSct3.g:5085:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // InternalSct3.g:5086:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // InternalSct3.g:5086:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==80||LA138_0==86) ) {
                alt138=1;
            }
            else if ( (LA138_0==RULE_ID) ) {
                alt138=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;
            }
            switch (alt138) {
                case 1 :
                    // InternalSct3.g:5086:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // InternalSct3.g:5086:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // InternalSct3.g:5086:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // InternalSct3.g:5086:3: ()
                    // InternalSct3.g:5087:2: 
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

                    // InternalSct3.g:5095:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // InternalSct3.g:5096:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // InternalSct3.g:5096:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // InternalSct3.g:5097:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // InternalSct3.g:5097:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==80) ) {
                        alt137=1;
                    }
                    else if ( (LA137_0==86) ) {
                        alt137=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 137, 0, input);

                        throw nvae;
                    }
                    switch (alt137) {
                        case 1 :
                            // InternalSct3.g:5098:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_89);
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
                                      		"de.cau.cs.kieler.core.kexpressions.KExpressions.PreOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalSct3.g:5113:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_89);
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
                                      		"de.cau.cs.kieler.core.kexpressions.KExpressions.ValOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_90); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // InternalSct3.g:5135:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // InternalSct3.g:5136:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // InternalSct3.g:5136:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // InternalSct3.g:5137:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_45);
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
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.ValuedObjectTestExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct3.g:5159:2: this_ValuedObjectReference_5= ruleValuedObjectReference
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
    // InternalSct3.g:5178:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // InternalSct3.g:5179:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // InternalSct3.g:5180:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
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
    // InternalSct3.g:5187:1: ruleValuedObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_subReference_2_0= ruleValuedObjectReference ) ) )? (otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']' )* ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_subReference_2_0 = null;

        EObject lv_indices_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:5190:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_subReference_2_0= ruleValuedObjectReference ) ) )? (otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']' )* ) )
            // InternalSct3.g:5191:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_subReference_2_0= ruleValuedObjectReference ) ) )? (otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']' )* )
            {
            // InternalSct3.g:5191:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_subReference_2_0= ruleValuedObjectReference ) ) )? (otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']' )* )
            // InternalSct3.g:5191:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_subReference_2_0= ruleValuedObjectReference ) ) )? (otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']' )*
            {
            // InternalSct3.g:5191:2: ( (otherlv_0= RULE_ID ) )
            // InternalSct3.g:5192:1: (otherlv_0= RULE_ID )
            {
            // InternalSct3.g:5192:1: (otherlv_0= RULE_ID )
            // InternalSct3.g:5193:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_91); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalSct3.g:5207:2: (otherlv_1= '.' ( (lv_subReference_2_0= ruleValuedObjectReference ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==56) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalSct3.g:5207:4: otherlv_1= '.' ( (lv_subReference_2_0= ruleValuedObjectReference ) )
                    {
                    otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_90); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getFullStopKeyword_1_0());
                          
                    }
                    // InternalSct3.g:5211:1: ( (lv_subReference_2_0= ruleValuedObjectReference ) )
                    // InternalSct3.g:5212:1: (lv_subReference_2_0= ruleValuedObjectReference )
                    {
                    // InternalSct3.g:5212:1: (lv_subReference_2_0= ruleValuedObjectReference )
                    // InternalSct3.g:5213:3: lv_subReference_2_0= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getSubReferenceValuedObjectReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_92);
                    lv_subReference_2_0=ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectReferenceRule());
                      	        }
                             		set(
                             			current, 
                             			"subReference",
                              		lv_subReference_2_0, 
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.ValuedObjectReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSct3.g:5229:4: (otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']' )*
            loop140:
            do {
                int alt140=2;
                int LA140_0 = input.LA(1);

                if ( (LA140_0==50) ) {
                    int LA140_2 = input.LA(2);

                    if ( (synpred158_InternalSct3()) ) {
                        alt140=1;
                    }


                }


                switch (alt140) {
            	case 1 :
            	    // InternalSct3.g:5229:6: otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']'
            	    {
            	    otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // InternalSct3.g:5233:1: ( (lv_indices_4_0= ruleExpression ) )
            	    // InternalSct3.g:5234:1: (lv_indices_4_0= ruleExpression )
            	    {
            	    // InternalSct3.g:5234:1: (lv_indices_4_0= ruleExpression )
            	    // InternalSct3.g:5235:3: lv_indices_4_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_66);
            	    lv_indices_4_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getValuedObjectReferenceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"indices",
            	              		lv_indices_4_0, 
            	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,51,FollowSets000.FOLLOW_92); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_2_2());
            	          
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
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalSct3.g:5263:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalSct3.g:5264:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalSct3.g:5265:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalSct3.g:5272:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) ;
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
            // InternalSct3.g:5275:28: ( (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) )
            // InternalSct3.g:5276:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            {
            // InternalSct3.g:5276:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            // InternalSct3.g:5276:3: otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>'
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0());
                  
            }
            // InternalSct3.g:5280:1: ( (lv_functionName_1_0= ruleExtendedID ) )
            // InternalSct3.g:5281:1: (lv_functionName_1_0= ruleExtendedID )
            {
            // InternalSct3.g:5281:1: (lv_functionName_1_0= ruleExtendedID )
            // InternalSct3.g:5282:3: lv_functionName_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_74);
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

            // InternalSct3.g:5298:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )?
            int alt142=3;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==39) ) {
                alt142=1;
            }
            else if ( (LA142_0==54) ) {
                alt142=2;
            }
            switch (alt142) {
                case 1 :
                    // InternalSct3.g:5298:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // InternalSct3.g:5298:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // InternalSct3.g:5298:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_75); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // InternalSct3.g:5302:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalSct3.g:5303:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalSct3.g:5303:1: (lv_parameters_3_0= ruleParameter )
                    // InternalSct3.g:5304:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_76);
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
                              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalSct3.g:5320:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop141:
                    do {
                        int alt141=2;
                        int LA141_0 = input.LA(1);

                        if ( (LA141_0==48) ) {
                            alt141=1;
                        }


                        switch (alt141) {
                    	case 1 :
                    	    // InternalSct3.g:5320:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,48,FollowSets000.FOLLOW_75); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // InternalSct3.g:5324:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalSct3.g:5325:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalSct3.g:5325:1: (lv_parameters_5_0= ruleParameter )
                    	    // InternalSct3.g:5326:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_76);
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
                    	              		"de.cau.cs.kieler.core.kexpressions.KExpressions.Parameter");
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

                    otherlv_6=(Token)match(input,40,FollowSets000.FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct3.g:5347:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,54,FollowSets000.FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct3.g:5363:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalSct3.g:5364:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalSct3.g:5365:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalSct3.g:5372:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_pureOutput_0_0=null;
        Token lv_callByReference_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:5375:28: ( ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalSct3.g:5376:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalSct3.g:5376:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalSct3.g:5376:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalSct3.g:5376:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==57) ) {
                int LA144_1 = input.LA(2);

                if ( (LA144_1==49) ) {
                    alt144=1;
                }
            }
            else if ( (LA144_0==49) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalSct3.g:5376:3: ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) )
                    {
                    // InternalSct3.g:5376:3: ( (lv_pureOutput_0_0= '!' ) )?
                    int alt143=2;
                    int LA143_0 = input.LA(1);

                    if ( (LA143_0==57) ) {
                        alt143=1;
                    }
                    switch (alt143) {
                        case 1 :
                            // InternalSct3.g:5377:1: (lv_pureOutput_0_0= '!' )
                            {
                            // InternalSct3.g:5377:1: (lv_pureOutput_0_0= '!' )
                            // InternalSct3.g:5378:3: lv_pureOutput_0_0= '!'
                            {
                            lv_pureOutput_0_0=(Token)match(input,57,FollowSets000.FOLLOW_93); if (state.failed) return current;
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

                    // InternalSct3.g:5391:3: ( (lv_callByReference_1_0= '&' ) )
                    // InternalSct3.g:5392:1: (lv_callByReference_1_0= '&' )
                    {
                    // InternalSct3.g:5392:1: (lv_callByReference_1_0= '&' )
                    // InternalSct3.g:5393:3: lv_callByReference_1_0= '&'
                    {
                    lv_callByReference_1_0=(Token)match(input,49,FollowSets000.FOLLOW_24); if (state.failed) return current;
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

            // InternalSct3.g:5406:4: ( (lv_expression_2_0= ruleExpression ) )
            // InternalSct3.g:5407:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalSct3.g:5407:1: (lv_expression_2_0= ruleExpression )
            // InternalSct3.g:5408:3: lv_expression_2_0= ruleExpression
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
                      		"de.cau.cs.kieler.core.kexpressions.KExpressions.Expression");
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
    // InternalSct3.g:5432:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // InternalSct3.g:5433:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalSct3.g:5434:2: iv_ruleTextExpression= ruleTextExpression EOF
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
    // InternalSct3.g:5441:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct3.g:5444:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // InternalSct3.g:5445:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // InternalSct3.g:5445:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // InternalSct3.g:5446:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // InternalSct3.g:5446:1: (lv_text_0_0= RULE_HOSTCODE )
            // InternalSct3.g:5447:3: lv_text_0_0= RULE_HOSTCODE
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
                      		"de.cau.cs.kieler.core.kexpressions.KExpressions.HOSTCODE");
              	    
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
    // InternalSct3.g:5471:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalSct3.g:5472:2: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalSct3.g:5473:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalSct3.g:5480:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct3.g:5483:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalSct3.g:5484:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalSct3.g:5484:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalSct3.g:5485:1: (lv_value_0_0= RULE_INT )
            {
            // InternalSct3.g:5485:1: (lv_value_0_0= RULE_INT )
            // InternalSct3.g:5486:3: lv_value_0_0= RULE_INT
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
    // InternalSct3.g:5510:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalSct3.g:5511:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalSct3.g:5512:2: iv_ruleFloatValue= ruleFloatValue EOF
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
    // InternalSct3.g:5519:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct3.g:5522:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalSct3.g:5523:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalSct3.g:5523:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalSct3.g:5524:1: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalSct3.g:5524:1: (lv_value_0_0= RULE_FLOAT )
            // InternalSct3.g:5525:3: lv_value_0_0= RULE_FLOAT
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
    // InternalSct3.g:5549:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // InternalSct3.g:5550:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalSct3.g:5551:2: iv_ruleBoolValue= ruleBoolValue EOF
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
    // InternalSct3.g:5558:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct3.g:5561:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalSct3.g:5562:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalSct3.g:5562:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalSct3.g:5563:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalSct3.g:5563:1: (lv_value_0_0= RULE_BOOLEAN )
            // InternalSct3.g:5564:3: lv_value_0_0= RULE_BOOLEAN
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
    // InternalSct3.g:5588:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalSct3.g:5589:2: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalSct3.g:5590:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalSct3.g:5597:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct3.g:5600:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalSct3.g:5601:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalSct3.g:5601:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSct3.g:5602:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalSct3.g:5602:1: (lv_value_0_0= RULE_STRING )
            // InternalSct3.g:5603:3: lv_value_0_0= RULE_STRING
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
    // InternalSct3.g:5629:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalSct3.g:5630:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalSct3.g:5631:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalSct3.g:5638:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyStringValueAnnotation_1 = null;

        EObject this_TypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:5641:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // InternalSct3.g:5642:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // InternalSct3.g:5642:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt145=4;
            alt145 = dfa145.predict(input);
            switch (alt145) {
                case 1 :
                    // InternalSct3.g:5643:2: this_CommentAnnotation_0= ruleCommentAnnotation
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
                    // InternalSct3.g:5656:2: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_KeyStringValueAnnotation_1=ruleKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyStringValueAnnotation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSct3.g:5669:2: this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypedKeyStringValueAnnotation_2=ruleTypedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypedKeyStringValueAnnotation_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalSct3.g:5682:2: this_TagAnnotation_3= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TagAnnotation_3=ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TagAnnotation_3; 
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


    // $ANTLR start "entryRuleRestrictedTypeAnnotation"
    // InternalSct3.g:5703:1: entryRuleRestrictedTypeAnnotation returns [EObject current=null] : iv_ruleRestrictedTypeAnnotation= ruleRestrictedTypeAnnotation EOF ;
    public final EObject entryRuleRestrictedTypeAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedTypeAnnotation = null;


        try {
            // InternalSct3.g:5704:2: (iv_ruleRestrictedTypeAnnotation= ruleRestrictedTypeAnnotation EOF )
            // InternalSct3.g:5705:2: iv_ruleRestrictedTypeAnnotation= ruleRestrictedTypeAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRestrictedTypeAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRestrictedTypeAnnotation=ruleRestrictedTypeAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRestrictedTypeAnnotation; 
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
    // $ANTLR end "entryRuleRestrictedTypeAnnotation"


    // $ANTLR start "ruleRestrictedTypeAnnotation"
    // InternalSct3.g:5712:1: ruleRestrictedTypeAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_RestrictedKeyStringValueAnnotation_1= ruleRestrictedKeyStringValueAnnotation | this_RestrictedTypedKeyStringValueAnnotation_2= ruleRestrictedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject ruleRestrictedTypeAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_RestrictedKeyStringValueAnnotation_1 = null;

        EObject this_RestrictedTypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:5715:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_RestrictedKeyStringValueAnnotation_1= ruleRestrictedKeyStringValueAnnotation | this_RestrictedTypedKeyStringValueAnnotation_2= ruleRestrictedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // InternalSct3.g:5716:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_RestrictedKeyStringValueAnnotation_1= ruleRestrictedKeyStringValueAnnotation | this_RestrictedTypedKeyStringValueAnnotation_2= ruleRestrictedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // InternalSct3.g:5716:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_RestrictedKeyStringValueAnnotation_1= ruleRestrictedKeyStringValueAnnotation | this_RestrictedTypedKeyStringValueAnnotation_2= ruleRestrictedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt146=4;
            alt146 = dfa146.predict(input);
            switch (alt146) {
                case 1 :
                    // InternalSct3.g:5717:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedTypeAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
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
                    // InternalSct3.g:5730:2: this_RestrictedKeyStringValueAnnotation_1= ruleRestrictedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedTypeAnnotationAccess().getRestrictedKeyStringValueAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RestrictedKeyStringValueAnnotation_1=ruleRestrictedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RestrictedKeyStringValueAnnotation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalSct3.g:5743:2: this_RestrictedTypedKeyStringValueAnnotation_2= ruleRestrictedTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedTypeAnnotationAccess().getRestrictedTypedKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RestrictedTypedKeyStringValueAnnotation_2=ruleRestrictedTypedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RestrictedTypedKeyStringValueAnnotation_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalSct3.g:5756:2: this_TagAnnotation_3= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRestrictedTypeAnnotationAccess().getTagAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TagAnnotation_3=ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TagAnnotation_3; 
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
    // $ANTLR end "ruleRestrictedTypeAnnotation"


    // $ANTLR start "entryRuleQuotedStringAnnotation"
    // InternalSct3.g:5775:1: entryRuleQuotedStringAnnotation returns [EObject current=null] : iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF ;
    public final EObject entryRuleQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedStringAnnotation = null;


        try {
            // InternalSct3.g:5776:2: (iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF )
            // InternalSct3.g:5777:2: iv_ruleQuotedStringAnnotation= ruleQuotedStringAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedStringAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQuotedStringAnnotation=ruleQuotedStringAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedStringAnnotation; 
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
    // $ANTLR end "entryRuleQuotedStringAnnotation"


    // $ANTLR start "ruleQuotedStringAnnotation"
    // InternalSct3.g:5784:1: ruleQuotedStringAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject ruleQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_QuotedKeyStringValueAnnotation_1 = null;

        EObject this_QuotedTypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:5787:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // InternalSct3.g:5788:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // InternalSct3.g:5788:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt147=4;
            alt147 = dfa147.predict(input);
            switch (alt147) {
                case 1 :
                    // InternalSct3.g:5789:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuotedStringAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
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
                    // InternalSct3.g:5802:2: this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuotedStringAnnotationAccess().getQuotedKeyStringValueAnnotationParserRuleCall_1()); 
                          
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
                    // InternalSct3.g:5815:2: this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuotedStringAnnotationAccess().getQuotedTypedKeyStringValueAnnotationParserRuleCall_2()); 
                          
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
                    // InternalSct3.g:5828:2: this_TagAnnotation_3= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuotedStringAnnotationAccess().getTagAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TagAnnotation_3=ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TagAnnotation_3; 
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
    // $ANTLR end "ruleQuotedStringAnnotation"


    // $ANTLR start "entryRuleCommentAnnotation"
    // InternalSct3.g:5847:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // InternalSct3.g:5848:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // InternalSct3.g:5849:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
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
    // InternalSct3.g:5856:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            // InternalSct3.g:5859:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // InternalSct3.g:5860:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // InternalSct3.g:5860:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // InternalSct3.g:5861:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // InternalSct3.g:5861:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // InternalSct3.g:5862:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
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
    // InternalSct3.g:5886:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // InternalSct3.g:5887:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // InternalSct3.g:5888:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
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
    // InternalSct3.g:5895:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:5898:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalSct3.g:5899:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalSct3.g:5899:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalSct3.g:5899:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct3.g:5903:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct3.g:5904:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct3.g:5904:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct3.g:5905:3: lv_name_1_0= ruleExtendedID
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
    // InternalSct3.g:5929:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // InternalSct3.g:5930:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // InternalSct3.g:5931:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
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
    // InternalSct3.g:5938:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:5941:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalSct3.g:5942:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalSct3.g:5942:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalSct3.g:5942:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct3.g:5946:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct3.g:5947:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct3.g:5947:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct3.g:5948:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_94);
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

            // InternalSct3.g:5964:2: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalSct3.g:5965:1: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalSct3.g:5965:1: (lv_values_2_0= ruleEStringAllTypes )
            // InternalSct3.g:5966:3: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_61);
            lv_values_2_0=ruleEStringAllTypes();

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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.EStringAllTypes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct3.g:5982:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop148:
            do {
                int alt148=2;
                int LA148_0 = input.LA(1);

                if ( (LA148_0==48) ) {
                    alt148=1;
                }


                switch (alt148) {
            	case 1 :
            	    // InternalSct3.g:5982:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,48,FollowSets000.FOLLOW_94); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalSct3.g:5986:1: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalSct3.g:5987:1: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalSct3.g:5987:1: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalSct3.g:5988:3: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_61);
            	    lv_values_4_0=ruleEStringAllTypes();

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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.EStringAllTypes");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop148;
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


    // $ANTLR start "entryRuleRestrictedKeyStringValueAnnotation"
    // InternalSct3.g:6012:1: entryRuleRestrictedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedKeyStringValueAnnotation = null;


        try {
            // InternalSct3.g:6013:2: (iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalSct3.g:6014:2: iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRestrictedKeyStringValueAnnotation=ruleRestrictedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRestrictedKeyStringValueAnnotation; 
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
    // $ANTLR end "entryRuleRestrictedKeyStringValueAnnotation"


    // $ANTLR start "ruleRestrictedKeyStringValueAnnotation"
    // InternalSct3.g:6021:1: ruleRestrictedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:6024:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) )
            // InternalSct3.g:6025:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            {
            // InternalSct3.g:6025:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            // InternalSct3.g:6025:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct3.g:6029:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct3.g:6030:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct3.g:6030:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct3.g:6031:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_95);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRestrictedKeyStringValueAnnotationRule());
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

            // InternalSct3.g:6047:2: ( (lv_values_2_0= ruleEStringBoolean ) )
            // InternalSct3.g:6048:1: (lv_values_2_0= ruleEStringBoolean )
            {
            // InternalSct3.g:6048:1: (lv_values_2_0= ruleEStringBoolean )
            // InternalSct3.g:6049:3: lv_values_2_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_61);
            lv_values_2_0=ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRestrictedKeyStringValueAnnotationRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.EStringBoolean");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct3.g:6065:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            loop149:
            do {
                int alt149=2;
                int LA149_0 = input.LA(1);

                if ( (LA149_0==48) ) {
                    alt149=1;
                }


                switch (alt149) {
            	case 1 :
            	    // InternalSct3.g:6065:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_3=(Token)match(input,48,FollowSets000.FOLLOW_95); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalSct3.g:6069:1: ( (lv_values_4_0= ruleEStringBoolean ) )
            	    // InternalSct3.g:6070:1: (lv_values_4_0= ruleEStringBoolean )
            	    {
            	    // InternalSct3.g:6070:1: (lv_values_4_0= ruleEStringBoolean )
            	    // InternalSct3.g:6071:3: lv_values_4_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_61);
            	    lv_values_4_0=ruleEStringBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRestrictedKeyStringValueAnnotationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.EStringBoolean");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop149;
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
    // $ANTLR end "ruleRestrictedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // InternalSct3.g:6095:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // InternalSct3.g:6096:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // InternalSct3.g:6097:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
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
    // InternalSct3.g:6104:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) ;
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
            // InternalSct3.g:6107:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) )
            // InternalSct3.g:6108:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalSct3.g:6108:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            // InternalSct3.g:6108:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct3.g:6112:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct3.g:6113:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct3.g:6113:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct3.g:6114:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_96);
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

            otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalSct3.g:6134:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalSct3.g:6135:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalSct3.g:6135:1: (lv_type_3_0= ruleExtendedID )
            // InternalSct3.g:6136:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_66);
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

            otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalSct3.g:6156:1: ( (lv_values_5_0= ruleEStringAllTypes ) )
            // InternalSct3.g:6157:1: (lv_values_5_0= ruleEStringAllTypes )
            {
            // InternalSct3.g:6157:1: (lv_values_5_0= ruleEStringAllTypes )
            // InternalSct3.g:6158:3: lv_values_5_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_61);
            lv_values_5_0=ruleEStringAllTypes();

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
                      		"de.cau.cs.kieler.core.annotations.text.Annotations.EStringAllTypes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalSct3.g:6174:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            loop150:
            do {
                int alt150=2;
                int LA150_0 = input.LA(1);

                if ( (LA150_0==48) ) {
                    alt150=1;
                }


                switch (alt150) {
            	case 1 :
            	    // InternalSct3.g:6174:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_6=(Token)match(input,48,FollowSets000.FOLLOW_94); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalSct3.g:6178:1: ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    // InternalSct3.g:6179:1: (lv_values_7_0= ruleEStringAllTypes )
            	    {
            	    // InternalSct3.g:6179:1: (lv_values_7_0= ruleEStringAllTypes )
            	    // InternalSct3.g:6180:3: lv_values_7_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_61);
            	    lv_values_7_0=ruleEStringAllTypes();

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
            	              		"de.cau.cs.kieler.core.annotations.text.Annotations.EStringAllTypes");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop150;
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


    // $ANTLR start "entryRuleRestrictedTypedKeyStringValueAnnotation"
    // InternalSct3.g:6204:1: entryRuleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedTypedKeyStringValueAnnotation = null;


        try {
            // InternalSct3.g:6205:2: (iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalSct3.g:6206:2: iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRestrictedTypedKeyStringValueAnnotation=ruleRestrictedTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRestrictedTypedKeyStringValueAnnotation; 
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
    // $ANTLR end "entryRuleRestrictedTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleRestrictedTypedKeyStringValueAnnotation"
    // InternalSct3.g:6213:1: ruleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
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
            // InternalSct3.g:6216:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) )
            // InternalSct3.g:6217:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            {
            // InternalSct3.g:6217:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            // InternalSct3.g:6217:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct3.g:6221:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct3.g:6222:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct3.g:6222:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct3.g:6223:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_96);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
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

            otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalSct3.g:6243:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalSct3.g:6244:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalSct3.g:6244:1: (lv_type_3_0= ruleExtendedID )
            // InternalSct3.g:6245:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_66);
            lv_type_3_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
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

            otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_95); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalSct3.g:6265:1: ( (lv_values_5_0= ruleEStringBoolean ) )
            // InternalSct3.g:6266:1: (lv_values_5_0= ruleEStringBoolean )
            {
            // InternalSct3.g:6266:1: (lv_values_5_0= ruleEStringBoolean )
            // InternalSct3.g:6267:3: lv_values_5_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_61);
            lv_values_5_0=ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
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

            // InternalSct3.g:6283:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            loop151:
            do {
                int alt151=2;
                int LA151_0 = input.LA(1);

                if ( (LA151_0==48) ) {
                    alt151=1;
                }


                switch (alt151) {
            	case 1 :
            	    // InternalSct3.g:6283:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,48,FollowSets000.FOLLOW_95); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalSct3.g:6287:1: ( (lv_values_7_0= ruleEStringBoolean ) )
            	    // InternalSct3.g:6288:1: (lv_values_7_0= ruleEStringBoolean )
            	    {
            	    // InternalSct3.g:6288:1: (lv_values_7_0= ruleEStringBoolean )
            	    // InternalSct3.g:6289:3: lv_values_7_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_61);
            	    lv_values_7_0=ruleEStringBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
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
            	    break loop151;
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
    // $ANTLR end "ruleRestrictedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // InternalSct3.g:6313:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            // InternalSct3.g:6314:2: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // InternalSct3.g:6315:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalSct3.g:6322:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:6325:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // InternalSct3.g:6326:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // InternalSct3.g:6326:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // InternalSct3.g:6326:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct3.g:6330:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct3.g:6331:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct3.g:6331:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct3.g:6332:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_28);
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

            // InternalSct3.g:6348:2: ( (lv_values_2_0= RULE_STRING ) )
            // InternalSct3.g:6349:1: (lv_values_2_0= RULE_STRING )
            {
            // InternalSct3.g:6349:1: (lv_values_2_0= RULE_STRING )
            // InternalSct3.g:6350:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_61); if (state.failed) return current;
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

            // InternalSct3.g:6366:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop152:
            do {
                int alt152=2;
                int LA152_0 = input.LA(1);

                if ( (LA152_0==48) ) {
                    alt152=1;
                }


                switch (alt152) {
            	case 1 :
            	    // InternalSct3.g:6366:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,48,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalSct3.g:6370:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalSct3.g:6371:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalSct3.g:6371:1: (lv_values_4_0= RULE_STRING )
            	    // InternalSct3.g:6372:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_61); if (state.failed) return current;
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
            	    break loop152;
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
    // InternalSct3.g:6396:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            // InternalSct3.g:6397:2: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalSct3.g:6398:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalSct3.g:6405:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
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
            // InternalSct3.g:6408:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // InternalSct3.g:6409:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // InternalSct3.g:6409:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // InternalSct3.g:6409:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalSct3.g:6413:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalSct3.g:6414:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalSct3.g:6414:1: (lv_name_1_0= ruleExtendedID )
            // InternalSct3.g:6415:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_96);
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

            otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalSct3.g:6435:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalSct3.g:6436:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalSct3.g:6436:1: (lv_type_3_0= ruleExtendedID )
            // InternalSct3.g:6437:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_66);
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

            otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalSct3.g:6457:1: ( (lv_values_5_0= RULE_STRING ) )
            // InternalSct3.g:6458:1: (lv_values_5_0= RULE_STRING )
            {
            // InternalSct3.g:6458:1: (lv_values_5_0= RULE_STRING )
            // InternalSct3.g:6459:3: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_61); if (state.failed) return current;
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

            // InternalSct3.g:6475:2: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop153:
            do {
                int alt153=2;
                int LA153_0 = input.LA(1);

                if ( (LA153_0==48) ) {
                    alt153=1;
                }


                switch (alt153) {
            	case 1 :
            	    // InternalSct3.g:6475:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,48,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalSct3.g:6479:1: ( (lv_values_7_0= RULE_STRING ) )
            	    // InternalSct3.g:6480:1: (lv_values_7_0= RULE_STRING )
            	    {
            	    // InternalSct3.g:6480:1: (lv_values_7_0= RULE_STRING )
            	    // InternalSct3.g:6481:3: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_61); if (state.failed) return current;
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
            	    break loop153;
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


    // $ANTLR start "entryRuleEStringBoolean"
    // InternalSct3.g:6507:1: entryRuleEStringBoolean returns [String current=null] : iv_ruleEStringBoolean= ruleEStringBoolean EOF ;
    public final String entryRuleEStringBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringBoolean = null;


        try {
            // InternalSct3.g:6508:2: (iv_ruleEStringBoolean= ruleEStringBoolean EOF )
            // InternalSct3.g:6509:2: iv_ruleEStringBoolean= ruleEStringBoolean EOF
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
    // InternalSct3.g:6516:1: ruleEStringBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleEStringBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:6519:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) )
            // InternalSct3.g:6520:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            {
            // InternalSct3.g:6520:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            int alt154=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt154=1;
                }
                break;
            case RULE_ID:
                {
                alt154=2;
                }
                break;
            case RULE_BOOLEAN:
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
                    // InternalSct3.g:6520:6: this_STRING_0= RULE_STRING
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
                    // InternalSct3.g:6529:5: this_ExtendedID_1= ruleExtendedID
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
                    // InternalSct3.g:6540:10: this_BOOLEAN_2= RULE_BOOLEAN
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


    // $ANTLR start "entryRuleEStringAllTypes"
    // InternalSct3.g:6555:1: entryRuleEStringAllTypes returns [String current=null] : iv_ruleEStringAllTypes= ruleEStringAllTypes EOF ;
    public final String entryRuleEStringAllTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringAllTypes = null;


        try {
            // InternalSct3.g:6556:2: (iv_ruleEStringAllTypes= ruleEStringAllTypes EOF )
            // InternalSct3.g:6557:2: iv_ruleEStringAllTypes= ruleEStringAllTypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringAllTypesRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEStringAllTypes=ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEStringAllTypes.getText(); 
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
    // $ANTLR end "entryRuleEStringAllTypes"


    // $ANTLR start "ruleEStringAllTypes"
    // InternalSct3.g:6564:1: ruleEStringAllTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) ;
    public final AntlrDatatypeRuleToken ruleEStringAllTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;

        AntlrDatatypeRuleToken this_Integer_3 = null;

        AntlrDatatypeRuleToken this_Floateger_4 = null;


         enterRule(); 
            
        try {
            // InternalSct3.g:6567:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) )
            // InternalSct3.g:6568:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            {
            // InternalSct3.g:6568:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            int alt155=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt155=1;
                }
                break;
            case RULE_ID:
                {
                alt155=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt155=3;
                }
                break;
            case 60:
                {
                int LA155_4 = input.LA(2);

                if ( (LA155_4==RULE_FLOAT) ) {
                    alt155=5;
                }
                else if ( (LA155_4==RULE_INT) ) {
                    alt155=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 155, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt155=4;
                }
                break;
            case RULE_FLOAT:
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
                    // InternalSct3.g:6568:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAllTypesAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalSct3.g:6577:5: this_ExtendedID_1= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAllTypesAccess().getExtendedIDParserRuleCall_1()); 
                          
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
                    // InternalSct3.g:6588:10: this_BOOLEAN_2= RULE_BOOLEAN
                    {
                    this_BOOLEAN_2=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_2, grammarAccess.getEStringAllTypesAccess().getBOOLEANTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalSct3.g:6597:5: this_Integer_3= ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAllTypesAccess().getIntegerParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Integer_3=ruleInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Integer_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalSct3.g:6609:5: this_Floateger_4= ruleFloateger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEStringAllTypesAccess().getFloategerParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Floateger_4=ruleFloateger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Floateger_4);
                          
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
    // $ANTLR end "ruleEStringAllTypes"


    // $ANTLR start "entryRuleExtendedID"
    // InternalSct3.g:6627:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // InternalSct3.g:6628:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // InternalSct3.g:6629:2: iv_ruleExtendedID= ruleExtendedID EOF
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
    // InternalSct3.g:6636:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // InternalSct3.g:6639:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) )
            // InternalSct3.g:6640:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            {
            // InternalSct3.g:6640:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            // InternalSct3.g:6640:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_97); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalSct3.g:6647:1: (kw= '.' this_ID_2= RULE_ID )*
            loop156:
            do {
                int alt156=2;
                int LA156_0 = input.LA(1);

                if ( (LA156_0==56) ) {
                    alt156=1;
                }


                switch (alt156) {
            	case 1 :
            	    // InternalSct3.g:6648:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,56,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_97); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop156;
                }
            } while (true);

            // InternalSct3.g:6660:3: (kw= '#' this_INT_4= RULE_INT )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==59) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // InternalSct3.g:6661:2: kw= '#' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,59,FollowSets000.FOLLOW_65); if (state.failed) return current;
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
    // InternalSct3.g:6683:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalSct3.g:6684:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalSct3.g:6685:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalSct3.g:6692:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalSct3.g:6695:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSct3.g:6696:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSct3.g:6696:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSct3.g:6696:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSct3.g:6696:2: (kw= '-' )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==60) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // InternalSct3.g:6697:2: kw= '-'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_65); if (state.failed) return current;
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
    // InternalSct3.g:6717:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // InternalSct3.g:6718:2: (iv_ruleFloateger= ruleFloateger EOF )
            // InternalSct3.g:6719:2: iv_ruleFloateger= ruleFloateger EOF
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
    // InternalSct3.g:6726:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            // InternalSct3.g:6729:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // InternalSct3.g:6730:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // InternalSct3.g:6730:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // InternalSct3.g:6730:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // InternalSct3.g:6730:2: (kw= '-' )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==60) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // InternalSct3.g:6731:2: kw= '-'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_98); if (state.failed) return current;
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


    // $ANTLR start "ruleTransitionType"
    // InternalSct3.g:6751:1: ruleTransitionType returns [Enumerator current=null] : ( (enumLiteral_0= '--' ) | (enumLiteral_1= '-- abort' ) | (enumLiteral_2= '-- join' ) ) ;
    public final Enumerator ruleTransitionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSct3.g:6753:28: ( ( (enumLiteral_0= '--' ) | (enumLiteral_1= '-- abort' ) | (enumLiteral_2= '-- join' ) ) )
            // InternalSct3.g:6754:1: ( (enumLiteral_0= '--' ) | (enumLiteral_1= '-- abort' ) | (enumLiteral_2= '-- join' ) )
            {
            // InternalSct3.g:6754:1: ( (enumLiteral_0= '--' ) | (enumLiteral_1= '-- abort' ) | (enumLiteral_2= '-- join' ) )
            int alt160=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt160=1;
                }
                break;
            case 62:
                {
                alt160=2;
                }
                break;
            case 63:
                {
                alt160=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 160, 0, input);

                throw nvae;
            }

            switch (alt160) {
                case 1 :
                    // InternalSct3.g:6754:2: (enumLiteral_0= '--' )
                    {
                    // InternalSct3.g:6754:2: (enumLiteral_0= '--' )
                    // InternalSct3.g:6754:4: enumLiteral_0= '--'
                    {
                    enumLiteral_0=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct3.g:6760:6: (enumLiteral_1= '-- abort' )
                    {
                    // InternalSct3.g:6760:6: (enumLiteral_1= '-- abort' )
                    // InternalSct3.g:6760:8: enumLiteral_1= '-- abort'
                    {
                    enumLiteral_1=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSct3.g:6766:6: (enumLiteral_2= '-- join' )
                    {
                    // InternalSct3.g:6766:6: (enumLiteral_2= '-- join' )
                    // InternalSct3.g:6766:8: enumLiteral_2= '-- join'
                    {
                    enumLiteral_2=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleHistoryType"
    // InternalSct3.g:6776:1: ruleHistoryType returns [Enumerator current=null] : ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) ) ;
    public final Enumerator ruleHistoryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSct3.g:6778:28: ( ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) ) )
            // InternalSct3.g:6779:1: ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) )
            {
            // InternalSct3.g:6779:1: ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) )
            int alt161=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt161=1;
                }
                break;
            case 65:
                {
                alt161=2;
                }
                break;
            case 66:
                {
                alt161=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 161, 0, input);

                throw nvae;
            }

            switch (alt161) {
                case 1 :
                    // InternalSct3.g:6779:2: (enumLiteral_0= 'reset' )
                    {
                    // InternalSct3.g:6779:2: (enumLiteral_0= 'reset' )
                    // InternalSct3.g:6779:4: enumLiteral_0= 'reset'
                    {
                    enumLiteral_0=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHistoryTypeAccess().getRESETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getHistoryTypeAccess().getRESETEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct3.g:6785:6: (enumLiteral_1= 'shallow history' )
                    {
                    // InternalSct3.g:6785:6: (enumLiteral_1= 'shallow history' )
                    // InternalSct3.g:6785:8: enumLiteral_1= 'shallow history'
                    {
                    enumLiteral_1=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHistoryTypeAccess().getSHALLOWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getHistoryTypeAccess().getSHALLOWEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSct3.g:6791:6: (enumLiteral_2= 'history' )
                    {
                    // InternalSct3.g:6791:6: (enumLiteral_2= 'history' )
                    // InternalSct3.g:6791:8: enumLiteral_2= 'history'
                    {
                    enumLiteral_2=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct3.g:6801:1: ruleAssignOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) ) ;
    public final Enumerator ruleAssignOperator() throws RecognitionException {
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

         enterRule(); 
        try {
            // InternalSct3.g:6803:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) ) )
            // InternalSct3.g:6804:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) )
            {
            // InternalSct3.g:6804:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '-=' ) | (enumLiteral_3= '*=' ) | (enumLiteral_4= '/=' ) | (enumLiteral_5= '%=' ) | (enumLiteral_6= '&=' ) | (enumLiteral_7= '|=' ) | (enumLiteral_8= '^=' ) )
            int alt162=9;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt162=1;
                }
                break;
            case 67:
                {
                alt162=2;
                }
                break;
            case 68:
                {
                alt162=3;
                }
                break;
            case 69:
                {
                alt162=4;
                }
                break;
            case 70:
                {
                alt162=5;
                }
                break;
            case 71:
                {
                alt162=6;
                }
                break;
            case 72:
                {
                alt162=7;
                }
                break;
            case 73:
                {
                alt162=8;
                }
                break;
            case 74:
                {
                alt162=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 162, 0, input);

                throw nvae;
            }

            switch (alt162) {
                case 1 :
                    // InternalSct3.g:6804:2: (enumLiteral_0= '=' )
                    {
                    // InternalSct3.g:6804:2: (enumLiteral_0= '=' )
                    // InternalSct3.g:6804:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct3.g:6810:6: (enumLiteral_1= '+=' )
                    {
                    // InternalSct3.g:6810:6: (enumLiteral_1= '+=' )
                    // InternalSct3.g:6810:8: enumLiteral_1= '+='
                    {
                    enumLiteral_1=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssignOperatorAccess().getASSIGNADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSct3.g:6816:6: (enumLiteral_2= '-=' )
                    {
                    // InternalSct3.g:6816:6: (enumLiteral_2= '-=' )
                    // InternalSct3.g:6816:8: enumLiteral_2= '-='
                    {
                    enumLiteral_2=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssignOperatorAccess().getASSIGNSUBEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSct3.g:6822:6: (enumLiteral_3= '*=' )
                    {
                    // InternalSct3.g:6822:6: (enumLiteral_3= '*=' )
                    // InternalSct3.g:6822:8: enumLiteral_3= '*='
                    {
                    enumLiteral_3=(Token)match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssignOperatorAccess().getASSIGNMULEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSct3.g:6828:6: (enumLiteral_4= '/=' )
                    {
                    // InternalSct3.g:6828:6: (enumLiteral_4= '/=' )
                    // InternalSct3.g:6828:8: enumLiteral_4= '/='
                    {
                    enumLiteral_4=(Token)match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAssignOperatorAccess().getASSIGNDIVEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSct3.g:6834:6: (enumLiteral_5= '%=' )
                    {
                    // InternalSct3.g:6834:6: (enumLiteral_5= '%=' )
                    // InternalSct3.g:6834:8: enumLiteral_5= '%='
                    {
                    enumLiteral_5=(Token)match(input,71,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNMODEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAssignOperatorAccess().getASSIGNMODEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSct3.g:6840:6: (enumLiteral_6= '&=' )
                    {
                    // InternalSct3.g:6840:6: (enumLiteral_6= '&=' )
                    // InternalSct3.g:6840:8: enumLiteral_6= '&='
                    {
                    enumLiteral_6=(Token)match(input,72,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAssignOperatorAccess().getASSIGNANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalSct3.g:6846:6: (enumLiteral_7= '|=' )
                    {
                    // InternalSct3.g:6846:6: (enumLiteral_7= '|=' )
                    // InternalSct3.g:6846:8: enumLiteral_7= '|='
                    {
                    enumLiteral_7=(Token)match(input,73,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNOREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAssignOperatorAccess().getASSIGNOREnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalSct3.g:6852:6: (enumLiteral_8= '^=' )
                    {
                    // InternalSct3.g:6852:6: (enumLiteral_8= '^=' )
                    // InternalSct3.g:6852:8: enumLiteral_8= '^='
                    {
                    enumLiteral_8=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssignOperatorAccess().getASSIGNXOREnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAssignOperatorAccess().getASSIGNXOREnumLiteralDeclaration_8()); 
                          
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
    // InternalSct3.g:6862:1: rulePostfixOperator returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator rulePostfixOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalSct3.g:6864:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalSct3.g:6865:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalSct3.g:6865:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==75) ) {
                alt163=1;
            }
            else if ( (LA163_0==61) ) {
                alt163=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 163, 0, input);

                throw nvae;
            }
            switch (alt163) {
                case 1 :
                    // InternalSct3.g:6865:2: (enumLiteral_0= '++' )
                    {
                    // InternalSct3.g:6865:2: (enumLiteral_0= '++' )
                    // InternalSct3.g:6865:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPostfixOperatorAccess().getPOSTFIXADDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct3.g:6871:6: (enumLiteral_1= '--' )
                    {
                    // InternalSct3.g:6871:6: (enumLiteral_1= '--' )
                    // InternalSct3.g:6871:8: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct3.g:6881:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
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
            // InternalSct3.g:6883:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalSct3.g:6884:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalSct3.g:6884:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt164=6;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt164=1;
                }
                break;
            case 53:
                {
                alt164=2;
                }
                break;
            case 77:
                {
                alt164=3;
                }
                break;
            case 55:
                {
                alt164=4;
                }
                break;
            case 78:
                {
                alt164=5;
                }
                break;
            case 79:
                {
                alt164=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 164, 0, input);

                throw nvae;
            }

            switch (alt164) {
                case 1 :
                    // InternalSct3.g:6884:2: (enumLiteral_0= '==' )
                    {
                    // InternalSct3.g:6884:2: (enumLiteral_0= '==' )
                    // InternalSct3.g:6884:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct3.g:6890:6: (enumLiteral_1= '<' )
                    {
                    // InternalSct3.g:6890:6: (enumLiteral_1= '<' )
                    // InternalSct3.g:6890:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSct3.g:6896:6: (enumLiteral_2= '<=' )
                    {
                    // InternalSct3.g:6896:6: (enumLiteral_2= '<=' )
                    // InternalSct3.g:6896:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,77,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSct3.g:6902:6: (enumLiteral_3= '>' )
                    {
                    // InternalSct3.g:6902:6: (enumLiteral_3= '>' )
                    // InternalSct3.g:6902:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSct3.g:6908:6: (enumLiteral_4= '>=' )
                    {
                    // InternalSct3.g:6908:6: (enumLiteral_4= '>=' )
                    // InternalSct3.g:6908:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,78,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSct3.g:6914:6: (enumLiteral_5= '!=' )
                    {
                    // InternalSct3.g:6914:6: (enumLiteral_5= '!=' )
                    // InternalSct3.g:6914:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,79,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct3.g:6924:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct3.g:6926:28: ( (enumLiteral_0= 'pre' ) )
            // InternalSct3.g:6927:1: (enumLiteral_0= 'pre' )
            {
            // InternalSct3.g:6927:1: (enumLiteral_0= 'pre' )
            // InternalSct3.g:6927:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,80,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct3.g:6937:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct3.g:6939:28: ( (enumLiteral_0= '|' ) )
            // InternalSct3.g:6940:1: (enumLiteral_0= '|' )
            {
            // InternalSct3.g:6940:1: (enumLiteral_0= '|' )
            // InternalSct3.g:6940:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,81,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct3.g:6950:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct3.g:6952:28: ( (enumLiteral_0= '&' ) )
            // InternalSct3.g:6953:1: (enumLiteral_0= '&' )
            {
            // InternalSct3.g:6953:1: (enumLiteral_0= '&' )
            // InternalSct3.g:6953:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct3.g:6963:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct3.g:6965:28: ( (enumLiteral_0= '!' ) )
            // InternalSct3.g:6966:1: (enumLiteral_0= '!' )
            {
            // InternalSct3.g:6966:1: (enumLiteral_0= '!' )
            // InternalSct3.g:6966:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct3.g:6976:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct3.g:6978:28: ( (enumLiteral_0= '+' ) )
            // InternalSct3.g:6979:1: (enumLiteral_0= '+' )
            {
            // InternalSct3.g:6979:1: (enumLiteral_0= '+' )
            // InternalSct3.g:6979:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,82,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct3.g:6989:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct3.g:6991:28: ( (enumLiteral_0= '-' ) )
            // InternalSct3.g:6992:1: (enumLiteral_0= '-' )
            {
            // InternalSct3.g:6992:1: (enumLiteral_0= '-' )
            // InternalSct3.g:6992:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct3.g:7002:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct3.g:7004:28: ( (enumLiteral_0= '*' ) )
            // InternalSct3.g:7005:1: (enumLiteral_0= '*' )
            {
            // InternalSct3.g:7005:1: (enumLiteral_0= '*' )
            // InternalSct3.g:7005:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,83,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct3.g:7015:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct3.g:7017:28: ( (enumLiteral_0= '%' ) )
            // InternalSct3.g:7018:1: (enumLiteral_0= '%' )
            {
            // InternalSct3.g:7018:1: (enumLiteral_0= '%' )
            // InternalSct3.g:7018:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,84,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleDivOperator"
    // InternalSct3.g:7028:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct3.g:7030:28: ( (enumLiteral_0= '/' ) )
            // InternalSct3.g:7031:1: (enumLiteral_0= '/' )
            {
            // InternalSct3.g:7031:1: (enumLiteral_0= '/' )
            // InternalSct3.g:7031:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,85,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleValOperator"
    // InternalSct3.g:7041:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct3.g:7043:28: ( (enumLiteral_0= 'val' ) )
            // InternalSct3.g:7044:1: (enumLiteral_0= 'val' )
            {
            // InternalSct3.g:7044:1: (enumLiteral_0= 'val' )
            // InternalSct3.g:7044:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,86,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct3.g:7054:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct3.g:7056:28: ( (enumLiteral_0= '||' ) )
            // InternalSct3.g:7057:1: (enumLiteral_0= '||' )
            {
            // InternalSct3.g:7057:1: (enumLiteral_0= '||' )
            // InternalSct3.g:7057:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,87,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct3.g:7067:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalSct3.g:7069:28: ( (enumLiteral_0= '&&' ) )
            // InternalSct3.g:7070:1: (enumLiteral_0= '&&' )
            {
            // InternalSct3.g:7070:1: (enumLiteral_0= '&&' )
            // InternalSct3.g:7070:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,88,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct3.g:7084:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) ;
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
            // InternalSct3.g:7086:28: ( ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) )
            // InternalSct3.g:7087:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            {
            // InternalSct3.g:7087:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            int alt165=7;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt165=1;
                }
                break;
            case 90:
                {
                alt165=2;
                }
                break;
            case 91:
                {
                alt165=3;
                }
                break;
            case 92:
                {
                alt165=4;
                }
                break;
            case 93:
                {
                alt165=5;
                }
                break;
            case 94:
                {
                alt165=6;
                }
                break;
            case 95:
                {
                alt165=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 165, 0, input);

                throw nvae;
            }

            switch (alt165) {
                case 1 :
                    // InternalSct3.g:7087:2: (enumLiteral_0= 'pure' )
                    {
                    // InternalSct3.g:7087:2: (enumLiteral_0= 'pure' )
                    // InternalSct3.g:7087:4: enumLiteral_0= 'pure'
                    {
                    enumLiteral_0=(Token)match(input,89,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct3.g:7093:6: (enumLiteral_1= 'bool' )
                    {
                    // InternalSct3.g:7093:6: (enumLiteral_1= 'bool' )
                    // InternalSct3.g:7093:8: enumLiteral_1= 'bool'
                    {
                    enumLiteral_1=(Token)match(input,90,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSct3.g:7099:6: (enumLiteral_2= 'unsigned' )
                    {
                    // InternalSct3.g:7099:6: (enumLiteral_2= 'unsigned' )
                    // InternalSct3.g:7099:8: enumLiteral_2= 'unsigned'
                    {
                    enumLiteral_2=(Token)match(input,91,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSct3.g:7105:6: (enumLiteral_3= 'int' )
                    {
                    // InternalSct3.g:7105:6: (enumLiteral_3= 'int' )
                    // InternalSct3.g:7105:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,92,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSct3.g:7111:6: (enumLiteral_4= 'float' )
                    {
                    // InternalSct3.g:7111:6: (enumLiteral_4= 'float' )
                    // InternalSct3.g:7111:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,93,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSct3.g:7117:6: (enumLiteral_5= 'string' )
                    {
                    // InternalSct3.g:7117:6: (enumLiteral_5= 'string' )
                    // InternalSct3.g:7117:8: enumLiteral_5= 'string'
                    {
                    enumLiteral_5=(Token)match(input,94,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSct3.g:7123:6: (enumLiteral_6= 'host' )
                    {
                    // InternalSct3.g:7123:6: (enumLiteral_6= 'host' )
                    // InternalSct3.g:7123:8: enumLiteral_6= 'host'
                    {
                    enumLiteral_6=(Token)match(input,95,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSct3.g:7135:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) ;
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
            // InternalSct3.g:7137:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) )
            // InternalSct3.g:7138:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            {
            // InternalSct3.g:7138:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            int alt166=8;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt166=1;
                }
                break;
            case 82:
                {
                alt166=2;
                }
                break;
            case 83:
                {
                alt166=3;
                }
                break;
            case 97:
                {
                alt166=4;
                }
                break;
            case 98:
                {
                alt166=5;
                }
                break;
            case 81:
                {
                alt166=6;
                }
                break;
            case 49:
                {
                alt166=7;
                }
                break;
            case 95:
                {
                alt166=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 166, 0, input);

                throw nvae;
            }

            switch (alt166) {
                case 1 :
                    // InternalSct3.g:7138:2: (enumLiteral_0= 'none' )
                    {
                    // InternalSct3.g:7138:2: (enumLiteral_0= 'none' )
                    // InternalSct3.g:7138:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,96,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSct3.g:7144:6: (enumLiteral_1= '+' )
                    {
                    // InternalSct3.g:7144:6: (enumLiteral_1= '+' )
                    // InternalSct3.g:7144:8: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,82,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSct3.g:7150:6: (enumLiteral_2= '*' )
                    {
                    // InternalSct3.g:7150:6: (enumLiteral_2= '*' )
                    // InternalSct3.g:7150:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,83,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSct3.g:7156:6: (enumLiteral_3= 'max' )
                    {
                    // InternalSct3.g:7156:6: (enumLiteral_3= 'max' )
                    // InternalSct3.g:7156:8: enumLiteral_3= 'max'
                    {
                    enumLiteral_3=(Token)match(input,97,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSct3.g:7162:6: (enumLiteral_4= 'min' )
                    {
                    // InternalSct3.g:7162:6: (enumLiteral_4= 'min' )
                    // InternalSct3.g:7162:8: enumLiteral_4= 'min'
                    {
                    enumLiteral_4=(Token)match(input,98,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSct3.g:7168:6: (enumLiteral_5= '|' )
                    {
                    // InternalSct3.g:7168:6: (enumLiteral_5= '|' )
                    // InternalSct3.g:7168:8: enumLiteral_5= '|'
                    {
                    enumLiteral_5=(Token)match(input,81,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSct3.g:7174:6: (enumLiteral_6= '&' )
                    {
                    // InternalSct3.g:7174:6: (enumLiteral_6= '&' )
                    // InternalSct3.g:7174:8: enumLiteral_6= '&'
                    {
                    enumLiteral_6=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalSct3.g:7180:6: (enumLiteral_7= 'host' )
                    {
                    // InternalSct3.g:7180:6: (enumLiteral_7= 'host' )
                    // InternalSct3.g:7180:8: enumLiteral_7= 'host'
                    {
                    enumLiteral_7=(Token)match(input,95,FollowSets000.FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred5_InternalSct3
    public final void synpred5_InternalSct3_fragment() throws RecognitionException {   
        EObject lv_localActions_6_0 = null;


        // InternalSct3.g:207:1: ( (lv_localActions_6_0= ruleLocalAction ) )
        // InternalSct3.g:207:1: (lv_localActions_6_0= ruleLocalAction )
        {
        // InternalSct3.g:207:1: (lv_localActions_6_0= ruleLocalAction )
        // InternalSct3.g:208:3: lv_localActions_6_0= ruleLocalAction
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getRootStateAccess().getLocalActionsLocalActionParserRuleCall_6_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_localActions_6_0=ruleLocalAction();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalSct3

    // $ANTLR start synpred15_InternalSct3
    public final void synpred15_InternalSct3_fragment() throws RecognitionException {   
        EObject lv_localActions_9_0 = null;


        // InternalSct3.g:431:1: ( (lv_localActions_9_0= ruleLocalAction ) )
        // InternalSct3.g:431:1: (lv_localActions_9_0= ruleLocalAction )
        {
        // InternalSct3.g:431:1: (lv_localActions_9_0= ruleLocalAction )
        // InternalSct3.g:432:3: lv_localActions_9_0= ruleLocalAction
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStateAccess().getLocalActionsLocalActionParserRuleCall_7_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_localActions_9_0=ruleLocalAction();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalSct3

    // $ANTLR start synpred25_InternalSct3
    public final void synpred25_InternalSct3_fragment() throws RecognitionException {   
        Token lv_delay_7_0=null;

        // InternalSct3.g:652:1: ( (lv_delay_7_0= RULE_INT ) )
        // InternalSct3.g:652:1: (lv_delay_7_0= RULE_INT )
        {
        // InternalSct3.g:652:1: (lv_delay_7_0= RULE_INT )
        // InternalSct3.g:653:3: lv_delay_7_0= RULE_INT
        {
        lv_delay_7_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalSct3

    // $ANTLR start synpred29_InternalSct3
    public final void synpred29_InternalSct3_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        Token lv_delay_7_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_trigger_8_0 = null;

        EObject lv_effects_10_0 = null;

        EObject lv_effects_12_0 = null;


        // InternalSct3.g:647:4: ( ( (otherlv_6= 'if' ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) ) )? (otherlv_9= 'then' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) )
        // InternalSct3.g:647:4: ( (otherlv_6= 'if' ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) ) )? (otherlv_9= 'then' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? )
        {
        // InternalSct3.g:647:4: ( (otherlv_6= 'if' ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) ) )? (otherlv_9= 'then' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? )
        // InternalSct3.g:647:5: (otherlv_6= 'if' ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) ) )? (otherlv_9= 'then' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )?
        {
        // InternalSct3.g:647:5: (otherlv_6= 'if' ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) ) )?
        int alt174=2;
        int LA174_0 = input.LA(1);

        if ( (LA174_0==25) ) {
            alt174=1;
        }
        switch (alt174) {
            case 1 :
                // InternalSct3.g:647:7: otherlv_6= 'if' ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )
                {
                otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_24); if (state.failed) return ;
                // InternalSct3.g:651:1: ( (lv_delay_7_0= RULE_INT ) )?
                int alt173=2;
                alt173 = dfa173.predict(input);
                switch (alt173) {
                    case 1 :
                        // InternalSct3.g:652:1: (lv_delay_7_0= RULE_INT )
                        {
                        // InternalSct3.g:652:1: (lv_delay_7_0= RULE_INT )
                        // InternalSct3.g:653:3: lv_delay_7_0= RULE_INT
                        {
                        lv_delay_7_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_24); if (state.failed) return ;

                        }


                        }
                        break;

                }

                // InternalSct3.g:669:3: ( (lv_trigger_8_0= ruleBoolExpression ) )
                // InternalSct3.g:670:1: (lv_trigger_8_0= ruleBoolExpression )
                {
                // InternalSct3.g:670:1: (lv_trigger_8_0= ruleBoolExpression )
                // InternalSct3.g:671:3: lv_trigger_8_0= ruleBoolExpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getTransitionAccess().getTriggerBoolExpressionParserRuleCall_6_0_0_2_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_25);
                lv_trigger_8_0=ruleBoolExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalSct3.g:687:4: (otherlv_9= 'then' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )?
        int alt176=2;
        int LA176_0 = input.LA(1);

        if ( (LA176_0==26) ) {
            alt176=1;
        }
        switch (alt176) {
            case 1 :
                // InternalSct3.g:687:6: otherlv_9= 'then' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )*
                {
                otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_26); if (state.failed) return ;
                // InternalSct3.g:691:1: ( (lv_effects_10_0= ruleEffect ) )
                // InternalSct3.g:692:1: (lv_effects_10_0= ruleEffect )
                {
                // InternalSct3.g:692:1: (lv_effects_10_0= ruleEffect )
                // InternalSct3.g:693:3: lv_effects_10_0= ruleEffect
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_6_0_1_1_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_27);
                lv_effects_10_0=ruleEffect();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalSct3.g:709:2: (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )*
                loop175:
                do {
                    int alt175=2;
                    int LA175_0 = input.LA(1);

                    if ( (LA175_0==27) ) {
                        alt175=1;
                    }


                    switch (alt175) {
                	case 1 :
                	    // InternalSct3.g:709:4: otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) )
                	    {
                	    otherlv_11=(Token)match(input,27,FollowSets000.FOLLOW_26); if (state.failed) return ;
                	    // InternalSct3.g:713:1: ( (lv_effects_12_0= ruleEffect ) )
                	    // InternalSct3.g:714:1: (lv_effects_12_0= ruleEffect )
                	    {
                	    // InternalSct3.g:714:1: (lv_effects_12_0= ruleEffect )
                	    // InternalSct3.g:715:3: lv_effects_12_0= ruleEffect
                	    {
                	    if ( state.backtracking==0 ) {
                	       
                	      	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_6_0_1_2_1_0()); 
                	      	    
                	    }
                	    pushFollow(FollowSets000.FOLLOW_27);
                	    lv_effects_12_0=ruleEffect();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop175;
                    }
                } while (true);


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred29_InternalSct3

    // $ANTLR start synpred30_InternalSct3
    public final void synpred30_InternalSct3_fragment() throws RecognitionException {   
        Token otherlv_13=null;
        Token lv_label_14_0=null;

        // InternalSct3.g:732:6: ( (otherlv_13= 'if' ( (lv_label_14_0= RULE_STRING ) ) ) )
        // InternalSct3.g:732:6: (otherlv_13= 'if' ( (lv_label_14_0= RULE_STRING ) ) )
        {
        // InternalSct3.g:732:6: (otherlv_13= 'if' ( (lv_label_14_0= RULE_STRING ) ) )
        // InternalSct3.g:732:8: otherlv_13= 'if' ( (lv_label_14_0= RULE_STRING ) )
        {
        otherlv_13=(Token)match(input,25,FollowSets000.FOLLOW_28); if (state.failed) return ;
        // InternalSct3.g:736:1: ( (lv_label_14_0= RULE_STRING ) )
        // InternalSct3.g:737:1: (lv_label_14_0= RULE_STRING )
        {
        // InternalSct3.g:737:1: (lv_label_14_0= RULE_STRING )
        // InternalSct3.g:738:3: lv_label_14_0= RULE_STRING
        {
        lv_label_14_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred30_InternalSct3

    // $ANTLR start synpred84_InternalSct3
    public final void synpred84_InternalSct3_fragment() throws RecognitionException {   
        EObject lv_expression_0_0 = null;


        // InternalSct3.g:2373:2: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) )
        // InternalSct3.g:2373:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
        {
        // InternalSct3.g:2373:2: ( (lv_expression_0_0= ruleAnnotatedExpression ) )
        // InternalSct3.g:2374:1: (lv_expression_0_0= ruleAnnotatedExpression )
        {
        // InternalSct3.g:2374:1: (lv_expression_0_0= ruleAnnotatedExpression )
        // InternalSct3.g:2375:3: lv_expression_0_0= ruleAnnotatedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTestEntityAccess().getExpressionAnnotatedExpressionParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_expression_0_0=ruleAnnotatedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred84_InternalSct3

    // $ANTLR start synpred113_InternalSct3
    public final void synpred113_InternalSct3_fragment() throws RecognitionException {   
        EObject this_Assignment_0 = null;


        // InternalSct3.g:3339:2: (this_Assignment_0= ruleAssignment )
        // InternalSct3.g:3339:2: this_Assignment_0= ruleAssignment
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
    // $ANTLR end synpred113_InternalSct3

    // $ANTLR start synpred114_InternalSct3
    public final void synpred114_InternalSct3_fragment() throws RecognitionException {   
        EObject this_PostfixEffect_1 = null;


        // InternalSct3.g:3352:2: (this_PostfixEffect_1= rulePostfixEffect )
        // InternalSct3.g:3352:2: this_PostfixEffect_1= rulePostfixEffect
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
    // $ANTLR end synpred114_InternalSct3

    // $ANTLR start synpred115_InternalSct3
    public final void synpred115_InternalSct3_fragment() throws RecognitionException {   
        EObject this_Emission_2 = null;


        // InternalSct3.g:3365:2: (this_Emission_2= ruleEmission )
        // InternalSct3.g:3365:2: this_Emission_2= ruleEmission
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
    // $ANTLR end synpred115_InternalSct3

    // $ANTLR start synpred116_InternalSct3
    public final void synpred116_InternalSct3_fragment() throws RecognitionException {   
        EObject this_HostcodeEffect_3 = null;


        // InternalSct3.g:3378:2: (this_HostcodeEffect_3= ruleHostcodeEffect )
        // InternalSct3.g:3378:2: this_HostcodeEffect_3= ruleHostcodeEffect
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
    // $ANTLR end synpred116_InternalSct3

    // $ANTLR start synpred128_InternalSct3
    public final void synpred128_InternalSct3_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalSct3.g:3898:2: (this_BoolExpression_0= ruleBoolExpression )
        // InternalSct3.g:3898:2: this_BoolExpression_0= ruleBoolExpression
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
    // $ANTLR end synpred128_InternalSct3

    // $ANTLR start synpred135_InternalSct3
    public final void synpred135_InternalSct3_fragment() throws RecognitionException {   
        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


        // InternalSct3.g:4231:3: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )
        // InternalSct3.g:4231:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
        {
        // InternalSct3.g:4231:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
        // InternalSct3.g:4232:1: (lv_operator_2_0= ruleBitwiseAndOperator )
        {
        // InternalSct3.g:4232:1: (lv_operator_2_0= ruleBitwiseAndOperator )
        // InternalSct3.g:4233:3: lv_operator_2_0= ruleBitwiseAndOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_24);
        lv_operator_2_0=ruleBitwiseAndOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalSct3.g:4249:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
        // InternalSct3.g:4250:1: (lv_subExpressions_3_0= ruleCompareOperation )
        {
        // InternalSct3.g:4250:1: (lv_subExpressions_3_0= ruleCompareOperation )
        // InternalSct3.g:4251:3: lv_subExpressions_3_0= ruleCompareOperation
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_3_0=ruleCompareOperation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred135_InternalSct3

    // $ANTLR start synpred136_InternalSct3
    public final void synpred136_InternalSct3_fragment() throws RecognitionException {   
        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


        // InternalSct3.g:4222:2: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )
        // InternalSct3.g:4222:2: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
        {
        // InternalSct3.g:4222:2: ()
        // InternalSct3.g:4223:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // InternalSct3.g:4231:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
        int cnt189=0;
        loop189:
        do {
            int alt189=2;
            int LA189_0 = input.LA(1);

            if ( (LA189_0==49) ) {
                alt189=1;
            }


            switch (alt189) {
        	case 1 :
        	    // InternalSct3.g:4231:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
        	    {
        	    // InternalSct3.g:4231:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
        	    // InternalSct3.g:4232:1: (lv_operator_2_0= ruleBitwiseAndOperator )
        	    {
        	    // InternalSct3.g:4232:1: (lv_operator_2_0= ruleBitwiseAndOperator )
        	    // InternalSct3.g:4233:3: lv_operator_2_0= ruleBitwiseAndOperator
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_24);
        	    lv_operator_2_0=ruleBitwiseAndOperator();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }

        	    // InternalSct3.g:4249:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
        	    // InternalSct3.g:4250:1: (lv_subExpressions_3_0= ruleCompareOperation )
        	    {
        	    // InternalSct3.g:4250:1: (lv_subExpressions_3_0= ruleCompareOperation )
        	    // InternalSct3.g:4251:3: lv_subExpressions_3_0= ruleCompareOperation
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_81);
        	    lv_subExpressions_3_0=ruleCompareOperation();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt189 >= 1 ) break loop189;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(189, input);
                    throw eee;
            }
            cnt189++;
        } while (true);


        }
    }
    // $ANTLR end synpred136_InternalSct3

    // $ANTLR start synpred137_InternalSct3
    public final void synpred137_InternalSct3_fragment() throws RecognitionException {   
        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


        // InternalSct3.g:4300:2: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
        // InternalSct3.g:4300:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
        {
        // InternalSct3.g:4300:2: ()
        // InternalSct3.g:4301:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // InternalSct3.g:4309:2: ( (lv_operator_2_0= ruleCompareOperator ) )
        // InternalSct3.g:4310:1: (lv_operator_2_0= ruleCompareOperator )
        {
        // InternalSct3.g:4310:1: (lv_operator_2_0= ruleCompareOperator )
        // InternalSct3.g:4311:3: lv_operator_2_0= ruleCompareOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_24);
        lv_operator_2_0=ruleCompareOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalSct3.g:4327:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
        // InternalSct3.g:4328:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
        {
        // InternalSct3.g:4328:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
        // InternalSct3.g:4329:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_3_0=ruleNotOrValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred137_InternalSct3

    // $ANTLR start synpred138_InternalSct3
    public final void synpred138_InternalSct3_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // InternalSct3.g:4367:2: (this_ValuedExpression_0= ruleValuedExpression )
        // InternalSct3.g:4367:2: this_ValuedExpression_0= ruleValuedExpression
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
    // $ANTLR end synpred138_InternalSct3

    // $ANTLR start synpred154_InternalSct3
    public final void synpred154_InternalSct3_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ValuedExpression_4 = null;


        // InternalSct3.g:5032:6: ( (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) )
        // InternalSct3.g:5032:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        {
        // InternalSct3.g:5032:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        // InternalSct3.g:5032:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_84); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_45);
        this_ValuedExpression_4=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_5=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred154_InternalSct3

    // $ANTLR start synpred158_InternalSct3
    public final void synpred158_InternalSct3_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_indices_4_0 = null;


        // InternalSct3.g:5229:6: (otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']' )
        // InternalSct3.g:5229:6: otherlv_3= '[' ( (lv_indices_4_0= ruleExpression ) ) otherlv_5= ']'
        {
        otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_24); if (state.failed) return ;
        // InternalSct3.g:5233:1: ( (lv_indices_4_0= ruleExpression ) )
        // InternalSct3.g:5234:1: (lv_indices_4_0= ruleExpression )
        {
        // InternalSct3.g:5234:1: (lv_indices_4_0= ruleExpression )
        // InternalSct3.g:5235:3: lv_indices_4_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_2_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_66);
        lv_indices_4_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred158_InternalSct3

    // Delegated rules

    public final boolean synpred128_InternalSct3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred128_InternalSct3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred137_InternalSct3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred137_InternalSct3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred138_InternalSct3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred138_InternalSct3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalSct3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalSct3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalSct3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalSct3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalSct3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalSct3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred114_InternalSct3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred114_InternalSct3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred113_InternalSct3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred113_InternalSct3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred158_InternalSct3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred158_InternalSct3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalSct3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalSct3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred115_InternalSct3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred115_InternalSct3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred116_InternalSct3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred116_InternalSct3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred84_InternalSct3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred84_InternalSct3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred154_InternalSct3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred154_InternalSct3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred136_InternalSct3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred136_InternalSct3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalSct3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalSct3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred135_InternalSct3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred135_InternalSct3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA113 dfa113 = new DFA113(this);
    protected DFA121 dfa121 = new DFA121(this);
    protected DFA120 dfa120 = new DFA120(this);
    protected DFA122 dfa122 = new DFA122(this);
    protected DFA123 dfa123 = new DFA123(this);
    protected DFA136 dfa136 = new DFA136(this);
    protected DFA145 dfa145 = new DFA145(this);
    protected DFA146 dfa146 = new DFA146(this);
    protected DFA147 dfa147 = new DFA147(this);
    protected DFA173 dfa173 = new DFA173(this);
    static final String dfa_1s = "\73\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\12\1\4\1\uffff\2\4\1\6\1\4\3\12\1\6\2\12\2\4\1\63\2\4\1\6\1\4\1\6\1\4\3\12\1\6\4\12\2\63\3\12\1\6\2\12\1\4\1\6\2\4\1\6\5\12\1\6\4\12\1\4\1\6\2\12";
    static final String dfa_3s = "\1\137\1\uffff\1\137\1\4\1\uffff\1\137\1\4\1\6\1\4\3\137\1\10\4\137\1\73\1\74\1\4\1\6\1\4\1\6\1\74\3\137\1\10\4\137\1\73\1\63\3\137\1\10\2\137\1\4\1\6\1\74\1\4\1\6\5\137\1\10\4\137\1\4\1\6\2\137";
    static final String dfa_4s = "\1\uffff\1\2\2\uffff\1\1\66\uffff";
    static final String dfa_5s = "\73\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\5\uffff\1\2\7\uffff\6\1\4\uffff\10\1\1\uffff\1\1\5\uffff\5\4\1\uffff\1\4\10\uffff\1\3\36\uffff\7\4",
            "",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\uffff\1\4\10\uffff\1\3\36\uffff\7\4",
            "\1\5",
            "",
            "\1\12\1\11\1\15\1\uffff\1\16\1\13\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\uffff\1\4\1\10\5\uffff\1\6\1\uffff\1\3\1\7\1\14\34\uffff\7\4",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\22\1\4\10\uffff\1\3\36\uffff\7\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\22\1\4\6\uffff\1\23\1\uffff\1\3\1\24\35\uffff\7\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\22\1\4\10\uffff\1\3\36\uffff\7\4",
            "\1\15\1\uffff\1\16",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\22\1\4\10\uffff\1\3\36\uffff\7\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\22\1\4\10\uffff\1\3\36\uffff\7\4",
            "\1\12\1\11\1\15\1\uffff\1\16\1\13\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\uffff\1\4\1\10\5\uffff\1\6\1\uffff\1\3\1\7\1\14\34\uffff\7\4",
            "\1\12\1\11\1\15\1\uffff\1\16\1\13\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\uffff\1\4\1\10\7\uffff\1\3\1\uffff\1\14\34\uffff\7\4",
            "\1\27\4\uffff\1\25\2\uffff\1\26",
            "\1\31\1\30\1\34\1\uffff\1\35\1\32\62\uffff\1\33",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\43\1\42\1\46\1\uffff\1\47\1\44\62\uffff\1\45",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\22\1\4\10\uffff\1\3\36\uffff\7\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\22\1\4\6\uffff\1\50\1\uffff\1\3\1\51\35\uffff\7\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\22\1\4\10\uffff\1\3\36\uffff\7\4",
            "\1\34\1\uffff\1\35",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\22\1\4\10\uffff\1\3\36\uffff\7\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\22\1\4\10\uffff\1\3\36\uffff\7\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\22\1\4\6\uffff\1\23\1\uffff\1\3\1\24\35\uffff\7\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\22\1\4\10\uffff\1\3\36\uffff\7\4",
            "\1\27\4\uffff\1\25\2\uffff\1\26",
            "\1\27",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\52\1\4\10\uffff\1\3\36\uffff\7\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\52\1\4\6\uffff\1\53\1\uffff\1\3\1\54\35\uffff\7\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\52\1\4\10\uffff\1\3\36\uffff\7\4",
            "\1\46\1\uffff\1\47",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\52\1\4\10\uffff\1\3\36\uffff\7\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\52\1\4\10\uffff\1\3\36\uffff\7\4",
            "\1\55",
            "\1\56",
            "\1\60\1\57\1\63\1\uffff\1\64\1\61\62\uffff\1\62",
            "\1\65",
            "\1\66",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\22\1\4\6\uffff\1\50\1\uffff\1\3\1\51\35\uffff\7\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\22\1\4\10\uffff\1\3\36\uffff\7\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\52\1\4\10\uffff\1\3\36\uffff\7\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\52\1\4\6\uffff\1\67\1\uffff\1\3\1\70\35\uffff\7\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\52\1\4\10\uffff\1\3\36\uffff\7\4",
            "\1\63\1\uffff\1\64",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\52\1\4\10\uffff\1\3\36\uffff\7\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\52\1\4\10\uffff\1\3\36\uffff\7\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\52\1\4\6\uffff\1\53\1\uffff\1\3\1\54\35\uffff\7\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\52\1\4\10\uffff\1\3\36\uffff\7\4",
            "\1\71",
            "\1\72",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\52\1\4\6\uffff\1\67\1\uffff\1\3\1\70\35\uffff\7\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\5\uffff\5\4\1\52\1\4\10\uffff\1\3\36\uffff\7\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 188:1: ( (lv_declarations_5_0= ruleDeclarationWOSemicolon ) )*";
        }
    }
    static final String dfa_7s = "\74\uffff";
    static final String dfa_8s = "\1\4\1\12\1\4\3\uffff\2\4\1\6\1\4\3\12\1\6\2\12\2\4\1\63\2\4\1\6\1\4\1\6\1\4\3\12\1\6\4\12\2\63\3\12\1\6\2\12\1\4\1\6\2\4\1\6\5\12\1\6\4\12\1\4\1\6\2\12";
    static final String dfa_9s = "\2\72\1\4\3\uffff\1\74\1\4\1\6\1\4\1\72\1\73\1\72\1\10\2\72\2\74\1\73\1\74\1\4\1\6\1\4\1\6\1\74\1\72\1\73\1\72\1\10\2\72\1\73\1\72\1\73\1\63\1\72\1\73\1\72\1\10\2\72\1\4\1\6\1\74\1\4\1\6\1\73\2\72\1\73\1\72\1\10\2\72\1\73\1\72\1\4\1\6\1\73\1\72";
    static final String dfa_10s = "\3\uffff\1\1\1\2\1\3\66\uffff";
    static final String dfa_11s = "\74\uffff}>";
    static final String[] dfa_12s = {
            "\1\4\5\uffff\1\1\7\uffff\1\5\4\3\14\uffff\1\5\1\uffff\1\5\24\uffff\1\2",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\24\uffff\1\2",
            "\1\6",
            "",
            "",
            "",
            "\1\13\1\12\1\16\1\uffff\1\17\1\14\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\14\uffff\1\11\5\uffff\1\7\1\uffff\1\2\1\10\1\15",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\23\11\uffff\1\2",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\23\7\uffff\1\24\1\uffff\1\2\1\25",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\23\11\uffff\1\2",
            "\1\16\1\uffff\1\17",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\23\11\uffff\1\2",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\23\11\uffff\1\2",
            "\1\13\1\12\1\16\1\uffff\1\17\1\14\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\14\uffff\1\11\5\uffff\1\7\1\uffff\1\2\1\10\1\15",
            "\1\13\1\12\1\16\1\uffff\1\17\1\14\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\14\uffff\1\11\7\uffff\1\2\1\uffff\1\15",
            "\1\30\4\uffff\1\26\2\uffff\1\27",
            "\1\32\1\31\1\35\1\uffff\1\36\1\33\62\uffff\1\34",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\44\1\43\1\47\1\uffff\1\50\1\45\62\uffff\1\46",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\23\11\uffff\1\2",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\23\7\uffff\1\51\1\uffff\1\2\1\52",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\23\11\uffff\1\2",
            "\1\35\1\uffff\1\36",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\23\11\uffff\1\2",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\23\11\uffff\1\2",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\23\7\uffff\1\24\1\uffff\1\2\1\25",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\23\11\uffff\1\2",
            "\1\30\4\uffff\1\26\2\uffff\1\27",
            "\1\30",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\53\11\uffff\1\2",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\53\7\uffff\1\54\1\uffff\1\2\1\55",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\53\11\uffff\1\2",
            "\1\47\1\uffff\1\50",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\53\11\uffff\1\2",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\53\11\uffff\1\2",
            "\1\56",
            "\1\57",
            "\1\61\1\60\1\64\1\uffff\1\65\1\62\62\uffff\1\63",
            "\1\66",
            "\1\67",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\23\7\uffff\1\51\1\uffff\1\2\1\52",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\23\11\uffff\1\2",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\53\11\uffff\1\2",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\53\7\uffff\1\70\1\uffff\1\2\1\71",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\53\11\uffff\1\2",
            "\1\64\1\uffff\1\65",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\53\11\uffff\1\2",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\53\11\uffff\1\2",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\53\7\uffff\1\54\1\uffff\1\2\1\55",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\53\11\uffff\1\2",
            "\1\72",
            "\1\73",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\53\7\uffff\1\70\1\uffff\1\2\1\71",
            "\1\1\10\uffff\4\3\14\uffff\1\5\1\uffff\1\5\12\uffff\1\53\11\uffff\1\2"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "224:3: ( ( (lv_regions_7_0= ruleSingleControlflowRegion ) ) | ( (lv_regions_8_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_9_0= ruleRegion ) )* )";
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 412:1: ( (lv_declarations_8_0= ruleDeclarationWOSemicolon ) )*";
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "448:3: ( ( (lv_regions_10_0= ruleSingleControlflowRegion ) ) | ( (lv_regions_11_0= ruleSingleDataflowRegion ) ) | ( (lv_regions_12_0= ruleRegion ) )* )";
        }
    }
    static final String dfa_13s = "\57\uffff";
    static final String dfa_14s = "\1\1\56\uffff";
    static final String dfa_15s = "\1\12\1\uffff\1\12\1\4\1\uffff\2\4\1\6\1\4\3\12\2\4\1\63\2\4\1\6\1\4\1\6\1\4\5\12\2\63\3\12\1\4\1\6\2\4\1\6\7\12\1\4\1\6\2\12";
    static final String dfa_16s = "\1\77\1\uffff\1\77\1\4\1\uffff\1\77\1\4\1\6\1\4\5\77\1\73\1\74\1\4\1\6\1\4\1\6\1\74\5\77\1\73\1\63\3\77\1\4\1\6\1\74\1\4\1\6\7\77\1\4\1\6\2\77";
    static final String dfa_17s = "\1\uffff\1\2\2\uffff\1\1\52\uffff";
    static final String dfa_18s = "\57\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\7\uffff\5\1\14\uffff\1\1\1\uffff\1\1\24\uffff\1\3\2\uffff\3\4",
            "",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\24\uffff\1\3\2\uffff\3\4",
            "\1\5",
            "",
            "\1\12\1\11\1\1\1\uffff\1\1\1\13\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\14\uffff\1\10\5\uffff\1\6\1\uffff\1\3\1\7\1\1\3\4",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\12\uffff\1\17\11\uffff\1\3\2\uffff\3\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\12\uffff\1\17\7\uffff\1\20\1\uffff\1\3\1\21\1\uffff\3\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\12\uffff\1\17\11\uffff\1\3\2\uffff\3\4",
            "\1\12\1\11\1\1\1\uffff\1\1\1\13\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\14\uffff\1\10\5\uffff\1\6\1\uffff\1\3\1\7\1\1\3\4",
            "\1\12\1\11\1\1\1\uffff\1\1\1\13\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\14\uffff\1\10\7\uffff\1\3\1\uffff\1\1\3\4",
            "\1\24\4\uffff\1\22\2\uffff\1\23",
            "\1\26\1\25\1\1\1\uffff\1\1\1\27\62\uffff\1\1",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\35\1\34\1\1\1\uffff\1\1\1\36\62\uffff\1\1",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\12\uffff\1\17\11\uffff\1\3\2\uffff\3\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\12\uffff\1\17\7\uffff\1\37\1\uffff\1\3\1\40\1\uffff\3\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\12\uffff\1\17\11\uffff\1\3\2\uffff\3\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\12\uffff\1\17\7\uffff\1\20\1\uffff\1\3\1\21\1\uffff\3\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\12\uffff\1\17\11\uffff\1\3\2\uffff\3\4",
            "\1\24\4\uffff\1\22\2\uffff\1\23",
            "\1\24",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\12\uffff\1\41\11\uffff\1\3\2\uffff\3\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\12\uffff\1\41\7\uffff\1\42\1\uffff\1\3\1\43\1\uffff\3\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\12\uffff\1\41\11\uffff\1\3\2\uffff\3\4",
            "\1\44",
            "\1\45",
            "\1\47\1\46\1\1\1\uffff\1\1\1\50\62\uffff\1\1",
            "\1\51",
            "\1\52",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\12\uffff\1\17\7\uffff\1\37\1\uffff\1\3\1\40\1\uffff\3\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\12\uffff\1\17\11\uffff\1\3\2\uffff\3\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\12\uffff\1\41\11\uffff\1\3\2\uffff\3\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\12\uffff\1\41\7\uffff\1\53\1\uffff\1\3\1\54\1\uffff\3\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\12\uffff\1\41\11\uffff\1\3\2\uffff\3\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\12\uffff\1\41\7\uffff\1\42\1\uffff\1\3\1\43\1\uffff\3\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\12\uffff\1\41\11\uffff\1\3\2\uffff\3\4",
            "\1\55",
            "\1\56",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\12\uffff\1\41\7\uffff\1\53\1\uffff\1\3\1\54\1\uffff\3\4",
            "\1\2\10\uffff\4\1\14\uffff\1\1\1\uffff\1\1\12\uffff\1\41\11\uffff\1\3\2\uffff\3\4"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "()* loopback of 508:3: ( (lv_outgoingTransitions_14_0= ruleTransition ) )*";
        }
    }
    static final String dfa_20s = "\23\uffff";
    static final String dfa_21s = "\1\3\22\uffff";
    static final String dfa_22s = "\1\12\1\4\1\uffff\16\0\2\uffff";
    static final String dfa_23s = "\1\77\1\126\1\uffff\16\0\2\uffff";
    static final String dfa_24s = "\2\uffff\1\1\16\uffff\1\3\1\2";
    static final String dfa_25s = "\3\uffff\1\0\1\5\1\14\1\2\1\6\1\4\1\1\1\7\1\11\1\15\1\13\1\12\1\3\1\10\2\uffff}>";
    static final String[] dfa_26s = {
            "\1\5\7\uffff\1\4\1\7\1\10\1\11\1\12\2\uffff\1\1\1\2\10\uffff\1\13\1\uffff\1\14\24\uffff\1\6\2\uffff\1\15\1\16\1\17",
            "\1\2\1\20\4\2\35\uffff\1\2\15\uffff\1\2\3\uffff\1\2\2\uffff\1\2\23\uffff\1\2\5\uffff\1\2",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "647:3: ( ( (otherlv_6= 'if' ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) ) )? (otherlv_9= 'then' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | (otherlv_13= 'if' ( (lv_label_14_0= RULE_STRING ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_3 = input.LA(1);

                         
                        int index27_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalSct3()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index27_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_9 = input.LA(1);

                         
                        int index27_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalSct3()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index27_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_6 = input.LA(1);

                         
                        int index27_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalSct3()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index27_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA27_15 = input.LA(1);

                         
                        int index27_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalSct3()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index27_15);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA27_8 = input.LA(1);

                         
                        int index27_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalSct3()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index27_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA27_4 = input.LA(1);

                         
                        int index27_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalSct3()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index27_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA27_7 = input.LA(1);

                         
                        int index27_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalSct3()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index27_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA27_10 = input.LA(1);

                         
                        int index27_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalSct3()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index27_10);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA27_16 = input.LA(1);

                         
                        int index27_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalSct3()) ) {s = 2;}

                        else if ( (synpred30_InternalSct3()) ) {s = 18;}

                         
                        input.seek(index27_16);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA27_11 = input.LA(1);

                         
                        int index27_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalSct3()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index27_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA27_14 = input.LA(1);

                         
                        int index27_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalSct3()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index27_14);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA27_13 = input.LA(1);

                         
                        int index27_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalSct3()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index27_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA27_5 = input.LA(1);

                         
                        int index27_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalSct3()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index27_5);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA27_12 = input.LA(1);

                         
                        int index27_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalSct3()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index27_12);
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
    static final String dfa_27s = "\16\uffff";
    static final String dfa_28s = "\1\4\1\0\14\uffff";
    static final String dfa_29s = "\1\126\1\0\14\uffff";
    static final String dfa_30s = "\2\uffff\1\2\12\uffff\1\1";
    static final String dfa_31s = "\1\uffff\1\0\14\uffff}>";
    static final String[] dfa_32s = {
            "\2\2\1\1\3\2\35\uffff\1\2\15\uffff\1\2\3\uffff\1\2\2\uffff\1\2\23\uffff\1\2\5\uffff\1\2",
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

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "651:1: ( (lv_delay_7_0= RULE_INT ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_1 = input.LA(1);

                         
                        int index23_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalSct3()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index23_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_33s = "\2\12\1\4\2\uffff\2\4\1\6\3\12\1\6\2\12\5\4\1\6\1\63\3\12\1\6\4\12\1\4\1\6\2\4\1\6\2\63\3\12\1\6\4\12\2\4\1\6\3\12\1\6\4\12\1\4\1\6\2\12";
    static final String dfa_34s = "\2\72\1\4\2\uffff\1\74\1\4\1\6\1\72\1\73\1\72\1\10\2\72\1\4\3\74\1\4\1\6\1\73\1\72\1\73\1\72\1\10\2\72\1\73\1\72\1\4\1\6\1\74\1\4\1\6\1\73\1\63\1\72\1\73\1\72\1\10\2\72\1\73\1\72\1\74\1\4\1\6\1\72\1\73\1\72\1\10\2\72\1\73\1\72\1\4\1\6\1\73\1\72";
    static final String dfa_35s = "\3\uffff\1\1\1\2\66\uffff";
    static final String[] dfa_36s = {
            "\1\1\30\uffff\1\3\1\uffff\1\4\24\uffff\1\2",
            "\1\1\30\uffff\1\3\1\uffff\1\4\24\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\11\1\10\1\14\1\uffff\1\15\1\12\1\1\30\uffff\1\3\1\uffff\1\4\14\uffff\1\16\5\uffff\1\6\1\uffff\1\2\1\7\1\13",
            "\1\17",
            "\1\20",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\21\11\uffff\1\2",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\21\7\uffff\1\22\1\uffff\1\2\1\23",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\21\11\uffff\1\2",
            "\1\14\1\uffff\1\15",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\21\11\uffff\1\2",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\21\11\uffff\1\2",
            "\1\24",
            "\1\11\1\10\1\14\1\uffff\1\15\1\12\1\1\30\uffff\1\3\1\uffff\1\4\14\uffff\1\16\5\uffff\1\6\1\uffff\1\2\1\7\1\13",
            "\1\11\1\10\1\14\1\uffff\1\15\1\12\1\1\30\uffff\1\3\1\uffff\1\4\14\uffff\1\16\7\uffff\1\2\1\uffff\1\13",
            "\1\26\1\25\1\31\1\uffff\1\32\1\27\62\uffff\1\30",
            "\1\33",
            "\1\34",
            "\1\37\4\uffff\1\35\2\uffff\1\36",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\21\11\uffff\1\2",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\21\7\uffff\1\40\1\uffff\1\2\1\41",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\21\11\uffff\1\2",
            "\1\31\1\uffff\1\32",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\21\11\uffff\1\2",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\21\11\uffff\1\2",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\21\7\uffff\1\22\1\uffff\1\2\1\23",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\21\11\uffff\1\2",
            "\1\42",
            "\1\43",
            "\1\45\1\44\1\50\1\uffff\1\51\1\46\62\uffff\1\47",
            "\1\52",
            "\1\53",
            "\1\37\4\uffff\1\35\2\uffff\1\36",
            "\1\37",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\54\11\uffff\1\2",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\54\7\uffff\1\55\1\uffff\1\2\1\56",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\54\11\uffff\1\2",
            "\1\50\1\uffff\1\51",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\54\11\uffff\1\2",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\54\11\uffff\1\2",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\21\7\uffff\1\40\1\uffff\1\2\1\41",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\21\11\uffff\1\2",
            "\1\60\1\57\1\63\1\uffff\1\64\1\61\62\uffff\1\62",
            "\1\65",
            "\1\66",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\54\11\uffff\1\2",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\54\7\uffff\1\67\1\uffff\1\2\1\70",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\54\11\uffff\1\2",
            "\1\63\1\uffff\1\64",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\54\11\uffff\1\2",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\54\11\uffff\1\2",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\54\7\uffff\1\55\1\uffff\1\2\1\56",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\54\11\uffff\1\2",
            "\1\71",
            "\1\72",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\54\7\uffff\1\67\1\uffff\1\2\1\70",
            "\1\1\30\uffff\1\3\1\uffff\1\4\12\uffff\1\54\11\uffff\1\2"
    };
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[][] dfa_36 = unpackEncodedStringArray(dfa_36s);

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_33;
            this.max = dfa_34;
            this.accept = dfa_35;
            this.special = dfa_5;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "1602:1: (this_ControlflowRegion_0= ruleControlflowRegion | this_DataflowRegion_1= ruleDataflowRegion )";
        }
    }
    static final String dfa_37s = "\2\12\1\4\2\uffff\2\4\1\6\1\4\3\12\1\6\2\12\2\4\1\63\2\4\1\6\1\4\1\6\1\4\3\12\1\6\4\12\2\63\3\12\1\6\2\12\1\4\1\6\2\4\1\6\5\12\1\6\4\12\1\4\1\6\2\12";
    static final String dfa_38s = "\2\137\1\4\2\uffff\1\137\1\4\1\6\1\4\3\137\1\10\4\137\1\73\1\74\1\4\1\6\1\4\1\6\1\74\3\137\1\10\4\137\1\73\1\63\3\137\1\10\2\137\1\4\1\6\1\74\1\4\1\6\5\137\1\10\4\137\1\4\1\6\2\137";
    static final String dfa_39s = "\3\uffff\1\2\1\1\66\uffff";
    static final String[] dfa_40s = {
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\uffff\1\4\10\uffff\1\2\36\uffff\7\4",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\uffff\1\4\10\uffff\1\2\36\uffff\7\4",
            "\1\5",
            "",
            "",
            "\1\12\1\11\1\15\1\uffff\1\16\1\13\1\1\10\uffff\4\3\24\uffff\5\4\1\uffff\1\4\1\10\5\uffff\1\6\1\uffff\1\2\1\7\1\14\34\uffff\7\4",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\22\1\4\10\uffff\1\2\36\uffff\7\4",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\22\1\4\6\uffff\1\23\1\uffff\1\2\1\24\35\uffff\7\4",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\22\1\4\10\uffff\1\2\36\uffff\7\4",
            "\1\15\1\uffff\1\16",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\22\1\4\10\uffff\1\2\36\uffff\7\4",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\22\1\4\10\uffff\1\2\36\uffff\7\4",
            "\1\12\1\11\1\15\1\uffff\1\16\1\13\1\1\10\uffff\4\3\24\uffff\5\4\1\uffff\1\4\1\10\5\uffff\1\6\1\uffff\1\2\1\7\1\14\34\uffff\7\4",
            "\1\12\1\11\1\15\1\uffff\1\16\1\13\1\1\10\uffff\4\3\24\uffff\5\4\1\uffff\1\4\1\10\7\uffff\1\2\1\uffff\1\14\34\uffff\7\4",
            "\1\27\4\uffff\1\25\2\uffff\1\26",
            "\1\31\1\30\1\34\1\uffff\1\35\1\32\62\uffff\1\33",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\43\1\42\1\46\1\uffff\1\47\1\44\62\uffff\1\45",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\22\1\4\10\uffff\1\2\36\uffff\7\4",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\22\1\4\6\uffff\1\50\1\uffff\1\2\1\51\35\uffff\7\4",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\22\1\4\10\uffff\1\2\36\uffff\7\4",
            "\1\34\1\uffff\1\35",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\22\1\4\10\uffff\1\2\36\uffff\7\4",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\22\1\4\10\uffff\1\2\36\uffff\7\4",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\22\1\4\6\uffff\1\23\1\uffff\1\2\1\24\35\uffff\7\4",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\22\1\4\10\uffff\1\2\36\uffff\7\4",
            "\1\27\4\uffff\1\25\2\uffff\1\26",
            "\1\27",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\52\1\4\10\uffff\1\2\36\uffff\7\4",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\52\1\4\6\uffff\1\53\1\uffff\1\2\1\54\35\uffff\7\4",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\52\1\4\10\uffff\1\2\36\uffff\7\4",
            "\1\46\1\uffff\1\47",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\52\1\4\10\uffff\1\2\36\uffff\7\4",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\52\1\4\10\uffff\1\2\36\uffff\7\4",
            "\1\55",
            "\1\56",
            "\1\60\1\57\1\63\1\uffff\1\64\1\61\62\uffff\1\62",
            "\1\65",
            "\1\66",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\22\1\4\6\uffff\1\50\1\uffff\1\2\1\51\35\uffff\7\4",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\22\1\4\10\uffff\1\2\36\uffff\7\4",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\52\1\4\10\uffff\1\2\36\uffff\7\4",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\52\1\4\6\uffff\1\67\1\uffff\1\2\1\70\35\uffff\7\4",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\52\1\4\10\uffff\1\2\36\uffff\7\4",
            "\1\63\1\uffff\1\64",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\52\1\4\10\uffff\1\2\36\uffff\7\4",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\52\1\4\10\uffff\1\2\36\uffff\7\4",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\52\1\4\6\uffff\1\53\1\uffff\1\2\1\54\35\uffff\7\4",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\52\1\4\10\uffff\1\2\36\uffff\7\4",
            "\1\71",
            "\1\72",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\52\1\4\6\uffff\1\67\1\uffff\1\2\1\70\35\uffff\7\4",
            "\1\1\10\uffff\4\3\24\uffff\5\4\1\52\1\4\10\uffff\1\2\36\uffff\7\4"
    };
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final char[] dfa_38 = DFA.unpackEncodedStringToUnsignedChars(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[][] dfa_40 = unpackEncodedStringArray(dfa_40s);

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_37;
            this.max = dfa_38;
            this.accept = dfa_39;
            this.special = dfa_5;
            this.transition = dfa_40;
        }
        public String getDescription() {
            return "()* loopback of 1815:1: ( (lv_declarations_6_0= ruleDeclarationWOSemicolon ) )*";
        }
    }
    static final String dfa_41s = "\1\1\72\uffff";
    static final String dfa_42s = "\1\12\1\uffff\1\12\1\4\1\uffff\2\4\1\6\1\4\3\12\1\6\2\12\2\4\1\63\2\4\1\6\1\4\1\6\1\4\3\12\1\6\4\12\2\63\3\12\1\6\2\12\1\4\1\6\2\4\1\6\5\12\1\6\4\12\1\4\1\6\2\12";
    static final String dfa_43s = "\1\72\1\uffff\1\72\1\4\1\uffff\1\74\1\4\1\6\1\4\1\72\1\73\1\72\1\10\2\72\2\74\1\73\1\74\1\4\1\6\1\4\1\6\1\74\1\72\1\73\1\72\1\10\2\72\1\73\1\72\1\73\1\63\1\72\1\73\1\72\1\10\2\72\1\4\1\6\1\74\1\4\1\6\1\73\2\72\1\73\1\72\1\10\2\72\1\73\1\72\1\4\1\6\1\73\1\72";
    static final String[] dfa_44s = {
            "\1\2\7\uffff\1\1\4\4\14\uffff\1\1\1\uffff\1\1\24\uffff\1\3",
            "",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\24\uffff\1\3",
            "\1\5",
            "",
            "\1\12\1\11\1\15\1\uffff\1\16\1\13\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\14\uffff\1\10\5\uffff\1\6\1\uffff\1\3\1\7\1\14",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\22\11\uffff\1\3",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\22\7\uffff\1\23\1\uffff\1\3\1\24",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\22\11\uffff\1\3",
            "\1\15\1\uffff\1\16",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\22\11\uffff\1\3",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\22\11\uffff\1\3",
            "\1\12\1\11\1\15\1\uffff\1\16\1\13\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\14\uffff\1\10\5\uffff\1\6\1\uffff\1\3\1\7\1\14",
            "\1\12\1\11\1\15\1\uffff\1\16\1\13\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\14\uffff\1\10\7\uffff\1\3\1\uffff\1\14",
            "\1\27\4\uffff\1\25\2\uffff\1\26",
            "\1\31\1\30\1\34\1\uffff\1\35\1\32\62\uffff\1\33",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\43\1\42\1\46\1\uffff\1\47\1\44\62\uffff\1\45",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\22\11\uffff\1\3",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\22\7\uffff\1\50\1\uffff\1\3\1\51",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\22\11\uffff\1\3",
            "\1\34\1\uffff\1\35",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\22\11\uffff\1\3",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\22\11\uffff\1\3",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\22\7\uffff\1\23\1\uffff\1\3\1\24",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\22\11\uffff\1\3",
            "\1\27\4\uffff\1\25\2\uffff\1\26",
            "\1\27",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\52\11\uffff\1\3",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\52\7\uffff\1\53\1\uffff\1\3\1\54",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\52\11\uffff\1\3",
            "\1\46\1\uffff\1\47",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\52\11\uffff\1\3",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\52\11\uffff\1\3",
            "\1\55",
            "\1\56",
            "\1\60\1\57\1\63\1\uffff\1\64\1\61\62\uffff\1\62",
            "\1\65",
            "\1\66",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\22\7\uffff\1\50\1\uffff\1\3\1\51",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\22\11\uffff\1\3",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\52\11\uffff\1\3",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\52\7\uffff\1\67\1\uffff\1\3\1\70",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\52\11\uffff\1\3",
            "\1\63\1\uffff\1\64",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\52\11\uffff\1\3",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\52\11\uffff\1\3",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\52\7\uffff\1\53\1\uffff\1\3\1\54",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\52\11\uffff\1\3",
            "\1\71",
            "\1\72",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\52\7\uffff\1\67\1\uffff\1\3\1\70",
            "\1\2\10\uffff\4\4\14\uffff\1\1\1\uffff\1\1\12\uffff\1\52\11\uffff\1\3"
    };
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final short[][] dfa_44 = unpackEncodedStringArray(dfa_44s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_1;
            this.eof = dfa_41;
            this.min = dfa_42;
            this.max = dfa_43;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "()+ loopback of 1833:3: ( (lv_states_7_0= ruleState ) )+";
        }
    }
    static final String dfa_45s = "\120\uffff";
    static final String dfa_46s = "\1\3\10\uffff\1\3\106\uffff";
    static final String dfa_47s = "\3\4\2\uffff\2\4\1\6\3\4\1\6\7\4\1\6\3\4\1\63\3\4\1\6\7\4\1\6\2\4\1\6\1\4\1\6\3\4\2\63\3\4\1\6\6\4\1\63\2\4\1\6\2\4\1\6\4\4\1\6\5\4\2\63\2\4\1\6\2\4";
    static final String dfa_48s = "\2\137\1\4\2\uffff\1\137\1\4\1\6\3\137\1\10\2\137\1\4\2\137\1\74\1\4\1\6\1\74\1\137\1\4\1\73\3\137\1\10\6\137\1\4\1\6\1\74\1\4\1\6\1\4\1\6\2\137\1\4\1\73\1\63\3\137\1\10\6\137\1\73\1\74\1\4\1\6\1\74\1\4\1\6\1\74\3\137\1\10\5\137\1\73\1\63\1\137\1\4\1\6\2\137";
    static final String dfa_49s = "\3\uffff\1\2\1\1\113\uffff";
    static final String dfa_50s = "\120\uffff}>";
    static final String[] dfa_51s = {
            "\1\3\2\uffff\1\3\2\uffff\1\1\36\uffff\2\3\5\4\1\uffff\1\4\3\uffff\1\3\4\uffff\1\2\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\1\37\uffff\1\3\5\4\1\uffff\1\4\3\uffff\1\3\4\uffff\1\2\36\uffff\7\4",
            "\1\5",
            "",
            "",
            "\1\11\1\10\1\14\1\3\1\15\1\12\1\1\37\uffff\1\3\5\4\1\uffff\1\4\1\16\2\uffff\1\3\2\uffff\1\6\1\uffff\1\2\1\7\1\13\34\uffff\7\4",
            "\1\17",
            "\1\20",
            "\1\3\2\uffff\1\3\2\uffff\1\1\37\uffff\1\3\5\4\1\21\1\4\3\uffff\1\3\4\uffff\1\2\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\1\33\uffff\2\3\1\uffff\2\3\5\4\1\24\1\4\1\3\2\uffff\1\3\2\uffff\1\22\1\uffff\1\2\1\23\1\uffff\1\3\5\uffff\11\3\15\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\24\1\4\3\uffff\1\3\4\uffff\1\26\36\uffff\7\4",
            "\1\14\1\uffff\1\15",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\24\1\4\3\uffff\1\3\4\uffff\1\26\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\24\1\4\3\uffff\1\3\4\uffff\1\26\36\uffff\7\4",
            "\1\27",
            "\1\11\1\10\1\14\1\3\1\15\1\12\1\1\37\uffff\1\3\5\4\1\uffff\1\4\1\16\2\uffff\1\3\2\uffff\1\6\1\uffff\1\2\1\7\1\13\34\uffff\7\4",
            "\1\11\1\10\1\14\1\3\1\15\1\12\1\1\37\uffff\1\3\5\4\1\uffff\1\4\1\16\2\uffff\1\3\4\uffff\1\2\1\uffff\1\13\34\uffff\7\4",
            "\1\31\1\30\1\34\1\uffff\1\35\1\32\62\uffff\1\33",
            "\1\36",
            "\1\37",
            "\1\31\1\40\1\34\1\uffff\1\35\1\32\62\uffff\1\33",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\uffff\1\4\3\uffff\1\3\4\uffff\1\26\36\uffff\7\4",
            "\1\41",
            "\1\44\4\uffff\1\42\2\uffff\1\43",
            "\1\3\2\uffff\1\3\2\uffff\1\1\37\uffff\1\3\5\4\1\21\1\4\3\uffff\1\3\4\uffff\1\2\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\24\1\4\3\uffff\1\3\2\uffff\1\45\1\uffff\1\26\1\46\35\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\24\1\4\3\uffff\1\3\4\uffff\1\26\36\uffff\7\4",
            "\1\34\1\uffff\1\35",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\24\1\4\3\uffff\1\3\4\uffff\1\26\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\24\1\4\3\uffff\1\3\4\uffff\1\26\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\24\1\4\3\uffff\1\3\2\uffff\1\22\1\uffff\1\26\1\23\35\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\24\1\4\3\uffff\1\3\4\uffff\1\26\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\24\1\4\3\uffff\1\3\4\uffff\1\26\36\uffff\7\4",
            "\1\52\1\51\1\14\1\3\1\15\1\12\1\25\37\uffff\1\3\5\4\1\uffff\1\4\1\53\2\uffff\1\3\2\uffff\1\47\1\uffff\1\26\1\50\1\13\34\uffff\7\4",
            "\1\54",
            "\1\55",
            "\1\57\1\56\1\62\1\uffff\1\63\1\60\62\uffff\1\61",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\24\1\4\3\uffff\1\3\4\uffff\1\26\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\25\33\uffff\1\3\3\uffff\1\3\5\4\1\24\1\4\1\3\2\uffff\1\3\2\uffff\1\22\1\uffff\1\26\1\23\1\uffff\1\3\5\uffff\11\3\15\uffff\7\4",
            "\1\70",
            "\1\44\4\uffff\1\42\2\uffff\1\43",
            "\1\44",
            "\1\3\2\uffff\1\3\2\uffff\1\1\37\uffff\1\3\5\4\1\71\1\4\3\uffff\1\3\4\uffff\1\2\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\74\1\4\3\uffff\1\3\2\uffff\1\72\1\uffff\1\26\1\73\35\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\74\1\4\3\uffff\1\3\4\uffff\1\26\36\uffff\7\4",
            "\1\62\1\uffff\1\63",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\74\1\4\3\uffff\1\3\4\uffff\1\26\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\74\1\4\3\uffff\1\3\4\uffff\1\26\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\24\1\4\3\uffff\1\3\2\uffff\1\45\1\uffff\1\26\1\46\35\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\24\1\4\3\uffff\1\3\4\uffff\1\26\36\uffff\7\4",
            "\1\52\1\51\1\14\1\3\1\15\1\12\1\25\37\uffff\1\3\5\4\1\uffff\1\4\1\53\2\uffff\1\3\2\uffff\1\47\1\uffff\1\26\1\50\1\13\34\uffff\7\4",
            "\1\52\1\51\1\14\1\3\1\15\1\12\1\25\37\uffff\1\3\5\4\1\uffff\1\4\1\53\2\uffff\1\3\4\uffff\1\26\1\uffff\1\13\34\uffff\7\4",
            "\1\77\4\uffff\1\75\2\uffff\1\76",
            "\1\101\1\100\1\104\1\uffff\1\105\1\102\62\uffff\1\103",
            "\1\106",
            "\1\107",
            "\1\101\1\110\1\104\1\uffff\1\105\1\102\62\uffff\1\103",
            "\1\111",
            "\1\112",
            "\1\57\1\113\1\62\1\uffff\1\63\1\60\62\uffff\1\61",
            "\1\3\2\uffff\1\3\2\uffff\1\1\37\uffff\1\3\5\4\1\71\1\4\3\uffff\1\3\4\uffff\1\2\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\74\1\4\3\uffff\1\3\2\uffff\1\114\1\uffff\1\26\1\115\35\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\74\1\4\3\uffff\1\3\4\uffff\1\26\36\uffff\7\4",
            "\1\104\1\uffff\1\105",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\74\1\4\3\uffff\1\3\4\uffff\1\26\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\74\1\4\3\uffff\1\3\4\uffff\1\26\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\74\1\4\3\uffff\1\3\2\uffff\1\72\1\uffff\1\26\1\73\35\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\74\1\4\3\uffff\1\3\4\uffff\1\26\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\74\1\4\3\uffff\1\3\4\uffff\1\26\36\uffff\7\4",
            "\1\77\4\uffff\1\75\2\uffff\1\76",
            "\1\77",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\74\1\4\3\uffff\1\3\4\uffff\1\26\36\uffff\7\4",
            "\1\116",
            "\1\117",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\74\1\4\3\uffff\1\3\2\uffff\1\114\1\uffff\1\26\1\115\35\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\25\37\uffff\1\3\5\4\1\74\1\4\3\uffff\1\3\4\uffff\1\26\36\uffff\7\4"
    };

    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[][] dfa_51 = unpackEncodedStringArray(dfa_51s);

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = dfa_45;
            this.eof = dfa_46;
            this.min = dfa_47;
            this.max = dfa_48;
            this.accept = dfa_49;
            this.special = dfa_50;
            this.transition = dfa_51;
        }
        public String getDescription() {
            return "()* loopback of 2180:2: ( (lv_declarations_1_0= ruleDeclaration ) )*";
        }
    }
    static final String dfa_52s = "\3\4\2\uffff\2\4\1\6\4\4\1\6\4\4\1\63\2\4\1\6\4\4\1\6\4\4\1\6\6\4\2\63\3\4\1\6\3\4\1\6\1\4\1\6\5\4\1\6\5\4\1\63\3\4\1\6\6\4\1\6\2\4\1\6\2\63\3\4";
    static final String dfa_53s = "\2\137\1\4\2\uffff\1\137\1\4\1\6\1\4\3\137\1\10\4\137\1\73\1\74\1\4\1\6\1\74\1\137\2\4\1\6\1\74\3\137\1\10\6\137\1\73\1\63\3\137\1\10\2\137\1\4\1\6\1\4\1\6\1\4\2\137\1\74\1\4\1\6\1\74\4\137\1\73\3\137\1\10\5\137\1\4\1\6\1\74\1\4\1\6\1\73\1\63\3\137";
    static final String[] dfa_54s = {
            "\1\3\2\uffff\1\3\2\uffff\1\1\7\uffff\1\3\26\uffff\2\3\5\4\1\uffff\1\4\3\uffff\1\3\4\uffff\1\2\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\1\37\uffff\1\3\5\4\1\uffff\1\4\3\uffff\1\3\4\uffff\1\2\36\uffff\7\4",
            "\1\5",
            "",
            "",
            "\1\12\1\11\1\15\1\3\1\16\1\13\1\1\37\uffff\1\3\5\4\1\uffff\1\4\1\10\2\uffff\1\3\2\uffff\1\6\1\uffff\1\2\1\7\1\14\34\uffff\7\4",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\3\2\uffff\1\3\2\uffff\1\1\37\uffff\1\3\5\4\1\22\1\4\3\uffff\1\3\4\uffff\1\2\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\1\7\uffff\1\3\23\uffff\2\3\1\uffff\2\3\5\4\1\25\1\4\1\3\2\uffff\1\3\2\uffff\1\23\1\uffff\1\2\1\24\1\uffff\1\3\5\uffff\11\3\15\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\25\1\4\3\uffff\1\3\4\uffff\1\27\36\uffff\7\4",
            "\1\15\1\uffff\1\16",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\25\1\4\3\uffff\1\3\4\uffff\1\27\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\25\1\4\3\uffff\1\3\4\uffff\1\27\36\uffff\7\4",
            "\1\12\1\11\1\15\1\3\1\16\1\13\1\1\37\uffff\1\3\5\4\1\uffff\1\4\1\10\2\uffff\1\3\2\uffff\1\6\1\uffff\1\2\1\7\1\14\34\uffff\7\4",
            "\1\12\1\11\1\15\1\3\1\16\1\13\1\1\37\uffff\1\3\5\4\1\uffff\1\4\1\10\2\uffff\1\3\4\uffff\1\2\1\uffff\1\14\34\uffff\7\4",
            "\1\32\4\uffff\1\30\2\uffff\1\31",
            "\1\34\1\33\1\37\1\uffff\1\40\1\35\62\uffff\1\36",
            "\1\41",
            "\1\42",
            "\1\34\1\43\1\37\1\uffff\1\40\1\35\62\uffff\1\36",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\uffff\1\4\3\uffff\1\3\4\uffff\1\27\36\uffff\7\4",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\50\1\47\1\53\1\uffff\1\54\1\51\62\uffff\1\52",
            "\1\3\2\uffff\1\3\2\uffff\1\1\37\uffff\1\3\5\4\1\22\1\4\3\uffff\1\3\4\uffff\1\2\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\25\1\4\3\uffff\1\3\2\uffff\1\55\1\uffff\1\27\1\56\35\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\25\1\4\3\uffff\1\3\4\uffff\1\27\36\uffff\7\4",
            "\1\37\1\uffff\1\40",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\25\1\4\3\uffff\1\3\4\uffff\1\27\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\25\1\4\3\uffff\1\3\4\uffff\1\27\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\25\1\4\3\uffff\1\3\2\uffff\1\23\1\uffff\1\27\1\24\35\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\25\1\4\3\uffff\1\3\4\uffff\1\27\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\25\1\4\3\uffff\1\3\4\uffff\1\27\36\uffff\7\4",
            "\1\63\1\62\1\15\1\3\1\16\1\13\1\26\37\uffff\1\3\5\4\1\uffff\1\4\1\61\2\uffff\1\3\2\uffff\1\57\1\uffff\1\27\1\60\1\14\34\uffff\7\4",
            "\1\32\4\uffff\1\30\2\uffff\1\31",
            "\1\32",
            "\1\3\2\uffff\1\3\2\uffff\1\1\37\uffff\1\3\5\4\1\64\1\4\3\uffff\1\3\4\uffff\1\2\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\67\1\4\3\uffff\1\3\2\uffff\1\65\1\uffff\1\27\1\66\35\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\67\1\4\3\uffff\1\3\4\uffff\1\27\36\uffff\7\4",
            "\1\53\1\uffff\1\54",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\67\1\4\3\uffff\1\3\4\uffff\1\27\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\67\1\4\3\uffff\1\3\4\uffff\1\27\36\uffff\7\4",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\25\1\4\3\uffff\1\3\4\uffff\1\27\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\26\33\uffff\1\3\3\uffff\1\3\5\4\1\25\1\4\1\3\2\uffff\1\3\2\uffff\1\23\1\uffff\1\27\1\24\1\uffff\1\3\5\uffff\11\3\15\uffff\7\4",
            "\1\76\1\75\1\101\1\uffff\1\102\1\77\62\uffff\1\100",
            "\1\103",
            "\1\104",
            "\1\76\1\105\1\101\1\uffff\1\102\1\77\62\uffff\1\100",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\25\1\4\3\uffff\1\3\2\uffff\1\55\1\uffff\1\27\1\56\35\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\25\1\4\3\uffff\1\3\4\uffff\1\27\36\uffff\7\4",
            "\1\63\1\62\1\15\1\3\1\16\1\13\1\26\37\uffff\1\3\5\4\1\uffff\1\4\1\61\2\uffff\1\3\2\uffff\1\57\1\uffff\1\27\1\60\1\14\34\uffff\7\4",
            "\1\63\1\62\1\15\1\3\1\16\1\13\1\26\37\uffff\1\3\5\4\1\uffff\1\4\1\61\2\uffff\1\3\4\uffff\1\27\1\uffff\1\14\34\uffff\7\4",
            "\1\110\4\uffff\1\106\2\uffff\1\107",
            "\1\3\2\uffff\1\3\2\uffff\1\1\37\uffff\1\3\5\4\1\64\1\4\3\uffff\1\3\4\uffff\1\2\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\67\1\4\3\uffff\1\3\2\uffff\1\111\1\uffff\1\27\1\112\35\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\67\1\4\3\uffff\1\3\4\uffff\1\27\36\uffff\7\4",
            "\1\101\1\uffff\1\102",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\67\1\4\3\uffff\1\3\4\uffff\1\27\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\67\1\4\3\uffff\1\3\4\uffff\1\27\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\67\1\4\3\uffff\1\3\2\uffff\1\65\1\uffff\1\27\1\66\35\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\67\1\4\3\uffff\1\3\4\uffff\1\27\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\67\1\4\3\uffff\1\3\4\uffff\1\27\36\uffff\7\4",
            "\1\113",
            "\1\114",
            "\1\50\1\115\1\53\1\uffff\1\54\1\51\62\uffff\1\52",
            "\1\116",
            "\1\117",
            "\1\110\4\uffff\1\106\2\uffff\1\107",
            "\1\110",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\67\1\4\3\uffff\1\3\4\uffff\1\27\36\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\67\1\4\3\uffff\1\3\2\uffff\1\111\1\uffff\1\27\1\112\35\uffff\7\4",
            "\1\3\2\uffff\1\3\2\uffff\1\26\37\uffff\1\3\5\4\1\67\1\4\3\uffff\1\3\4\uffff\1\27\36\uffff\7\4"
    };
    static final char[] dfa_52 = DFA.unpackEncodedStringToUnsignedChars(dfa_52s);
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final short[][] dfa_54 = unpackEncodedStringArray(dfa_54s);

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = dfa_45;
            this.eof = dfa_45;
            this.min = dfa_52;
            this.max = dfa_53;
            this.accept = dfa_49;
            this.special = dfa_50;
            this.transition = dfa_54;
        }
        public String getDescription() {
            return "()* loopback of 2290:1: ( (lv_declarations_3_0= ruleDeclaration ) )*";
        }
    }
    static final String dfa_55s = "\3\4\2\uffff\2\4\1\6\1\4\1\0\1\4\1\6\11\4\1\63\3\4\1\6\5\4\1\6\2\4\1\6\1\4\1\6\3\4\2\63\3\4\1\6\7\4\1\6\1\63\2\4\1\6\4\4\1\6\4\4\1\6\5\4\2\63\2\4\1\6\2\4";
    static final String dfa_56s = "\2\72\1\4\2\uffff\1\74\1\4\1\6\1\72\1\0\1\72\1\10\2\72\1\4\4\74\1\72\1\4\1\73\1\72\1\73\1\72\1\10\3\72\1\74\1\4\1\6\1\74\1\4\1\6\1\4\1\6\1\72\1\113\1\4\1\73\1\63\1\72\1\73\1\72\1\10\2\72\1\73\1\72\2\74\1\4\1\6\1\73\1\74\1\4\1\6\1\74\1\73\1\72\1\4\1\6\1\74\1\72\1\73\1\72\1\10\2\72\1\73\2\72\1\73\1\63\1\72\1\4\1\6\1\73\1\72";
    static final String dfa_57s = "\3\uffff\1\1\1\2\113\uffff";
    static final String dfa_58s = "\11\uffff\1\0\106\uffff}>";
    static final String[] dfa_59s = {
            "\1\4\2\uffff\1\4\2\uffff\1\1\37\uffff\1\3\12\uffff\1\4\4\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\1\37\uffff\1\3\12\uffff\1\4\4\uffff\1\2",
            "\1\5",
            "",
            "",
            "\1\11\1\10\1\14\1\4\1\15\1\12\1\1\37\uffff\1\3\7\uffff\1\16\2\uffff\1\4\2\uffff\1\6\1\uffff\1\2\1\7\1\13",
            "\1\17",
            "\1\20",
            "\1\4\2\uffff\1\4\2\uffff\1\1\37\uffff\1\3\5\uffff\1\21\4\uffff\1\4\4\uffff\1\2",
            "\1\uffff",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\22\4\uffff\1\4\4\uffff\1\24",
            "\1\14\1\uffff\1\15",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\22\4\uffff\1\4\4\uffff\1\24",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\22\4\uffff\1\4\4\uffff\1\24",
            "\1\25",
            "\1\11\1\10\1\14\1\4\1\15\1\12\1\1\37\uffff\1\3\7\uffff\1\16\2\uffff\1\4\2\uffff\1\6\1\uffff\1\2\1\7\1\13",
            "\1\11\1\10\1\14\1\4\1\15\1\12\1\1\37\uffff\1\3\7\uffff\1\16\2\uffff\1\4\4\uffff\1\2\1\uffff\1\13",
            "\1\27\1\26\1\32\1\uffff\1\33\1\30\62\uffff\1\31",
            "\1\27\1\34\1\32\1\uffff\1\33\1\30\62\uffff\1\31",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\12\uffff\1\4\4\uffff\1\24",
            "\1\35",
            "\1\40\4\uffff\1\36\2\uffff\1\37",
            "\1\4\2\uffff\1\4\2\uffff\1\1\37\uffff\1\3\5\uffff\1\21\4\uffff\1\4\4\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\22\4\uffff\1\4\2\uffff\1\41\1\uffff\1\24\1\42",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\22\4\uffff\1\4\4\uffff\1\24",
            "\1\32\1\uffff\1\33",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\22\4\uffff\1\4\4\uffff\1\24",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\22\4\uffff\1\4\4\uffff\1\24",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\22\4\uffff\1\4\4\uffff\1\24",
            "\1\46\1\45\1\14\1\4\1\15\1\12\1\23\37\uffff\1\3\7\uffff\1\47\2\uffff\1\4\2\uffff\1\43\1\uffff\1\24\1\44\1\13",
            "\1\50",
            "\1\51",
            "\1\53\1\52\1\56\1\uffff\1\57\1\54\62\uffff\1\55",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\22\4\uffff\1\4\4\uffff\1\24",
            "\1\4\2\uffff\1\4\2\uffff\1\23\33\uffff\1\4\3\uffff\1\3\5\uffff\1\22\1\uffff\1\4\2\uffff\1\4\2\uffff\1\64\1\uffff\1\24\1\65\1\uffff\1\4\5\uffff\11\4",
            "\1\66",
            "\1\40\4\uffff\1\36\2\uffff\1\37",
            "\1\40",
            "\1\4\2\uffff\1\4\2\uffff\1\1\37\uffff\1\3\5\uffff\1\67\4\uffff\1\4\4\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\72\4\uffff\1\4\2\uffff\1\70\1\uffff\1\24\1\71",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\72\4\uffff\1\4\4\uffff\1\24",
            "\1\56\1\uffff\1\57",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\72\4\uffff\1\4\4\uffff\1\24",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\72\4\uffff\1\4\4\uffff\1\24",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\22\4\uffff\1\4\2\uffff\1\41\1\uffff\1\24\1\42",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\22\4\uffff\1\4\4\uffff\1\24",
            "\1\46\1\45\1\14\1\4\1\15\1\12\1\23\37\uffff\1\3\7\uffff\1\47\2\uffff\1\4\2\uffff\1\43\1\uffff\1\24\1\44\1\13",
            "\1\46\1\45\1\14\1\4\1\15\1\12\1\23\37\uffff\1\3\7\uffff\1\47\2\uffff\1\4\4\uffff\1\24\1\uffff\1\13",
            "\1\73",
            "\1\74",
            "\1\77\4\uffff\1\75\2\uffff\1\76",
            "\1\101\1\100\1\104\1\uffff\1\105\1\102\62\uffff\1\103",
            "\1\106",
            "\1\107",
            "\1\101\1\110\1\104\1\uffff\1\105\1\102\62\uffff\1\103",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\22\4\uffff\1\4\2\uffff\1\64\1\uffff\1\24\1\65",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\22\4\uffff\1\4\4\uffff\1\24",
            "\1\111",
            "\1\112",
            "\1\53\1\113\1\56\1\uffff\1\57\1\54\62\uffff\1\55",
            "\1\4\2\uffff\1\4\2\uffff\1\1\37\uffff\1\3\5\uffff\1\67\4\uffff\1\4\4\uffff\1\2",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\72\4\uffff\1\4\2\uffff\1\114\1\uffff\1\24\1\115",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\72\4\uffff\1\4\4\uffff\1\24",
            "\1\104\1\uffff\1\105",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\72\4\uffff\1\4\4\uffff\1\24",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\72\4\uffff\1\4\4\uffff\1\24",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\72\4\uffff\1\4\2\uffff\1\70\1\uffff\1\24\1\71",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\72\4\uffff\1\4\4\uffff\1\24",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\72\4\uffff\1\4\4\uffff\1\24",
            "\1\77\4\uffff\1\75\2\uffff\1\76",
            "\1\77",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\72\4\uffff\1\4\4\uffff\1\24",
            "\1\116",
            "\1\117",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\72\4\uffff\1\4\2\uffff\1\114\1\uffff\1\24\1\115",
            "\1\4\2\uffff\1\4\2\uffff\1\23\37\uffff\1\3\5\uffff\1\72\4\uffff\1\4\4\uffff\1\24"
    };
    static final char[] dfa_55 = DFA.unpackEncodedStringToUnsignedChars(dfa_55s);
    static final char[] dfa_56 = DFA.unpackEncodedStringToUnsignedChars(dfa_56s);
    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final short[] dfa_58 = DFA.unpackEncodedString(dfa_58s);
    static final short[][] dfa_59 = unpackEncodedStringArray(dfa_59s);

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = dfa_45;
            this.eof = dfa_45;
            this.min = dfa_55;
            this.max = dfa_56;
            this.accept = dfa_57;
            this.special = dfa_58;
            this.transition = dfa_59;
        }
        public String getDescription() {
            return "2373:1: ( ( (lv_expression_0_0= ruleAnnotatedExpression ) ) | ( (lv_effect_1_0= ruleEffect ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_9 = input.LA(1);

                         
                        int index73_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalSct3()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index73_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_60s = "\2\137\1\4\2\uffff\1\137\1\4\1\6\3\137\1\10\2\137\1\4\2\137\1\74\1\4\1\6\1\73\3\137\1\10\4\137\1\4\1\6\1\74\1\4\1\6\1\73\1\63\3\137\1\10\4\137\1\74\1\4\1\6\3\137\1\10\4\137\1\4\1\6\2\137";
    static final String[] dfa_61s = {
            "\1\1\40\uffff\5\3\1\uffff\1\4\10\uffff\1\2\36\uffff\7\3",
            "\1\1\40\uffff\5\3\1\uffff\1\4\10\uffff\1\2\36\uffff\7\3",
            "\1\5",
            "",
            "",
            "\1\11\1\10\1\14\1\uffff\1\15\1\12\1\1\40\uffff\5\3\1\uffff\1\4\1\16\5\uffff\1\6\1\uffff\1\2\1\7\1\13\34\uffff\7\3",
            "\1\17",
            "\1\20",
            "\1\1\40\uffff\5\3\1\21\1\4\10\uffff\1\2\36\uffff\7\3",
            "\1\1\40\uffff\5\3\1\21\1\4\6\uffff\1\22\1\uffff\1\2\1\23\35\uffff\7\3",
            "\1\1\40\uffff\5\3\1\21\1\4\10\uffff\1\2\36\uffff\7\3",
            "\1\14\1\uffff\1\15",
            "\1\1\40\uffff\5\3\1\21\1\4\10\uffff\1\2\36\uffff\7\3",
            "\1\1\40\uffff\5\3\1\21\1\4\10\uffff\1\2\36\uffff\7\3",
            "\1\24",
            "\1\11\1\10\1\14\1\uffff\1\15\1\12\1\1\40\uffff\5\3\1\uffff\1\4\1\16\5\uffff\1\6\1\uffff\1\2\1\7\1\13\34\uffff\7\3",
            "\1\11\1\10\1\14\1\uffff\1\15\1\12\1\1\40\uffff\5\3\1\uffff\1\4\1\16\7\uffff\1\2\1\uffff\1\13\34\uffff\7\3",
            "\1\26\1\25\1\31\1\uffff\1\32\1\27\62\uffff\1\30",
            "\1\33",
            "\1\34",
            "\1\37\4\uffff\1\35\2\uffff\1\36",
            "\1\1\40\uffff\5\3\1\21\1\4\10\uffff\1\2\36\uffff\7\3",
            "\1\1\40\uffff\5\3\1\21\1\4\6\uffff\1\40\1\uffff\1\2\1\41\35\uffff\7\3",
            "\1\1\40\uffff\5\3\1\21\1\4\10\uffff\1\2\36\uffff\7\3",
            "\1\31\1\uffff\1\32",
            "\1\1\40\uffff\5\3\1\21\1\4\10\uffff\1\2\36\uffff\7\3",
            "\1\1\40\uffff\5\3\1\21\1\4\10\uffff\1\2\36\uffff\7\3",
            "\1\1\40\uffff\5\3\1\21\1\4\6\uffff\1\22\1\uffff\1\2\1\23\35\uffff\7\3",
            "\1\1\40\uffff\5\3\1\21\1\4\10\uffff\1\2\36\uffff\7\3",
            "\1\42",
            "\1\43",
            "\1\45\1\44\1\50\1\uffff\1\51\1\46\62\uffff\1\47",
            "\1\52",
            "\1\53",
            "\1\37\4\uffff\1\35\2\uffff\1\36",
            "\1\37",
            "\1\1\40\uffff\5\3\1\54\1\4\10\uffff\1\2\36\uffff\7\3",
            "\1\1\40\uffff\5\3\1\54\1\4\6\uffff\1\55\1\uffff\1\2\1\56\35\uffff\7\3",
            "\1\1\40\uffff\5\3\1\54\1\4\10\uffff\1\2\36\uffff\7\3",
            "\1\50\1\uffff\1\51",
            "\1\1\40\uffff\5\3\1\54\1\4\10\uffff\1\2\36\uffff\7\3",
            "\1\1\40\uffff\5\3\1\54\1\4\10\uffff\1\2\36\uffff\7\3",
            "\1\1\40\uffff\5\3\1\21\1\4\6\uffff\1\40\1\uffff\1\2\1\41\35\uffff\7\3",
            "\1\1\40\uffff\5\3\1\21\1\4\10\uffff\1\2\36\uffff\7\3",
            "\1\60\1\57\1\63\1\uffff\1\64\1\61\62\uffff\1\62",
            "\1\65",
            "\1\66",
            "\1\1\40\uffff\5\3\1\54\1\4\10\uffff\1\2\36\uffff\7\3",
            "\1\1\40\uffff\5\3\1\54\1\4\6\uffff\1\67\1\uffff\1\2\1\70\35\uffff\7\3",
            "\1\1\40\uffff\5\3\1\54\1\4\10\uffff\1\2\36\uffff\7\3",
            "\1\63\1\uffff\1\64",
            "\1\1\40\uffff\5\3\1\54\1\4\10\uffff\1\2\36\uffff\7\3",
            "\1\1\40\uffff\5\3\1\54\1\4\10\uffff\1\2\36\uffff\7\3",
            "\1\1\40\uffff\5\3\1\54\1\4\6\uffff\1\55\1\uffff\1\2\1\56\35\uffff\7\3",
            "\1\1\40\uffff\5\3\1\54\1\4\10\uffff\1\2\36\uffff\7\3",
            "\1\71",
            "\1\72",
            "\1\1\40\uffff\5\3\1\54\1\4\6\uffff\1\67\1\uffff\1\2\1\70\35\uffff\7\3",
            "\1\1\40\uffff\5\3\1\54\1\4\10\uffff\1\2\36\uffff\7\3"
    };
    static final char[] dfa_60 = DFA.unpackEncodedStringToUnsignedChars(dfa_60s);
    static final short[][] dfa_61 = unpackEncodedStringArray(dfa_61s);

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_33;
            this.max = dfa_60;
            this.accept = dfa_35;
            this.special = dfa_5;
            this.transition = dfa_61;
        }
        public String getDescription() {
            return "2492:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_ReferenceDeclaration_1= ruleReferenceDeclaration )";
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_33;
            this.max = dfa_60;
            this.accept = dfa_35;
            this.special = dfa_5;
            this.transition = dfa_61;
        }
        public String getDescription() {
            return "2538:1: (this_VariableDeclarationWOSemicolon_0= ruleVariableDeclarationWOSemicolon | this_ReferenceDeclarationWOSemicolon_1= ruleReferenceDeclarationWOSemicolon )";
        }
    }
    static final String dfa_62s = "\1\4\13\0\2\uffff";
    static final String dfa_63s = "\1\126\13\0\2\uffff";
    static final String dfa_64s = "\14\uffff\1\1\1\2";
    static final String dfa_65s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_66s = {
            "\1\11\1\4\1\2\1\13\1\3\1\6\35\uffff\1\5\15\uffff\1\12\3\uffff\1\14\2\uffff\1\1\23\uffff\1\7\5\uffff\1\10",
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
    static final char[] dfa_62 = DFA.unpackEncodedStringToUnsignedChars(dfa_62s);
    static final char[] dfa_63 = DFA.unpackEncodedStringToUnsignedChars(dfa_63s);
    static final short[] dfa_64 = DFA.unpackEncodedString(dfa_64s);
    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final short[][] dfa_66 = unpackEncodedStringArray(dfa_66s);

    class DFA113 extends DFA {

        public DFA113(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 113;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_62;
            this.max = dfa_63;
            this.accept = dfa_64;
            this.special = dfa_65;
            this.transition = dfa_66;
        }
        public String getDescription() {
            return "3897:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA113_1 = input.LA(1);

                         
                        int index113_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_InternalSct3()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index113_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA113_2 = input.LA(1);

                         
                        int index113_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_InternalSct3()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index113_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA113_3 = input.LA(1);

                         
                        int index113_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_InternalSct3()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index113_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA113_4 = input.LA(1);

                         
                        int index113_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_InternalSct3()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index113_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA113_5 = input.LA(1);

                         
                        int index113_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_InternalSct3()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index113_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA113_6 = input.LA(1);

                         
                        int index113_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_InternalSct3()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index113_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA113_7 = input.LA(1);

                         
                        int index113_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_InternalSct3()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index113_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA113_8 = input.LA(1);

                         
                        int index113_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_InternalSct3()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index113_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA113_9 = input.LA(1);

                         
                        int index113_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_InternalSct3()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index113_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA113_10 = input.LA(1);

                         
                        int index113_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_InternalSct3()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index113_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA113_11 = input.LA(1);

                         
                        int index113_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_InternalSct3()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index113_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 113, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_67s = "\62\uffff";
    static final String dfa_68s = "\1\2\61\uffff";
    static final String dfa_69s = "\1\4\1\0\60\uffff";
    static final String dfa_70s = "\1\137\1\0\60\uffff";
    static final String dfa_71s = "\2\uffff\1\2\56\uffff\1\1";
    static final String dfa_72s = "\1\uffff\1\0\60\uffff}>";
    static final String[] dfa_73s = {
            "\1\2\2\uffff\1\2\2\uffff\1\2\7\uffff\6\2\2\uffff\12\2\1\uffff\1\2\2\uffff\11\2\1\1\1\uffff\3\2\4\uffff\1\2\2\uffff\3\2\21\uffff\1\2\5\uffff\11\2",
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

    static final short[] dfa_67 = DFA.unpackEncodedString(dfa_67s);
    static final short[] dfa_68 = DFA.unpackEncodedString(dfa_68s);
    static final char[] dfa_69 = DFA.unpackEncodedStringToUnsignedChars(dfa_69s);
    static final char[] dfa_70 = DFA.unpackEncodedStringToUnsignedChars(dfa_70s);
    static final short[] dfa_71 = DFA.unpackEncodedString(dfa_71s);
    static final short[] dfa_72 = DFA.unpackEncodedString(dfa_72s);
    static final short[][] dfa_73 = unpackEncodedStringArray(dfa_73s);

    class DFA121 extends DFA {

        public DFA121(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 121;
            this.eot = dfa_67;
            this.eof = dfa_68;
            this.min = dfa_69;
            this.max = dfa_70;
            this.accept = dfa_71;
            this.special = dfa_72;
            this.transition = dfa_73;
        }
        public String getDescription() {
            return "4222:1: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA121_1 = input.LA(1);

                         
                        int index121_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_InternalSct3()) ) {s = 49;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index121_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 121, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_74s = "\1\1\61\uffff";
    static final String dfa_75s = "\1\4\56\uffff\1\0\2\uffff";
    static final String dfa_76s = "\1\137\56\uffff\1\0\2\uffff";
    static final String dfa_77s = "\1\uffff\1\2\57\uffff\1\1";
    static final String dfa_78s = "\57\uffff\1\0\2\uffff}>";
    static final String[] dfa_79s = {
            "\1\1\2\uffff\1\1\2\uffff\1\1\7\uffff\6\1\2\uffff\12\1\1\uffff\1\1\2\uffff\11\1\1\57\1\uffff\3\1\4\uffff\1\1\2\uffff\3\1\21\uffff\1\1\5\uffff\11\1",
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
            "\1\uffff",
            "",
            ""
    };
    static final short[] dfa_74 = DFA.unpackEncodedString(dfa_74s);
    static final char[] dfa_75 = DFA.unpackEncodedStringToUnsignedChars(dfa_75s);
    static final char[] dfa_76 = DFA.unpackEncodedStringToUnsignedChars(dfa_76s);
    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final short[] dfa_78 = DFA.unpackEncodedString(dfa_78s);
    static final short[][] dfa_79 = unpackEncodedStringArray(dfa_79s);

    class DFA120 extends DFA {

        public DFA120(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 120;
            this.eot = dfa_67;
            this.eof = dfa_74;
            this.min = dfa_75;
            this.max = dfa_76;
            this.accept = dfa_77;
            this.special = dfa_78;
            this.transition = dfa_79;
        }
        public String getDescription() {
            return "()+ loopback of 4231:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA120_47 = input.LA(1);

                         
                        int index120_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalSct3()) ) {s = 49;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index120_47);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 120, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_80s = "\1\3\3\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff";
    static final String dfa_81s = "\1\4\1\uffff\1\4\1\uffff\11\4\1\0";
    static final String dfa_82s = "\1\137\1\uffff\1\126\1\uffff\1\137\1\4\1\137\1\4\1\137\1\4\1\137\1\4\1\137\1\0";
    static final String dfa_83s = "\1\uffff\1\1\1\uffff\1\2\12\uffff";
    static final String dfa_84s = "\15\uffff\1\0}>";
    static final String[] dfa_85s = {
            "\1\3\2\uffff\1\3\2\uffff\1\3\7\uffff\6\3\2\uffff\12\3\1\uffff\1\3\2\uffff\12\3\1\uffff\2\3\1\2\1\uffff\1\1\2\uffff\1\3\2\uffff\3\3\14\uffff\4\1\1\uffff\1\3\5\uffff\11\3",
            "",
            "\1\4\5\1\35\uffff\1\1\15\uffff\1\1\3\uffff\1\1\2\uffff\1\1\23\uffff\1\1\5\uffff\1\1",
            "",
            "\1\1\2\uffff\1\1\2\uffff\1\1\7\uffff\6\1\2\uffff\12\1\1\uffff\1\1\1\uffff\1\3\16\1\2\3\1\5\1\uffff\1\1\1\3\4\1\21\uffff\5\1\1\uffff\11\1",
            "\1\6",
            "\1\1\2\uffff\1\1\2\uffff\1\1\7\uffff\6\1\2\uffff\12\1\1\uffff\1\1\1\uffff\1\3\16\1\2\3\1\7\1\uffff\1\1\1\3\4\1\21\uffff\5\1\1\uffff\11\1",
            "\1\10",
            "\1\1\2\uffff\1\1\2\uffff\1\1\7\uffff\6\1\2\uffff\12\1\1\uffff\1\1\1\uffff\1\3\16\1\2\3\1\11\1\uffff\1\1\1\3\4\1\21\uffff\5\1\1\uffff\11\1",
            "\1\12",
            "\1\1\2\uffff\1\1\2\uffff\1\1\7\uffff\6\1\2\uffff\12\1\1\uffff\1\1\1\uffff\1\3\16\1\2\3\1\13\1\uffff\1\1\1\3\4\1\21\uffff\5\1\1\uffff\11\1",
            "\1\14",
            "\1\1\2\uffff\1\1\2\uffff\1\1\7\uffff\6\1\2\uffff\12\1\1\uffff\1\1\1\uffff\1\3\16\1\2\3\1\15\1\uffff\1\1\1\3\4\1\21\uffff\5\1\1\uffff\11\1",
            "\1\uffff"
    };
    static final short[] dfa_80 = DFA.unpackEncodedString(dfa_80s);
    static final char[] dfa_81 = DFA.unpackEncodedStringToUnsignedChars(dfa_81s);
    static final char[] dfa_82 = DFA.unpackEncodedStringToUnsignedChars(dfa_82s);
    static final short[] dfa_83 = DFA.unpackEncodedString(dfa_83s);
    static final short[] dfa_84 = DFA.unpackEncodedString(dfa_84s);
    static final short[][] dfa_85 = unpackEncodedStringArray(dfa_85s);

    class DFA122 extends DFA {

        public DFA122(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 122;
            this.eot = dfa_27;
            this.eof = dfa_80;
            this.min = dfa_81;
            this.max = dfa_82;
            this.accept = dfa_83;
            this.special = dfa_84;
            this.transition = dfa_85;
        }
        public String getDescription() {
            return "4300:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA122_13 = input.LA(1);

                         
                        int index122_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_InternalSct3()) ) {s = 1;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index122_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 122, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_86s = "\15\uffff";
    static final String dfa_87s = "\1\4\4\uffff\7\0\1\uffff";
    static final String dfa_88s = "\1\126\4\uffff\7\0\1\uffff";
    static final String dfa_89s = "\1\uffff\1\1\12\uffff\1\2";
    static final String dfa_90s = "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] dfa_91s = {
            "\1\11\2\1\1\13\1\1\1\6\35\uffff\1\5\15\uffff\1\12\3\uffff\1\14\2\uffff\1\1\23\uffff\1\7\5\uffff\1\10",
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

    static final short[] dfa_86 = DFA.unpackEncodedString(dfa_86s);
    static final char[] dfa_87 = DFA.unpackEncodedStringToUnsignedChars(dfa_87s);
    static final char[] dfa_88 = DFA.unpackEncodedStringToUnsignedChars(dfa_88s);
    static final short[] dfa_89 = DFA.unpackEncodedString(dfa_89s);
    static final short[] dfa_90 = DFA.unpackEncodedString(dfa_90s);
    static final short[][] dfa_91 = unpackEncodedStringArray(dfa_91s);

    class DFA123 extends DFA {

        public DFA123(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 123;
            this.eot = dfa_86;
            this.eof = dfa_86;
            this.min = dfa_87;
            this.max = dfa_88;
            this.accept = dfa_89;
            this.special = dfa_90;
            this.transition = dfa_91;
        }
        public String getDescription() {
            return "4366:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA123_5 = input.LA(1);

                         
                        int index123_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalSct3()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index123_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA123_6 = input.LA(1);

                         
                        int index123_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalSct3()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index123_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA123_7 = input.LA(1);

                         
                        int index123_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalSct3()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index123_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA123_8 = input.LA(1);

                         
                        int index123_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalSct3()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index123_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA123_9 = input.LA(1);

                         
                        int index123_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalSct3()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index123_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA123_10 = input.LA(1);

                         
                        int index123_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalSct3()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index123_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA123_11 = input.LA(1);

                         
                        int index123_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalSct3()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index123_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 123, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_92s = "\14\uffff";
    static final String dfa_93s = "\1\4\3\uffff\1\0\7\uffff";
    static final String dfa_94s = "\1\126\3\uffff\1\0\7\uffff";
    static final String dfa_95s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\5\uffff\1\4";
    static final String dfa_96s = "\4\uffff\1\0\7\uffff}>";
    static final String[] dfa_97s = {
            "\1\5\1\3\1\1\1\5\1\2\1\5\35\uffff\1\4\15\uffff\1\5\32\uffff\1\5\5\uffff\1\5",
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

    static final short[] dfa_92 = DFA.unpackEncodedString(dfa_92s);
    static final char[] dfa_93 = DFA.unpackEncodedStringToUnsignedChars(dfa_93s);
    static final char[] dfa_94 = DFA.unpackEncodedStringToUnsignedChars(dfa_94s);
    static final short[] dfa_95 = DFA.unpackEncodedString(dfa_95s);
    static final short[] dfa_96 = DFA.unpackEncodedString(dfa_96s);
    static final short[][] dfa_97 = unpackEncodedStringArray(dfa_97s);

    class DFA136 extends DFA {

        public DFA136(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 136;
            this.eot = dfa_92;
            this.eof = dfa_92;
            this.min = dfa_93;
            this.max = dfa_94;
            this.accept = dfa_95;
            this.special = dfa_96;
            this.transition = dfa_97;
        }
        public String getDescription() {
            return "4993:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA136_4 = input.LA(1);

                         
                        int index136_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred154_InternalSct3()) ) {s = 11;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index136_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 136, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_98s = "\3\uffff\1\11\3\uffff\1\6\2\uffff\2\11";
    static final String dfa_99s = "\1\12\1\uffff\3\4\1\6\1\uffff\1\4\2\uffff\2\4";
    static final String dfa_100s = "\1\72\1\uffff\1\4\1\137\1\4\1\6\1\uffff\1\137\2\uffff\2\137";
    static final String dfa_101s = "\1\uffff\1\1\4\uffff\1\2\1\uffff\1\3\1\4\2\uffff";
    static final String dfa_102s = "\14\uffff}>";
    static final String[] dfa_103s = {
            "\1\1\57\uffff\1\2",
            "",
            "\1\3",
            "\1\7\2\6\1\11\2\6\1\11\5\uffff\1\11\2\uffff\4\11\14\uffff\1\11\1\uffff\1\11\4\uffff\6\11\1\uffff\1\11\1\10\2\uffff\1\11\2\uffff\1\4\1\uffff\1\11\1\5\1\6\34\uffff\7\11",
            "\1\12",
            "\1\13",
            "",
            "\1\6\2\uffff\1\6\2\uffff\1\6\5\uffff\1\6\2\uffff\4\6\14\uffff\1\6\1\uffff\1\6\1\11\3\uffff\10\6\1\11\2\uffff\1\6\2\uffff\1\6\1\uffff\2\6\1\uffff\1\11\5\uffff\11\11\15\uffff\7\6",
            "",
            "",
            "\1\7\2\6\1\11\2\6\1\11\5\uffff\1\11\2\uffff\4\11\14\uffff\1\11\1\uffff\1\11\4\uffff\6\11\1\uffff\1\11\1\10\2\uffff\1\11\2\uffff\1\4\1\uffff\1\11\1\5\1\6\34\uffff\7\11",
            "\1\7\2\6\1\11\2\6\1\11\5\uffff\1\11\2\uffff\4\11\14\uffff\1\11\1\uffff\1\11\4\uffff\6\11\1\uffff\1\11\1\10\2\uffff\1\11\4\uffff\1\11\1\uffff\1\6\34\uffff\7\11"
    };
    static final short[] dfa_98 = DFA.unpackEncodedString(dfa_98s);
    static final char[] dfa_99 = DFA.unpackEncodedStringToUnsignedChars(dfa_99s);
    static final char[] dfa_100 = DFA.unpackEncodedStringToUnsignedChars(dfa_100s);
    static final short[] dfa_101 = DFA.unpackEncodedString(dfa_101s);
    static final short[] dfa_102 = DFA.unpackEncodedString(dfa_102s);
    static final short[][] dfa_103 = unpackEncodedStringArray(dfa_103s);

    class DFA145 extends DFA {

        public DFA145(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 145;
            this.eot = dfa_92;
            this.eof = dfa_98;
            this.min = dfa_99;
            this.max = dfa_100;
            this.accept = dfa_101;
            this.special = dfa_102;
            this.transition = dfa_103;
        }
        public String getDescription() {
            return "5642:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
    }
    static final String dfa_104s = "\13\uffff";
    static final String dfa_105s = "\3\uffff\1\7\5\uffff\2\7";
    static final String dfa_106s = "\1\12\1\uffff\3\4\1\6\3\uffff\2\4";
    static final String dfa_107s = "\1\72\1\uffff\1\4\1\77\1\4\1\6\3\uffff\2\77";
    static final String dfa_108s = "\1\uffff\1\1\4\uffff\1\3\1\4\1\2\2\uffff";
    static final String dfa_109s = "\13\uffff}>";
    static final String[] dfa_110s = {
            "\1\1\57\uffff\1\2",
            "",
            "\1\3",
            "\2\10\3\uffff\1\10\1\7\47\uffff\1\6\5\uffff\1\4\1\uffff\1\7\1\5\1\uffff\3\7",
            "\1\11",
            "\1\12",
            "",
            "",
            "",
            "\2\10\3\uffff\1\10\1\7\47\uffff\1\6\5\uffff\1\4\1\uffff\1\7\1\5\1\uffff\3\7",
            "\2\10\3\uffff\1\10\1\7\47\uffff\1\6\7\uffff\1\7\2\uffff\3\7"
    };

    static final short[] dfa_104 = DFA.unpackEncodedString(dfa_104s);
    static final short[] dfa_105 = DFA.unpackEncodedString(dfa_105s);
    static final char[] dfa_106 = DFA.unpackEncodedStringToUnsignedChars(dfa_106s);
    static final char[] dfa_107 = DFA.unpackEncodedStringToUnsignedChars(dfa_107s);
    static final short[] dfa_108 = DFA.unpackEncodedString(dfa_108s);
    static final short[] dfa_109 = DFA.unpackEncodedString(dfa_109s);
    static final short[][] dfa_110 = unpackEncodedStringArray(dfa_110s);

    class DFA146 extends DFA {

        public DFA146(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 146;
            this.eot = dfa_104;
            this.eof = dfa_105;
            this.min = dfa_106;
            this.max = dfa_107;
            this.accept = dfa_108;
            this.special = dfa_109;
            this.transition = dfa_110;
        }
        public String getDescription() {
            return "5716:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_RestrictedKeyStringValueAnnotation_1= ruleRestrictedKeyStringValueAnnotation | this_RestrictedTypedKeyStringValueAnnotation_2= ruleRestrictedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
    }
    static final String dfa_111s = "\3\uffff\1\10\5\uffff\2\10";
    static final String dfa_112s = "\1\72\1\uffff\1\4\1\73\1\4\1\6\3\uffff\1\73\1\72";
    static final String dfa_113s = "\1\uffff\1\1\4\uffff\1\3\1\2\1\4\2\uffff";
    static final String[] dfa_114s = {
            "\1\1\57\uffff\1\2",
            "",
            "\1\3",
            "\1\10\1\7\4\uffff\1\10\47\uffff\1\6\5\uffff\1\4\1\uffff\1\10\1\5",
            "\1\11",
            "\1\12",
            "",
            "",
            "",
            "\1\10\1\7\4\uffff\1\10\47\uffff\1\6\5\uffff\1\4\1\uffff\1\10\1\5",
            "\1\10\1\7\4\uffff\1\10\47\uffff\1\6\7\uffff\1\10"
    };
    static final short[] dfa_111 = DFA.unpackEncodedString(dfa_111s);
    static final char[] dfa_112 = DFA.unpackEncodedStringToUnsignedChars(dfa_112s);
    static final short[] dfa_113 = DFA.unpackEncodedString(dfa_113s);
    static final short[][] dfa_114 = unpackEncodedStringArray(dfa_114s);

    class DFA147 extends DFA {

        public DFA147(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 147;
            this.eot = dfa_104;
            this.eof = dfa_111;
            this.min = dfa_106;
            this.max = dfa_112;
            this.accept = dfa_113;
            this.special = dfa_109;
            this.transition = dfa_114;
        }
        public String getDescription() {
            return "5788:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
    }

    class DFA173 extends DFA {

        public DFA173(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 173;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "651:1: ( (lv_delay_7_0= RULE_INT ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA173_1 = input.LA(1);

                         
                        int index173_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalSct3()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index173_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 173, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0400000000010402L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0400000000010400L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020020L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0402F82FF0FC0410L,0x00000000FE000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0400002FF0FC0410L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0400002800040400L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0400000000780400L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000700000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0xE400000000020422L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xE400000000020402L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xE400000000000402L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xE400000000000400L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000007800002L,0x0000000000000007L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000007000002L,0x0000000000000007L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000006000002L,0x0000000000000007L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000006000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x12200080000003F0L,0x0000000000410000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0420000000000490L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0400000000780402L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0400000800000400L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000030L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001000000020L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0402F80000780400L,0x00000000FE000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0400002000000400L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0402F80000000410L,0x00000000FE000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0422FE0000000492L,0x00000000FE000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0420060000000492L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0422FE0000040490L,0x00000000FE000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0420060000040490L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000020000040000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0400040000000400L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0400F80000000400L,0x00000000FE000000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000F00000000000L,0x00000000FE000000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000E00000000000L,0x00000000FE000000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000C00000000000L,0x00000000FE000000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000800000000000L,0x00000000FE000000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0400000000000410L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0001000008000000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0402000000000400L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0014004000000002L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0002000000000000L,0x00000007800E0000L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0004004000000000L,0x00000000000007F8L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x2004000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0400000000000480L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0420000000000400L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x00C0008000000000L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x12220080000003F0L,0x0000000000410000L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0001010000000000L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0002000000000002L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x00A0000000000002L,0x000000000000F000L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x10200080000003F0L,0x0000000000410000L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000010L,0x0000000000410000L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0104000000000002L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x1000000000000370L});
        public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000230L});
        public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0900000000000002L});
        public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000100L});
    }


}